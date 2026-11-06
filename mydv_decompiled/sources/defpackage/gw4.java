package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gw4 extends t4 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.t4
    public final boolean a(s4 s4Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(o7.t);
        return true;
    }

    @Override // defpackage.t4
    public final fj0[] b(s4 s4Var) {
        this.a.set(null);
        return i42.a;
    }
}
