package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i53 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public byte J;
    public Object K;
    public Object L;
    public /* synthetic */ Object M;
    public Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(is0 is0Var, ExoPlayer exoPlayer, zd1 zd1Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = is0Var;
        this.L = exoPlayer;
        this.M = zd1Var;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.P;
        Object obj3 = this.O;
        switch (b) {
            case 0:
                i53 i53Var = new i53((l53) obj3, (tm1) obj2, fj0Var);
                i53Var.M = obj;
                return i53Var;
            default:
                return new i53((is0) this.K, (ExoPlayer) this.L, (zd1) this.M, (t43) this.N, (t43) obj3, (t43) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((i53) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, m53] */
    /* JADX WARN: Type inference failed for: r1v7, types: [m53] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(l53 l53Var, tm1 tm1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = l53Var;
        this.P = tm1Var;
    }
}
