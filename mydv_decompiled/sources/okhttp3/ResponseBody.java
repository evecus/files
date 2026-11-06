package okhttp3;

import defpackage.cz;
import defpackage.er0;
import defpackage.h00;
import defpackage.hn3;
import defpackage.mz;
import defpackage.r7;
import defpackage.su0;
import defpackage.sv2;
import defpackage.tm1;
import defpackage.uj3;
import defpackage.zl1;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion;
    public static final ResponseBody EMPTY;
    private Reader reader;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final mz source;

        public BomAwareReader(mz mzVar, Charset charset) {
            mzVar.getClass();
            charset.getClass();
            this.source = mzVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            cArr.getClass();
            if (this.closed) {
                zl1.g("Stream closed");
                return 0;
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.Z(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        EMPTY = Companion.create$default(companion, h00.L, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(contentType());
    }

    private final <T> T consumeSource(ResponseBody responseBody, tm1 tm1Var, tm1 tm1Var2) {
        Throwable th;
        T t;
        long contentLength = responseBody.contentLength();
        if (contentLength > 2147483647L) {
            zl1.g(r7.A("Cannot buffer entire body for content length: ", contentLength));
            return null;
        }
        mz source = responseBody.source();
        try {
            t = (T) tm1Var.invoke(source);
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
            }
            th = th3;
            t = null;
        }
        if (th != null) {
            throw th;
        }
        int intValue = ((Number) tm1Var2.invoke(t)).intValue();
        if (contentLength == -1 || contentLength == intValue) {
            return t;
        }
        hn3.f(intValue, contentLength);
        return null;
    }

    public static final ResponseBody create(mz mzVar, MediaType mediaType, long j) {
        return Companion.create(mzVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().Z();
    }

    public final h00 byteString() {
        Throwable th;
        h00 h00Var;
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            zl1.g(r7.A("Cannot buffer entire body for content length: ", contentLength));
            return null;
        }
        mz source = source();
        try {
            h00Var = source.I();
            try {
                source.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
            }
            th = th3;
            h00Var = null;
        }
        if (th != null) {
            throw th;
        }
        int d = h00Var.d();
        if (contentLength == -1 || contentLength == d) {
            return h00Var;
        }
        hn3.f(d, contentLength);
        return null;
    }

    public final byte[] bytes() {
        Throwable th;
        byte[] bArr;
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            zl1.g(r7.A("Cannot buffer entire body for content length: ", contentLength));
            return null;
        }
        mz source = source();
        try {
            bArr = source.m();
            try {
                source.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
            }
            th = th3;
            bArr = null;
        }
        if (th != null) {
            throw th;
        }
        int length = bArr.length;
        if (contentLength == -1 || contentLength == length) {
            return bArr;
        }
        hn3.f(length, contentLength);
        return null;
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract mz source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final String string() {
        mz source = source();
        String th = null;
        try {
            String D = source.D(_UtilJvmKt.readBomAsCharset(source, charset()));
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = D;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    sv2.i(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, mz mzVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(mzVar, mediaType, j);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            uj3 chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.I;
            MediaType mediaType2 = (MediaType) chooseCharset.J;
            cz czVar = new cz();
            charset.getClass();
            czVar.i0(str, 0, str.length(), charset);
            return create(czVar, mediaType2, czVar.J);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, h00 h00Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(h00Var, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            cz czVar = new cz();
            czVar.m196write(bArr, 0, bArr.length);
            return create(czVar, mediaType, bArr.length);
        }

        public final ResponseBody create(h00 h00Var, MediaType mediaType) {
            h00Var.getClass();
            cz czVar = new cz();
            czVar.c0(h00Var);
            return create(czVar, mediaType, h00Var.d());
        }

        public final ResponseBody create(final mz mzVar, final MediaType mediaType, final long j) {
            mzVar.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public mz source() {
                    return mzVar;
                }
            };
        }

        @su0
        public final ResponseBody create(MediaType mediaType, String str) {
            str.getClass();
            return create(str, mediaType);
        }

        @su0
        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create(bArr, mediaType);
        }

        @su0
        public final ResponseBody create(MediaType mediaType, h00 h00Var) {
            h00Var.getClass();
            return create(h00Var, mediaType);
        }

        @su0
        public final ResponseBody create(MediaType mediaType, long j, mz mzVar) {
            mzVar.getClass();
            return create(mzVar, mediaType, j);
        }
    }

    public static final ResponseBody create(h00 h00Var, MediaType mediaType) {
        return Companion.create(h00Var, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @su0
    public static final ResponseBody create(MediaType mediaType, long j, mz mzVar) {
        return Companion.create(mediaType, j, mzVar);
    }

    @su0
    public static final ResponseBody create(MediaType mediaType, h00 h00Var) {
        return Companion.create(mediaType, h00Var);
    }

    @su0
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @su0
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
