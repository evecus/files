package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h12 {
    public final ph2 a;
    public final ce b;
    public final Object c = new Object();
    public final b53 d = new b53(new zs5[16]);
    public boolean e;

    public h12(ph2 ph2Var, ce ceVar) {
        this.a = ph2Var;
        this.b = ceVar;
    }

    public final sc3 a(EditorInfo editorInfo) {
        synchronized (this.c) {
            if (this.e) {
                return null;
            }
            j14 a = this.a.a(editorInfo);
            v1 v1Var = new v1(this, (byte) 26);
            int i = Build.VERSION.SDK_INT;
            sc3 vc3Var = i >= 34 ? new vc3(a, v1Var) : i >= 25 ? new uc3(a, v1Var) : i >= 24 ? new tc3(a, v1Var) : new sc3(a, v1Var);
            this.d.c(new zs5(vc3Var));
            return vc3Var;
        }
    }

    public final boolean b() {
        return !this.e;
    }
}
