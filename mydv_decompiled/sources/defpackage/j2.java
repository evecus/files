package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j2 extends j42 {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicReferenceFieldUpdater B;
    public final AtomicReferenceFieldUpdater C;
    public final AtomicReferenceFieldUpdater y;
    public final AtomicReferenceFieldUpdater z;

    public j2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.y = atomicReferenceFieldUpdater;
        this.z = atomicReferenceFieldUpdater2;
        this.A = atomicReferenceFieldUpdater3;
        this.B = atomicReferenceFieldUpdater4;
        this.C = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.j42
    public final q2 A(r2 r2Var) {
        return (q2) this.A.getAndSet(r2Var, q2.c);
    }

    @Override // defpackage.j42
    public final void U(q2 q2Var, q2 q2Var2) {
        this.z.lazySet(q2Var, q2Var2);
    }

    @Override // defpackage.j42
    public final void V(q2 q2Var, Thread thread) {
        this.y.lazySet(q2Var, thread);
    }

    @Override // defpackage.j42
    public final boolean h(r2 r2Var, i2 i2Var, i2 i2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.B;
            if (atomicReferenceFieldUpdater.compareAndSet(r2Var, i2Var, i2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r2Var) == i2Var);
        return false;
    }

    @Override // defpackage.j42
    public final boolean i(r2 r2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.C;
            if (atomicReferenceFieldUpdater.compareAndSet(r2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r2Var) == obj);
        return false;
    }

    @Override // defpackage.j42
    public final boolean j(r2 r2Var, q2 q2Var, q2 q2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.A;
            if (atomicReferenceFieldUpdater.compareAndSet(r2Var, q2Var, q2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r2Var) == q2Var);
        return false;
    }

    @Override // defpackage.j42
    public final i2 z(r2 r2Var) {
        return (i2) this.B.getAndSet(r2Var, i2.d);
    }
}
