package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v00 {
    public Object a;
    public y00 b;
    public p44 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        y00 y00Var = this.b;
        if (y00Var != null) {
            x00 x00Var = y00Var.J;
            x00Var.getClass();
            if (obj == null) {
                obj = n4.O;
            }
            if (n4.N.o(x00Var, null, obj)) {
                n4.c(x00Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        y00 y00Var = this.b;
        if (y00Var == null || !y00Var.J.i(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        p44 p44Var;
        y00 y00Var = this.b;
        if (y00Var != null) {
            x00 x00Var = y00Var.J;
            if (!x00Var.isDone()) {
                x00Var.i(new g2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (this.d || (p44Var = this.c) == null) {
            return;
        }
        p44Var.j(null);
    }
}
