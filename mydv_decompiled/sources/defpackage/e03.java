package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e03 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ e03(int i, t43 t43Var) {
        this.I = (byte) 1;
        this.J = i;
        this.K = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((tm1) obj).invoke(Integer.valueOf(i));
                return wd5Var;
            case 1:
                ((t43) obj).setValue(Integer.valueOf(i));
                return wd5Var;
            default:
                return Integer.valueOf(((u55) ((h60) obj).e).b.d(i));
        }
    }

    public /* synthetic */ e03(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }
}
