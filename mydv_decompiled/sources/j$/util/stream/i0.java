package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class i0 extends j0 {
    public static final d0 c;
    public static final d0 d;

    static {
        z6 z6Var = z6.REFERENCE;
        f0 f0Var = new f0((byte) 4);
        f0 f0Var2 = new f0((byte) 5);
        j$.util.a0 a0Var = j$.util.a0.b;
        c = new d0(true, z6Var, a0Var, f0Var, f0Var2);
        d = new d0(false, z6Var, a0Var, new f0((byte) 4), new f0((byte) 5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.a0(this.b);
        }
        return null;
    }
}
