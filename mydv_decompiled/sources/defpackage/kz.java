package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class kz {
    public static final c50 a = new c50(-1, null, null, 0);
    public static final int b = oh4.u(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = oh4.u(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final ep d;
    public static final ep e;
    public static final ep f;
    public static final ep g;
    public static final ep h;
    public static final ep i;
    public static final ep j;
    public static final ep k;
    public static final ep l;
    public static final ep m;
    public static final ep n;
    public static final ep o;
    public static final ep p;
    public static final ep q;
    public static final ep r;
    public static final ep s;

    static {
        byte b2 = 25;
        d = new ep("BUFFERED", b2);
        e = new ep("SHOULD_BUFFER", b2);
        f = new ep("S_RESUMING_BY_RCV", b2);
        g = new ep("RESUMING_BY_EB", b2);
        h = new ep("POISONED", b2);
        i = new ep("DONE_RCV", b2);
        j = new ep("INTERRUPTED_SEND", b2);
        k = new ep("INTERRUPTED_RCV", b2);
        l = new ep("CHANNEL_CLOSED", b2);
        m = new ep("SUSPEND", b2);
        n = new ep("SUSPEND_NO_WAITER", b2);
        o = new ep("FAILED", b2);
        p = new ep("NO_RECEIVE_RESULT", b2);
        q = new ep("CLOSE_HANDLER_CLOSED", b2);
        r = new ep("CLOSE_HANDLER_INVOKED", b2);
        s = new ep("NO_CLOSE_CAUSE", b2);
    }
}
