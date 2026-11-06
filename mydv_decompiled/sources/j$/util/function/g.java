package j$.util.function;

import j$.util.p;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, byte b) {
        this.a = b;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return j$.time.a.b(this, predicate);
    }

    public final Predicate negate() {
        switch (this.a) {
        }
        return new p((byte) 1, this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return j$.time.a.v(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (b) {
            case 0:
                if (!predicate2.test(obj) || !predicate.test(obj)) {
                    break;
                }
                break;
            default:
                if (!predicate2.test(obj) && !predicate.test(obj)) {
                    break;
                }
                break;
        }
        return false;
    }
}
