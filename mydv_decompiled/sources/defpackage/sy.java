package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sy implements tm1 {
    public final /* synthetic */ byte I = 1;
    public Object J;

    public sy(l10 l10Var) {
        this.J = l10Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((l10) this.J).cancel();
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                aq3 aq3Var = (aq3) this.J;
                if (aq3Var != null) {
                    aq3Var.c = booleanValue;
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ sy() {
    }
}
