package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class s extends z0 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, int i, byte b) {
        super(aVar, i);
        this.l = b;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new r(this, l5Var, (byte) 0);
            case 1:
                return new v0(this, l5Var, (byte) 2);
            case 2:
                return l5Var;
            case 3:
                return new v0(this, l5Var, (byte) 5);
            default:
                return new c1(this, l5Var, (byte) 2);
        }
    }
}
