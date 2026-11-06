package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jo5 extends k05 implements hn1 {
    public r24 I;
    public ExoPlayer J;
    public byte K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ ExoPlayer M;
    public final /* synthetic */ fp3 N;
    public final /* synthetic */ lp1 O;
    public final /* synthetic */ String P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo5(boolean z, ExoPlayer exoPlayer, fp3 fp3Var, lp1 lp1Var, String str, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = z;
        this.M = exoPlayer;
        this.N = fp3Var;
        this.O = lp1Var;
        this.P = str;
        this.Q = t43Var;
        this.R = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new jo5(this.L, this.M, this.N, this.O, this.P, this.Q, this.R, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((jo5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (defpackage.rt0.n(32, r8) != r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r9.r() == r6) goto L37;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte, r24] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.K
            r1 = 2
            r2 = 0
            r3 = 1
            androidx.media3.exoplayer.ExoPlayer r4 = r8.M
            wd5 r5 = defpackage.wd5.a
            el0 r6 = defpackage.el0.I
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1c
            if (r0 != r1) goto L16
            defpackage.mu0.V(r9)
            goto L8d
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r2
        L1c:
            r24 r0 = r8.I
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L22
            goto L6c
        L22:
            r8 = move-exception
            goto L76
        L24:
            defpackage.mu0.V(r9)
            boolean r9 = r8.L
            if (r9 == 0) goto L2d
            goto Lab
        L2d:
            boolean r9 = r4.isPlaying()
            if (r9 == 0) goto L80
            r24 r0 = new r24
            r0.<init>()
            r8.I = r0     // Catch: java.lang.Throwable -> L22
            r8.J = r4     // Catch: java.lang.Throwable -> L22
            r8.K = r3     // Catch: java.lang.Throwable -> L22
            k10 r9 = new k10     // Catch: java.lang.Throwable -> L22
            fj0 r7 = defpackage.mu0.G(r8)     // Catch: java.lang.Throwable -> L22
            r9.<init>(r3, r7)     // Catch: java.lang.Throwable -> L22
            r9.t()     // Catch: java.lang.Throwable -> L22
            io5 r7 = new io5     // Catch: java.lang.Throwable -> L22
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L22
            r0.I = r7     // Catch: java.lang.Throwable -> L22
            r4.addListener(r7)     // Catch: java.lang.Throwable -> L22
            boolean r7 = r4.isPlaying()     // Catch: java.lang.Throwable -> L22
            if (r7 != 0) goto L65
            java.lang.Object r7 = r9.s()     // Catch: java.lang.Throwable -> L22
            boolean r7 = r7 instanceof defpackage.za3     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L65
            r9.resumeWith(r5)     // Catch: java.lang.Throwable -> L22
        L65:
            java.lang.Object r9 = r9.r()     // Catch: java.lang.Throwable -> L22
            if (r9 != r6) goto L6c
            goto L8c
        L6c:
            java.lang.Object r9 = r0.I
            androidx.media3.common.Player$Listener r9 = (androidx.media3.common.Player.Listener) r9
            if (r9 == 0) goto L80
            r4.removeListener(r9)
            goto L80
        L76:
            java.lang.Object r9 = r0.I
            androidx.media3.common.Player$Listener r9 = (androidx.media3.common.Player.Listener) r9
            if (r9 == 0) goto L7f
            r4.removeListener(r9)
        L7f:
            throw r8
        L80:
            r8.I = r2
            r8.K = r1
            r0 = 32
            java.lang.Object r9 = defpackage.rt0.n(r0, r8)
            if (r9 != r6) goto L8d
        L8c:
            return r6
        L8d:
            boolean r9 = defpackage.ro5.a
            t43 r9 = r8.Q
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9e
            goto Lab
        L9e:
            fp3 r9 = r8.N
            androidx.media3.ui.PlayerView r9 = r9.a
            if (r9 != 0) goto La5
            goto Lab
        La5:
            androidx.media3.common.Player r0 = r9.getPlayer()
            if (r0 == r4) goto Lac
        Lab:
            return r5
        Lac:
            r9.setKeepContentOnPlayerReset(r3)
            r9.setPlayer(r2)
            lp1 r9 = r8.O
            boolean r0 = r9.b()
            if (r0 == 0) goto Lc3
            tm1 r9 = r9.d
            if (r9 == 0) goto Lc3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.invoke(r0)
        Lc3:
            t43 r9 = r8.R
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.setValue(r0)
            java.lang.String r8 = r8.P
            r9 = 60
            java.lang.String r8 = defpackage.jx4.f0(r9, r8)
            java.lang.String r9 = "解绑 Surface 保留最后一帧: url="
            java.lang.String r8 = r9.concat(r8)
            java.lang.String r9 = "VideoPlayer"
            android.util.Log.d(r9, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
