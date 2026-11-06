package defpackage;

import androidx.media3.common.util.Log;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.TsExtractor;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dz2 implements qa4 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final r3 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final y93 j;
    public final rk2 k;
    public final be5 l;
    public final hv2 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pe5((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public dz2(int[] iArr, Object[] objArr, int i, int i2, r3 r3Var, int[] iArr2, int i3, int i4, y93 y93Var, rk2 rk2Var, be5 be5Var, nc1 nc1Var, hv2 hv2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = r3Var instanceof ap1;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = y93Var;
        this.k = rk2Var;
        this.l = be5Var;
        this.e = r3Var;
        this.m = hv2Var;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) ve5.j(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) ve5.j(j, obj)).longValue();
    }

    public static Field I(Class cls, String str) {
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

    public static int O(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (s(obj)) {
            return;
        }
        hn3.i(obj, "Mutating immutable message: ");
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ap1) {
            return ((ap1) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dz2 z(defpackage.i04 r35, defpackage.y93 r36, defpackage.rk2 r37, defpackage.be5 r38, defpackage.nc1 r39, defpackage.hv2 r40) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.z(i04, y93, rk2, be5, nc1, hv2):dz2");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int D(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, defpackage.op r38) {
        /*
            Method dump skipped, instructions count: 3210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.D(java.lang.Object, byte[], int, int, int, op):int");
    }

    public final void E(Object obj, long j, h60 h60Var, qa4 qa4Var, lc1 lc1Var) {
        int D;
        this.k.getClass();
        n32 a = rk2.a(j, obj);
        d70 d70Var = (d70) h60Var.e;
        int i = h60Var.b;
        if ((i & 7) != 3) {
            throw x42.c();
        }
        do {
            ap1 c = qa4Var.c();
            h60Var.f(c, qa4Var, lc1Var);
            qa4Var.a(c);
            a.add(c);
            if (d70Var.e() || h60Var.d != 0) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == i);
        h60Var.d = D;
    }

    public final void F(Object obj, int i, h60 h60Var, qa4 qa4Var, lc1 lc1Var) {
        int D;
        this.k.getClass();
        n32 a = rk2.a(i & 1048575, obj);
        d70 d70Var = (d70) h60Var.e;
        int i2 = h60Var.b;
        if ((i2 & 7) != 2) {
            throw x42.c();
        }
        do {
            ap1 c = qa4Var.c();
            h60Var.g(c, qa4Var, lc1Var);
            qa4Var.a(c);
            a.add(c);
            if (d70Var.e() || h60Var.d != 0) {
                return;
            } else {
                D = d70Var.D();
            }
        } while (D == i2);
        h60Var.d = D;
    }

    public final void G(int i, h60 h60Var, Object obj) {
        if ((536870912 & i) != 0) {
            h60Var.n0(2);
            ve5.q(obj, i & 1048575, ((d70) h60Var.e).C());
        } else if (!this.f) {
            ve5.q(obj, i & 1048575, h60Var.l());
        } else {
            h60Var.n0(2);
            ve5.q(obj, i & 1048575, ((d70) h60Var.e).B());
        }
    }

    public final void H(int i, h60 h60Var, Object obj) {
        boolean z = (536870912 & i) != 0;
        rk2 rk2Var = this.k;
        if (z) {
            rk2Var.getClass();
            h60Var.c0(rk2.a(i & 1048575, obj), true);
        } else {
            rk2Var.getClass();
            h60Var.c0(rk2.a(i & 1048575, obj), false);
        }
    }

    public final void J(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ve5.o(obj, j, (1 << (i2 >>> 20)) | ve5.h(j, obj));
    }

    public final void K(int i, int i2, Object obj) {
        ve5.o(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int L(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void M(int i, Object obj, Object obj2) {
        o.putObject(obj, P(i) & 1048575, obj2);
        J(i, obj);
    }

    public final void N(int i, int i2, Object obj, Object obj2) {
        o.putObject(obj, P(i2) & 1048575, obj2);
        K(i, i2, obj);
    }

    public final int P(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.qa4
    public final void a(Object obj) {
        if (s(obj)) {
            if (obj instanceof ap1) {
                ap1 ap1Var = (ap1) obj;
                ap1Var.k(Log.LOG_LEVEL_OFF);
                ap1Var.memoizedHashCode = 0;
                ap1Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int P = P(i);
                long j = 1048575 & P;
                int O = O(P);
                Unsafe unsafe = o;
                if (O != 9) {
                    if (O != 60 && O != 68) {
                        switch (O) {
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
                                this.k.getClass();
                                e4 e4Var = (e4) ((n32) ve5.j(j, obj));
                                if (e4Var.I) {
                                    e4Var.I = false;
                                    break;
                                } else {
                                    break;
                                }
                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((fv2) object).I = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (t(iArr[i], i, obj)) {
                        p(i).a(unsafe.getObject(obj, j));
                    }
                }
                if (q(i, obj)) {
                    p(i).a(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            zd5 zd5Var = ((ap1) obj).unknownFields;
            if (zd5Var.e) {
                zd5Var.e = false;
            }
        }
    }

    @Override // defpackage.qa4
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int P = P(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & P) == 0 || r(obj, i2, i, i3, i11)) {
                int O = O(P);
                if (O == 9 || O == 17) {
                    if (r(obj, i2, i, i3, i11) && !p(i2).b(ve5.j(P & 1048575, obj))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (O != 27) {
                        if (O == 60 || O == 68) {
                            if (t(i8, i2, obj) && !p(i2).b(ve5.j(P & 1048575, obj))) {
                            }
                        } else if (O != 49) {
                            if (O != 50) {
                                continue;
                            } else {
                                Object j = ve5.j(P & 1048575, obj);
                                this.m.getClass();
                                if (!((fv2) j).isEmpty()) {
                                    r7.K(o(i2));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) ve5.j(P & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qa4 p = p(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (p.b(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qa4
    public final ap1 c() {
        this.j.getClass();
        return ((ap1) this.e).i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qa4
    public final void d(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                sa4.k(this.l, obj, obj2);
                return;
            }
            int P = P(i);
            long j = 1048575 & P;
            int i2 = iArr[i];
            switch (O(P)) {
                case 0:
                    if (q(i, obj2)) {
                        ue5 ue5Var = ve5.c;
                        obj3 = obj;
                        ue5Var.g(obj3, j, ue5Var.c(j, obj2));
                        J(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (q(i, obj2)) {
                        ue5 ue5Var2 = ve5.c;
                        ue5Var2.h(obj, j, ue5Var2.d(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i, obj2)) {
                        ve5.p(obj, j, ve5.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i, obj2)) {
                        ve5.p(obj, j, ve5.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i, obj2)) {
                        ve5.p(obj, j, ve5.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i, obj2)) {
                        ue5 ue5Var3 = ve5.c;
                        ue5Var3.e(obj, j, ue5Var3.a(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i, obj2)) {
                        ve5.q(obj, j, ve5.j(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        ve5.q(obj, j, ve5.j(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        ve5.p(obj, j, ve5.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        ve5.o(obj, j, ve5.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        ve5.p(obj, j, ve5.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(i, obj, obj2);
                    obj3 = obj;
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
                    this.k.getClass();
                    n32 n32Var = (n32) ve5.j(j, obj);
                    n32 n32Var2 = (n32) ve5.j(j, obj2);
                    int size = n32Var.size();
                    int size2 = n32Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((e4) n32Var).I) {
                            n32Var = n32Var.a(size2 + size);
                        }
                        n32Var.addAll(n32Var2);
                    }
                    if (size > 0) {
                        n32Var2 = n32Var;
                    }
                    ve5.q(obj, j, n32Var2);
                    obj3 = obj;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    Class cls = sa4.a;
                    Object j2 = ve5.j(j, obj);
                    Object j3 = ve5.j(j, obj2);
                    this.m.getClass();
                    ve5.q(obj, j, hv2.a(j2, j3));
                    obj3 = obj;
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
                    if (t(i2, i, obj2)) {
                        ve5.q(obj, j, ve5.j(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                case 66:
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (t(i2, i, obj2)) {
                        ve5.q(obj, j, ve5.j(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.qa4
    public final int e(ap1 ap1Var) {
        int i;
        int e;
        int e2;
        int e3;
        int g;
        int e4;
        int g2;
        int e5;
        int e6;
        int e7;
        int a;
        int f;
        int a2;
        int e8;
        int a3;
        int c;
        int e9;
        int size;
        int i2;
        int e10;
        int e11;
        int size2;
        int e12;
        int f2;
        int i3;
        int e13;
        int e14;
        int g3;
        int e15;
        int g4;
        int i4;
        dz2 dz2Var = this;
        ap1 ap1Var2 = ap1Var;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = dz2Var.a;
            if (i5 >= iArr.length) {
                dz2Var.l.getClass();
                return ap1Var2.unknownFields.b() + i7;
            }
            int P = dz2Var.P(i5);
            int O = O(P);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & 1048575;
            Unsafe unsafe = o;
            if (O <= 17) {
                if (i11 != i8) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(ap1Var2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = P & 1048575;
            if (O >= be1.J.I) {
                byte b = be1.K.I;
            }
            switch (O) {
                case 0:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e = j70.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 1:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e2 = j70.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 2:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(ap1Var2, j);
                        e3 = j70.e(i9);
                        g = j70.g(j2);
                        i7 += g + e3;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 3:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(ap1Var2, j);
                        e3 = j70.e(i9);
                        g = j70.g(j3);
                        i7 += g + e3;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 4:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        int i12 = unsafe.getInt(ap1Var2, j);
                        e4 = j70.e(i9);
                        g2 = j70.g(i12);
                        a2 = g2 + e4;
                        i7 += a2;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 5:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e5 = j70.e(i9);
                        e6 = e5 + 8;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 6:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e2 = j70.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 7:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e6 = j70.e(i9) + 1;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 8:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        Object object = unsafe.getObject(ap1Var2, j);
                        i7 = (object instanceof g00 ? j70.a(i9, (g00) object) : j70.d((String) object) + j70.e(i9)) + i7;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 9:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        Object object2 = unsafe.getObject(ap1Var2, j);
                        qa4 p = dz2Var.p(i5);
                        Class cls = sa4.a;
                        e7 = j70.e(i9);
                        a = ((r3) object2).a(p);
                        f = j70.f(a);
                        i4 = f + a + e7;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 10:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        a2 = j70.a(i9, (g00) unsafe.getObject(ap1Var2, j));
                        i7 += a2;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 11:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        int i13 = unsafe.getInt(ap1Var2, j);
                        e4 = j70.e(i9);
                        g2 = j70.f(i13);
                        a2 = g2 + e4;
                        i7 += a2;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 12:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        int i14 = unsafe.getInt(ap1Var2, j);
                        e4 = j70.e(i9);
                        g2 = j70.g(i14);
                        a2 = g2 + e4;
                        i7 += a2;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 13:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e2 = j70.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 14:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        e5 = j70.e(i9);
                        e6 = e5 + 8;
                        i7 += e6;
                    }
                    dz2Var = this;
                    ap1Var2 = ap1Var;
                    i5 += 3;
                case 15:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        int i15 = unsafe.getInt(ap1Var2, j);
                        e4 = j70.e(i9);
                        g2 = j70.b(i15);
                        a2 = g2 + e4;
                        i7 += a2;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 16:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        long j4 = unsafe.getLong(ap1Var2, j);
                        e3 = j70.e(i9);
                        g = j70.c(j4);
                        i7 += g + e3;
                    }
                    dz2Var = this;
                    i5 += 3;
                case 17:
                    if (dz2Var.r(ap1Var2, i5, i8, i6, i)) {
                        r3 r3Var = (r3) unsafe.getObject(ap1Var2, j);
                        qa4 p2 = dz2Var.p(i5);
                        e8 = j70.e(i9) * 2;
                        a3 = r3Var.a(p2);
                        c = a3 + e8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 18:
                    c = sa4.c(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 19:
                    c = sa4.b(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 20:
                    List list = (List) unsafe.getObject(ap1Var2, j);
                    Class cls2 = sa4.a;
                    if (list.size() != 0) {
                        e9 = (j70.e(i9) * list.size()) + sa4.e(list);
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls3 = sa4.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = sa4.i(list2);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls4 = sa4.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = sa4.d(list3);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 23:
                    c = sa4.c(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 24:
                    c = sa4.b(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 25:
                    List list4 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls5 = sa4.a;
                    int size3 = list4.size();
                    i7 += size3 == 0 ? 0 : (j70.e(i9) + 1) * size3;
                    i5 += 3;
                case 26:
                    List list5 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls6 = sa4.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        e9 = j70.e(i9) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof g00) {
                                int size5 = ((g00) obj).size();
                                e9 = j70.f(size5) + size5 + e9;
                            } else {
                                e9 = j70.d((String) obj) + e9;
                            }
                        }
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 27:
                    List list6 = (List) unsafe.getObject(ap1Var2, j);
                    qa4 p3 = dz2Var.p(i5);
                    Class cls7 = sa4.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        e11 = 0;
                    } else {
                        e11 = j70.e(i9) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int a4 = ((r3) list6.get(i17)).a(p3);
                            e11 += j70.f(a4) + a4;
                        }
                    }
                    i7 += e11;
                    i5 += 3;
                case 28:
                    List list7 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls8 = sa4.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        e9 = j70.e(i9) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((g00) list7.get(i18)).size();
                            e9 += j70.f(size8) + size8;
                        }
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 29:
                    List list8 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls9 = sa4.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = sa4.h(list8);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls10 = sa4.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = sa4.a(list9);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 31:
                    c = sa4.b(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 32:
                    c = sa4.c(i9, (List) unsafe.getObject(ap1Var2, j));
                    i7 += c;
                    i5 += 3;
                case 33:
                    List list10 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls11 = sa4.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = sa4.f(list10);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 34:
                    List list11 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls12 = sa4.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = sa4.g(list11);
                        e10 = j70.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 35:
                    List list12 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls13 = sa4.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    List list13 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls14 = sa4.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 37:
                    size2 = sa4.e((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    size2 = sa4.i((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    size2 = sa4.d((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                    List list14 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls15 = sa4.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls16 = sa4.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    List list16 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls17 = sa4.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 43:
                    size2 = sa4.h((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 44:
                    size2 = sa4.a((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    List list17 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls18 = sa4.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(ap1Var2, j);
                    Class cls19 = sa4.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 47:
                    size2 = sa4.f((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    size2 = sa4.g((List) unsafe.getObject(ap1Var2, j));
                    if (size2 > 0) {
                        e12 = j70.e(i9);
                        f2 = j70.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(ap1Var2, j);
                    qa4 p4 = dz2Var.p(i5);
                    Class cls20 = sa4.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i3 += ((r3) list19.get(i19)).a(p4) + (j70.e(i9) * 2);
                        }
                    }
                    i7 += i3;
                    i5 += 3;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    Object object3 = unsafe.getObject(ap1Var2, j);
                    Object o2 = dz2Var.o(i5);
                    dz2Var.m.getClass();
                    fv2 fv2Var = (fv2) object3;
                    if (o2 != null) {
                        zl1.c();
                        return 0;
                    }
                    if (fv2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = fv2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                case 51:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e = j70.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 52:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e13 = j70.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 53:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        long C = C(j, ap1Var2);
                        e14 = j70.e(i9);
                        g3 = j70.g(C);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 54:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        long C2 = C(j, ap1Var2);
                        e14 = j70.e(i9);
                        g3 = j70.g(C2);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 55:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        int B = B(j, ap1Var2);
                        e15 = j70.e(i9);
                        g4 = j70.g(B);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 56:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e = j70.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 57:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e13 = j70.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 58:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        c = j70.e(i9) + 1;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 59:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        Object object4 = unsafe.getObject(ap1Var2, j);
                        i7 = (object4 instanceof g00 ? j70.a(i9, (g00) object4) : j70.d((String) object4) + j70.e(i9)) + i7;
                    }
                    i5 += 3;
                case 60:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        Object object5 = unsafe.getObject(ap1Var2, j);
                        qa4 p5 = dz2Var.p(i5);
                        Class cls21 = sa4.a;
                        e7 = j70.e(i9);
                        a = ((r3) object5).a(p5);
                        f = j70.f(a);
                        i4 = f + a + e7;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 61:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        c = j70.a(i9, (g00) unsafe.getObject(ap1Var2, j));
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 62:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        int B2 = B(j, ap1Var2);
                        e15 = j70.e(i9);
                        g4 = j70.f(B2);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 63:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        int B3 = B(j, ap1Var2);
                        e15 = j70.e(i9);
                        g4 = j70.g(B3);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 64:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e13 = j70.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        e = j70.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 66:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        int B4 = B(j, ap1Var2);
                        e15 = j70.e(i9);
                        g4 = j70.b(B4);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        long C3 = C(j, ap1Var2);
                        e14 = j70.e(i9);
                        g3 = j70.c(C3);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 68:
                    if (dz2Var.t(i9, i5, ap1Var2)) {
                        r3 r3Var2 = (r3) unsafe.getObject(ap1Var2, j);
                        qa4 p6 = dz2Var.p(i5);
                        e8 = j70.e(i9) * 2;
                        a3 = r3Var2.a(p6);
                        c = a3 + e8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                default:
                    i5 += 3;
            }
        }
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
    @Override // defpackage.qa4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.ap1 r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.f(ap1):int");
    }

    @Override // defpackage.qa4
    public final void g(Object obj, byte[] bArr, int i, int i2, op opVar) {
        D(obj, bArr, i, i2, 0, opVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // defpackage.qa4
    public final void h(uu2 uu2Var, Object obj) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        dz2 dz2Var = this;
        uu2Var.getClass();
        j70 j70Var = (j70) uu2Var.I;
        int[] iArr = dz2Var.a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int P = dz2Var.P(i5);
            int i6 = iArr[i5];
            int O = O(P);
            Unsafe unsafe = o;
            if (O <= 17) {
                int i7 = iArr[i5 + 2];
                z = 1;
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                int i9 = 1 << (i7 >>> 20);
                i = P;
                i2 = i9;
            } else {
                z = 1;
                i = P;
                i2 = 0;
            }
            long j = i & 1048575;
            switch (O) {
                case 0:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.n(i6, Double.doubleToRawLongBits(ve5.c.c(j, obj)));
                    }
                case 1:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.l(i6, Float.floatToRawIntBits(ve5.c.d(j, obj)));
                    }
                    dz2Var = this;
                case 2:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.x(i6, unsafe.getLong(obj, j));
                    }
                    dz2Var = this;
                case 3:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.x(i6, unsafe.getLong(obj, j));
                    }
                    dz2Var = this;
                case 4:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.p(i6, unsafe.getInt(obj, j));
                    }
                    dz2Var = this;
                case 5:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.n(i6, unsafe.getLong(obj, j));
                    }
                    dz2Var = this;
                case 6:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.l(i6, unsafe.getInt(obj, j));
                    }
                    dz2Var = this;
                case 7:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.j(i6, ve5.c.a(j, obj));
                    }
                    dz2Var = this;
                case 8:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            j70Var.t(i6, (String) object);
                        } else {
                            j70Var.k(i6, (g00) object);
                        }
                    }
                    dz2Var = this;
                case 9:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.s(i6, (r3) unsafe.getObject(obj, j), dz2Var.p(i5));
                    }
                case 10:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.k(i6, (g00) unsafe.getObject(obj, j));
                    }
                    dz2Var = this;
                case 11:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.v(i6, unsafe.getInt(obj, j));
                    }
                    dz2Var = this;
                case 12:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.p(i6, unsafe.getInt(obj, j));
                    }
                    dz2Var = this;
                case 13:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.l(i6, unsafe.getInt(obj, j));
                    }
                    dz2Var = this;
                case 14:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        j70Var.n(i6, unsafe.getLong(obj, j));
                    }
                    dz2Var = this;
                case 15:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        j70Var.v(i6, (i10 >> 31) ^ (i10 << 1));
                    }
                    dz2Var = this;
                case 16:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        j70Var.x(i6, (j2 << 1) ^ (j2 >> 63));
                    }
                    dz2Var = this;
                case 17:
                    if (dz2Var.r(obj, i5, i3, i4, i2)) {
                        uu2Var.R(i6, unsafe.getObject(obj, j), dz2Var.p(i5));
                    }
                case 18:
                    sa4.n(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 19:
                    sa4.r(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 20:
                    sa4.t(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 21:
                    sa4.z(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 22:
                    sa4.s(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 23:
                    sa4.q(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 24:
                    sa4.p(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 25:
                    sa4.m(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = sa4.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            j70Var.t(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    qa4 p = dz2Var.p(i5);
                    Class cls2 = sa4.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            j70Var.s(i13, (r3) list2.get(i14), p);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = sa4.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            j70Var.k(i15, (g00) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z2 = false;
                    sa4.y(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 30:
                    z2 = false;
                    sa4.o(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 31:
                    z2 = false;
                    sa4.u(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 32:
                    z2 = false;
                    sa4.v(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 33:
                    z2 = false;
                    sa4.w(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 34:
                    z2 = false;
                    sa4.x(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, false);
                case 35:
                    sa4.n(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    sa4.r(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 37:
                    sa4.t(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    sa4.z(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    sa4.s(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                    sa4.q(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 41:
                    sa4.p(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    sa4.m(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 43:
                    sa4.y(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 44:
                    sa4.o(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    sa4.u(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 46:
                    sa4.v(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 47:
                    sa4.w(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    sa4.x(iArr[i5], (List) unsafe.getObject(obj, j), uu2Var, z);
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    qa4 p2 = dz2Var.p(i5);
                    Class cls4 = sa4.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            uu2Var.R(i17, list4.get(i18), p2);
                        }
                    }
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object o2 = dz2Var.o(i5);
                        dz2Var.m.getClass();
                        r7.K(o2);
                        throw null;
                    }
                case 51:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.n(i6, Double.doubleToRawLongBits(((Double) ve5.j(j, obj)).doubleValue()));
                    }
                case 52:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.l(i6, Float.floatToRawIntBits(((Float) ve5.j(j, obj)).floatValue()));
                    }
                case 53:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.x(i6, C(j, obj));
                    }
                case 54:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.x(i6, C(j, obj));
                    }
                case 55:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.p(i6, B(j, obj));
                    }
                case 56:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.n(i6, C(j, obj));
                    }
                case 57:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.l(i6, B(j, obj));
                    }
                case 58:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.j(i6, ((Boolean) ve5.j(j, obj)).booleanValue());
                    }
                case 59:
                    if (dz2Var.t(i6, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            j70Var.t(i6, (String) object2);
                        } else {
                            j70Var.k(i6, (g00) object2);
                        }
                    }
                case 60:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.s(i6, (r3) unsafe.getObject(obj, j), dz2Var.p(i5));
                    }
                case 61:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.k(i6, (g00) unsafe.getObject(obj, j));
                    }
                case 62:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.v(i6, B(j, obj));
                    }
                case 63:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.p(i6, B(j, obj));
                    }
                case 64:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.l(i6, B(j, obj));
                    }
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                    if (dz2Var.t(i6, i5, obj)) {
                        j70Var.n(i6, C(j, obj));
                    }
                case 66:
                    if (dz2Var.t(i6, i5, obj)) {
                        int B = B(j, obj);
                        j70Var.v(i6, (B >> 31) ^ (B << 1));
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (dz2Var.t(i6, i5, obj)) {
                        long C = C(j, obj);
                        j70Var.x(i6, (C << z) ^ (C >> 63));
                    }
                case 68:
                    if (dz2Var.t(i6, i5, obj)) {
                        uu2Var.R(i6, unsafe.getObject(obj, j), dz2Var.p(i5));
                    }
                default:
            }
        }
        dz2Var.l.getClass();
        ((ap1) obj).unknownFields.e(uu2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.sa4.l(defpackage.ve5.j(r7, r12), defpackage.ve5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.ve5.i(r7, r12) == defpackage.ve5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.ve5.i(r7, r12) == defpackage.ve5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (defpackage.sa4.l(defpackage.ve5.j(r7, r12), defpackage.ve5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (defpackage.sa4.l(defpackage.ve5.j(r7, r12), defpackage.ve5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (defpackage.sa4.l(defpackage.ve5.j(r7, r12), defpackage.ve5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.a(r7, r12) == r5.a(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.ve5.i(r7, r12) == defpackage.ve5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.ve5.h(r7, r12) == defpackage.ve5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.ve5.i(r7, r12) == defpackage.ve5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.ve5.i(r7, r12) == defpackage.ve5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.d(r7, r12)) == java.lang.Float.floatToIntBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.c(r7, r12)) == java.lang.Double.doubleToLongBits(r5.c(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (defpackage.sa4.l(defpackage.ve5.j(r7, r12), defpackage.ve5.j(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.qa4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.ap1 r12, defpackage.ap1 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.i(ap1, ap1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0715 A[Catch: all -> 0x0462, TryCatch #1 {all -> 0x0462, blocks: (B:37:0x0710, B:39:0x0715, B:40:0x071a, B:138:0x045d, B:141:0x0465, B:142:0x047a, B:143:0x048f, B:144:0x04a4, B:145:0x04b9, B:146:0x04ce, B:147:0x04e3, B:148:0x04f8, B:149:0x050d, B:150:0x0527, B:151:0x0543, B:152:0x0560, B:153:0x057d, B:154:0x059a, B:155:0x05ba, B:156:0x05d7, B:157:0x05ec, B:158:0x0607, B:159:0x0614, B:160:0x0633, B:161:0x0650, B:162:0x066d, B:163:0x068a, B:164:0x06a7, B:165:0x06c4, B:166:0x06e2, B:171:0x0700), top: B:36:0x0710 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0721 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x073e A[LOOP:3: B:53:0x073c->B:54:0x073e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0748  */
    @Override // defpackage.qa4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r21, defpackage.h60 r22, defpackage.lc1 r23) {
        /*
            Method dump skipped, instructions count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.j(java.lang.Object, h60, lc1):void");
    }

    public final boolean k(ap1 ap1Var, ap1 ap1Var2, int i) {
        return q(i, ap1Var) == q(i, ap1Var2);
    }

    public final void m(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (ve5.j(P(i) & 1048575, obj) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        zl1.c();
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final qa4 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        qa4 qa4Var = (qa4) objArr[i2];
        if (qa4Var != null) {
            return qa4Var;
        }
        qa4 a = sx3.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.q(int, java.lang.Object):boolean");
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? q(i, obj) : (i3 & i4) != 0;
    }

    public final boolean t(int i, int i2, Object obj) {
        return ve5.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void u(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        Object j = ve5.j(P, obj);
        hv2 hv2Var = this.m;
        if (j != null) {
            hv2Var.getClass();
            if (!((fv2) j).I) {
                Object c = fv2.J.c();
                hv2.a(c, j);
                ve5.q(obj, P, c);
                j = c;
            }
        } else {
            hv2Var.getClass();
            j = fv2.J.c();
            ve5.q(obj, P, j);
        }
        hv2Var.getClass();
        r7.K(obj2);
        throw null;
    }

    public final void v(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            long P = P(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, P);
            if (object == null) {
                b13.i("Source subfield ", this.a[i], " is present but null: ", obj2);
                return;
            }
            qa4 p = p(i);
            if (!q(i, obj)) {
                if (s(object)) {
                    ap1 c = p.c();
                    p.d(c, object);
                    unsafe.putObject(obj, P, c);
                } else {
                    unsafe.putObject(obj, P, object);
                }
                J(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P);
            if (!s(object2)) {
                ap1 c2 = p.c();
                p.d(c2, object2);
                unsafe.putObject(obj, P, c2);
                object2 = c2;
            }
            p.d(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (t(i2, i, obj2)) {
            long P = P(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, P);
            if (object == null) {
                b13.i("Source subfield ", iArr[i], " is present but null: ", obj2);
                return;
            }
            qa4 p = p(i);
            if (!t(i2, i, obj)) {
                if (s(object)) {
                    ap1 c = p.c();
                    p.d(c, object);
                    unsafe.putObject(obj, P, c);
                } else {
                    unsafe.putObject(obj, P, object);
                }
                K(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P);
            if (!s(object2)) {
                ap1 c2 = p.c();
                p.d(c2, object2);
                unsafe.putObject(obj, P, c2);
                object2 = c2;
            }
            p.d(object2, object);
        }
    }

    public final Object x(int i, Object obj) {
        qa4 p = p(i);
        long P = P(i) & 1048575;
        if (!q(i, obj)) {
            return p.c();
        }
        Object object = o.getObject(obj, P);
        if (s(object)) {
            return object;
        }
        ap1 c = p.c();
        if (object != null) {
            p.d(c, object);
        }
        return c;
    }

    public final Object y(int i, int i2, Object obj) {
        qa4 p = p(i2);
        if (!t(i, i2, obj)) {
            return p.c();
        }
        Object object = o.getObject(obj, P(i2) & 1048575);
        if (s(object)) {
            return object;
        }
        ap1 c = p.c();
        if (object != null) {
            p.d(c, object);
        }
        return c;
    }
}
