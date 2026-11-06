package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t23 implements uw2 {
    public final hh1 a;

    public t23(hh1 hh1Var) {
        this.a = hh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t23) && j42.c(this.a, ((t23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        ArrayList E = jl2.E(b42Var);
        hh1 hh1Var = this.a;
        fh1 fh1Var = hh1Var.f;
        List list2 = (List) o70.V0(1, E);
        a42 a42Var = list2 != null ? (a42) o70.U0(list2) : null;
        List list3 = (List) o70.V0(2, E);
        fh1Var.a(a42Var, list3 != null ? (a42) o70.U0(list3) : null, eh0.b(0, i, 0, 0, 13));
        List list4 = (List) o70.U0(E);
        if (list4 == null) {
            list4 = o91.I;
        }
        return hh1.f(list4, i, b42Var.X(hh1Var.c), b42Var.X(hh1Var.e), hh1Var.f);
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        ArrayList E = jl2.E(b42Var);
        hh1 hh1Var = this.a;
        fh1 fh1Var = hh1Var.f;
        List list2 = (List) o70.V0(1, E);
        a42 a42Var = list2 != null ? (a42) o70.U0(list2) : null;
        List list3 = (List) o70.V0(2, E);
        fh1Var.a(a42Var, list3 != null ? (a42) o70.U0(list3) : null, eh0.b(0, 0, 0, i, 7));
        List list4 = (List) o70.U0(E);
        if (list4 == null) {
            list4 = o91.I;
        }
        int X = b42Var.X(hh1Var.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int t = ((a42) list4.get(i2)).t(i) + X;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + t) - X);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += t;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0275  */
    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vw2 mo35measure3p2s80s(defpackage.ww2 r58, java.util.List r59, long r60) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t23.mo35measure3p2s80s(ww2, java.util.List, long):vw2");
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        ArrayList E = jl2.E(b42Var);
        hh1 hh1Var = this.a;
        fh1 fh1Var = hh1Var.f;
        List list2 = (List) o70.V0(1, E);
        a42 a42Var = list2 != null ? (a42) o70.U0(list2) : null;
        List list3 = (List) o70.V0(2, E);
        fh1Var.a(a42Var, list3 != null ? (a42) o70.U0(list3) : null, eh0.b(0, i, 0, 0, 13));
        List list4 = (List) o70.U0(E);
        if (list4 == null) {
            list4 = o91.I;
        }
        return hh1.f(list4, i, b42Var.X(hh1Var.c), b42Var.X(hh1Var.e), hh1Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0218 A[SYNTHETIC] */
    @Override // defpackage.uw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int minIntrinsicWidth(defpackage.b42 r36, java.util.List r37, int r38) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t23.minIntrinsicWidth(b42, java.util.List, int):int");
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
