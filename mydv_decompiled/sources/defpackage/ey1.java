package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ey1 extends lu implements wk2, Serializable {
    public final transient c34 M;
    public final transient int N;

    public ey1(c34 c34Var, int i) {
        this.M = c34Var;
        this.N = i;
    }

    @Override // defpackage.v3, defpackage.g33
    public final Collection a() {
        return (vx1) super.a();
    }

    @Override // defpackage.v3
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // defpackage.g33
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v3
    public final Collection e() {
        return new ly1(this);
    }

    @Override // defpackage.v3
    public final Collection g() {
        return new my1(this);
    }

    @Override // defpackage.v3
    public final Iterator h() {
        return new jy1(this);
    }

    @Override // defpackage.v3, defpackage.g33
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public iy1 b() {
        return this.M;
    }

    @Override // defpackage.g33
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final dy1 get(Object obj) {
        dy1 dy1Var = (dy1) this.M.get(obj);
        if (dy1Var != null) {
            return dy1Var;
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    @Override // defpackage.v3, defpackage.g33
    public final Set keySet() {
        return this.M.keySet();
    }

    @Override // defpackage.g33
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v3, defpackage.g33
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.g33
    public final int size() {
        return this.N;
    }

    @Override // defpackage.v3, defpackage.g33
    public final Collection values() {
        return (vx1) super.values();
    }
}
