package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bc implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bc(l13 l13Var, int i, int i2) {
        this.I = (byte) 0;
        this.K = l13Var;
        this.J = i2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        boolean z = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ec.b((l13) obj3, (fe0) obj, mu0.X(1), z ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                c5.b((String) obj3, z, (fe0) obj, mu0.X(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c5.k((u45) obj3, z, (fe0) obj, mu0.X(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mw3.g(z, (rm1) obj3, (fe0) obj, mu0.X(1));
                break;
            default:
                y31 y31Var = (y31) obj;
                fr4 fr4Var = fr4.a;
                long a = ((yq4) obj3).a(z, true);
                float f = fr4.b;
                r7.g(y31Var, a, y31Var.P(f) / 2.0f, ((pd3) obj2).a, 0.0f, 120);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ bc(yq4 yq4Var, boolean z) {
        this.I = (byte) 4;
        this.K = yq4Var;
        this.J = z;
    }

    public /* synthetic */ bc(Object obj, boolean z, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = z;
    }

    public /* synthetic */ bc(boolean z, rm1 rm1Var, int i) {
        this.I = (byte) 3;
        this.J = z;
        this.K = rm1Var;
    }
}
