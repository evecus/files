package defpackage;

import android.os.Bundle;
import j$.time.LocalDate;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vb3 extends ac3 {
    public final LocalDate a;
    public final int b;

    public vb3(LocalDate localDate, int i) {
        this.a = localDate;
        sv2.p(i >= 0 && i <= 2, "Invalid format: %s", Integer.valueOf(i));
        this.b = i;
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toEpochDay());
        bundle.putInt("format", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vb3)) {
            return false;
        }
        vb3 vb3Var = (vb3) obj;
        if (this == vb3Var) {
            return true;
        }
        return this.a.equals(vb3Var.a) && this.b == vb3Var.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(vb3.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mFormat=");
        return nt3.n(sb, this.b, "}");
    }
}
