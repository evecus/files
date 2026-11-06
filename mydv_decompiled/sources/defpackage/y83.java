package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y83 extends s43 {
    public final s43 o;
    public boolean p;

    public y83(long j, us4 us4Var, tm1 tm1Var, tm1 tm1Var2, s43 s43Var) {
        super(j, us4Var, tm1Var, tm1Var2);
        this.o = s43Var;
        s43Var.k();
    }

    @Override // defpackage.s43, defpackage.ns4
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.s43
    public final wi4 w() {
        y83 y83Var;
        s43 s43Var = this.o;
        if (s43Var.m || s43Var.c) {
            return new ps4(this);
        }
        o43 o43Var = this.h;
        long j = this.b;
        HashMap n = o43Var != null ? ws4.n(s43Var.g(), this, this.o.d()) : null;
        synchronized (ws4.c) {
            try {
                ws4.w(this);
                if (o43Var == null || o43Var.d == 0) {
                    y83Var = this;
                    y83Var.a();
                } else {
                    y83Var = this;
                    wi4 z = y83Var.z(this.o.g(), o43Var, n, this.o.d());
                    if (!z.equals(qs4.f)) {
                        return z;
                    }
                    o43 x = y83Var.o.x();
                    if (x != null) {
                        x.j(o43Var);
                    } else {
                        y83Var.o.C(o43Var);
                        y83Var.h = null;
                    }
                }
                if (j42.n(y83Var.o.g(), j) < 0) {
                    y83Var.o.v();
                }
                s43 s43Var2 = y83Var.o;
                s43Var2.r(s43Var2.d().d(j).c(y83Var.j));
                y83Var.o.A(j);
                s43 s43Var3 = y83Var.o;
                int i = y83Var.d;
                y83Var.d = -1;
                if (i >= 0) {
                    int[] iArr = s43Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    s43Var3.k = copyOf;
                } else {
                    s43Var3.getClass();
                }
                y83Var.o.B(y83Var.j);
                s43 s43Var4 = y83Var.o;
                int[] iArr2 = y83Var.k;
                s43Var4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = s43Var4.k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                        iArr2 = copyOf2;
                    }
                    s43Var4.k = iArr2;
                }
                y83Var.m = true;
                if (!y83Var.p) {
                    y83Var.p = true;
                    y83Var.o.l();
                }
                return qs4.f;
            } finally {
            }
        }
    }
}
