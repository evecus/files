package defpackage;

import android.content.Context;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f31 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public /* synthetic */ Object K;
    public Object L;
    public Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(ol2 ol2Var, ky5 ky5Var, mx5 mx5Var, Context context, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 6;
        this.L = ol2Var;
        this.M = ky5Var;
        this.K = mx5Var;
        this.N = context;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.io.Serializable] */
    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        switch (b) {
            case 0:
                f31 f31Var = new f31(obj2, fj0Var, (byte) 0);
                f31Var.K = obj;
                return f31Var;
            case 1:
                f31 f31Var2 = new f31((t43) this.M, (g02) obj2, fj0Var);
                f31Var2.K = obj;
                return f31Var2;
            case 2:
                return new f31((o53) this.K, (eg1) obj2, fj0Var);
            case 3:
                f31 f31Var3 = new f31(this.L, (Serializable) this.M, obj2, fj0Var, (byte) 3);
                f31Var3.K = obj;
                return f31Var3;
            case 4:
                f31 f31Var4 = new f31(obj2, fj0Var, (byte) 4);
                f31Var4.K = obj;
                return f31Var4;
            case 5:
                f31 f31Var5 = new f31(this.L, (Serializable) this.M, obj2, fj0Var, (byte) 5);
                f31Var5.K = obj;
                return f31Var5;
            default:
                return new f31((ol2) this.L, (ky5) this.M, (mx5) this.K, (Context) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0Var;
            case 2:
                return ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                ((f31) create((ag1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0Var;
            default:
                return ((f31) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:221|(1:222)|223|224|225|226) */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0417, code lost:
    
        if (r4.n0(r5, r24) != r6) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0441, code lost:
    
        if (r4.u0(r24) == r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0453, code lost:
    
        if (r4.u0(r24) == r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0444, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r3 == r6) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:235:0x0432, B:232:0x0420], limit reached: 270 */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /* JADX WARN: Type inference failed for: r2v37, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x033e -> B:161:0x030a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x035a -> B:161:0x030a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x042d -> B:181:0x03c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x0434 -> B:181:0x03c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x0441 -> B:181:0x03c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x0453 -> B:180:0x03c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0457 -> B:181:0x03c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01dd -> B:76:0x01aa). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f31.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(t43 t43Var, g02 g02Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 1;
        this.M = t43Var;
        this.N = g02Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(o53 o53Var, eg1 eg1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.K = o53Var;
        this.N = eg1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f31(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.N = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f31(Object obj, Serializable serializable, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = serializable;
        this.N = obj2;
    }
}
