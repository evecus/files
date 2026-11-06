package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.R;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Avatar;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class i42 implements Decoder, le0 {
    public static final fj0[] a = new fj0[0];
    public static final jp b = new jp(1);
    public static final q8 c = new q8(29);
    public static final jp d = new jp(2);
    public static final q8 e = new q8(28);
    public static final jp f = new jp(0);
    public static final tc0 g = new tc0(-152961771, new sg(10), false);
    public static final lu0 h = new lu0(1.0f, 1.0f);
    public static final qe i = new qe(4);
    public static final ep j = new ep((Object) "NO_OWNER", (byte) 25);
    public static final ge k = new ge(1000);
    public static final ge l;
    public static final ge m;
    public static final long[] n;
    public static final o63 o;
    public static final Object p;
    public static final o63 q;
    public static hx1 r;

    static {
        new ge(AnalyticsListener.EVENT_AUDIO_ENABLED);
        l = new ge(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        m = new ge(1002);
        n = new long[0];
        o = new o63((byte) 16);
        p = new Object();
        q = new o63((byte) 22);
    }

    public static final l13 A0(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new mh1(tm1Var));
    }

    public static final l13 B0(l13 l13Var, ji3 ji3Var) {
        return l13Var.then(new ki3(ji3Var, new tf2(ji3Var, (byte) 15)));
    }

    public static final l13 C0(l13 l13Var, final float f2) {
        return l13Var.then(new di3(f2, f2, f2, f2, new tm1() { // from class: gi3
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                z12 z12Var = (z12) obj;
                z12Var.d("padding");
                z12Var.e(new r11(f2));
                return wd5.a;
            }
        }));
    }

    public static final l13 D0(l13 l13Var, final float f2, final float f3) {
        return l13Var.then(new di3(f2, f3, f2, f3, new tm1() { // from class: fi3
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                z12 z12Var = (z12) obj;
                z12Var.d("padding");
                z12Var.b().b(new r11(f2), "horizontal");
                z12Var.b().b(new r11(f3), "vertical");
                return wd5.a;
            }
        }));
    }

    public static l13 E0(l13 l13Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return D0(l13Var, f2, f3);
    }

    public static final void F(String str, rm1 rm1Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1241388930);
        int i3 = (go1Var.g(str) ? 32 : 16) | i2;
        byte b2 = 0;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            fj0 fj0Var = null;
            if (z || Q == jpVar) {
                Q = new ky(str, rm1Var, fj0Var, (byte) 5);
                go1Var.o0(Q);
            }
            mw2.h(go1Var, (hn1) Q, str);
            boolean z2 = str != null;
            ta1 e2 = ma1.e(qb.k0(160, 6, null), 2);
            qb5 k0 = qb.k0(200, 6, null);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new yy0((byte) 17);
                go1Var.o0(Q2);
            }
            p70.e(z2, G0(ux.a.align(i13.a, q8.Q), 0.0f, 0.0f, 0.0f, 48.0f, 7), e2.a(ma1.i(k0, (tm1) Q2)), ma1.f(qb.k0(140, 6, null), 2), null, p70.u0(1272408918, new ut1(str, b2), go1Var), go1Var, 200064, 16);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uh0((byte) 4, i2, str, rm1Var);
        }
    }

    public static final l13 F0(l13 l13Var, final float f2, final float f3, final float f4, final float f5) {
        return l13Var.then(new di3(f2, f3, f4, f5, new tm1() { // from class: ei3
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                z12 z12Var = (z12) obj;
                z12Var.d("padding");
                z12Var.b().b(new r11(f2), TtmlNode.START);
                z12Var.b().b(new r11(f3), "top");
                z12Var.b().b(new r11(f4), TtmlNode.END);
                z12Var.b().b(new r11(f5), "bottom");
                return wd5.a;
            }
        }));
    }

    public static dw G(tw1 tw1Var, int i2) {
        Bitmap bitmap = ((dd) tw1Var).a;
        dw dwVar = new dw(tw1Var, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        dwVar.K = i2;
        return dwVar;
    }

    public static l13 G0(l13 l13Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return F0(l13Var, f2, f3, f4, f5);
    }

    public static final dj0 H(tk0 tk0Var) {
        if (tk0Var.get(q8.r0) == null) {
            tk0Var = tk0Var.plus(vt0.b());
        }
        return new dj0(tk0Var);
    }

    public static void H0(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static final void I(final List list, final rm1 rm1Var, final boolean z, final l13 l13Var, final boolean z2, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final long j2, final long j3, final boolean z3, fe0 fe0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        x04 x04Var;
        hn1 hn1Var;
        to0 to0Var;
        final s33 s33Var;
        jp jpVar;
        list.getClass();
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1580128529);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var.i(rm1Var) ? 32 : 16;
        }
        int i7 = i4;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 = i7 | (go1Var.h(z) ? 256 : 128);
        } else {
            i5 = i7;
        }
        if ((i2 & 3072) == 0) {
            i5 |= go1Var.g(l13Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= go1Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= go1Var.d(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= go1Var.d(f3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= go1Var.d(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= go1Var.d(f5) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= go1Var.d(f6) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (go1Var.d(f7) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= go1Var.f(j2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= go1Var.f(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= go1Var.h(z3) ? 2048 : 1024;
        }
        if (go1Var.T(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            go1Var.Y();
            if ((i2 & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            if (!z2 || list.isEmpty()) {
                x04 u = go1Var.u();
                if (u != null) {
                    final byte b2 = 0;
                    hn1Var = new hn1() { // from class: xo0
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b2;
                            wd5 wd5Var = wd5.a;
                            int i8 = i3;
                            int i9 = i2;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X = mu0.X(i9 | 1);
                                    int X2 = mu0.X(i8);
                                    i42.I(list, rm1Var, z, l13Var, z2, f2, f3, f4, f5, f6, f7, j2, j3, z3, (fe0) obj, X, X2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X3 = mu0.X(i9 | 1);
                                    int X4 = mu0.X(i8);
                                    i42.I(list, rm1Var, z, l13Var, z2, f2, f3, f4, f5, f6, f7, j2, j3, z3, (fe0) obj, X3, X4);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    x04Var = u;
                    x04Var.d = hn1Var;
                }
                return;
            }
            iu0 iu0Var = (iu0) go1Var.k(hf0.h);
            Context context = (Context) go1Var.k(rb.b);
            t43 g2 = wi4.g(t81.c, go1Var);
            final t43 g3 = wi4.g(t81.g, go1Var);
            Map map = z3 ? (Map) g2.getValue() : p91.I;
            final float f0 = iu0Var.f0(oh4.j(16)) * f4;
            float q2 = ut0.q(f6, 0.5f, 2.0f) * iu0Var.P(30.0f) * f4;
            float P = iu0Var.P(8.0f);
            float q3 = ut0.q(f7, 0.5f, 2.0f) * 4.0f * P;
            float f8 = 8000.0f / f5;
            go1Var.d0(-1914861163);
            float P2 = iu0Var.P(((Configuration) go1Var.k(rb.a)).screenWidthDp);
            go1Var.q(false);
            boolean d2 = ((3670016 & i5) == 1048576) | go1Var.d(q2) | go1Var.d(P) | go1Var.d(q3) | go1Var.d(f8) | go1Var.d(P2);
            Object Q = go1Var.Q();
            jp jpVar2 = de0.a;
            if (d2 || Q == jpVar2) {
                Q = new to0(f3, q2, P, q3, f8, P2);
                go1Var.o0(Q);
            }
            to0 to0Var2 = (to0) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar2) {
                Q2 = new RectF();
                go1Var.o0(Q2);
            }
            final RectF rectF = (RectF) Q2;
            int i8 = i5 & 112;
            boolean z4 = i8 == 32;
            Object Q3 = go1Var.Q();
            if (z4 || Q3 == jpVar2) {
                long longValue = ((Number) rm1Var.invoke()).longValue();
                to0Var = to0Var2;
                Q3 = new hk3(longValue < 0 ? 0L : longValue);
                go1Var.o0(Q3);
            } else {
                to0Var = to0Var2;
            }
            final hk3 hk3Var = (hk3) Q3;
            Boolean valueOf = Boolean.valueOf(z);
            boolean g4 = (i8 == 32) | go1Var.g(hk3Var) | ((i5 & 896) == 256);
            Object Q4 = go1Var.Q();
            if (g4 || Q4 == jpVar2) {
                Q4 = new bp0(rm1Var, z, hk3Var, null);
                go1Var.o0(Q4);
            }
            mw2.i(valueOf, rm1Var, (hn1) Q4, go1Var);
            int i0 = qb.i0(j3);
            int i02 = qb.i0(j2);
            int i9 = i5 & 458752;
            boolean d3 = go1Var.d(f0) | (i9 == 131072) | go1Var.e(i0);
            Object Q5 = go1Var.Q();
            if (d3 || Q5 == jpVar2) {
                int r2 = ut0.r((int) (255.0f * f2), 0, 255);
                int red = Color.red(i0);
                int green = Color.green(i0);
                int blue = Color.blue(i0);
                Paint paint = new Paint();
                paint.setColor(Color.argb(r2, red, green, blue));
                paint.setTextSize(f0);
                paint.setTypeface(Typeface.DEFAULT_BOLD);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(0.12f * f0);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setAntiAlias(true);
                go1Var.o0(paint);
                Q5 = paint;
            }
            final Paint paint2 = (Paint) Q5;
            boolean d4 = go1Var.d(f0) | (i9 == 131072) | go1Var.e(i02);
            Object Q6 = go1Var.Q();
            if (d4 || Q6 == jpVar2) {
                int r3 = ut0.r((int) (255.0f * f2), 0, 255);
                int red2 = Color.red(i02);
                int green2 = Color.green(i02);
                int blue2 = Color.blue(i02);
                Paint paint3 = new Paint();
                paint3.setColor(Color.argb(r3, red2, green2, blue2));
                paint3.setTextSize(f0);
                paint3.setTypeface(Typeface.DEFAULT_BOLD);
                paint3.setAntiAlias(true);
                go1Var.o0(paint3);
                Q6 = paint3;
            }
            final Paint paint4 = (Paint) Q6;
            boolean d5 = go1Var.d(f0);
            Object Q7 = go1Var.Q();
            Object obj = Q7;
            if (d5 || Q7 == jpVar2) {
                Paint paint5 = new Paint();
                paint5.setTextSize(f0);
                paint5.setTypeface(Typeface.DEFAULT_BOLD);
                paint5.setAntiAlias(true);
                go1Var.o0(paint5);
                obj = paint5;
            }
            Paint paint6 = (Paint) obj;
            boolean g5 = go1Var.g(paint6);
            Object Q8 = go1Var.Q();
            Object obj2 = Q8;
            if (g5 || Q8 == jpVar2) {
                Rect rect = new Rect();
                paint6.getTextBounds("国", 0, 1, rect);
                go1Var.o0(rect);
                obj2 = rect;
            }
            Rect rect2 = (Rect) obj2;
            final float f9 = rect2.top;
            final float height = rect2.height();
            boolean g6 = go1Var.g(paint6) | go1Var.d(height) | go1Var.g(map);
            Object Q9 = go1Var.Q();
            if (g6 || Q9 == jpVar2) {
                Q9 = new wo0(new yo0(map, paint6, height));
                go1Var.o0(Q9);
            }
            final wo0 wo0Var = (wo0) Q9;
            final List list2 = list instanceof gt4 ? j42.D((gt4) list).c : list;
            Object Q10 = go1Var.Q();
            if (Q10 == jpVar2) {
                Q10 = new gk3(0);
                go1Var.o0(Q10);
            }
            final s33 s33Var2 = (s33) Q10;
            Object Q11 = go1Var.Q();
            if (Q11 == jpVar2) {
                Q11 = ad4.w(t91.I);
                go1Var.o0(Q11);
            }
            final t43 t43Var = (t43) Q11;
            boolean i10 = go1Var.i(wo0Var) | go1Var.i(list2);
            Object Q12 = go1Var.Q();
            if (i10 || Q12 == jpVar2) {
                Q12 = new rm1() { // from class: zo0
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        wo0 wo0Var2 = wo0.this;
                        if (wo0Var2.c(list2)) {
                            gk3 gk3Var = (gk3) s33Var2;
                            gk3Var.i(gk3Var.h() + 1);
                            rk4 rk4Var = new rk4();
                            Iterator it = wo0Var2.a().iterator();
                            while (it.hasNext()) {
                                for (q81 q81Var : ((g12) ((xw2) it.next()).a()).x()) {
                                    if (q81Var instanceof o81) {
                                        rk4Var.add(((o81) q81Var).b);
                                    }
                                }
                            }
                            t43Var.setValue(rk4Var.d());
                        }
                        return wd5.a;
                    }
                };
                go1Var.o0(Q12);
            }
            mw2.m(wo0Var, list2, (rm1) Q12, go1Var);
            Set set = (Set) t43Var.getValue();
            boolean i11 = go1Var.i(context);
            Object Q13 = go1Var.Q();
            if (i11 || Q13 == jpVar2) {
                s33Var = s33Var2;
                jpVar = jpVar2;
                Q13 = new ky(context, t43Var, null, (byte) 3);
                go1Var.o0(Q13);
            } else {
                jpVar = jpVar2;
                s33Var = s33Var2;
            }
            mw2.i(set, context, (hn1) Q13, go1Var);
            l13 n2 = o7.n(l13Var.then(nq4.c));
            final to0 to0Var3 = to0Var;
            boolean g7 = go1Var.g(g3) | go1Var.g(hk3Var) | go1Var.i(wo0Var) | go1Var.i(to0Var3) | go1Var.d(f0) | go1Var.i(paint2) | go1Var.i(paint4) | go1Var.d(f9) | go1Var.i(rectF) | go1Var.d(height);
            Object Q14 = go1Var.Q();
            if (g7 || Q14 == jpVar) {
                Q14 = new tm1() { // from class: ap0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj3) {
                        float f10;
                        y31 y31Var = (y31) obj3;
                        y31Var.getClass();
                        ((gk3) s33Var).h();
                        g3.getValue();
                        long h2 = hk3Var.h();
                        char c2 = ' ';
                        List<uo0> b3 = wo0Var.b(Float.intBitsToFloat((int) (y31Var.c() >> 32)), Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)), to0Var3, h2);
                        Canvas b4 = ba.b(y31Var.S().q());
                        for (uo0 uo0Var : b3) {
                            long offsetTime = uo0Var.b().getOffsetTime();
                            long j4 = h2 - offsetTime;
                            if (-500 > j4 || j4 > (uo0Var.a() - offsetTime) + 500) {
                                c2 = ' ';
                            } else {
                                float b5 = (uo0Var.d().b() + Float.intBitsToFloat((int) (y31Var.c() >> c2))) - (uo0Var.c() * Math.max(0L, j4));
                                if (uo0Var.d().b() + b5 > 0.0f) {
                                    float e2 = uo0Var.e() + f0;
                                    g12 g12Var = (g12) uo0Var.d().a();
                                    int size = g12Var.x().size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        q81 q81Var = (q81) g12Var.x().get(i12);
                                        boolean z5 = q81Var instanceof p81;
                                        Paint paint7 = paint2;
                                        Paint paint8 = paint4;
                                        if (z5) {
                                            String str = ((p81) q81Var).a;
                                            if (str.length() > 0) {
                                                b4.drawText(str, b5, e2, paint7);
                                                b4.drawText(str, b5, e2, paint8);
                                            }
                                            b5 += g12Var.u().b()[i12];
                                        } else {
                                            if (!(q81Var instanceof o81)) {
                                                s83.v();
                                                return null;
                                            }
                                            Pattern pattern = t81.a;
                                            o81 o81Var = (o81) q81Var;
                                            String str2 = o81Var.a;
                                            Bitmap bitmap = (Bitmap) t81.d.get(o81Var.b);
                                            if (bitmap != null) {
                                                float f11 = f9 + e2;
                                                float f12 = height;
                                                RectF rectF2 = rectF;
                                                rectF2.set(b5, f11, b5 + f12, f12 + f11);
                                                b4.drawBitmap(bitmap, (Rect) null, rectF2, (Paint) null);
                                                f10 = g12Var.u().b()[i12];
                                            } else {
                                                b4.drawText(str2, b5, e2, paint7);
                                                b4.drawText(str2, b5, e2, paint8);
                                                f10 = g12Var.u().c()[i12];
                                            }
                                            b5 += f10;
                                        }
                                        i12++;
                                        c2 = ' ';
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return wd5.a;
                    }
                };
                go1Var.o0(Q14);
            }
            p70.j(0, go1Var, (tm1) Q14, n2);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            final byte b3 = 1;
            hn1Var = new hn1() { // from class: xo0
                @Override // defpackage.hn1
                public final Object invoke(Object obj3, Object obj22) {
                    byte b32 = b3;
                    wd5 wd5Var = wd5.a;
                    int i82 = i3;
                    int i92 = i2;
                    switch (b32) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int X = mu0.X(i92 | 1);
                            int X2 = mu0.X(i82);
                            i42.I(list, rm1Var, z, l13Var, z2, f2, f3, f4, f5, f6, f7, j2, j3, z3, (fe0) obj3, X, X2);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int X3 = mu0.X(i92 | 1);
                            int X4 = mu0.X(i82);
                            i42.I(list, rm1Var, z, l13Var, z2, f2, f3, f4, f5, f6, f7, j2, j3, z3, (fe0) obj3, X3, X4);
                            break;
                    }
                    return wd5Var;
                }
            };
            x04Var = u2;
            x04Var.d = hn1Var;
        }
    }

    public static void I0(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010b, code lost:
    
        if (r4 < 480) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x08f1, code lost:
    
        if (((java.util.List) r28.getValue()).size() <= 1) goto L340;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0902 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x094c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(final defpackage.hu2 r96, defpackage.l13 r97, defpackage.tm1 r98, defpackage.fe0 r99, int r100) {
        /*
            Method dump skipped, instructions count: 3062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.J(hu2, l13, tm1, fe0, int):void");
    }

    public static final l13 J0(l13 l13Var, gc4 gc4Var, pg3 pg3Var, sc scVar, boolean z, gf1 gf1Var, t33 t33Var, oy oyVar) {
        pg3 pg3Var2 = pg3.I;
        i13 i13Var = i13.a;
        return l13Var.then(pg3Var == pg3Var2 ? o7.m(i13Var, aj5.b) : o7.m(i13Var, jv1.a)).then(new tb4(scVar, oyVar, gf1Var, t33Var, pg3Var, gc4Var, z, false));
    }

    public static void K(ab4 ab4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2, hk3 hk3Var, t43 t43Var3, boolean z, int i2) {
        r83 r83Var = hu2Var.i;
        if ((i2 & 64) != 0) {
            z = true;
        }
        boolean z2 = (i2 & 128) == 0 && ((Boolean) t43Var.getValue()).booleanValue();
        Boolean bool = Boolean.FALSE;
        t43Var2.setValue(bool);
        t43Var.setValue(bool);
        if (z2) {
            hk3Var.i(System.currentTimeMillis());
            t43Var3.setValue("再按一次返回键退出");
        }
        if (z) {
            if (ab4Var == ab4.J || ab4Var == ab4.K || ab4Var == ab4.L || ab4Var == ab4.I || ab4Var == ab4.M) {
                r83Var.p();
            } else {
                fw4 fw4Var = r83Var.g;
                fw4Var.i(null, Integer.valueOf(((Number) fw4Var.getValue()).intValue() + 1));
            }
        }
    }

    public static kp K0(float f2) {
        return new kp(f2, true, new y9());
    }

    public static final void L(Context context) {
        ExoPlayer exoPlayer = wi4.c;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                ((Activity) context).finishAndRemoveTask();
                new Handler(Looper.getMainLooper()).postDelayed(new h((ContextWrapper) context, (byte) 14), 1000L);
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public static final void M(hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, hk3 hk3Var, ab4 ab4Var, Context context, boolean z, boolean z2) {
        boolean booleanValue = ((Boolean) ((fw4) hu2Var.h.o0.I).getValue()).booleanValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            if (booleanValue || ab4Var == ab4.I || !N(z2, ab4Var) || currentTimeMillis - hk3Var.h() >= 2000) {
                Q(z, hu2Var, ab4Var, t43Var2, z2, t43Var3, true);
                return;
            } else {
                L(context);
                return;
            }
        }
        if (!N(z2, ab4Var)) {
            P(ab4Var, hu2Var, t43Var, ab4.J);
            return;
        }
        if (!booleanValue && currentTimeMillis - hk3Var.h() < 2000) {
            L(context);
            return;
        }
        hk3Var.i(currentTimeMillis);
        if (booleanValue) {
            return;
        }
        t43Var.setValue("再按一次返回键退出");
    }

    public static final boolean N(boolean z, ab4 ab4Var) {
        if (ab4Var == ab4.J || ab4Var == ab4.K || ab4Var == ab4.L) {
            return true;
        }
        return ab4Var == ab4.I && z;
    }

    public static final void O(ab4 ab4Var, hu2 hu2Var, t43 t43Var, t43 t43Var2, ku2 ku2Var) {
        ab4 ab4Var2;
        int ordinal = ku2Var.ordinal();
        ab4 ab4Var3 = ab4.P;
        if (ordinal == 0) {
            ab4Var2 = ou2.a.contains(ab4Var) ? ab4Var : (ab4) t43Var.getValue();
        } else if (ordinal == 1) {
            ab4Var2 = ab4.I;
        } else if (ordinal == 2) {
            ab4Var2 = ab4.M;
        } else if (ordinal == 3) {
            ab4Var2 = ab4.N;
        } else {
            if (ordinal != 4) {
                s83.v();
                return;
            }
            ab4Var2 = ab4Var3;
        }
        if (ou2.f(ab4Var) != ku2Var || ku2Var == ku2.L || ku2Var == ku2.M) {
            if (ab4Var2 == ab4Var3) {
                hu2Var.y();
            }
            P(ab4Var, hu2Var, t43Var2, ab4Var2);
        }
    }

    public static final void P(ab4 ab4Var, hu2 hu2Var, t43 t43Var, ab4 ab4Var2) {
        ab4 ab4Var3 = ab4.J;
        if (ab4Var2 == ab4Var3 && ab4Var == ab4Var3) {
            t43Var.setValue("正在刷新首页内容");
            hu2Var.j.r();
            return;
        }
        ab4 ab4Var4 = ab4.L;
        if (ab4Var2 == ab4Var4 && ab4Var == ab4Var4) {
            t43Var.setValue("正在刷新移动推荐");
            hu2Var.k.r();
            return;
        }
        ab4 ab4Var5 = ab4.K;
        if (ab4Var2 != ab4Var5 || ab4Var != ab4Var5) {
            ab4 ab4Var6 = ab4.I;
            if (ab4Var2 != ab4Var6 || ab4Var != ab4Var6) {
                hu2Var.v(ab4Var2);
                return;
            } else {
                t43Var.setValue("正在刷新精选内容");
                hu2Var.m.r(true);
                return;
            }
        }
        t43Var.setValue("正在刷新关注内容");
        ij1 ij1Var = hu2Var.l;
        ij1Var.l = 0L;
        ij1Var.m.clear();
        ij1Var.f.i(null, 0);
        ij1Var.n.i(null, p91.I);
        LinkedHashMap linkedHashMap = ij1Var.p;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((v52) it.next()).e(null);
        }
        linkedHashMap.clear();
        ij1Var.d.i(null, o91.I);
        ij1Var.f();
    }

    public static final void Q(boolean z, hu2 hu2Var, ab4 ab4Var, t43 t43Var, boolean z2, t43 t43Var2, boolean z3) {
        if (z || ((Boolean) t43Var.getValue()).booleanValue()) {
            return;
        }
        t43Var.setValue(Boolean.TRUE);
        t43Var2.setValue(Boolean.valueOf(z3 && !((Boolean) ((fw4) hu2Var.h.o0.I).getValue()).booleanValue() && N(z2, ab4Var)));
    }

    public static final void R(hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, hk3 hk3Var, ab4 ab4Var, Context context, boolean z, boolean z2) {
        if (ab4Var == ab4.T) {
            if (hu2Var.t()) {
                return;
            }
            hu2Var.u();
            return;
        }
        ab4 ab4Var2 = ab4.O;
        g83 g83Var = g83.a;
        if (ab4Var == ab4Var2) {
            hu2Var.q(g83Var);
            return;
        }
        if (ab4Var == ab4.S) {
            hu2Var.q(g83Var);
            return;
        }
        if (ab4Var == ab4.R) {
            hu2Var.q(g83Var);
            return;
        }
        if (ab4Var == ab4.P && ((fw4) hu2Var.p.F.I).getValue() != null) {
            hu2Var.q(g83Var);
        } else if (ab4Var == ab4.Q) {
            hu2Var.q(g83Var);
        } else {
            M(hu2Var, t43Var, t43Var2, t43Var3, hk3Var, ab4Var, context, z, z2);
        }
    }

    public static li3 S(float f2, int i2) {
        float f3 = (i2 & 1) != 0 ? 0.0f : 16.0f;
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new li3(f3, f2, f3, f2);
    }

    public static li3 T(float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        return new li3(f2, 0.0f, f3, f4);
    }

    public static final pd U() {
        return new pd(new Paint(7));
    }

    public static final void V(b83 b83Var, boolean z, ki1 ki1Var, rm1 rm1Var, rm1 rm1Var2, fe0 fe0Var, int i2) {
        int i3;
        m65 m65Var;
        String str = b83Var.a;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-949818392);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(b83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.h(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(ki1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.i(rm1Var2) ? 16384 : 8192;
        }
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
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
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), z ? k80Var.c : x70.f, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "RailItem-bg", go1Var, 24576, 0);
            long j2 = z ? k80Var.d : k80Var.s;
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "RailItem-fg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 x = ki1Var != null ? j42.x(i13Var, ki1Var) : i13Var;
            uv uvVar = q8.T;
            l13 H = p70.H(o7.m(nq4.e(i13Var, 1.0f).then(x), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new uf(t43Var, (byte) 14);
                go1Var.o0(Q3);
            }
            l13 D0 = D0(mw2.B(r13.d(A0(H, (tm1) Q3), null, rm1Var2, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130811), false, null, 3), 20.0f, 12.0f);
            u74 a2 = t74.a(b, uvVar, go1Var, 48);
            int Q4 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x0 = x0(go1Var, D0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            long j3 = j2;
            ow1.a(z ? b83Var.c : b83Var.d, str, p70.G(nq4.k(i13Var, 24.0f), s0, j3, false, null, 12), j3, go1Var, 0);
            oh4.a(go1Var, nq4.n(i13Var, 16.0f));
            if (z || ((Boolean) t43Var.getValue()).booleanValue()) {
                go1Var.d0(628982738);
                m65Var = ((fw2) go1Var.k(i51Var)).b.h;
                go1Var.q(false);
            } else {
                go1Var.d0(629056084);
                m65Var = ((fw2) go1Var.k(i51Var)).b.j;
                go1Var.q(false);
            }
            r55.b(str, p70.G(i13Var, s0, j3, false, null, 12), j3, 0L, (z || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 0, 0, 131000);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cu1(b83Var, z, ki1Var, rm1Var, rm1Var2, i2, (byte) 0);
        }
    }

    public static final void W(Author author, boolean z, ki1 ki1Var, hu2 hu2Var, rm1 rm1Var, rm1 rm1Var2, fe0 fe0Var, int i2) {
        int i3;
        fj0 fj0Var;
        Object obj;
        boolean z2;
        t43 t43Var;
        ki1 ki1Var2;
        rm1 rm1Var3;
        Avatar avatarMedium;
        List<String> urlList;
        Object obj2;
        String str;
        go1 go1Var;
        boolean z3;
        boolean z4;
        hu2 hu2Var2;
        boolean z5;
        boolean z6;
        t43 t43Var2;
        int i4;
        Object obj3;
        t43 t43Var3;
        Avatar avatarLarger;
        List<String> urlList2;
        String str2;
        aj5 aj5Var = mw2.j;
        tv tvVar = q8.V;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1226882615);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var2.g(author) : go1Var2.i(author) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var2.g(ki1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? go1Var2.g(hu2Var) : go1Var2.i(hu2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var2.i(rm1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go1Var2.i(rm1Var2) ? 131072 : 65536;
        }
        if (go1Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            wm4 wm4Var = hu2Var.h;
            t43 g2 = wi4.g(wm4Var.b.h0, go1Var2);
            String i5 = wm4Var.b.i();
            Iterator it = ((List) g2.getValue()).iterator();
            while (true) {
                fj0Var = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (j42.c(((dl4) obj).a, i5)) {
                        break;
                    }
                }
            }
            dl4 dl4Var = (dl4) obj;
            Object Q = go1Var2.Q();
            Object obj4 = de0.a;
            if (Q == obj4) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var4 = (t43) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == obj4) {
                Q2 = ad4.w(null);
                go1Var2.o0(Q2);
            }
            t43 t43Var5 = (t43) Q2;
            boolean z7 = ((List) g2.getValue()).size() > 1;
            Object Q3 = go1Var2.Q();
            if (Q3 == obj4) {
                Q3 = pt1.r(go1Var2);
            }
            ki1 ki1Var3 = (ki1) Q3;
            boolean g3 = go1Var2.g(i5);
            Object Q4 = go1Var2.Q();
            if (g3 || Q4 == obj4) {
                Q4 = ad4.w(null);
                go1Var2.o0(Q4);
            }
            t43 t43Var6 = (t43) Q4;
            Author author2 = author == null ? (Author) t43Var6.getValue() : author;
            boolean g4 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && go1Var2.i(author))) | go1Var2.g(t43Var6);
            Object Q5 = go1Var2.Q();
            if (g4 || Q5 == obj4) {
                Q5 = new ka(author, t43Var6, (byte) 21);
                go1Var2.o0(Q5);
            }
            Author.Companion companion = Author.Companion;
            mw2.m(i5, author, (rm1) Q5, go1Var2);
            Object Q6 = go1Var2.Q();
            if (Q6 == obj4) {
                Q6 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q6);
            }
            t43 t43Var7 = (t43) Q6;
            Object Q7 = go1Var2.Q();
            if (Q7 == obj4) {
                Q7 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q7;
            t43 w = ut0.w(t33Var, go1Var2);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            boolean booleanValue = ((Boolean) t43Var7.getValue()).booleanValue();
            long j2 = z ? k80Var.c : x70.f;
            long j3 = k80Var.u;
            int i6 = i3;
            long j4 = k80Var.v;
            long j5 = k80Var.s;
            boolean z8 = z7;
            cw4 t0 = p70.t0(booleanValue, j2, j3, ((Boolean) w.getValue()).booleanValue(), "RailProfileHeader-bg", go1Var2, 24576, 0);
            long j6 = z ? k80Var.d : j5;
            cw4 s0 = p70.s0(((Boolean) t43Var7.getValue()).booleanValue(), j6, k80Var.v, "RailProfileHeader-fg", go1Var2, 3072);
            Boolean bool = (Boolean) t43Var4.getValue();
            bool.getClass();
            Boolean valueOf = Boolean.valueOf(z8);
            boolean h2 = go1Var2.h(z8);
            Object Q8 = go1Var2.Q();
            if (h2 || Q8 == obj4) {
                Q8 = new su1(z8, t43Var4, ki1Var3, fj0Var, (byte) 0);
                z2 = z8;
                t43Var = t43Var4;
                ki1Var2 = ki1Var3;
                go1Var2.o0(Q8);
            } else {
                z2 = z8;
                t43Var = t43Var4;
                ki1Var2 = ki1Var3;
            }
            mw2.i(bool, valueOf, (hn1) Q8, go1Var2);
            uw2 c2 = px.c(q8.J, false);
            int Q9 = i82.Q(go1Var2.T);
            am3 m2 = go1Var2.m();
            i13 i13Var = i13.a;
            l13 x0 = x0(go1Var2, i13Var);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z9 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z9) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m2);
            Integer valueOf2 = Integer.valueOf(Q9);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf2);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            uv uvVar = q8.T;
            l13 H = p70.H(o7.m(j42.x(nq4.e(i13Var, 1.0f), ki1Var), jo.b), t0);
            Object Q10 = go1Var2.Q();
            if (Q10 == obj4) {
                Q10 = new uf(t43Var7, (byte) 15);
                go1Var2.o0(Q10);
            }
            l13 A0 = A0(H, (tm1) Q10);
            if (z2) {
                go1Var2.d0(-1834679005);
                Object Q11 = go1Var2.Q();
                if (Q11 == obj4) {
                    Q11 = new sf(t43Var, (byte) 4);
                    go1Var2.o0(Q11);
                }
                go1Var2.q(false);
                rm1Var3 = (rm1) Q11;
            } else {
                go1Var2.d0(-1834640256);
                go1Var2.q(false);
                rm1Var3 = null;
            }
            t43 t43Var8 = t43Var;
            l13 D0 = D0(mw2.B(r13.d(A0, null, rm1Var2, null, null, rm1Var, rm1Var3, null, null, null, null, null, t33Var, 130299), false, null, 3), 12.0f, 6.0f);
            u74 a2 = t74.a(b, uvVar, go1Var2, 48);
            int Q12 = i82.Q(go1Var2.T);
            am3 m3 = go1Var2.m();
            l13 x02 = x0(go1Var2, D0);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a2);
            qi4.k(go1Var2, sgVar2, m3);
            r7.G(Q12, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            String str3 = (author2 == null || (avatarLarger = author2.getAvatarLarger()) == null || (urlList2 = avatarLarger.getUrlList()) == null || (str2 = (String) o70.U0(urlList2)) == null) ? (author2 == null || (avatarMedium = author2.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null) ? null : (String) o70.U0(urlList) : str2;
            jp jpVar = dw2.a;
            ew2 L = rt0.L(jp.k(), go1Var2);
            String z10 = r7.z("长按切换配置 · ", ((List) g2.getValue()).size(), " 个");
            jp jpVar2 = d;
            if (author2 != null) {
                go1Var2.d0(-1796406116);
                if (str3 == null) {
                    str3 = "";
                }
                obj2 = obj4;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str3, go1Var2), "Avatar", mw2.p(o7.m(nq4.k(i13Var, 52.0f), L), ((fw2) go1Var2.k(i51Var)).a.I, aj5Var), null, null, null, li0.a, 0.0f, null, 0, false, go1Var2, 1572912, 0, 1976);
                oh4.a(go1Var2, nq4.n(i13Var, 12.0f));
                l13 x = nt3.x(i13Var, 1.0f);
                ba0 a3 = z90.a(jpVar2, tvVar, go1Var2, 0);
                int Q13 = i82.Q(go1Var2.T);
                am3 m4 = go1Var2.m();
                l13 x03 = x0(go1Var2, x);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar, a3);
                qi4.k(go1Var2, sgVar2, m4);
                r7.G(Q13, go1Var2, sgVar3, go1Var2);
                qi4.k(go1Var2, sgVar4, x03);
                r55.b(author2.getNickname(), p70.G(i13Var, s0, j6, false, null, 12), j6, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.h, go1Var2, 0, 24960, 110584);
                r55.b(z2 ? z10 : "个人主页", null, ((Boolean) t43Var7.getValue()).booleanValue() ? x70.c(j4, 0.8f) : j5, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 0, 0, 131066);
                go1Var2.q(true);
                go1Var2.q(false);
                z4 = false;
                z3 = true;
                go1Var = go1Var2;
            } else {
                obj2 = obj4;
                go1Var2.d0(-1795002560);
                ut0.a(vt0.M(go1Var2, R.mipmap.ic_launcher_foreground), "Profile", mw2.p(o7.m(nq4.k(i13Var, 52.0f), L), ((fw2) go1Var2.k(i51Var)).a.I, aj5Var), null, null, 0.0f, null, go1Var2, rj3.$stable | 48, 120);
                oh4.a(go1Var2, nq4.n(i13Var, 12.0f));
                l13 x2 = nt3.x(i13Var, 1.0f);
                ba0 a4 = z90.a(jpVar2, tvVar, go1Var2, 0);
                int Q14 = i82.Q(go1Var2.T);
                am3 m5 = go1Var2.m();
                l13 x04 = x0(go1Var2, x2);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar, a4);
                qi4.k(go1Var2, sgVar2, m5);
                r7.G(Q14, go1Var2, sgVar3, go1Var2);
                qi4.k(go1Var2, sgVar4, x04);
                if (dl4Var == null || (str = dl4Var.a) == null) {
                    str = "myDV";
                }
                r55.b(str, p70.G(i13Var, s0, j6, false, null, 12), j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.h, go1Var2, 0, 0, 131064);
                r55.b(z2 ? z10 : "畅滑短视频", null, ((Boolean) t43Var7.getValue()).booleanValue() ? x70.c(j4, 0.8f) : j5, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 0, 0, 131066);
                go1Var = go1Var2;
                z3 = true;
                go1Var.q(true);
                z4 = false;
                go1Var.q(false);
            }
            go1Var.q(z3);
            if (((Boolean) t43Var8.getValue()).booleanValue() && z2) {
                go1Var.d0(-1831157622);
                vv vvVar = q8.M;
                Object Q15 = go1Var.Q();
                Object obj5 = obj2;
                if (Q15 == obj5) {
                    t43Var3 = t43Var8;
                    Q15 = new sf(t43Var3, (byte) 5);
                    go1Var.o0(Q15);
                } else {
                    t43Var3 = t43Var8;
                }
                zq3 zq3Var = new zq3(30);
                z5 = z3;
                obj3 = obj5;
                z6 = z4;
                i4 = i6;
                hu2Var2 = hu2Var;
                t43Var2 = t43Var5;
                t43Var8 = t43Var3;
                tc0 u0 = p70.u0(-751779947, new eu1(g2, i5, ki1Var2, hu2Var, t43Var5, t43Var3), go1Var);
                go1Var2 = go1Var;
                pe.b(vvVar, (rm1) Q15, zq3Var, u0, go1Var2, 28038);
                go1Var2.q(z6);
            } else {
                hu2Var2 = hu2Var;
                z5 = z3;
                z6 = z4;
                go1Var2 = go1Var;
                t43Var2 = t43Var5;
                i4 = i6;
                obj3 = obj2;
                go1Var2.d0(-1827072411);
                go1Var2.q(z6);
            }
            dl4 dl4Var2 = (dl4) t43Var2.getValue();
            if (dl4Var2 == null) {
                go1Var2.d0(-1827031585);
                go1Var2.q(z6);
            } else {
                go1Var2.d0(-1827031584);
                String str4 = dl4Var2.a;
                Object Q16 = go1Var2.Q();
                if (Q16 == obj3) {
                    Q16 = new sf(t43Var2, (byte) 6);
                    go1Var2.o0(Q16);
                }
                rm1 rm1Var4 = (rm1) Q16;
                boolean i7 = go1Var2.i(dl4Var2) | (((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && go1Var2.i(hu2Var2))) ? z5 : z6);
                Object Q17 = go1Var2.Q();
                if (i7 || Q17 == obj3) {
                    u20 u20Var = new u20((Object) hu2Var, (Object) dl4Var2, t43Var2, t43Var8, (byte) 2);
                    go1Var2.o0(u20Var);
                    Q17 = u20Var;
                }
                j16.d(432, go1Var2, rm1Var4, (tm1) Q17, str4);
                go1Var2.q(z6);
            }
            go1Var2.q(z5);
        } else {
            go1Var2.W();
        }
        x04 u = go1Var2.u();
        if (u != null) {
            u.d = new bj0(author, z, ki1Var, hu2Var, rm1Var, rm1Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void X(ab4 ab4Var, final boolean z, final bh bhVar, final boolean z2, final Author author, final hu2 hu2Var, final rm1 rm1Var, final rm1 rm1Var2, tm1 tm1Var, l13 l13Var, fe0 fe0Var, final int i2) {
        ab4 ab4Var2;
        final bh bhVar2;
        go1 go1Var;
        l13 l13Var2;
        ab4 ab4Var3;
        Object obj;
        Object obj2;
        boolean z3;
        int i3;
        byte b2;
        Object obj3;
        List list;
        List list2;
        int i4;
        int i5;
        float f2;
        jp jpVar;
        Throwable th;
        int i6;
        int i7;
        Object obj4;
        int i8;
        int i9;
        Boolean bool;
        ab4 ab4Var4;
        ki1 ki1Var;
        rm1 rm1Var3;
        byte b3;
        Object obj5;
        Object v7Var;
        kp kpVar;
        int i10;
        List list3;
        List list4;
        b83 b83Var;
        b83 b83Var2;
        b83 b83Var3;
        tm1 tm1Var2 = tm1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1817867704);
        int i11 = (i2 & 6) == 0 ? (go1Var2.e(ab4Var.ordinal()) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i11 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i11 |= (i2 & 512) == 0 ? go1Var2.g(bhVar) : go1Var2.i(bhVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i11 |= go1Var2.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i11 |= (32768 & i2) == 0 ? go1Var2.g(author) : go1Var2.i(author) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i11 |= (262144 & i2) == 0 ? go1Var2.g(hu2Var) : go1Var2.i(hu2Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i11 |= go1Var2.i(rm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= go1Var2.i(rm1Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i11 |= go1Var2.i(tm1Var2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i12 = i11 | 805306368;
        final byte b4 = 1;
        if (go1Var2.T(i12 & 1, (i12 & 306783379) != 306783378)) {
            Object Q = go1Var2.Q();
            ab4 ab4Var5 = ab4.N;
            jp jpVar2 = de0.a;
            if (Q == jpVar2) {
                b83 b83Var4 = new b83("搜索", ab4Var5, ad4.s(), mu0.D());
                b83 b83Var5 = new b83("推荐", ab4.J, sv2.z(), sp0.Q());
                hx1 hx1Var = vt0.c;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.PhoneAndroid", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = th5.a;
                    rt4 rt4Var = new rt4(x70.b);
                    ep p2 = hf1.p(16.0f, 1.0f, 8.0f, 1.0f);
                    p2.q(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                    p2.M(16.0f);
                    p2.r(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                    p2.v(8.0f);
                    p2.r(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                    p2.x(19.0f, 4.0f);
                    p2.r(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                    p2.p();
                    p2.z(14.0f, 21.0f);
                    p2.v(-4.0f);
                    p2.M(-1.0f);
                    p2.v(4.0f);
                    p2.M(1.0f);
                    p2.p();
                    p2.z(17.25f, 18.0f);
                    p2.x(6.75f, 18.0f);
                    p2.x(6.75f, 4.0f);
                    p2.v(10.5f);
                    p2.M(14.0f);
                    p2.p();
                    gx1.a(gx1Var, (ArrayList) p2.J, rt4Var);
                    hx1Var = gx1Var.b();
                    vt0.c = hx1Var;
                }
                hx1 hx1Var2 = ut0.c;
                if (hx1Var2 != null) {
                    b83Var2 = b83Var5;
                } else {
                    gx1 gx1Var2 = new gx1("Outlined.PhoneAndroid", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i14 = th5.a;
                    rt4 rt4Var2 = new rt4(x70.b);
                    b83Var2 = b83Var5;
                    ep p3 = hf1.p(16.0f, 1.0f, 8.0f, 1.0f);
                    p3.q(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
                    p3.M(16.0f);
                    p3.r(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                    p3.v(8.0f);
                    p3.r(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                    p3.x(19.0f, 4.0f);
                    p3.r(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                    p3.p();
                    p3.z(17.0f, 18.0f);
                    p3.x(7.0f, 18.0f);
                    p3.x(7.0f, 4.0f);
                    p3.v(10.0f);
                    p3.M(14.0f);
                    p3.p();
                    p3.z(14.0f, 21.0f);
                    p3.v(-4.0f);
                    p3.M(-1.0f);
                    p3.v(4.0f);
                    p3.M(1.0f);
                    p3.p();
                    gx1.a(gx1Var2, (ArrayList) p3.J, rt4Var2);
                    hx1Var2 = gx1Var2.b();
                    ut0.c = hx1Var2;
                }
                b83 b83Var6 = new b83("移动推荐", ab4.L, hx1Var, hx1Var2);
                hx1 P = sp0.P();
                hx1 hx1Var3 = mu0.a;
                if (hx1Var3 != null) {
                    b83Var3 = b83Var6;
                    ab4Var3 = ab4Var5;
                } else {
                    gx1 gx1Var3 = new gx1("Outlined.Group", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i15 = th5.a;
                    rt4 rt4Var3 = new rt4(x70.b);
                    ep r2 = r7.r(9.0f, 13.75f);
                    r2.r(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
                    r2.x(2.0f, 19.0f);
                    r2.v(14.0f);
                    r2.M(-1.75f);
                    r2.r(0.0f, -2.33f, -4.66f, -3.5f, -7.0f, -3.5f);
                    r2.p();
                    r2.z(4.34f, 17.0f);
                    r2.r(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f);
                    b83Var3 = b83Var6;
                    ab4Var3 = ab4Var5;
                    r2.D(3.82f, 0.67f, 4.66f, 1.25f);
                    r2.x(4.34f, 17.0f);
                    r2.p();
                    r2.z(9.0f, 12.0f);
                    r2.r(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                    r2.C(10.93f, 5.0f, 9.0f, 5.0f);
                    r2.C(5.5f, 6.57f, 5.5f, 8.5f);
                    r2.C(7.07f, 12.0f, 9.0f, 12.0f);
                    r2.p();
                    r2.z(9.0f, 7.0f);
                    r2.r(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
                    r2.C(9.83f, 10.0f, 9.0f, 10.0f);
                    r2.D(-1.5f, -0.67f, -1.5f, -1.5f);
                    r2.C(8.17f, 7.0f, 9.0f, 7.0f);
                    r2.p();
                    r2.z(16.04f, 13.81f);
                    r2.r(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f);
                    r2.x(18.0f, 19.0f);
                    r2.v(4.0f);
                    r2.M(-1.75f);
                    r2.r(0.0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f);
                    r2.p();
                    r2.z(15.0f, 12.0f);
                    r2.r(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                    r2.C(16.93f, 5.0f, 15.0f, 5.0f);
                    r2.r(-0.54f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f);
                    r2.r(0.63f, 0.89f, 1.0f, 1.98f, 1.0f, 3.15f);
                    r2.D(-0.37f, 2.26f, -1.0f, 3.15f);
                    r2.r(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f);
                    r2.p();
                    gx1.a(gx1Var3, (ArrayList) r2.J, rt4Var3);
                    hx1Var3 = gx1Var3.b();
                    mu0.a = hx1Var3;
                }
                b83 b83Var7 = new b83("关注", ab4.K, P, hx1Var3);
                b83 b83Var8 = new b83("精选", ab4.I, sp0.T(), mu0.B());
                hx1 hx1Var4 = ui4.g;
                if (hx1Var4 == null) {
                    gx1 gx1Var4 = new gx1("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i16 = th5.a;
                    rt4 rt4Var4 = new rt4(x70.b);
                    ep p4 = hf1.p(21.0f, 3.0f, 3.0f, 3.0f);
                    p4.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p4.M(12.0f);
                    p4.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    p4.v(5.0f);
                    p4.M(2.0f);
                    p4.v(8.0f);
                    p4.M(-2.0f);
                    p4.v(5.0f);
                    p4.r(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                    p4.x(23.0f, 5.0f);
                    p4.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    p4.p();
                    p4.z(21.0f, 17.0f);
                    p4.x(3.0f, 17.0f);
                    p4.x(3.0f, 5.0f);
                    p4.v(18.0f);
                    p4.M(12.0f);
                    p4.p();
                    gx1.a(gx1Var4, (ArrayList) p4.J, rt4Var4);
                    hx1Var4 = gx1Var4.b();
                    ui4.g = hx1Var4;
                }
                hx1 hx1Var5 = qi4.c;
                if (hx1Var5 == null) {
                    gx1 gx1Var5 = new gx1("Outlined.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i17 = th5.a;
                    rt4 rt4Var5 = new rt4(x70.b);
                    ep p5 = hf1.p(21.0f, 3.0f, 3.0f, 3.0f);
                    p5.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p5.M(12.0f);
                    p5.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    p5.v(5.0f);
                    p5.M(2.0f);
                    p5.v(8.0f);
                    p5.M(-2.0f);
                    p5.v(5.0f);
                    p5.r(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                    p5.x(23.0f, 5.0f);
                    p5.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    p5.p();
                    p5.z(21.0f, 17.0f);
                    p5.x(3.0f, 17.0f);
                    p5.x(3.0f, 5.0f);
                    p5.v(18.0f);
                    p5.M(12.0f);
                    p5.p();
                    gx1.a(gx1Var5, (ArrayList) p5.J, rt4Var5);
                    hx1Var5 = gx1Var5.b();
                    qi4.c = hx1Var5;
                }
                List k0 = p70.k0(b83Var4, b83Var2, b83Var3, b83Var7, b83Var8, new b83("直播", ab4.M, hx1Var4, hx1Var5));
                go1Var2.o0(k0);
                obj = k0;
            } else {
                ab4Var3 = ab4Var5;
                obj = Q;
            }
            List list5 = (List) obj;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar2) {
                b83 b83Var9 = new b83("设置", ab4.Q, ad4.t(), wi4.n());
                hx1 hx1Var6 = vt0.a;
                if (hx1Var6 != null) {
                    b83Var = b83Var9;
                } else {
                    gx1 gx1Var6 = new gx1("Filled.ExitToApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i18 = th5.a;
                    b83Var = b83Var9;
                    rt4 rt4Var6 = new rt4(x70.b);
                    ep p6 = hf1.p(10.09f, 15.59f, 11.5f, 17.0f);
                    p6.y(5.0f, -5.0f);
                    p6.y(-5.0f, -5.0f);
                    p6.y(-1.41f, 1.41f);
                    p6.x(12.67f, 11.0f);
                    p6.u(3.0f);
                    p6.M(2.0f);
                    p6.v(9.67f);
                    p6.y(-2.58f, 2.59f);
                    p6.p();
                    p6.z(19.0f, 3.0f);
                    p6.u(5.0f);
                    p6.r(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p6.M(4.0f);
                    p6.v(2.0f);
                    p6.L(5.0f);
                    p6.v(14.0f);
                    p6.M(14.0f);
                    p6.u(5.0f);
                    p6.M(-4.0f);
                    p6.u(3.0f);
                    p6.M(4.0f);
                    p6.r(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    p6.v(14.0f);
                    p6.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    p6.L(5.0f);
                    p6.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    p6.p();
                    gx1.a(gx1Var6, (ArrayList) p6.J, rt4Var6);
                    hx1Var6 = gx1Var6.b();
                    vt0.a = hx1Var6;
                }
                hx1 hx1Var7 = ut0.a;
                if (hx1Var7 == null) {
                    gx1 gx1Var7 = new gx1("Outlined.ExitToApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i19 = th5.a;
                    rt4 rt4Var7 = new rt4(x70.b);
                    ep p7 = hf1.p(10.09f, 15.59f, 11.5f, 17.0f);
                    p7.y(5.0f, -5.0f);
                    p7.y(-5.0f, -5.0f);
                    p7.y(-1.41f, 1.41f);
                    p7.x(12.67f, 11.0f);
                    p7.u(3.0f);
                    p7.M(2.0f);
                    p7.v(9.67f);
                    p7.y(-2.58f, 2.59f);
                    p7.p();
                    p7.z(19.0f, 3.0f);
                    p7.u(5.0f);
                    p7.r(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p7.M(4.0f);
                    p7.v(2.0f);
                    p7.L(5.0f);
                    p7.v(14.0f);
                    p7.M(14.0f);
                    p7.u(5.0f);
                    p7.M(-4.0f);
                    p7.u(3.0f);
                    p7.M(4.0f);
                    p7.r(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    p7.v(14.0f);
                    p7.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    p7.L(5.0f);
                    p7.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    p7.p();
                    gx1.a(gx1Var7, (ArrayList) p7.J, rt4Var7);
                    hx1Var7 = gx1Var7.b();
                    ut0.a = hx1Var7;
                }
                List k02 = p70.k0(b83Var, new b83("退出", null, hx1Var6, hx1Var7));
                go1Var2.o0(k02);
                obj2 = k02;
            } else {
                obj2 = Q2;
            }
            List list6 = (List) obj2;
            boolean g2 = go1Var2.g(list5) | go1Var2.g(list6);
            Object Q3 = go1Var2.Q();
            Object obj6 = Q3;
            if (g2 || Q3 == jpVar2) {
                ArrayList f1 = o70.f1(list5, list6);
                go1Var2.o0(f1);
                obj6 = f1;
            }
            List list7 = (List) obj6;
            ne1 ne1Var = nq4.c;
            uw2 c2 = px.c(q8.J, false);
            int Q4 = i82.Q(go1Var2.T);
            am3 m2 = go1Var2.m();
            l13 x0 = x0(go1Var2, ne1Var);
            xd0.c.getClass();
            if (!jp0.y(go1Var2.a)) {
                qb.S();
                throw null;
            }
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c2);
            qi4.k(go1Var2, q8.b0, m2);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(Q4));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            i13 i13Var = i13.a;
            if (z2) {
                go1Var2.d0(644962733);
                int i20 = i12 & 896;
                boolean z4 = i20 == 256 || ((i12 & 512) != 0 && go1Var2.i(bhVar));
                Object Q5 = go1Var2.Q();
                Object obj7 = Q5;
                if (z4 || Q5 == jpVar2) {
                    final byte b5 = 0;
                    tm1 tm1Var3 = new tm1() { // from class: au1
                        @Override // defpackage.tm1
                        public final Object invoke(Object obj8) {
                            byte b6 = b5;
                            wd5 wd5Var = wd5.a;
                            bh bhVar3 = bhVar;
                            n54 n54Var = (n54) obj8;
                            switch (b6) {
                                case 0:
                                    n54Var.getClass();
                                    n54Var.b(((Number) bhVar3.d()).floatValue());
                                    break;
                                default:
                                    n54Var.getClass();
                                    n54Var.w((1.0f - ((Number) bhVar3.d()).floatValue()) * (-Float.intBitsToFloat((int) (n54Var.Y >> 32))));
                                    n54Var.b(((Number) bhVar3.d()).floatValue());
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    go1Var2.o0(tm1Var3);
                    obj7 = tm1Var3;
                }
                l13 p8 = mw2.p(qb.O(ne1Var, (tm1) obj7), x70.c(((fw2) go1Var2.k(lw2.b)).a.C, 0.45f), mw2.j);
                Boolean valueOf = Boolean.valueOf(z);
                int i21 = i12 & 112;
                int i22 = i12 & 3670016;
                boolean z5 = (i21 == 32) | (i22 == 1048576);
                Object Q6 = go1Var2.Q();
                if (z5 || Q6 == jpVar2) {
                    i3 = i22;
                    b2 = 0;
                    tu1 tu1Var = new tu1(z, rm1Var, b2);
                    go1Var2.o0(tu1Var);
                    obj3 = tu1Var;
                } else {
                    i3 = i22;
                    b2 = 0;
                    obj3 = Q6;
                }
                px.a(m05.b(p8, valueOf, (PointerInputEventHandler) obj3), go1Var2, b2);
                Object Q7 = go1Var2.Q();
                Object obj8 = Q7;
                if (Q7 == jpVar2) {
                    dl0 w = mw2.w(go1Var2);
                    go1Var2.o0(w);
                    obj8 = w;
                }
                dl0 dl0Var = (dl0) obj8;
                int i23 = ((i20 == 256 || ((i12 & 512) != 0 && go1Var2.i(bhVar))) ? (byte) 1 : b2) | ((i12 & 29360128) == 8388608 ? (byte) 1 : (byte) 0) | (go1Var2.i(dl0Var) ? 1 : 0);
                Object Q8 = go1Var2.Q();
                if (i23 != 0 || Q8 == jpVar2) {
                    list = list5;
                    list2 = list6;
                    i4 = i3;
                    i5 = 0;
                    f2 = 12.0f;
                    jpVar = jpVar2;
                    wu1 wu1Var = new wu1(rm1Var2, dl0Var, bhVar, null, (byte) 0);
                    bhVar2 = bhVar;
                    th = null;
                    go1Var2.o0(wu1Var);
                    Q8 = wu1Var;
                } else {
                    bhVar2 = bhVar;
                    list = list5;
                    list2 = list6;
                    i4 = i3;
                    i5 = 0;
                    f2 = 12.0f;
                    th = null;
                    jpVar = jpVar2;
                }
                int i24 = i12 >> 3;
                rt0.d(z, (hn1) Q8, go1Var2, i24 & 14);
                Object Q9 = go1Var2.Q();
                Object obj9 = Q9;
                if (Q9 == jpVar) {
                    obj9 = pt1.r(go1Var2);
                }
                ki1 ki1Var2 = (ki1) obj9;
                boolean g3 = go1Var2.g(list7);
                Object Q10 = go1Var2.Q();
                Object obj10 = Q10;
                if (g3 || Q10 == jpVar) {
                    int size = list7.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i25 = i5; i25 < size; i25++) {
                        arrayList.add(new ki1());
                    }
                    go1Var2.o0(arrayList);
                    obj10 = arrayList;
                }
                List list8 = (List) obj10;
                int i26 = i12 & 14;
                int i27 = (i26 == 4 ? 1 : i5) | (go1Var2.g(list7) ? 1 : 0);
                Object Q11 = go1Var2.Q();
                if (i27 != 0 || Q11 == jpVar) {
                    int ordinal = ab4Var.ordinal();
                    if (ordinal == 5 || ordinal == 6) {
                        i6 = i12;
                        Iterator it = list7.iterator();
                        i7 = i5;
                        while (it.hasNext()) {
                            ab4 ab4Var6 = ab4Var3;
                            if (((b83) it.next()).b == ab4Var6) {
                                break;
                            }
                            i7++;
                            ab4Var3 = ab4Var6;
                        }
                        i7 = -1;
                        Integer valueOf2 = Integer.valueOf(i7);
                        go1Var2.o0(valueOf2);
                        obj4 = valueOf2;
                    } else {
                        Iterator it2 = list7.iterator();
                        i7 = i5;
                        while (it2.hasNext()) {
                            i6 = i12;
                            if (((b83) it2.next()).b == ab4Var) {
                                break;
                            }
                            i7++;
                            i12 = i6;
                        }
                        i6 = i12;
                        i7 = -1;
                        Integer valueOf22 = Integer.valueOf(i7);
                        go1Var2.o0(valueOf22);
                        obj4 = valueOf22;
                    }
                } else {
                    i6 = i12;
                    obj4 = Q11;
                }
                int intValue = ((Number) obj4).intValue();
                Boolean valueOf3 = Boolean.valueOf(z);
                int i28 = (i21 == 32 ? 1 : i5) | (i26 == 4 ? 1 : i5) | (go1Var2.e(intValue) ? 1 : 0) | (go1Var2.i(list8) ? 1 : 0);
                Object Q12 = go1Var2.Q();
                if (i28 != 0 || Q12 == jpVar) {
                    i8 = i24;
                    i9 = i6;
                    bool = valueOf3;
                    xu1 xu1Var = new xu1(z, ab4Var, ki1Var2, intValue, list8, null);
                    ab4Var4 = ab4Var;
                    ki1Var = ki1Var2;
                    go1Var2.o0(xu1Var);
                    Q12 = xu1Var;
                } else {
                    ab4Var4 = ab4Var;
                    ki1Var = ki1Var2;
                    i8 = i24;
                    i9 = i6;
                    bool = valueOf3;
                }
                mw2.i(bool, ab4Var4, (hn1) Q12, go1Var2);
                float f3 = ((r11) j42.P(new r11(280.0f), new r11(((Configuration) go1Var2.k(rb.a)).screenWidthDp * 0.84f))).I;
                float j2 = bp3.j(go1Var2);
                WeakHashMap weakHashMap = dw5.w;
                v12 d2 = j42.d(wi4.h(go1Var2).l, go1Var2);
                l13 b6 = nq4.b(nq4.n(i13Var, f3 + j2), 1.0f);
                int i29 = (i20 == 256 || ((i9 & 512) != 0 && go1Var2.i(bhVar2))) ? 1 : i5;
                Object Q13 = go1Var2.Q();
                Object obj11 = Q13;
                if (i29 != 0 || Q13 == jpVar) {
                    tm1 tm1Var4 = new tm1() { // from class: au1
                        @Override // defpackage.tm1
                        public final Object invoke(Object obj82) {
                            byte b62 = b4;
                            wd5 wd5Var = wd5.a;
                            bh bhVar3 = bhVar2;
                            n54 n54Var = (n54) obj82;
                            switch (b62) {
                                case 0:
                                    n54Var.getClass();
                                    n54Var.b(((Number) bhVar3.d()).floatValue());
                                    break;
                                default:
                                    n54Var.getClass();
                                    n54Var.w((1.0f - ((Number) bhVar3.d()).floatValue()) * (-Float.intBitsToFloat((int) (n54Var.Y >> 32))));
                                    n54Var.b(((Number) bhVar3.d()).floatValue());
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    go1Var2.o0(tm1Var4);
                    obj11 = tm1Var4;
                }
                l13 m3 = o7.m(qb.O(b6, (tm1) obj11), l74.b(9));
                i51 i51Var = lw2.b;
                l13 F0 = F0(mw2.p(m3, ((fw2) go1Var2.k(i51Var)).a.F, mw2.j), f2 + j2, d2.d() + 24.0f, f2, d2.a() + 20.0f);
                int i30 = i4 == 1048576 ? 1 : i5;
                Object Q14 = go1Var2.Q();
                if (i30 != 0 || Q14 == jpVar) {
                    rm1Var3 = rm1Var;
                    b3 = 1;
                    b40 b40Var = new b40(rm1Var3, b3);
                    go1Var2.o0(b40Var);
                    obj5 = b40Var;
                } else {
                    rm1Var3 = rm1Var;
                    b3 = 1;
                    obj5 = Q14;
                }
                int i31 = i9;
                l13 d3 = r13.d(qg5.R(F0, (tm1) obj5), null, rm1Var3, null, null, null, null, null, null, null, null, null, null, 245755);
                ba0 a2 = z90.a(d, q8.V, go1Var2, i5);
                int Q15 = i82.Q(go1Var2.T);
                am3 m4 = go1Var2.m();
                l13 x02 = x0(go1Var2, d3);
                xd0.c.getClass();
                if (!jp0.y(go1Var2.a)) {
                    qb.S();
                    throw th;
                }
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(wa2.A0);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, q8.c0, a2);
                qi4.k(go1Var2, q8.b0, m4);
                qi4.k(go1Var2, q8.d0, Integer.valueOf(Q15));
                qi4.j(go1Var2);
                qi4.k(go1Var2, q8.a0, x02);
                byte b7 = (ab4Var4 == ab4.P || ab4Var4 == ab4.R || ab4Var4 == ab4.S) ? b3 : (byte) 0;
                int i32 = i31 & 234881024;
                byte b8 = i32 == 67108864 ? b3 : (byte) 0;
                Object Q16 = go1Var2.Q();
                Object obj12 = Q16;
                if (b8 != 0 || Q16 == jpVar) {
                    wn wnVar = new wn(tm1Var, (byte) 5);
                    go1Var2.o0(wnVar);
                    obj12 = wnVar;
                }
                int i33 = i31 >> 6;
                boolean z6 = b3;
                W(author, b7, ki1Var, hu2Var, (rm1) obj12, rm1Var, go1Var2, Author.$stable | RendererCapabilities.DECODER_SUPPORT_MASK | ((i31 >> 12) & 14) | 4096 | (i33 & 7168) | (i8 & 458752));
                oh4.a(go1Var2, nq4.g(i13Var, 8.0f));
                l13 G = pt1.G(ea0.a, nq4.e(i13Var, 1.0f), 1.0f);
                kp kpVar2 = new kp(4.0f, z6, new y9());
                List list9 = list;
                boolean i34 = go1Var2.i(list9) | (i26 == 4 ? z6 ? 1 : 0 : false) | go1Var2.i(list8) | (i32 == 67108864 ? z6 ? 1 : 0 : false) | (i4 == 1048576 ? z6 ? 1 : 0 : false);
                Object Q17 = go1Var2.Q();
                if (i34 || Q17 == jpVar) {
                    kpVar = kpVar2;
                    i10 = 67108864;
                    v7Var = new v7(list9, ab4Var, list8, tm1Var, rm1Var, (byte) 3);
                    list3 = list9;
                    list4 = list8;
                    go1Var2.o0(v7Var);
                } else {
                    kpVar = kpVar2;
                    v7Var = Q17;
                    list4 = list8;
                    list3 = list9;
                    i10 = 67108864;
                }
                e21.c(G, null, null, kpVar, null, null, false, null, (tm1) v7Var, go1Var2, 24576, 494);
                l13 E0 = E0(i13Var, 0.0f, 6.0f, z6 ? 1 : 0);
                long j3 = ((fw2) go1Var2.k(i51Var)).a.B;
                List list10 = list4;
                tm1Var2 = tm1Var;
                l13Var2 = i13Var;
                int i35 = i10;
                ab4Var2 = ab4Var;
                z3 = z6 ? 1 : 0;
                a5.i(E0, 0.0f, j3, go1Var2, 6, 2);
                go1Var = go1Var2;
                go1Var.d0(-1366937787);
                int i36 = 0;
                for (Object obj13 : list2) {
                    int i37 = i36 + 1;
                    if (i36 < 0) {
                        p70.A0();
                        throw th;
                    }
                    b83 b83Var10 = (b83) obj13;
                    int size2 = list3.size() + i36;
                    boolean z7 = ab4Var2 == b83Var10.b ? z3 ? 1 : 0 : false;
                    ki1 ki1Var3 = (ki1) list10.get(size2);
                    boolean g4 = (i32 == i35 ? z3 ? 1 : 0 : false) | go1Var.g(b83Var10);
                    Object Q18 = go1Var.Q();
                    if (g4 || Q18 == jpVar) {
                        Q18 = new ka(tm1Var2, b83Var10, (byte) 20);
                        go1Var.o0(Q18);
                    }
                    rm1 rm1Var4 = (rm1) Q18;
                    int i38 = i33 & 57344;
                    int i39 = i36;
                    go1 go1Var3 = go1Var;
                    V(b83Var10, z7, ki1Var3, rm1Var4, rm1Var, go1Var3, i38);
                    go1Var = go1Var3;
                    if (i39 != list2.size() - (z3 ? 1 : 0)) {
                        go1Var.d0(2019715722);
                        oh4.a(go1Var, nq4.g(l13Var2, 4.0f));
                        go1Var.q(false);
                    } else {
                        go1Var.d0(2019800290);
                        go1Var.q(false);
                    }
                    i36 = i37;
                    i35 = C.BUFFER_FLAG_NOT_DEPENDED_ON;
                }
                r7.J(go1Var, false, z3, false);
            } else {
                ab4Var2 = ab4Var;
                tm1Var2 = tm1Var;
                bhVar2 = bhVar;
                l13Var2 = i13Var;
                go1Var = go1Var2;
                z3 = true;
                go1Var.d0(651596516);
                go1Var.q(false);
            }
            go1Var.q(z3);
        } else {
            ab4Var2 = ab4Var;
            bhVar2 = bhVar;
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            final bh bhVar3 = bhVar2;
            final ab4 ab4Var7 = ab4Var2;
            final tm1 tm1Var5 = tm1Var2;
            final l13 l13Var3 = l13Var2;
            u.d = new hn1() { // from class: bu1
                @Override // defpackage.hn1
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    i42.X(ab4.this, z, bhVar3, z2, author, hu2Var, rm1Var, rm1Var2, tm1Var5, l13Var3, (fe0) obj14, mu0.X(i2 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void Y(l13 l13Var, hn1 hn1Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1298353104);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.i(hn1Var) ? 32 : 16;
        }
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = new vy4(k04.q0);
                go1Var.o0(Q);
            }
            Z((vy4) Q, l13Var, hn1Var, go1Var, (i3 << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 13, i2, l13Var, hn1Var);
        }
    }

    public static final void Z(vy4 vy4Var, l13 l13Var, hn1 hn1Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.i(vy4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(hn1Var) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            eo1 b0 = qb.b0(go1Var);
            l13 x0 = x0(go1Var, l13Var);
            am3 m2 = go1Var.m();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, vy4Var.c, vy4Var);
            qi4.k(go1Var, vy4Var.d, b0);
            qi4.k(go1Var, vy4Var.e, hn1Var);
            xd0.c.getClass();
            qi4.k(go1Var, q8.b0, m2);
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            go1Var.q(true);
            if (go1Var.F()) {
                go1Var.d0(-1259187287);
                go1Var.q(false);
            } else {
                go1Var.d0(-1259245908);
                boolean i5 = go1Var.i(vy4Var);
                Object Q = go1Var.Q();
                if (i5 || Q == de0.a) {
                    Q = new q94(vy4Var, (byte) 7);
                    go1Var.o0(Q);
                }
                mw2.L(go1Var, (rm1) Q);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0((Object) vy4Var, (Object) l13Var, (Object) hn1Var, i2, (byte) 6);
        }
    }

    public static v80 a0(v80 v80Var) {
        it5 it5Var = j42.j;
        if (o7.r(v80Var.b, 12884901888L)) {
            v54 v54Var = (v54) v80Var;
            it5 it5Var2 = v54Var.d;
            if (!j0(it5Var2, it5Var)) {
                return new v54(v54Var.a, v54Var.h, it5Var, y0(f0(z7.c.b, it5Var2.a(), it5Var.a()), v54Var.i), v54Var.k, v54Var.n, v54Var.e, v54Var.f, v54Var.g, -1);
            }
        }
        return v80Var;
    }

    public static final Bundle b0(uj3... uj3VarArr) {
        Bundle bundle = new Bundle(uj3VarArr.length);
        for (uj3 uj3Var : uj3VarArr) {
            String str = (String) uj3Var.I;
            Object obj = uj3Var.J;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        s83.t(hf1.x("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    s83.t(hf1.x("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final float c0(ji3 ji3Var, da2 da2Var) {
        return da2Var == da2.I ? ji3Var.c(da2Var) : ji3Var.b(da2Var);
    }

    public static final float d0(ji3 ji3Var, da2 da2Var) {
        return da2Var == da2.I ? ji3Var.b(da2Var) : ji3Var.c(da2Var);
    }

    public static final void e0(dl0 dl0Var, CancellationException cancellationException) {
        v52 v52Var = (v52) dl0Var.getCoroutineContext().get(q8.r0);
        if (v52Var != null) {
            v52Var.e(cancellationException);
        } else {
            zy.h(dl0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final float[] f0(float[] fArr, float[] fArr2, float[] fArr3) {
        z0(fArr, fArr2);
        z0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] t0 = t0(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return y0(t0, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static l13 g0(l13 l13Var, boolean z, String str, t64 t64Var, t33 t33Var, rm1 rm1Var, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return l13Var.then(new q60((i2 & 8) != 0 ? null : t33Var, true, z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : t64Var, rm1Var));
    }

    public static final void h0(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                sv2.i(th, th2);
            }
        }
    }

    public static l13 i0(t64 t64Var, rm1 rm1Var, t33 t33Var, rm1 rm1Var2) {
        return new ja0(rm1Var2, rm1Var, t33Var, t64Var, true);
    }

    public static final boolean j0(it5 it5Var, it5 it5Var2) {
        if (it5Var == it5Var2) {
            return true;
        }
        return Math.abs(it5Var.a - it5Var2.a) < 0.001f && Math.abs(it5Var.b - it5Var2.b) < 0.001f;
    }

    public static l13 k0(l13 l13Var, in1 in1Var) {
        return l13Var.then(new ce0(in1Var));
    }

    public static final float l0(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final hj m0(hj hjVar) {
        hj c2 = hjVar.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(hjVar.a(i2), i2);
        }
        return c2;
    }

    public static final void n0(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        zy.o(hf1.v("toIndex (", i2, ") is greater than size (", i3, ")."));
    }

    public static final Object o0(hn1 hn1Var, fj0 fj0Var) {
        ya4 ya4Var = new ya4(fj0Var, fj0Var.getContext());
        return oh4.s(ya4Var, true, ya4Var, hn1Var);
    }

    public static final jg0 p0(v80 v80Var, v80 v80Var2) {
        return v80Var == v80Var2 ? new hg0(v80Var, v80Var, 1) : (o7.r(v80Var.b, 12884901888L) && o7.r(v80Var2.b, 12884901888L)) ? new ig0((v54) v80Var, (v54) v80Var2) : new jg0(v80Var, v80Var2, 0);
    }

    public static final hx1 r0() {
        hx1 hx1Var = r;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.ChatBubble", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(20.0f, 2.0f);
        epVar.u(4.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        epVar.M(18.0f);
        epVar.y(4.0f, -4.0f);
        epVar.v(14.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.L(4.0f);
        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        r = b2;
        return b2;
    }

    public static final Paint s0(qj3 qj3Var) {
        if (!(qj3Var instanceof pd)) {
            p02.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + s24.a(qj3Var.getClass()).b());
        }
        return ((pd) qj3Var).a;
    }

    public static final float[] t0(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean u0(dl0 dl0Var) {
        v52 v52Var = (v52) dl0Var.getCoroutineContext().get(q8.r0);
        if (v52Var != null) {
            return v52Var.isActive();
        }
        return true;
    }

    public static final boolean v0(KeyEvent keyEvent) {
        long w = e21.w(keyEvent);
        int i2 = j82.O;
        return j82.a(w, k21.y()) || j82.a(w, k21.E()) || j82.a(w, k21.M()) || j82.a(w, k21.R());
    }

    public static final l13 w0(fe0 fe0Var, l13 l13Var) {
        if (l13Var.all(new o90((byte) 23))) {
            return l13Var;
        }
        go1 go1Var = (go1) fe0Var;
        go1Var.e0(1219399079);
        l13 l13Var2 = (l13) l13Var.foldIn(i13.a, new y1(go1Var, (byte) 4));
        go1Var.q(false);
        return l13Var2;
    }

    public static final l13 x0(fe0 fe0Var, l13 l13Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(439770924);
        l13 w0 = w0(go1Var, l13Var);
        go1Var.q(false);
        return w0;
    }

    public static final float[] y0(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] z0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    @Override // defpackage.le0
    public Object A(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        return s(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte B();

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short C();

    @Override // kotlinx.serialization.encoding.Decoder
    public float D() {
        q0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double E() {
        q0();
        throw null;
    }

    @Override // defpackage.le0
    public void a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public le0 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.le0
    public Decoder d(gt3 gt3Var, int i2) {
        return y(gt3Var.i(i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean e() {
        q0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char f() {
        q0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int g(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        q0();
        throw null;
    }

    @Override // defpackage.le0
    public long h(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return q();
    }

    @Override // defpackage.le0
    public char i(gt3 gt3Var, int i2) {
        return f();
    }

    @Override // defpackage.le0
    public float j(gt3 gt3Var, int i2) {
        return D();
    }

    @Override // defpackage.le0
    public byte l(gt3 gt3Var, int i2) {
        return B();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int m();

    @Override // defpackage.le0
    public short n(gt3 gt3Var, int i2) {
        return C();
    }

    @Override // defpackage.le0
    public int o(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String p() {
        q0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long q();

    public void q0() {
        throw new zj4(s24.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.le0
    public boolean r(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return e();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public /* bridge */ Object s(KSerializer kSerializer) {
        return jp0.b(this, kSerializer);
    }

    @Override // defpackage.le0
    public String t(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean u() {
        return true;
    }

    @Override // defpackage.le0
    public Object x(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (kSerializer.getDescriptor().c() || u()) {
            return s(kSerializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.le0
    public double z(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return E();
    }
}
