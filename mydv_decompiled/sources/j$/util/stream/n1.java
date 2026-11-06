package j$.util.stream;

import java.util.function.Predicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class n1 extends r1 {
    public final /* synthetic */ s1 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(s1 s1Var, Predicate predicate) {
        super(s1Var);
        this.c = s1Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        s1 s1Var = this.c;
        if (test == s1Var.a) {
            this.a = true;
            this.b = s1Var.b;
        }
    }
}
