package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gs extends y52 {
    public static final /* synthetic */ long P = gq.a.objectFieldOffset(gs.class.getDeclaredField("_disposer$volatile"));
    public final k10 M;
    public cy0 N;
    public final /* synthetic */ is O;
    private volatile /* synthetic */ Object _disposer$volatile;

    public gs(is isVar, k10 k10Var) {
        this.O = isVar;
        this.M = k10Var;
    }

    @Override // defpackage.y52
    public final void l(Throwable th) {
        k10 k10Var = this.M;
        if (th != null) {
            ep E = k10Var.E(new ub0(th, false), null);
            if (E != null) {
                k10Var.l(E);
                hs hsVar = (hs) gq.a.getObjectVolatile(this, P);
                if (hsVar != null) {
                    hsVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = is.b;
        is isVar = this.O;
        if (atomicIntegerFieldUpdater.decrementAndGet(isVar) == 0) {
            kt0[] kt0VarArr = isVar.a;
            ArrayList arrayList = new ArrayList(kt0VarArr.length);
            for (kt0 kt0Var : kt0VarArr) {
                arrayList.add(kt0Var.g());
            }
            k10Var.resumeWith(arrayList);
        }
    }
}
