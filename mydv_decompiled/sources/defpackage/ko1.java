package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ko1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final q33 e;
    public final u05 f;

    public ko1(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            jr3.a("Invalid start index");
        }
        this.d = new ArrayList();
        q33 q33Var = new q33();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            r82 r82Var = (r82) this.a.get(i3);
            int i4 = r82Var.c;
            int i5 = r82Var.d;
            q33Var.i(i4, new zr1(i3, i2, i5));
            i2 += i5;
        }
        this.e = q33Var;
        this.f = new u05(new jo1(this));
    }

    public final boolean a(int i, int i2) {
        zr1 zr1Var;
        int i3;
        int i4;
        q33 q33Var = this.e;
        zr1 zr1Var2 = (zr1) q33Var.b(i);
        if (zr1Var2 == null) {
            return false;
        }
        int i5 = zr1Var2.b;
        int i6 = i2 - zr1Var2.c;
        zr1Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = q33Var.c;
        long[] jArr = q33Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (zr1Var = (zr1) objArr[(i7 << 3) + i9]).b) >= i5 && zr1Var != zr1Var2 && (i4 = i3 + i6) >= 0) {
                        zr1Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
