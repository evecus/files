package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gt0 implements ur5 {
    public static final gt0 b = new gt0(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ gt0(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.ur5
    public final qr5 a(Class cls) {
        switch (this.a) {
            case 0:
                return rt0.l(cls);
            default:
                return new eq2();
        }
    }

    @Override // defpackage.ur5
    public final qr5 b(Class cls, l33 l33Var) {
        switch (this.a) {
        }
        return a(cls);
    }

    @Override // defpackage.ur5
    public final /* synthetic */ qr5 c(k60 k60Var, l33 l33Var) {
        byte b2 = this.a;
        return hf1.b(this, k60Var, l33Var);
    }
}
