package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hh extends r92 implements tm1 {
    public static final hh K;
    public static final hh L;
    public static final hh M;
    public static final hh N;
    public static final hh O;
    public static final hh P;
    public static final hh Q;
    public final /* synthetic */ byte J;

    static {
        int i = 1;
        K = new hh((byte) 0, i);
        L = new hh((byte) 1, i);
        M = new hh((byte) 2, i);
        N = new hh((byte) 3, i);
        O = new hh((byte) 4, i);
        P = new hh((byte) 5, i);
        Q = new hh((byte) 6, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(byte b, int i) {
        super(i);
        this.J = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        switch (this.J) {
            case 0:
                return null;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                long b = x70.b(((x70) obj).a, z80.x);
                return new gj(x70.d(b), x70.h(b), x70.g(b), x70.e(b));
            case 3:
                long j = ((r95) obj).a;
                return new ej(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 4:
                ej ejVar = (ej) obj;
                return new r95(wi4.a(ejVar.a, ejVar.b));
            case 5:
                long j2 = ((z22) obj).a;
                return new r22(0L);
            default:
                return wd5.a;
        }
    }
}
