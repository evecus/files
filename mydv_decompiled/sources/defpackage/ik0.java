package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ik0 implements PointerInputEventHandler {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ik0(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                Object o0 = i42.o0(new hk0(xp3Var, (s35) obj2, (u45) obj, null), fj0Var);
                return o0 == el0Var ? o0 : wd5Var;
            case 1:
                Object d = z15.d(xp3Var, null, null, null, new be((tm1) obj2, obj, (byte) 24), fj0Var, 7);
                return d == el0Var ? d : wd5Var;
            case 2:
                Object o02 = i42.o0(new o1(xp3Var, (t33) obj2, (qr4) obj, (fj0) null), fj0Var);
                return o02 == el0Var ? o02 : wd5Var;
            default:
                Object d2 = z15.d(xp3Var, null, null, null, new ap3((tm1) obj2, (Aweme) obj, (byte) 7), fj0Var, 7);
                return d2 == el0Var ? d2 : wd5Var;
        }
    }
}
