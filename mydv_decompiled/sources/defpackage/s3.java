package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class s3 {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(ra4 ra4Var) {
        bp1 bp1Var = (bp1) this;
        int i = bp1Var.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int h = ra4Var.h(this);
        bp1Var.memoizedSerializedSize = h;
        return h;
    }

    public abstract void c(i70 i70Var);
}
