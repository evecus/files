package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class wt0 extends k13 {
    public final int I = oa3.f(this);
    public k13 J;

    public final void j0(tt0 tt0Var) {
        k13 node = tt0Var.getNode();
        if (node != tt0Var) {
            k13 k13Var = tt0Var instanceof k13 ? (k13) tt0Var : null;
            k13 parent$ui = k13Var != null ? k13Var.getParent$ui() : null;
            if (node == getNode() && j42.c(parent$ui, this)) {
                return;
            }
            zy.i("Cannot delegate to an already delegated node");
            return;
        }
        if (node.isAttached()) {
            q02.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet$ui = getKindSet$ui();
        int g = oa3.g(node);
        node.setKindSet$ui(g);
        int kindSet$ui2 = getKindSet$ui();
        int i = g & 2;
        if (i != 0 && (kindSet$ui2 & 2) != 0 && !(this instanceof na2)) {
            q02.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui(this.J);
        this.J = node;
        node.setParent$ui(this);
        l0(g | getKindSet$ui(), false);
        if (isAttached()) {
            if (i == 0 || (kindSet$ui & 2) != 0) {
                updateCoordinator$ui(getCoordinator$ui());
            } else {
                ja3 ja3Var = ut0.U(this).n0;
                getNode().updateCoordinator$ui(null);
                ja3Var.g();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            oa3.a(node);
        }
    }

    public final void k0(tt0 tt0Var) {
        k13 k13Var = null;
        for (k13 k13Var2 = this.J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
            if (k13Var2 == tt0Var) {
                if (k13Var2.isAttached()) {
                    a43 a43Var = oa3.a;
                    if (!k13Var2.isAttached()) {
                        q02.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    oa3.b(k13Var2, -1, 2);
                    k13Var2.runDetachLifecycle$ui();
                    k13Var2.markAsDetached$ui();
                }
                k13Var2.setAsDelegateTo$ui(k13Var2);
                k13Var2.setAggregateChildKindSet$ui(0);
                if (k13Var == null) {
                    this.J = k13Var2.getChild$ui();
                } else {
                    k13Var.setChild$ui(k13Var2.getChild$ui());
                }
                k13Var2.setChild$ui(null);
                k13Var2.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int g = oa3.g(this);
                l0(g, true);
                if (isAttached() && (kindSet$ui & 2) != 0 && (g & 2) == 0) {
                    ja3 ja3Var = ut0.U(this).n0;
                    getNode().updateCoordinator$ui(null);
                    ja3Var.g();
                    return;
                }
                return;
            }
            k13Var = k13Var2;
        }
        zy.h(tt0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void l0(int i, boolean z) {
        k13 child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i);
        if (kindSet$ui != i) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui(i);
            }
            if (isAttached()) {
                k13 node = getNode();
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.getKindSet$ui();
                    r2.setKindSet$ui(i);
                    if (r2 == node) {
                        break;
                    } else {
                        r2 = r2.getParent$ui();
                    }
                }
                if (z && r2 == node) {
                    i = oa3.g(node);
                    node.setKindSet$ui(i);
                }
                int aggregateChildKindSet$ui = i | ((r2 == 0 || (child$ui = r2.getChild$ui()) == null) ? 0 : child$ui.getAggregateChildKindSet$ui());
                for (k13 k13Var = r2; k13Var != null; k13Var = k13Var.getParent$ui()) {
                    aggregateChildKindSet$ui |= k13Var.getKindSet$ui();
                    k13Var.setAggregateChildKindSet$ui(aggregateChildKindSet$ui);
                }
            }
        }
    }

    @Override // defpackage.k13
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.updateCoordinator$ui(getCoordinator$ui());
            if (!k13Var.isAttached()) {
                k13Var.markAsAttached$ui();
            }
        }
    }

    @Override // defpackage.k13
    public final void markAsDetached$ui() {
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // defpackage.k13
    public final void reset$ui() {
        super.reset$ui();
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.reset$ui();
        }
    }

    @Override // defpackage.k13
    public final void runAttachLifecycle$ui() {
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // defpackage.k13
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.runDetachLifecycle$ui();
        }
    }

    @Override // defpackage.k13
    public final void setAsDelegateTo$ui(k13 k13Var) {
        super.setAsDelegateTo$ui(k13Var);
        for (k13 k13Var2 = this.J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
            k13Var2.setAsDelegateTo$ui(k13Var);
        }
    }

    @Override // defpackage.k13
    public final void updateCoordinator$ui(na3 na3Var) {
        super.updateCoordinator$ui(na3Var);
        for (k13 k13Var = this.J; k13Var != null; k13Var = k13Var.getChild$ui()) {
            k13Var.updateCoordinator$ui(na3Var);
        }
    }
}
