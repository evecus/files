package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class k13 implements tt0 {
    public static final int $stable = 8;
    private k13 child;
    private na3 coordinator;
    private rm1 detachedListener;
    private boolean insertedNodeAwaitingAttachForInvalidation;
    private boolean isAttached;
    private int kindSet;
    private boolean onAttachRunExpected;
    private boolean onDetachRunExpected;
    private ld3 ownerScope;
    private k13 parent;
    private dl0 scope;
    private boolean updatedNodeAwaitingAttachForInvalidation;
    private k13 node = this;
    private int aggregateChildKindSet = -1;

    public final int getAggregateChildKindSet$ui() {
        return this.aggregateChildKindSet;
    }

    public final k13 getChild$ui() {
        return this.child;
    }

    public final na3 getCoordinator$ui() {
        return this.coordinator;
    }

    public final dl0 getCoroutineScope() {
        dl0 dl0Var = this.scope;
        if (dl0Var != null) {
            return dl0Var;
        }
        dj0 H = i42.H(ut0.V(this).getCoroutineContext().plus(new x52((v52) ut0.V(this).getCoroutineContext().get(q8.r0))));
        this.scope = H;
        return H;
    }

    public final rm1 getDetachedListener$ui() {
        return this.detachedListener;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui() {
        return this.kindSet;
    }

    @Override // defpackage.tt0
    public final k13 getNode() {
        return this.node;
    }

    public final ld3 getOwnerScope$ui() {
        return this.ownerScope;
    }

    public final k13 getParent$ui() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return !(this instanceof tt);
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
    public final boolean m203isKindH91voCI$ui(int i) {
        return (getKindSet$ui() & i) != 0;
    }

    public boolean l() {
        return isAttached();
    }

    public void markAsAttached$ui() {
        if (this.isAttached) {
            q02.b("node attached multiple times");
        }
        if (!(this.coordinator != null)) {
            q02.b("attach invoked on a node without a coordinator");
        }
        this.isAttached = true;
        this.onAttachRunExpected = true;
    }

    public void markAsDetached$ui() {
        if (!this.isAttached) {
            q02.b("Cannot detach a node that is not attached");
        }
        if (this.onAttachRunExpected) {
            q02.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.onDetachRunExpected) {
            q02.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.isAttached = false;
        dl0 dl0Var = this.scope;
        if (dl0Var != null) {
            i42.e0(dl0Var, new p13("The Modifier.Node was detached", (byte) 1));
            this.scope = null;
        }
    }

    public void reset$ui() {
        if (!this.isAttached) {
            q02.b("reset() called on an unattached node");
        }
        onReset();
    }

    public void runAttachLifecycle$ui() {
        if (!this.isAttached) {
            q02.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.onAttachRunExpected) {
            q02.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.onAttachRunExpected = false;
        onAttach();
        this.onDetachRunExpected = true;
    }

    public void runDetachLifecycle$ui() {
        if (!this.isAttached) {
            q02.b("node detached multiple times");
        }
        if (this.coordinator == null) {
            q02.b("detach invoked on a node without a coordinator");
        }
        if (!this.onDetachRunExpected) {
            q02.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.onDetachRunExpected = false;
        rm1 rm1Var = this.detachedListener;
        if (rm1Var != null) {
            rm1Var.invoke();
        }
        onDetach();
    }

    public final void setAggregateChildKindSet$ui(int i) {
        this.aggregateChildKindSet = i;
    }

    public void setAsDelegateTo$ui(k13 k13Var) {
        this.node = k13Var;
    }

    public final void setChild$ui(k13 k13Var) {
        this.child = k13Var;
    }

    public final void setDetachedListener$ui(rm1 rm1Var) {
        this.detachedListener = rm1Var;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.insertedNodeAwaitingAttachForInvalidation = z;
    }

    public final void setKindSet$ui(int i) {
        this.kindSet = i;
    }

    public final void setOwnerScope$ui(ld3 ld3Var) {
        this.ownerScope = ld3Var;
    }

    public final void setParent$ui(k13 k13Var) {
        this.parent = k13Var;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.updatedNodeAwaitingAttachForInvalidation = z;
    }

    public final void sideEffect(rm1 rm1Var) {
        ut0.V(this).registerOnEndApplyChangesListener(rm1Var);
    }

    public void updateCoordinator$ui(na3 na3Var) {
        this.coordinator = na3Var;
    }

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public void onAttach() {
    }

    public void onDensityChange() {
    }

    public void onDetach() {
    }

    public void onLayoutDirectionChange() {
    }

    public void onReset() {
    }
}
