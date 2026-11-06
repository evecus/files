package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Comment;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tg0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public Object L;
    public Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg0(kq5 kq5Var, Aweme aweme, Object obj, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = kq5Var;
        this.M = aweme;
        this.K = obj;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        switch (b) {
            case 0:
                tg0 tg0Var = new tg0((ol2) obj4, (d63) obj3, (ky5) obj2, fj0Var);
                tg0Var.K = obj;
                return tg0Var;
            case 1:
                tg0 tg0Var2 = new tg0((t43) this.L, (t43) this.M, (cw4) obj4, (cw4) obj3, (ki1) obj2, fj0Var, (byte) 1);
                tg0Var2.K = obj;
                return tg0Var2;
            case 2:
                return new tg0((li2) this.K, (ki2) obj4, (dl0) obj3, (eg1) obj2, fj0Var);
            case 3:
                tg0 tg0Var3 = new tg0((xp3) this.L, (tm1) this.M, (tm1) obj4, (in1) obj3, (tm1) obj2, fj0Var, (byte) 3);
                tg0Var3.K = obj;
                return tg0Var3;
            case 4:
                tg0 tg0Var4 = new tg0((t43) this.L, (hk3) this.M, (t43) obj4, (hk3) obj3, (t43) obj2, fj0Var, (byte) 4);
                tg0Var4.K = obj;
                return tg0Var4;
            case 5:
                return new tg0((kq5) this.L, (Aweme) this.M, (Comment) this.K, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 5);
            default:
                return new tg0((kq5) this.L, (Aweme) this.M, (t43) this.K, (s33) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 6);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((tg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032c A[Catch: all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:137:0x02f9, B:142:0x0317, B:147:0x032f, B:161:0x0324, B:163:0x0329, B:164:0x032c, B:165:0x030d, B:167:0x0311, B:168:0x0314), top: B:136:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0494  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [v52] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v6, types: [v52] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(ol2 ol2Var, d63 d63Var, ky5 ky5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.N = ol2Var;
        this.O = d63Var;
        this.P = ky5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(li2 li2Var, ki2 ki2Var, dl0 dl0Var, eg1 eg1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.K = li2Var;
        this.N = ki2Var;
        this.O = dl0Var;
        this.P = eg1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = obj3;
        this.O = obj4;
        this.P = obj5;
    }
}
