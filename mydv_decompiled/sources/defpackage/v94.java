package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v94 {
    public final w94 a;
    public final q94 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final o63 c = new o63((byte) 19);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public v94(w94 w94Var, q94 q94Var) {
        this.a = w94Var;
        this.b = q94Var;
    }

    public final void a() {
        w94 w94Var = this.a;
        if (((xi2) w94Var.k()).i != ki2.J) {
            zy.i("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                zy.i("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            w94Var.k().a(new x63(this, (byte) 1));
            this.e = true;
        }
    }
}
