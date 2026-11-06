package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c92 implements u41 {
    public final b92 a;

    public c92(b92 b92Var) {
        this.a = b92Var;
    }

    public final b92 f() {
        return this.a;
    }

    @Override // defpackage.u41, defpackage.bj
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final di5 a(ub5 ub5Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        b92 b92Var = this.a;
        q33 q33Var = b92Var.b;
        p33 p33Var = new p33(q33Var.e + 2);
        q33 q33Var2 = new q33(q33Var.e);
        int[] iArr3 = q33Var.b;
        Object[] objArr3 = q33Var.c;
        long[] jArr = q33Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            a92 a92Var = (a92) objArr3[i6];
                            p33Var.c(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            q33Var2.i(i7, new ci5((hj) ub5Var.a.invoke(a92Var.a), a92Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!q33Var.a(0)) {
            int i8 = p33Var.b;
            if (i8 < 0) {
                zy.o("Index must be between 0 and size");
                return null;
            }
            p33Var.d(i8 + 1);
            int[] iArr4 = p33Var.a;
            int i9 = p33Var.b;
            if (i9 != 0) {
                dq.O0(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            p33Var.b++;
        }
        if (!q33Var.a(b92Var.a)) {
            p33Var.c(b92Var.a);
        }
        int i10 = p33Var.b;
        if (i10 != 0) {
            int[] iArr5 = p33Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new di5(p33Var, q33Var2, b92Var.a, m61.b);
    }
}
