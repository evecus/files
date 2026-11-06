package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k14 implements u94 {
    public final LinkedHashSet a = new LinkedHashSet();

    public k14(da daVar) {
        daVar.s("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.u94
    public final Bundle a() {
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        sv2.T(b0, "classes_to_restore", o70.r1(this.a));
        return b0;
    }

    public final void b(String str) {
        this.a.add(str);
    }
}
