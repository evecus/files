package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p8 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public p8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = y6.ORDERED.h(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        x1 J = this.a.J(-1L, this.k);
        l5 N = this.j.N(this.a.f, J);
        a aVar = this.a;
        boolean B = aVar.B(this.b, aVar.S(N));
        this.n = B;
        if (B) {
            g();
        }
        f2 build = J.build();
        this.m = build.count();
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new p8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(v3.G(this.j.I()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.G(this.j.I());
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object E;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((p8) dVar).n | ((p8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                E = v3.G(this.j.I());
            } else {
                if (this.l) {
                    p8 p8Var = (p8) this.d;
                    if (p8Var.n) {
                        this.m = p8Var.m;
                        E = (f2) p8Var.i();
                    }
                }
                p8 p8Var2 = (p8) this.d;
                long j = p8Var2.m;
                p8 p8Var3 = (p8) this.e;
                this.m = j + p8Var3.m;
                E = p8Var2.m == 0 ? (f2) p8Var3.i() : p8Var3.m == 0 ? (f2) p8Var2.i() : v3.E(this.j.I(), (f2) ((p8) this.d).i(), (f2) ((p8) this.e).i());
            }
            d(E);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public p8(p8 p8Var, Spliterator spliterator) {
        super(p8Var, spliterator);
        this.j = p8Var.j;
        this.k = p8Var.k;
        this.l = p8Var.l;
    }
}
