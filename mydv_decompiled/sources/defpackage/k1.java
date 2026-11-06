package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class k1 implements ap {
    public final Object a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public k1(Object obj) {
        this.a = obj;
        this.c = obj;
    }

    @Override // defpackage.ap
    public final void b(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // defpackage.ap
    public void c() {
        Object obj = this.c;
        ld0 ld0Var = obj instanceof ld0 ? (ld0) obj : null;
        if (ld0Var != null) {
            ld0Var.i();
        }
    }

    @Override // defpackage.ap
    public final void e(Object obj, hn1 hn1Var) {
        hn1Var.invoke(k(), obj);
    }

    @Override // defpackage.ap
    public final void g() {
        this.c = this.b.remove(r0.size() - 1);
    }

    public final void j() {
        this.b.clear();
        this.c = this.a;
        l();
    }

    public final Object k() {
        return this.c;
    }

    public void l() {
        Object obj = this.a;
        obj.getClass();
        ((v71) obj).b.clear();
    }

    @Override // defpackage.ap
    public void i() {
    }
}
