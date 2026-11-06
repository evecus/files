package defpackage;

import androidx.media3.common.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sr4 {
    public final tr4 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final a32 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public sr4(tr4 tr4Var) {
        this.a = tr4Var;
        this.b = tr4Var.I;
        int i = tr4Var.J;
        this.c = i;
        this.d = tr4Var.K;
        this.e = tr4Var.L;
        this.h = i;
        this.i = -1;
        this.j = new a32();
    }

    public final bo1 a(int i) {
        ArrayList arrayList = this.a.Q;
        int c = vr4.c(arrayList, i, this.c);
        if (c >= 0) {
            return (bo1) arrayList.get(c);
        }
        bo1 bo1Var = new bo1(i);
        arrayList.add(-(c + 1), bo1Var);
        return bo1Var;
    }

    public final Object b(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return de0.a;
    }

    public final void c() {
        this.f = true;
        if (this.a.M <= 0) {
            ke0.a("Unexpected reader close()");
        }
        r0.M--;
        this.d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.b[(i * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (this.g != this.h) {
                ke0.a("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int c = this.j.c();
            if (c < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = c;
                this.m = i2 >= i3 + (-1) ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.g;
        if (i < this.h) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int g() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object h(int i, int i2) {
        int[] iArr = this.b;
        int d = vr4.d(i, iArr);
        int i3 = i + 1;
        int i4 = d + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : de0.a;
    }

    public final int i(int i) {
        return this.b[i * 5];
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean k(int i) {
        return (this.b[(i * 5) + 1] & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
    }

    public final boolean l(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return de0.a;
        }
        this.n = true;
        Object[] objArr = this.d;
        this.l = i + 1;
        return objArr[i];
    }

    public final Object n(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.d[iArr[i2 + 4]] : de0.a;
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int q(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (this.k != 0) {
            ke0.a("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.i) {
            this.i = i3;
            if (i3 < 0) {
                this.h = i2;
            } else {
                this.h = iArr[(i3 * 5) + 3] + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (this.k != 0) {
            ke0.a("Cannot skip while in an empty region");
        }
        int i = this.g;
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.g = iArr[i2 + 3] + i;
        return i4;
    }

    public final void t() {
        if (!(this.k == 0)) {
            ke0.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        int i = this.g;
        int g = g();
        int i2 = this.i;
        int i3 = this.h;
        StringBuilder D = hf1.D("SlotReader(current=", i, ", key=", g, ", parent=");
        D.append(i2);
        D.append(", end=");
        D.append(i3);
        D.append(")");
        return D.toString();
    }

    public final void u() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 * 5;
            int[] iArr = this.b;
            if (iArr[i3 + 2] != i) {
                jr3.a("Invalid slot table detected");
            }
            int i4 = this.l;
            int i5 = this.m;
            a32 a32Var = this.j;
            if (i4 == 0 && i5 == 0) {
                a32Var.d(-1);
            } else {
                a32Var.d(i4);
            }
            this.i = i2;
            this.h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.g = i6;
            this.l = vr4.d(i2, iArr);
            this.m = i2 >= this.c + (-1) ? this.e : iArr[(i6 * 5) + 4];
        }
    }
}
