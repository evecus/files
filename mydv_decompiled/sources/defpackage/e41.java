package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.github.mytv.dv.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class e41 implements n51 {
    public static hx1 g = null;
    public static hx1 h = null;
    public static hx1 i = null;
    public static boolean j = false;
    public static Method k = null;
    public static boolean l = false;
    public static Field m = null;
    public static final int n = 9;
    public static final int o = 10;
    public static final int p = 12;
    public static hx1 q;
    public final /* synthetic */ byte f = 1;

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if ((r1 >= 28 ? false : defpackage.cr5.a(r9).b(r9, r11)) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A(defpackage.m82 r8, android.view.View r9, android.view.Window.Callback r10, android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e41.A(m82, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static final ky5 A0(List list, ky5 ky5Var) {
        ky5 ky5Var2;
        list.getClass();
        boolean b = ky5Var.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean b2 = ky5Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean b3 = ky5Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!b && b2 && b3) {
            String str = ky5Var.c;
            cp0 cp0Var = new cp0((byte) 0);
            dp0 dp0Var = ky5Var.e;
            dp0Var.getClass();
            cp0Var.i(dp0Var.a);
            cp0Var.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            ky5Var2 = ky5.b(ky5Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", cp0Var.c(), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            ky5Var2 = ky5Var;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            ch0 ch0Var = ky5Var2.j;
            String str2 = ky5Var2.c;
            if (!j42.c(str2, ConstraintTrackingWorker.class.getName()) && (ch0Var.e || ch0Var.f)) {
                cp0 cp0Var2 = new cp0((byte) 0);
                dp0 dp0Var2 = ky5Var2.e;
                dp0Var2.getClass();
                cp0Var2.i(dp0Var2.a);
                cp0Var2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                return ky5.b(ky5Var2, null, null, ConstraintTrackingWorker.class.getName(), cp0Var2.c(), 0, 0L, 0, 0, 0L, 0, 33554411);
            }
        }
        return ky5Var2;
    }

    public static long D(int i2) {
        return (((r6 >>> 1) & 1431655765) << 32) | (1431655765 & g4.j(g4.j(g4.j(g4.j(i2, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1));
    }

    public static void E(int i2, long[] jArr, long[] jArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long k2 = g4.k(1, g4.k(2, g4.k(4, g4.k(8, g4.k(16, jArr[i4], 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
            jArr2[i3] = k2 & 6148914691236517205L;
            jArr2[i3 + 1] = (k2 >>> 1) & 6148914691236517205L;
            i3 += 2;
        }
    }

    public static int F(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter G(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static final hx1 I() {
        hx1 hx1Var = g;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(16.5f, 3.0f);
        r.r(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        r.q(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        r.q(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        r.r(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        r.x(12.0f, 21.35f);
        r.y(1.45f, -1.32f);
        r.q(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        r.q(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        r.p();
        r.z(12.1f, 18.55f);
        r.y(-0.1f, 0.1f);
        r.y(-0.1f, -0.1f);
        r.q(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        r.q(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        r.r(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        r.v(1.87f);
        r.q(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        r.r(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        r.r(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b = gx1Var.b();
        g = b;
        return b;
    }

    public static final hx1 K() {
        hx1 hx1Var = h;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.FormatSize", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(9.0f, 4.0f);
        epVar.M(3.0f);
        epVar.v(5.0f);
        epVar.M(12.0f);
        epVar.v(3.0f);
        epVar.x(17.0f, 7.0f);
        epVar.v(5.0f);
        epVar.x(22.0f, 4.0f);
        epVar.x(9.0f, 4.0f);
        epVar.p();
        epVar.z(3.0f, 12.0f);
        epVar.v(3.0f);
        epVar.M(7.0f);
        epVar.v(3.0f);
        epVar.M(-7.0f);
        epVar.v(3.0f);
        epVar.x(12.0f, 9.0f);
        epVar.x(3.0f, 9.0f);
        epVar.M(3.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b = gx1Var.b();
        h = b;
        return b;
    }

    public static final hx1 L() {
        hx1 hx1Var = i;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.GraphicEq", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(7.0f, 18.0f);
        epVar.v(2.0f);
        epVar.x(9.0f, 6.0f);
        epVar.x(7.0f, 6.0f);
        epVar.M(12.0f);
        epVar.p();
        epVar.z(11.0f, 22.0f);
        epVar.v(2.0f);
        epVar.x(13.0f, 2.0f);
        epVar.v(-2.0f);
        epVar.M(20.0f);
        epVar.p();
        epVar.z(3.0f, 14.0f);
        epVar.v(2.0f);
        epVar.M(-4.0f);
        epVar.x(3.0f, 10.0f);
        epVar.M(4.0f);
        epVar.p();
        epVar.z(15.0f, 18.0f);
        epVar.v(2.0f);
        epVar.x(17.0f, 6.0f);
        epVar.v(-2.0f);
        epVar.M(12.0f);
        epVar.p();
        epVar.z(19.0f, 10.0f);
        epVar.M(4.0f);
        epVar.v(2.0f);
        epVar.M(-4.0f);
        epVar.v(-2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b = gx1Var.b();
        i = b;
        return b;
    }

    public static final hx1 M() {
        hx1 hx1Var = q;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vk3(8.59f, 16.59f));
        arrayList.add(new uk3(13.17f, 12.0f));
        arrayList.add(new uk3(8.59f, 7.41f));
        arrayList.add(new uk3(10.0f, 6.0f));
        arrayList.add(new cl3(6.0f, 6.0f));
        arrayList.add(new cl3(-6.0f, 6.0f));
        arrayList.add(new cl3(-1.41f, -1.41f));
        arrayList.add(rk3.c);
        gx1.a(gx1Var, arrayList, rt4Var);
        hx1 b = gx1Var.b();
        q = b;
        return b;
    }

    public static int N(rh5 rh5Var) {
        return rh5Var.getLayoutDirection();
    }

    public static void O(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean Q(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static final boolean R(wf2 wf2Var, int i2) {
        return i2 <= wf2Var.e() && wf2Var.c() <= i2;
    }

    public static void U(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static final boolean V(Context context, tm1 tm1Var) {
        if (!vk1.a.get() && (!j42.c(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        mb2 x = zb2.x();
        tm1Var.invoke(x);
        zb2 zb2Var = (zb2) x.b();
        context.getClass();
        ux5 e = ux5.e(context);
        e.getClass();
        xe3 xe3Var = new xe3(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int a = zb2Var.a(null);
            byte[] bArr = new byte[a];
            Logger logger = j70.b;
            e70 e70Var = new e70(bArr, a);
            zb2Var.l(e70Var);
            if (e70Var.z() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            String str = np0.a;
            Byte[] bArr2 = new Byte[a];
            for (int i2 = 0; i2 < a; i2++) {
                bArr2[i2] = Byte.valueOf(bArr[i2]);
            }
            linkedHashMap.put("request", bArr2);
            dp0 dp0Var = new dp0(linkedHashMap);
            c5.j0(dp0Var);
            xe3Var.c.e = dp0Var;
            e.b(xe3Var.a());
            xe3 xe3Var2 = (xe3) new xe3(AsyncRequestWorker.class).e(3650L, TimeUnit.DAYS);
            xe3Var2.c.j = new ch0(new r93(null), x93.I, true, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? o70.u1(new LinkedHashSet()) : t91.I);
            e.c("updateRequestWorkerKeepEnabled", ac1.J, (ye3) xe3Var2.a());
            return true;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + zb2.class.getName() + " to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final void W(pw2 pw2Var, hh1 hh1Var, long j2, tm1 tm1Var) {
        if (ut0.I(ut0.G(pw2Var)) != 0.0f) {
            hh1Var.getClass();
            pw2Var.Q(pw2Var.p(Log.LOG_LEVEL_OFF));
            return;
        }
        ut0.G(pw2Var);
        bn3 u = pw2Var.u(j2);
        tm1Var.invoke(u);
        hh1Var.getClass();
        u.V();
        u.U();
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final long b(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final Object b0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final long c0(rz1 rz1Var, pg3 pg3Var, qz1 qz1Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        long j3 = rz1Var.g;
        if (pg3Var != null) {
            int i2 = qz1Var.a;
            if (i2 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (pg3Var == pg3.J) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j2 = floatToRawIntBits3 << 32;
            }
            j3 = j2 | (4294967295L & floatToRawIntBits);
        }
        long e = pd3.e(d0(rz1Var, pg3Var, qz1Var), j3);
        if (z || !rz1Var.i) {
            return e;
        }
        return 0L;
    }

    public static final void d(l13 l13Var, final ip ipVar, final mp mpVar, uv uvVar, int i2, int i3, final tc0 tc0Var, fe0 fe0Var, final int i4, final int i5) {
        l13 l13Var2;
        int i6;
        final uv uvVar2;
        final int i7;
        final int i8;
        final l13 l13Var3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1303174015);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i4 | 6;
            l13Var2 = l13Var;
        } else if ((i4 & 6) == 0) {
            l13Var2 = l13Var;
            i6 = i4 | (go1Var.g(l13Var2) ? 4 : 2);
        } else {
            l13Var2 = l13Var;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= go1Var.g(ipVar) ? 32 : 16;
        }
        int i10 = i6 | 224256;
        if (go1Var.T(i10 & 1, (599187 & i10) != 599186)) {
            l13 l13Var4 = i9 != 0 ? i13.a : l13Var2;
            uv uvVar3 = q8.S;
            e(l13Var4, ipVar, mpVar, k04.T, tc0Var, go1Var, (i10 & 14) | 1572864 | (i10 & 112) | 12807552);
            i7 = Integer.MAX_VALUE;
            i8 = Integer.MAX_VALUE;
            uvVar2 = uvVar3;
            l13Var3 = l13Var4;
        } else {
            go1Var.W();
            uvVar2 = uvVar;
            i7 = i2;
            i8 = i3;
            l13Var3 = l13Var2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ch1
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e41.d(l13.this, ipVar, mpVar, uvVar2, i7, i8, tc0Var, (fe0) obj, mu0.X(i4 | 1), i5);
                    return wd5.a;
                }
            };
        }
    }

    public static final long d0(rz1 rz1Var, pg3 pg3Var, qz1 qz1Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        if (pg3Var == null) {
            return rz1Var.c;
        }
        int i2 = qz1Var.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (rz1Var.c >> 32));
        } else {
            if (i2 != 2) {
                return rz1Var.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (rz1Var.c & 4294967295L));
        }
        if (pg3Var == pg3.J) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & floatToRawIntBits);
    }

    public static final void e(l13 l13Var, ip ipVar, mp mpVar, k04 k04Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        k04 k04Var2;
        boolean z;
        Object obj;
        uv uvVar = q8.S;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(ipVar) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(mpVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.g(uvVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.e(Log.LOG_LEVEL_OFF) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go1Var.e(Log.LOG_LEVEL_OFF) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            k04Var2 = k04Var;
            i3 |= go1Var.g(k04Var2) ? 1048576 : 524288;
        } else {
            k04Var2 = k04Var;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= go1Var.i(tc0Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (go1Var.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z2 = i5 == 1048576;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            Object obj2 = Q;
            if (z2 || Q == jpVar) {
                k04Var2.getClass();
                fh1 fh1Var = new fh1();
                go1Var.o0(fh1Var);
                obj2 = fh1Var;
            }
            fh1 fh1Var2 = (fh1) obj2;
            int i6 = i4 >> 3;
            boolean g2 = ((((i6 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var.g(uvVar)) || (i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i6 & 14) ^ 6) > 4 && go1Var.g(ipVar)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && go1Var.g(mpVar)) || (i6 & 48) == 32) | ((((i6 & 7168) ^ 3072) > 2048 && go1Var.e(Log.LOG_LEVEL_OFF)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && go1Var.e(Log.LOG_LEVEL_OFF)) || (i6 & 24576) == 16384) | go1Var.g(fh1Var2);
            Object Q2 = go1Var.Q();
            if (g2 || Q2 == jpVar) {
                hh1 hh1Var = new hh1(ipVar, mpVar, ipVar.b(), new xl0(), mpVar.b(), fh1Var2);
                go1Var.o0(hh1Var);
                Q2 = hh1Var;
            }
            hh1 hh1Var2 = (hh1) Q2;
            boolean z3 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object Q3 = go1Var.Q();
            if (z3 || Q3 == jpVar) {
                ArrayList arrayList = new ArrayList();
                z = true;
                arrayList.add(new tc0(-1192950673, new x10(tc0Var, true ? 1 : 0), true));
                k04Var.getClass();
                go1Var.o0(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = Q3;
            }
            tc0 tc0Var2 = new tc0(1271844412, new ka2((List) obj, (byte) 0), z);
            boolean g3 = go1Var.g(hh1Var2);
            Object Q4 = go1Var.Q();
            Object obj3 = Q4;
            if (g3 || Q4 == jpVar) {
                t23 t23Var = new t23(hh1Var2);
                go1Var.o0(t23Var);
                obj3 = t23Var;
            }
            uw2 uw2Var = (uw2) obj3;
            long j2 = go1Var.T;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, uw2Var);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i7));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var2.invoke(go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ra0(l13Var, ipVar, mpVar, k04Var, tc0Var, i2);
        }
    }

    public static final zg2 e0(fe0 fe0Var) {
        Object[] objArr = new Object[0];
        da daVar = zg2.x;
        boolean e = ((go1) fe0Var).e(0) | ((go1) fe0Var).e(0);
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (e || Q == de0.a) {
            Q = new d52((byte) 8);
            go1Var.o0(Q);
        }
        return (zg2) ut0.O(objArr, daVar, (rm1) Q, go1Var, 0);
    }

    public static final void f(fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1257244356);
        if (i2 == 0 && go1Var.F()) {
            go1Var.W();
        } else {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = rw1.I;
                go1Var.o0(Q);
            }
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-1115894518);
            go1Var.e0(1886828752);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            byte b = 1;
            if (go1Var.S) {
                go1Var.l(new mq1(rm1Var, b));
            } else {
                go1Var.r0();
            }
            r7.J(go1Var, true, false, false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bd0(i2);
        }
    }

    public static final Object f0(e43 e43Var) {
        if (e43Var.i()) {
            s83.l("List is empty.");
            return null;
        }
        int i2 = e43Var.b - 1;
        Object g2 = e43Var.g(i2);
        e43Var.l(i2);
        return g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x026f, code lost:
    
        if (r14.h(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.l13 r37, defpackage.wd2 r38, final defpackage.xr1 r39, final defpackage.li3 r40, final defpackage.gf1 r41, final boolean r42, final defpackage.sc r43, final defpackage.mp r44, final defpackage.ip r45, final defpackage.tm1 r46, defpackage.fe0 r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e41.g(l13, wd2, xr1, li3, gf1, boolean, sc, mp, ip, tm1, fe0, int, int):void");
    }

    public static void g0(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static final void h(float f, lq1 lq1Var, i80 i80Var, i80 i80Var2, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-12096187);
        byte b = 2;
        if ((((go1Var.d(f) ? 4 : 2) | i2 | (go1Var.g(lq1Var) ? 32 : 16) | (go1Var.i(i80Var) ? 256 : 128) | (go1Var.i(i80Var2) ? 2048 : 1024)) & 1171) == 1170 && go1Var.F()) {
            go1Var.W();
        } else {
            go1Var.Y();
            if ((i2 & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = ak2.I;
                go1Var.o0(Q);
            }
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-1115894518);
            go1Var.e0(1886828752);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(new mq1(rm1Var, b));
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new zw1((byte) 6), lq1Var);
            qi4.k(go1Var, new zw1((byte) 7), Float.valueOf(f));
            qi4.k(go1Var, new zw1((byte) 8), i80Var);
            qi4.k(go1Var, new zw1((byte) 9), i80Var2);
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new xt1(f, lq1Var, i80Var, i80Var2, i2);
        }
    }

    public static void h0(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void i0(Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setHotspotBounds(i2, i3, i4, i5);
    }

    public static void j0(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void k0(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void l0(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[Catch: k52 -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {k52 -> 0x01a0, blocks: (B:26:0x00bb, B:33:0x00d9, B:40:0x00ff, B:42:0x0113, B:45:0x0128, B:48:0x0130), top: B:25:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0179 -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.wf2 r27, int r28, int r29, defpackage.iu0 r30, defpackage.gj0 r31) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e41.m(wf2, int, int, iu0, gj0):java.lang.Object");
    }

    public static xs1 m0(ew ewVar) {
        return new xs1(ewVar);
    }

    public static final boolean n(boolean z, wf2 wf2Var, int i2) {
        if (z) {
            if (wf2Var.c() > i2) {
                return true;
            }
            return wf2Var.c() == i2 && wf2Var.d() > 0;
        }
        if (wf2Var.c() < i2) {
            return true;
        }
        return wf2Var.c() == i2 && wf2Var.d() < 0;
    }

    public static final boolean n0(k71 k71Var) {
        if (k71Var instanceof o71) {
            return true;
        }
        if (k71Var instanceof v71) {
            ArrayList arrayList = ((v71) k71Var).b;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (n0((k71) obj)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void o(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static final e43 o0(e43 e43Var, tf2 tf2Var) {
        if (e43Var.b > 1) {
            byte b = 0;
            Comparable comparable = (Comparable) tf2Var.invoke(e43Var.g(0));
            int i2 = e43Var.b;
            int i3 = 1;
            while (i3 < i2) {
                Comparable comparable2 = (Comparable) tf2Var.invoke(e43Var.g(i3));
                if (comparable.compareTo(comparable2) > 0) {
                    e43 e43Var2 = new e43(e43Var.b);
                    Object[] objArr = e43Var.a;
                    int i4 = e43Var.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        e43Var2.a(objArr[i5]);
                    }
                    c43 c43Var = e43Var2.c;
                    if (c43Var == null) {
                        c43Var = new c43(e43Var2);
                        e43Var2.c = c43Var;
                    }
                    if (c43Var.I.b > 1) {
                        t70.H0(new yc1(tf2Var, b), c43Var);
                    }
                    return e43Var2;
                }
                i3++;
                comparable = comparable2;
            }
        }
        return e43Var;
    }

    public static final o62 p(Decoder decoder) {
        decoder.getClass();
        o62 o62Var = decoder instanceof o62 ? (o62) decoder : null;
        if (o62Var != null) {
            return o62Var;
        }
        zl1.n(s24.a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void q(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof ax4 ? (ax4) encoder : null) != null) {
            return;
        }
        zl1.n(s24.a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final int s(hs2 hs2Var, v8 v8Var) {
        hs2 n0 = hs2Var.n0();
        if (n0 == null) {
            q02.b("Child of " + hs2Var + " cannot be null when calculating alignment line");
        }
        if (hs2Var.r0().a().containsKey(v8Var)) {
            Integer num = (Integer) hs2Var.r0().a().get(v8Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int R = n0.R(v8Var);
            if (R != Integer.MIN_VALUE) {
                boolean z = hs2Var.V;
                boolean z2 = hs2Var.W;
                n0.V = true;
                hs2Var.W = true;
                hs2Var.x0();
                n0.V = z;
                hs2Var.W = z2;
                return R + ((int) (v8Var instanceof dv1 ? n0.t0() & 4294967295L : n0.t0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final int t(float f, iu0 iu0Var) {
        if (Math.abs(f) < iu0Var.P(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static void u(Drawable drawable) {
        drawable.canApplyTheme();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u0(int r6, java.lang.Object r7, defpackage.v44 r8, defpackage.qk1 r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            qk1 r0 = r8.b
            boolean r0 = defpackage.j42.c(r0, r9)
            if (r0 != 0) goto L29
            qk1 r0 = defpackage.qk1.L
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            qk1 r3 = r8.b
            int r3 = r3.I
            int r0 = r0.I
            int r0 = defpackage.j42.m(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.I
            goto L66
        L62:
            qk1 r9 = r8.b
            int r9 = r9.I
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.ck.f(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e41.u0(int, java.lang.Object, v44, qk1, int):java.lang.Object");
    }

    public static final boolean v(rz1 rz1Var) {
        return !rz1Var.h && rz1Var.d;
    }

    public static final boolean w(rz1 rz1Var) {
        return rz1Var.h && !rz1Var.d;
    }

    public static final void x(WorkDatabase workDatabase, uf0 uf0Var, gx5 gx5Var) {
        int i2;
        workDatabase.getClass();
        uf0Var.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList n0 = p70.n0(gx5Var);
        int i3 = 0;
        while (!n0.isEmpty()) {
            List list = ((gx5) u70.L0(n0)).d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((gy5) it.next()).b.j.b() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        int intValue = ((Number) g4.V(workDatabase.w().a, true, false, new m45((byte) 29))).intValue();
        if (intValue + i3 <= 8) {
            return;
        }
        s83.t(hf1.v("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", intValue, ";\ncurrent enqueue operation count: ", i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final String x0(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final void y(f1 f1Var, ag1 ag1Var) {
        if (f1Var.I != ag1Var) {
            throw f1Var;
        }
    }

    public static long y0(long j2) {
        return g4.k(16, g4.k(8, g4.k(4, g4.k(2, g4.k(1, j2, 2459565876494606882L), 868082074056920076L), 67555025218437360L), 280375465148160L), 4294901760L);
    }

    public static boolean z(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = dr5.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        cr5 a = cr5.a(view);
        WeakReference weakReference2 = a.c;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            a.c = new WeakReference(keyEvent);
            SparseArray sparseArray = a.b;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                a.b = sparseArray;
            }
            if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                zl1.c();
                return false;
            }
        }
        return false;
    }

    public static final long z0(long j2, long j3) {
        int d;
        int f = d65.f(j2);
        int e = d65.e(j2);
        if ((d65.f(j3) < d65.e(j2)) && (d65.f(j2) < d65.e(j3))) {
            if ((d65.f(j3) <= d65.f(j2)) && (d65.e(j2) <= d65.e(j3))) {
                f = d65.f(j3);
                e = f;
            } else {
                if ((d65.f(j2) <= d65.f(j3)) && (d65.e(j3) <= d65.e(j2))) {
                    d = d65.d(j3);
                } else {
                    int f2 = d65.f(j3);
                    if (f >= d65.e(j3) || f2 > f) {
                        e = d65.f(j3);
                    } else {
                        f = d65.f(j3);
                        d = d65.d(j3);
                    }
                }
                e -= d;
            }
        } else if (e > d65.f(j3)) {
            f -= d65.d(j3);
            d = d65.d(j3);
            e -= d;
        }
        return ui4.c(f, e);
    }

    public abstract e41 B(e41 e41Var);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0.length != 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(int r5, byte[] r6) {
        /*
            r4 = this;
            java.math.BigInteger r0 = r4.w0()
            int r4 = r4.H()
            java.math.BigInteger r1 = defpackage.zv.a
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            r2 = 0
            if (r1 != r4) goto L16
            java.lang.System.arraycopy(r0, r2, r6, r5, r4)
            return
        L16:
            r1 = r0[r2]
            if (r1 != 0) goto L1f
            int r1 = r0.length
            r3 = 1
            if (r1 == r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            int r1 = r0.length
            int r1 = r1 - r3
            if (r1 > r4) goto L2d
            int r4 = r4 - r1
            int r4 = r4 + r5
            java.util.Arrays.fill(r6, r5, r4, r2)
            java.lang.System.arraycopy(r0, r3, r6, r4, r1)
            return
        L2d:
            java.lang.String r4 = "standard length exceeded for value"
            defpackage.s83.t(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e41.C(int, byte[]):void");
    }

    public int H() {
        return (J() + 7) / 8;
    }

    public int J() {
        return 113;
    }

    public abstract e41 P();

    public boolean S() {
        return r() == 1;
    }

    public boolean T() {
        return w0().signum() == 0;
    }

    public abstract e41 X(e41 e41Var);

    public e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return X(e41Var).t0(e41Var2.X(e41Var3));
    }

    public e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return X(e41Var).k(e41Var2.X(e41Var3));
    }

    public abstract e41 k(e41 e41Var);

    public abstract e41 l();

    public abstract e41 p0();

    public abstract e41 q0();

    public int r() {
        return w0().bitLength();
    }

    public e41 r0(e41 e41Var, e41 e41Var2) {
        return q0().k(e41Var.X(e41Var2));
    }

    public e41 s0(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this = this.q0();
        }
        return this;
    }

    public abstract e41 t0(e41 e41Var);

    public String toString() {
        switch (this.f) {
            case 1:
                return w0().toString(16);
            default:
                return super.toString();
        }
    }

    public boolean v0() {
        return w0().testBit(0);
    }

    public abstract BigInteger w0();

    public e41 a0() {
        return this;
    }
}
