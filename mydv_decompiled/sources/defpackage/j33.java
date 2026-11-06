package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j33 extends v3 implements wk2 {
    public final g33 M;
    public final uu2 N;

    public j33(wk2 wk2Var, uu2 uu2Var) {
        wk2Var.getClass();
        this.M = wk2Var;
        this.N = uu2Var;
    }

    @Override // defpackage.g33
    public final void clear() {
        this.M.clear();
    }

    @Override // defpackage.v3
    public final Map d() {
        return new rv2(this.M.b(), new w7(this, (byte) 13));
    }

    @Override // defpackage.v3
    public final Collection e() {
        return new t3(this, (byte) 0);
    }

    @Override // defpackage.v3
    public final Set f() {
        return this.M.keySet();
    }

    @Override // defpackage.v3
    public final Collection g() {
        return new n70(this.M.a(), new nv2(this.N, (byte) 0));
    }

    @Override // defpackage.g33
    public final List get(Object obj) {
        return sv2.a0((List) this.M.get(obj), new mv2(this.N, obj));
    }

    @Override // defpackage.v3
    public final Iterator h() {
        return new m52(this.M.a().iterator(), new nv2(this.N, (byte) 1));
    }

    @Override // defpackage.v3, defpackage.g33
    public final boolean isEmpty() {
        return this.M.isEmpty();
    }

    @Override // defpackage.g33
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v3, defpackage.g33
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // defpackage.g33
    public final int size() {
        return this.M.size();
    }
}
