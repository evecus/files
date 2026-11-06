package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import androidx.media3.container.MdtaMetadataEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import okhttp3.internal.dns._DnsMessageKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class il2 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;

    public static int[] A(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            s83.d();
            return null;
        }
        int[] iArr = new int[7];
        for (int i = 0; i < 7; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final boolean B(final ui1 ui1Var, final ui1 ui1Var2, final int i, final ig igVar) {
        if (b0(ui1Var, ui1Var2, i, igVar)) {
            return true;
        }
        final ui1 g = ((di1) ut0.V(ui1Var).getFocusOwner()).g();
        Boolean bool = (Boolean) d4.J(ui1Var, i, new tm1() { // from class: ve3
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                rv rvVar = (rv) obj;
                ui1 ui1Var3 = ui1Var;
                if (ui1.this != ((di1) ut0.V(ui1Var3).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean b0 = il2.b0(ui1Var3, ui1Var2, i, igVar);
                Boolean valueOf = Boolean.valueOf(b0);
                if (b0 || !rvVar.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean C(sb4 sb4Var) {
        return sb4Var.a.h() >= sb4Var.f.h();
    }

    public static int D(int[] iArr) {
        return iArr[0] & 1;
    }

    public static String E(Object obj) {
        Class<?> cls = obj == null ? null : obj.getClass();
        return cls == null ? "null" : cls.getName();
    }

    public static final hx1 F() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("AutoMirrored.Filled.MobileScreenShare", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(17.0f, 1.01f, 7.0f, 1.0f);
        p.r(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        p.M(18.0f);
        p.r(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        p.v(10.0f);
        p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.x(19.0f, 3.0f);
        p.r(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        p.p();
        p.z(17.0f, 19.0f);
        p.x(7.0f, 19.0f);
        p.x(7.0f, 5.0f);
        p.v(10.0f);
        p.M(14.0f);
        p.p();
        p.z(12.8f, 13.22f);
        p.M(1.75f);
        p.y(3.2f, -2.99f);
        p.x(12.8f, 9.0f);
        p.M(1.7f);
        p.r(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f);
        p.r(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final hx1 G() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.PersonOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        ArrayList arrayList = (ArrayList) epVar.J;
        epVar.z(12.0f, 5.9f);
        epVar.r(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        epVar.D(-0.94f, 2.1f, -2.1f, 2.1f);
        epVar.C(9.9f, 9.16f, 9.9f, 8.0f);
        epVar.D(0.94f, -2.1f, 2.1f, -2.1f);
        arrayList.add(new dl3(0.0f, 9.0f));
        epVar.r(2.97f, 0.0f, 6.1f, 1.46f, 6.1f, 2.1f);
        epVar.M(1.1f);
        epVar.x(5.9f, 18.1f);
        epVar.x(5.9f, 17.0f);
        epVar.r(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        epVar.z(12.0f, 4.0f);
        epVar.q(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        epVar.D(1.79f, 4.0f, 4.0f, 4.0f);
        epVar.D(4.0f, -1.79f, 4.0f, -4.0f);
        epVar.D(-1.79f, -4.0f, -4.0f, -4.0f);
        epVar.p();
        epVar.z(12.0f, 13.0f);
        epVar.r(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        epVar.M(3.0f);
        epVar.v(16.0f);
        epVar.M(-3.0f);
        epVar.r(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        epVar.p();
        gx1.a(gx1Var, arrayList, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final hx1 H() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vk3(8.0f, 5.0f));
        arrayList.add(new hl3(14.0f));
        arrayList.add(new cl3(11.0f, -7.0f));
        arrayList.add(rk3.c);
        gx1.a(gx1Var, arrayList, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static final int I(o84 o84Var) {
        o84Var.getClass();
        q84 Y = o84Var.Y("SELECT changes()");
        try {
            Y.T();
            int i = (int) Y.getLong(0);
            mw2.v(Y, null);
            return i;
        } finally {
        }
    }

    public static boolean J(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] - 2147483648;
            int i3 = iArr2[i] - 2147483648;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static void K(String str) {
        Log.i("NavController", str);
    }

    public static float[] L(float[] fArr) {
        double d2 = fArr[0];
        double d3 = fArr[1];
        double d4 = fArr[2];
        double d5 = fArr[3];
        double d6 = fArr[4];
        double d7 = fArr[5];
        double d8 = fArr[6];
        double d9 = fArr[7];
        double d10 = fArr[8];
        double d11 = (d6 * d10) - (d9 * d7);
        double d12 = (d9 * d4) - (d3 * d10);
        double d13 = (d3 * d7) - (d6 * d4);
        double d14 = (d8 * d13) + (d5 * d12) + (d2 * d11);
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        copyOf[0] = (float) (d11 / d14);
        copyOf[3] = (float) r7.p(d5, d10, d8 * d7, d14);
        copyOf[6] = (float) r7.p(d8, d6, d5 * d9, d14);
        copyOf[1] = (float) (d12 / d14);
        copyOf[4] = (float) r7.p(d8, d4, d2 * d10, d14);
        copyOf[7] = (float) r7.p(d2, d9, d8 * d3, d14);
        copyOf[2] = (float) (d13 / d14);
        copyOf[5] = (float) r7.p(d2, d7, d5 * d4, d14);
        copyOf[8] = (float) r7.p(d5, d3, d2 * d6, d14);
        return copyOf;
    }

    public static boolean M(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
                if (iArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean N(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static y00 O(tk0 tk0Var, hn1 hn1Var) {
        tk0Var.getClass();
        return g4.H(new ot1(tk0Var, gl0.I, hn1Var, (byte) 2));
    }

    public static final uu2 P(n84 n84Var, String str, Executor executor, rm1 rm1Var) {
        wd5 wd5Var = wd5.a;
        executor.getClass();
        u33 u33Var = new u33();
        v00 v00Var = new v00();
        v00Var.c = new p44();
        y00 y00Var = new y00(v00Var);
        v00Var.b = y00Var;
        v00Var.a = pt1.class;
        try {
            executor.execute(new ru(n84Var, str, rm1Var, u33Var, v00Var));
            v00Var.a = wd5Var;
        } catch (Exception e2) {
            y00Var.J.i(e2);
        }
        uu2 uu2Var = new uu2();
        uu2Var.I = y00Var;
        return uu2Var;
    }

    public static void Q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        char c2 = ' ';
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = iArr[i] & 4294967295L;
            char c3 = c2;
            long j17 = j7;
            long j18 = (j16 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j18;
            long j19 = j18 >>> c3;
            long j20 = j16 * j2;
            int i3 = i + 1;
            long j21 = j20 + (iArr3[i3] & 4294967295L) + j19;
            iArr3[i3] = (int) j21;
            long j22 = (j16 * j3) + (iArr3[r8] & 4294967295L) + (j21 >>> c3);
            iArr3[i + 2] = (int) j22;
            long j23 = (j16 * j4) + (iArr3[r8] & 4294967295L) + (j22 >>> c3);
            iArr3[i + 3] = (int) j23;
            long j24 = (j16 * j5) + (iArr3[r8] & 4294967295L) + (j23 >>> c3);
            iArr3[i + 4] = (int) j24;
            long j25 = (j16 * j6) + (iArr3[r8] & 4294967295L) + (j24 >>> c3);
            iArr3[i + 5] = (int) j25;
            long j26 = (j16 * j17) + (iArr3[r8] & 4294967295L) + (j25 >>> c3);
            iArr3[i + 6] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> c3);
            c2 = c3;
            i = i3;
            j7 = j17;
        }
    }

    public static int R(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = iArr[i] & 4294967295L;
            long j11 = (iArr3[i] & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j10 * j2) + (iArr3[i2] & 4294967295L) + (j11 >>> 32);
            iArr3[i2] = (int) j12;
            long j13 = (j10 * j3) + (iArr3[r15] & 4294967295L) + (j12 >>> 32);
            int i3 = i;
            iArr3[i + 2] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[r2] & 4294967295L) + (j13 >>> 32);
            iArr3[i3 + 3] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i3 + 4] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[r2] & 4294967295L) + (j15 >>> 32);
            iArr3[i3 + 5] = (int) j16;
            long j17 = (j10 * j9) + (iArr3[r2] & 4294967295L) + (j16 >>> 32);
            iArr3[i3 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (iArr3[r2] & 4294967295L) + j8;
            iArr3[i3 + 7] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static final d83 S(tm1 tm1Var) {
        e83 e83Var = new e83();
        tm1Var.invoke(e83Var);
        boolean z = e83Var.b;
        c83 c83Var = e83Var.a;
        c83Var.a = z;
        c83Var.b = e83Var.c;
        String str = e83Var.e;
        if (str != null) {
            boolean z2 = e83Var.f;
            boolean z3 = e83Var.g;
            c83Var.d = str;
            c83Var.c = -1;
            c83Var.e = z2;
            c83Var.f = z3;
        } else {
            int i = e83Var.d;
            boolean z4 = e83Var.f;
            boolean z5 = e83Var.g;
            c83Var.c = i;
            c83Var.d = null;
            c83Var.e = z4;
            c83Var.f = z5;
        }
        return c83Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void T(kl3[] kl3VarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        kl3 kl3Var;
        int i3;
        char c2;
        float f;
        float f2;
        kl3 kl3Var2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        kl3[] kl3VarArr2 = kl3VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = kl3VarArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c3 = 'm';
        while (i5 < length) {
            kl3 kl3Var3 = kl3VarArr2[i5];
            char c4 = kl3Var3.a;
            float[] fArr3 = kl3Var3.b;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c4) {
                case _DnsMessageKt.TYPE_HTTPS /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c4 == 'A') {
                    fArr = fArr3;
                    i2 = i7;
                    kl3Var = kl3Var3;
                    float f21 = f19;
                    float f22 = f20;
                    i3 = i5;
                    c2 = c4;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    kl3.a(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f13 = fArr[i8];
                    f = fArr[i9];
                    f14 = f;
                    f2 = f13;
                } else if (c4 == 'C') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kl3Var = kl3Var3;
                    c2 = c4;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f13 = fArr[i10];
                    f14 = fArr[i11];
                    f = f24;
                    f2 = f23;
                } else if (c4 == 'H') {
                    fArr = fArr3;
                    i2 = i7;
                    kl3Var = kl3Var3;
                    c2 = c4;
                    f = f20;
                    i3 = i5;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c4 == 'Q') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kl3Var = kl3Var3;
                    c2 = c4;
                    int i14 = i2 + 1;
                    int i15 = i2 + 2;
                    int i16 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i14], fArr[i15], fArr[i16]);
                    float f25 = fArr[i2];
                    float f26 = fArr[i14];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c4 == 'V') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    kl3Var = kl3Var3;
                    f2 = f19;
                    c2 = c4;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c4 != 'a') {
                    if (c4 == 'c') {
                        fArr = fArr3;
                        i2 = i7;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        int i19 = i2 + 4;
                        int i20 = i2 + 5;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                        float f29 = fArr[i17] + f19;
                        float f30 = fArr[i18] + f20;
                        f19 += fArr[i19];
                        f20 += fArr[i20];
                        f13 = f29;
                        f14 = f30;
                    } else if (c4 != 'h') {
                        if (c4 != 'q') {
                            if (c4 != 'v') {
                                if (c4 == 'L') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    int i21 = i2 + 1;
                                    path2.lineTo(fArr[i2], fArr[i21]);
                                    f2 = fArr[i2];
                                    f = fArr[i21];
                                } else if (c4 == 'M') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    f2 = fArr[i2];
                                    f = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c4 != 'S') {
                                    if (c4 == 'T') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr[i2], fArr[i22]);
                                        f2 = fArr[i2];
                                        f = fArr[i22];
                                        kl3Var = kl3Var3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c4 == 'l') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr[i2], fArr[i23]);
                                        f19 += fArr[i2];
                                        f6 = fArr[i23];
                                    } else if (c4 == 'm') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        float f31 = fArr[i2];
                                        f19 += f31;
                                        float f32 = fArr[i2 + 1];
                                        f20 += f32;
                                        if (i2 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            kl3Var = kl3Var3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c4 != 's') {
                                        if (c4 != 't') {
                                            fArr = fArr3;
                                            i2 = i7;
                                            kl3Var = kl3Var3;
                                            f2 = f19;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i24 = i7 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i24]);
                                            float f33 = f9 + f19;
                                            float f34 = f10 + f20;
                                            float f35 = f19 + fArr3[i7];
                                            f20 += fArr3[i24];
                                            f14 = f34;
                                            fArr = fArr3;
                                            i2 = i7;
                                            kl3Var = kl3Var3;
                                            f2 = f35;
                                            f13 = f33;
                                        }
                                        f = f20;
                                    } else {
                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i25 = i7;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        fArr = fArr3;
                                        i2 = i25;
                                        path2.rCubicTo(f8, f7, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                        f3 = fArr[i2] + f19;
                                        f4 = fArr[i26] + f20;
                                        f19 += fArr[i27];
                                        f5 = fArr[i28];
                                    }
                                    i3 = i5;
                                    c2 = c4;
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i29 = i2 + 1;
                                    int i30 = i2 + 2;
                                    int i31 = i2 + 3;
                                    path2.cubicTo(f36, f37, fArr[i2], fArr[i29], fArr[i30], fArr[i31]);
                                    f13 = fArr[i2];
                                    f14 = fArr[i29];
                                    f2 = fArr[i30];
                                    f = fArr[i31];
                                }
                                i3 = i5;
                                kl3Var = kl3Var3;
                                c2 = c4;
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                path2.rLineTo(0.0f, fArr[i2]);
                                f6 = fArr[i2];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            int i32 = i2 + 1;
                            int i33 = i2 + 2;
                            int i34 = i2 + 3;
                            path2.rQuadTo(fArr[i2], fArr[i32], fArr[i33], fArr[i34]);
                            f3 = fArr[i2] + f19;
                            f4 = fArr[i32] + f20;
                            f19 += fArr[i33];
                            f5 = fArr[i34];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f19 += fArr[i2];
                    }
                    kl3Var = kl3Var3;
                    f2 = f19;
                    f = f20;
                    i3 = i5;
                    c2 = c4;
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    int i35 = i2 + 5;
                    float f38 = fArr[i35] + f19;
                    int i36 = i2 + 6;
                    float f39 = fArr[i36] + f20;
                    float f40 = fArr[i2];
                    float f41 = fArr[i2 + 1];
                    float f42 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        kl3Var2 = kl3Var3;
                        z = 1;
                    } else {
                        kl3Var2 = kl3Var3;
                        z = i6;
                    }
                    kl3Var = kl3Var2;
                    float f43 = f19;
                    c2 = c4;
                    float f44 = f20;
                    i3 = i5;
                    kl3.a(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f2 = f43 + fArr[i35];
                    f = f44 + fArr[i36];
                    f13 = f2;
                    f14 = f;
                }
                i7 = i2 + i;
                path2 = path;
                kl3Var3 = kl3Var;
                c4 = c2;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c3 = c4;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c3 = kl3Var3.a;
            i5++;
            kl3VarArr2 = kl3VarArr;
            path2 = path;
            i4 = i6;
        }
    }

    public static final boolean U(ui1 ui1Var, int i, ig igVar) {
        if (i == 1) {
            return z(ui1Var, igVar);
        }
        if (i == 2) {
            return k(ui1Var, igVar);
        }
        zy.i("This function should only be used for 1-D focus search");
        return false;
    }

    public static lq1 V(lq1 lq1Var, float f) {
        return lq1Var.a(new hi3(h0(f), h0(0.0f), h0(f), h0(0.0f)));
    }

    public static lq1 W(lq1 lq1Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        float f4 = (i & 4) != 0 ? 0.0f : 4.0f;
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return lq1Var.a(new hi3(h0(f), h0(f2), h0(f4), h0(f3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean X(ui1 ui1Var, ig igVar) {
        ui1[] ui1VarArr = new ui1[16];
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitChildren called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = ui1Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, ui1Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = b53Var.K;
            if (i2 == 0) {
                break;
            }
            k13 k13Var = (k13) b53Var.l(i2 - 1);
            if ((k13Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                ut0.h(b53Var, k13Var);
            } else {
                while (true) {
                    if (k13Var == null) {
                        break;
                    }
                    if ((k13Var.getKindSet$ui() & 1024) != 0) {
                        b53 b53Var2 = null;
                        while (k13Var != null) {
                            if (k13Var instanceof ui1) {
                                ui1 ui1Var2 = (ui1) k13Var;
                                int i3 = i + 1;
                                if (ui1VarArr.length < i3) {
                                    int length = ui1VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ui1VarArr, 0, r10, 0, length);
                                    ui1VarArr = r10;
                                }
                                ui1VarArr[i] = ui1Var2;
                                i = i3;
                            } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                int i4 = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            k13Var = k13Var2;
                                        } else {
                                            if (b53Var2 == null) {
                                                b53Var2 = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var2.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var2.c(k13Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var2);
                        }
                    } else {
                        k13Var = k13Var.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(ui1VarArr, 0, i, xi1.J);
        int i5 = i - 1;
        if (i5 < ui1VarArr.length) {
            while (i5 >= 0) {
                ui1 ui1Var3 = ui1VarArr[i5];
                if (mu0.L(ui1Var3) && k(ui1Var3, igVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean Y(ui1 ui1Var, ig igVar) {
        ui1[] ui1VarArr = new ui1[16];
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitChildren called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = ui1Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, ui1Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = b53Var.K;
            if (i2 == 0) {
                break;
            }
            k13 k13Var = (k13) b53Var.l(i2 - 1);
            if ((k13Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                ut0.h(b53Var, k13Var);
            } else {
                while (true) {
                    if (k13Var == null) {
                        break;
                    }
                    if ((k13Var.getKindSet$ui() & 1024) != 0) {
                        b53 b53Var2 = null;
                        while (k13Var != null) {
                            if (k13Var instanceof ui1) {
                                ui1 ui1Var2 = (ui1) k13Var;
                                int i3 = i + 1;
                                if (ui1VarArr.length < i3) {
                                    int length = ui1VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ui1VarArr, 0, r10, 0, length);
                                    ui1VarArr = r10;
                                }
                                ui1VarArr[i] = ui1Var2;
                                i = i3;
                            } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                int i4 = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            k13Var = k13Var2;
                                        } else {
                                            if (b53Var2 == null) {
                                                b53Var2 = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var2.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var2.c(k13Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var2);
                        }
                    } else {
                        k13Var = k13Var.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(ui1VarArr, 0, i, xi1.J);
        for (int i5 = 0; i5 < i; i5++) {
            ui1 ui1Var3 = ui1VarArr[i5];
            if (mu0.L(ui1Var3) && z(ui1Var3, igVar)) {
                return true;
            }
        }
        return false;
    }

    public static iz2 Z(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            zl1.g("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    iz2 iz2Var = new iz2();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    iz2Var.b = duplicate;
                    iz2Var.a = position;
                    int i6 = position - duplicate.getInt(position);
                    iz2Var.c = i6;
                    iz2Var.d = iz2Var.b.getShort(i6);
                    return iz2Var;
                }
            }
        }
        zl1.g("Cannot read metadata.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r34, final defpackage.tm1 r35, final defpackage.l13 r36, boolean r37, defpackage.m65 r38, final defpackage.hn1 r39, defpackage.hn3 r40, defpackage.y82 r41, defpackage.x82 r42, boolean r43, int r44, int r45, final defpackage.dn4 r46, final defpackage.t35 r47, defpackage.fe0 r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il2.a(java.lang.String, tm1, l13, boolean, m65, hn1, hn3, y82, x82, boolean, int, int, dn4, t35, fe0, int, int, int):void");
    }

    public static void a0(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            io.p(theme);
            return;
        }
        synchronized (j16.f0) {
            if (!j16.h0) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    j16.g0 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                }
                j16.h0 = true;
            }
            Method method = j16.g0;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                    j16.g0 = null;
                }
            }
        }
    }

    public static final int b(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3 A[EDGE_INSN: B:151:0x01c3->B:132:0x01c3 BREAK  A[LOOP:5: B:91:0x014c->B:146:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b0(defpackage.ui1 r12, defpackage.ui1 r13, int r14, defpackage.ig r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il2.b0(ui1, ui1, int, ig):boolean");
    }

    public static final void c(sb4 sb4Var, boolean z, String str, l13 l13Var, fe0 fe0Var, int i) {
        l13 l13Var2;
        hx1 hx1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1451981889);
        byte b2 = 2;
        int i2 = i | (go1Var.g(sb4Var) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | 3072;
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            int i3 = (i2 >> 3) & 14;
            cw4 t0 = p70.t0(z, k80Var.H, k80Var.u, false, "reading-hint-bg", go1Var, i3 | 24576, 8);
            cw4 s0 = p70.s0(z, k80Var.s, k80Var.v, "reading-hint-fg", go1Var, i3 | 3072);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z2 || Q == jpVar) {
                Q = dt4.b(new vj(sb4Var, (byte) 2));
                go1Var.o0(Q);
            }
            cw4 cw4Var = (cw4) Q;
            boolean z3 = ((i2 & 112) == 32) | (i4 == 4);
            Object Q2 = go1Var.Q();
            if (z3 || Q2 == jpVar) {
                Q2 = dt4.b(new zv1(b2, sb4Var, str, z));
                go1Var.o0(Q2);
            }
            cw4 cw4Var2 = (cw4) Q2;
            i13 i13Var = i13.a;
            l13 G0 = i42.G0(r7.u(8.0f, nq4.g(i13Var, 26.0f), t0), 6.0f, 0.0f, 10.0f, 0.0f, 10);
            u74 a2 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i5 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, G0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i5));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            if (z && ((Boolean) cw4Var.getValue()).booleanValue()) {
                hx1Var = g4.B();
            } else {
                hx1Var = k21.a;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i6 = th5.a;
                    rt4 rt4Var = new rt4(x70.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new vk3(16.59f, 8.59f));
                    arrayList.add(new uk3(12.0f, 13.17f));
                    arrayList.add(new uk3(7.41f, 8.59f));
                    arrayList.add(new uk3(6.0f, 10.0f));
                    arrayList.add(new cl3(6.0f, 6.0f));
                    arrayList.add(new cl3(6.0f, -6.0f));
                    arrayList.add(rk3.c);
                    gx1.a(gx1Var, arrayList, rt4Var);
                    hx1Var = gx1Var.b();
                    k21.a = hx1Var;
                }
            }
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 16.0f), s0, k80Var.s, false, null, 12), k80Var.s, go1Var, 48);
            r55.b((String) cw4Var2.getValue(), p70.G(i13Var, s0, k80Var.s, false, null, 12), k80Var.s, 0L, qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 1572864, 24576, 114616);
            go1Var = go1Var;
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new g30(sb4Var, z, str, l13Var2, i, (byte) 1);
        }
    }

    public static void c0(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    public static final void d(sb4 sb4Var, boolean z, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1480591777);
        int i2 = i | (go1Var.g(sb4Var) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.g(l13Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            long j = z ? k80Var.a : k80Var.s;
            long c2 = x70.c(k80Var.q, 0.12f);
            l13 b2 = nq4.b(nq4.n(l13Var, 4.0f), 1.0f);
            boolean f = go1Var.f(c2) | ((i2 & 14) == 4) | go1Var.f(j);
            Object Q = go1Var.Q();
            if (f || Q == de0.a) {
                vh2 vh2Var = new vh2(sb4Var, c2, j, (byte) 1);
                go1Var.o0(vh2Var);
                Q = vh2Var;
            }
            p70.j(0, go1Var, (tm1) Q, b2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uj(sb4Var, l13Var, z, i, (byte) 2);
        }
    }

    public static void d0(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long k = nt3.k(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (k >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (k & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long k2 = nt3.k(j11, j6, j16 >>> 32, j13);
                long k3 = nt3.k(j11, j8, k2 >>> 32, j15);
                long j17 = j14 + (k3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (k2 & 4294967295L);
                int i10 = (int) j23;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long k4 = nt3.k(j18, j6, j23 >>> 32, k3 & 4294967295L);
                long k5 = nt3.k(j18, j8, k4 >>> 32, j20);
                long k6 = nt3.k(j18, j11, k5 >>> 32, j22);
                long j24 = j21 + (k6 >>> 32);
                long j25 = iArr[5] & 4294967295L;
                long j26 = (iArr2[9] & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (iArr2[10] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j30 = (j25 * j) + (k4 & 4294967295L);
                int i12 = (int) j30;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long k7 = nt3.k(j25, j6, j30 >>> 32, k5 & 4294967295L);
                long k8 = nt3.k(j25, j8, k7 >>> 32, k6 & 4294967295L);
                long k9 = nt3.k(j25, j11, k8 >>> 32, j27);
                long j31 = k8 & 4294967295L;
                long k10 = nt3.k(j25, j18, k9 >>> 32, j29);
                long j32 = j28 + (k10 >>> 32);
                long j33 = k10 & 4294967295L;
                long j34 = iArr[6] & 4294967295L;
                long j35 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j36 = j32 & 4294967295L;
                long j37 = (iArr2[12] & 4294967295L) + (j35 >>> 32);
                long j38 = j35 & 4294967295L;
                long j39 = (j34 * j) + (k7 & 4294967295L);
                int i14 = (int) j39;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long k11 = nt3.k(j34, j6, j39 >>> 32, j31);
                long k12 = nt3.k(j34, j8, k11 >>> 32, k9 & 4294967295L);
                long k13 = nt3.k(j34, j11, k12 >>> 32, j33);
                long k14 = nt3.k(j34, j18, k13 >>> 32, j36);
                long k15 = nt3.k(j34, j25, k14 >>> 32, j38);
                long j40 = j37 + (k15 >>> 32);
                int i16 = (int) k11;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = (int) k12;
                iArr2[8] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) k13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) k14;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) k15;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j40;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j40 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static final float e(an3 an3Var, boolean z, gv1[] gv1VarArr, float f) {
        float f2 = Float.NaN;
        for (gv1 gv1Var : gv1VarArr) {
            float a2 = an3Var.a(gv1Var);
            if (!Float.isNaN(f2)) {
                int i = z != (a2 > f2) ? i + 1 : 0;
            }
            f2 = a2;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static int e0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static BigInteger f0(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                dq2.a0(bArr, i2, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int g(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static final float g0(List list, Resources resources) {
        Iterator it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static final void h(t25 t25Var, Context context, final boolean z, final String str, final long j) {
        if (d65.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) wx5.c0.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        e43 e43Var = t25Var.a;
        e43 e43Var2 = t25Var.a;
        h35 h35Var = h35.b;
        e43Var.a(h35Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            e43Var2.a(new c35(new ut3(i), resolveInfo.loadLabel(packageManager).toString(), 0, new tm1() { // from class: vt3
                @Override // defpackage.tm1
                public final Object invoke(Object obj) {
                    wx5.d0.e(context2, resolveInfo, Boolean.valueOf(z), str, new d65(j));
                    ((i35) obj).close();
                    return wd5.a;
                }
            }));
            i++;
            context2 = context;
        }
        e43Var2.a(h35Var);
    }

    public static final ci3 h0(float f) {
        return new ci3(f, 2);
    }

    public static int i(yz yzVar, boolean z) {
        int i = yzVar.b;
        int i2 = yzVar.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) yzVar.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b3 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b3 == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b2 = b3;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static final boolean i0(String str, rm1 rm1Var) {
        try {
            boolean booleanValue = ((Boolean) rm1Var.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    public static final ve1 j0(i23 i23Var, fe0 fe0Var) {
        h23 h23Var = ((fw2) ((go1) fe0Var).k(lw2.b)).d;
        int ordinal = i23Var.ordinal();
        if (ordinal == 0) {
            return h23Var.f();
        }
        if (ordinal == 1) {
            return h23Var.c();
        }
        if (ordinal == 2) {
            return h23Var.e();
        }
        if (ordinal == 3) {
            return h23Var.d();
        }
        if (ordinal == 4) {
            return h23Var.b();
        }
        if (ordinal == 5) {
            return h23Var.a();
        }
        s83.v();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(defpackage.ui1 r7, defpackage.ig r8) {
        /*
            oi1 r0 = r7.o0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = X(r7, r8)
            if (r0 != 0) goto L77
            gi1 r0 = r7.l0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.s83.v()
            return r2
        L35:
            ui1 r0 = defpackage.mu0.t(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            oi1 r6 = r0.o0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.s83.v()
            return r2
        L51:
            defpackage.zy.i(r5)
            return r2
        L55:
            boolean r1 = k(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = B(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            gi1 r7 = r0.l0()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = B(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.zy.i(r5)
            return r2
        L81:
            boolean r7 = X(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il2.k(ui1, ig):boolean");
    }

    public static boolean l(kl3[] kl3VarArr, kl3[] kl3VarArr2) {
        int i;
        if (kl3VarArr != null && kl3VarArr2 != null && kl3VarArr.length == kl3VarArr2.length) {
            for (0; i < kl3VarArr.length; i + 1) {
                kl3 kl3Var = kl3VarArr[i];
                char c2 = kl3Var.a;
                kl3 kl3Var2 = kl3VarArr2[i];
                i = (c2 == kl3Var2.a && kl3Var.b.length == kl3Var2.b.length) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static uq2 m(uq2 uq2Var, uq2 uq2Var2) {
        if (uq2Var != null) {
            wq2 wq2Var = uq2Var.a;
            if (!wq2Var.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i = 0; i < uq2Var2.a.size() + wq2Var.size(); i++) {
                    Locale locale = i < wq2Var.size() ? wq2Var.get(i) : uq2Var2.a.get(i - wq2Var.size());
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                return uq2.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        }
        return uq2.b;
    }

    public static void n(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
    }

    public static void o(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static void p(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
    }

    public static float[] q(float[] fArr, int i) {
        if (i < 0) {
            s83.d();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kl3[] r(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il2.r(java.lang.String):kl3[]");
    }

    public static kl3[] s(kl3[] kl3VarArr) {
        kl3[] kl3VarArr2 = new kl3[kl3VarArr.length];
        for (int i = 0; i < kl3VarArr.length; i++) {
            kl3VarArr2[i] = new kl3(kl3VarArr[i]);
        }
        return kl3VarArr2;
    }

    public static final float[] t(float f, float f2, float f3, float[] fArr) {
        return new float[]{(fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f), (fArr[5] * f3) + (fArr[4] * f2) + (fArr[3] * f), (fArr[8] * f3) + (fArr[7] * f2) + (fArr[6] * f)};
    }

    public static final float[] u(float f, float f2, float f3, float[] fArr) {
        fArr.getClass();
        return new float[]{fArr[0] * f, fArr[1] * f2, fArr[2] * f3, fArr[3] * f, fArr[4] * f2, fArr[5] * f3, fArr[6] * f, fArr[7] * f2, fArr[8] * f3};
    }

    public static final float v(int i, float[] fArr, float[] fArr2, int i2) {
        int i3 = i2 * 3;
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + (fArr2[i] * fArr[i3]);
    }

    public static boolean w(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final y00 x(Executor executor, String str, rm1 rm1Var) {
        executor.getClass();
        return g4.H(new ot1(executor, str, rm1Var, (byte) 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        r31 = r5;
        r32 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
    
        if (r37.a(r12 - 1, r31 - 1) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0183, code lost:
    
        r12 = r12 - 1;
        r5 = r31 - 1;
        r11 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        r30[r20 + r32] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0192, code lost:
    
        if (r28 == 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0194, code lost:
    
        r5 = r23 - r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0196, code lost:
    
        if (r5 < r10) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0198, code lost:
    
        if (r5 > r4) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019e, code lost:
    
        if (r24[r20 + r5] < r12) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a0, code lost:
    
        r33[r17] = r12;
        r21 = 1;
        r33[1] = r31;
        r33[r16] = r26;
        r33[3] = r29;
        r33[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0232, code lost:
    
        r11 = r32 + 2;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018a, code lost:
    
        r31 = r5;
        r32 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0165, code lost:
    
        r31 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x015e, code lost:
    
        r29 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014c, code lost:
    
        r5 = r30[(r11 + 1) + r20];
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x013f, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x014a, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0238, code lost:
    
        r4 = r4 + 1;
        r10 = r24;
        r5 = r25;
        r11 = r30;
        r12 = r33;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0125, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r24[(r5 + 1) + r20] > r24[(r29 - 1) + r20]) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011b, code lost:
    
        r30 = r11;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0121, code lost:
    
        if ((r23 & 1) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0128, code lost:
    
        if (r11 > r4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
    
        if (r11 == r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        if (r11 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012e, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013c, code lost:
    
        if (r30[(r11 + 1) + r20] >= r30[(r11 - 1) + r20]) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0141, code lost:
    
        r5 = r30[(r11 - 1) + r20];
        r12 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        r26 = r6 - ((r14 - r12) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0159, code lost:
    
        if (r4 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015b, code lost:
    
        r29 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r12 != r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0167, code lost:
    
        r29 = r26 + (r29 & r31);
        r26 = r5;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        if (r12 <= r13) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
    
        if (r5 <= r9) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(int r35, int r36, defpackage.ha3 r37) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il2.y(int, int, ha3):void");
    }

    public static final boolean z(ui1 ui1Var, ig igVar) {
        int ordinal = ui1Var.o0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ui1 t = mu0.t(ui1Var);
                if (t != null) {
                    return z(t, igVar) || B(ui1Var, t, 1, igVar);
                }
                zy.i("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ui1Var.l0().a ? ((Boolean) igVar.invoke(ui1Var)).booleanValue() : Y(ui1Var, igVar);
                }
                s83.v();
                return false;
            }
        }
        return Y(ui1Var, igVar);
    }
}
