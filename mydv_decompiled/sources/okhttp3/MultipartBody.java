package okhttp3;

import coil3.network.internal.UtilsKt;
import defpackage.cz;
import defpackage.eq4;
import defpackage.er0;
import defpackage.gl1;
import defpackage.h00;
import defpackage.i42;
import defpackage.j42;
import defpackage.jp;
import defpackage.lz;
import defpackage.q04;
import defpackage.s83;
import defpackage.su0;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final h00 boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(h00 h00Var, MediaType mediaType, List<Part> list) {
        h00Var.getClass();
        mediaType.getClass();
        list.getClass();
        this.boundaryByteString = h00Var;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(lz lzVar, boolean z) {
        cz czVar;
        if (z) {
            lzVar = new cz();
            czVar = lzVar;
        } else {
            czVar = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            lzVar.getClass();
            lzVar.write(DASHDASH);
            lzVar.S(this.boundaryByteString);
            lzVar.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lzVar.B(headers.name(i2)).write(COLONSPACE).B(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                lzVar.B("Content-Type: ").B(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength == -1 && z) {
                czVar.getClass();
                czVar.e();
                return -1L;
            }
            byte[] bArr = CRLF;
            lzVar.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                q04 q04Var = new q04(new NoCloseSink(lzVar));
                try {
                    body.writeTo(q04Var);
                    q04Var.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        i42.h0(q04Var, th);
                        throw th2;
                    }
                }
            }
            lzVar.write(bArr);
        }
        lzVar.getClass();
        byte[] bArr2 = DASHDASH;
        lzVar.write(bArr2);
        lzVar.S(this.boundaryByteString);
        lzVar.write(bArr2);
        lzVar.write(CRLF);
        if (!z) {
            return j;
        }
        czVar.getClass();
        long j2 = j + czVar.J;
        czVar.e();
        return j2;
    }

    @su0
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m289deprecated_boundary() {
        return boundary();
    }

    @su0
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m290deprecated_parts() {
        return this.parts;
    }

    @su0
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m291deprecated_size() {
        return size();
    }

    @su0
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m292deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.s();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        List<Part> list = this.parts;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).body().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(lz lzVar) {
        lzVar.getClass();
        writeOrCountBytes(lzVar, false);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        @su0
        /* renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m293deprecated_body() {
            return this.body;
        }

        @su0
        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m294deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                requestBody.getClass();
                er0 er0Var = null;
                if ((headers != null ? headers.get(UtilsKt.CONTENT_TYPE) : null) != null) {
                    s83.t("Unexpected header: Content-Type");
                    return null;
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, requestBody, er0Var);
                }
                s83.t("Unexpected header: Content-Length");
                return null;
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                str.getClass();
                requestBody.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
            }

            private Companion() {
            }

            public final Part create(RequestBody requestBody) {
                requestBody.getClass();
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                str.getClass();
                str2.getClass();
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, er0 er0Var) {
            this(headers, requestBody);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            sb.getClass();
            str.getClass();
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final h00 boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder(String str) {
            str.getClass();
            h00 h00Var = h00.L;
            this.boundary = jp.h(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2) {
            str.getClass();
            str2.getClass();
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            requestBody.getClass();
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, _UtilJvmKt.toImmutableList(this.parts));
            }
            zy.i("Multipart body must have at least one part.");
            return null;
        }

        public final Builder setType(MediaType mediaType) {
            mediaType.getClass();
            if (j42.c(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            s83.s(mediaType, "multipart != ");
            return null;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            requestBody.getClass();
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            part.getClass();
            this.parts.add(part);
            return this;
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            str.getClass();
            requestBody.getClass();
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, defpackage.er0 r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto Lf
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                r1.getClass()
            Lf:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, er0):void");
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class NoCloseSink extends gl1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoCloseSink(eq4 eq4Var) {
            super(eq4Var);
            eq4Var.getClass();
        }

        @Override // defpackage.gl1, defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
