package defpackage;

import com.materialkolor.ktx.ImageBitmapKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ww1 extends k05 implements hn1 {
    public final /* synthetic */ tw1 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ long K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ t43 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww1(tw1 tw1Var, int i, long j, boolean z, int i2, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = tw1Var;
        this.J = i;
        this.K = j;
        this.L = z;
        this.M = i2;
        this.N = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ww1(this.I, this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ww1 ww1Var = (ww1) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        ww1Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        this.N.setValue(ImageBitmapKt.m189themeColorsXOJAsU(this.I, this.J, this.K, this.L, this.M));
        return wd5.a;
    }
}
