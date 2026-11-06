package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zp4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public zp4(boolean z, th4 th4Var, h60 h60Var) {
        this.a = (byte) 0;
        this.b = z;
        this.c = th4Var;
        this.d = h60Var;
    }

    public yl0 a() {
        h60 h60Var = (h60) this.d;
        int i = h60Var.b;
        int i2 = h60Var.c;
        return i < i2 ? yl0.J : i > i2 ? yl0.I : yl0.K;
    }

    public void b() {
        if (this.b) {
            ((u45) this.d).n((d65) this.c);
        }
    }

    public long c(d55 d55Var, long j, boolean z, hn3 hn3Var) {
        u45 u45Var = (u45) this.d;
        long v = u45Var.v(d55Var, j, z, false, hn3Var, false, null);
        if (!d65.a(v, (d65) this.c)) {
            this.b = false;
        }
        u45Var.r(d65.c(v) ? ks1.K : ks1.J);
        return v;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + a() + ", info=\n\t" + ((h60) this.d) + ")";
            default:
                return super.toString();
        }
    }

    public zp4(u45 u45Var) {
        this.a = (byte) 1;
        this.d = u45Var;
        this.b = true;
    }
}
