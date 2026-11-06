package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z43 extends ss4 {
    public final jk3 b;

    public z43(Object obj) {
        super((byte) 1);
        this.b = ad4.w(obj);
        ad4.w(obj);
    }

    @Override // defpackage.ss4
    public final Object d() {
        return this.b.getValue();
    }

    @Override // defpackage.ss4
    public final void g(Object obj) {
        this.b.setValue(obj);
    }
}
