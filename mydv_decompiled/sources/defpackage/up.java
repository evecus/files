package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class up extends gz1 {
    public final /* synthetic */ byte L;
    public final /* synthetic */ yp M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(yp ypVar, byte b) {
        super(ypVar.K);
        this.L = b;
        switch (b) {
            case 1:
                this.M = ypVar;
                super(ypVar.K);
                break;
            default:
                this.M = ypVar;
                break;
        }
    }

    @Override // defpackage.gz1
    public final Object a(int i) {
        byte b = this.L;
        yp ypVar = this.M;
        switch (b) {
            case 0:
                return ypVar.e(i);
            default:
                return ypVar.h(i);
        }
    }

    @Override // defpackage.gz1
    public final void b(int i) {
        byte b = this.L;
        yp ypVar = this.M;
        switch (b) {
            case 0:
                ypVar.f(i);
                break;
            default:
                ypVar.f(i);
                break;
        }
    }
}
