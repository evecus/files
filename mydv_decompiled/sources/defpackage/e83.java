package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e83 {
    public boolean b;
    public boolean c;
    public String e;
    public boolean f;
    public boolean g;
    public final c83 a = new c83();
    public int d = -1;

    public final void a(int i, tm1 tm1Var) {
        b(i);
        tq3 tq3Var = new tq3();
        tm1Var.invoke(tq3Var);
        this.f = tq3Var.a;
        this.g = false;
    }

    public final void b(int i) {
        this.d = i;
        this.f = false;
    }

    public final void c(String str) {
        if (jx4.L(str)) {
            s83.t("Cannot pop up to an empty route");
        } else {
            this.e = str;
            this.f = false;
        }
    }
}
