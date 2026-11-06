package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rr4 extends f54 implements hn1 {
    public Object J;
    public Iterator K;
    public int L;
    public int M;
    public byte N;
    public /* synthetic */ Object O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ Iterator R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr4(int i, int i2, Iterator it, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = i;
        this.Q = i2;
        this.R = it;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        rr4 rr4Var = new rr4(this.P, this.Q, this.R, fj0Var);
        rr4Var.O = obj;
        return rr4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((rr4) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
