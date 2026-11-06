package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class au {
    public static final xt c = new xt(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new au(-1, true, false);
        new au(76, false, true);
        new au(64, false, true);
    }

    public au(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            s83.t("Failed requirement.");
            throw null;
        }
    }
}
