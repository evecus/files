package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class we2 {
    public final Object a;
    public final ye2 b;
    public int d;
    public we2 e;
    public boolean f;
    public int c = -1;
    public final jk3 g = ad4.w(null);

    public we2(Object obj, ye2 ye2Var) {
        this.a = obj;
        this.b = ye2Var;
    }

    public final we2 a() {
        if (this.f) {
            t02.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.I.add(this);
            we2 we2Var = (we2) this.g.getValue();
            if (we2Var != null) {
                we2Var.a();
            } else {
                we2Var = null;
            }
            this.e = we2Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            t02.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.I.remove(this);
        we2 we2Var = this.e;
        if (we2Var != null) {
            we2Var.b();
        }
        this.e = null;
    }
}
