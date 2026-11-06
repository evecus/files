package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class fu4 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final up0 a(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        iu0 iu0Var = (iu0) go1Var.k(hf0.h);
        boolean d = go1Var.d(iu0Var.getDensity());
        Object Q = go1Var.Q();
        if (d || Q == de0.a) {
            Q = new up0(new ep(iu0Var));
            go1Var.o0(Q);
        }
        return (up0) Q;
    }
}
