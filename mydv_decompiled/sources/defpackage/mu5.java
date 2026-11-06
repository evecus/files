package defpackage;

import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mu5 {
    public jw5 a;
    public final Binder b;
    public final HashMap c = new HashMap();

    public mu5(jw5 jw5Var, Binder binder, WindowAreaComponent windowAreaComponent) {
        this.a = jw5Var;
        this.b = binder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu5)) {
            return false;
        }
        mu5 mu5Var = (mu5) obj;
        return this.a.equals(mu5Var.a) && j42.c(this.c.entrySet(), mu5Var.c.entrySet());
    }

    public final int hashCode() {
        return this.c.entrySet().hashCode() + ((n84.U0.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WindowAreaInfo{ Metrics: " + this.a + ", type: " + n84.U0 + ", Capabilities: " + this.c.entrySet() + " }";
    }
}
