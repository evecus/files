package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f63 extends HashMap {
    public final /* synthetic */ h63 I;

    public f63(h63 h63Var) {
        this.I = h63Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.I.N.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
