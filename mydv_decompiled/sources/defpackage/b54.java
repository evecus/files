package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class b54 {
    public final Resources a;
    public final Resources.Theme b;

    public b54(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b54.class == obj.getClass()) {
            b54 b54Var = (b54) obj;
            if (this.a.equals(b54Var.a) && Objects.equals(this.b, b54Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
