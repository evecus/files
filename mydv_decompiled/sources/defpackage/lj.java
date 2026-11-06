package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lj {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ lj(kj kjVar, int i, int i2, int i3) {
        this((i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent", i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, kjVar);
    }

    public final nj a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            r02.c("Item.end should be set first");
        }
        return new nj(this.d, this.b, i, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj)) {
            return false;
        }
        lj ljVar = (lj) obj;
        return j42.c(this.a, ljVar.a) && this.b == ljVar.b && this.c == ljVar.c && j42.c(this.d, ljVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public lj(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
