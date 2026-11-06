package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x32 {
    public final int a;
    public final int b;
    public final ge2 c;

    public x32(int i, int i2, ge2 ge2Var) {
        this.a = i;
        this.b = i2;
        this.c = ge2Var;
        if (i < 0) {
            t02.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        t02.a("size should be > 0");
    }
}
