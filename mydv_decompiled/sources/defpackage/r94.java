package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r94 implements u94 {
    public final da a;
    public boolean b;
    public Bundle c;
    public final u05 d;

    public r94(da daVar, wr5 wr5Var) {
        daVar.getClass();
        this.a = daVar;
        this.d = new u05(new q94(wr5Var, (byte) 0));
    }

    @Override // defpackage.u94
    public final Bundle a() {
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            b0.putAll(bundle);
        }
        for (Map.Entry entry : ((s94) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((ey0) ((n94) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                b0.putBundle(str, a);
            }
        }
        this.b = false;
        return b0;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle f = this.a.f("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            b0.putAll(bundle);
        }
        if (f != null) {
            b0.putAll(f);
        }
        this.c = b0;
        this.b = true;
    }
}
