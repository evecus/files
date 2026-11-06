package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class o8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public o8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = y6.ORDERED.h(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            y6 y6Var = y6.SIZED;
            a aVar = this.h;
            int i = aVar.c;
            int i2 = y6Var.e;
            if ((i & i2) == i2) {
                j = aVar.G(this.b);
                x1 J = this.a.J(j, this.i);
                n8 h = ((m8) this.h).h(J, (this.j || b) ? false : true);
                this.a.R(this.b, h);
                f2 build = J.build();
                this.k = build.count();
                this.l = h.h();
                return build;
            }
        }
        j = -1;
        x1 J2 = this.a.J(j, this.i);
        n8 h2 = ((m8) this.h).h(J2, (this.j || b) ? false : true);
        this.a.R(this.b, h2);
        f2 build2 = J2.build();
        this.k = build2.count();
        this.l = h2.h();
        return build2;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new o8(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                o8 o8Var = (o8) dVar;
                long j = o8Var.l;
                this.l = j;
                if (j == o8Var.k) {
                    this.l = j + ((o8) this.e).l;
                }
            }
            o8 o8Var2 = (o8) dVar;
            long j2 = o8Var2.k;
            o8 o8Var3 = (o8) this.e;
            this.k = j2 + o8Var3.k;
            f2 E = o8Var2.k == 0 ? (f2) o8Var3.f : o8Var3.k == 0 ? (f2) o8Var2.f : v3.E(this.h.I(), (f2) ((o8) this.d).f, (f2) ((o8) this.e).f);
            if (b() && this.j) {
                E = E.j(this.l, E.count(), this.i);
            }
            this.f = E;
        }
        super.onCompletion(countedCompleter);
    }

    public o8(o8 o8Var, Spliterator spliterator) {
        super(o8Var, spliterator);
        this.h = o8Var.h;
        this.i = o8Var.i;
        this.j = o8Var.j;
    }
}
