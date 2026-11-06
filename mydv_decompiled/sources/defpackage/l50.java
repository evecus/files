package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l50 extends r50 {
    public static final l50 K = new l50("CharMatcher.any()", 0);
    public static final l50 L = new l50("CharMatcher.ascii()", 1);
    public static final l50 M = new l50("CharMatcher.javaIsoControl()", 2);
    public final /* synthetic */ byte J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l50(String str, byte b) {
        super(str);
        this.J = b;
    }

    @Override // defpackage.u50
    public final boolean b(char c) {
        switch (this.J) {
            case 0:
                break;
            case 1:
                if (c <= 127) {
                }
                break;
            default:
                if (c <= 31 || (c >= 127 && c <= 159)) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.n50, defpackage.u50
    public u50 c() {
        switch (this.J) {
            case 0:
                return t50.J;
            default:
                return super.c();
        }
    }
}
