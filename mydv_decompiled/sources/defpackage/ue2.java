package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ue2 extends f54 implements hn1 {
    public final /* synthetic */ byte J;
    public byte K;
    public /* synthetic */ Object L;
    public Object M;
    public Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(yv yvVar, zp4 zp4Var, s35 s35Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = (byte) 1;
        this.M = yvVar;
        this.N = zp4Var;
        this.O = s35Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.O;
        switch (b) {
            case 0:
                ue2 ue2Var = new ue2((is0) obj2, fj0Var, (byte) 0);
                ue2Var.L = obj;
                return ue2Var;
            case 1:
                ue2 ue2Var2 = new ue2((yv) this.M, (zp4) this.N, (s35) obj2, fj0Var);
                ue2Var2.L = obj;
                return ue2Var2;
            default:
                ue2 ue2Var3 = new ue2((iy4) obj2, fj0Var, (byte) 2);
                ue2Var3.L = obj;
                return ue2Var3;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        q05 q05Var = (q05) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ue2) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d6, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x00d6 -> B:29:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x03e6 -> B:193:0x03e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0263 -> B:9:0x0266). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue2(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.J = b;
        this.O = obj;
    }
}
