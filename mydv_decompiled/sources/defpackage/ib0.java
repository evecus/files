package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ib0 extends q3 {
    public final Object I;
    public int J;
    public final /* synthetic */ jb0 K;

    public ib0(jb0 jb0Var, int i) {
        this.K = jb0Var;
        Object obj = jb0.R;
        this.I = jb0Var.j()[i];
        this.J = i;
    }

    public final void a() {
        int i = this.J;
        Object obj = this.I;
        jb0 jb0Var = this.K;
        if (i != -1 && i < jb0Var.size()) {
            if (jl2.z(obj, jb0Var.j()[this.J])) {
                return;
            }
        }
        Object obj2 = jb0.R;
        this.J = jb0Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.I;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        jb0 jb0Var = this.K;
        Map c = jb0Var.c();
        if (c != null) {
            return c.get(this.I);
        }
        a();
        int i = this.J;
        if (i == -1) {
            return null;
        }
        return jb0Var.k()[i];
    }

    @Override // defpackage.q3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        jb0 jb0Var = this.K;
        Map c = jb0Var.c();
        Object obj2 = this.I;
        if (c != null) {
            return c.put(obj2, obj);
        }
        a();
        int i = this.J;
        if (i == -1) {
            jb0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = jb0Var.k()[i];
        jb0Var.k()[this.J] = obj;
        return obj3;
    }
}
