package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xb3 extends ac3 {
    public final int a;
    public final String b;

    public xb3(int i, String str) {
        this.a = i;
        this.b = ib3.c(str);
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        bundle.putInt("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xb3)) {
            return false;
        }
        xb3 xb3Var = (xb3) obj;
        if (this == xb3Var) {
            return true;
        }
        return this.a == xb3Var.a && Objects.equals(this.b, xb3Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(xb3.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        return hf1.z(sb, this.b, "}");
    }
}
