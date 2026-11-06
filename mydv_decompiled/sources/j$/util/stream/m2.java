package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class m2 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public m2(m2 m2Var, Spliterator spliterator) {
        super(m2Var, spliterator);
        this.h = m2Var.h;
        this.i = m2Var.i;
        this.j = m2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new m2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f2 a() {
        x1 x1Var = (x1) this.i.apply(this.h.G(this.b));
        this.h.R(this.b, x1Var);
        return x1Var.build();
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (f2) this.j.apply((f2) ((m2) dVar).f, (f2) ((m2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public m2(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
