package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uu1 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ bh J;

    public /* synthetic */ uu1(bh bhVar, byte b) {
        this.I = b;
        this.J = bhVar;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        bh bhVar = this.J;
        switch (b) {
            case 0:
                Object e = bhVar.e(fj0Var, new Float(1.0f - ((gt) obj).c));
                return e == el0Var ? e : wd5Var;
            default:
                Object e2 = bhVar.e(fj0Var, new Float(((gt) obj).c));
                return e2 == el0Var ? e2 : wd5Var;
        }
    }
}
