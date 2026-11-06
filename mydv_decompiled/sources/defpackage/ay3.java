package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ay3 {
    public final xx3 a;
    public final boolean b;
    public final q8 c;
    public final tm1 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public ay3(xx3 xx3Var, Object obj, boolean z, q8 q8Var, tm1 tm1Var, boolean z2) {
        this.a = xx3Var;
        this.b = z;
        this.c = q8Var;
        this.d = tm1Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ke0.b("Unexpected form of a provided value");
        zy.n();
        return null;
    }
}
