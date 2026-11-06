package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wb0 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ nk J;

    public /* synthetic */ wb0(nk nkVar, byte b) {
        this.I = b;
        this.J = nkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        nk nkVar = this.J;
        switch (b) {
            case 0:
                ic0.o(nkVar);
                break;
            default:
                nkVar.invalidateOptionsMenu();
                break;
        }
    }
}
