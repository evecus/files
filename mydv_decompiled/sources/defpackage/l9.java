package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l9 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public byte J;
    public final /* synthetic */ Object K;
    public Object L;
    public Object M;
    public Object N;
    public /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(bh bhVar, ku4 ku4Var, List list, s33 s33Var, fk3 fk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = bhVar;
        this.L = ku4Var;
        this.M = list;
        this.N = s33Var;
        this.O = fk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                return new l9((String) this.N, (Context) this.O, (bh) obj2, (t43) this.M, fj0Var);
            case 1:
                return new l9((bh) obj2, (ku4) this.L, (List) this.M, (s33) this.N, (fk3) this.O, fj0Var);
            case 2:
                l9 l9Var = new l9((jd0) this.O, (t43) this.L, (fk3) obj2, (t43) this.M, fj0Var);
                l9Var.N = obj;
                return l9Var;
            default:
                l9 l9Var2 = new l9((rm1) obj2, fj0Var);
                l9Var2.O = obj;
                return l9Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((l9) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((l9) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                return ((l9) create((zf1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                ((l9) create((ag1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0.I;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x004a, B:14:0x008f, B:16:0x007e, B:20:0x0099, B:26:0x0030), top: B:4:0x001a }] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ss4] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [k20] */
    /* JADX WARN: Type inference failed for: r2v27, types: [iz, java.lang.Object, k20] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, k20] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [ep] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [ep, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v6, types: [ep, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0097 -> B:16:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00aa -> B:16:0x007e). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(jd0 jd0Var, t43 t43Var, fk3 fk3Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.O = jd0Var;
        this.L = t43Var;
        this.K = fk3Var;
        this.M = t43Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(rm1 rm1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = rm1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(String str, Context context, bh bhVar, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = str;
        this.O = context;
        this.K = bhVar;
        this.M = t43Var;
    }
}
