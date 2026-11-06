package okhttp3.internal.http2;

import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface FlowControlListener {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class None implements FlowControlListener {
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingConnectionWindowChanged(WindowCounter windowCounter) {
            windowCounter.getClass();
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingStreamWindowChanged(int i, WindowCounter windowCounter, long j) {
            windowCounter.getClass();
        }
    }

    void receivingConnectionWindowChanged(WindowCounter windowCounter);

    void receivingStreamWindowChanged(int i, WindowCounter windowCounter, long j);
}
