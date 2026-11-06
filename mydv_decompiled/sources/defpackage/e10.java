package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e10 implements f10 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ e10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.f10
    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((tm1) obj).invoke(th);
                break;
            default:
                ((cy0) obj).dispose();
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((tm1) obj).getClass().getSimpleName() + '@' + o7.y(this) + ']';
            default:
                return "DisposeOnCancel[" + ((cy0) obj) + ']';
        }
    }
}
