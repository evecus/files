package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tb0 implements fj0 {
    public static final tb0 J = new tb0(0);
    public static final tb0 K = new tb0(1);
    public final /* synthetic */ byte I;

    public /* synthetic */ tb0(byte b) {
        this.I = b;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        switch (this.I) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return l91.I;
        }
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        switch (this.I) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.I) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
