package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i51 extends xx3 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i51(rm1 rm1Var, byte b) {
        super(rm1Var);
        this.b = b;
    }

    @Override // defpackage.xx3
    public final ay3 a(Object obj) {
        switch (this.b) {
            case 0:
                return new ay3(this, obj, obj == null, q8.B0, null, true);
            default:
                return new ay3(this, obj, obj == null, null, null, false);
        }
    }
}
