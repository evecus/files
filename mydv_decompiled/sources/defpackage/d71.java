package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d71 {
    public final a1 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public d71(oj ojVar, long j) {
        String str = ojVar.J;
        a1 a1Var = new a1();
        a1Var.e = str;
        a1Var.c = -1;
        a1Var.d = -1;
        this.a = a1Var;
        this.b = d65.f(j);
        this.c = d65.e(j);
        this.d = -1;
        this.e = -1;
        int f = d65.f(j);
        int e = d65.e(j);
        if (f < 0 || f > str.length()) {
            zy.o(r7.x(f, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (e < 0 || e > str.length()) {
            zy.o(r7.x(e, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (f <= e) {
            return;
        }
        s83.t(r7.x(f, e, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long c = ui4.c(i, i2);
        this.a.p(i, i2, "");
        long z0 = e41.z0(ui4.c(this.b, this.c), c);
        h(d65.f(z0));
        g(d65.e(z0));
        int i3 = this.d;
        if (i3 != -1) {
            long z02 = e41.z0(ui4.c(i3, this.e), c);
            if (d65.c(z02)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = d65.f(z02);
                this.e = d65.e(z02);
            }
        }
    }

    public final char b(int i) {
        a1 a1Var = this.a;
        h60 h60Var = (h60) a1Var.b;
        if (h60Var == null) {
            return ((String) a1Var.e).charAt(i);
        }
        if (i < a1Var.c) {
            return ((String) a1Var.e).charAt(i);
        }
        int c = h60Var.b - h60Var.c();
        int i2 = a1Var.c;
        if (i >= c + i2) {
            return ((String) a1Var.e).charAt(i - ((c - a1Var.d) + i2));
        }
        int i3 = i - i2;
        int i4 = h60Var.c;
        char[] cArr = (char[]) h60Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + h60Var.d];
    }

    public final d65 c() {
        int i = this.d;
        if (i != -1) {
            return new d65(ui4.c(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        a1 a1Var = this.a;
        if (i < 0 || i > a1Var.d()) {
            zy.o(r7.x(i, a1Var.d(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > a1Var.d()) {
            zy.o(r7.x(i2, a1Var.d(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            s83.t(r7.x(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        a1Var.p(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        a1 a1Var = this.a;
        if (i < 0 || i > a1Var.d()) {
            zy.o(r7.x(i, a1Var.d(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > a1Var.d()) {
            zy.o(r7.x(i2, a1Var.d(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            s83.t(r7.x(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        a1 a1Var = this.a;
        if (i < 0 || i > a1Var.d()) {
            zy.o(r7.x(i, a1Var.d(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > a1Var.d()) {
            zy.o(r7.x(i2, a1Var.d(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            s83.t(r7.x(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            r02.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            r02.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
