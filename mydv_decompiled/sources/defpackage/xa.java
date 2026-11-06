package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xa extends tn1 implements rm1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(Runnable runnable) {
        super(0, runnable, Runnable.class, "run", "run()V", 0);
        this.I = (byte) 0;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Runnable) this.receiver).run();
                return wd5Var;
            case 1:
                return ((w25) this.receiver).G();
            default:
                a74 a74Var = (a74) this.receiver;
                dj0 dj0Var = a74Var.a;
                if (dj0Var == null) {
                    j42.g0("coroutineScope");
                    throw null;
                }
                i42.e0(dj0Var, null);
                a74Var.f();
                w64 w64Var = a74Var.d;
                if (w64Var != null) {
                    w64Var.f.close();
                    return wd5Var;
                }
                j42.g0("connectionManager");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.I = b;
    }
}
