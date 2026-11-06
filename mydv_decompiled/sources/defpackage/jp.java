package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class jp implements ip, mp, sk0, ni0 {
    public final /* synthetic */ byte I;

    public /* synthetic */ jp(byte b) {
        this.I = b;
    }

    public static sj2 A(List list) {
        return new sj2(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static sj2 B(uj3[] uj3VarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return v((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    public static long c(km0 km0Var, float f) {
        float[] fArr = km0Var.a;
        int i = 1;
        long a = rf1.a(fArr[0], fArr[1]);
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long c = km0Var.c(f4);
            float N = sp0.N(sp0.a0(c, a));
            if (N >= f3) {
                return rf1.a(f4 - ((1.0f - (f3 / N)) / 3.0f), f);
            }
            f3 -= N;
            f2 += N;
            if (i == 3) {
                return rf1.a(1.0f, f2);
            }
            i++;
            a = c;
        }
    }

    public static n74 f(jp jpVar, List list, int i, int i2) {
        char c;
        long j;
        List list2;
        float f;
        ArrayList arrayList;
        char c2 = ' ';
        long j2 = 4294967295L;
        long floatToRawIntBits = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
        boolean z = (i2 & 8) == 0;
        jpVar.getClass();
        float f2 = 360.0f;
        if (z) {
            mk2 K = p70.K();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                char c3 = c2;
                cw2 cw2Var = (cw2) list.get(i3);
                jp jpVar2 = dw2.a;
                long e = pd3.e(cw2Var.a, floatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (e & r18)), Float.intBitsToFloat((int) (e >> c3)))) * 180.0f) / 3.1415927f));
                i3++;
                c2 = c3;
                j2 = j2;
            }
            c = c2;
            j = j2;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(pd3.d(pd3.e(((cw2) list.get(i4)).a, floatToRawIntBits))));
            }
            int i5 = i * 2;
            float f3 = 360.0f / i5;
            for (int i6 = 0; i6 < i5; i6++) {
                Iterator it = p70.S(list).iterator();
                while (((t22) it).K) {
                    int nextInt = ((l22) it).nextInt();
                    int i7 = i6 % 2;
                    if (i7 != 0) {
                        nextInt = (list.size() - 1) - nextInt;
                    }
                    if (nextInt > 0 || i7 == 0) {
                        jp jpVar3 = dw2.a;
                        double floatValue = (((i6 * f3) + (i7 == 0 ? ((Number) arrayList2.get(nextInt)).floatValue() : (((Number) arrayList2.get(0)).floatValue() * 2.0f) + (f3 - ((Number) arrayList2.get(nextInt)).floatValue()))) / f2) * 2.0f * 3.1415927f;
                        f = f2;
                        arrayList = arrayList2;
                        K.add(new cw2(pd3.f(pd3.g((Float.floatToRawIntBits((float) Math.sin(floatValue)) & j) | (Float.floatToRawIntBits((float) Math.cos(floatValue)) << c), ((Number) arrayList3.get(nextInt)).floatValue()), floatToRawIntBits), ((cw2) list.get(nextInt)).b));
                    } else {
                        f = f2;
                        arrayList = arrayList2;
                    }
                    f2 = f;
                    arrayList2 = arrayList;
                }
            }
            list2 = p70.D(K);
        } else {
            c = ' ';
            j = 4294967295L;
            float f4 = 3.1415927f;
            int size3 = list.size();
            u22 c0 = ut0.c0(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(p70.J(c0, 10));
            Iterator it2 = c0.iterator();
            while (((t22) it2).K) {
                int nextInt2 = ((l22) it2).nextInt();
                jp jpVar4 = dw2.a;
                int i8 = nextInt2 % size3;
                long e2 = pd3.e(((cw2) list.get(i8)).a, floatToRawIntBits);
                int i9 = (int) (e2 >> 32);
                double d = ((((nextInt2 / size3) * 360.0f) / i) / 360.0f) * 2.0f * f4;
                long j3 = floatToRawIntBits;
                int i10 = (int) (e2 & 4294967295L);
                arrayList4.add(new cw2(pd3.f((Float.floatToRawIntBits((Float.intBitsToFloat(i10) * ((float) Math.cos(d))) + (Float.intBitsToFloat(i9) * ((float) Math.sin(d)))) & 4294967295L) | (Float.floatToRawIntBits((Float.intBitsToFloat(i9) * ((float) Math.cos(d))) - (Float.intBitsToFloat(i10) * ((float) Math.sin(d)))) << 32), j3), ((cw2) list.get(i8)).b));
                floatToRawIntBits = j3;
                f4 = 3.1415927f;
            }
            list2 = arrayList4;
        }
        long j4 = floatToRawIntBits;
        int size4 = list2.size() * 2;
        float[] fArr = new float[size4];
        for (int i11 = 0; i11 < size4; i11++) {
            long j5 = ((cw2) list2.get(i11 / 2)).a;
            fArr[i11] = Float.intBitsToFloat((int) (i11 % 2 == 0 ? j5 >> c : j5 & j));
        }
        mk2 K2 = p70.K();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            K2.add(((cw2) it3.next()).b);
        }
        return rt0.e(fArr, ok0.b, p70.D(K2), Float.intBitsToFloat((int) (j4 >> c)), Float.intBitsToFloat((int) (j4 & j)));
    }

    public static h00 g(String str) {
        if (str.length() % 2 != 0) {
            s83.h("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (p70.L(str.charAt(i2 + 1)) + (p70.L(str.charAt(i2)) << 4));
        }
        return new h00(bArr);
    }

    public static h00 h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(z50.a);
        bytes.getClass();
        h00 h00Var = new h00(bytes);
        h00Var.K = str;
        return h00Var;
    }

    public static double i(double d, double d2, double d3, boolean z) {
        zs1 zs1Var = new zs1(o7.Q(d, d2, d3));
        double d4 = d3;
        while (true) {
            double d5 = zs1Var.c;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            zs1 zs1Var2 = new zs1(o7.Q(d, d2, d3));
            if (d5 < zs1Var2.c) {
                d4 = d3;
                zs1Var = zs1Var2;
            }
        }
        return d4;
    }

    public static lj0 j(double d) {
        return d == 1.5d ? new lj0(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new lj0(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new lj0(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new lj0(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new lj0(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new lj0(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new lj0(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new lj0(21.0d, 21.0d, 21.0d, 21.0d) : new lj0(d, d, 7.0d, 21.0d);
    }

    public static n74 k() {
        n74 n74Var = dw2.m;
        if (n74Var != null) {
            return n74Var;
        }
        n74 b = qi4.m(12, dw2.c).c(new z7(dw2.e, (byte) 1)).b();
        dw2.m = b;
        return b;
    }

    public static n74 m() {
        n74 n74Var = dw2.l;
        if (n74Var != null) {
            return n74Var;
        }
        n74 b = qi4.m(9, dw2.c).c(new z7(dw2.e, (byte) 1)).b();
        dw2.l = b;
        return b;
    }

    public static double n(zs1 zs1Var, boolean z, j51 j51Var) {
        double o = o(zs1Var);
        return j51Var == j51.K ? z ? (o < 105.0d || o >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    public static double o(zs1 zs1Var) {
        return ut0.F(zs1Var, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    public static n74 r() {
        n74 n74Var = dw2.j;
        if (n74Var != null) {
            return n74Var;
        }
        n74 b = qi4.m(8, dw2.b).b();
        dw2.j = b;
        return b;
    }

    public static double s(zs1 zs1Var, j51 j51Var) {
        double t = t(zs1Var);
        int i = 28;
        if (j51Var != j51.K && (t < 250.0d || t >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    public static double t(zs1 zs1Var) {
        return ut0.F(zs1Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    public static sj2 u(uj3[] uj3VarArr) {
        return v((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)));
    }

    public static sj2 v(uj3[] uj3VarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(uj3VarArr.length);
        for (uj3 uj3Var : uj3VarArr) {
            x70 x70Var = (x70) uj3Var.J;
            long j3 = x70Var.a;
            arrayList.add(x70Var);
        }
        ArrayList arrayList2 = new ArrayList(uj3VarArr.length);
        for (uj3 uj3Var2 : uj3VarArr) {
            arrayList2.add(Float.valueOf(((Number) uj3Var2.I).floatValue()));
        }
        return new sj2(arrayList, arrayList2, j, j2);
    }

    public static h00 w(byte[] bArr) {
        h00 h00Var = h00.L;
        int length = bArr.length;
        o7.j(bArr.length, 0L, length);
        return new h00(dq.V0(bArr, 0, length));
    }

    public static double x(k85 k85Var) {
        return y(k85Var, 0.0d, 100.0d);
    }

    public static double y(k85 k85Var, double d, double d2) {
        return ut0.p(i(k85Var.a, k85Var.b * 1.0d, 100.0d, true), d, d2);
    }

    public static double z(k85 k85Var, double d, double d2) {
        return ut0.p(i(k85Var.a, k85Var.b, 0.0d, false), d, d2);
    }

    @Override // defpackage.ni0
    public long a(long j, long j2) {
        switch (this.I) {
            case 12:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = ha4.a;
                return floatToRawIntBits;
            case 13:
                float l0 = i42.l0(j, j2);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(l0) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L);
                int i2 = ha4.a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i3 = ha4.a;
                    return floatToRawIntBits3;
                }
                float l02 = i42.l0(j, j2);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(l02) << 32) | (Float.floatToRawIntBits(l02) & 4294967295L);
                int i4 = ha4.a;
                return floatToRawIntBits4;
        }
    }

    @Override // defpackage.ip, defpackage.mp
    public float b() {
        switch (this.I) {
        }
        return 0.0f;
    }

    @Override // defpackage.ip
    public void d(iu0 iu0Var, int i, int[] iArr, da2 da2Var, int[] iArr2) {
        byte b = this.I;
        da2 da2Var2 = da2.I;
        int i2 = 0;
        switch (b) {
            case 0:
                if (da2Var == da2Var2) {
                    i42.I0(i, iArr, iArr2, false);
                    break;
                } else {
                    i42.I0(i, iArr, iArr2, true);
                    break;
                }
            default:
                if (da2Var == da2Var2) {
                    int length = iArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        int i5 = iArr[i2];
                        iArr2[i3] = i4;
                        i4 += i5;
                        i2++;
                        i3++;
                    }
                    break;
                } else {
                    int length2 = iArr.length;
                    int i6 = 0;
                    while (i2 < length2) {
                        i6 += iArr[i2];
                        i2++;
                    }
                    int i7 = i - i6;
                    for (int length3 = iArr.length - 1; -1 < length3; length3--) {
                        int i8 = iArr[length3];
                        iArr2[length3] = i7;
                        i7 += i8;
                    }
                    break;
                }
        }
    }

    @Override // defpackage.mp
    public void e(iu0 iu0Var, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.I) {
            case 0:
                i42.I0(i, iArr, iArr2, false);
                break;
            default:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
        }
    }

    public n74 l() {
        n74 n74Var = dw2.k;
        if (n74Var != null) {
            return n74Var;
        }
        n74 b = f(this, p70.k0(new cw2((Float.floatToRawIntBits(1.237f) << 32) | (Float.floatToRawIntBits(1.236f) & 4294967295L), new ok0(0.258f, 2)), new cw2((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.918f) & 4294967295L), new ok0(0.233f, 2))), 4, 12).b();
        dw2.k = b;
        return b;
    }

    public Signature[] p(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public n74 q() {
        n74 n74Var = dw2.o;
        if (n74Var != null) {
            return n74Var;
        }
        n74 b = f(this, p70.k0(new cw2((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & 4294967295L), new ok0(0.053f, 2)), new cw2((Float.floatToRawIntBits(0.176f) << 32) | (4294967295L & Float.floatToRawIntBits(0.055f)), new ok0(0.053f, 2))), 10, 12).b();
        dw2.o = b;
        return b;
    }

    public String toString() {
        switch (this.I) {
            case 0:
                return "Arrangement#SpaceBetween";
            case 1:
                return "Arrangement#Start";
            case 2:
                return "Arrangement#Top";
            case 10:
                return "Empty";
            case 11:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
