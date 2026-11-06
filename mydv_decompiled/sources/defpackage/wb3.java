package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wb3 extends ac3 {
    public final float a;
    public final String b;
    public final int c;
    public final int d;

    public wb3(float f, int i, int i2, String str) {
        this.a = f;
        this.b = ib3.c(str);
        sv2.p(i >= 0 && i <= 6, "Invalid minFractionDigits: %s", Integer.valueOf(i));
        sv2.p(i2 >= 0 && i2 <= 6, "Invalid maxFractionDigits: %s", Integer.valueOf(i2));
        sv2.p(i <= i2, "Invalid minFractionDigits/maxFractionDigits: %s/%s", Integer.valueOf(i), Integer.valueOf(i2));
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        bundle.putFloat("value", this.a);
        bundle.putString("unit", this.b);
        bundle.putInt("minDigits", this.c);
        bundle.putInt("maxDigits", this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wb3)) {
            return false;
        }
        wb3 wb3Var = (wb3) obj;
        if (this == wb3Var) {
            return true;
        }
        return this.a == wb3Var.a && Objects.equals(this.b, wb3Var.b) && this.c == wb3Var.c && this.d == wb3Var.d;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(wb3.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        sb.append(this.b);
        sb.append(", mMinFractionDigits=");
        sb.append(this.c);
        sb.append(", mMaxFractionDigits=");
        return nt3.n(sb, this.d, "}");
    }
}
