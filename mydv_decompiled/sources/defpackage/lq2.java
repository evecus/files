package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.database.SQLException;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import j$.util.Objects;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class lq2 {
    public static hx1 I;
    public static hx1 J;
    public static hx1 K;
    public static hx1 L;

    public static boolean A(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean B(int i, int i2) {
        return i == i2;
    }

    public static boolean C(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final void D(o84 o84Var, String str) {
        o84Var.getClass();
        q84 Y = o84Var.Y(str);
        try {
            Y.T();
            mw2.v(Y, null);
        } finally {
        }
    }

    public static mz2 E(mz2 mz2Var, da2 da2Var, m65 m65Var, iu0 iu0Var, kj1 kj1Var) {
        if (mz2Var != null && da2Var == mz2Var.a && ad4.z(m65Var, da2Var).equals(mz2Var.b) && iu0Var.getDensity() == mz2Var.c.I && kj1Var == mz2Var.d) {
            return mz2Var;
        }
        mz2 mz2Var2 = mz2.h;
        if (mz2Var2 != null && da2Var == mz2Var2.a && ad4.z(m65Var, da2Var).equals(mz2Var2.b) && iu0Var.getDensity() == mz2Var2.c.I && kj1Var == mz2Var2.d) {
            return mz2Var2;
        }
        mz2 mz2Var3 = new mz2(da2Var, ad4.z(m65Var, da2Var), new lu0(iu0Var.getDensity(), iu0Var.L()), kj1Var);
        mz2.h = mz2Var3;
        return mz2Var3;
    }

    public static int[] F(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            s83.d();
            return null;
        }
        int[] iArr = new int[6];
        for (int i = 0; i < 6; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g73 G(Uri uri) {
        g73 g73Var = new g73((byte) 0, (boolean) (0 == true ? 1 : 0));
        g73Var.J = uri;
        return g73Var;
    }

    public static int H(int[] iArr) {
        return iArr[0] & 1;
    }

    public static yr2 I() {
        return yr2.L;
    }

    public static final hx1 J() {
        hx1 hx1Var = I;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.LocalFireDepartment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        long j = x70.b;
        rt4 rt4Var = new rt4(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vk3(12.0f, 12.9f));
        arrayList.add(new cl3(-2.13f, 2.09f));
        arrayList.add(new sk3(9.31f, 15.55f, 9.0f, 16.28f, 9.0f, 17.06f));
        arrayList.add(new sk3(9.0f, 18.68f, 10.35f, 20.0f, 12.0f, 20.0f));
        arrayList.add(new fl3(3.0f, -1.32f, 3.0f, -2.94f));
        arrayList.add(new al3(0.0f, -0.78f, -0.31f, -1.52f, -0.87f, -2.07f));
        arrayList.add(new uk3(12.0f, 12.9f));
        arrayList.add(rk3.c);
        gx1.a(gx1Var, arrayList, rt4Var);
        rt4 rt4Var2 = new rt4(j);
        ep epVar = new ep((byte) 13);
        epVar.z(16.0f, 6.0f);
        epVar.y(-0.44f, 0.55f);
        epVar.q(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f);
        epVar.L(2.0f);
        epVar.r(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f);
        epVar.r(0.0f, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f);
        epVar.q(7.33f, 19.07f, 7.0f, 18.1f, 7.0f, 17.06f);
        epVar.r(0.0f, -1.32f, 0.52f, -2.56f, 1.47f, -3.5f);
        epVar.x(12.0f, 10.1f);
        epVar.y(3.53f, 3.47f);
        epVar.r(0.95f, 0.93f, 1.47f, 2.17f, 1.47f, 3.5f);
        epVar.r(0.0f, 1.02f, -0.31f, 1.96f, -0.85f, 2.75f);
        epVar.r(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f);
        epVar.q(20.52f, 10.97f, 18.79f, 7.62f, 16.0f, 6.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var2);
        hx1 b = gx1Var.b();
        I = b;
        return b;
    }

    public static final hx1 K() {
        hx1 hx1Var = J;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.LockOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 17.0f);
        r.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r.D(-0.9f, -2.0f, -2.0f, -2.0f);
        r.D(-2.0f, 0.9f, -2.0f, 2.0f);
        r.D(0.9f, 2.0f, 2.0f, 2.0f);
        r.p();
        r.z(18.0f, 8.0f);
        r.v(-1.0f);
        r.x(17.0f, 6.0f);
        r.r(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        r.C(7.0f, 3.24f, 7.0f, 6.0f);
        r.v(1.9f);
        r.r(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        r.r(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        r.M(2.0f);
        r.x(6.0f, 8.0f);
        r.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r.M(10.0f);
        r.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r.v(12.0f);
        r.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r.x(20.0f, 10.0f);
        r.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r.p();
        r.z(18.0f, 20.0f);
        r.x(6.0f, 20.0f);
        r.x(6.0f, 10.0f);
        r.v(12.0f);
        r.M(10.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b = gx1Var.b();
        J = b;
        return b;
    }

    public static final hx1 L() {
        hx1 hx1Var = K;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Replay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(12.0f, 5.0f);
        epVar.L(1.0f);
        epVar.x(7.0f, 6.0f);
        epVar.y(5.0f, 5.0f);
        epVar.L(7.0f);
        epVar.r(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        epVar.D(-2.69f, 6.0f, -6.0f, 6.0f);
        epVar.D(-6.0f, -2.69f, -6.0f, -6.0f);
        epVar.u(4.0f);
        epVar.r(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        epVar.D(8.0f, -3.58f, 8.0f, -8.0f);
        epVar.D(-3.58f, -8.0f, -8.0f, -8.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b = gx1Var.b();
        K = b;
        return b;
    }

    public static boolean M(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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

    public static boolean N(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean O(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i = 1; i < 6; i++) {
                if (iArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean P(lq1 lq1Var) {
        return lq1Var.b(new yv3((byte) 3));
    }

    public static boolean Q(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean R(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static float S(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static short U(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }

    public static void V(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        int i = 1;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = iArr[i3] & 4294967295L;
            long j15 = (j14 * j) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (iArr3[i] & 4294967295L) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            long j18 = (j14 * j3) + (iArr3[r5] & 4294967295L) + (j17 >>> 32);
            iArr3[i3 + 2] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r5] & 4294967295L) + (j18 >>> 32);
            iArr3[i3 + 3] = (int) j19;
            long j20 = (j14 * j16) + (iArr3[r5] & 4294967295L) + (j19 >>> 32);
            iArr3[i3 + 4] = (int) j20;
            long j21 = (j14 * j6) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i3 + 5] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        V(iArr, iArr2, iArr3);
        long j = iArr2[6] & 4294967295L;
        long j2 = iArr2[7] & 4294967295L;
        long j3 = iArr2[8] & 4294967295L;
        long j4 = iArr2[9] & 4294967295L;
        long j5 = iArr2[10] & 4294967295L;
        long j6 = iArr2[11] & 4294967295L;
        long j7 = iArr[6] & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i = 12;
        int i2 = 1;
        while (i2 < 6) {
            int i3 = i + 1;
            int i4 = i2;
            long j14 = iArr[6 + i2] & 4294967295L;
            long j15 = j3;
            long j16 = (j14 * j) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j16;
            long j17 = (j14 * j2) + (iArr3[r3] & 4294967295L) + (j16 >>> 32);
            iArr3[i + 2] = (int) j17;
            long j18 = (j14 * j15) + (iArr3[r5] & 4294967295L) + (j17 >>> 32);
            iArr3[i + 3] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r5] & 4294967295L) + (j18 >>> 32);
            iArr3[i + 4] = (int) j19;
            long j20 = (j14 * j5) + (iArr3[r5] & 4294967295L) + (j19 >>> 32);
            iArr3[i + 5] = (int) j20;
            long j21 = (j14 * j6) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i + 6] = (int) j21;
            iArr3[i + 7] = (int) (j21 >>> 32);
            i2 = i4 + 1;
            i = i3;
            j3 = j15;
        }
        int r = r(iArr3, iArr3);
        int q = q(18, 12, q(0, 6, 0, iArr3, iArr3) + r, iArr3, iArr3) + r;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = x(iArr, iArr, iArr4) != x(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        V(iArr4, iArr5, iArr6);
        dq2.h(24, q + (z ? dq2.f(12, 6, iArr6, iArr3) : dq2.E0(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static int X(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = iArr[i] & 4294967295L;
            long j10 = (iArr3[i2] & 4294967295L) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (iArr3[i3] & 4294967295L) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j3) + (iArr3[r15] & 4294967295L) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j4) + (iArr3[r2] & 4294967295L) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j5) + (iArr3[r2] & 4294967295L) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j9 * j6) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i2 + 5] = (int) j15;
            long j16 = (j15 >>> 32) + (iArr3[r2] & 4294967295L) + j7;
            iArr3[i2 + 6] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static void Y(y34 y34Var) {
        ArrayList arrayList = y34Var.b;
        if (!arrayList.isEmpty()) {
            int i = 0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (!(((k71) obj) instanceof s71)) {
                    }
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                k71 k71Var = (k71) obj2;
                k71Var.getClass();
                ArrayList arrayList2 = ((s71) k71Var).b;
                if (arrayList2.size() != 1) {
                    l71 l71Var = new l71();
                    u70.I0(l71Var.b, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(l71Var);
                }
            }
            Z(y34Var);
            p0(y34Var, new do2((byte) 19));
        }
        if (arrayList.size() != 1) {
            l71 l71Var2 = new l71();
            u70.I0(l71Var2.b, arrayList);
            arrayList.clear();
            arrayList.add(l71Var2);
        }
        Z(y34Var);
        p0(y34Var, new do2((byte) 19));
    }

    public static final void Z(v71 v71Var) {
        ArrayList arrayList = v71Var.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            k71 k71Var = (k71) obj;
            if (k71Var instanceof v71) {
                Z((v71) k71Var);
            }
        }
        dt1 dt1Var = (dt1) v71Var.b().foldIn(null, cx1.W);
        ex0 ex0Var = dx0.a;
        if (((dt1Var != null ? dt1Var.a : ex0Var) instanceof dx0) && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i3);
                i3++;
                dt1 dt1Var2 = (dt1) ((k71) obj2).b().foldIn(null, cx1.Y);
                if ((dt1Var2 != null ? dt1Var2.a : null) instanceof cx0) {
                    v71Var.c(fb4.m(v71Var.b()));
                    break;
                }
            }
        }
        yt5 yt5Var = (yt5) v71Var.b().foldIn(null, cx1.X);
        if (yt5Var != null) {
            ex0Var = yt5Var.a;
        }
        if (!(ex0Var instanceof dx0) || arrayList.isEmpty()) {
            return;
        }
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj3 = arrayList.get(i);
            i++;
            yt5 yt5Var2 = (yt5) ((k71) obj3).b().foldIn(null, cx1.Z);
            if ((yt5Var2 != null ? yt5Var2.a : null) instanceof cx0) {
                v71Var.c(fb4.o(v71Var.b()));
                return;
            }
        }
    }

    public static final void a(final hx1 hx1Var, final float f, fe0 fe0Var, final int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(557628698);
        int i2 = (go1Var.g(hx1Var) ? 32 : 16) | i;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            uv uvVar = q8.T;
            kp kpVar = new kp(10.0f, true, new y9());
            i13 i13Var = i13.a;
            l13 G0 = i42.G0(i13Var, 8.0f, 0.0f, 0.0f, f, 6);
            u74 a = t74.a(kpVar, uvVar, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, G0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 p = mw2.p(o7.m(nq4.k(i13Var, 28.0f), rt0.L(dw2.a.l(), go1Var)), k80Var.l, mw2.j);
            uw2 c = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(hx1Var, null, nq4.k(i13Var, 16.0f), k80Var.m, go1Var, ((i2 >> 3) & 14) | 432);
            go1Var.q(true);
            r55.b("播放菜单", null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.g, go1Var, 1572870, 0, 131002);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(f, i) { // from class: vx2
                public final /* synthetic */ float J;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(391);
                    lq2.a(hx1.this, this.J, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static byte[] a0(g73 g73Var, us2 us2Var) {
        byte[] bArr = new byte[us2Var.f - 32];
        for (int i = 0; i < us2Var.c; i++) {
            x81 x81Var = ((x81[]) g73Var.J)[i];
            byte[] bArr2 = new byte[320];
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 5;
                int[] iArr = (int[]) x81Var.b;
                int i4 = i2 * 4;
                int i5 = iArr[i4];
                bArr2[i3] = (byte) i5;
                int i6 = iArr[i4 + 1];
                bArr2[i3 + 1] = (byte) ((i5 >> 8) | (i6 << 2));
                int i7 = i6 >> 6;
                int i8 = iArr[i4 + 2];
                bArr2[i3 + 2] = (byte) (i7 | (i8 << 4));
                int i9 = iArr[i4 + 3];
                bArr2[i3 + 3] = (byte) ((i9 << 6) | (i8 >> 4));
                bArr2[i3 + 4] = (byte) (i9 >> 2);
            }
            x81Var.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static final void b(final hx1 hx1Var, final String str, final rm1 rm1Var, l13 l13Var, float f, fe0 fe0Var, final int i, final int i2) {
        l13 l13Var2;
        int i3;
        float f2;
        int i4;
        final l13 l13Var3;
        final float f3;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1813026237);
        int i5 = i | (go1Var.g(hx1Var) ? 4 : 2);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            i3 = i5 | (go1Var.g(l13Var2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (go1Var.d(f2) ? 16384 : 8192);
        }
        int i8 = i4;
        if (go1Var.T(i8 & 1, (i8 & 9363) != 9362)) {
            i13 i13Var = i13.a;
            l13 l13Var4 = i6 != 0 ? i13Var : l13Var2;
            float f4 = i7 != 0 ? 44.0f : f2;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            long j = k80Var.s;
            float f5 = f4;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "menu_icon_bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "menu_icon_fg", go1Var, 3072);
            go1Var = go1Var;
            l13 k = nq4.k(l13Var4, f5);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 1);
                go1Var.o0(Q3);
            }
            l13 u = r7.u(12.0f, r13.d(mw2.B(i42.A0(k, (tm1) Q3), false, null, 3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), t0);
            uw2 c = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i9 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, u);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i9));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(hx1Var, str, p70.G(nq4.k(i13Var, 20.0f), s0, j, false, null, 12), j, go1Var, i8 & WebSocketProtocol.PAYLOAD_SHORT);
            go1Var.q(true);
            f3 = f5;
            l13Var3 = l13Var4;
        } else {
            go1Var.W();
            l13Var3 = l13Var2;
            f3 = f2;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1(str, rm1Var, l13Var3, f3, i, i2) { // from class: cy2
                public final /* synthetic */ String J;
                public final /* synthetic */ rm1 K;
                public final /* synthetic */ l13 L;
                public final /* synthetic */ float M;
                public final /* synthetic */ byte N;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.N = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(433);
                    lq2.b(hx1.this, this.J, this.K, this.L, this.M, (fe0) obj, X, this.N);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u0 b0(defpackage.mn0 r3, int r4) {
        /*
            byte[] r0 = r3.I
            int r1 = r0.length
            if (r1 != r4) goto L6
            goto L45
        L6:
            boolean r4 = defpackage.rg5.a(r0)
            if (r4 != 0) goto L33
            r4 = 0
            r1 = r0[r4]
            r2 = 48
            if (r1 != r2) goto L18
            x0 r4 = defpackage.x0.x(r0)
            goto L34
        L18:
            r2 = 4
            if (r1 != r2) goto L20
            r0 r4 = defpackage.r0.v(r0)
            goto L34
        L20:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 != r2) goto L33
            ct r0 = defpackage.ct.y(r0)
            y r1 = defpackage.r0.J
            u0 r4 = r1.j(r0, r4)
            r0 r4 = (defpackage.r0) r4
            goto L34
        L33:
            r4 = 0
        L34:
            boolean r0 = r4 instanceof defpackage.r0
            if (r0 == 0) goto L3d
            r0 r3 = defpackage.r0.v(r4)
            return r3
        L3d:
            boolean r0 = r4 instanceof defpackage.x0
            if (r0 == 0) goto L45
            x0 r3 = defpackage.x0.x(r4)
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.b0(mn0, int):u0");
    }

    public static final void c(final String str, final List list, final Object obj, final tm1 tm1Var, final tm1 tm1Var2, final long j, l13 l13Var, fe0 fe0Var, final int i) {
        final l13 l13Var2;
        Object obj2;
        k80 k80Var;
        long j2;
        sg sgVar;
        long j3;
        t43 t43Var;
        tm1 tm1Var3;
        sg sgVar2 = q8.a0;
        sg sgVar3 = q8.d0;
        sg sgVar4 = q8.b0;
        sg sgVar5 = q8.c0;
        list.getClass();
        tm1Var.getClass();
        tm1Var2.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1244914612);
        int i2 = i | (go1Var.g(list) ? 32 : 16) | (go1Var.g(obj) ? 256 : 128) | (go1Var.i(tm1Var) ? 2048 : 1024) | 1572864;
        if (go1Var.T(i2 & 1, (533651 & i2) != 533650)) {
            i51 i51Var = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(i13Var, 0.0f, 4.0f, 1);
            ba0 a = z90.a(i42.d, q8.V, go1Var, 0);
            long j4 = go1Var.T;
            int i3 = (int) (j4 ^ (j4 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar5, a);
            qi4.k(go1Var, sgVar4, m);
            r7.G(i3, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar2, x0);
            k80 k80Var3 = k80Var2;
            int i4 = i2;
            i13 i13Var2 = i13Var;
            boolean z2 = true;
            r55.b(str, i42.G0(i13Var, 4.0f, 0.0f, 0.0f, 6.0f, 6), k80Var2.q, 0L, qk1.O, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.i, go1Var, 1572918, 0, 131000);
            go1Var = go1Var;
            kp kpVar = new kp(8.0f, true, new y9());
            l13 e = nq4.e(i13Var2, 1.0f);
            u74 a2 = t74.a(kpVar, q8.S, go1Var, 6);
            long j5 = go1Var.T;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, e);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar5, a2);
            qi4.k(go1Var, sgVar4, m2);
            r7.G(i5, go1Var, sgVar3, go1Var);
            sg sgVar6 = sgVar2;
            qi4.k(go1Var, sgVar6, x02);
            go1Var.d0(451029266);
            for (Object obj3 : list) {
                boolean c = j42.c(obj3, obj);
                Object Q = go1Var.Q();
                jp jpVar = de0.a;
                if (Q == jpVar) {
                    Q = ad4.w(Boolean.FALSE);
                    go1Var.o0(Q);
                }
                t43 t43Var2 = (t43) Q;
                Object Q2 = go1Var.Q();
                if (Q2 == jpVar) {
                    Q2 = r7.v(go1Var);
                }
                t33 t33Var = (t33) Q2;
                t43 w = ut0.w(t33Var, go1Var);
                if (c) {
                    obj2 = obj3;
                    k80Var = k80Var3;
                    j2 = k80Var.d;
                } else {
                    obj2 = obj3;
                    k80Var = k80Var3;
                    j2 = k80Var.s;
                }
                long j6 = j2;
                boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
                if (c) {
                    sgVar = sgVar3;
                    j3 = k80Var.c;
                } else {
                    sgVar = sgVar3;
                    j3 = k80Var.G;
                }
                k80 k80Var4 = k80Var;
                go1 go1Var2 = go1Var;
                sg sgVar7 = sgVar6;
                i13 i13Var3 = i13Var2;
                Object obj4 = obj2;
                cw4 t0 = p70.t0(booleanValue, j3, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "menu_option_bg", go1Var2, 24576, 0);
                cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j6, k80Var4.v, "menu_option_fg", go1Var2, 3072);
                l13 g = nq4.g(new sc2(1.0f, true), 44.0f);
                Object Q3 = go1Var2.Q();
                if (Q3 == jpVar) {
                    t43Var = t43Var2;
                    Q3 = new xx2(t43Var, (byte) 2);
                    go1Var2.o0(Q3);
                } else {
                    t43Var = t43Var2;
                }
                l13 B = mw2.B(i42.A0(g, (tm1) Q3), false, null, 3);
                int i6 = i4;
                int i7 = i6 & 7168;
                boolean i8 = (i7 == 2048) | go1Var2.i(obj4);
                Object Q4 = go1Var2.Q();
                if (i8 || Q4 == jpVar) {
                    tm1Var3 = tm1Var;
                    i4 = i6;
                    Q4 = new tx2(tm1Var3, obj4, (byte) 1);
                    go1Var2.o0(Q4);
                } else {
                    tm1Var3 = tm1Var;
                    i4 = i6;
                }
                l13 d = r13.d(B, null, null, null, null, (rm1) Q4, null, null, null, null, null, null, t33Var, 130815);
                boolean i9 = (i7 == 2048) | go1Var2.i(obj4);
                Object Q5 = go1Var2.Q();
                if (i9 || Q5 == jpVar) {
                    Q5 = new ik0(tm1Var3, obj4, (byte) 1);
                    go1Var2.o0(Q5);
                }
                l13 u = r7.u(12.0f, m05.b(d, obj4, (PointerInputEventHandler) Q5), t0);
                uw2 c2 = px.c(q8.N, false);
                long j7 = go1Var2.T;
                int i10 = (int) (j7 ^ (j7 >>> 32));
                am3 m3 = go1Var2.m();
                l13 x03 = i42.x0(go1Var2, u);
                xd0.c.getClass();
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar5, c2);
                qi4.k(go1Var2, sgVar4, m3);
                sg sgVar8 = sgVar;
                r7.G(i10, go1Var2, sgVar8, go1Var2);
                qi4.k(go1Var2, sgVar7, x03);
                r55.b((String) tm1Var2.invoke(obj4), p70.G(i13Var3, s0, j6, false, null, 12), j6, oh4.j(14), (c || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, 24576, 0, 262056);
                go1Var = go1Var2;
                go1Var.q(true);
                k80Var3 = k80Var4;
                sgVar3 = sgVar8;
                i13Var2 = i13Var3;
                z2 = true;
                sgVar6 = sgVar7;
            }
            boolean z3 = z2;
            r7.J(go1Var, false, z3, z3);
            l13Var2 = i13Var2;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1(str, list, obj, tm1Var, tm1Var2, j, l13Var2, i) { // from class: dy2
                public final /* synthetic */ String I;
                public final /* synthetic */ List J;
                public final /* synthetic */ Object K;
                public final /* synthetic */ tm1 L;
                public final /* synthetic */ tm1 M;
                public final /* synthetic */ long N;
                public final /* synthetic */ l13 O;

                @Override // defpackage.hn1
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int X = mu0.X(24583);
                    lq2.c(this.I, this.J, this.K, this.L, this.M, this.N, this.O, (fe0) obj5, X);
                    return wd5.a;
                }
            };
        }
    }

    public static l13 c0(l13 l13Var, ge geVar) {
        return l13Var.then(new np3(geVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.hx1 r52, final java.lang.String r53, final defpackage.rm1 r54, defpackage.l13 r55, boolean r56, boolean r57, java.lang.String r58, java.lang.String r59, defpackage.in1 r60, float r61, long r62, defpackage.ji3 r64, int r65, int r66, defpackage.fe0 r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.d(hx1, java.lang.String, rm1, l13, boolean, boolean, java.lang.String, java.lang.String, in1, float, long, ji3, int, int, fe0, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d0  */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d0(android.view.ViewStructure r42, defpackage.wa2 r43, android.view.autofill.AutofillId r44, java.lang.String r45, defpackage.o14 r46) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.d0(android.view.ViewStructure, wa2, android.view.autofill.AutofillId, java.lang.String, o14):void");
    }

    public static final void e(float f, final String str, final int i, fe0 fe0Var, final int i2) {
        final float f2;
        int i3;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(549233870);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            f2 = f;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 = (go1Var2.d(f2) ? 32 : 16) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if (go1Var2.T(i3 & 1, (i3 & 19) != 18)) {
            float f3 = i4 != 0 ? 0.0f : f2;
            i51 i51Var = lw2.b;
            go1Var = go1Var2;
            r55.b(str, i42.G0(i13.a, 8.0f, f3, 0.0f, 6.0f, 4), ((fw2) go1Var2.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.n, go1Var, 6, 0, 131064);
            f2 = f3;
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: by2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    lq2.e(f2, str, X, (fe0) obj, i2);
                    return wd5.a;
                }
            };
        }
    }

    public static final e75 e0(js jsVar, be beVar) {
        wa2 U = ut0.U(jsVar);
        int i = U.J;
        o14 rectManager = za2.a(U).getRectManager();
        f75 f75Var = rectManager.d;
        f75Var.getClass();
        q33 q33Var = f75Var.a;
        e75 e75Var = new e75(f75Var, i, jsVar, beVar);
        Object b = q33Var.b(i);
        if (b == null) {
            q33Var.i(i, e75Var);
            b = e75Var;
        }
        e75 e75Var2 = (e75) b;
        if (e75Var2 != e75Var) {
            while (true) {
                e75 e75Var3 = e75Var2.d;
                if (e75Var3 == null) {
                    break;
                }
                e75Var2 = e75Var3;
            }
            e75Var2.d = e75Var;
        }
        wa2 U2 = ut0.U(jsVar.getNode());
        if (U2.O != -4) {
            tl tlVar = rectManager.c;
            int d = rectManager.d(U2);
            long[] jArr = (long[]) tlVar.b;
            int i2 = d + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f = true;
        rectManager.j();
        return e75Var;
    }

    public static final void f(final String str, final boolean z, final boolean z2, final boolean z3, final rm1 rm1Var, final l13 l13Var, final float f, final boolean z4, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var;
        boolean z5;
        l13 l13Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1835686007);
        if ((i & 6) == 0) {
            i2 = (go1Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var2.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var2.i(rm1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var2.g(l13Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var2.d(f) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= go1Var2.h(z4) ? 8388608 : 4194304;
        }
        if (go1Var2.T(i2 & 1, (4793491 & i2) != 4793490)) {
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var2);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            cw4 a = eh.a((z || ((Boolean) t43Var.getValue()).booleanValue()) ? 12.0f : 4.0f, ((fw2) go1Var2.k(i51Var)).d.c(), "menu_segment_corner", go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK);
            long j = z ? k80Var.d : k80Var.s;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), z ? k80Var.c : k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "menu_segment_bg", go1Var2, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "menu_segment_fg", go1Var2, 3072);
            l13 g = nq4.g(l13Var, f);
            boolean g2 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | go1Var2.g(a);
            Object Q3 = go1Var2.Q();
            if (g2 || Q3 == jpVar) {
                Q3 = new xe(z2, z3, a);
                go1Var2.o0(Q3);
            }
            l13 H = p70.H(qb.O(g, (tm1) Q3), t0);
            Object Q4 = go1Var2.Q();
            byte b = 3;
            if (Q4 == jpVar) {
                Q4 = new xx2(t43Var, b);
                go1Var2.o0(Q4);
            }
            l13 A0 = i42.A0(H, (tm1) Q4);
            i13 i13Var = i13.a;
            if (z4) {
                z5 = false;
                l13Var2 = mw2.B(r13.d(i13Var, null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3);
            } else {
                z5 = false;
                l13Var2 = i13Var;
            }
            l13 then = A0.then(l13Var2);
            uw2 c = px.c(q8.N, z5);
            long j2 = go1Var2.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, then);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            r55.b(str, p70.G(i13Var, s0, j, false, null, 12), j, 0L, (z || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1.P : qk1.O, 0L, null, 0L, 2, false, 1, 0, xc3.d, go1Var2, i2 & 14, 28032, 102328);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ey2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lq2.f(str, z, z2, z3, rm1Var, l13Var, f, z4, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final long f0(m14 m14Var) {
        float f = m14Var.c - m14Var.a;
        float f2 = m14Var.d - m14Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.util.List r24, final java.lang.Object r25, final defpackage.hn1 r26, final defpackage.tm1 r27, defpackage.l13 r28, defpackage.ki1 r29, float r30, boolean r31, defpackage.l13 r32, defpackage.fe0 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.g(java.util.List, java.lang.Object, hn1, tm1, l13, ki1, float, boolean, l13, fe0, int, int):void");
    }

    public static void g0(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
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
                long k10 = nt3.k(j25, j18, k9 >>> 32, j29);
                long j31 = j28 + (k10 >>> 32);
                int i14 = (int) k7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) k8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) k9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) k10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j31;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j31 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final String str, final String str2, float f, final z60 z60Var, final int i, tm1 tm1Var, final float f2, final float f3, l13 l13Var, fe0 fe0Var, final int i2, final int i3) {
        l13 l13Var2;
        int i4;
        final tm1 tm1Var2;
        final l13 l13Var3;
        boolean z;
        Object yx2Var;
        int i5;
        k80 k80Var;
        jp jpVar;
        sg sgVar;
        z60 z60Var2;
        int i6;
        Integer num;
        qk1 qk1Var;
        int i7;
        Object yx2Var2;
        Object[] objArr;
        uj3 uj3Var;
        df0 df0Var;
        final float f4 = f;
        tm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1953067269);
        int i8 = i2 | (go1Var.g(str2) ? 32 : 16) | (go1Var.d(f4) ? 256 : 128) | (go1Var.g(z60Var) ? 2048 : 1024) | (go1Var.i(tm1Var) ? 131072 : 65536);
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 = i8 | 100663296;
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            i4 = i8 | (go1Var.g(l13Var2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432);
        }
        if (go1Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            i13 i13Var = i13.a;
            if (i9 != 0) {
                l13Var2 = i13Var;
            }
            i51 i51Var = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var)).a;
            boolean z2 = (i4 & 7168) == 2048;
            Object Q = go1Var.Q();
            jp jpVar2 = de0.a;
            if (z2 || Q == jpVar2) {
                z60 z60Var3 = new z60(z60Var.a, z60Var.b);
                go1Var.o0(z60Var3);
                Q = z60Var3;
            }
            z60 z60Var4 = (z60) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar2) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            l13 l13Var4 = l13Var2;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var2.G, k80Var2.H, false, "video_menu_slider_bg", go1Var, 27648, 0);
            l13 E0 = i42.E0(l13Var4, 0.0f, 4.0f, 1);
            jp jpVar3 = i42.d;
            tv tvVar = q8.V;
            ba0 a = z90.a(jpVar3, tvVar, go1Var, 0);
            long j = go1Var.T;
            int i10 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z3 = go1Var.S;
            df0 df0Var2 = wa2.A0;
            if (z3) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            sg sgVar2 = q8.c0;
            qi4.k(go1Var, sgVar2, a);
            sg sgVar3 = q8.b0;
            qi4.k(go1Var, sgVar3, m);
            Integer valueOf = Integer.valueOf(i10);
            sg sgVar4 = q8.d0;
            qi4.k(go1Var, sgVar4, valueOf);
            qi4.j(go1Var);
            sg sgVar5 = q8.a0;
            qi4.k(go1Var, sgVar5, x0);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
            long j2 = k80Var2.q;
            qk1 qk1Var2 = qk1.O;
            r55.b(str, i42.G0(i13Var, 4.0f, 0.0f, 4.0f, 6.0f, 2), j2, 0L, qk1Var2, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 1572918, 0, 131000);
            l13 u = r7.u(16.0f, nq4.e(i13Var, 1.0f), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar2) {
                z = false;
                Q3 = new xx2(t43Var, null == true ? 1 : 0);
                go1Var.o0(Q3);
            } else {
                z = false;
            }
            l13 B = mw2.B(i42.A0(u, (tm1) Q3), z, null, 3);
            int i11 = i4 & 458752;
            int i12 = i4 & 896;
            boolean g = (i11 == 131072) | (i12 == 256) | go1Var.g(z60Var4);
            Object Q4 = go1Var.Q();
            if (g || Q4 == jpVar2) {
                i5 = i4;
                k80Var = k80Var2;
                jpVar = jpVar2;
                sgVar = sgVar2;
                z60Var2 = z60Var4;
                i6 = 131072;
                yx2Var = new yx2(f2, tm1Var, f, z60Var2, (byte) 0);
                go1Var.o0(yx2Var);
            } else {
                i5 = i4;
                k80Var = k80Var2;
                sgVar = sgVar2;
                jpVar = jpVar2;
                z60Var2 = z60Var4;
                yx2Var = Q4;
                i6 = 131072;
            }
            rm1 rm1Var = (rm1) yx2Var;
            boolean g2 = (i11 == i6) | (i12 == 256) | go1Var.g(z60Var2);
            Object Q5 = go1Var.Q();
            if (g2 || Q5 == jpVar) {
                yx2 yx2Var3 = new yx2(f2, tm1Var, f, z60Var2, (byte) 1);
                go1Var.o0(yx2Var3);
                Q5 = yx2Var3;
            }
            rm1 rm1Var2 = (rm1) Q5;
            boolean g3 = (i11 == i6) | (i12 == 256) | go1Var.g(z60Var2);
            Object Q6 = go1Var.Q();
            if (g3 || Q6 == jpVar) {
                num = 21;
                qk1Var = qk1Var2;
                i7 = 256;
                yx2 yx2Var4 = new yx2(f3, tm1Var, f, z60Var2, (byte) 2);
                go1Var.o0(yx2Var4);
                Q6 = yx2Var4;
            } else {
                num = 21;
                qk1Var = qk1Var2;
                i7 = 256;
            }
            uj3 uj3Var2 = new uj3(num, (rm1) Q6);
            boolean g4 = (i11 == 131072) | (i12 == i7) | go1Var.g(z60Var2);
            Object Q7 = go1Var.Q();
            if (g4 || Q7 == jpVar) {
                f4 = f;
                objArr = 131072;
                uj3Var = uj3Var2;
                yx2Var2 = new yx2(f3, tm1Var, f4, z60Var2, (byte) 3);
                go1Var.o0(yx2Var2);
            } else {
                uj3Var = uj3Var2;
                objArr = 131072;
                yx2Var2 = Q7;
                f4 = f;
            }
            l13 D0 = i42.D0(r13.d(B, rm1Var, rm1Var2, null, null, null, null, null, null, sv2.K(uj3Var, new uj3(22, (rm1) yx2Var2)), null, null, null, 258042), 16.0f, 12.0f);
            ba0 a2 = z90.a(jpVar3, tvVar, go1Var, 0);
            long j3 = go1Var.T;
            int i13 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, D0);
            go1Var.h0();
            if (go1Var.S) {
                df0Var = df0Var2;
                go1Var.l(df0Var);
            } else {
                df0Var = df0Var2;
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar3, m2);
            r7.G(i13, go1Var, sgVar4, go1Var);
            qi4.k(go1Var, sgVar5, x02);
            l13 e = nq4.e(i13Var, 1.0f);
            u74 a3 = t74.a(i42.f, q8.T, go1Var, 54);
            jp jpVar4 = jpVar;
            long j4 = go1Var.T;
            int i14 = (int) (j4 ^ (j4 >>> 32));
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, e);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar3, m3);
            r7.G(i14, go1Var, sgVar4, go1Var);
            qi4.k(go1Var, sgVar5, x03);
            r55.b(str2, null, k80Var.q, oh4.j(14), qk1Var, 0L, null, 0L, 0, false, 0, 0, null, go1Var, (14 & (i5 >> 3)) | 1597440, 0, 262058);
            r55.b("左右键微调，长按加速", null, k80Var.s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 24582, 0, 262122);
            go1Var.q(true);
            float q = ut0.q(f4, z60Var2.a, z60Var2.b);
            l13 e2 = nq4.e(i13Var, 1.0f);
            Object Q8 = go1Var.Q();
            if (Q8 == jpVar4) {
                Q8 = new do2((byte) 6);
                go1Var.o0(Q8);
            }
            l13 R = qg5.R(e2, (tm1) Q8);
            boolean g5 = go1Var.g(z60Var2) | (i11 == 131072);
            Object Q9 = go1Var.Q();
            if (g5 || Q9 == jpVar4) {
                tm1Var2 = tm1Var;
                Q9 = new ay2(tm1Var2, z60Var2, (byte) 0);
                go1Var.o0(Q9);
            } else {
                tm1Var2 = tm1Var;
            }
            or4.a(q, (tm1) Q9, R, false, z60Var2, i, null, null, go1Var, 196608);
            go1Var = go1Var;
            go1Var.q(true);
            go1Var.q(true);
            l13Var3 = l13Var4;
        } else {
            tm1Var2 = tm1Var;
            go1Var.W();
            l13Var3 = l13Var2;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1(str, str2, f4, z60Var, i, tm1Var2, f2, f3, l13Var3, i2, i3) { // from class: wx2
                public final /* synthetic */ String I;
                public final /* synthetic */ String J;
                public final /* synthetic */ float K;
                public final /* synthetic */ z60 L;
                public final /* synthetic */ byte M;
                public final /* synthetic */ tm1 N;
                public final /* synthetic */ float O;
                public final /* synthetic */ float P;
                public final /* synthetic */ l13 Q;
                public final /* synthetic */ short R;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.R = i3;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(14180359);
                    lq2.h(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (fe0) obj, X, this.R);
                    return wd5.a;
                }
            };
        }
    }

    public static void h0(int[] iArr, int[] iArr2) {
        g0(iArr, iArr2);
        long j = 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        int i = 5;
        int i2 = 12;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = iArr[i + 6] & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 11] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 10] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[12] = (int) j6;
                long j7 = iArr[7] & j5;
                long j8 = (j7 * j2) + (((i3 << 31) & j5) | (j6 >>> 33));
                int i6 = (int) j8;
                iArr2[13] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j9 = (iArr2[14] & j5) + (j8 >>> 32);
                long j10 = iArr[8] & j5;
                long j11 = (j10 * j2) + j9;
                int i7 = (int) j11;
                iArr2[14] = (i7 << 1) | (i6 >>> 31);
                long k = nt3.k(j10, j7, j11 >>> 32, iArr2[15] & j5);
                long j12 = (iArr2[16] & j5) + (k >>> 32);
                long j13 = iArr[9] & j5;
                long j14 = (iArr2[17] & j5) + (j12 >>> 32);
                long j15 = j12 & j5;
                long j16 = (iArr2[18] & j5) + (j14 >>> 32);
                long j17 = j14 & j5;
                long j18 = (j13 * j2) + (k & j5);
                int i8 = (int) j18;
                iArr2[15] = (i8 << 1) | (i7 >>> 31);
                long k2 = nt3.k(j13, j7, j18 >>> 32, j15);
                long k3 = nt3.k(j13, j10, k2 >>> 32, j17);
                long j19 = j16 + (k3 >>> 32);
                long j20 = k3 & j5;
                long j21 = iArr[10] & j5;
                long j22 = (iArr2[19] & j5) + (j19 >>> 32);
                long j23 = j19 & j5;
                long j24 = (iArr2[20] & j5) + (j22 >>> 32);
                long j25 = j22 & j5;
                long j26 = (j21 * j2) + (k2 & j5);
                int i9 = (int) j26;
                iArr2[16] = (i9 << 1) | (i8 >>> 31);
                long k4 = nt3.k(j21, j7, j26 >>> 32, j20);
                long k5 = nt3.k(j21, j10, k4 >>> 32, j23);
                long k6 = nt3.k(j21, j13, k5 >>> 32, j25);
                long j27 = j24 + (k6 >>> 32);
                long j28 = k6 & j5;
                long j29 = iArr[11] & j5;
                long j30 = (iArr2[21] & j5) + (j27 >>> 32);
                long j31 = j27 & j5;
                long j32 = (iArr2[22] & j5) + (j30 >>> 32);
                long j33 = j30 & j5;
                long j34 = (j29 * j2) + (k4 & j5);
                int i10 = (int) j34;
                iArr2[17] = (i10 << 1) | (i9 >>> 31);
                long k7 = nt3.k(j29, j7, j34 >>> 32, k5 & j5);
                long k8 = nt3.k(j29, j10, k7 >>> 32, j28);
                long k9 = nt3.k(j29, j13, k8 >>> 32, j31);
                long k10 = nt3.k(j29, j21, k9 >>> 32, j33);
                long j35 = j32 + (k10 >>> 32);
                int i11 = (int) k7;
                iArr2[18] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) k8;
                iArr2[19] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) k9;
                iArr2[20] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) k10;
                iArr2[21] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j35;
                iArr2[22] = i16 | (i17 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j35 >>> 32))) << 1) | (i17 >>> 31);
                int r = r(iArr2, iArr2);
                int q = q(18, 12, q(0, 6, 0, iArr2, iArr2) + r, iArr2, iArr2) + r;
                int[] iArr3 = new int[6];
                x(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                g0(iArr3, iArr4);
                dq2.h(24, dq2.E0(12, 6, iArr4, iArr2) + q, 18, iArr2);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    public static final void i(tm1 tm1Var, float f, z60 z60Var, float f2) {
        tm1Var.invoke(Float.valueOf(ut0.q(f + f2, Float.valueOf(z60Var.a).floatValue(), Float.valueOf(z60Var.b).floatValue())));
    }

    public static int i0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >> 32);
    }

    public static final void j(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(790527681);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                jk3 jk3Var = new jk3(null, q8.v0);
                go1Var.o0(jk3Var);
                Q = jk3Var;
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new sf(t43Var, (byte) 14);
                go1Var.o0(Q2);
            }
            rm1 rm1Var = (rm1) Q2;
            zq3 zq3Var = at0.a;
            bv g = d4.g(wx5.h, go1Var, 6);
            mw2.c(new ay3[]{g35.b.a(g4.X(rm1Var, go1Var, 2)), g35.a.a(g)}, p70.u0(1070596993, new in2(l13Var, t43Var, tc0Var, g, rm1Var), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rf(l13Var, tc0Var, i, b);
        }
    }

    public static void j0(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        iArr3[5] = (int) (((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32));
    }

    public static final void k(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(155925518);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        byte b = 3;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = go1Var.k(g35.a) != null;
            boolean z2 = go1Var.k(g35.b) != null;
            if (z && z2) {
                go1Var.d0(-1977187922);
                uw2 c = px.c(q8.J, true);
                long j = go1Var.T;
                int i3 = (int) (j ^ (j >>> 32));
                am3 m = go1Var.m();
                l13 x0 = i42.x0(go1Var, l13Var);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(wa2.A0);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, q8.c0, c);
                qi4.k(go1Var, q8.b0, m);
                qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
                qi4.j(go1Var);
                qi4.k(go1Var, q8.a0, x0);
                tc0Var.invoke(go1Var, Integer.valueOf((i2 >> 3) & 14));
                go1Var.q(true);
                go1Var.q(false);
            } else if (z) {
                go1Var.d0(-1976997706);
                g4.f(l13Var, tc0Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                go1Var.q(false);
            } else if (z2) {
                go1Var.d0(-1976846922);
                at0.d(l13Var, tc0Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                go1Var.q(false);
            } else {
                go1Var.d0(-1976716505);
                j(l13Var, tc0Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rf(l13Var, tc0Var, i, b);
        }
    }

    public static void k0(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        iArr2[5] = (int) (((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j5 >> 32));
    }

    public static final void l(lq1 lq1Var, int i, int i2, final in1 in1Var, fe0 fe0Var, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1208072102);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
        } else {
            i5 = (go1Var.g(lq1Var) ? 4 : 2) | i3;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i6 = i5 | 48;
        } else {
            i6 = i5 | (go1Var.e(i) ? 32 : 16);
        }
        int i10 = i4 & 4;
        if (i10 != 0) {
            i7 = i6 | RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            i7 = i6 | (go1Var.e(i2) ? 256 : 128);
        }
        if ((i7 & 1171) == 1170 && go1Var.F()) {
            go1Var.W();
        } else {
            if (i8 != 0) {
                lq1Var = jq1.a;
            }
            if (i9 != 0) {
                i = 0;
            }
            if (i10 != 0) {
                i2 = 0;
            }
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = s74.I;
                go1Var.o0(Q);
            }
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-683746039);
            go1Var.e0(-548224868);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(rm1Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new zw1((byte) 27), lq1Var);
            qi4.k(go1Var, new zw1((byte) 28), new s8(i2));
            qi4.k(go1Var, new zw1((byte) 29), new r8(i));
            in1Var.invoke(x74.a, go1Var, 54);
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
        }
        final lq1 lq1Var2 = lq1Var;
        final int i11 = i;
        final int i12 = i2;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(i11, i12, in1Var, i3, i4) { // from class: r74
                public final /* synthetic */ byte J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ in1 L;
                public final /* synthetic */ byte M;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.M = i4;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(3073);
                    lq1 lq1Var3 = lq1.this;
                    byte b = this.J;
                    boolean z = this.K;
                    in1 in1Var2 = this.L;
                    byte b2 = this.M;
                    lq2.l(lq1Var3, b, z ? 1 : 0, in1Var2, (fe0) obj, X, b2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void l0(int i, String str) {
        throw new SQLException(hf1.u(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final void m(final boolean z, boolean z2, fe0 fe0Var, final int i) {
        int i2;
        final boolean z3 = z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1877639947);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z3) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(true) ? 256 : 128;
        }
        int i3 = i2;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            int i4 = ((i3 >> 3) & 14) | 3072;
            long r = p70.r(z3, k80Var.a, k80Var.v, "row_switch_checked_border", go1Var, i4);
            z3 = z2;
            long r2 = p70.r(z3, k80Var.A, k80Var.v, "row_switch_unchecked_border", go1Var, i4);
            long e = q80.e(qg5.i0, go1Var);
            long e2 = q80.e(qg5.l0, go1Var);
            long e3 = q80.e(qg5.k0, go1Var);
            long e4 = q80.e(qg5.r0, go1Var);
            long e5 = q80.e(qg5.u0, go1Var);
            long e6 = q80.e(qg5.t0, go1Var);
            long A = qb.A(x70.c(q80.e(qg5.U, go1Var), qg5.V), ((fw2) go1Var.k(i51Var)).a.p);
            long e7 = q80.e(qg5.Y, go1Var);
            float f = qg5.Z;
            s05 s05Var = new s05(e, e2, r, e3, e4, e5, r2, e6, A, qb.A(x70.c(e7, f), ((fw2) go1Var.k(i51Var)).a.p), x70.f, qb.A(x70.c(q80.e(qg5.W, go1Var), qg5.X), ((fw2) go1Var.k(i51Var)).a.p), qb.A(x70.c(q80.e(qg5.a0, go1Var), qg5.b0), ((fw2) go1Var.k(i51Var)).a.p), qb.A(x70.c(q80.e(qg5.e0, go1Var), f), ((fw2) go1Var.k(i51Var)).a.p), qb.A(x70.c(q80.e(qg5.f0, go1Var), f), ((fw2) go1Var.k(i51Var)).a.p), qb.A(x70.c(q80.e(qg5.c0, go1Var), qg5.d0), ((fw2) go1Var.k(i51Var)).a.p));
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = new do2((byte) 7);
                go1Var.o0(Q);
            }
            t05.a(z, qg5.R(i13.a, (tm1) Q), s05Var, go1Var, (i3 & 14) | 48 | (57344 & (i3 << 6)));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: hy2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    lq2.m(z, z3, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static BigInteger m0(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                dq2.a0(bArr, i2, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final java.lang.String r37, final boolean r38, final defpackage.tm1 r39, defpackage.l13 r40, defpackage.hx1 r41, java.lang.String r42, java.lang.String r43, boolean r44, long r45, float r47, defpackage.ji3 r48, int r49, int r50, defpackage.fe0 r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq2.n(java.lang.String, boolean, tm1, l13, hx1, java.lang.String, java.lang.String, boolean, long, float, ji3, int, int, fe0, int, int, int):void");
    }

    public static BigInteger n0(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                dq2.n0(bArr, (2 - i) << 3, j);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int o(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    public static String o0(Map map) {
        int size = map.size();
        j42.l(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    public static final void p0(v71 v71Var, do2 do2Var) {
        ArrayList arrayList = v71Var.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            k71 k71Var = (k71) do2Var.invoke((k71) obj);
            arrayList.set(i, k71Var);
            if (k71Var instanceof v71) {
                p0((v71) k71Var, do2Var);
            }
            i = i3;
        }
    }

    public static int q(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[r10]) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int r(int[] iArr, int[] iArr2) {
        long j = (iArr[6] & 4294967295L) + (iArr2[12] & 4294967295L);
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (iArr[7] & 4294967295L) + (iArr2[13] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (iArr[8] & 4294967295L) + (iArr2[14] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (iArr[9] & 4294967295L) + (iArr2[15] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (iArr[10] & 4294967295L) + (iArr2[16] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (iArr[11] & 4294967295L) + (4294967295L & iArr2[17]) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static final LinkedHashMap r0(v71 v71Var) {
        ArrayList arrayList = v71Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            k71 k71Var = (k71) obj;
            lq1 b = k71Var.b();
            uj3 uj3Var = b.b(ne.M) ? (uj3) b.foldIn(new uj3(null, jq1.a), cx1.V) : new uj3(null, b);
            z6 z6Var = (z6) uj3Var.I;
            lq1 lq1Var = (lq1) uj3Var.J;
            d6 d6Var = z6Var != null ? z6Var.a : null;
            uj3 uj3Var2 = d6Var instanceof s92 ? new uj3(d6Var, lq1Var) : new uj3(null, lq1Var);
            if (k71Var instanceof v71) {
                for (Map.Entry entry : r0((v71) k71Var).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object obj2 = linkedHashMap.get(str);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str, obj2);
                    }
                    ((List) obj2).addAll(list);
                }
            }
            i = i3;
        }
        return linkedHashMap;
    }

    public static int s(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Log.LOG_LEVEL_OFF;
        }
        j42.l(i, "expectedSize");
        return i + 1;
    }

    public static int t(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, io.n(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float u(float f, float f2, float f3, float f4, float f5) {
        return S(f, f2, Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static void v(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    public static void w(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
    }

    public static boolean x(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] - 2147483648;
            int i3 = iArr2[i] - 2147483648;
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            j0(iArr, 6, iArr2, 0, iArr3);
            return z;
        }
        j0(iArr2, 0, iArr, 6, iArr3);
        return z;
    }

    public static void y(ya2 ya2Var, yg3 yg3Var, wy wyVar, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = yg3Var instanceof wg3;
        me1 me1Var = me1.a;
        if (z) {
            m14 m14Var = ((wg3) yg3Var).a;
            float f3 = m14Var.a;
            ya2Var.i0(wyVar, (Float.floatToRawIntBits(m14Var.b) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), f0(m14Var), f2, me1Var, null, 3);
            return;
        }
        if (!(yg3Var instanceof xg3)) {
            if (yg3Var instanceof vg3) {
                ya2Var.m(((vg3) yg3Var).a, wyVar, f2, me1Var, null, 3);
                return;
            } else {
                s83.v();
                return;
            }
        }
        xg3 xg3Var = (xg3) yg3Var;
        yd ydVar = xg3Var.b;
        if (ydVar != null) {
            ya2Var.m(ydVar, wyVar, f2, me1Var, null, 3);
            return;
        }
        h74 h74Var = xg3Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (h74Var.h >> 32));
        float f4 = h74Var.a;
        ya2Var.b0(wyVar, (Float.floatToRawIntBits(h74Var.b) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(h74Var.b()) << 32) | (Float.floatToRawIntBits(h74Var.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f2, me1Var, null, 3);
    }

    public static void z(y31 y31Var, yg3 yg3Var, long j) {
        if (yg3Var instanceof wg3) {
            m14 m14Var = ((wg3) yg3Var).a;
            float f = m14Var.a;
            float f2 = m14Var.b;
            y31Var.h0(j, (4294967295L & Float.floatToRawIntBits(f2)) | (Float.floatToRawIntBits(f) << 32), f0(m14Var), 1.0f, 3);
            return;
        }
        boolean z = yg3Var instanceof xg3;
        me1 me1Var = me1.a;
        if (!z) {
            if (yg3Var instanceof vg3) {
                y31Var.Z(((vg3) yg3Var).a, j, me1Var);
                return;
            } else {
                s83.v();
                return;
            }
        }
        xg3 xg3Var = (xg3) yg3Var;
        yd ydVar = xg3Var.b;
        if (ydVar != null) {
            y31Var.Z(ydVar, j, me1Var);
            return;
        }
        h74 h74Var = xg3Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (h74Var.h >> 32));
        float f3 = h74Var.a;
        float f4 = h74Var.b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        float b = h74Var.b();
        float a = h74Var.a();
        y31Var.n(1.0f, j, floatToRawIntBits, (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }
}
