package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u74 implements uw2, p74 {
    public final ip a;
    public final uv b;

    public u74(ip ipVar, uv uvVar) {
        this.a = ipVar;
        this.b = uvVar;
    }

    @Override // defpackage.p74
    public final void a(int i, int[] iArr, int[] iArr2, ww2 ww2Var) {
        this.a.d(ww2Var, i, iArr, ww2Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.p74
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? eh0.a(i, i2, 0, i3) : o7.v(i, i2, 0, i3);
    }

    @Override // defpackage.p74
    public final vw2 c(bn3[] bn3VarArr, ww2 ww2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return ww2Var.A(i, i2, p91.I, new uu0(bn3VarArr, this, i2, iArr));
    }

    @Override // defpackage.p74
    public final int d(bn3 bn3Var) {
        return bn3Var.J;
    }

    @Override // defpackage.p74
    public final int e(bn3 bn3Var) {
        return bn3Var.I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u74)) {
            return false;
        }
        u74 u74Var = (u74) obj;
        return this.a.equals(u74Var.a) && j42.c(this.b, u74Var.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return k21.e(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        return k21.f(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        return vt0.I(this, dh0.j(j), dh0.i(j), dh0.h(j), dh0.g(j), ww2Var.X(this.a.b()), ww2Var, list, new bn3[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return k21.g(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return k21.h(list, i, b42Var.X(this.a.b()));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
