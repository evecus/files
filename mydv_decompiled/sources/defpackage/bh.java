package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bh {
    public final ub5 a;
    public final Object b;
    public final cj c;
    public final jk3 d;
    public final jk3 e;
    public final l53 f;
    public final hj g;
    public final hj h;
    public hj i;
    public hj j;

    public bh(Object obj, ub5 ub5Var, Object obj2) {
        this.a = ub5Var;
        this.b = obj2;
        cj cjVar = new cj(ub5Var, obj, null, 60);
        this.c = cjVar;
        this.d = ad4.w(Boolean.FALSE);
        this.e = ad4.w(obj);
        this.f = new l53();
        new ku4(obj2);
        hj hjVar = cjVar.K;
        boolean z = hjVar instanceof dj;
        hj hjVar2 = z ? p70.e : hjVar instanceof ej ? p70.f : hjVar instanceof fj ? p70.g : p70.h;
        this.g = hjVar2;
        hj hjVar3 = z ? p70.a : hjVar instanceof ej ? p70.b : hjVar instanceof fj ? p70.c : p70.d;
        this.h = hjVar3;
        this.i = hjVar2;
        this.j = hjVar3;
    }

    public static Object a(bh bhVar, Object obj, bj bjVar, Float f, v1 v1Var, fj0 fj0Var, int i) {
        Object invoke = (i & 4) != 0 ? bhVar.a.b.invoke(bhVar.c.K) : f;
        v1 v1Var2 = (i & 8) != 0 ? null : v1Var;
        Object d = bhVar.d();
        ub5 ub5Var = bhVar.a;
        return l53.a(bhVar.f, new yg(bhVar, invoke, new a25(bjVar, ub5Var, d, obj, (hj) ub5Var.a.invoke(invoke)), bhVar.c.L, v1Var2, null), fj0Var);
    }

    public final Object b(Object obj) {
        if (!j42.c(this.i, this.g) || !j42.c(this.j, this.h)) {
            ub5 ub5Var = this.a;
            hj hjVar = (hj) ub5Var.a.invoke(obj);
            int b = hjVar.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (hjVar.a(i) < this.i.a(i) || hjVar.a(i) > this.j.a(i)) {
                    hjVar.e(ut0.q(hjVar.a(i), this.i.a(i), this.j.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return ub5Var.b.invoke(hjVar);
            }
        }
        return obj;
    }

    public final void c() {
        cj cjVar = this.c;
        cjVar.K.d();
        cjVar.L = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.J.getValue();
    }

    public final Object e(fj0 fj0Var, Object obj) {
        Object a = l53.a(this.f, new zg(this, obj, null), fj0Var);
        return a == el0.I ? a : wd5.a;
    }

    public /* synthetic */ bh(Object obj, ub5 ub5Var, Object obj2, int i) {
        this(obj, ub5Var, (i & 4) != 0 ? null : obj2);
    }
}
