package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zg5 extends fb4 {
    public final Object e;
    public final pi5 f;
    public final k04 g;

    public zg5(Object obj, pi5 pi5Var, k04 k04Var) {
        this.e = obj;
        this.f = pi5Var;
        this.g = k04Var;
    }

    @Override // defpackage.fb4
    public final fb4 S(String str, tm1 tm1Var) {
        Object obj = this.e;
        return ((Boolean) tm1Var.invoke(obj)).booleanValue() ? this : new dd1(obj, str, this.g, this.f);
    }

    @Override // defpackage.fb4
    public final Object i() {
        return this.e;
    }
}
