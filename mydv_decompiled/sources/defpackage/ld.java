package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ld extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(tm1 tm1Var, dl0 dl0Var, t43 t43Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 12;
        this.M = tm1Var;
        this.L = dl0Var;
        this.N = t43Var;
        this.O = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        switch (b) {
            case 0:
                ld ldVar = new ld((fe) this.L, (tm1) obj4, (md) obj3, (hh2) obj2, fj0Var, (byte) 0);
                ldVar.K = obj;
                return ldVar;
            case 1:
                return new ld((so3) this.K, (t43) this.L, (t43) obj4, (hk3) obj3, (hk3) obj2, fj0Var, (byte) 1);
            case 2:
                return new ld((ag2) this.K, (t43) this.L, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 2);
            case 3:
                return new ld((oh2) this.K, (t43) this.L, (j55) obj4, (u45) obj3, (mx1) obj2, fj0Var, (byte) 3);
            case 4:
                return new ld((fy) this.K, (d55) this.L, (oh2) obj4, (v55) obj3, (td3) obj2, fj0Var, (byte) 4);
            case 5:
                ld ldVar2 = new ld((li2) this.L, (ki2) obj4, (tk0) obj3, (zf1) obj2, fj0Var, (byte) 5);
                ldVar2.K = obj;
                return ldVar2;
            case 6:
                return new ld((hu2) this.K, (t43) this.L, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 6);
            case 7:
                return new ld((ez3) this.K, (hu2) this.L, (fl4) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 7);
            case 8:
                ld ldVar3 = new ld((xp3) this.L, (h45) obj4, (gm4) obj3, (ts3) obj2, fj0Var, (byte) 8);
                ldVar3.K = obj;
                return ldVar3;
            case 9:
                ld ldVar4 = new ld((hn1) this.L, (hn3) obj4, (dl0) obj3, (AtomicReference) obj2, fj0Var, (byte) 9);
                ldVar4.K = obj;
                return ldVar4;
            case 10:
                ld ldVar5 = new ld((k95) obj4, (oc4) obj3, (r24) obj2, fj0Var);
                ldVar5.K = obj;
                return ldVar5;
            case 11:
                return new ld((t43) this.K, (t43) this.L, (hk3) obj4, (hk3) obj3, (t43) obj2, fj0Var, (byte) 11);
            default:
                ld ldVar6 = new ld((tm1) obj4, (dl0) this.L, (t43) obj3, (ki1) obj2, fj0Var);
                ldVar6.K = obj;
                return ldVar6;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0Var;
            case 1:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                return ((ld) create((au3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 6:
                ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0Var;
            case 7:
                ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0Var;
            case 8:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 9:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 10:
                return ((ld) create((mc4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 11:
                return ((ld) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((ld) create((zf1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fc -> B:27:0x00fe). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(k95 k95Var, oc4 oc4Var, r24 r24Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 10;
        this.M = k95Var;
        this.N = oc4Var;
        this.O = r24Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(Object obj, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = obj3;
        this.O = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.N = obj4;
        this.O = obj5;
    }
}
