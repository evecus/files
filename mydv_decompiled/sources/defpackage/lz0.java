package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lz0 extends k05 implements hn1 {
    public LinkedHashMap I;
    public boolean J;
    public final /* synthetic */ LinkedHashMap K;
    public final /* synthetic */ n11 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(LinkedHashMap linkedHashMap, n11 n11Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = linkedHashMap;
        this.L = n11Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new lz0(this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((lz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:13:0x0095, B:15:0x009c, B:18:0x00a9, B:20:0x00af, B:21:0x00c7, B:23:0x00cd, B:25:0x00dd, B:26:0x00fe, B:28:0x00ff, B:32:0x0106, B:33:0x0120, B:34:0x00a7), top: B:12:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:13:0x0095, B:15:0x009c, B:18:0x00a9, B:20:0x00af, B:21:0x00c7, B:23:0x00cd, B:25:0x00dd, B:26:0x00fe, B:28:0x00ff, B:32:0x0106, B:33:0x0120, B:34:0x00a7), top: B:12:0x0095 }] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
