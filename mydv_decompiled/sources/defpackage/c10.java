package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c10 implements ei1 {
    public static final c10 a = new c10();
    public static Boolean b;

    @Override // defpackage.ei1
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw r7.t("canFocus is read before it is written");
    }

    @Override // defpackage.ei1
    public final void e(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.ei1
    public final void b(ki1 ki1Var) {
    }

    @Override // defpackage.ei1
    public final void c(tm1 tm1Var) {
    }

    @Override // defpackage.ei1
    public final void d(rh1 rh1Var) {
    }

    @Override // defpackage.ei1
    public final void f(tm1 tm1Var) {
    }

    @Override // defpackage.ei1
    public final void g(m14 m14Var) {
    }

    @Override // defpackage.ei1
    public final void h(ki1 ki1Var) {
    }
}
