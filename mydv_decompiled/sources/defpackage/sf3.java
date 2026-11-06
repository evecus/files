package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sf3 extends jg3 {
    public static final sf3 c = new sf3(1, 0, 2);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        int[] iArr;
        bo1 bo1Var;
        int c2;
        int c3 = mo1Var.c(0);
        if (wr4Var.n != 0) {
            ke0.a("Cannot move a group while inserting");
        }
        if (c3 < 0) {
            ke0.a("Parameter offset is out of bounds");
        }
        if (c3 == 0) {
            return;
        }
        int i = wr4Var.t;
        int i2 = wr4Var.v;
        int i3 = wr4Var.u;
        int i4 = i;
        while (true) {
            iArr = wr4Var.b;
            if (c3 <= 0) {
                break;
            }
            i4 += iArr[(wr4Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                ke0.a("Parameter offset is out of bounds");
            }
            c3--;
        }
        int i5 = iArr[(wr4Var.q(i4) * 5) + 3];
        int f = wr4Var.f(wr4Var.q(wr4Var.t), wr4Var.b);
        int f2 = wr4Var.f(wr4Var.q(i4), wr4Var.b);
        int i6 = i4 + i5;
        int f3 = wr4Var.f(wr4Var.q(i6), wr4Var.b);
        int i7 = f3 - f2;
        wr4Var.w(i7, Math.max(wr4Var.t - 1, 0));
        wr4Var.v(i5);
        int[] iArr2 = wr4Var.b;
        int q = wr4Var.q(i6) * 5;
        dq.O0(wr4Var.q(i) * 5, q, (i5 * 5) + q, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = wr4Var.c;
            int g = wr4Var.g(f2 + i7);
            System.arraycopy(objArr, g, objArr, f, wr4Var.g(f3 + i7) - g);
        }
        int i8 = f2 + i7;
        int i9 = i8 - f;
        int i10 = wr4Var.k;
        int i11 = wr4Var.l;
        int length = wr4Var.c.length;
        int i12 = wr4Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int q2 = wr4Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(q2 * 5) + 4] = wr4.h(wr4.h(wr4Var.f(q2, iArr2) - i15, i12 < q2 ? 0 : i10, i11, length), wr4Var.k, wr4Var.l, wr4Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int o = wr4Var.o();
        int b = vr4.b(wr4Var.d, i6, o);
        ArrayList arrayList = new ArrayList();
        if (b >= 0) {
            while (b < wr4Var.d.size() && (c2 = wr4Var.c((bo1Var = (bo1) wr4Var.d.get(b)))) >= i6 && c2 < i16) {
                arrayList.add(bo1Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            bo1 bo1Var2 = (bo1) arrayList.get(i18);
            int c4 = wr4Var.c(bo1Var2) + i17;
            if (c4 >= wr4Var.g) {
                bo1Var2.a = -(o - c4);
            } else {
                bo1Var2.a = c4;
            }
            wr4Var.d.add(vr4.b(wr4Var.d, c4, o), bo1Var2);
        }
        if (wr4Var.J(i6, i5)) {
            ke0.a("Unexpectedly removed anchors");
        }
        wr4Var.l(i2, wr4Var.u, i);
        if (i7 > 0) {
            wr4Var.K(i8, i7, i6 - 1);
        }
    }
}
