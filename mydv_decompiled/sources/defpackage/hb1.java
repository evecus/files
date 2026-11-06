package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class hb1 implements Runnable, Comparable, cy0 {
    public long I;
    public int J = -1;
    private volatile Object _heap;

    public hb1(long j) {
        this.I = j;
    }

    public final a75 b() {
        Object obj = this._heap;
        if (obj instanceof a75) {
            return (a75) obj;
        }
        return null;
    }

    public final int c(long j, ib1 ib1Var, jb1 jb1Var) {
        synchronized (this) {
            if (this._heap == qb.g) {
                return 2;
            }
            synchronized (ib1Var) {
                try {
                    hb1[] hb1VarArr = ib1Var.a;
                    hb1 hb1Var = hb1VarArr != null ? hb1VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jb1.M;
                    if (gq.a.getIntVolatile(jb1Var, jb1.O) == 1) {
                        return 1;
                    }
                    if (hb1Var == null) {
                        ib1Var.c = j;
                    } else {
                        long j2 = hb1Var.I;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = ib1Var.c;
                        if (j - j3 > 0) {
                            ib1Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.I - j < 0) {
                        this.I = j;
                    }
                    ib1Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.I - ((hb1) obj).I;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(ib1 ib1Var) {
        if (this._heap != qb.g) {
            this._heap = ib1Var;
        } else {
            s83.t("Failed requirement.");
        }
    }

    @Override // defpackage.cy0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ep epVar = qb.g;
                if (obj == epVar) {
                    return;
                }
                ib1 ib1Var = obj instanceof ib1 ? (ib1) obj : null;
                if (ib1Var != null) {
                    ib1Var.c(this);
                }
                this._heap = epVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.I + ']';
    }
}
