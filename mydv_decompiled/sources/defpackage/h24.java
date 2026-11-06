package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h24 {
    public int a;
    public int b;
    public byte c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public int m;

    public final void a(int i) {
        if ((this.c & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.c));
    }

    public final int b() {
        return this.f ? this.a - this.b : this.d;
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=" + this.d + ", mIsMeasuring=" + this.h + ", mPreviousLayoutItemCount=" + this.a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.b + ", mStructureChanged=" + this.e + ", mInPreLayout=" + this.f + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
    }
}
