package defpackage;

import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fs3 extends bp1 {
    private static final fs3 DEFAULT_INSTANCE;
    private static volatile nk3 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private gv2 preferences_ = gv2.J;

    static {
        fs3 fs3Var = new fs3();
        DEFAULT_INSTANCE = fs3Var;
        bp1.h(fs3.class, fs3Var);
    }

    public static ds3 k() {
        return (ds3) ((xo1) DEFAULT_INSTANCE.d(5));
    }

    public static fs3 l(FileInputStream fileInputStream) {
        fs3 fs3Var = DEFAULT_INSTANCE;
        d70 d70Var = new d70(fileInputStream, (byte) 1);
        mc1 a = mc1.a();
        bp1 bp1Var = (bp1) fs3Var.d(4);
        try {
            tx3 tx3Var = tx3.c;
            tx3Var.getClass();
            ra4 a2 = tx3Var.a(bp1Var.getClass());
            h60 h60Var = (h60) d70Var.k;
            if (h60Var == null) {
                h60Var = new h60(d70Var, (byte) 0);
            }
            a2.g(bp1Var, h60Var, a);
            a2.a(bp1Var);
            if (bp1Var.g()) {
                return (fs3) bp1Var;
            }
            throw new z42(new vb0((byte) 5).getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof z42) {
                throw ((z42) e.getCause());
            }
            throw new z42(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof z42) {
                throw ((z42) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // defpackage.bp1
    public final Object d(int i) {
        nk3 nk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new j04(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", es3.a});
            case 3:
                return new fs3();
            case 4:
                return new ds3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nk3 nk3Var2 = PARSER;
                if (nk3Var2 != null) {
                    return nk3Var2;
                }
                synchronized (fs3.class) {
                    try {
                        nk3Var = PARSER;
                        if (nk3Var == null) {
                            nk3Var = new zo1();
                            PARSER = nk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nk3Var;
            default:
                e1.a();
                return null;
        }
    }

    public final Map i() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    public final gv2 j() {
        gv2 gv2Var = this.preferences_;
        if (gv2Var.I) {
            return gv2Var;
        }
        gv2 b = gv2Var.b();
        this.preferences_ = b;
        return b;
    }
}
