package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import defpackage.s83;
import defpackage.sp0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultDataSource implements DataSource {
    private static final String SCHEME_ANDROID_RESOURCE = "android.resource";
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_DATA = "data";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String SCHEME_UDP = "udp";
    private static final String TAG = "DefaultDataSource";
    private DataSource assetDataSource;
    private final DataSource baseDataSource;
    private DataSource contentDataSource;
    private final Context context;
    private DataSource dataSchemeDataSource;
    private DataSource dataSource;
    private DataSource fileDataSource;
    private DataSource rawResourceDataSource;
    private DataSource rtmpDataSource;
    private final List<TransferListener> transferListeners;
    private DataSource udpDataSource;

    public DefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        this(context, new DefaultHttpDataSource.Factory().setUserAgent(str).setConnectTimeoutMs(i).setReadTimeoutMs(i2).setAllowCrossProtocolRedirects(z).createDataSource());
    }

    private void addListenersToDataSource(DataSource dataSource) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            dataSource.addTransferListener(this.transferListeners.get(i));
        }
    }

    private DataSource getAssetDataSource() {
        if (this.assetDataSource == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.context);
            this.assetDataSource = assetDataSource;
            addListenersToDataSource(assetDataSource);
        }
        return this.assetDataSource;
    }

    private DataSource getContentDataSource() {
        if (this.contentDataSource == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.context);
            this.contentDataSource = contentDataSource;
            addListenersToDataSource(contentDataSource);
        }
        return this.contentDataSource;
    }

    private DataSource getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
            this.dataSchemeDataSource = dataSchemeDataSource;
            addListenersToDataSource(dataSchemeDataSource);
        }
        return this.dataSchemeDataSource;
    }

    private DataSource getFileDataSource() {
        if (this.fileDataSource == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.fileDataSource = fileDataSource;
            addListenersToDataSource(fileDataSource);
        }
        return this.fileDataSource;
    }

    private DataSource getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource;
            addListenersToDataSource(rawResourceDataSource);
        }
        return this.rawResourceDataSource;
    }

    private DataSource getRtmpDataSource() {
        DataSource dataSource = this.rtmpDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        try {
            DataSource dataSource2 = (DataSource) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
            this.rtmpDataSource = dataSource2;
            addListenersToDataSource(dataSource2);
        } catch (ClassNotFoundException unused) {
            Log.w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
        } catch (Exception e) {
            s83.p("Error instantiating RTMP extension", e);
            return null;
        }
        DataSource dataSource3 = this.rtmpDataSource;
        if (dataSource3 != null) {
            return dataSource3;
        }
        DataSource dataSource4 = this.baseDataSource;
        this.rtmpDataSource = dataSource4;
        return dataSource4;
    }

    private DataSource getUdpDataSource() {
        if (this.udpDataSource == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.udpDataSource = udpDataSource;
            addListenersToDataSource(udpDataSource);
        }
        return this.udpDataSource;
    }

    private void maybeAddListenerToDataSource(DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.baseDataSource.addTransferListener(transferListener);
        this.transferListeners.add(transferListener);
        maybeAddListenerToDataSource(this.fileDataSource, transferListener);
        maybeAddListenerToDataSource(this.assetDataSource, transferListener);
        maybeAddListenerToDataSource(this.contentDataSource, transferListener);
        maybeAddListenerToDataSource(this.rtmpDataSource, transferListener);
        maybeAddListenerToDataSource(this.udpDataSource, transferListener);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, transferListener);
        maybeAddListenerToDataSource(this.rawResourceDataSource, transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        DataSource dataSource = this.dataSource;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        DataSource rawResourceDataSource;
        sp0.z(this.dataSource == null);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            String path = dataSpec.uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                rawResourceDataSource = getFileDataSource();
                this.dataSource = rawResourceDataSource;
            } else {
                rawResourceDataSource = getAssetDataSource();
                this.dataSource = rawResourceDataSource;
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            rawResourceDataSource = getAssetDataSource();
            this.dataSource = rawResourceDataSource;
        } else if (SCHEME_CONTENT.equals(scheme)) {
            rawResourceDataSource = getContentDataSource();
            this.dataSource = rawResourceDataSource;
        } else if (SCHEME_RTMP.equals(scheme)) {
            rawResourceDataSource = getRtmpDataSource();
            this.dataSource = rawResourceDataSource;
        } else if (SCHEME_UDP.equals(scheme)) {
            rawResourceDataSource = getUdpDataSource();
            this.dataSource = rawResourceDataSource;
        } else if ("data".equals(scheme)) {
            rawResourceDataSource = getDataSchemeDataSource();
            this.dataSource = rawResourceDataSource;
        } else if ("rawresource".equals(scheme) || SCHEME_ANDROID_RESOURCE.equals(scheme)) {
            rawResourceDataSource = getRawResourceDataSource();
            this.dataSource = rawResourceDataSource;
        } else {
            rawResourceDataSource = this.baseDataSource;
            this.dataSource = rawResourceDataSource;
        }
        return rawResourceDataSource.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        DataSource dataSource = this.dataSource;
        dataSource.getClass();
        return dataSource.read(bArr, i, i2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements DataSource.Factory {
        private final DataSource.Factory baseDataSourceFactory;
        private final Context context;
        private TransferListener transferListener;

        public Factory(Context context, DataSource.Factory factory) {
            this.context = context.getApplicationContext();
            factory.getClass();
            this.baseDataSourceFactory = factory;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public DefaultDataSource createDataSource() {
            DefaultDataSource defaultDataSource = new DefaultDataSource(this.context, this.baseDataSourceFactory.createDataSource());
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultDataSource.addTransferListener(transferListener);
            }
            return defaultDataSource;
        }

        public Factory setTransferListener(TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory(Context context) {
            this(context, new DefaultHttpDataSource.Factory());
        }
    }

    public DefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public DefaultDataSource(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.context = context.getApplicationContext();
        dataSource.getClass();
        this.baseDataSource = dataSource;
        this.transferListeners = new ArrayList();
    }
}
