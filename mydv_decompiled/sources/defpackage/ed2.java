package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ed2 extends px3 {
    public final /* synthetic */ byte J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed2(ar2 ar2Var) {
        super(ar2Var, o7.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.J = (byte) 3;
    }

    @Override // defpackage.c82
    public final Object get() {
        switch (this.J) {
            case 0:
                return ((cw4) this.receiver).getValue();
            case 1:
                return ((cw4) this.receiver).getValue();
            case 2:
                return ((cw4) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed2(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.J = b;
    }
}
