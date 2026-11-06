package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vj1 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        return Objects.equals(this.a, vj1Var.a) && Objects.equals(this.b, vj1Var.b) && Objects.equals(this.c, vj1Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
