package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sx implements uw2 {
    public final u8 a;
    public final boolean b;

    public sx(u8 u8Var, boolean z) {
        this.a = u8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return j42.c(this.a, sxVar.a) && this.b == sxVar.b;
    }

    public final int hashCode() {
        return pt1.o(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        return i82.m(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(final ww2 ww2Var, final List list, long j) {
        int j2;
        int i;
        bn3 u;
        boolean isEmpty = list.isEmpty();
        p91 p91Var = p91.I;
        if (isEmpty) {
            return ww2Var.A(dh0.j(j), dh0.i(j), p91Var, new q4((byte) 14));
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final pw2 pw2Var = (pw2) list.get(0);
            Object z = pw2Var.z();
            kx kxVar = z instanceof kx ? (kx) z : null;
            if (kxVar != null ? kxVar.J : false) {
                j2 = dh0.j(j);
                i = dh0.i(j);
                int j4 = dh0.j(j);
                int i2 = dh0.i(j);
                if (!((i2 >= 0) & (j4 >= 0))) {
                    s02.a("width and height must be >= 0");
                }
                u = pw2Var.u(eh0.h(j4, j4, i2, i2));
            } else {
                u = pw2Var.u(j3);
                j2 = Math.max(dh0.j(j), u.I);
                i = Math.max(dh0.i(j), u.J);
            }
            final int i3 = i;
            final int i4 = j2;
            final bn3 bn3Var = u;
            return ww2Var.A(i4, i3, p91Var, new tm1() { // from class: qx
                @Override // defpackage.tm1
                public final Object invoke(Object obj) {
                    px.d((an3) obj, bn3.this, pw2Var, ww2Var.getLayoutDirection(), i4, i3, this.a);
                    return wd5.a;
                }
            });
        }
        final bn3[] bn3VarArr = new bn3[list.size()];
        final p24 p24Var = new p24();
        p24Var.I = dh0.j(j);
        final p24 p24Var2 = new p24();
        p24Var2.I = dh0.i(j);
        int size = list.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            pw2 pw2Var2 = (pw2) list.get(i5);
            Object z3 = pw2Var2.z();
            kx kxVar2 = z3 instanceof kx ? (kx) z3 : null;
            if (kxVar2 != null ? kxVar2.J : false) {
                z2 = true;
            } else {
                bn3 u2 = pw2Var2.u(j3);
                bn3VarArr[i5] = u2;
                p24Var.I = Math.max(p24Var.I, u2.I);
                p24Var2.I = Math.max(p24Var2.I, u2.J);
            }
        }
        if (z2) {
            int i6 = p24Var.I;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = p24Var2.I;
            long a = eh0.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                pw2 pw2Var3 = (pw2) list.get(i9);
                Object z4 = pw2Var3.z();
                kx kxVar3 = z4 instanceof kx ? (kx) z4 : null;
                if (kxVar3 != null ? kxVar3.J : false) {
                    bn3VarArr[i9] = pw2Var3.u(a);
                }
            }
        }
        return ww2Var.A(p24Var.I, p24Var2.I, p91Var, new tm1() { // from class: rx
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3 an3Var = (an3) obj;
                bn3[] bn3VarArr2 = bn3VarArr;
                int length = bn3VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    bn3 bn3Var2 = bn3VarArr2[i11];
                    bn3Var2.getClass();
                    px.d(an3Var, bn3Var2, (pw2) list.get(i12), ww2Var.getLayoutDirection(), p24Var.I, p24Var2.I, this.a);
                    i11++;
                    i10 = i12 + 1;
                }
                return wd5.a;
            }
        });
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, List list, int i) {
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, List list, int i) {
        return i82.s(this, b42Var, list, i);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
