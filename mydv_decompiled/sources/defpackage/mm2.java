package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mm2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ mm2(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((op2) obj).z();
                return wd5Var;
            case 1:
                ((op2) obj).z();
                return wd5Var;
            default:
                return new hh0[((zf1[]) obj).length];
        }
    }
}
