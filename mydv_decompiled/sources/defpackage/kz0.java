package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kz0 extends k05 implements hn1 {
    public LinkedHashMap I;
    public Serializable J;
    public String K;
    public LinkedHashMap L;
    public String M;
    public byte N;
    public final /* synthetic */ Map O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ n11 S;
    public final /* synthetic */ String T;
    public final /* synthetic */ String U;
    public final /* synthetic */ boolean V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(Map map, boolean z, String str, String str2, n11 n11Var, String str3, String str4, boolean z2, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = map;
        this.P = z;
        this.Q = str;
        this.R = str2;
        this.S = n11Var;
        this.T = str3;
        this.U = str4;
        this.V = z2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new kz0(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((kz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0185, code lost:
    
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:48:0x01b9, B:50:0x01c3, B:54:0x01cd, B:56:0x01d4, B:58:0x01dd, B:62:0x01e5, B:64:0x01eb, B:69:0x01f5, B:70:0x020f, B:71:0x0210, B:72:0x0235), top: B:47:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dd A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:48:0x01b9, B:50:0x01c3, B:54:0x01cd, B:56:0x01d4, B:58:0x01dd, B:62:0x01e5, B:64:0x01eb, B:69:0x01f5, B:70:0x020f, B:71:0x0210, B:72:0x0235), top: B:47:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #0 {all -> 0x01d1, blocks: (B:48:0x01b9, B:50:0x01c3, B:54:0x01cd, B:56:0x01d4, B:58:0x01dd, B:62:0x01e5, B:64:0x01eb, B:69:0x01f5, B:70:0x020f, B:71:0x0210, B:72:0x0235), top: B:47:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0210 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:48:0x01b9, B:50:0x01c3, B:54:0x01cd, B:56:0x01d4, B:58:0x01dd, B:62:0x01e5, B:64:0x01eb, B:69:0x01f5, B:70:0x020f, B:71:0x0210, B:72:0x0235), top: B:47:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.Map] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
