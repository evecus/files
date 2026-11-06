package okhttp3;

import defpackage.er0;
import defpackage.s83;
import defpackage.sp0;
import defpackage.su0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TlsVersion {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ TlsVersion[] $VALUES;
    public static final Companion Companion;
    private final String javaName;
    public static final TlsVersion TLS_1_3 = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
    public static final TlsVersion TLS_1_2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
    public static final TlsVersion TLS_1_1 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
    public static final TlsVersion TLS_1_0 = new TlsVersion("TLS_1_0", 3, "TLSv1");
    public static final TlsVersion SSL_3_0 = new TlsVersion("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ TlsVersion[] $values() {
        return new TlsVersion[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    static {
        TlsVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
        Companion = new Companion(null);
    }

    private TlsVersion(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static final TlsVersion forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) $VALUES.clone();
    }

    @su0
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m350deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TlsVersion forJavaName(String str) {
            str.getClass();
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            s83.t("Unexpected TLS version: ".concat(str));
            return null;
        }

        private Companion() {
        }
    }
}
