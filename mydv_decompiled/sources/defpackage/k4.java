package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k4 extends g4 {
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public k4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.i = atomicReferenceFieldUpdater;
        this.j = atomicReferenceFieldUpdater2;
        this.k = atomicReferenceFieldUpdater3;
        this.l = atomicReferenceFieldUpdater4;
        this.m = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.g4
    public final void Y(m4 m4Var, m4 m4Var2) {
        this.j.lazySet(m4Var, m4Var2);
    }

    @Override // defpackage.g4
    public final void Z(m4 m4Var, Thread thread) {
        this.i.lazySet(m4Var, thread);
    }

    @Override // defpackage.g4
    public final boolean n(n4 n4Var, j4 j4Var, j4 j4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(n4Var, j4Var, j4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n4Var) == j4Var);
        return false;
    }

    @Override // defpackage.g4
    public final boolean o(n4 n4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(n4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n4Var) == obj);
        return false;
    }

    @Override // defpackage.g4
    public final boolean p(n4 n4Var, m4 m4Var, m4 m4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(n4Var, m4Var, m4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n4Var) == m4Var);
        return false;
    }
}
