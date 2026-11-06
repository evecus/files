package defpackage;

/* loaded from: classes2.dex */
public final class pn0 extends x0 {
    public final /* synthetic */ byte K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(e0[] e0VarArr, byte b) {
        super(e0VarArr);
        this.K = b;
        switch (b) {
            case 1:
                return;
            default:
                if (e0VarArr != null) {
                    for (e0 e0Var : e0VarArr) {
                        if (e0Var != null) {
                        }
                    }
                    this.I = f0.b(e0VarArr);
                    this.L = -1;
                    return;
                }
                zy.m("'elements' cannot be null, or contain null");
                throw null;
        }
    }

    @Override // defpackage.x0
    public final a0 A() {
        switch (this.K) {
            case 0:
                return new dn0(us.z(v()));
            default:
                return new zn0(us.z(v()));
        }
    }

    @Override // defpackage.x0
    public final fn0 B() {
        switch (this.K) {
            case 0:
                return new fn0(this, (byte) 0);
            default:
                return new fn0(this, (byte) 1);
        }
    }

    @Override // defpackage.x0
    public final r0 C() {
        switch (this.K) {
        }
        return new mn0(xs.w(w()));
    }

    @Override // defpackage.x0
    public final z0 D() {
        switch (this.K) {
        }
        return new qn0(this.I);
    }

    public int E() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        int length = this.I.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += this.I[i3].d().t().q(true);
        }
        this.L = i2;
        return i2;
    }

    public int F() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        int length = this.I.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += this.I[i3].d().u().q(true);
        }
        this.L = i2;
        return i2;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        int i = 0;
        switch (this.K) {
            case 0:
                uu2Var.U(48, z);
                nn0 w = uu2Var.w();
                int length = this.I.length;
                if (this.L >= 0 || length > 16) {
                    uu2Var.N(E());
                    while (i < length) {
                        this.I[i].d().t().n(w, true);
                        i++;
                    }
                    break;
                } else {
                    u0[] u0VarArr = new u0[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        u0 t = this.I[i3].d().t();
                        u0VarArr[i3] = t;
                        i2 += t.q(true);
                    }
                    this.L = i2;
                    uu2Var.N(i2);
                    while (i < length) {
                        u0VarArr[i].n(w, true);
                        i++;
                    }
                    break;
                }
            default:
                uu2Var.U(48, z);
                co0 x = uu2Var.x();
                int length2 = this.I.length;
                if (this.L >= 0 || length2 > 16) {
                    uu2Var.N(F());
                    while (i < length2) {
                        x.V(this.I[i].d());
                        i++;
                    }
                    break;
                } else {
                    u0[] u0VarArr2 = new u0[length2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        u0 u = this.I[i5].d().u();
                        u0VarArr2[i5] = u;
                        i4 += u.q(true);
                    }
                    this.L = i4;
                    uu2Var.N(i4);
                    while (i < length2) {
                        x.V(u0VarArr2[i]);
                        i++;
                    }
                    break;
                }
        }
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        switch (this.K) {
            case 0:
                return uu2.z(E(), z);
            default:
                return uu2.z(F(), z);
        }
    }

    @Override // defpackage.x0, defpackage.u0
    public u0 t() {
        switch (this.K) {
            case 0:
                return this;
            default:
                return super.t();
        }
    }

    @Override // defpackage.x0, defpackage.u0
    public final u0 u() {
        byte b = this.K;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(e0 e0Var, byte b) {
        super(e0Var);
        this.K = b;
        switch (b) {
            case 1:
                super(e0Var);
                this.L = -1;
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(e0 e0Var, e0 e0Var2, byte b) {
        super(e0Var, e0Var2);
        this.K = b;
        switch (b) {
            case 1:
                super(e0Var, e0Var2);
                break;
            default:
                this.L = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(e0 e0Var, e0 e0Var2, boolean z) {
        super(e0Var, e0Var2);
        this.K = (byte) 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(f0 f0Var, byte b) {
        super(f0Var);
        this.K = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(boolean z, e0[] e0VarArr) {
        super(e0VarArr);
        this.K = (byte) 0;
    }
}
