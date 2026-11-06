package defpackage;

import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.TsExtractor;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ez2 implements ra4 {
    public static final int[] o = new int[0];
    public static final Unsafe p;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final s3 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final z93 k;
    public final qk2 l;
    public final ce5 m;
    public final iv2 n;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pe5((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        p = unsafe;
    }

    public ez2(int[] iArr, Object[] objArr, int i, int i2, s3 s3Var, boolean z, int[] iArr2, int i3, int i4, z93 z93Var, qk2 qk2Var, ce5 ce5Var, oc1 oc1Var, iv2 iv2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = s3Var instanceof bp1;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = z93Var;
        this.l = qk2Var;
        this.m = ce5Var;
        this.e = s3Var;
        this.n = iv2Var;
    }

    public static int C(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void F(int i, Object obj, uu2 uu2Var) {
        if (!(obj instanceof String)) {
            uu2Var.M(i, (f00) obj);
        } else {
            ((i70) uu2Var.I).E(i, (String) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ez2 t(defpackage.j04 r34, defpackage.z93 r35, defpackage.qk2 r36, defpackage.ce5 r37, defpackage.oc1 r38, defpackage.iv2 r39) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.t(j04, z93, qk2, ce5, oc1, iv2):ez2");
    }

    public static long u(int i) {
        return i & 1048575;
    }

    public static int v(long j, Object obj) {
        return ((Integer) we5.j(j, obj)).intValue();
    }

    public static long w(long j, Object obj) {
        return ((Long) we5.j(j, obj)).longValue();
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder E = r7.E("Field ", str, " for ");
            E.append(cls.getName());
            E.append(" not found. Known fields are ");
            E.append(Arrays.toString(declaredFields));
            throw new RuntimeException(E.toString());
        }
    }

    public final void A(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        we5.n(obj, j, we5.h(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void B(int i, int i2, Object obj) {
        we5.n(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int D(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.uu2 r22, int r23, java.lang.Object r24, int r25) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.E(uu2, int, java.lang.Object, int):void");
    }

    @Override // defpackage.ra4
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long D = D(iArr[i2]) & 1048575;
            Object j = we5.j(D, obj);
            if (j != null) {
                this.n.getClass();
                ((gv2) j).I = false;
                we5.p(obj, D, j);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        this.m.getClass();
        ((bp1) obj).unknownFields.e = false;
    }

    @Override // defpackage.ra4
    public final boolean b(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int D = D(i5);
            boolean z2 = this.g;
            if (z2) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & D) != 0) {
                if (!(z2 ? o(i5, obj) : (i4 & i) != 0)) {
                    break;
                }
            }
            int C = C(D);
            if (C == 9 || C == 17) {
                if (z2) {
                    z = o(i5, obj);
                } else if ((i & i4) == 0) {
                    z = false;
                }
                if (z && !n(i5).b(we5.j(D & 1048575, obj))) {
                    break;
                }
                i3++;
            } else {
                if (C != 27) {
                    if (C == 60 || C == 68) {
                        if (p(i6, i5, obj) && !n(i5).b(we5.j(D & 1048575, obj))) {
                            break;
                        }
                        i3++;
                    } else if (C != 49) {
                        if (C == 50) {
                            Object j = we5.j(D & 1048575, obj);
                            this.n.getClass();
                            gv2 gv2Var = (gv2) j;
                            if (!gv2Var.isEmpty() && ((cx5) ((ev2) m(i5)).a.c).I == dx5.Q) {
                                ra4 ra4Var = null;
                                for (Object obj2 : gv2Var.values()) {
                                    if (ra4Var == null) {
                                        ra4Var = tx3.c.a(obj2.getClass());
                                    }
                                    if (!ra4Var.b(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                }
                List list = (List) we5.j(D & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ra4 n = n(i5);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!n.b(list.get(i9))) {
                            break loop0;
                        }
                    }
                }
                i3++;
            }
        }
        return false;
    }

    @Override // defpackage.ra4
    public final Object c() {
        this.k.getClass();
        return ((bp1) this.e).d(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.ta4.x(defpackage.we5.j(r7, r12), defpackage.we5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.we5.i(r7, r12) == defpackage.we5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.we5.i(r7, r12) == defpackage.we5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (defpackage.ta4.x(defpackage.we5.j(r7, r12), defpackage.we5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (defpackage.ta4.x(defpackage.we5.j(r7, r12), defpackage.we5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (defpackage.ta4.x(defpackage.we5.j(r7, r12), defpackage.we5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.a(r7, r12) == r5.a(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.we5.i(r7, r12) == defpackage.we5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.we5.h(r7, r12) == defpackage.we5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.we5.i(r7, r12) == defpackage.we5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.we5.i(r7, r12) == defpackage.we5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.d(r7, r12)) == java.lang.Float.floatToIntBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.c(r7, r12)) == java.lang.Double.doubleToLongBits(r5.c(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (defpackage.ta4.x(defpackage.we5.j(r7, r12), defpackage.we5.j(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.ra4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.bp1 r12, defpackage.bp1 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.d(bp1, bp1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.ra4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.bp1 r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.e(bp1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ra4
    public final void f(bp1 bp1Var, bp1 bp1Var2) {
        bp1 bp1Var3;
        bp1Var2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                bp1 bp1Var4 = bp1Var;
                if (this.g) {
                    return;
                }
                ta4.w(this.m, bp1Var4, bp1Var2);
                return;
            }
            int D = D(i);
            long j = 1048575 & D;
            int i2 = iArr[i];
            switch (C(D)) {
                case 0:
                    if (o(i, bp1Var2)) {
                        ue5 ue5Var = we5.d;
                        bp1Var3 = bp1Var;
                        ue5Var.g(bp1Var3, j, ue5Var.c(j, bp1Var2));
                        A(i, bp1Var3);
                        break;
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 1:
                    if (o(i, bp1Var2)) {
                        ue5 ue5Var2 = we5.d;
                        ue5Var2.h(bp1Var, j, ue5Var2.d(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 2:
                    if (o(i, bp1Var2)) {
                        we5.o(bp1Var, j, we5.i(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 3:
                    if (o(i, bp1Var2)) {
                        we5.o(bp1Var, j, we5.i(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 4:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 5:
                    if (o(i, bp1Var2)) {
                        we5.o(bp1Var, j, we5.i(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 6:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 7:
                    if (o(i, bp1Var2)) {
                        ue5 ue5Var3 = we5.d;
                        ue5Var3.e(bp1Var, j, ue5Var3.a(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 8:
                    if (o(i, bp1Var2)) {
                        we5.p(bp1Var, j, we5.j(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 9:
                    r(bp1Var, bp1Var2, i);
                    bp1Var3 = bp1Var;
                    break;
                case 10:
                    if (o(i, bp1Var2)) {
                        we5.p(bp1Var, j, we5.j(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 11:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 12:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 13:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 14:
                    if (o(i, bp1Var2)) {
                        we5.o(bp1Var, j, we5.i(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 15:
                    if (o(i, bp1Var2)) {
                        we5.n(bp1Var, j, we5.h(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 16:
                    if (o(i, bp1Var2)) {
                        we5.o(bp1Var, j, we5.i(j, bp1Var2));
                        A(i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 17:
                    r(bp1Var, bp1Var2, i);
                    bp1Var3 = bp1Var;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                case 37:
                case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                case 41:
                case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                case 43:
                case 44:
                case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                case 46:
                case 47:
                case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                case 49:
                    this.l.b(bp1Var, bp1Var2, j);
                    bp1Var3 = bp1Var;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    Class cls = ta4.a;
                    Object j2 = we5.j(j, bp1Var);
                    Object j3 = we5.j(j, bp1Var2);
                    this.n.getClass();
                    we5.p(bp1Var, j, iv2.b(j2, j3));
                    bp1Var3 = bp1Var;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(i2, i, bp1Var2)) {
                        we5.p(bp1Var, j, we5.j(j, bp1Var2));
                        B(i2, i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 60:
                    s(bp1Var, bp1Var2, i);
                    bp1Var3 = bp1Var;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (p(i2, i, bp1Var2)) {
                        we5.p(bp1Var, j, we5.j(j, bp1Var2));
                        B(i2, i, bp1Var);
                    }
                    bp1Var3 = bp1Var;
                    break;
                case 68:
                    s(bp1Var, bp1Var2, i);
                    bp1Var3 = bp1Var;
                    break;
                default:
                    bp1Var3 = bp1Var;
                    break;
            }
            i += 3;
            bp1Var = bp1Var3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.ra4
    public final void g(java.lang.Object r19, defpackage.h60 r20, defpackage.mc1 r21) {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.g(java.lang.Object, h60, mc1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05f4, code lost:
    
        if (p(r13, r7, r23) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05f6, code lost:
    
        r8 = defpackage.i82.O(r13, 8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0603, code lost:
    
        if (p(r13, r7, r23) != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0605, code lost:
    
        r8 = defpackage.i82.O(r13, 4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06f8, code lost:
    
        if (p(r13, r7, r23) != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0700, code lost:
    
        if (p(r13, r7, r23) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x095f, code lost:
    
        if ((r10 & r15) != 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0965, code lost:
    
        if ((r10 & r15) != 0) goto L240;
     */
    @Override // defpackage.ra4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.s3 r23) {
        /*
            Method dump skipped, instructions count: 2948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.h(s3):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ra4
    public final void i(uu2 uu2Var, Object obj) {
        ce5 ce5Var;
        int i;
        int i2;
        boolean z;
        boolean z2;
        uu2Var.getClass();
        i70 i70Var = (i70) uu2Var.I;
        ce5 ce5Var2 = this.m;
        int i3 = 1048575;
        char c = '?';
        boolean z3 = true;
        boolean z4 = this.g;
        int[] iArr = this.a;
        if (z4) {
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int D = D(i4);
                int i5 = iArr[i4];
                switch (C(D)) {
                    case 0:
                        if (o(i4, obj)) {
                            i70Var.y(i5, Double.doubleToRawLongBits(we5.d.c(D & 1048575, obj)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (o(i4, obj)) {
                            i70Var.w(i5, Float.floatToRawIntBits(we5.d.d(D & 1048575, obj)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (o(i4, obj)) {
                            i70Var.J(i5, we5.i(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (o(i4, obj)) {
                            i70Var.J(i5, we5.i(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (o(i4, obj)) {
                            i70Var.A(i5, we5.h(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (o(i4, obj)) {
                            i70Var.y(i5, we5.i(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (o(i4, obj)) {
                            i70Var.w(i5, we5.h(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (o(i4, obj)) {
                            i70Var.t(i5, we5.d.a(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (o(i4, obj)) {
                            F(i5, we5.j(D & 1048575, obj), uu2Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (o(i4, obj)) {
                            i70Var.D(i5, (s3) we5.j(D & 1048575, obj), n(i4));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (o(i4, obj)) {
                            uu2Var.M(i5, (f00) we5.j(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (o(i4, obj)) {
                            i70Var.H(i5, we5.h(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (o(i4, obj)) {
                            i70Var.A(i5, we5.h(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (o(i4, obj)) {
                            i70Var.w(i5, we5.h(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (o(i4, obj)) {
                            i70Var.y(i5, we5.i(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (o(i4, obj)) {
                            int h = we5.h(D & 1048575, obj);
                            i70Var.H(i5, (h >> 31) ^ (h << 1));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (o(i4, obj)) {
                            long i6 = we5.i(D & 1048575, obj);
                            i70Var.J(i5, (i6 << 1) ^ (i6 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (o(i4, obj)) {
                            uu2Var.S(i5, we5.j(D & 1048575, obj), n(i4));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        ta4.A(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 19:
                        ta4.E(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 20:
                        ta4.H(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 21:
                        ta4.P(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 22:
                        ta4.G(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 23:
                        ta4.D(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 24:
                        ta4.C(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 25:
                        ta4.y(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 26:
                        ta4.N(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var);
                        break;
                    case 27:
                        ta4.I(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, n(i4));
                        break;
                    case 28:
                        ta4.z(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var);
                        break;
                    case 29:
                        ta4.O(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 30:
                        ta4.B(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 31:
                        ta4.J(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 32:
                        ta4.K(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 33:
                        ta4.L(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 34:
                        ta4.M(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, false);
                        break;
                    case 35:
                        ta4.A(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                        ta4.E(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 37:
                        ta4.H(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                        ta4.P(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        ta4.G(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                        ta4.D(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 41:
                        ta4.C(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                        ta4.y(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 43:
                        ta4.O(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 44:
                        ta4.B(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                        ta4.J(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 46:
                        ta4.K(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 47:
                        ta4.L(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                        ta4.M(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, true);
                        break;
                    case 49:
                        ta4.F(iArr[i4], (List) we5.j(D & 1048575, obj), uu2Var, n(i4));
                        break;
                    case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                        E(uu2Var, i5, we5.j(D & 1048575, obj), i4);
                        break;
                    case 51:
                        if (p(i5, i4, obj)) {
                            i70Var.y(i5, Double.doubleToRawLongBits(((Double) we5.j(D & 1048575, obj)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (p(i5, i4, obj)) {
                            i70Var.w(i5, Float.floatToRawIntBits(((Float) we5.j(D & 1048575, obj)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (p(i5, i4, obj)) {
                            i70Var.J(i5, w(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (p(i5, i4, obj)) {
                            i70Var.J(i5, w(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (p(i5, i4, obj)) {
                            i70Var.A(i5, v(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (p(i5, i4, obj)) {
                            i70Var.y(i5, w(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (p(i5, i4, obj)) {
                            i70Var.w(i5, v(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (p(i5, i4, obj)) {
                            i70Var.t(i5, ((Boolean) we5.j(D & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (p(i5, i4, obj)) {
                            F(i5, we5.j(D & 1048575, obj), uu2Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (p(i5, i4, obj)) {
                            i70Var.D(i5, (s3) we5.j(D & 1048575, obj), n(i4));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (p(i5, i4, obj)) {
                            uu2Var.M(i5, (f00) we5.j(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (p(i5, i4, obj)) {
                            i70Var.H(i5, v(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (p(i5, i4, obj)) {
                            i70Var.A(i5, v(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (p(i5, i4, obj)) {
                            i70Var.w(i5, v(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                        if (p(i5, i4, obj)) {
                            i70Var.y(i5, w(D & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (p(i5, i4, obj)) {
                            int v = v(D & 1048575, obj);
                            i70Var.H(i5, (v >> 31) ^ (v << 1));
                            break;
                        } else {
                            break;
                        }
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                        if (p(i5, i4, obj)) {
                            long w = w(D & 1048575, obj);
                            i70Var.J(i5, (w << 1) ^ (w >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (p(i5, i4, obj)) {
                            uu2Var.S(i5, we5.j(D & 1048575, obj), n(i4));
                            break;
                        } else {
                            break;
                        }
                }
            }
            ce5Var2.getClass();
            ((bp1) obj).unknownFields.d(uu2Var);
            return;
        }
        int length2 = iArr.length;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length2) {
            int D2 = D(i8);
            int i10 = i3;
            int i11 = iArr[i8];
            char c2 = c;
            int C = C(D2);
            Unsafe unsafe = p;
            boolean z5 = z3;
            if (z4 || C > 17) {
                ce5Var = ce5Var2;
                i = C;
                i2 = 0;
            } else {
                int i12 = iArr[i8 + 2];
                ce5Var = ce5Var2;
                int i13 = i12 & i10;
                i = C;
                if (i13 != i7) {
                    i9 = unsafe.getInt(obj, i13);
                    i7 = i13;
                }
                i2 = (z5 ? 1 : 0) << (i12 >>> 20);
            }
            long j = D2 & i10;
            switch (i) {
                case 0:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.y(i11, Double.doubleToRawLongBits(we5.d.c(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.w(i11, Float.floatToRawIntBits(we5.d.d(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.J(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.J(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.A(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.y(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.w(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.t(i11, we5.d.a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    z = false;
                    if ((i2 & i9) != 0) {
                        F(i11, unsafe.getObject(obj, j), uu2Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.D(i11, (s3) unsafe.getObject(obj, j), n(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    z = false;
                    if ((i2 & i9) != 0) {
                        uu2Var.M(i11, (f00) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.H(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.A(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.w(i11, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    z = false;
                    if ((i2 & i9) != 0) {
                        i70Var.y(i11, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    z = false;
                    if ((i2 & i9) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        i70Var.H(i11, (i14 >> 31) ^ (i14 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    z = false;
                    if ((i2 & i9) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        z5 = true;
                        i70Var.J(i11, (j2 >> c2) ^ (j2 << 1));
                        break;
                    }
                    z5 = true;
                    break;
                case 17:
                    z = false;
                    if ((i2 & i9) != 0) {
                        uu2Var.S(i11, unsafe.getObject(obj, j), n(i8));
                    }
                    z5 = true;
                    break;
                case 18:
                    z = false;
                    ta4.A(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 19:
                    z = false;
                    ta4.E(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 20:
                    z = false;
                    ta4.H(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 21:
                    z = false;
                    ta4.P(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 22:
                    z = false;
                    ta4.G(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 23:
                    z = false;
                    ta4.D(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 24:
                    z = false;
                    ta4.C(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 25:
                    z = false;
                    ta4.y(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z5 = true;
                    break;
                case 26:
                    ta4.N(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var);
                    z = false;
                    z5 = true;
                    break;
                case 27:
                    ta4.I(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, n(i8));
                    z = false;
                    z5 = true;
                    break;
                case 28:
                    ta4.z(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var);
                    z = false;
                    z5 = true;
                    break;
                case 29:
                    z2 = false;
                    ta4.O(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 30:
                    z2 = false;
                    ta4.B(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 31:
                    z2 = false;
                    ta4.J(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 32:
                    z2 = false;
                    ta4.K(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 33:
                    z2 = false;
                    ta4.L(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 34:
                    z2 = false;
                    ta4.M(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, false);
                    z = z2;
                    z5 = true;
                    break;
                case 35:
                    ta4.A(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    ta4.E(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 37:
                    ta4.H(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    ta4.P(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    ta4.G(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                    ta4.D(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 41:
                    ta4.C(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    ta4.y(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 43:
                    ta4.O(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 44:
                    ta4.B(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    ta4.J(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 46:
                    ta4.K(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 47:
                    ta4.L(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    ta4.M(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, z5);
                    z = false;
                    break;
                case 49:
                    ta4.F(iArr[i8], (List) unsafe.getObject(obj, j), uu2Var, n(i8));
                    z = false;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    E(uu2Var, i11, unsafe.getObject(obj, j), i8);
                    z = false;
                    break;
                case 51:
                    if (p(i11, i8, obj)) {
                        i70Var.y(i11, Double.doubleToRawLongBits(((Double) we5.j(j, obj)).doubleValue()));
                    }
                    z = false;
                    break;
                case 52:
                    if (p(i11, i8, obj)) {
                        i70Var.w(i11, Float.floatToRawIntBits(((Float) we5.j(j, obj)).floatValue()));
                    }
                    z = false;
                    break;
                case 53:
                    if (p(i11, i8, obj)) {
                        i70Var.J(i11, w(j, obj));
                    }
                    z = false;
                    break;
                case 54:
                    if (p(i11, i8, obj)) {
                        i70Var.J(i11, w(j, obj));
                    }
                    z = false;
                    break;
                case 55:
                    if (p(i11, i8, obj)) {
                        i70Var.A(i11, v(j, obj));
                    }
                    z = false;
                    break;
                case 56:
                    if (p(i11, i8, obj)) {
                        i70Var.y(i11, w(j, obj));
                    }
                    z = false;
                    break;
                case 57:
                    if (p(i11, i8, obj)) {
                        i70Var.w(i11, v(j, obj));
                    }
                    z = false;
                    break;
                case 58:
                    if (p(i11, i8, obj)) {
                        i70Var.t(i11, ((Boolean) we5.j(j, obj)).booleanValue());
                    }
                    z = false;
                    break;
                case 59:
                    if (p(i11, i8, obj)) {
                        F(i11, unsafe.getObject(obj, j), uu2Var);
                    }
                    z = false;
                    break;
                case 60:
                    if (p(i11, i8, obj)) {
                        i70Var.D(i11, (s3) unsafe.getObject(obj, j), n(i8));
                    }
                    z = false;
                    break;
                case 61:
                    if (p(i11, i8, obj)) {
                        uu2Var.M(i11, (f00) unsafe.getObject(obj, j));
                    }
                    z = false;
                    break;
                case 62:
                    if (p(i11, i8, obj)) {
                        i70Var.H(i11, v(j, obj));
                    }
                    z = false;
                    break;
                case 63:
                    if (p(i11, i8, obj)) {
                        i70Var.A(i11, v(j, obj));
                    }
                    z = false;
                    break;
                case 64:
                    if (p(i11, i8, obj)) {
                        i70Var.w(i11, v(j, obj));
                    }
                    z = false;
                    break;
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                    if (p(i11, i8, obj)) {
                        i70Var.y(i11, w(j, obj));
                    }
                    z = false;
                    break;
                case 66:
                    if (p(i11, i8, obj)) {
                        int v2 = v(j, obj);
                        i70Var.H(i11, (v2 >> 31) ^ (v2 << 1));
                    }
                    z = false;
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (p(i11, i8, obj)) {
                        long w2 = w(j, obj);
                        i70Var.J(i11, (w2 >> c2) ^ (w2 << (z5 ? 1L : 0L)));
                    }
                    z = false;
                    break;
                case 68:
                    if (p(i11, i8, obj)) {
                        uu2Var.S(i11, unsafe.getObject(obj, j), n(i8));
                    }
                    z = false;
                    break;
                default:
                    z = false;
                    break;
            }
            i8 += 3;
            i3 = i10;
            c = c2;
            z3 = z5;
            ce5Var2 = ce5Var;
        }
        ce5Var2.getClass();
        ((bp1) obj).unknownFields.d(uu2Var);
    }

    public final boolean j(bp1 bp1Var, Object obj, int i) {
        return o(i, bp1Var) == o(i, obj);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (we5.j(D(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        zl1.c();
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final ra4 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        ra4 ra4Var = (ra4) objArr[i2];
        if (ra4Var != null) {
            return ra4Var;
        }
        ra4 a = tx3.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(int r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.o(int, java.lang.Object):boolean");
    }

    public final boolean p(int i, int i2, Object obj) {
        return we5.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.mc1 r11, defpackage.h60 r12) {
        /*
            r7 = this;
            int r9 = r7.D(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = defpackage.we5.j(r0, r8)
            iv2 r7 = r7.n
            if (r9 != 0) goto L1e
            r7.getClass()
            gv2 r9 = defpackage.gv2.J
            gv2 r9 = r9.b()
            defpackage.we5.p(r8, r0, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            gv2 r2 = (defpackage.gv2) r2
            boolean r2 = r2.I
            if (r2 != 0) goto L35
            gv2 r2 = defpackage.gv2.J
            gv2 r2 = r2.b()
            defpackage.iv2.b(r2, r9)
            defpackage.we5.p(r8, r0, r2)
            r9 = r2
        L35:
            r7.getClass()
            gv2 r9 = (defpackage.gv2) r9
            ev2 r10 = (defpackage.ev2) r10
            x81 r7 = r10.a
            r8 = 2
            r12.o0(r8)
            java.lang.Object r10 = r12.e
            d70 r10 = (defpackage.d70) r10
            int r0 = r10.E()
            int r0 = r10.g(r0)
            java.lang.Object r1 = r7.d
            java.lang.String r2 = ""
            r3 = r1
        L53:
            int r4 = r12.d()     // Catch: java.lang.Throwable -> L77
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9d
            boolean r5 = r10.e()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L63
            goto L9d
        L63:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L79
            boolean r4 = r12.p0()     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            if (r4 == 0) goto L71
            goto L53
        L71:
            z42 r4 = new z42     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            throw r4     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
        L77:
            r7 = move-exception
            goto La4
        L79:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            cx5 r4 = (defpackage.cx5) r4     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            java.lang.Object r3 = r12.u(r4, r5, r11)     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            goto L53
        L86:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            cx5 r4 = (defpackage.cx5) r4     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            r5 = 0
            java.lang.Object r2 = r12.u(r4, r5, r5)     // Catch: java.lang.Throwable -> L77 defpackage.w42 -> L90
            goto L53
        L90:
            boolean r4 = r12.p0()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L97
            goto L53
        L97:
            z42 r7 = new z42     // Catch: java.lang.Throwable -> L77
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L9d:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L77
            r10.f(r0)
            return
        La4:
            r10.f(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.q(java.lang.Object, int, java.lang.Object, mc1, h60):void");
    }

    public final void r(bp1 bp1Var, Object obj, int i) {
        long D = D(i) & 1048575;
        if (o(i, obj)) {
            Object j = we5.j(D, bp1Var);
            Object j2 = we5.j(D, obj);
            if (j != null && j2 != null) {
                we5.p(bp1Var, D, r32.c(j, j2));
                A(i, bp1Var);
            } else if (j2 != null) {
                we5.p(bp1Var, D, j2);
                A(i, bp1Var);
            }
        }
    }

    public final void s(bp1 bp1Var, Object obj, int i) {
        int D = D(i);
        int i2 = this.a[i];
        long j = D & 1048575;
        if (p(i2, i, obj)) {
            Object j2 = we5.j(j, bp1Var);
            Object j3 = we5.j(j, obj);
            if (j2 != null && j3 != null) {
                we5.p(bp1Var, j, r32.c(j2, j3));
                B(i2, i, bp1Var);
            } else if (j3 != null) {
                we5.p(bp1Var, j, j3);
                B(i2, i, bp1Var);
            }
        }
    }

    public final void x(Object obj, int i, h60 h60Var, ra4 ra4Var, mc1 mc1Var) {
        int D;
        List c = this.l.c(i & 1048575, obj);
        d70 d70Var = (d70) h60Var.e;
        int i2 = h60Var.b;
        if ((i2 & 7) != 2) {
            throw z42.b();
        }
        do {
            c.add(h60Var.N(ra4Var, mc1Var));
            if (d70Var.e() || h60Var.d != 0) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == i2);
        h60Var.d = D;
    }

    public final void y(int i, h60 h60Var, Object obj) {
        if ((536870912 & i) != 0) {
            we5.p(obj, i & 1048575, h60Var.e0());
        } else if (this.f) {
            we5.p(obj, i & 1048575, h60Var.b0());
        } else {
            we5.p(obj, i & 1048575, h60Var.k());
        }
    }
}
