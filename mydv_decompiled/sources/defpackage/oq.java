package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oq {
    public static sq a() {
        ot3 ot3Var;
        ot3 ot3Var2;
        Condition condition;
        Condition condition2;
        long j;
        ot3 ot3Var3;
        long j2;
        sq sqVar;
        ot3Var = sq.queue;
        sq sqVar2 = ot3Var.b[1];
        if (sqVar2 != null) {
            long remainingNanos$okio = sqVar2.remainingNanos$okio(System.nanoTime());
            if (remainingNanos$okio > 0) {
                condition = sq.condition;
                condition.await(remainingNanos$okio, TimeUnit.NANOSECONDS);
                return null;
            }
            ot3Var2 = sq.queue;
            ot3Var2.b(sqVar2);
            sqVar2.state = 2;
            return sqVar2;
        }
        long nanoTime = System.nanoTime();
        condition2 = sq.condition;
        j = sq.IDLE_TIMEOUT_MILLIS;
        condition2.await(j, TimeUnit.MILLISECONDS);
        ot3Var3 = sq.queue;
        if (ot3Var3.b[1] == null) {
            long nanoTime2 = System.nanoTime() - nanoTime;
            j2 = sq.IDLE_TIMEOUT_NANOS;
            if (nanoTime2 >= j2) {
                sqVar = sq.idleSentinel;
                return sqVar;
            }
        }
        return null;
    }

    public static void b(sq sqVar) {
        sq sqVar2;
        ot3 ot3Var;
        Condition condition;
        sqVar2 = sq.idleSentinel;
        if (sqVar2 == null) {
            sq.idleSentinel = new sq();
            pq pqVar = new pq("Okio Watchdog");
            pqVar.setDaemon(true);
            pqVar.start();
        }
        sq.setTimeoutAt$okio$default(sqVar, 0L, 1, null);
        ot3Var = sq.queue;
        ot3Var.getClass();
        int i = ot3Var.a + 1;
        ot3Var.a = i;
        sq[] sqVarArr = ot3Var.b;
        if (i == sqVarArr.length) {
            sq[] sqVarArr2 = new sq[i * 2];
            dq.T0(0, 0, 14, sqVarArr, sqVarArr2);
            ot3Var.b = sqVarArr2;
        }
        ot3Var.a(sqVar, i);
        if (sqVar.index == 1) {
            condition = sq.condition;
            condition.signal();
        }
    }
}
