package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nj {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public nj(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        r02.a("Reversed range is not supported");
    }

    public static nj d(nj njVar, kj kjVar, int i, int i2) {
        Object obj = kjVar;
        if ((i2 & 1) != 0) {
            obj = njVar.a;
        }
        int i3 = njVar.b;
        if ((i2 & 4) != 0) {
            i = njVar.c;
        }
        return new nj(njVar.d, i3, i, obj);
    }

    public final Object a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return j42.c(this.a, njVar.a) && this.b == njVar.b && this.c == njVar.c && j42.c(this.d, njVar.d);
    }

    public final Object f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public nj(int i, int i2, Object obj) {
        this("", i, i2, obj);
    }
}
