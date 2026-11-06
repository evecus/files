package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(z50.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(cz czVar, h00 h00Var, long j, long j2, int i) {
        kh4 kh4Var;
        long j3 = j;
        long j4 = j2;
        h00Var.getClass();
        long j5 = i;
        o7.j(h00Var.d(), 0L, j5);
        if (i <= 0) {
            s83.t("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            s83.h(r7.A("fromIndex < 0: ", j3));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder A = hf1.A(j3, "fromIndex > toIndex: ", " > ");
            A.append(j4);
            throw new IllegalArgumentException(A.toString().toString());
        }
        long j6 = czVar.J;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (kh4Var = czVar.I) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                kh4Var = kh4Var.g;
                kh4Var.getClass();
                j6 -= kh4Var.c - kh4Var.b;
            }
            byte[] h = h00Var.h();
            byte b2 = h[0];
            long min = Math.min(j4, (czVar.J - j5) + 1);
            while (j6 < min) {
                byte[] bArr = kh4Var.a;
                int min2 = (int) Math.min(kh4Var.c, (kh4Var.b + min) - j6);
                for (int i2 = (int) ((kh4Var.b + j3) - j6); i2 < min2; i2++) {
                    if (bArr[i2] == b2 && b(kh4Var, i2 + 1, h, 1, i)) {
                        return (i2 - kh4Var.b) + j6;
                    }
                }
                j6 += kh4Var.c - kh4Var.b;
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + (kh4Var.c - kh4Var.b);
            if (j8 > j3) {
                break;
            }
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j7 = j8;
        }
        byte[] h2 = h00Var.h();
        byte b3 = h2[0];
        long min3 = Math.min(j4, (czVar.J - j5) + 1);
        while (j7 < min3) {
            byte[] bArr2 = kh4Var.a;
            int min4 = (int) Math.min(kh4Var.c, (kh4Var.b + min3) - j7);
            for (int i3 = (int) ((kh4Var.b + j3) - j7); i3 < min4; i3++) {
                if (bArr2[i3] == b3 && b(kh4Var, i3 + 1, h2, 1, i)) {
                    return (i3 - kh4Var.b) + j7;
                }
            }
            j7 += kh4Var.c - kh4Var.b;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(kh4 kh4Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = kh4Var.c;
        byte[] bArr2 = kh4Var.a;
        while (i2 < i3) {
            if (i == i4) {
                kh4Var = kh4Var.f;
                kh4Var.getClass();
                byte[] bArr3 = kh4Var.a;
                bArr2 = bArr3;
                i = kh4Var.b;
                i4 = kh4Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(cz czVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (czVar.y(j2) == 13) {
                String O = czVar.O(j2, z50.a);
                czVar.skip(2L);
                return O;
            }
        }
        String O2 = czVar.O(j, z50.a);
        czVar.skip(1L);
        return O2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(defpackage.cz r16, defpackage.mg3 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(cz, mg3, boolean):int");
    }
}
