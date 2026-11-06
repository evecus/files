package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ja3 {
    public final wa2 a;
    public final ia3 b;
    public final x02 c;
    public na3 d;
    public final p15 e;
    public k13 f;
    public e43 g;
    public e43 h;
    public e43 i;
    public ha3 j;

    public ja3(wa2 wa2Var) {
        this.a = wa2Var;
        ia3 ia3Var = new ia3();
        ia3Var.setAggregateChildKindSet$ui(-1);
        this.b = ia3Var;
        x02 x02Var = new x02(wa2Var);
        this.c = x02Var;
        this.d = x02Var;
        p15 p15Var = x02Var.J0;
        this.e = p15Var;
        this.f = p15Var;
        this.g = new e43();
    }

    public static k13 a(j13 j13Var, k13 k13Var) {
        k13 k13Var2;
        if (j13Var instanceof q13) {
            k13Var2 = ((q13) j13Var).create();
            k13Var2.setKindSet$ui(oa3.g(k13Var2));
        } else {
            wt wtVar = new wt();
            wtVar.setKindSet$ui(oa3.e(j13Var));
            wtVar.I = j13Var;
            wtVar.K = new HashSet();
            k13Var2 = wtVar;
        }
        if (k13Var2.isAttached()) {
            q02.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        k13Var2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        k13 child$ui = k13Var.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(k13Var2);
            k13Var2.setChild$ui(child$ui);
        }
        k13Var.setChild$ui(k13Var2);
        k13Var2.setParent$ui(k13Var);
        return k13Var2;
    }

    public static k13 b(k13 k13Var) {
        if (k13Var.isAttached()) {
            a43 a43Var = oa3.a;
            if (!k13Var.isAttached()) {
                q02.b("autoInvalidateRemovedNode called on unattached node");
            }
            oa3.b(k13Var, -1, 2);
            k13Var.runDetachLifecycle$ui();
            k13Var.markAsDetached$ui();
        }
        k13 child$ui = k13Var.getChild$ui();
        k13 parent$ui = k13Var.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            k13Var.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            k13Var.setParent$ui(null);
        }
        parent$ui.getClass();
        return parent$ui;
    }

    public static void h(j13 j13Var, j13 j13Var2, k13 k13Var) {
        if ((j13Var instanceof q13) && (j13Var2 instanceof q13)) {
            ((q13) j13Var2).update(k13Var);
            if (k13Var.isAttached()) {
                oa3.d(k13Var);
                return;
            } else {
                k13Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(k13Var instanceof wt)) {
            q02.b("Unknown Modifier.Node type");
            return;
        }
        wt wtVar = (wt) k13Var;
        if (wtVar.isAttached()) {
            wtVar.k0();
        }
        wtVar.I = j13Var2;
        wtVar.setKindSet$ui(oa3.e(j13Var2));
        if (wtVar.isAttached()) {
            wtVar.j0(false);
        }
        if (k13Var.isAttached()) {
            oa3.d(k13Var);
        } else {
            k13Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    public final boolean c(int i) {
        return (this.f.getAggregateChildKindSet$ui() & i) != 0;
    }

    public final void d(k13 k13Var, na3 na3Var) {
        for (k13 parent$ui = k13Var.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == this.b) {
                wa2 v = this.a.v();
                na3Var.e0 = v != null ? v.n0.c : null;
                this.d = na3Var;
                return;
            } else {
                if ((parent$ui.getKindSet$ui() & 2) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(na3Var);
            }
        }
    }

    public final void e() {
        for (k13 k13Var = this.f; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.runAttachLifecycle$ui();
            if (k13Var.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                oa3.a(k13Var);
            }
            if (k13Var.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                oa3.d(k13Var);
            }
            k13Var.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            k13Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    public final void f(int i, e43 e43Var, e43 e43Var2, k13 k13Var, boolean z) {
        ja3 ja3Var;
        int i2;
        e43 e43Var3;
        e43 e43Var4;
        ha3 ha3Var = this.j;
        if (ha3Var == null) {
            ja3Var = this;
            i2 = i;
            e43Var3 = e43Var;
            e43Var4 = e43Var2;
            ha3 ha3Var2 = new ha3(ja3Var, k13Var, i2, e43Var3, e43Var4, z);
            ja3Var.j = ha3Var2;
            ha3Var = ha3Var2;
        } else {
            ja3Var = this;
            i2 = i;
            e43Var3 = e43Var;
            e43Var4 = e43Var2;
            ha3Var.d(k13Var);
            ha3Var.e(i2);
            ha3Var.c(e43Var3);
            ha3Var.b(e43Var4);
            ha3Var.f(z);
        }
        ja3Var.j = null;
        il2.y(e43Var3.b - i2, e43Var4.b - i2, ha3Var);
        ja3Var.j = ha3Var;
        int i3 = 0;
        for (k13 parent$ui = ja3Var.e.getParent$ui(); parent$ui != null && parent$ui != ja3Var.b; parent$ui = parent$ui.getParent$ui()) {
            i3 |= parent$ui.getKindSet$ui();
            parent$ui.setAggregateChildKindSet$ui(i3);
        }
    }

    public final void g() {
        wa2 wa2Var;
        pa2 pa2Var;
        k13 parent$ui = this.e.getParent$ui();
        na3 na3Var = this.c;
        while (true) {
            wa2Var = this.a;
            if (parent$ui == null) {
                break;
            }
            na2 j = ut0.j(parent$ui);
            if (j != null) {
                if (parent$ui.getCoordinator$ui() != null) {
                    na3 coordinator$ui = parent$ui.getCoordinator$ui();
                    coordinator$ui.getClass();
                    pa2 pa2Var2 = (pa2) coordinator$ui;
                    na2 na2Var = pa2Var2.J0;
                    pa2Var2.n1(j);
                    pa2Var = pa2Var2;
                    if (na2Var != parent$ui) {
                        mr1 mr1Var = pa2Var2.B0;
                        pa2Var = pa2Var2;
                        if (mr1Var != null) {
                            mr1Var.c();
                            pa2Var = pa2Var2;
                        }
                    }
                } else {
                    pa2 pa2Var3 = new pa2(wa2Var, j);
                    parent$ui.updateCoordinator$ui(pa2Var3);
                    pa2Var = pa2Var3;
                }
                na3Var.e0 = pa2Var;
                pa2Var.d0 = na3Var;
                na3Var = pa2Var;
            } else {
                parent$ui.updateCoordinator$ui(na3Var);
            }
            parent$ui = parent$ui.getParent$ui();
        }
        wa2 v = wa2Var.v();
        na3Var.e0 = v != null ? v.n0.c : null;
        this.d = na3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        k13 k13Var = this.f;
        p15 p15Var = this.e;
        if (k13Var != p15Var) {
            while (true) {
                if (k13Var == null || k13Var == p15Var) {
                    break;
                }
                sb.append(String.valueOf(k13Var));
                if (k13Var.getChild$ui() == p15Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                k13Var = k13Var.getChild$ui();
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
