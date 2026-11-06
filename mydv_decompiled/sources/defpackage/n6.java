package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n6 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(boolean z, hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 13;
        this.J = z;
        this.K = hu2Var;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 0);
            case 1:
                n6 n6Var = new n6(this.L, obj3, obj2, fj0Var, (byte) 1);
                n6Var.K = obj;
                return n6Var;
            case 2:
                n6 n6Var2 = new n6(obj3, (Context) this.K, obj2, fj0Var, (byte) 2);
                n6Var2.L = obj;
                return n6Var2;
            case 3:
                n6 n6Var3 = new n6(obj3, (Context) this.K, obj2, fj0Var, (byte) 3);
                n6Var3.L = obj;
                return n6Var3;
            case 4:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 4);
            case 5:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 5);
            case 6:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 6);
            case 7:
                n6 n6Var4 = new n6((r24) obj3, (g31) obj2, fj0Var);
                n6Var4.L = obj;
                return n6Var4;
            case 8:
                n6 n6Var5 = new n6(this.L, obj3, obj2, fj0Var, (byte) 8);
                n6Var5.K = obj;
                return n6Var5;
            case 9:
                n6 n6Var6 = new n6(this.L, obj3, obj2, fj0Var, (byte) 9);
                n6Var6.K = obj;
                return n6Var6;
            case 10:
                n6 n6Var7 = new n6((byte) 10, fj0Var, this.K, obj3, obj2, false);
                n6Var7.L = obj;
                return n6Var7;
            case 11:
                return new n6((String) this.L, (jj3) this.K, (t43) obj3, (t43) obj2, fj0Var, (byte) 11, false);
            case 12:
                n6 n6Var8 = new n6(this.L, obj3, obj2, fj0Var, (byte) 12);
                n6Var8.K = obj;
                return n6Var8;
            case 13:
                return new n6(this.J, (hu2) this.K, (t43) this.L, (t43) obj3, (t43) obj2, fj0Var);
            case 14:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 14);
            case 15:
                n6 n6Var9 = new n6(this.L, obj3, obj2, fj0Var, (byte) 15);
                n6Var9.K = obj;
                return n6Var9;
            case 16:
                return new n6((vo) this.L, (Context) this.K, (Throwable) obj3, (a85) obj2, fj0Var, (byte) 16, false);
            case 17:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 17);
            case 18:
                return new n6((byte) 18, fj0Var, this.K, obj3, obj2, false);
            case 19:
                return new n6(this.K, this.L, obj3, obj2, fj0Var, (byte) 19);
            default:
                n6 n6Var10 = new n6(this.L, obj3, obj2, fj0Var, (byte) 20);
                n6Var10.K = obj;
                return n6Var10;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                ((n6) create((fe) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0.I;
            case 2:
                return ((n6) create((au3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((n6) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 6:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 7:
                return ((n6) create((tm1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 8:
                return ((n6) create((pr4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 9:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 10:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 11:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 12:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 13:
                ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 14:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 15:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 16:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 17:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 18:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 19:
                return ((n6) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((n6) create((zf1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [fj0] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:233:0x047c -> B:217:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x0481 -> B:218:0x0484). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(r24 r24Var, g31 g31Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 7;
        this.M = r24Var;
        this.N = g31Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Context context, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.M = obj;
        this.K = context;
        this.N = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.N = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b, boolean z) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.K = obj2;
        this.M = obj3;
        this.N = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6(byte b, fj0 fj0Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.M = obj2;
        this.N = obj3;
    }
}
