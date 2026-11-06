package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zi1 extends wt0 implements pi4, vq1, ye0, kd3, la5 {
    public static final jp Q = new jp((byte) 21);
    public t33 K;
    public final tm1 L;
    public th1 M;
    public we2 N;
    public na3 O;
    public final si1 P;

    public zi1(t33 t33Var, int i, n1 n1Var) {
        this.K = t33Var;
        this.L = n1Var;
        ui1 ui1Var = new ui1(i, new qi1(2, this, zi1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 1), 10);
        j0(ui1Var);
        this.P = ui1Var;
    }

    @Override // defpackage.vq1
    public final void O(na3 na3Var) {
        this.O = na3Var;
        if (((ui1) this.P).o0().b()) {
            boolean h = na3Var.h();
            jp jpVar = aj1.I;
            if (!h) {
                if (isAttached()) {
                    ad4.p(this, jpVar);
                }
            } else {
                na3 na3Var2 = this.O;
                if (na3Var2 != null && na3Var2.h() && isAttached()) {
                    ad4.p(this, jpVar);
                }
            }
        }
    }

    @Override // defpackage.kd3
    public final void U() {
        r24 r24Var = new r24();
        mu0.P(this, new k9(r24Var, this, (byte) 6));
        we2 we2Var = (we2) r24Var.I;
        if (((ui1) this.P).o0().b()) {
            we2 we2Var2 = this.N;
            if (we2Var2 != null) {
                we2Var2.b();
            }
            if (we2Var != null) {
                we2Var.a();
            } else {
                we2Var = null;
            }
            this.N = we2Var;
        }
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        boolean b = ((ui1) this.P).o0().b();
        d82[] d82VarArr = aj4.a;
        bj4 bj4Var = zi4.l;
        d82 d82Var = aj4.a[4];
        Boolean valueOf = Boolean.valueOf(b);
        bj4Var.getClass();
        cj4Var.c(bj4Var, valueOf);
        cj4Var.c(ii4.w, new v4(null, new va(0, this, zi1.class, "requestFocus", "requestFocus()Z", 0, (byte) 2)));
    }

    @Override // defpackage.la5
    public final Object g() {
        return Q;
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    public final void m0(t33 t33Var, vh1 vh1Var) {
        if (!isAttached()) {
            t33Var.b(vh1Var);
        } else {
            v52 v52Var = (v52) getCoroutineScope().getCoroutineContext().get(q8.r0);
            p70.g0(getCoroutineScope(), null, null, new ni(t33Var, vh1Var, v52Var != null ? v52Var.Q(new m1(t33Var, vh1Var, (byte) 5)) : null, (fj0) null, (byte) 3), 3);
        }
    }

    public final void n0(t33 t33Var) {
        th1 th1Var;
        if (j42.c(this.K, t33Var)) {
            return;
        }
        t33 t33Var2 = this.K;
        if (t33Var2 != null && (th1Var = this.M) != null) {
            t33Var2.b(new uh1(th1Var));
        }
        this.M = null;
        this.K = t33Var;
    }

    @Override // defpackage.k13
    public final void onReset() {
        we2 we2Var = this.N;
        if (we2Var != null) {
            we2Var.b();
        }
        this.N = null;
    }
}
