package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zi5 implements la2 {
    public final l45 a;
    public final int b;
    public final u95 c;
    public final rm1 d;

    public zi5(l45 l45Var, int i, u95 u95Var, rm1 rm1Var) {
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
        if (obj instanceof zi5) {
            zi5 zi5Var = (zi5) obj;
            if (this.a == zi5Var.a && this.b == zi5Var.b && this.c.equals(zi5Var.c) && j42.c(this.d, zi5Var.d)) {
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
    public final vw2 mo48measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(dh0.a(j, 0, 0, 0, Log.LOG_LEVEL_OFF, 7));
        int min = Math.min(u.J, dh0.g(j));
        return ww2Var.A(u.I, min, p91.I, new aq1(this, u, min));
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
