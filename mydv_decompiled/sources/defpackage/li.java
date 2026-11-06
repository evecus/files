package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class li extends r92 implements rm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li(Object obj, byte b) {
        super(0);
        this.J = b;
        this.K = obj;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((t43) obj).setValue(Boolean.FALSE);
                return wd5.a;
            default:
                ea5 ea5Var = (ea5) obj;
                Object d = ea5Var.a.d();
                aa1 aa1Var = aa1.K;
                return Boolean.valueOf(d == aa1Var && ea5Var.d.getValue() == aa1Var);
        }
    }
}
