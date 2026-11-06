package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gs0 implements ti2 {
    public final /* synthetic */ byte I = 1;
    public final Object J;
    public final Object K;

    public gs0(es0 es0Var, ti2 ti2Var) {
        this.J = es0Var;
        this.K = ti2Var;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        byte b = this.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                es0 es0Var = (es0) obj2;
                switch (fs0.a[ji2Var.ordinal()]) {
                    case 1:
                        es0Var.onCreate(vi2Var);
                        break;
                    case 2:
                        es0Var.onStart(vi2Var);
                        break;
                    case 3:
                        es0Var.onResume(vi2Var);
                        break;
                    case 4:
                        es0Var.onPause(vi2Var);
                        break;
                    case 5:
                        es0Var.onStop(vi2Var);
                        break;
                    case 6:
                        es0Var.onDestroy(vi2Var);
                        break;
                    case 7:
                        s83.t("ON_ANY must not been send by anybody");
                        break;
                    default:
                        s83.v();
                        break;
                }
                ti2 ti2Var = (ti2) obj;
                if (ti2Var != null) {
                    ti2Var.e(vi2Var, ji2Var);
                    break;
                }
                break;
            default:
                de3 de3Var = (de3) obj2;
                int i = ie3.a[ji2Var.ordinal()];
                if (i == 1) {
                    de3Var.g(true);
                    break;
                } else if (i == 2) {
                    de3Var.g(false);
                    break;
                } else if (i == 3) {
                    de3Var.e();
                    ((li2) obj).b(this);
                    break;
                }
                break;
        }
    }

    public gs0(de3 de3Var, je3 je3Var, li2 li2Var) {
        this.J = de3Var;
        this.K = li2Var;
    }
}
