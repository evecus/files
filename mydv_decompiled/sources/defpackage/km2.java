package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class km2 implements PointerInputEventHandler {
    public static final km2 J = new km2(0);
    public static final km2 K = new km2(1);
    public static final km2 L = new km2(2);
    public static final km2 M = new km2(3);
    public static final km2 N = new km2(4);
    public static final km2 O = new km2(5);
    public static final km2 P = new km2(6);
    public static final km2 Q = new km2(7);
    public static final km2 R = new km2(8);
    public final /* synthetic */ byte I;

    public /* synthetic */ km2(byte b) {
        this.I = b;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        byte b = this.I;
        fj0 fj0Var2 = null;
        byte b2 = 2;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                Object d = z15.d(xp3Var, null, null, null, new c22((byte) 20), fj0Var, 7);
                return d == el0Var ? d : wd5Var;
            case 1:
                Object d2 = z15.d(xp3Var, null, null, null, new c22((byte) 21), fj0Var, 7);
                return d2 == el0Var ? d2 : wd5Var;
            case 2:
                Object d3 = z15.d(xp3Var, null, null, null, new do2(b2), fj0Var, 7);
                return d3 == el0Var ? d3 : wd5Var;
            case 3:
                Object j0 = ((r05) xp3Var).j0(new cp2(b2, fj0Var2, (byte) 0), fj0Var);
                return j0 == el0Var ? j0 : wd5Var;
            case 4:
                Object d4 = z15.d(xp3Var, null, null, null, new do2((byte) 25), fj0Var, 7);
                return d4 == el0Var ? d4 : wd5Var;
            case 5:
                return wd5Var;
            case 6:
                Object j02 = ((r05) xp3Var).j0(new cp2(b2, fj0Var2, (byte) 1), fj0Var);
                return j02 == el0Var ? j02 : wd5Var;
            case 7:
                Object d5 = z15.d(xp3Var, null, null, null, new m45((byte) 16), fj0Var, 7);
                return d5 == el0Var ? d5 : wd5Var;
            default:
                Object j03 = ((r05) xp3Var).j0(new cp2(b2, fj0Var2, b2), fj0Var);
                return j03 == el0Var ? j03 : wd5Var;
        }
    }
}
