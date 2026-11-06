package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class v5 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public v5(v5 v5Var, Spliterator spliterator) {
        super(v5Var, spliterator);
        this.j = v5Var.j;
        this.k = v5Var.k;
        this.l = v5Var.l;
        this.m = v5Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            y6 y6Var = y6.SIZED;
            a aVar = this.j;
            int i = aVar.c;
            int i2 = y6Var.e;
            x1 J = this.j.J((i & i2) == i2 ? aVar.G(this.b) : -1L, this.k);
            l5 N = this.j.N(this.a.f, J);
            a aVar2 = this.a;
            aVar2.B(this.b, aVar2.S(N));
            return J.build();
        }
        x1 J2 = this.j.J(-1L, this.k);
        if (this.l == 0) {
            l5 N2 = this.j.N(this.a.f, J2);
            a aVar3 = this.a;
            aVar3.B(this.b, aVar3.S(N2));
        } else {
            this.a.R(this.b, J2);
        }
        f2 build = J2.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new v5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(v3.G(this.j.I()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.G(this.j.I());
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        v5 v5Var = (v5) this.d;
        v5 v5Var2 = (v5) this.e;
        if (v5Var == null || v5Var2 == null) {
            return this.n;
        }
        long j2 = v5Var.j(j);
        return j2 >= j ? j2 : v5Var2.j(j) + j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r2 >= r0) goto L49;
     */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.v5.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public v5(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }
}
