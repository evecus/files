package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f52 extends y52 {
    public static final /* synthetic */ long N = gq.a.objectFieldOffset(f52.class.getDeclaredField("_invoked$volatile"));
    public final sd M;
    private volatile /* synthetic */ int _invoked$volatile;

    public f52(sd sdVar) {
        this.M = sdVar;
    }

    @Override // defpackage.y52
    public final boolean k() {
        return true;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        if (gq.a.compareAndSwapInt(this, N, 0, 1)) {
            this.M.invoke(th);
        }
    }
}
