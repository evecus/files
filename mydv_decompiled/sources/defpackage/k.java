package defpackage;

import android.content.Context;
import com.github.mytv.dv.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 18;
        this.J = str;
        this.K = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                return new k((s) this.K, (String) obj2, fj0Var, (byte) 0);
            case 1:
                return new k((hu2) this.K, (String) obj2, fj0Var, (byte) 1);
            case 2:
                return new k((s33) this.K, (t43) obj2, fj0Var, (byte) 2);
            case 3:
                return new k((f50) this.K, (String) obj2, fj0Var, (byte) 3);
            case 4:
                return new k((List) this.K, (t43) obj2, fj0Var, (byte) 4);
            case 5:
                k kVar = new k(obj2, fj0Var, (byte) 5);
                kVar.K = obj;
                return kVar;
            case 6:
                k kVar2 = new k(obj2, fj0Var, (byte) 6);
                kVar2.K = obj;
                return kVar2;
            case 7:
                k kVar3 = new k(obj2, fj0Var, (byte) 7);
                kVar3.K = obj;
                return kVar3;
            case 8:
                k kVar4 = new k(obj2, fj0Var, (byte) 8);
                kVar4.K = obj;
                return kVar4;
            case 9:
                return new k((op2) this.K, (String) obj2, fj0Var, (byte) 9);
            case 10:
                return new k((MainActivity) this.K, (t43) obj2, fj0Var, (byte) 10);
            case 11:
                return new k((MainActivity) this.K, (cw4) obj2, fj0Var, (byte) 11);
            case 12:
                return new k((MainActivity) this.K, (hu2) obj2, fj0Var, (byte) 12);
            case 13:
                k kVar5 = new k(obj2, fj0Var, (byte) 13);
                kVar5.K = obj;
                return kVar5;
            case 14:
                k kVar6 = new k(obj2, fj0Var, (byte) 14);
                kVar6.K = obj;
                return kVar6;
            case 15:
                k kVar7 = new k(obj2, fj0Var, (byte) 15);
                kVar7.K = obj;
                return kVar7;
            case 16:
                return new k((dg0) this.K, (t43) obj2, fj0Var, (byte) 16);
            case 17:
                k kVar8 = new k(obj2, fj0Var, (byte) 17);
                kVar8.K = obj;
                return kVar8;
            case 18:
                return new k((String) obj2, (t43) this.K, fj0Var);
            case 19:
                k kVar9 = new k(obj2, fj0Var, (byte) 19);
                kVar9.K = obj;
                return kVar9;
            case 20:
                return new k((Context) this.K, (String) obj2, fj0Var, (byte) 20);
            default:
                return new k((Context) this.K, (r24) obj2, fj0Var, (byte) 21);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                break;
            case 1:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 10:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 11:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 12:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 13:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 14:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 15:
                break;
            case 16:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 17:
                break;
            case 18:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            case 19:
                break;
            case 20:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
            default:
                ((k) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0208, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
    }
}
