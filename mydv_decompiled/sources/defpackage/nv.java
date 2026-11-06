package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nv extends eu {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv(pg0 pg0Var, byte b) {
        super(pg0Var);
        this.b = b;
    }

    @Override // defpackage.og0
    public final boolean c(ky5 ky5Var) {
        byte b = this.b;
        ky5Var.getClass();
        switch (b) {
            case 0:
                return ky5Var.j.c;
            case 1:
                return ky5Var.j.e;
            case 2:
                return ky5Var.j.a == x93.J;
            case 3:
                x93 x93Var = ky5Var.j.a;
                if (x93Var != x93.K) {
                    return Build.VERSION.SDK_INT >= 30 && x93Var == x93.N;
                }
                return true;
            default:
                return ky5Var.j.f;
        }
    }

    @Override // defpackage.eu
    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.eu
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                t93 t93Var = (t93) obj;
                t93Var.getClass();
                int i = Build.VERSION.SDK_INT;
                boolean z = t93Var.a;
                if (i >= 26) {
                    if (z && t93Var.b) {
                        return false;
                    }
                } else if (z) {
                    return false;
                }
                return true;
            case 3:
                t93 t93Var2 = (t93) obj;
                t93Var2.getClass();
                return !t93Var2.a || t93Var2.c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
