package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cc3 {
    public final ac3 a;
    public final String b;
    public final int c;

    public cc3(ac3 ac3Var, String str, int i) {
        this.a = ac3Var;
        Objects.requireNonNull(str);
        String c = ib3.c(str);
        this.b = c;
        int length = c.length();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            int codePointAt = c.codePointAt(i2);
            if (!Character.isWhitespace(codePointAt)) {
                break;
            } else {
                i2 += Character.charCount(codePointAt);
            }
        }
        sv2.o("Metric label is required", !z);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cc3)) {
            return false;
        }
        cc3 cc3Var = (cc3) obj;
        if (this == cc3Var) {
            return true;
        }
        return this.a.equals(cc3Var.a) && Objects.equals(this.b, cc3Var.b) && this.c == cc3Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metric{mValue=");
        sb.append(this.a);
        sb.append(", mLabel=");
        sb.append(this.b);
        sb.append(", mSemanticStyle=");
        return nt3.n(sb, this.c, "}");
    }
}
