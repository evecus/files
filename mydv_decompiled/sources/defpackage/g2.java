package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g2 extends Throwable {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2() {
        super("Failure occurred while trying to finish a future.");
        this.I = (byte) 0;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.I) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            default:
                c();
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(String str, byte b) {
        super(str);
        this.I = b;
    }
}
