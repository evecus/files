package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hi3 implements kq1 {
    public final ci3 a;
    public final ci3 b;
    public final ci3 c;
    public final ci3 d;
    public final ci3 e;
    public final ci3 f;

    public /* synthetic */ hi3(ci3 ci3Var, ci3 ci3Var2, ci3 ci3Var3, ci3 ci3Var4) {
        this(new ci3(0.0f, 3), ci3Var, ci3Var2, new ci3(0.0f, 3), ci3Var3, ci3Var4);
    }

    @Override // defpackage.lq1
    public final /* synthetic */ lq1 a(lq1 lq1Var) {
        return jp0.i(this, lq1Var);
    }

    @Override // defpackage.lq1
    public final boolean b(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.lq1
    public final boolean c(c22 c22Var) {
        return ((Boolean) c22Var.invoke(this)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi3)) {
            return false;
        }
        hi3 hi3Var = (hi3) obj;
        return j42.c(this.a, hi3Var.a) && j42.c(this.b, hi3Var.b) && j42.c(this.c, hi3Var.c) && j42.c(this.d, hi3Var.d) && j42.c(this.e, hi3Var.e) && j42.c(this.f, hi3Var.f);
    }

    @Override // defpackage.lq1
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.b + ", top=" + this.c + ", right=" + this.d + ", end=" + this.e + ", bottom=" + this.f + ')';
    }

    public hi3(ci3 ci3Var, ci3 ci3Var2, ci3 ci3Var3, ci3 ci3Var4, ci3 ci3Var5, ci3 ci3Var6) {
        this.a = ci3Var;
        this.b = ci3Var2;
        this.c = ci3Var3;
        this.d = ci3Var4;
        this.e = ci3Var5;
        this.f = ci3Var6;
    }
}
