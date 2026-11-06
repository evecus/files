package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dq1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dq1(Object obj, Object obj2, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.K = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                return new dq1((gq1) this.L, (Context) obj2, this.K, fj0Var, (byte) 0);
            case 1:
                dq1 dq1Var = new dq1((ag2) obj2, this.K, fj0Var);
                dq1Var.L = obj;
                return dq1Var;
            case 2:
                return new dq1((gx3) this.L, (String) obj2, this.K, fj0Var, (byte) 2);
            default:
                return new dq1((hu2) this.L, (List) obj2, this.K, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((dq1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(ag2 ag2Var, int i, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 1;
        this.M = ag2Var;
        this.K = i;
    }
}
