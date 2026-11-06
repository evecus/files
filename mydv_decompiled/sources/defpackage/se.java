package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class se implements ns3, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long P;
    public final View I;
    public boolean K;
    public boolean N;
    public long O;
    public final PriorityQueue J = new PriorityQueue(11, new qe((byte) 0));
    public final Choreographer L = Choreographer.getInstance();
    public final re M = new re();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public se(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.I = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            qe r1 = new qe
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.J = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.L = r0
            re r0 = new re
            r0.<init>()
            r4.M = r0
            long r0 = defpackage.se.P
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.se.P = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.N = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.<init>(android.view.View):void");
    }

    @Override // defpackage.ns3
    public final /* synthetic */ void a(ms3 ms3Var) {
        nt3.c(this, ms3Var);
    }

    public final boolean b() {
        re reVar = this.M;
        long a = reVar.a();
        z9.k("compose:lazy:prefetch:available_time_nanos", a);
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.J;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((pt3) peek).b.c(reVar)) {
                priorityQueue.poll();
                z = false;
            }
            reVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.N) {
            this.O = j;
            this.I.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.N = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.N = false;
        this.I.removeCallbacks(this);
        this.L.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.J;
        if (!priorityQueue.isEmpty() && this.K && this.N) {
            View view = this.I;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * P) + nanos;
                re reVar = this.M;
                reVar.a = z;
                reVar.b = Math.max(this.O, nanos) + P;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (reVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.L.postFrameCallback(this);
                } else {
                    this.K = false;
                }
                z9.k("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.K = false;
    }
}
