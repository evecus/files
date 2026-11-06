package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yq1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;

    public /* synthetic */ yq1(tm1 tm1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long j;
        switch (this.I) {
            case 0:
                us4 us4Var = (us4) obj;
                synchronized (ws4.c) {
                    j = ws4.e;
                    ws4.e = 1 + j;
                }
                return new o04(j, us4Var, this.J);
            default:
                return this.J.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
