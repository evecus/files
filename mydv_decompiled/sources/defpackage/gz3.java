package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gz3 implements Comparable {
    public int I = -1;
    public double J = -1.0d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gz3 gz3Var = (gz3) obj;
        gz3Var.getClass();
        return Double.compare(this.J, gz3Var.J);
    }
}
