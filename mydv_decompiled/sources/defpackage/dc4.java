package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dc4 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ long J;
    public /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc4(long j, r41 r41Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = j;
        this.K = r41Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                dc4 dc4Var = new dc4(this.J, fj0Var);
                dc4Var.K = obj;
                return dc4Var;
            default:
                return new dc4(this.J, (r41) this.K, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((dc4) create((mc4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            default:
                ((dc4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        int i;
        r41 r41Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        long j = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                oc4 oc4Var = ((mc4) this.K).a;
                oc4Var.d(oc4Var.k, j, 1);
                break;
            default:
                mu0.V(obj);
                int i2 = (int) (j >> 32);
                if (i2 > 0 && (i = (int) (j & 4294967295L)) > 0 && (r41Var = (r41) this.K) != null) {
                    float f = i2 / i;
                    r41Var.h = f;
                    AspectRatioFrameLayout aspectRatioFrameLayout = r41Var.g;
                    if (aspectRatioFrameLayout != null) {
                        aspectRatioFrameLayout.setAspectRatio(f);
                        break;
                    }
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc4(long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = j;
    }
}
