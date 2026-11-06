package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public enum bc2 implements l32 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public final int I;

    bc2(int i) {
        this.I = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.I;
        }
        s83.t("Can't get the number of an unknown enum value.");
        return 0;
    }
}
