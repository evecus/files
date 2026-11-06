package androidx.media3.datasource.okhttp;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpUtil;
import androidx.media3.datasource.TransferListener;
import defpackage.al4;
import defpackage.b00;
import defpackage.mr3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class OkHttpDataSource extends BaseDataSource implements HttpDataSource {
    private long bytesRead;
    private long bytesToRead;
    private final CacheControl cacheControl;
    private final Call.Factory callFactory;
    private boolean connectionEstablished;
    private final mr3 contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private final HttpDataSource.RequestProperties requestProperties;
    private Response response;
    private InputStream responseByteStream;
    private final String userAgent;

    static {
        MediaLibraryInfo.registerModule("media3.datasource.okhttp");
    }

    private OkHttpDataSource(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.RequestProperties requestProperties, mr3 mr3Var) {
        super(true);
        factory.getClass();
        this.callFactory = factory;
        this.userAgent = str;
        this.cacheControl = cacheControl;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = mr3Var;
        this.requestProperties = new HttpDataSource.RequestProperties();
    }

    private void closeConnectionQuietly() {
        Response response = this.response;
        if (response != null) {
            ResponseBody body = response.body();
            body.getClass();
            body.close();
        }
        this.responseByteStream = null;
    }

    private Response executeCall(Call call) {
        final al4 al4Var = new al4();
        call.enqueue(new Callback() { // from class: androidx.media3.datasource.okhttp.OkHttpDataSource.1
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException iOException) {
                al4Var.k(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) {
                al4Var.l(response);
            }
        });
        try {
            return (Response) al4Var.get();
        } catch (InterruptedException unused) {
            call.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    private Request makeRequest(DataSpec dataSpec) {
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        HttpUrl parse = HttpUrl.parse(dataSpec.uri.toString());
        if (parse == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", dataSpec, 1004, 1);
        }
        Request.Builder url = new Request.Builder().url(parse);
        CacheControl cacheControl = this.cacheControl;
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : hashMap.entrySet()) {
            url.header((String) entry.getKey(), (String) entry.getValue());
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j, j2);
        if (buildRangeRequestHeader != null) {
            url.addHeader("Range", buildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            url.addHeader("User-Agent", str);
        }
        if (!dataSpec.isFlagSet(1)) {
            url.addHeader("Accept-Encoding", "identity");
        }
        byte[] bArr = dataSpec.httpBody;
        url.method(dataSpec.getHttpMethodString(), bArr != null ? RequestBody.create(bArr) : dataSpec.httpMethod == 2 ? RequestBody.create(Util.EMPTY_BYTE_ARRAY) : null);
        return url.build();
    }

    private int readInternal(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) Util.castNonNull(this.responseByteStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private void skipFully(long j, DataSpec dataSpec) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int read = ((InputStream) Util.castNonNull(this.responseByteStream)).read(bArr, 0, (int) Math.min(j, 4096L));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
                }
                j -= read;
                bytesTransferred(read);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource.HttpDataSourceException)) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2000, 1);
                }
                throw ((HttpDataSource.HttpDataSourceException) e);
            }
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(String str) {
        str.getClass();
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.connectionEstablished) {
            this.connectionEstablished = false;
            transferEnded();
            closeConnectionQuietly();
        }
        this.response = null;
        this.dataSpec = null;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        Response response = this.response;
        if (response == null) {
            return -1;
        }
        return response.code();
    }

    @Override // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        Response response = this.response;
        return response == null ? Collections.EMPTY_MAP : response.headers().toMultimap();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        Response response = this.response;
        if (response != null) {
            return Uri.parse(response.request().url().toString());
        }
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        byte[] bArr;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            Response executeCall = executeCall(this.callFactory.newCall(makeRequest(dataSpec)));
            this.response = executeCall;
            ResponseBody body = executeCall.body();
            body.getClass();
            this.responseByteStream = body.byteStream();
            int code = executeCall.code();
            if (!executeCall.isSuccessful()) {
                if (code == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(executeCall.headers().get("Content-Range"))) {
                        this.connectionEstablished = true;
                        transferStarted(dataSpec);
                        long j2 = dataSpec.length;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                try {
                    InputStream inputStream = this.responseByteStream;
                    inputStream.getClass();
                    bArr = b00.b(inputStream);
                } catch (IOException unused) {
                    bArr = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                Map<String, List<String>> multimap = executeCall.headers().toMultimap();
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidResponseCodeException(code, executeCall.message(), code == 416 ? new DataSourceException(2008) : null, multimap, dataSpec, bArr2);
            }
            MediaType contentType = body.contentType();
            String mediaType = contentType != null ? contentType.toString() : "";
            mr3 mr3Var = this.contentTypePredicate;
            if (mr3Var != null && !mr3Var.apply(mediaType)) {
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidContentTypeException(mediaType, dataSpec);
            }
            if (code == 200) {
                long j3 = dataSpec.position;
                if (j3 != 0) {
                    j = j3;
                }
            }
            long j4 = dataSpec.length;
            if (j4 != -1) {
                this.bytesToRead = j4;
            } else {
                long contentLength = HttpUtil.getContentLength(executeCall.header("Content-Length"), executeCall.header("Content-Range"));
                this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
            }
            this.connectionEstablished = true;
            transferStarted(dataSpec);
            try {
                skipFully(j, dataSpec);
                return this.bytesToRead;
            } catch (HttpDataSource.HttpDataSourceException e) {
                closeConnectionQuietly();
                throw e;
            }
        } catch (IOException e2) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e2, dataSpec, 1);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.requestProperties.set(str, str2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements HttpDataSource.Factory {
        private CacheControl cacheControl;
        private final Call.Factory callFactory;
        private mr3 contentTypePredicate;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private TransferListener transferListener;
        private String userAgent;

        public Factory(Call.Factory factory) {
            this.callFactory = factory;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public OkHttpDataSource createDataSource() {
            OkHttpDataSource okHttpDataSource = new OkHttpDataSource(this.callFactory, this.userAgent, this.cacheControl, this.defaultRequestProperties, this.contentTypePredicate);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                okHttpDataSource.addTransferListener(transferListener);
            }
            return okHttpDataSource;
        }

        public Factory setCacheControl(CacheControl cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        public Factory setContentTypePredicate(mr3 mr3Var) {
            this.contentTypePredicate = mr3Var;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public Factory setTransferListener(TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }
    }
}
