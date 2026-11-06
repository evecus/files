package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nz0 extends k05 implements hn1 {
    public LinkedHashMap I;
    public LinkedHashMap J;
    public String K;
    public boolean L;
    public final /* synthetic */ Map M;
    public final /* synthetic */ Map N;
    public final /* synthetic */ n11 O;
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(Map map, Map map2, n11 n11Var, String str, String str2, String str3, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = map;
        this.N = map2;
        this.O = n11Var;
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new nz0(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((nz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a A[LOOP:0: B:10:0x0094->B:12:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:32:0x0151, B:34:0x015a, B:37:0x0166, B:42:0x0170, B:43:0x0198), top: B:31:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170 A[Catch: all -> 0x0161, TRY_ENTER, TryCatch #0 {all -> 0x0161, blocks: (B:32:0x0151, B:34:0x015a, B:37:0x0166, B:42:0x0170, B:43:0x0198), top: B:31:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
