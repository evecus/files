package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t7 extends i42 {
    public final /* synthetic */ gc0 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ o7 u;

    public t7(gc0 gc0Var, String str, o7 o7Var) {
        this.s = gc0Var;
        this.t = str;
        this.u = o7Var;
    }

    public final void L0() {
        Integer num;
        gc0 gc0Var = this.s;
        Bundle bundle = gc0Var.g;
        LinkedHashMap linkedHashMap = gc0Var.f;
        String str = this.t;
        str.getClass();
        if (!gc0Var.d.contains(str) && (num = (Integer) gc0Var.b.remove(str)) != null) {
            gc0Var.a.remove(num);
        }
        gc0Var.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            StringBuilder E = r7.E("Dropping pending result for request ", str, ": ");
            E.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", E.toString());
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((m7) o7.z(bundle, str, m7.class)));
            bundle.remove(str);
        }
        r7.K(gc0Var.c.get(str));
    }
}
