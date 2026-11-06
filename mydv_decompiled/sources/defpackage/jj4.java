package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jj4 {
    public static final ep b;
    public static final ep c;
    public static final ep d;
    public static final ep e;
    public static final int a = oh4.u(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = oh4.u(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        byte b2 = 25;
        b = new ep("PERMIT", b2);
        c = new ep("TAKEN", b2);
        d = new ep("BROKEN", b2);
        e = new ep("CANCELLED", b2);
    }
}
