package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yk implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ yk(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                kl klVar = (kl) obj;
                if ((klVar.F0 & 1) != 0) {
                    klVar.u(0);
                }
                if ((klVar.F0 & 4096) != 0) {
                    klVar.u(108);
                }
                klVar.E0 = false;
                klVar.F0 = 0;
                break;
            default:
                ((tl1) obj).e(true);
                break;
        }
    }
}
