package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ty3 extends k05 implements hn1 {
    public MotionEvent I;
    public MotionEvent J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public /* synthetic */ Object O;
    public final /* synthetic */ od2 P;
    public final /* synthetic */ double Q;
    public final /* synthetic */ double R;
    public final /* synthetic */ double S;
    public final /* synthetic */ double T;
    public final /* synthetic */ double U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty3(od2 od2Var, double d, double d2, double d3, double d4, double d5, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = od2Var;
        this.Q = d;
        this.R = d2;
        this.S = d3;
        this.T = d4;
        this.U = d5;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        ty3 ty3Var = new ty3(this.P, this.Q, this.R, this.S, this.T, this.U, fj0Var);
        ty3Var.O = obj;
        return ty3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ty3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:4)(2:17|18))(3:19|(2:23|(7:25|26|27|28|(1:30)|31|(1:33)(1:34)))|12)|5|6|7|8|(1:10)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:
    
        r0 = new defpackage.g54(r0);
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
