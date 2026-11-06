package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lo5 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ boolean J;
    public final /* synthetic */ dl0 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ ExoPlayer M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ t43 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(dl0 dl0Var, t43 t43Var, ExoPlayer exoPlayer, t43 t43Var2, t43 t43Var3, t43 t43Var4, String str, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = dl0Var;
        this.L = t43Var;
        this.M = exoPlayer;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = t43Var4;
        this.Q = str;
        this.R = t43Var5;
        this.S = t43Var6;
        this.T = t43Var7;
        this.U = t43Var8;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        lo5 lo5Var = new lo5(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, fj0Var);
        lo5Var.J = ((Boolean) obj).booleanValue();
        return lo5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((lo5) create(bool, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x001b, code lost:
    
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.J
            boolean r1 = r8.I
            r2 = 0
            t43 r3 = r8.L
            wd5 r4 = defpackage.wd5.a
            r5 = 1
            if (r1 == 0) goto L18
            if (r1 != r5) goto L12
            defpackage.mu0.V(r9)
            goto L42
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r2
        L18:
            defpackage.mu0.V(r9)
            if (r0 != 0) goto L1f
            goto L98
        L1f:
            dl0 r9 = r8.K
            boolean r9 = defpackage.i42.u0(r9)
            if (r9 == 0) goto L98
            java.lang.Object r9 = r3.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            r8.J = r0
            r8.I = r5
            r6 = 350(0x15e, double:1.73E-321)
            java.lang.Object r9 = defpackage.rt0.n(r6, r8)
            el0 r1 = defpackage.el0.I
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.media3.exoplayer.ExoPlayer r9 = r8.M
            androidx.media3.common.MediaItem r1 = r9.getCurrentMediaItem()
            if (r1 == 0) goto L57
            androidx.media3.common.MediaItem$LocalConfiguration r1 = r1.localConfiguration
            if (r1 == 0) goto L57
            android.net.Uri r1 = r1.uri
            if (r1 == 0) goto L57
            java.lang.String r1 = r1.toString()
            goto L58
        L57:
            r1 = r2
        L58:
            t43 r6 = r8.N
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L1f
            boolean r6 = r9.isPlaying()
            if (r6 == 0) goto L1f
            t43 r6 = r8.O
            java.lang.Object r6 = r6.getValue()
            boolean r1 = defpackage.j42.c(r1, r6)
            if (r1 == 0) goto L1f
            t43 r1 = r8.P
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1f
            java.lang.String r0 = r8.Q
            java.lang.String r1 = "fallback"
            defpackage.ro5.d(r3, r9, r0, r1)
            t43 r9 = r8.T
            t43 r0 = r8.U
            t43 r1 = r8.R
            t43 r8 = r8.S
            defpackage.ro5.e(r1, r8, r9, r0)
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
