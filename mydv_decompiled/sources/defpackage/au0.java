package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class au0 implements g80 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ au0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.g80
    public final long a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bu0 bu0Var = (bu0) obj;
                long j = ((q64) bu0Var.N.b).c;
                if (j != 16) {
                    return j;
                }
                z54 z54Var = (z54) j42.r(bu0Var, d64.b);
                if (z54Var != null) {
                    long j2 = z54Var.a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((x70) j42.r(bu0Var, yh0.a())).a;
            case 1:
                bu0 bu0Var2 = (bu0) obj;
                return ((fw2) j42.r(bu0Var2, lw2.b)).a.g;
            case 2:
                bu0 bu0Var3 = (bu0) obj;
                return ((fw2) j42.r(bu0Var3, lw2.b)).a.f;
            default:
                return ((q64) obj).c;
        }
    }
}
