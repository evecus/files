package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nm0 implements tm1 {
    public static final nm0 J = new nm0(0);
    public static final nm0 K = new nm0(1);
    public final /* synthetic */ byte I;

    public /* synthetic */ nm0(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        switch (this.I) {
            case 0:
                float[] fArr = ((nw2) obj).a;
                return wd5.a;
            default:
                if (j42.c(obj, Boolean.FALSE)) {
                    return new x70(x70.g);
                }
                obj.getClass();
                return new x70(qb.i(((Integer) obj).intValue()));
        }
    }
}
