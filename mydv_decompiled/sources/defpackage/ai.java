package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ai implements uh {
    public final ea5 a;
    public u8 b;
    public final jk3 c = ad4.w(new z22(0));
    public final n43 d;

    public ai(ea5 ea5Var, u8 u8Var) {
        this.a = ea5Var;
        this.b = u8Var;
        long[] jArr = ia4.a;
        this.d = new n43();
    }

    @Override // defpackage.uh
    public final si0 a(si0 si0Var, vq4 vq4Var) {
        si0Var.d = vq4Var;
        return si0Var;
    }

    @Override // defpackage.z95
    public final Object b() {
        return this.a.g().b();
    }

    @Override // defpackage.z95
    public final boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(d());
    }

    @Override // defpackage.z95
    public final Object d() {
        return this.a.g().d();
    }
}
