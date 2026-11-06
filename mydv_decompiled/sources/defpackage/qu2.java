package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qu2 extends i42 {
    public final p7 s;

    public qu2(p7 p7Var) {
        this.s = p7Var;
    }

    public final void L0(Intent intent) {
        t7 t7Var = this.s.a;
        if (t7Var == null) {
            zy.i("Launcher has not been initialized");
            return;
        }
        gc0 gc0Var = t7Var.s;
        ArrayList arrayList = gc0Var.d;
        LinkedHashMap linkedHashMap = gc0Var.b;
        String str = t7Var.t;
        Object obj = linkedHashMap.get(str);
        o7 o7Var = t7Var.u;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + o7Var + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj).intValue();
        arrayList.add(str);
        try {
            gc0Var.b(intValue, o7Var, intent);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
