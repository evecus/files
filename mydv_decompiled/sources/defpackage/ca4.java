package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ca4 implements hn1 {
    public static final ca4 J = new ca4(0);
    public static final ca4 K = new ca4(1);
    public final /* synthetic */ byte I;

    public /* synthetic */ ca4(byte b) {
        this.I = b;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        String str;
        dn1 dn1Var;
        switch (this.I) {
            case 0:
                long j = ((x70) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(qb.i0(j));
            default:
                v4 v4Var = (v4) obj;
                v4 v4Var2 = (v4) obj2;
                if (v4Var == null || (str = v4Var.a) == null) {
                    str = v4Var2.a;
                }
                if (v4Var == null || (dn1Var = v4Var.b) == null) {
                    dn1Var = v4Var2.b;
                }
                return new v4(str, dn1Var);
        }
    }
}
