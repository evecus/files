package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ft5 extends Thread {
    public final LinkedBlockingQueue I = new LinkedBlockingQueue();
    public final /* synthetic */ wc4 J;

    public ft5(wc4 wc4Var) {
        this.J = wc4Var;
        setName("WebSocketWorker-" + getId());
        setUncaughtExceptionHandler(new et5(this));
    }

    public final void a(dt5 dt5Var, ByteBuffer byteBuffer) {
        wc4 wc4Var = this.J;
        try {
            dt5Var.d(byteBuffer);
        } catch (Exception e) {
            wc4Var.P.d("Error while reading from remote connection", e);
        } finally {
            wc4Var.q(byteBuffer);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        dt5 dt5Var;
        Throwable th;
        Throwable e;
        wc4 wc4Var = this.J;
        gr2 gr2Var = wc4Var.P;
        while (true) {
            try {
                try {
                    dt5Var = (dt5) this.I.take();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (LinkageError e2) {
                e = e2;
                Throwable th2 = e;
                dt5Var = null;
                e = th2;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (ThreadDeath e3) {
                e = e3;
                Throwable th22 = e;
                dt5Var = null;
                e = th22;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (VirtualMachineError e4) {
                e = e4;
                Throwable th222 = e;
                dt5Var = null;
                e = th222;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (Throwable th3) {
                dt5Var = null;
                th = th3;
            }
            try {
                a(dt5Var, (ByteBuffer) dt5Var.c.poll());
            } catch (LinkageError e5) {
                e = e5;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (ThreadDeath e6) {
                e = e6;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (VirtualMachineError e7) {
                e = e7;
                gr2Var.l(getName());
                wc4Var.k(dt5Var, new Exception(e));
                return;
            } catch (Throwable th4) {
                th = th4;
                gr2Var.c(getName(), th);
                if (dt5Var != null) {
                    wc4Var.n(dt5Var, new Exception(th));
                    dt5Var.a(1000, "", false);
                    return;
                }
                return;
            }
        }
    }
}
