package defpackage;

import com.github.mytv.dv.model.Author;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dx3 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ gx3 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ Author M;
    public final /* synthetic */ long N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ n24 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx3(gx3 gx3Var, String str, Author author, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.K = gx3Var;
        this.L = str;
        this.M = author;
        this.N = j;
        this.O = i;
        this.P = i2;
        this.Q = z;
        this.R = n24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new dx3(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, fj0Var, (byte) 0);
            default:
                return new dx3(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((dx3) create(fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Type inference failed for: r0v28, types: [kq5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kq5] */
    /* JADX WARN: Type inference failed for: r3v15, types: [long] */
    /* JADX WARN: Type inference failed for: r3v5, types: [long] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
