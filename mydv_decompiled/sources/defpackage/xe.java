package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xe implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ Object L;

    public /* synthetic */ xe(vd3 vd3Var, boolean z, boolean z2) {
        this.L = vd3Var;
        this.J = z;
        this.K = z2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.L;
        boolean z = this.K;
        boolean z2 = this.J;
        switch (b) {
            case 0:
                cj4 cj4Var = (cj4) obj;
                long a = ((vd3) obj2).a();
                cj4Var.c(fi4.a, new ei4(z2 ? is1.J : is1.K, a, z ? di4.I : di4.K, (9223372034707292159L & a) != 9205357640488583168L));
                break;
            default:
                n54 n54Var = (n54) obj;
                n54Var.getClass();
                r11 r11Var = (r11) ((cw4) obj2).getValue();
                float f = r11Var.I;
                r11 r11Var2 = new r11(0.0f);
                if (r11Var.compareTo(r11Var2) < 0) {
                    r11Var = r11Var2;
                }
                float f2 = r11Var.I;
                float f3 = z2 ? 12.0f : f2;
                if (z) {
                    f2 = 12.0f;
                }
                k74 k74Var = l74.a;
                n54Var.s(new k74(new s11(f3), new s11(f2), new s11(f2), new s11(f3)));
                n54Var.f(true);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ xe(boolean z, boolean z2, cw4 cw4Var) {
        this.J = z;
        this.K = z2;
        this.L = cw4Var;
    }
}
