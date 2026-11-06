package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ge0 {
    public final go1 a;
    public h20 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final a32 d = new a32();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public ge0(go1 go1Var, h20 h20Var) {
        this.a = go1Var;
        this.b = h20Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            lg3 lg3Var = this.b.g;
            lg3Var.i0(hg3.c);
            lg3Var.f[lg3Var.g - lg3Var.d[lg3Var.e - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        h20 h20Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        h20Var.getClass();
        if (size != 0) {
            lg3 lg3Var2 = h20Var.g;
            lg3Var2.i0(if3.c);
            rt0.G(lg3Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                lg3 lg3Var = this.b.g;
                lg3Var.i0(xf3.c);
                int i3 = lg3Var.g - lg3Var.d[lg3Var.e - 1].a;
                int[] iArr = lg3Var.f;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                lg3 lg3Var2 = this.b.g;
                lg3Var2.i0(tf3.c);
                int i6 = lg3Var2.g - lg3Var2.d[lg3Var2.e - 1].a;
                int[] iArr2 = lg3Var2.f;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        sr4 sr4Var = this.a.G;
        int i = z ? sr4Var.i : sr4Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            ke0.a("Tried to seek backward");
        }
        if (i2 > 0) {
            lg3 lg3Var = this.b.g;
            lg3Var.i0(bf3.c);
            lg3Var.f[lg3Var.g - lg3Var.d[lg3Var.e - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ke0.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
