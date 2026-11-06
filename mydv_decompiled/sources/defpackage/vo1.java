package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vo1 implements bz2 {
    public static final vo1 b = new vo1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ vo1(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.bz2
    public final j04 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!bp1.class.isAssignableFrom(cls)) {
                    s83.t("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (j04) bp1.e(cls.asSubclass(bp1.class)).d(3);
                } catch (Exception e) {
                    s83.p("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.bz2
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return bp1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
