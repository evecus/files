package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iw4 implements Map.Entry, z72 {
    public final Object I;
    public Object J;
    public final /* synthetic */ jw4 K;

    public iw4(jw4 jw4Var) {
        this.K = jw4Var;
        Map.Entry entry = jw4Var.L;
        entry.getClass();
        this.I = entry.getKey();
        Map.Entry entry2 = jw4Var.L;
        entry2.getClass();
        this.J = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.J;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        jw4 jw4Var = this.K;
        it4 it4Var = jw4Var.I;
        if (it4Var.f().d != jw4Var.K) {
            y9.e();
            return null;
        }
        Object obj2 = this.J;
        it4Var.put(this.I, obj);
        this.J = obj;
        return obj2;
    }
}
