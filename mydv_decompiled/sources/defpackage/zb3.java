package defpackage;

import android.os.Bundle;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zb3 extends ac3 {
    public final LocalTime a;

    public zb3(LocalTime localTime) {
        this.a = localTime.truncatedTo(ChronoUnit.SECONDS);
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toSecondOfDay());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zb3)) {
            return false;
        }
        zb3 zb3Var = (zb3) obj;
        if (this == zb3Var) {
            return true;
        }
        return Objects.equals(this.a, zb3Var.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return zb3.class.getSimpleName() + "{mValue=" + this.a + "}";
    }
}
