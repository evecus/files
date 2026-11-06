package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yy implements g55 {
    public final xm4 a;
    public final float b;

    public yy(xm4 xm4Var, float f) {
        this.a = xm4Var;
        this.b = f;
    }

    @Override // defpackage.g55
    public final long a() {
        int i = x70.h;
        return x70.g;
    }

    @Override // defpackage.g55
    public final /* synthetic */ g55 b(g55 g55Var) {
        return hf1.d(this, g55Var);
    }

    @Override // defpackage.g55
    public final g55 c(rm1 rm1Var) {
        return !equals(f55.a) ? this : (g55) rm1Var.invoke();
    }

    @Override // defpackage.g55
    public final wy d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy)) {
            return false;
        }
        yy yyVar = (yy) obj;
        return this.a.equals(yyVar.a) && Float.compare(this.b, yyVar.b) == 0;
    }

    @Override // defpackage.g55
    public final float getAlpha() {
        return this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
