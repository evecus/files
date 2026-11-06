package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nh extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.J = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.J;
        Object obj2 = this.K;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                return new mh((gt4) obj2, obj4, (ai) obj3, (byte) 0);
            default:
                int ordinal = ((aa1) obj).ordinal();
                float f = 1.0f;
                if (ordinal == 0) {
                    cd1 cd1Var = ((ta1) obj2).a.a;
                    if (cd1Var != null) {
                        f = cd1Var.a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        s83.v();
                        return null;
                    }
                    cd1 cd1Var2 = ((bc1) obj4).a.a;
                    f = cd1Var2 != null ? cd1Var2.a : ((on4) obj3).f;
                }
                return Float.valueOf(f);
        }
    }
}
