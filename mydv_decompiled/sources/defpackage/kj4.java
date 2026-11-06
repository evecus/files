package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kj4 extends lh4 {
    public final /* synthetic */ AtomicReferenceArray h;

    public kj4(long j, kj4 kj4Var, int i) {
        super(j, kj4Var, i);
        this.h = new AtomicReferenceArray(jj4.f);
    }

    @Override // defpackage.lh4
    public final int g() {
        return jj4.f;
    }

    @Override // defpackage.lh4
    public final void h(int i, tk0 tk0Var) {
        this.h.set(i, jj4.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
