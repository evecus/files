package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class pe {
    public static final i51 a = new i51(new u7((byte) 3), (byte) 0);
    public static final i51 b = new i51(new df0((byte) 29), (byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006b  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.yq3 r22, defpackage.rm1 r23, final defpackage.zq3 r24, final defpackage.tc0 r25, defpackage.fe0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe.a(yq3, rm1, zq3, tc0, fe0, int, int):void");
    }

    public static final void b(vv vvVar, rm1 rm1Var, zq3 zq3Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(71005054);
        int i2 = i | 48;
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean e = go1Var.e(zq3Var.f) | go1Var.g(null);
            Object Q = go1Var.Q();
            if (e || Q == de0.a) {
                Q = new f9(vvVar);
                go1Var.o0(Q);
            }
            a((f9) Q, rm1Var, zq3Var, tc0Var, go1Var, 3504, 0);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new so2(vvVar, rm1Var, zq3Var, tc0Var, i, (byte) 2);
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
