package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l60 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public l60(String str) {
        this.a = str;
    }

    public static void a(l60 l60Var, String str, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!l60Var.c.add(str)) {
            StringBuilder E = r7.E("Element with name '", str, "' is already registered in ");
            E.append(l60Var.a);
            throw new IllegalArgumentException(E.toString().toString());
        }
        l60Var.b.add(str);
        l60Var.d.add(serialDescriptor);
        l60Var.e.add(o91.I);
        l60Var.f.add(false);
    }
}
