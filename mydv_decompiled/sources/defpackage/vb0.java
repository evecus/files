package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vb0 extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(byte b) {
        super("Context cannot be null");
        switch (b) {
            case 5:
                super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
                break;
            default:
                break;
        }
    }

    public vb0(String str) {
        super(str);
    }

    public /* synthetic */ vb0(String str, Throwable th) {
        super(str, th);
    }

    public vb0(Throwable th) {
        super(th);
    }
}
