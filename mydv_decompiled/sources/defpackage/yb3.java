package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yb3 extends ac3 {
    public final String a;
    public final String b;

    public yb3(String str, String str2) {
        Objects.requireNonNull(str);
        this.a = ib3.c(str);
        this.b = ib3.c(str2);
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        bundle.putString("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yb3)) {
            return false;
        }
        yb3 yb3Var = (yb3) obj;
        if (this == yb3Var) {
            return true;
        }
        return Objects.equals(this.a, yb3Var.a) && Objects.equals(this.b, yb3Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(yb3.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        return hf1.z(sb, this.b, "}");
    }
}
