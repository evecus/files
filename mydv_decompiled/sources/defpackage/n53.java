package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n53 implements i10, os5 {
    public final k10 I;
    public final /* synthetic */ o53 J;

    public n53(o53 o53Var, k10 k10Var) {
        this.J = o53Var;
        this.I = k10Var;
    }

    @Override // defpackage.i10
    public final ep a(Object obj, in1 in1Var) {
        o53 o53Var = this.J;
        j10 j10Var = new j10(o53Var, this);
        ep E = this.I.E((wd5) obj, j10Var);
        if (E != null) {
            o53.Q.set(o53Var, null);
        }
        return E;
    }

    @Override // defpackage.os5
    public final void b(lh4 lh4Var, int i) {
        this.I.b(lh4Var, i);
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.I.M;
    }

    @Override // defpackage.i10
    public final void i(Object obj, in1 in1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o53.Q;
        o53 o53Var = this.J;
        atomicReferenceFieldUpdater.set(o53Var, null);
        tf2 tf2Var = new tf2(o53Var, this, (byte) 11);
        k10 k10Var = this.I;
        k10Var.B((wd5) obj, k10Var.K, new j10((Object) tf2Var, (byte) 0));
    }

    @Override // defpackage.i10
    public final boolean j(Throwable th) {
        return this.I.j(th);
    }

    @Override // defpackage.i10
    public final void l(Object obj) {
        this.I.l(obj);
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        this.I.resumeWith(obj);
    }
}
