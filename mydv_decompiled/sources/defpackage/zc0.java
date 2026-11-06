package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zc0 implements in1 {
    public static final zc0 J = new zc0(0);
    public static final zc0 K = new zc0(1);
    public final /* synthetic */ byte I;

    public /* synthetic */ zc0(byte b) {
        this.I = b;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                break;
            default:
                y31 y31Var = (y31) obj;
                long j = ((pd3) obj2).a;
                long j2 = ((x70) obj3).a;
                fr4 fr4Var = fr4.a;
                r7.g(y31Var, j2, y31Var.P(fr4.c) / 2.0f, j, 0.0f, 120);
                break;
        }
        return wd5Var;
    }
}
