package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pq extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        oq oqVar;
        ReentrantLock reentrantLock;
        oq oqVar2;
        sq a;
        oq oqVar3;
        sq sqVar;
        oq oqVar4;
        while (true) {
            try {
                oqVar = sq.Companion;
                oqVar.getClass();
                reentrantLock = sq.lock;
                reentrantLock.lock();
                try {
                    oqVar2 = sq.Companion;
                    oqVar2.getClass();
                    a = oq.a();
                    oqVar3 = sq.Companion;
                    oqVar3.getClass();
                    sqVar = sq.idleSentinel;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (a == sqVar) {
                oqVar4 = sq.Companion;
                oqVar4.getClass();
                sq.idleSentinel = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (a != null) {
                a.timedOut();
            }
        }
    }
}
