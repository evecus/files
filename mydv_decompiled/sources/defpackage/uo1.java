package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uo1 implements az2 {
    public static final uo1 b = new uo1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ uo1(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.az2
    public final i04 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!ap1.class.isAssignableFrom(cls)) {
                    s83.t("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (i04) ap1.d(cls.asSubclass(ap1.class)).c(3);
                } catch (Exception e) {
                    s83.p("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.az2
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ap1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
