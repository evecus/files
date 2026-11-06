package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bm extends cl1 {
    public final /* synthetic */ hm R;
    public final /* synthetic */ km S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(km kmVar, km kmVar2, hm hmVar) {
        super(kmVar2);
        this.S = kmVar;
        this.R = hmVar;
    }

    @Override // defpackage.cl1
    public final xn4 b() {
        return this.R;
    }

    @Override // defpackage.cl1
    public final boolean c() {
        km kmVar = this.S;
        if (kmVar.getInternalPopup().b()) {
            return true;
        }
        kmVar.N.o(kmVar.getTextDirection(), kmVar.getTextAlignment());
        return true;
    }
}
