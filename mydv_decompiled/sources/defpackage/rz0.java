package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rz0 extends k05 implements hn1 {
    public LinkedHashMap I;
    public Serializable J;
    public String K;
    public String L;
    public byte M;
    public final /* synthetic */ Map N;
    public final /* synthetic */ Map O;
    public final /* synthetic */ n11 P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public final /* synthetic */ boolean T;
    public final /* synthetic */ d32 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(Map map, Map map2, n11 n11Var, String str, String str2, String str3, boolean z, d32 d32Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = map;
        this.O = map2;
        this.P = n11Var;
        this.Q = str;
        this.R = str2;
        this.S = str3;
        this.T = z;
        this.U = d32Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new rz0(this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((rz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0199 A[Catch: all -> 0x01a6, TryCatch #1 {all -> 0x01a6, blocks: (B:28:0x0191, B:30:0x0199, B:34:0x01a2, B:35:0x01a9, B:37:0x01b2, B:39:0x01ba, B:41:0x01c0, B:45:0x01ca, B:46:0x01f2), top: B:27:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:28:0x0191, B:30:0x0199, B:34:0x01a2, B:35:0x01a9, B:37:0x01b2, B:39:0x01ba, B:41:0x01c0, B:45:0x01ca, B:46:0x01f2), top: B:27:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:28:0x0191, B:30:0x0199, B:34:0x01a2, B:35:0x01a9, B:37:0x01b2, B:39:0x01ba, B:41:0x01c0, B:45:0x01ca, B:46:0x01f2), top: B:27:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00db A[LOOP:0: B:7:0x00d5->B:9:0x00db, LOOP_END] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
