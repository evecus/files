package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dw0(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.L = obj;
        this.J = i;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.K;
        byte b2 = this.J;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                ((ew0) obj2).c.e(b2, obj);
                break;
            default:
                ((ep) obj2).e(b2, obj);
                break;
        }
    }
}
