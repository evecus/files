package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mr4 implements tm1 {
    public final /* synthetic */ boolean I;
    public final /* synthetic */ z60 J;
    public final /* synthetic */ byte K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ tm1 M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ float O;

    /* JADX WARN: Multi-variable type inference failed */
    public mr4(boolean z, z60 z60Var, int i, boolean z2, tm1 tm1Var, boolean z3, float f) {
        this.I = z;
        this.J = z60Var;
        this.K = i;
        this.L = z2;
        this.M = tm1Var;
        this.N = z3;
        this.O = f;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((l82) obj).a;
        z60 z60Var = this.J;
        float f = z60Var.b;
        if (!this.I) {
            return Boolean.FALSE;
        }
        int C = e21.C(keyEvent);
        boolean z = this.N;
        if (C != 2) {
            if (C != 1) {
                return Boolean.FALSE;
            }
            if (z) {
                long b = e21.b(keyEvent.getKeyCode());
                return (j82.a(b, j82.d) || j82.a(b, j82.F) || j82.a(b, j82.e) || j82.a(b, j82.G) || j82.a(b, j82.v) || j82.a(b, j82.J) || j82.a(b, j82.w) || j82.a(b, j82.K) || j82.a(b, j82.C) || j82.a(b, j82.L) || j82.a(b, j82.D) || j82.a(b, j82.M)) ? Boolean.TRUE : Boolean.FALSE;
            }
            long b2 = e21.b(keyEvent.getKeyCode());
            return (j82.a(b2, j82.g) || j82.a(b2, j82.I) || j82.a(b2, j82.f) || j82.a(b2, j82.H) || j82.a(b2, j82.v) || j82.a(b2, j82.J) || j82.a(b2, j82.w) || j82.a(b2, j82.K) || j82.a(b2, j82.C) || j82.a(b2, j82.L) || j82.a(b2, j82.D) || j82.a(b2, j82.M)) ? Boolean.TRUE : Boolean.FALSE;
        }
        float f2 = z60Var.a;
        float abs = Math.abs(f - f2);
        byte b3 = this.K;
        float f3 = abs / (b3 > 0 ? b3 + 1 : 100);
        int i = this.L ? -1 : 1;
        boolean a = j82.a(e21.b(keyEvent.getKeyCode()), j82.v);
        tm1 tm1Var = this.M;
        if (a || j82.a(e21.b(keyEvent.getKeyCode()), j82.J)) {
            tm1Var.invoke(Float.valueOf(f2));
            return Boolean.TRUE;
        }
        if (j82.a(e21.b(keyEvent.getKeyCode()), j82.w) || j82.a(e21.b(keyEvent.getKeyCode()), j82.K)) {
            tm1Var.invoke(Float.valueOf(f));
            return Boolean.TRUE;
        }
        float f4 = this.O;
        if (z) {
            long b4 = e21.b(keyEvent.getKeyCode());
            if (j82.a(b4, j82.d) || j82.a(b4, j82.F)) {
                tm1Var.invoke(ut0.u(Float.valueOf(f4 - (i * f3)), z60Var));
                return Boolean.TRUE;
            }
            if (j82.a(b4, j82.e) || j82.a(b4, j82.G)) {
                tm1Var.invoke(ut0.u(Float.valueOf((i * f3) + f4), z60Var));
                return Boolean.TRUE;
            }
            if (j82.a(b4, j82.C) || j82.a(b4, j82.L)) {
                tm1Var.invoke(ut0.u(Float.valueOf(f4 - ((ut0.r(r6 / 10, 1, 10) * i) * f3)), z60Var));
                return Boolean.TRUE;
            }
            if (!j82.a(b4, j82.D) && !j82.a(b4, j82.M)) {
                return Boolean.FALSE;
            }
            tm1Var.invoke(ut0.u(Float.valueOf((ut0.r(r6 / 10, 1, 10) * i * f3) + f4), z60Var));
            return Boolean.TRUE;
        }
        long b5 = e21.b(keyEvent.getKeyCode());
        if (j82.a(b5, j82.g) || j82.a(b5, j82.I)) {
            tm1Var.invoke(ut0.u(Float.valueOf((i * f3) + f4), z60Var));
            return Boolean.TRUE;
        }
        if (j82.a(b5, j82.f) || j82.a(b5, j82.H)) {
            tm1Var.invoke(ut0.u(Float.valueOf(f4 - (i * f3)), z60Var));
            return Boolean.TRUE;
        }
        if (j82.a(b5, j82.C) || j82.a(b5, j82.L)) {
            tm1Var.invoke(ut0.u(Float.valueOf((ut0.r(r6 / 10, 1, 10) * f3) + f4), z60Var));
            return Boolean.TRUE;
        }
        if (!j82.a(b5, j82.D) && !j82.a(b5, j82.M)) {
            return Boolean.FALSE;
        }
        tm1Var.invoke(ut0.u(Float.valueOf(f4 - (ut0.r(r6 / 10, 1, 10) * f3)), z60Var));
        return Boolean.TRUE;
    }
}
