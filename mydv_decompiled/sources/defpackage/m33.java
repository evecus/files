package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m33 extends km0 {
    public final void g(jp3 jp3Var, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long a = jp3Var.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (a >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & a));
    }
}
