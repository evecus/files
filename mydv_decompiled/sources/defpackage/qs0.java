package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qs0 implements gc4 {
    public final tm1 a;
    public final ps0 b = new ps0(this);
    public final k53 c = new k53();
    public final jk3 d;
    public final jk3 e;
    public final jk3 f;

    public qs0(tm1 tm1Var) {
        this.a = tm1Var;
        Boolean bool = Boolean.FALSE;
        this.d = ad4.w(bool);
        this.e = ad4.w(bool);
        this.f = ad4.w(bool);
    }

    @Override // defpackage.gc4
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.gc4
    public final /* synthetic */ boolean c() {
        return true;
    }

    @Override // defpackage.gc4
    public final Object d(d53 d53Var, hn1 hn1Var, gj0 gj0Var) {
        Object o0 = i42.o0(new o1(this, d53Var, hn1Var, null, (byte) 6), gj0Var);
        return o0 == el0.I ? o0 : wd5.a;
    }

    @Override // defpackage.gc4
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
