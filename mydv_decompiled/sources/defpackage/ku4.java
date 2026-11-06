package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ku4 implements ve1 {
    public final float a;
    public final float b;
    public final Object c;

    public ku4(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.bj
    public final xh5 a(ub5 ub5Var) {
        Object obj = this.c;
        return new ep(this.a, this.b, obj == null ? null : (hj) ub5Var.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ku4) {
            ku4 ku4Var = (ku4) obj;
            if (ku4Var.a == this.a && ku4Var.b == this.b && j42.c(ku4Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.floatToIntBits(this.b) + jp0.o(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ ku4(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
