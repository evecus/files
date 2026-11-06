package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a25 implements wi {
    public final xh5 a;
    public final ub5 b;
    public Object c;
    public Object d;
    public hj e;
    public hj f;
    public final hj g;
    public long h;
    public hj i;

    public a25(bj bjVar, ub5 ub5Var, Object obj, Object obj2, hj hjVar) {
        this.a = bjVar.a(ub5Var);
        this.b = ub5Var;
        this.c = obj2;
        this.d = obj;
        this.e = (hj) ub5Var.a.invoke(obj);
        tm1 tm1Var = ub5Var.a;
        this.f = (hj) tm1Var.invoke(obj2);
        this.g = hjVar != null ? i42.m0(hjVar) : ((hj) tm1Var.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.wi
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.wi
    public final long b() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long k = this.a.k(this.e, this.f, this.g);
        this.h = k;
        return k;
    }

    @Override // defpackage.wi
    public final ub5 c() {
        return this.b;
    }

    @Override // defpackage.wi
    public final hj d(long j) {
        if (!r7.a(this, j)) {
            return this.a.d(j, this.e, this.f, this.g);
        }
        hj hjVar = this.i;
        if (hjVar != null) {
            return hjVar;
        }
        hj j2 = this.a.j(this.e, this.f, this.g);
        this.i = j2;
        return j2;
    }

    @Override // defpackage.wi
    public final /* synthetic */ boolean e(long j) {
        return r7.a(this, j);
    }

    @Override // defpackage.wi
    public final Object f(long j) {
        if (r7.a(this, j)) {
            return this.c;
        }
        hj i = this.a.i(j, this.e, this.f, this.g);
        int b = i.b();
        for (int i2 = 0; i2 < b; i2++) {
            if (Float.isNaN(i.a(i2))) {
                lr3.b("AnimationVector cannot contain a NaN. " + i + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(i);
    }

    @Override // defpackage.wi
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (j42.c(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (hj) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (j42.c(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (hj) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
