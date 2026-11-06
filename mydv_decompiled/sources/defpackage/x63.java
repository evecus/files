package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class x63 implements ti2 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ x63(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        byte b = this.I;
        int i = 0;
        Object obj = this.J;
        switch (b) {
            case 0:
                a73 a73Var = (a73) obj;
                a73Var.r = ji2Var.a();
                if (a73Var.c != null) {
                    ArrayList s1 = o70.s1(a73Var.f);
                    int size = s1.size();
                    while (i < size) {
                        Object obj2 = s1.get(i);
                        i++;
                        p63 p63Var = (p63) obj2;
                        p63Var.getClass();
                        r63 r63Var = p63Var.P;
                        r63Var.getClass();
                        r63Var.a.L = ji2Var.a();
                        r63Var.d = ji2Var.a();
                        r63Var.b();
                    }
                    break;
                }
                break;
            default:
                v94 v94Var = (v94) obj;
                if (ji2Var != ji2.ON_START) {
                    if (ji2Var == ji2.ON_STOP) {
                        v94Var.h = false;
                        break;
                    }
                } else {
                    v94Var.h = true;
                    break;
                }
                break;
        }
    }
}
