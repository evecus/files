package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x71 extends vt0 {
    public final /* synthetic */ y71 d;

    public x71(y71 y71Var) {
        this.d = y71Var;
    }

    @Override // defpackage.vt0
    public final void K(Throwable th) {
        this.d.a.f(th);
    }

    @Override // defpackage.vt0
    public final void L(mc3 mc3Var) {
        y71 y71Var = this.d;
        y71Var.c = mc3Var;
        mc3 mc3Var2 = y71Var.c;
        c81 c81Var = y71Var.a;
        y71Var.b = new x81(mc3Var2, c81Var.g, c81Var.i, e21.s());
        c81 c81Var2 = y71Var.a;
        ArrayList arrayList = new ArrayList();
        c81Var2.a.writeLock().lock();
        try {
            c81Var2.c = (byte) 1;
            arrayList.addAll(c81Var2.b);
            c81Var2.b.clear();
            c81Var2.a.writeLock().unlock();
            c81Var2.d.post(new a81(arrayList, c81Var2.c, null));
        } catch (Throwable th) {
            c81Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
