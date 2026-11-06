package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vj2 {
    public sg3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public vj2() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        sg3 sg3Var = this.a;
        this.c = z ? sg3Var.g() : sg3Var.k();
    }

    public final void b(int i, View view) {
        sg3 sg3Var = this.a;
        int l = Integer.MIN_VALUE == sg3Var.b ? 0 : sg3Var.l() - sg3Var.b;
        if (l >= 0) {
            boolean z = this.d;
            sg3 sg3Var2 = this.a;
            if (z) {
                int b = sg3Var2.b(view);
                sg3 sg3Var3 = this.a;
                this.c = (Integer.MIN_VALUE != sg3Var3.b ? sg3Var3.l() - sg3Var3.b : 0) + b;
            } else {
                this.c = sg3Var2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        sg3 sg3Var4 = this.a;
        if (!z2) {
            int e = sg3Var4.e(view);
            int k = e - this.a.k();
            this.c = e;
            if (k > 0) {
                int g = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(k, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (sg3Var4.g() - l) - this.a.b(view);
        this.c = this.a.g() - g2;
        if (g2 > 0) {
            int c = this.c - this.a.c(view);
            int k2 = this.a.k();
            int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
