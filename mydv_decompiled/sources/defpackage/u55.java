package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u55 {
    public final t55 a;
    public final w23 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public u55(t55 t55Var, w23 w23Var, long j) {
        this.a = t55Var;
        this.b = w23Var;
        this.c = j;
        ArrayList arrayList = w23Var.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((yj3) arrayList.get(0)).a.d.d(0) + 0.0f;
        ArrayList arrayList2 = w23Var.h;
        if (!arrayList2.isEmpty()) {
            yj3 yj3Var = (yj3) o70.a1(arrayList2);
            f = yj3Var.a.d.d(r4.g - 1) + 0.0f + yj3Var.f;
        }
        this.e = f;
        this.f = w23Var.g;
    }

    public final s44 a(int i) {
        w23 w23Var = this.b;
        w23Var.l(i);
        int length = ((oj) w23Var.a.a).J.length();
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(i == length ? p70.X(arrayList) : dq2.F(i, arrayList));
        return yj3Var.a.d.f.isRtlCharAt(yj3Var.d(i)) ? s44.J : s44.I;
    }

    public final m14 b(int i) {
        float k;
        float k2;
        float j;
        float j2;
        w23 w23Var = this.b;
        w23Var.k(i);
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.F(i, arrayList));
        td tdVar = yj3Var.a;
        int d = yj3Var.d(i);
        CharSequence charSequence = tdVar.e;
        if (d < 0 || d >= charSequence.length()) {
            r02.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + ")");
        }
        s55 s55Var = tdVar.d;
        int g = s55Var.g(d);
        float i2 = s55Var.i(g);
        float e = s55Var.e(g);
        Layout layout = s55Var.f;
        boolean z = layout.getParagraphDirection(g) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                j = s55Var.k(d, false);
                j2 = s55Var.k(d + 1, true);
            } else if (isRtlCharAt) {
                j = s55Var.j(d, false);
                j2 = s55Var.j(d + 1, true);
            } else {
                k = s55Var.k(d, false);
                k2 = s55Var.k(d + 1, true);
            }
            float f = j;
            k = j2;
            k2 = f;
        } else {
            k = s55Var.j(d, false);
            k2 = s55Var.j(d + 1, true);
        }
        RectF rectF = new RectF(k, i2, k2, e);
        return yj3Var.a(new m14(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final m14 c(int i) {
        w23 w23Var = this.b;
        w23Var.l(i);
        int length = ((oj) w23Var.a.a).J.length();
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(i == length ? p70.X(arrayList) : dq2.F(i, arrayList));
        td tdVar = yj3Var.a;
        int d = yj3Var.d(i);
        CharSequence charSequence = tdVar.e;
        s55 s55Var = tdVar.d;
        if (d < 0 || d > charSequence.length()) {
            r02.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float j = s55Var.j(d, false);
        int g = s55Var.g(d);
        return yj3Var.a(new m14(j, s55Var.i(g) + 0.0f, j, s55Var.e(g) + 0.0f));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        w23 w23Var = this.b;
        return f < w23Var.d || w23Var.c || ((float) ((int) (j & 4294967295L))) < w23Var.e;
    }

    public final t55 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u55)) {
            return false;
        }
        u55 u55Var = (u55) obj;
        return j42.c(this.a, u55Var.a) && j42.c(this.b, u55Var.b) && z22.b(this.c, u55Var.c) && this.d == u55Var.d && this.e == u55Var.e && j42.c(this.f, u55Var.f);
    }

    public final float f(int i) {
        w23 w23Var = this.b;
        w23Var.m(i);
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        int i2 = i - yj3Var.d;
        s55 s55Var = tdVar.d;
        return s55Var.f.getLineLeft(i2) + (i2 == s55Var.g + (-1) ? s55Var.j : 0.0f);
    }

    public final float g(int i) {
        w23 w23Var = this.b;
        w23Var.m(i);
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        int i2 = i - yj3Var.d;
        s55 s55Var = tdVar.d;
        return s55Var.f.getLineRight(i2) + (i2 == s55Var.g + (-1) ? s55Var.k : 0.0f);
    }

    public final int h(int i) {
        w23 w23Var = this.b;
        w23Var.m(i);
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        return tdVar.d.f.getLineStart(i - yj3Var.d) + yj3Var.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + jp0.o(this.e, jp0.o(this.d, (i82.Q(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final s44 i(int i) {
        w23 w23Var = this.b;
        w23Var.l(i);
        int length = ((oj) w23Var.a.a).J.length();
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(i == length ? p70.X(arrayList) : dq2.F(i, arrayList));
        td tdVar = yj3Var.a;
        int d = yj3Var.d(i);
        s55 s55Var = tdVar.d;
        return s55Var.f.getParagraphDirection(s55Var.g(d)) == 1 ? s44.I : s44.J;
    }

    public final yd j(int i, int i2) {
        w23 w23Var = this.b;
        zw zwVar = w23Var.a;
        if (i < 0 || i > i2 || i2 > ((oj) zwVar.a).J.length()) {
            int length = ((oj) zwVar.a).J.length();
            StringBuilder D = hf1.D("Start(", i, ") or End(", i2, ") is out of range [0..");
            D.append(length);
            D.append("), or start > end!");
            r02.a(D.toString());
        }
        if (i == i2) {
            return ae.a();
        }
        yd a = ae.a();
        dq2.I(w23Var.h, ui4.c(i, i2), new sz2(a, i, i2, (byte) 2));
        return a;
    }

    public final long k(int i) {
        int n;
        int i2;
        int m;
        w23 w23Var = this.b;
        w23Var.l(i);
        int length = ((oj) w23Var.a.a).J.length();
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(i == length ? p70.X(arrayList) : dq2.F(i, arrayList));
        td tdVar = yj3Var.a;
        int d = yj3Var.d(i);
        a1 l = tdVar.d.l();
        if (l.k(l.n(d))) {
            l.b(d);
            n = d;
            while (n != -1 && (!l.k(n) || l.g(n))) {
                n = l.n(n);
            }
        } else {
            l.b(d);
            n = l.j(d) ? (!l.h(d) || l.f(d)) ? l.n(d) : d : l.f(d) ? l.n(d) : -1;
        }
        if (n == -1) {
            n = d;
        }
        if (l.g(l.m(d))) {
            l.b(d);
            i2 = d;
            while (i2 != -1 && (l.k(i2) || !l.g(i2))) {
                i2 = l.m(i2);
            }
        } else {
            l.b(d);
            if (l.f(d)) {
                if (!l.h(d) || l.j(d)) {
                    m = l.m(d);
                    i2 = m;
                } else {
                    i2 = d;
                }
            } else if (l.j(d)) {
                m = l.m(d);
                i2 = m;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return yj3Var.b(ui4.c(n, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + z22.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }

    public /* synthetic */ u55(t55 t55Var, w23 w23Var, long j, int i) {
        this(t55Var, w23Var, j);
    }
}
