package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ne implements tm1 {
    public static final ne J = new ne(0);
    public static final ne K = new ne(1);
    public static final ne L = new ne(2);
    public static final ne M = new ne(3);
    public static final ne N = new ne(4);
    public static final ne O = new ne(5);
    public static final ne P = new ne(6);
    public static final ne Q = new ne(7);
    public final /* synthetic */ byte I;

    public /* synthetic */ ne(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return wd5Var;
            case 1:
                float[] fArr = ((nw2) obj).a;
                return wd5Var;
            case 2:
                ((Number) obj).intValue();
                return null;
            case 3:
                return Boolean.valueOf(((kq1) obj) instanceof z6);
            case 4:
                return Boolean.valueOf(((kq1) obj) instanceof rt);
            case 5:
                return Boolean.valueOf(((kq1) obj) instanceof rt);
            case 6:
                return Boolean.valueOf(((kq1) obj) instanceof st);
            default:
                return Boolean.valueOf(((kq1) obj) instanceof z6);
        }
    }
}
