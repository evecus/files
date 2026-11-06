package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ba0 implements uw2, p74 {
    public final mp a;
    public final tv b;

    public ba0(mp mpVar, tv tvVar) {
        this.a = mpVar;
        this.b = tvVar;
    }

    @Override // defpackage.p74
    public final void a(int i, int[] iArr, int[] iArr2, ww2 ww2Var) {
        this.a.e(ww2Var, i, iArr, iArr2);
    }

    @Override // defpackage.p74
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? eh0.a(0, i3, i, i2) : o7.u(0, i3, i, i2);
    }

    @Override // defpackage.p74
    public final vw2 c(final bn3[] bn3VarArr, final ww2 ww2Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return ww2Var.A(i2, i, p91.I, new tm1() { // from class: aa0
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3 an3Var = (an3) obj;
                bn3[] bn3VarArr2 = bn3VarArr;
                int length = bn3VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    bn3 bn3Var = bn3VarArr2[i6];
                    int i8 = i7 + 1;
                    bn3Var.getClass();
                    Object z = bn3Var.z();
                    q74 q74Var = z instanceof q74 ? (q74) z : null;
                    da2 layoutDirection = ww2Var.getLayoutDirection();
                    wl0 wl0Var = q74Var != null ? q74Var.c : null;
                    int i9 = i2;
                    an3.g(an3Var, bn3Var, wl0Var != null ? wl0Var.a(i9, bn3Var.I, layoutDirection) : this.b.a(bn3Var.I, i9, layoutDirection), iArr[i7]);
                    i6++;
                    i7 = i8;
                }
                return wd5.a;
            }
        });
    }

    @Override // defpackage.p74
    public final int d(bn3 bn3Var) {
        return bn3Var.I;
    }

    @Override // defpackage.p74
    public final int e(bn3 bn3Var) {
        return bn3Var.J;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return this.a.equals(ba0Var.a) && this.b.equals(ba0Var.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return k21.j(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        return k21.k(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        return vt0.I(this, dh0.i(j), dh0.j(j), dh0.g(j), dh0.h(j), ww2Var.X(this.a.b()), ww2Var, list, new bn3[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return k21.l(list, i, b42Var.X(this.a.b()));
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return k21.m(list, i, b42Var.X(this.a.b()));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
