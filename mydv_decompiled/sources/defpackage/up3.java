package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class up3 {
    public final wa2 a;
    public final ht1 b;
    public final ep c = new ep((byte) 15);
    public final kt1 d = new kt1();
    public boolean e;

    public up3(wa2 wa2Var) {
        this.a = wa2Var;
        this.b = new ht1(wa2Var.n0.c);
    }

    public final int a(g12 g12Var, AndroidComposeView androidComposeView, boolean z) {
        boolean z2;
        ht1 ht1Var;
        boolean z3;
        kt1 kt1Var = this.d;
        if (this.e) {
            return il2.b(false, false, false);
        }
        boolean z4 = true;
        try {
            this.e = true;
            s32 B = this.c.B(g12Var, androidComposeView);
            bs2 bs2Var = B.a;
            int i = bs2Var.i();
            for (int i2 = 0; i2 < i; i2++) {
                rp3 rp3Var = (rp3) bs2Var.j(i2);
                if (!rp3Var.f() && !rp3Var.i()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int i3 = bs2Var.i();
            int i4 = 0;
            while (true) {
                ht1Var = this.b;
                if (i4 >= i3) {
                    break;
                }
                rp3 rp3Var2 = (rp3) bs2Var.j(i4);
                if (z2 || dq2.m(rp3Var2)) {
                    this.a.B(rp3Var2.e(), kt1Var, rp3Var2.j(), true);
                    if (!kt1Var.I.i()) {
                        ht1Var.a(rp3Var2.d(), kt1Var, dq2.m(rp3Var2));
                        kt1Var.clear();
                    }
                }
                i4++;
            }
            boolean b = ht1Var.b(B, z);
            if (!B.c) {
                int i5 = bs2Var.i();
                for (int i6 = 0; i6 < i5; i6++) {
                    rp3 rp3Var3 = (rp3) bs2Var.j(i6);
                    if (dq2.u0(rp3Var3) && rp3Var3.l()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            int i7 = bs2Var.i();
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    z4 = false;
                    break;
                }
                if (((rp3) bs2Var.j(i8)).l()) {
                    break;
                }
                i8++;
            }
            int b2 = il2.b(b, z3, z4);
            this.e = false;
            return b2;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}
