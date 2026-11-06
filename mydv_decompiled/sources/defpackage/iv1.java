package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iv1 implements la2 {
    public final l45 a;
    public final int b;
    public final u95 c;
    public final rm1 d;

    public iv1(l45 l45Var, int i, u95 u95Var, rm1 rm1Var) {
        this.a = l45Var;
        this.b = i;
        this.c = u95Var;
        this.d = rm1Var;
    }

    @Override // defpackage.l13
    public final boolean all(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iv1) {
            iv1 iv1Var = (iv1) obj;
            if (this.a == iv1Var.a && this.b == iv1Var.b && this.c.equals(iv1Var.c) && j42.c(this.d, iv1Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.l13
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31)) * 31);
    }

    @Override // defpackage.la2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.h(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.k(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo48measure3p2s80s(final ww2 ww2Var, pw2 pw2Var, long j) {
        long j2;
        if (pw2Var.t(dh0.g(j)) < dh0.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = dh0.a(j2, 0, Log.LOG_LEVEL_OFF, 0, 0, 13);
        }
        final bn3 u = pw2Var.u(j);
        final int min = Math.min(u.I, dh0.h(j2));
        return ww2Var.A(min, u.J, p91.I, new tm1() { // from class: hv1
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3 an3Var = (an3) obj;
                iv1 iv1Var = iv1.this;
                int i = iv1Var.b;
                l45 l45Var = iv1Var.a;
                u95 u95Var = iv1Var.c;
                v55 v55Var = (v55) iv1Var.d.invoke();
                u55 u55Var = v55Var != null ? v55Var.a : null;
                boolean z = ww2Var.getLayoutDirection() == da2.J;
                bn3 bn3Var = u;
                l45Var.a(pg3.J, hc4.D(an3Var, i, u95Var, u55Var, z, bn3Var.I), min, bn3Var.I);
                an3.i(an3Var, bn3Var, Math.round(-l45Var.a.h()), 0);
                return wd5.a;
            }
        });
    }

    @Override // defpackage.la2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.n(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.q(this, b42Var, a42Var, i);
    }

    @Override // defpackage.l13
    public final /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
