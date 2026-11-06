package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.inputmethod.ExtractedText;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.media3.common.C;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class e21 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static ExoPlayer d;
    public static Surface e;
    public static hx1 f;
    public static hx1 g;
    public static hx1 h;

    public static final long A(oh2 oh2Var, m14 m14Var, int i) {
        hn3 hn3Var = n84.R0;
        v55 d2 = oh2Var.d();
        w23 w23Var = d2 != null ? d2.a.b : null;
        ca2 c2 = oh2Var.c();
        return (w23Var == null || c2 == null) ? d65.b : w23Var.h(m14Var.i(c2.mo37screenToLocalMKHz9U(0L)), i, hn3Var);
    }

    public static final long B(oh2 oh2Var, m14 m14Var, m14 m14Var2, int i) {
        long A = A(oh2Var, m14Var, i);
        if (d65.c(A)) {
            return d65.b;
        }
        long A2 = A(oh2Var, m14Var2, i);
        if (d65.c(A2)) {
            return d65.b;
        }
        int i2 = (int) (A >> 32);
        int i3 = (int) (A2 & 4294967295L);
        return ui4.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final int C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0079, B:14:0x0081, B:15:0x0068, B:31:0x0062), top: B:7:0x0021, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:19:0x008e, B:40:0x009b, B:42:0x009f, B:44:0x00a4, B:45:0x00aa, B:46:0x00ad, B:11:0x002d, B:12:0x0079, B:14:0x0081, B:15:0x0068, B:31:0x0062, B:37:0x0099), top: B:7:0x0021, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v4, types: [k20] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:12:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.gj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.br1
            if (r0 == 0) goto L13
            r0 = r9
            br1 r0 = (defpackage.br1) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.N = r1
            goto L18
        L13:
            br1 r0 = new br1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.M
            el0 r1 = defpackage.el0.I
            int r2 = r0.N
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 != r4) goto L33
            fz r2 = r0.L
            k20 r6 = r0.K
            sr r7 = r0.J
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.I
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r9 = move-exception
            goto L99
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            return r5
        L39:
            defpackage.mu0.V(r9)
            r9 = 6
            iz r6 = defpackage.qb.g(r4, r9, r5)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            be r2 = new be
            r7 = 13
            r2.<init>(r9, r6, r7)
            java.lang.Object r7 = defpackage.ws4.c
            monitor-enter(r7)
            java.util.List r8 = defpackage.ws4.i     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r8 = defpackage.o70.g1(r8, r2)     // Catch: java.lang.Throwable -> Lb2
            defpackage.ws4.i = r8     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r7)
            defpackage.ws4.c()
            sr r7 = new sr
            r8 = 7
            r7.<init>(r2, r8)
            fz r2 = new fz     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r9
        L68:
            r0.I = r8     // Catch: java.lang.Throwable -> L31
            r0.J = r7     // Catch: java.lang.Throwable -> L31
            r0.K = r6     // Catch: java.lang.Throwable -> L31
            r0.L = r2     // Catch: java.lang.Throwable -> L31
            r0.N = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L79
            return r1
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r2.c()     // Catch: java.lang.Throwable -> L31
            wd5 r9 = (defpackage.wd5) r9     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            defpackage.o63.p()     // Catch: java.lang.Throwable -> L31
            goto L68
        L8e:
            r6.e(r5)     // Catch: java.lang.Throwable -> L97
            r7.a()
            wd5 r9 = defpackage.wd5.a
            return r9
        L97:
            r9 = move-exception
            goto Lae
        L99:
            throw r9     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            boolean r1 = r9 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto La2
            r5 = r9
            java.util.concurrent.CancellationException r5 = (java.util.concurrent.CancellationException) r5     // Catch: java.lang.Throwable -> L97
        La2:
            if (r5 != 0) goto Laa
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r5 = defpackage.e41.a(r1, r9)     // Catch: java.lang.Throwable -> L97
        Laa:
            r6.e(r5)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        Lae:
            r7.a()
            throw r9
        Lb2:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.D(gj0):java.lang.Object");
    }

    public static final boolean E(u55 u55Var, int i) {
        w23 w23Var = u55Var.b;
        int d2 = w23Var.d(i);
        return i == u55Var.h(d2) || i == w23Var.c(d2, false) ? u55Var.i(i) != u55Var.a(i) : u55Var.a(i) != u55Var.a(i - 1);
    }

    public static final boolean F(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean G(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean H(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final boolean I(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean J(int i) {
        int type;
        return (!I(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static float K(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p61.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static boolean L(rz3 rz3Var, rz3 rz3Var2) {
        if (rz3Var.I.I.length != rz3Var2.I.I.length) {
            return false;
        }
        dr[] n = rz3Var.n();
        dr[] n2 = rz3Var2.n();
        if (n.length != n2.length) {
            return false;
        }
        for (int i = 0; i != n.length; i++) {
            dr drVar = n[i];
            dr drVar2 = n2[i];
            if (drVar != drVar2 && (drVar == null || drVar2 == null || !drVar.I.r(drVar2.I) || !l(drVar.J).equals(l(drVar2.J)))) {
                return false;
            }
        }
        return true;
    }

    public static final r41 M(Activity activity, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-1809767766);
        fj0 fj0Var = null;
        if (activity == null) {
            go1Var.q(false);
            return null;
        }
        boolean g2 = go1Var.g(activity);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g2 || Q == jpVar) {
            Q = new r41(activity);
            go1Var.o0(Q);
        }
        r41 r41Var = (r41) Q;
        boolean g3 = go1Var.g(r41Var);
        Object Q2 = go1Var.Q();
        if (g3 || Q2 == jpVar) {
            Q2 = new h40((Object) r41Var, fj0Var, (byte) 5);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, r41Var);
        go1Var.q(false);
        return r41Var;
    }

    public static void N(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void O(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    public static final String P(Object obj) {
        return r7.C(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final double Q(double d2, double d3) {
        return Math.copySign(Math.pow(Math.abs(d2), d3), d2);
    }

    public static boolean R(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final ExtractedText S(d55 d55Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = d55Var.a.J;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = d55Var.b;
        extractedText.selectionStart = d65.f(j);
        extractedText.selectionEnd = d65.e(j);
        extractedText.flags = !jx4.E(d55Var.a.J, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long T(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0.charAt(1) == '#') goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String U(defpackage.e0 r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r10 instanceof defpackage.b1
            r2 = 35
            r3 = 92
            r4 = 0
            if (r1 == 0) goto L2b
            boolean r1 = r10 instanceof defpackage.tn0
            if (r1 != 0) goto L2b
            b1 r10 = (defpackage.b1) r10
            java.lang.String r10 = r10.e()
            int r1 = r10.length()
            if (r1 <= 0) goto L27
            char r1 = r10.charAt(r4)
            if (r1 != r2) goto L27
            r0.append(r3)
        L27:
            r0.append(r10)
            goto L4f
        L2b:
            r0.append(r2)     // Catch: java.io.IOException -> Lbd
            u0 r10 = r10.d()     // Catch: java.io.IOException -> Lbd
            r10.getClass()     // Catch: java.io.IOException -> Lbd
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> Lbd
            r1.<init>()     // Catch: java.io.IOException -> Lbd
            r10.p(r1)     // Catch: java.io.IOException -> Lbd
            byte[] r10 = r1.toByteArray()     // Catch: java.io.IOException -> Lbd
            bu r1 = defpackage.et1.a     // Catch: java.io.IOException -> Lbd
            int r1 = r10.length     // Catch: java.io.IOException -> Lbd
            byte[] r10 = defpackage.et1.c(r1, r10)     // Catch: java.io.IOException -> Lbd
            java.lang.String r10 = defpackage.ix4.a(r10)     // Catch: java.io.IOException -> Lbd
            r0.append(r10)     // Catch: java.io.IOException -> Lbd
        L4f:
            int r10 = r0.length()
            r1 = 2
            if (r10 < r1) goto L64
            char r5 = r0.charAt(r4)
            if (r5 != r3) goto L64
            r5 = 1
            char r6 = r0.charAt(r5)
            if (r6 != r2) goto L64
            goto L65
        L64:
            r5 = r4
        L65:
            r2 = r4
        L66:
            r6 = 32
            if (r2 >= r10) goto L73
            char r7 = r0.charAt(r2)
            if (r7 != r6) goto L73
            int r2 = r2 + 1
            goto L66
        L73:
            int r7 = r10 + (-1)
        L75:
            if (r7 < 0) goto L80
            char r8 = r0.charAt(r7)
            if (r8 != r6) goto L80
            int r7 = r7 + (-1)
            goto L75
        L80:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r9 = r10 + 16
            r8.<init>(r9)
            if (r5 == 0) goto L8f
            java.lang.String r4 = "\\#"
            r8.append(r4)
            r4 = r1
        L8f:
            if (r4 >= r10) goto Lb8
            char r1 = r0.charAt(r4)
            if (r1 == r6) goto La9
            r9 = 34
            if (r1 == r9) goto Laf
            if (r1 == r3) goto Laf
            r9 = 43
            if (r1 == r9) goto Laf
            r9 = 44
            if (r1 == r9) goto Laf
            switch(r1) {
                case 59: goto Laf;
                case 60: goto Laf;
                case 61: goto Laf;
                case 62: goto Laf;
                default: goto La8;
            }
        La8:
            goto Lb2
        La9:
            if (r5 != 0) goto Lad
            if (r4 < r2) goto Laf
        Lad:
            if (r4 <= r7) goto Lb2
        Laf:
            r8.append(r3)
        Lb2:
            r8.append(r1)
            int r4 = r4 + 1
            goto L8f
        Lb8:
            java.lang.String r10 = r8.toString()
            return r10
        Lbd:
            java.lang.String r10 = "Other value has no encoded form"
            defpackage.s83.t(r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.U(e0):java.lang.String");
    }

    public static final long a(int i) {
        if (!(i > 0)) {
            t02.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final long b(int i) {
        long j = i << 32;
        int i2 = j82.O;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.l13 r27, defpackage.ag2 r28, defpackage.ji3 r29, defpackage.mp r30, defpackage.tv r31, defpackage.gf1 r32, boolean r33, defpackage.sc r34, defpackage.tm1 r35, defpackage.fe0 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.c(l13, ag2, ji3, mp, tv, gf1, boolean, sc, tm1, fe0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.l13 r37, defpackage.ag2 r38, final defpackage.ji3 r39, final boolean r40, final defpackage.gf1 r41, final boolean r42, final defpackage.sc r43, defpackage.tv r44, defpackage.mp r45, defpackage.uv r46, defpackage.ip r47, final defpackage.tm1 r48, defpackage.fe0 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.d(l13, ag2, ji3, boolean, gf1, boolean, sc, tv, mp, uv, ip, tm1, fe0, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.l13 r27, defpackage.ag2 r28, defpackage.ji3 r29, defpackage.ip r30, defpackage.uv r31, defpackage.gf1 r32, boolean r33, defpackage.sc r34, defpackage.tm1 r35, defpackage.fe0 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.e(l13, ag2, ji3, ip, uv, gf1, boolean, sc, tm1, fe0, int, int):void");
    }

    public static final void f(zg2 zg2Var, final xg2 xg2Var, final l13 l13Var, final li3 li3Var, final gf1 gf1Var, final boolean z, final sc scVar, final float f2, final float f3, final tm1 tm1Var, fe0 fe0Var, final int i, final int i2) {
        int i3;
        int i4;
        zg2 zg2Var2;
        go1 go1Var;
        jp jpVar;
        zg2 zg2Var3;
        c82 c82Var;
        l13 l13Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1904835166);
        if ((i & 6) == 0) {
            i3 = (go1Var2.g(zg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go1Var2.e(0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i & 512) == 0 ? go1Var2.g(xg2Var) : go1Var2.i(xg2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= go1Var2.g(l13Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= go1Var2.g(li3Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= go1Var2.h(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= go1Var2.g(gf1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= go1Var2.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= go1Var2.g(scVar) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= go1Var2.d(f2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (go1Var2.d(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var2.i(tm1Var) ? 32 : 16;
        }
        boolean z2 = true;
        if (go1Var2.T(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            go1Var2.Y();
            if ((i & 1) != 0 && !go1Var2.C()) {
                go1Var2.W();
            }
            go1Var2.r();
            int i6 = i5 & 14;
            int i7 = (i4 & 112) | i6;
            t43 x = ad4.x(tm1Var, go1Var2);
            int i8 = i4;
            boolean z3 = (((i7 & 14) ^ 6) > 4 && go1Var2.g(zg2Var)) || (i7 & 6) == 4;
            Object Q = go1Var2.Q();
            jp jpVar2 = de0.a;
            if (z3 || Q == jpVar2) {
                q8 q8Var = q8.y0;
                sf sfVar = new sf(x, (byte) 9);
                lt4 lt4Var = dt4.a;
                Q = new ed2(new wu0(new ka(new wu0(sfVar, q8Var), zg2Var, (byte) 26), q8Var), cw4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 2);
                go1Var2.o0(Q);
            }
            c82 c82Var2 = (c82) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar2) {
                Q2 = mw2.w(go1Var2);
                go1Var2.o0(Q2);
            }
            dl0 dl0Var = (dl0) Q2;
            ir1 ir1Var = (ir1) go1Var2.k(hf0.g);
            int i9 = i5 >> 6;
            int i10 = (i9 & 896) | i6 | (i9 & 7168) | ((i5 << 9) & 57344);
            int i11 = i5 >> 12;
            int i12 = i10 | (i11 & 458752) | ((i8 << 18) & 3670016) | ((i5 << 18) & 234881024);
            boolean g2 = ((((i12 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var2.g(li3Var)) || (i12 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i12 & 14) ^ 6) > 4 && go1Var2.g(zg2Var)) || (i12 & 6) == 4) | go1Var2.g(c82Var2) | ((((i12 & 7168) ^ 3072) > 2048 && go1Var2.h(false)) || (i12 & 3072) == 2048) | ((((i12 & 57344) ^ 24576) > 16384 && go1Var2.e(0)) || (i12 & 24576) == 16384) | ((((i12 & 458752) ^ 196608) > 131072 && go1Var2.d(f2)) || (i12 & 196608) == 131072) | ((((i12 & 3670016) ^ 1572864) > 1048576 && go1Var2.d(f3)) || (i12 & 1572864) == 1048576) | ((((i12 & 234881024) ^ 100663296) > 67108864 && go1Var2.g(xg2Var)) || (i12 & 100663296) == 67108864) | go1Var2.g(ir1Var);
            Object Q3 = go1Var2.Q();
            if (g2 || Q3 == jpVar2) {
                jpVar = jpVar2;
                zg2Var3 = zg2Var;
                rg2 rg2Var = new rg2(zg2Var3, xg2Var, c82Var2, li3Var, f2, dl0Var, ir1Var);
                c82Var = c82Var2;
                go1Var2.o0(rg2Var);
                Q3 = rg2Var;
            } else {
                zg2Var3 = zg2Var;
                c82Var = c82Var2;
                jpVar = jpVar2;
            }
            oe2 oe2Var = (oe2) Q3;
            int i13 = (i11 & 112) | i6;
            boolean z4 = ((((i13 & 112) ^ 48) > 32 && go1Var2.h(false)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && go1Var2.g(zg2Var3)) || (i13 & 6) == 4);
            Object Q4 = go1Var2.Q();
            if (z4 || Q4 == jpVar) {
                Q4 = new wg2(zg2Var3);
                go1Var2.o0(Q4);
            }
            wg2 wg2Var = (wg2) Q4;
            pg3 pg3Var = pg3.I;
            if (z) {
                go1Var2.d0(-1834596342);
                if (((i6 ^ 6) <= 4 || !go1Var2.g(zg2Var3)) && (i5 & 6) != 4) {
                    z2 = false;
                }
                Object Q5 = go1Var2.Q();
                if (z2 || Q5 == jpVar) {
                    Q5 = new hg2(zg2Var3);
                    go1Var2.o0(Q5);
                }
                l13Var2 = mw2.K((hg2) Q5, zg2Var3.k, pg3Var);
                go1Var2.q(false);
            } else {
                go1Var2.d0(-1834291488);
                go1Var2.q(false);
                l13Var2 = i13.a;
            }
            zg2Var2 = zg2Var3;
            go1Var = go1Var2;
            rt0.b(c82Var, i42.J0(eu5.M(p70.h0(l13Var.then(zg2Var3.i).then(zg2Var3.j), c82Var, wg2Var, pg3Var, z).then(l13Var2), zg2Var3.t), zg2Var3, pg3Var, scVar, z, gf1Var, zg2Var3.r, null), zg2Var2.m, oe2Var, go1Var, 0);
        } else {
            zg2Var2 = zg2Var;
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final zg2 zg2Var4 = zg2Var2;
            u.d = new hn1() { // from class: ng2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e21.f(zg2.this, xg2Var, l13Var, li3Var, gf1Var, z, scVar, f2, f3, tm1Var, (fe0) obj, mu0.X(i | 1), mu0.X(i2));
                    return wd5.a;
                }
            };
        }
    }

    public static final uj3 g(ArrayList arrayList, gc5 gc5Var, pn pnVar, yc ycVar, i9 i9Var) {
        Object invoke;
        Object obj;
        Typeface typeface;
        if (arrayList.size() <= 0) {
            return new uj3(null, i9Var.invoke(gc5Var));
        }
        v44 v44Var = (v44) arrayList.get(0);
        v44Var.getClass();
        synchronized (((o63) pnVar.d)) {
            try {
                uq uqVar = new uq(v44Var);
                tq tqVar = (tq) ((ss2) pnVar.b).a(uqVar);
                if (tqVar == null) {
                    tqVar = (tq) ((n43) pnVar.c).g(uqVar);
                }
                if (tqVar != null) {
                    obj = tqVar.a;
                } else {
                    try {
                        Context context = ycVar.a;
                        if (v44Var instanceof v44) {
                            typeface = g4.h(v44Var, context);
                            ok1 ok1Var = v44Var.c;
                            if (Build.VERSION.SDK_INT >= 26) {
                                typeface = zb5.a(typeface, ok1Var, context);
                            }
                        } else {
                            typeface = null;
                        }
                        invoke = typeface;
                    } catch (Exception unused) {
                        invoke = i9Var.invoke(gc5Var);
                    }
                    pn.S(pnVar, v44Var, ycVar, invoke);
                    obj = invoke;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj == null) {
            obj = i9Var.invoke(gc5Var);
        }
        return new uj3(null, e41.u0(gc5Var.d, obj, v44Var, gc5Var.b, gc5Var.c));
    }

    public static void h(fl2 fl2Var, vn1 vn1Var, Executor executor) {
        fl2Var.a(executor, new wn1(fl2Var, vn1Var, (byte) 0));
    }

    public static void i(StringBuilder sb, dr drVar, Hashtable hashtable) {
        String str = (String) hashtable.get(drVar.I);
        if (str == null) {
            str = drVar.I.y();
        }
        sb.append(str);
        sb.append('=');
        sb.append(U(drVar.J));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.q05 r7, defpackage.lp3 r8, defpackage.fu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.tk1
            if (r0 == 0) goto L13
            r0 = r9
            tk1 r0 = (defpackage.tk1) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            tk1 r0 = new tk1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.K
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            lp3 r7 = r0.J
            q05 r8 = r0.I
            defpackage.mu0.V(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L34:
            defpackage.mu0.V(r9)
            r05 r9 = r7.M
            kp3 r9 = r9.N
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            rp3 r5 = (defpackage.rp3) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.I = r7
            r0.J = r8
            r0.L = r3
            java.lang.Object r9 = r7.b(r8, r0)
            el0 r1 = defpackage.el0.I
            if (r9 != r1) goto L5d
            return r1
        L5d:
            kp3 r9 = (defpackage.kp3) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            rp3 r5 = (defpackage.rp3) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.j(q05, lp3, fu):java.lang.Object");
    }

    public static final Object k(xp3 xp3Var, hn1 hn1Var, fj0 fj0Var) {
        Object j0 = ((r05) xp3Var).j0(new uk1(fj0Var.getContext(), hn1Var, null, (byte) 0), fj0Var);
        return j0 == el0.I ? j0 : wd5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r7 >= r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(defpackage.e0 r9) {
        /*
            java.lang.String r9 = U(r9)
            int r0 = r9.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L4f
            char r0 = r9.charAt(r1)
            r3 = 35
            if (r0 != r3) goto L4f
            int r0 = r9.length()     // Catch: java.io.IOException -> L47
            int r0 = r0 - r2
            bu r3 = defpackage.et1.a     // Catch: java.lang.Exception -> L2e
            byte[] r0 = r3.b(r2, r0, r9)     // Catch: java.lang.Exception -> L2e
            u0 r0 = defpackage.u0.s(r0)     // Catch: java.io.IOException -> L47
            boolean r3 = r0 instanceof defpackage.b1
            if (r3 == 0) goto L4f
            b1 r0 = (defpackage.b1) r0
            java.lang.String r9 = r0.e()
            goto L4f
        L2e:
            r9 = move-exception
            vp0 r0 = new vp0     // Catch: java.io.IOException -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47
            java.lang.String r2 = "exception decoding Hex string: "
            r1.<init>(r2)     // Catch: java.io.IOException -> L47
            java.lang.String r2 = r9.getMessage()     // Catch: java.io.IOException -> L47
            r1.append(r2)     // Catch: java.io.IOException -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L47
            r0.<init>(r1, r9)     // Catch: java.io.IOException -> L47
            throw r0     // Catch: java.io.IOException -> L47
        L47:
            r9 = move-exception
            java.lang.String r0 = "unknown encoding in name"
            java.lang.IllegalStateException r9 = defpackage.k21.W(r0, r9)
            throw r9
        L4f:
            java.lang.String r9 = defpackage.ix4.b(r9)
            int r0 = r9.length()
            r3 = 2
            if (r0 >= r3) goto L5b
            return r9
        L5b:
            int r0 = r0 - r2
            r3 = r1
        L5d:
            r4 = 92
            r5 = 32
            if (r3 >= r0) goto L74
            char r6 = r9.charAt(r3)
            if (r6 != r4) goto L74
            int r6 = r3 + 1
            char r6 = r9.charAt(r6)
            if (r6 != r5) goto L74
            int r3 = r3 + 2
            goto L5d
        L74:
            int r6 = r3 + 1
            r7 = r0
        L77:
            if (r7 <= r6) goto L8a
            int r8 = r7 + (-1)
            char r8 = r9.charAt(r8)
            if (r8 != r4) goto L8a
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L8a
            int r7 = r7 + (-2)
            goto L77
        L8a:
            if (r3 > 0) goto L8e
            if (r7 >= r0) goto L93
        L8e:
            int r7 = r7 + r2
            java.lang.String r9 = r9.substring(r3, r7)
        L93:
            java.lang.String r0 = "  "
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto L9c
            return r9
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r9.charAt(r1)
            r0.append(r1)
        La8:
            int r3 = r9.length()
            if (r2 >= r3) goto Lbd
            char r3 = r9.charAt(r2)
            if (r1 != r5) goto Lb6
            if (r3 == r5) goto Lba
        Lb6:
            r0.append(r3)
            r1 = r3
        Lba:
            int r2 = r2 + 1
            goto La8
        Lbd:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.l(e0):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(defpackage.lh1 r5, defpackage.ag1 r6, defpackage.gj0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.jg1
            if (r0 == 0) goto L13
            r0 = r7
            jg1 r0 = (defpackage.jg1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            jg1 r0 = new jg1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.K
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            r24 r5 = r0.I
            defpackage.mu0.V(r7)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r6 = move-exception
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L30:
            defpackage.mu0.V(r7)
            r24 r7 = new r24
            r7.<init>()
            y30 r1 = new y30     // Catch: java.lang.Throwable -> L4c
            r4 = 3
            r1.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4c
            r0.I = r7     // Catch: java.lang.Throwable -> L4c
            r0.K = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r5.collect(r1, r0)     // Catch: java.lang.Throwable -> L4c
            el0 r6 = defpackage.el0.I
            if (r5 != r6) goto L4b
            return r6
        L4b:
            return r3
        L4c:
            r6 = move-exception
            r5 = r7
        L4e:
            java.lang.Object r5 = r5.I
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5a
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7c
        L5a:
            tk0 r7 = r0.getContext()
            q8 r0 = defpackage.q8.r0
            rk0 r7 = r7.get(r0)
            v52 r7 = (defpackage.v52) r7
            if (r7 == 0) goto L7d
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L6f
            goto L7d
        L6f:
            java.util.concurrent.CancellationException r7 = r7.t()
            if (r7 == 0) goto L7d
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7c
            goto L7d
        L7c:
            throw r6
        L7d:
            if (r5 != 0) goto L80
            return r6
        L80:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L88
            defpackage.sv2.i(r5, r6)
            throw r5
        L88:
            defpackage.sv2.i(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.m(lh1, ag1, gj0):java.io.Serializable");
    }

    public static final boolean n(m14 m14Var, float f2, float f3) {
        float f4 = m14Var.a;
        if (f2 > m14Var.c || f4 > f2) {
            return false;
        }
        return f3 <= m14Var.d && m14Var.b <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] o(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final Activity p(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return null;
    }

    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p61.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object r(Future future) {
        Object obj;
        boolean z = false;
        if (!future.isDone()) {
            zy.i(li4.h("Future was expected to be done: %s", future));
            return null;
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Set s() {
        return Build.VERSION.SDK_INT >= 34 ? i81.a() : c21.w();
    }

    public static final hx1 t() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(11.0f, 15.0f);
        epVar.v(2.0f);
        epVar.M(2.0f);
        epVar.v(-2.0f);
        epVar.p();
        epVar.z(11.0f, 7.0f);
        epVar.v(2.0f);
        epVar.M(6.0f);
        epVar.v(-2.0f);
        epVar.p();
        epVar.z(11.99f, 2.0f);
        epVar.q(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        epVar.D(4.47f, 10.0f, 9.99f, 10.0f);
        epVar.q(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        epVar.C(17.52f, 2.0f, 11.99f, 2.0f);
        epVar.p();
        epVar.z(12.0f, 20.0f);
        epVar.r(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        epVar.D(3.58f, -8.0f, 8.0f, -8.0f);
        epVar.D(8.0f, 3.58f, 8.0f, 8.0f);
        epVar.D(-3.58f, 8.0f, -8.0f, 8.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final hx1 u() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.FastRewind", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(11.0f, 18.0f, 11.0f, 6.0f);
        p.y(-8.5f, 6.0f);
        p.y(8.5f, 6.0f);
        p.p();
        p.z(11.5f, 12.0f);
        p.y(8.5f, 6.0f);
        p.x(20.0f, 6.0f);
        p.y(-8.5f, 6.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final hx1 v() {
        hx1 hx1Var = g;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(11.0f, 7.0f);
        epVar.v(2.0f);
        epVar.M(2.0f);
        epVar.v(-2.0f);
        epVar.p();
        epVar.z(11.0f, 11.0f);
        epVar.v(2.0f);
        epVar.M(6.0f);
        epVar.v(-2.0f);
        epVar.p();
        epVar.z(12.0f, 2.0f);
        epVar.q(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        epVar.D(4.48f, 10.0f, 10.0f, 10.0f);
        epVar.D(10.0f, -4.48f, 10.0f, -10.0f);
        epVar.C(17.52f, 2.0f, 12.0f, 2.0f);
        epVar.p();
        epVar.z(12.0f, 20.0f);
        epVar.r(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        epVar.D(3.59f, -8.0f, 8.0f, -8.0f);
        epVar.D(8.0f, 3.59f, 8.0f, 8.0f);
        epVar.D(-3.59f, 8.0f, -8.0f, 8.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        g = b2;
        return b2;
    }

    public static final long w(KeyEvent keyEvent) {
        return b(keyEvent.getKeyCode());
    }

    public static final int x(w23 w23Var, long j, gr5 gr5Var) {
        float g2 = gr5Var != null ? gr5Var.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int e2 = w23Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < w23Var.f(e2) - g2 || Float.intBitsToFloat(i) > w23Var.b(e2) + g2) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-g2) || Float.intBitsToFloat(i2) > w23Var.d + g2) {
            return -1;
        }
        return e2;
    }

    public static final int y(oh2 oh2Var, long j, gr5 gr5Var) {
        w23 w23Var;
        ca2 c2;
        long mo37screenToLocalMKHz9U;
        int x;
        v55 d2 = oh2Var.d();
        if (d2 == null || (w23Var = d2.a.b) == null || (c2 = oh2Var.c()) == null || (x = x(w23Var, (mo37screenToLocalMKHz9U = c2.mo37screenToLocalMKHz9U(j)), gr5Var)) == -1) {
            return -1;
        }
        return w23Var.g(pd3.a(mo37screenToLocalMKHz9U, (w23Var.b(x) + w23Var.f(x)) / 2.0f, 1));
    }

    public static final long z(uu2 uu2Var) {
        DragEvent dragEvent = (DragEvent) uu2Var.I;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }
}
