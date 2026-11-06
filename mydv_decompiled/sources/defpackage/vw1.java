package defpackage;

import com.materialkolor.ktx.ImageBitmapKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vw1 extends k05 implements hn1 {
    public final /* synthetic */ tw1 I;
    public final /* synthetic */ long J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ int L;
    public final /* synthetic */ t43 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(tw1 tw1Var, long j, boolean z, int i, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = tw1Var;
        this.J = j;
        this.K = z;
        this.L = i;
        this.M = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new vw1(this.I, this.J, this.K, this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        vw1 vw1Var = (vw1) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        vw1Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        this.M.setValue(new x70(ImageBitmapKt.m187themeColorRPmYEkk(this.I, this.J, this.K, this.L)));
        return wd5.a;
    }
}
