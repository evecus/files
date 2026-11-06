package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class c21 {
    public static hx1 a;
    public static dd b;
    public static aa c;
    public static r10 d;
    public static hx1 e;

    public static final boolean B(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean C(p71 p71Var) {
        String str = null;
        ni4 ni4Var = (ni4) p71Var.a.foldIn(null, cx1.J);
        ji4 ji4Var = ni4Var != null ? ni4Var.a : null;
        if (ji4Var != null) {
            Object obj = ji4Var.a.get(j16.r0);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final int D(md2 md2Var, pg3 pg3Var) {
        return (int) (pg3Var == pg3.I ? md2Var.r & 4294967295L : md2Var.r >> 32);
    }

    public static WindowInsets E(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, ml1 ml1Var, WindowInsets windowInsets) {
        onApplyWindowInsetsListener.getClass();
        WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(ml1Var, windowInsets);
        onApplyWindowInsets.getClass();
        return onApplyWindowInsets;
    }

    public static final g02 F(String str, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (Q == de0.a) {
            Q = new g02();
            go1Var.o0(Q);
        }
        g02 g02Var = (g02) Q;
        g02Var.a(go1Var, 0);
        return g02Var;
    }

    public static Typeface G(Context context, List list, int i, boolean z, int i2, Handler handler, g73 g73Var) {
        byte b2 = 1;
        ob1 ob1Var = new ob1(handler, (byte) 1);
        byte b3 = 6;
        g12 g12Var = new g12(g73Var, ob1Var, b3);
        byte b4 = 0;
        if (!z) {
            String a2 = dk1.a(i, list);
            Typeface typeface = (Typeface) dk1.a.a(a2);
            if (typeface != null) {
                ob1Var.execute(new wn1(g73Var, typeface, b3));
                return typeface;
            }
            bk1 bk1Var = new bk1(g12Var, b4);
            synchronized (dk1.c) {
                try {
                    oo4 oo4Var = dk1.d;
                    ArrayList arrayList = (ArrayList) oo4Var.get(a2);
                    if (arrayList != null) {
                        arrayList.add(bk1Var);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(bk1Var);
                    oo4Var.put(a2, arrayList2);
                    ak1 ak1Var = new ak1(a2, context, list, i, (byte) 1);
                    ThreadPoolExecutor threadPoolExecutor = dk1.b;
                    bk1 bk1Var2 = new bk1(a2, b2);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    m44 m44Var = new m44();
                    m44Var.I = ak1Var;
                    m44Var.J = bk1Var2;
                    m44Var.K = handler2;
                    threadPoolExecutor.execute(m44Var);
                    return null;
                } finally {
                }
            }
        }
        if (list.size() > 1) {
            s83.t("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        xj1 xj1Var = (xj1) list.get(0);
        ss2 ss2Var = dk1.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{xj1Var}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String a3 = dk1.a(i, DesugarCollections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) dk1.a.a(a3);
        if (typeface2 != null) {
            ob1Var.execute(new wn1(g73Var, typeface2, b3));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{xj1Var}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            ck1 b5 = dk1.b(a3, context, DesugarCollections.unmodifiableList(arrayList4), i);
            g12Var.Q(b5);
            return b5.a;
        }
        try {
            try {
                try {
                    try {
                        ck1 ck1Var = (ck1) dk1.b.submit(new ak1(a3, context, xj1Var, i, (byte) 0)).get(i2, TimeUnit.MILLISECONDS);
                        g12Var.Q(ck1Var);
                        return ck1Var.a;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                }
            } catch (ExecutionException e3) {
                throw new RuntimeException(e3);
            }
        } catch (InterruptedException unused2) {
            ((ob1) g12Var.K).execute(new z00((g73) g12Var.J, -3));
            return null;
        }
    }

    public static void H(MediaMetadataRetriever mediaMetadataRetriever, rb1 rb1Var) {
        mediaMetadataRetriever.setDataSource(rb1Var);
    }

    public static final int I(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static Bitmap J(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                s83.t("bitmap is null");
                return null;
            }
            if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            createScaledBitmap.getClass();
            return createScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        bounds.getClass();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final void K(wt0 wt0Var, tm1 tm1Var) {
        ad4.C(wt0Var, kp1.J, new l00(tm1Var, (byte) 2));
    }

    public static Throwable L(r2 r2Var) {
        if (!(r2Var instanceof m2)) {
            return null;
        }
        Object obj = r2Var.I;
        if (obj instanceof h2) {
            return ((h2) obj).a;
        }
        return null;
    }

    public static final void a(j80 j80Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1991437157);
        if ((((go1Var.g(j80Var) ? 4 : 2) | i) & 19) == 18 && go1Var.F()) {
            go1Var.W();
        } else {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            mw2.b(ff0.e.a(j80Var), tc0Var, go1Var, 48);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 10, i, j80Var, tc0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.rm1 r25, final float r26, final defpackage.l13 r27, float r28, float r29, defpackage.fe0 r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c21.b(rm1, float, l13, float, float, fe0, int, int):void");
    }

    public static final void c(ex1 ex1Var, String str, lq1 lq1Var, int i, b80 b80Var, fe0 fe0Var, int i2, int i3) {
        int i4;
        ex1 ex1Var2;
        String str2;
        lq1 lq1Var2;
        int i5;
        b80 b80Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(491792371);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? go1Var.g(ex1Var) : go1Var.i(ex1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.g(lq1Var) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= go1Var.e(i) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? go1Var.g(b80Var) : go1Var.i(b80Var) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && go1Var.F()) {
            go1Var.W();
            b80Var2 = b80Var;
            i5 = i;
            lq1Var2 = lq1Var;
            str2 = str;
            ex1Var2 = ex1Var;
        } else {
            if (i6 != 0) {
                i = 1;
            }
            int i8 = i;
            if (i7 != 0) {
                b80Var = null;
            }
            b80 b80Var3 = b80Var;
            d(ex1Var, str, lq1Var, i8, b80Var3, go1Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
            ex1Var2 = ex1Var;
            str2 = str;
            lq1Var2 = lq1Var;
            i5 = i8;
            b80Var2 = b80Var3;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new xw1(ex1Var2, str2, lq1Var2, i5, b80Var2, i2, i3);
        }
    }

    public static final void d(final ex1 ex1Var, final String str, final lq1 lq1Var, final int i, final b80 b80Var, fe0 fe0Var, final int i2) {
        int i3;
        lq1 lq1Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2075067909);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var.g(ex1Var) : go1Var.i(ex1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(lq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? go1Var.g(b80Var) : go1Var.i(b80Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go1Var.g(null) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && go1Var.F()) {
            go1Var.W();
        } else {
            jp jpVar = de0.a;
            byte b2 = 0;
            if (str != null) {
                go1Var.e0(884096034);
                go1Var.e0(5004770);
                boolean z = (i3 & 112) == 32;
                Object Q = go1Var.Q();
                if (z || Q == jpVar) {
                    Q = new pu0(str, (byte) 3);
                    go1Var.o0(Q);
                }
                go1Var.q(false);
                ji4 ji4Var = new ji4();
                ((tm1) Q).invoke(ji4Var);
                lq1Var2 = lq1Var.a(new ni4(ji4Var));
                go1Var.q(false);
            } else {
                go1Var.e0(884190429);
                go1Var.q(false);
                lq1Var2 = lq1Var;
            }
            go1Var.e0(1849434622);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = bx1.I;
                go1Var.o0(Q2);
            }
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q2);
            go1Var.e0(-1115894518);
            go1Var.e0(1886828752);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(new mq1(rm1Var, b2));
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new bd0((byte) 26), ex1Var);
            qi4.k(go1Var, new bd0((byte) 27), lq1Var2);
            qi4.k(go1Var, new bd0((byte) 28), new mi0(i));
            qi4.k(go1Var, new bd0((byte) 29), b80Var);
            qi4.k(go1Var, new zw1(b2), null);
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ax1
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c21.d(ex1.this, str, lq1Var, i, b80Var, (fe0) obj, mu0.X(i2 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void e(final kv4 kv4Var, final l13 l13Var, final zg2 zg2Var, final li3 li3Var, final float f, final ip ipVar, gf1 gf1Var, boolean z, sc scVar, final tm1 tm1Var, fe0 fe0Var, final int i) {
        int i2;
        l13 l13Var2;
        final gf1 gf1Var2;
        final boolean z2;
        final sc scVar2;
        gf1 gf1Var3;
        sc b2;
        int i3;
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-578931208);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(kv4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l13Var2 = l13Var;
            i2 |= go1Var.g(l13Var2) ? 32 : 16;
        } else {
            l13Var2 = l13Var;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(zg2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(li3Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= go1Var.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= go1Var.g(ipVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = 100663296 | i4;
        if ((805306368 & i) == 0) {
            i5 = 369098752 | i4;
        }
        int i6 = go1Var.i(tm1Var) ? 4 : 2;
        boolean z4 = true;
        if (go1Var.T(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            go1Var.Y();
            int i7 = i & 1;
            Object obj = de0.a;
            if (i7 == 0 || go1Var.C()) {
                up0 a2 = fu4.a(go1Var);
                boolean g = go1Var.g(a2);
                Object Q = go1Var.Q();
                if (g || Q == obj) {
                    Q = new mr0(a2);
                    go1Var.o0(Q);
                }
                gf1Var3 = (mr0) Q;
                b2 = lh3.b(go1Var);
                i3 = i5 & (-1908408321);
                z3 = true;
            } else {
                go1Var.W();
                int i8 = i5 & (-1908408321);
                z3 = z;
                b2 = scVar;
                i3 = i8;
                gf1Var3 = gf1Var;
            }
            go1Var.r();
            float b3 = ipVar.b();
            int i9 = i3 >> 3;
            int i10 = (i3 & 14) | ((i3 >> 15) & 112) | (i9 & 896);
            gf1 gf1Var4 = gf1Var3;
            boolean z5 = ((((i10 & 14) ^ 6) > 4 && go1Var.g(kv4Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && go1Var.g(ipVar)) || (i10 & 48) == 32);
            if ((((i10 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 || !go1Var.g(li3Var)) && (i10 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object Q2 = go1Var.Q();
            byte b4 = 3;
            if (z6 || Q2 == obj) {
                Q2 = new xg2(new tf(li3Var, kv4Var, ipVar, b4));
                go1Var.o0(Q2);
            }
            int i11 = i3 << 3;
            boolean z7 = z3;
            e21.f(zg2Var, (xg2) Q2, l13Var2, li3Var, gf1Var4, z7, b2, f, b3, tm1Var, go1Var, ((i3 >> 6) & 14) | 48 | ((i3 << 6) & 7168) | (i11 & 57344) | (i11 & 458752) | (i9 & 29360128) | ((i3 << 12) & C.ENCODING_PCM_DOUBLE), (i6 << 3) & 112);
            scVar2 = b2;
            z2 = z7;
            gf1Var2 = gf1Var4;
        } else {
            go1Var.W();
            gf1Var2 = gf1Var;
            z2 = z;
            scVar2 = scVar;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ig2
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c21.e(kv4.this, l13Var, zg2Var, li3Var, f, ipVar, gf1Var2, z2, scVar2, tm1Var, (fe0) obj2, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void g(b21 b21Var, uu2 uu2Var) {
        b21Var.k0();
        b21Var.m0(uu2Var);
    }

    public static final void h(la5 la5Var, tm1 tm1Var) {
        if (tm1Var.invoke(la5Var) != ka5.I) {
            return;
        }
        ad4.F(la5Var, tm1Var);
    }

    public static final e02 i(g02 g02Var, float f, float f2, d02 d02Var, String str, fe0 fe0Var) {
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = new e02(g02Var, valueOf, valueOf2, d02Var);
            go1Var.o0(Q);
        }
        e02 e02Var = (e02) Q;
        boolean i = go1Var.i(d02Var);
        Object Q2 = go1Var.Q();
        if (i || Q2 == jpVar) {
            hc hcVar = new hc(valueOf, e02Var, valueOf2, d02Var, (byte) 1);
            go1Var.o0(hcVar);
            Q2 = hcVar;
        }
        mw2.L(go1Var, (rm1) Q2);
        boolean i2 = go1Var.i(g02Var);
        Object Q3 = go1Var.Q();
        if (i2 || Q3 == jpVar) {
            Q3 = new be(g02Var, e02Var, (byte) 17);
            go1Var.o0(Q3);
        }
        mw2.e(e02Var, (tm1) Q3, go1Var);
        return e02Var;
    }

    public static final void j(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String replace = cls.getName().replace('.', '/');
        replace.getClass();
        sb.append((CharSequence) replace);
        sb.append(";");
    }

    public static final List k(j81 j81Var, int i, int i2, ArrayList arrayList, m22 m22Var, int i3, int i4, int i5, boolean z, tm1 tm1Var) {
        int i6;
        p33 p33Var;
        int i7;
        long j;
        int i8;
        Object obj;
        int i9;
        if (j81Var == null || arrayList.isEmpty() || (i6 = m22Var.b) == 0) {
            return o91.I;
        }
        int i10 = -1;
        int i11 = 0;
        if (i2 - i < 0 || i6 == 0) {
            p33Var = n22.a;
        } else {
            u22 c0 = ut0.c0(0, i6);
            int i12 = c0.I;
            int i13 = c0.J;
            int i14 = -1;
            if (i12 <= i13) {
                while (m22Var.a(i12) <= i) {
                    i14 = m22Var.a(i12);
                    if (i12 == i13) {
                        break;
                    }
                    i12++;
                }
            }
            if (i14 == -1) {
                p33Var = n22.a;
            } else {
                p33 p33Var2 = n22.a;
                p33Var = new p33(1);
                p33Var.c(i14);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = arrayList.get(i15);
            int index = ((qe2) obj2).getIndex();
            int[] iArr = m22Var.a;
            int i16 = m22Var.b;
            int i17 = i11;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                if (iArr[i17] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i17++;
            }
            i15++;
            i11 = 0;
        }
        int[] iArr2 = p33Var.a;
        int i18 = p33Var.b;
        int i19 = 0;
        while (i19 < i18) {
            int i20 = iArr2[i19];
            int size2 = arrayList.size();
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i22 >= size2) {
                    i21 = i10;
                    break;
                }
                Object obj3 = arrayList.get(i22);
                i22++;
                if (((qe2) obj3).getIndex() == i20) {
                    break;
                }
                i21++;
            }
            qe2 qe2Var = i21 == i10 ? (qe2) tm1Var.invoke(Integer.valueOf(i20)) : (qe2) arrayList.remove(i21);
            int r = wx5.r(qe2Var, z);
            if (i21 == i10) {
                i7 = i19;
                i8 = Integer.MIN_VALUE;
            } else {
                long g = qe2Var.g(0);
                if (z) {
                    i7 = i19;
                    j = g & 4294967295L;
                } else {
                    i7 = i19;
                    j = g >> 32;
                }
                i8 = (int) j;
            }
            int size3 = arrayList3.size();
            int i23 = 0;
            while (true) {
                if (i23 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i23);
                if (((qe2) obj).getIndex() != i20) {
                    break;
                }
                i23++;
            }
            qe2 qe2Var2 = (qe2) obj;
            if (qe2Var2 != null) {
                long g2 = qe2Var2.g(0);
                i9 = (int) (z ? g2 & 4294967295L : g2 >> 32);
            } else {
                i9 = Integer.MIN_VALUE;
            }
            int max = i8 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i8);
            if (i9 != Integer.MIN_VALUE) {
                max = Math.min(max, i9 - r);
            }
            qe2Var.j();
            qe2Var.f(max, i4, i5);
            arrayList2.add(qe2Var);
            i19 = i7 + 1;
            i10 = -1;
        }
        return arrayList2;
    }

    public static final t43 m(zf1 zf1Var, Object obj, li2 li2Var, ki2 ki2Var, tk0 tk0Var, fe0 fe0Var, int i) {
        Object[] objArr = {zf1Var, li2Var, ki2Var, tk0Var};
        go1 go1Var = (go1) fe0Var;
        boolean i2 = go1Var.i(li2Var) | ((((i & 7168) ^ 3072) > 2048 && go1Var.e(ki2Var.ordinal())) || (i & 3072) == 2048) | go1Var.i(tk0Var) | go1Var.i(zf1Var);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (i2 || Q == jpVar) {
            ld ldVar = new ld(li2Var, ki2Var, tk0Var, zf1Var, null, (byte) 5);
            go1Var.o0(ldVar);
            Q = ldVar;
        }
        hn1 hn1Var = (hn1) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = ad4.w(obj);
            go1Var.o0(Q2);
        }
        t43 t43Var = (t43) Q2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean i3 = go1Var.i(hn1Var);
        Object Q3 = go1Var.Q();
        if (i3 || Q3 == jpVar) {
            Q3 = new o1((Object) hn1Var, (Object) t43Var, (fj0) null, (byte) 19);
            go1Var.o0(Q3);
        }
        mw2.k(copyOf, (hn1) Q3, go1Var);
        return t43Var;
    }

    public static final boolean n(b21 b21Var, long j) {
        if (!b21Var.getNode().isAttached()) {
            return false;
        }
        x02 x02Var = ut0.U(b21Var).n0.c;
        if (!x02Var.h()) {
            return false;
        }
        long M = x02Var.M(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (M >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (M & 4294967295L));
        long j2 = b21Var.K;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static InputConnection p(ql qlVar, InputConnection inputConnection, EditorInfo editorInfo) {
        w7 w7Var = new w7(qlVar, (byte) 12);
        return Build.VERSION.SDK_INT >= 25 ? new b12(inputConnection, w7Var) : f71.a(editorInfo).length == 0 ? inputConnection : new c12(inputConnection, w7Var);
    }

    public static final void q(i62 i62Var, yw0 yw0Var, KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        new ax4(new ee0(yw0Var), i62Var, pz5.K, new ax4[pz5.P.c()]).o(kSerializer, obj);
    }

    public static final boolean r(int i, int i2) {
        return i == i2;
    }

    public static final Method s(u72 u72Var, String str) {
        str.getClass();
        if (!(u72Var instanceof i60)) {
            return null;
        }
        String c0 = jx4.c0(str, '(');
        if (c0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + u72Var + '/' + str);
        }
        Method[] declaredMethods = ((i60) u72Var).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (j42.c(method.getName(), c0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    j(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                j(sb, returnType);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final kp1 t(jp1 jp1Var) {
        return new kp1(jp1Var);
    }

    public static b06 u(q0 q0Var) {
        c06 c06Var = (c06) yz5.b.get(q0Var);
        b06 d2 = c06Var == null ? null : c06Var.d();
        if (d2 == null) {
            c06 c06Var2 = (c06) d84.b.get(q0Var);
            d2 = c06Var2 == null ? null : c06Var2.d();
        }
        if (d2 == null) {
            c06 c06Var3 = (c06) f25.b.get(q0Var);
            d2 = c06Var3 == null ? null : c06Var3.d();
        }
        if (d2 == null) {
            c06 c06Var4 = (c06) w.a.get(q0Var);
            d2 = c06Var4 == null ? null : c06Var4.d();
        }
        if (d2 == null) {
            c06 c06Var5 = (c06) b61.b.get(q0Var);
            d2 = c06Var5 == null ? null : c06Var5.d();
        }
        if (d2 != null) {
            return d2;
        }
        c06 c06Var6 = (c06) yn1.b.get(q0Var);
        if (c06Var6 == null) {
            return null;
        }
        return c06Var6.d();
    }

    public static final ds0 v(int i) {
        return new ds0(i);
    }

    public static Set w() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final hx1 x() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.FastForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(4.0f, 18.0f);
        epVar.y(8.5f, -6.0f);
        epVar.x(4.0f, 6.0f);
        epVar.M(12.0f);
        epVar.p();
        epVar.z(13.0f, 6.0f);
        epVar.M(12.0f);
        epVar.y(8.5f, -6.0f);
        epVar.x(13.0f, 6.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final Object y(a42 a42Var) {
        Object z = a42Var.z();
        ha2 ha2Var = z instanceof ha2 ? (ha2) z : null;
        if (ha2Var != null) {
            return ha2Var.I;
        }
        return null;
    }

    public static final int z(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public void A(o84 o84Var, Object obj) {
        o84Var.getClass();
        if (obj == null) {
            return;
        }
        q84 Y = o84Var.Y(o());
        try {
            l(Y, obj);
            Y.T();
            mw2.v(Y, null);
        } finally {
        }
    }

    public abstract void l(q84 q84Var, Object obj);

    public abstract String o();
}
