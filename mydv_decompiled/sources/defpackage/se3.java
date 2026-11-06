package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class se3 implements Comparator {
    public static final se3 J = new se3(0);
    public final /* synthetic */ byte I;

    public /* synthetic */ se3(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.I) {
            case 0:
                wa2 wa2Var = (wa2) obj;
                wa2 wa2Var2 = (wa2) obj2;
                int m = j42.m(wa2Var2.X, wa2Var.X);
                return m != 0 ? m : j42.m(wa2Var.hashCode(), wa2Var2.hashCode());
            case 1:
                wa2 wa2Var3 = (wa2) obj;
                wa2 wa2Var4 = (wa2) obj2;
                int m2 = j42.m(wa2Var3.X, wa2Var4.X);
                return m2 != 0 ? m2 : j42.m(wa2Var3.hashCode(), wa2Var4.hashCode());
            case 2:
                return Float.valueOf(((hy0) obj).a).compareTo(Float.valueOf(((hy0) obj2).a));
            case 3:
                return j42.p((gz3) obj, (gz3) obj2);
            default:
                za4 za4Var = (za4) obj;
                za4 za4Var2 = (za4) obj2;
                za4Var.getClass();
                za4Var2.getClass();
                return Double.valueOf(za4Var2.b).compareTo(Double.valueOf(za4Var.b));
        }
    }
}
