package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class kg0 {
    public static final q33 a;

    static {
        v54 v54Var = z80.e;
        int i = v54Var.c;
        hg0 hg0Var = new hg0(v54Var, v54Var, 1);
        int i2 = v54Var.c;
        xd3 xd3Var = z80.x;
        int i3 = (xd3Var.c << 6) | i2;
        jg0 jg0Var = new jg0(v54Var, xd3Var, 0);
        int i4 = (i2 << 6) | xd3Var.c;
        jg0 jg0Var2 = new jg0(xd3Var, v54Var, 0);
        q33 q33Var = q22.a;
        q33 q33Var2 = new q33();
        q33Var2.i(i | (i << 6), hg0Var);
        q33Var2.i(i3, jg0Var);
        q33Var2.i(i4, jg0Var2);
        a = q33Var2;
    }
}
