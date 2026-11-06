package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a55 {
    public da2 a;
    public iu0 b;
    public kj1 c;
    public m65 d;
    public Object e;
    public final jk3 f = ad4.w(Boolean.TRUE);
    public long g = 0;

    public a55(da2 da2Var, iu0 iu0Var, kj1 kj1Var, m65 m65Var, Object obj) {
        this.a = da2Var;
        this.b = iu0Var;
        this.c = kj1Var;
        this.d = m65Var;
        this.e = obj;
    }

    public static void a(a55 a55Var, da2 da2Var, iu0 iu0Var, m65 m65Var, int i) {
        if ((i & 1) != 0) {
            da2Var = a55Var.a;
        }
        if ((i & 2) != 0) {
            iu0Var = a55Var.b;
        }
        kj1 kj1Var = a55Var.c;
        if ((i & 8) != 0) {
            m65Var = a55Var.d;
        }
        Object obj = a55Var.e;
        da2 da2Var2 = a55Var.a;
        jk3 jk3Var = a55Var.f;
        if (da2Var == da2Var2 && j42.c(iu0Var, a55Var.b) && j42.c(kj1Var, a55Var.c) && j42.c(m65Var, a55Var.d)) {
            if (j42.c(obj, a55Var.e)) {
                return;
            }
            a55Var.e = obj;
            jk3Var.setValue(Boolean.TRUE);
            return;
        }
        a55Var.a = da2Var;
        a55Var.b = iu0Var;
        a55Var.c = kj1Var;
        a55Var.d = m65Var;
        jk3Var.setValue(Boolean.TRUE);
    }
}
