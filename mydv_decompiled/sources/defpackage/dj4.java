package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class dj4 {
    public static final Comparator[] a;
    public static final fa4 b;

    static {
        byte b2 = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new yc1(new yc1(i == 0 ? xi1.L : xi1.K, (byte) 1), b2);
            i++;
        }
        a = comparatorArr;
        b = new fa4((byte) 16);
    }

    public static final void a(si4 si4Var, ArrayList arrayList, v1 v1Var, v1 v1Var2, q33 q33Var) {
        List i;
        List i2;
        ki4 ki4Var = si4Var.d;
        Object g = ki4Var.I.g(zi4.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) v1Var2.invoke(si4Var)).booleanValue()) && ((Boolean) v1Var.invoke(si4Var)).booleanValue()) {
            arrayList.add(si4Var);
        }
        if (booleanValue) {
            int i3 = si4Var.f;
            i2 = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
            q33Var.i(i3, b(si4Var, v1Var, v1Var2, i2));
        } else {
            i = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
            int size = i.size();
            for (int i4 = 0; i4 < size; i4++) {
                a((si4) i.get(i4), arrayList, v1Var, v1Var2, q33Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[EDGE_INSN: B:30:0x00f4->B:31:0x00f4 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.si4 r18, defpackage.v1 r19, defpackage.v1 r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj4.b(si4, v1, v1, java.util.List):java.util.ArrayList");
    }
}
