package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w81 {
    public byte a = 1;
    public final jz2 b;
    public jz2 c;
    public jz2 d;
    public int e;
    public int f;

    public w81(jz2 jz2Var) {
        this.b = jz2Var;
        this.c = jz2Var;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        hz2 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || b.b.get(a + b.a) == 0) || this.e == 65039;
    }
}
