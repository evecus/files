package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class on4 {
    public final jk3 a;
    public final jk3 b;
    public final s95 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public li5 j;

    public on4() {
        Boolean bool = Boolean.FALSE;
        this.a = ad4.w(bool);
        this.b = ad4.w(bool);
        this.c = new s95();
        this.d = t13.b();
        this.e = x70.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = r95.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        jk3 jk3Var = this.a;
        boolean booleanValue = ((Boolean) jk3Var.getValue()).booleanValue();
        jk3 jk3Var2 = this.b;
        if (booleanValue && !z) {
            jk3Var2.setValue(Boolean.TRUE);
        } else if (z) {
            jk3Var2.setValue(Boolean.FALSE);
        }
        jk3Var.setValue(Boolean.valueOf(z));
    }
}
