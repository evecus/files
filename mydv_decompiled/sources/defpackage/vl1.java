package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class vl1 implements ur5 {
    public static vl1 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ vl1(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.ur5
    public qr5 a(Class cls) {
        switch (this.a) {
            case 0:
                return new wl1(true);
            case 1:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return rt0.l(cls);
        }
    }

    @Override // defpackage.ur5
    public qr5 b(Class cls, l33 l33Var) {
        switch (this.a) {
            case 0:
                return a(cls);
            case 1:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }

    @Override // defpackage.ur5
    public final qr5 c(k60 k60Var, l33 l33Var) {
        switch (this.a) {
            case 0:
                return hf1.b(this, k60Var, l33Var);
            case 1:
                return new s94();
            default:
                return b(sv2.B(k60Var), l33Var);
        }
    }
}
