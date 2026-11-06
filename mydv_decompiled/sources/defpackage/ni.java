package defpackage;

import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ni extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(boolean z, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 11;
        this.J = z;
        this.M = t43Var;
        this.K = t43Var2;
        this.L = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                ni niVar = new ni((ea5) this.L, (t43) obj2, fj0Var, (byte) 0);
                niVar.K = obj;
                return niVar;
            case 1:
                return new ni(this.K, this.L, obj2, fj0Var, (byte) 1);
            case 2:
                ni niVar2 = new ni((ag1) this.L, (p40) obj2, fj0Var, (byte) 2);
                niVar2.K = obj;
                return niVar2;
            case 3:
                return new ni(this.K, this.L, obj2, fj0Var, (byte) 3);
            case 4:
                return new ni((iz) obj2, fj0Var, (byte) 4);
            case 5:
                return new ni(this.K, this.L, obj2, fj0Var, (byte) 5);
            case 6:
                return new ni(this.K, this.L, obj2, fj0Var, (byte) 6);
            case 7:
                ni niVar3 = new ni((in1) this.L, (s13) obj2, fj0Var, (byte) 7);
                niVar3.K = obj;
                return niVar3;
            case 8:
                return new ni((jh4) obj2, fj0Var, (byte) 8);
            case 9:
                ni niVar4 = new ni((String) this.L, (OkHttpClient) obj2, fj0Var, (byte) 9);
                niVar4.K = obj;
                return niVar4;
            case 10:
                return new ni(this.K, this.L, obj2, fj0Var, (byte) 10);
            default:
                return new ni(this.J, (t43) obj2, (t43) this.K, (t43) this.L, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((ni) create((au3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 6:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 7:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 8:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 9:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 10:
                return ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                ((ni) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025d A[Catch: all -> 0x0231, TryCatch #1 {all -> 0x0231, blocks: (B:127:0x022d, B:128:0x0255, B:130:0x025d, B:131:0x026a, B:138:0x027a, B:140:0x0247, B:144:0x027d, B:148:0x0282, B:149:0x0283, B:156:0x0241, B:133:0x026b, B:135:0x0271), top: B:123:0x0221, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0284  */
    /* JADX WARN: Type inference failed for: r5v13, types: [k20] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0251 -> B:114:0x0255). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.M = obj;
    }
}
