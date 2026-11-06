package defpackage;

/* loaded from: classes2.dex */
public final class qn0 extends z0 {
    public final /* synthetic */ byte L = 1;
    public int M;

    public qn0(e0[] e0VarArr) {
        super(false, e0VarArr);
        this.M = -1;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        byte b = this.L;
        e0[] e0VarArr = this.I;
        int i = 0;
        switch (b) {
            case 0:
                uu2Var.U(49, z);
                nn0 w = uu2Var.w();
                int length = e0VarArr.length;
                if (this.M >= 0 || length > 16) {
                    uu2Var.N(v());
                    while (i < length) {
                        e0VarArr[i].d().t().n(w, true);
                        i++;
                    }
                    break;
                } else {
                    u0[] u0VarArr = new u0[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        u0 t = e0VarArr[i3].d().t();
                        u0VarArr[i3] = t;
                        i2 += t.q(true);
                    }
                    this.M = i2;
                    uu2Var.N(i2);
                    while (i < length) {
                        u0VarArr[i].n(w, true);
                        i++;
                    }
                    break;
                }
            default:
                uu2Var.U(49, z);
                co0 x = uu2Var.x();
                int length2 = e0VarArr.length;
                if (this.M >= 0 || length2 > 16) {
                    uu2Var.N(w());
                    while (i < length2) {
                        x.V(e0VarArr[i].d());
                        i++;
                    }
                    break;
                } else {
                    u0[] u0VarArr2 = new u0[length2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        u0 u = e0VarArr[i5].d().u();
                        u0VarArr2[i5] = u;
                        i4 += u.q(true);
                    }
                    this.M = i4;
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
        switch (this.L) {
            case 0:
                return uu2.z(v(), z);
            default:
                return uu2.z(w(), z);
        }
    }

    @Override // defpackage.z0, defpackage.u0
    public u0 t() {
        switch (this.L) {
            case 0:
                if (this.J == null) {
                    break;
                }
                break;
        }
        return super.t();
    }

    @Override // defpackage.z0, defpackage.u0
    public final u0 u() {
        byte b = this.L;
        return this;
    }

    public int v() {
        int i = this.M;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (e0 e0Var : this.I) {
            i2 += e0Var.d().t().q(true);
        }
        this.M = i2;
        return i2;
    }

    public int w() {
        int i = this.M;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (e0 e0Var : this.I) {
            i2 += e0Var.d().u().q(true);
        }
        this.M = i2;
        return i2;
    }

    public /* synthetic */ qn0(f0 f0Var) {
        super(f0Var);
    }

    public /* synthetic */ qn0(boolean z, e0[] e0VarArr) {
        super(z, e0VarArr);
    }

    public /* synthetic */ qn0() {
    }

    public /* synthetic */ qn0(e0[] e0VarArr, e0[] e0VarArr2) {
        super(e0VarArr, e0VarArr2);
    }
}
