package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cg implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ cg(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    private final Object a(Object obj) {
        bg bgVar = (bg) this.J;
        dg dgVar = (dg) this.K;
        synchronized (bgVar.K) {
            bgVar.M.remove(dgVar);
        }
        return wd5.a;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long j;
        switch (this.I) {
            case 0:
                return a(obj);
            default:
                us4 us4Var = (us4) obj;
                synchronized (ws4.c) {
                    j = ws4.e;
                    ws4.e = 1 + j;
                }
                return new s43(j, us4Var, (tm1) this.J, (tm1) this.K);
        }
    }
}
