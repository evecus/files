package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yk1 implements Comparable {
    public final int I;
    public final int J;
    public final String K;
    public final String L;

    public yk1(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.I = i;
        this.J = i2;
        this.K = str;
        this.L = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yk1 yk1Var = (yk1) obj;
        yk1Var.getClass();
        int i = this.I - yk1Var.I;
        return i == 0 ? this.J - yk1Var.J : i;
    }
}
