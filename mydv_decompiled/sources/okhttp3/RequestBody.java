package okhttp3;

import defpackage.e41;
import defpackage.er0;
import defpackage.ew;
import defpackage.h00;
import defpackage.ke1;
import defpackage.lz;
import defpackage.m12;
import defpackage.ok3;
import defpackage.q04;
import defpackage.sp0;
import defpackage.su0;
import defpackage.u75;
import defpackage.uj3;
import defpackage.ut4;
import defpackage.xs1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion;
    public static final RequestBody EMPTY;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        EMPTY = Companion.create$default(companion, h00.L, (MediaType) null, 1, (Object) null);
    }

    public static final RequestBody create(h00 h00Var, MediaType mediaType) {
        return Companion.create(h00Var, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final h00 sha256() {
        xs1 m0 = e41.m0(new ew());
        q04 q04Var = new q04(m0);
        try {
            writeTo(q04Var);
            q04Var.close();
            return m0.e();
        } finally {
        }
    }

    public abstract void writeTo(lz lzVar);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            str.getClass();
            uj3 chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.I;
            MediaType mediaType2 = (MediaType) chooseCharset.J;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return create(bytes, mediaType2, 0, bytes.length);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, h00 h00Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(h00Var, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, FileDescriptor fileDescriptor, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ok3 ok3Var, ke1 ke1Var, MediaType mediaType, int i, Object obj) {
            if ((i & 2) != 0) {
                mediaType = null;
            }
            return companion.create(ok3Var, ke1Var, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @su0
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            bArr.getClass();
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        @su0
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(final h00 h00Var, final MediaType mediaType) {
            h00Var.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return h00Var.d();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(lz lzVar) {
                    lzVar.getClass();
                    lzVar.S(h00Var);
                }
            };
        }

        public final RequestBody create(final FileDescriptor fileDescriptor, final MediaType mediaType) {
            fileDescriptor.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(lz lzVar) {
                    lzVar.getClass();
                    FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                    try {
                        lzVar.a().q(sp0.e0(fileInputStream));
                        fileInputStream.close();
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i, final int i2) {
            bArr.getClass();
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(lz lzVar) {
                    lzVar.getClass();
                    lzVar.write(bArr, i, i2);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            file.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(lz lzVar) {
                    lzVar.getClass();
                    File file2 = file;
                    file2.getClass();
                    m12 m12Var = new m12(new FileInputStream(file2), u75.NONE);
                    try {
                        lzVar.q(m12Var);
                        m12Var.close();
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final ok3 ok3Var, final ke1 ke1Var, final MediaType mediaType) {
            ok3Var.getClass();
            ke1Var.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    Long l = ke1Var.metadata(ok3Var).d;
                    if (l != null) {
                        return l.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(lz lzVar) {
                    lzVar.getClass();
                    ut4 source = ke1Var.source(ok3Var);
                    try {
                        lzVar.q(source);
                        source.close();
                    } finally {
                    }
                }
            };
        }

        @su0
        public final RequestBody create(MediaType mediaType, String str) {
            str.getClass();
            return create(str, mediaType);
        }

        @su0
        public final RequestBody create(MediaType mediaType, h00 h00Var) {
            h00Var.getClass();
            return create(h00Var, mediaType);
        }

        @su0
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
            bArr.getClass();
            return create(bArr, mediaType, i, i2);
        }

        @su0
        public final RequestBody create(MediaType mediaType, File file) {
            file.getClass();
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(ok3 ok3Var, ke1 ke1Var, MediaType mediaType) {
        return Companion.create(ok3Var, ke1Var, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(FileDescriptor fileDescriptor, MediaType mediaType) {
        return Companion.create(fileDescriptor, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, h00 h00Var) {
        return Companion.create(mediaType, h00Var);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    @su0
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }
}
