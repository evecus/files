package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ky extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(boolean z, t43 t43Var, t43 t43Var2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = z;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new ky((ly) this.K, (ls) obj2, fj0Var, (byte) 0);
            case 1:
                ky kyVar = new ky((p40) obj2, fj0Var, (byte) 1);
                kyVar.K = obj;
                return kyVar;
            case 2:
                return new ky(this.J, (s33) this.K, (t43) obj2, fj0Var, (byte) 2);
            case 3:
                return new ky((Context) this.K, (t43) obj2, fj0Var, (byte) 3);
            case 4:
                return new ky((yd1) this.K, (String) obj2, fj0Var, (byte) 4);
            case 5:
                return new ky((String) this.K, (rm1) obj2, fj0Var, (byte) 5);
            case 6:
                return new ky((dw4) this.K, (a23) obj2, fj0Var, (byte) 6);
            case 7:
                ky kyVar2 = new ky((ue) obj2, fj0Var, (byte) 7);
                kyVar2.K = obj;
                return kyVar2;
            case 8:
                return new ky(this.J, (t43) this.K, (t43) obj2, fj0Var, (byte) 8);
            default:
                return new ky((Recomposer) this.K, (View) obj2, fj0Var, (byte) 9);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((ky) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 3:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 6:
                ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0.I;
            case 7:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 8:
                ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            default:
                return ((ky) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b2, code lost:
    
        if (r13 == r3) goto L101;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
    }
}
