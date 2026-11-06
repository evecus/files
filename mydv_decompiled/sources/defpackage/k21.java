package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.widget.EdgeEffect;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class k21 implements nh4 {
    public static hx1 a;
    public static hx1 b;
    public static volatile WeakReference c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;
    public static hx1 g;
    public static hx1 h;
    public static hx1 i;

    public static long A() {
        return j82.f;
    }

    public static long B() {
        return j82.g;
    }

    public static long C() {
        return j82.d;
    }

    public static float D(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ub.k(edgeEffect);
        }
        return 0.0f;
    }

    public static long E() {
        return j82.r;
    }

    public static long F() {
        return j82.u;
    }

    public static final hx1 G() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int H(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r4
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r3
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2f
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2a
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L40
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.H(int):int");
    }

    public static final hx1 I() {
        hx1 hx1Var = e;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(13.0f, 3.0f);
        r.r(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        r.x(1.0f, 12.0f);
        r.y(3.89f, 3.89f);
        r.y(0.07f, 0.14f);
        r.x(9.0f, 12.0f);
        r.x(6.0f, 12.0f);
        r.r(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        r.D(7.0f, 3.13f, 7.0f, 7.0f);
        r.D(-3.13f, 7.0f, -7.0f, 7.0f);
        r.r(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        r.y(-1.42f, 1.42f);
        r.q(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        r.r(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        r.D(-4.03f, -9.0f, -9.0f, -9.0f);
        r.p();
        r.z(12.0f, 8.0f);
        r.M(5.0f);
        r.y(4.28f, 2.54f);
        r.y(0.72f, -1.21f);
        r.y(-3.5f, -2.08f);
        r.x(13.5f, 8.0f);
        r.x(12.0f, 8.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        e = b2;
        return b2;
    }

    public static final int J(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static long K() {
        return j82.c;
    }

    public static long L() {
        return j82.b;
    }

    public static long M() {
        return j82.E;
    }

    public static long N() {
        return j82.D;
    }

    public static long O() {
        return j82.C;
    }

    public static int P(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ck.r(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public static String Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ck.s(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static long R() {
        return j82.q;
    }

    public static long S() {
        return j82.p;
    }

    public static int T(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ck.z(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        }
    }

    public static Uri U(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ck.A(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public static IllegalArgumentException V(String str, Exception exc) {
        return (IllegalArgumentException) new IllegalArgumentException(str).initCause(exc);
    }

    public static IllegalStateException W(String str, IOException iOException) {
        return (IllegalStateException) new IllegalStateException(str).initCause(iOException);
    }

    public static final int X(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public static int Y(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (-2147483647 <= i5 && i5 < i3) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public static IOException Z(String str, Exception exc) {
        return (IOException) new IOException(str).initCause(exc);
    }

    public static int a0(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            s83.t(r7.z("x (", i2, ") must be > 0"));
            return 0;
        }
        switch (o22.a[roundingMode.ordinal()]) {
            case 1:
                dq2.r((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static final int b0(int[] iArr, long j) {
        int i2 = (int) (j & 4294967295L);
        int i3 = Integer.MIN_VALUE;
        for (int i4 = (int) (j >> 32); i4 < i2; i4++) {
            i3 = Math.max(i3, iArr[i4]);
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x011d, code lost:
    
        r0 = X(r7);
        r3 = r7[r0];
        r12 = r2.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        if (r13 >= r12) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0127, code lost:
    
        r37 = r12;
        r63 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        if (r7[r13] == r7[r0]) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        r12 = r2[r63];
        r13 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x03fe, code lost:
    
        r10 = Y(r1);
        r13 = X(r43);
        r63 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0408, code lost:
    
        if (r10 == r13) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0410, code lost:
    
        if (r1[r10] != r1[r13]) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0412, code lost:
    
        r0 = r63;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        if (r12 >= r13) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x041c, code lost:
    
        r13 = r43[r10];
        r63 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0421, code lost:
    
        if (r13 != (-1)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0423, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0424, code lost:
    
        r0 = r8.g(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0428, code lost:
    
        if (r0 >= 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0476, code lost:
    
        r13 = r42;
        r42 = r9;
        r44 = r6;
        r40 = r15;
        r15 = r43;
        r43 = r5;
        r5 = r61.a(r4, r0, r10);
        r45 = r11;
        r10 = (int) (r5 & 4294967295L);
        r11 = r3;
        r2 = (int) (r5 >> 32);
        r3 = r10 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0499, code lost:
    
        if (r3 == 1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x049b, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x049f, code lost:
    
        r8.n(r0, r2);
        r2 = r37;
        r11 = r2.o(r0, r5);
        r5 = b0(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x04af, code lost:
    
        if (r3 == 1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        r2[r63] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x04b1, code lost:
    
        r3 = r8.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x04b8, code lost:
    
        r6 = r63;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x04be, code lost:
    
        if (r0 >= r10) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x04c0, code lost:
    
        r39 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x04c4, code lost:
    
        if (r1[r39] == r5) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x04c6, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x04c7, code lost:
    
        r36[r39].addFirst(r11);
        r15[r39] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x04ce, code lost:
    
        if (r3 != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x04d0, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x04d4, code lost:
    
        r1[r39] = (r11.l() + r5) + r0;
        r0 = r39 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x04d2, code lost:
    
        r0 = r3[r39];
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x04b6, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x049d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x042a, code lost:
    
        r13 = r61;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x042e, code lost:
    
        if (r63 != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        r13 = r63 + 1;
        r12 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0434, code lost:
    
        if (d0(r0, r13, r1, r10) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x045d, code lost:
    
        r40 = r42;
        r42 = r9;
        r9 = r40;
        r46 = r2;
        r40 = r15;
        r15 = r0;
        r43 = r5;
        r44 = r6;
        r45 = r11;
        r2 = r37;
        r37 = r3;
        r0 = r63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0436, code lost:
    
        if (r65 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0438, code lost:
    
        r8.k();
        r0 = r0.length;
        r2 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x043f, code lost:
    
        if (r3 >= r0) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0441, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0448, code lost:
    
        r0 = r1.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x044c, code lost:
    
        if (r4 >= r0) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x044e, code lost:
    
        r3[r4] = r1[r10];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x045c, code lost:
    
        return c0(r13, r42, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0416, code lost:
    
        r10 = r10;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        r3 = r8.g(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r3 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        r12 = r1.a(r10, r3, r0);
        r0 = r9;
        r37 = r10;
        r9 = (int) (r12 & 4294967295L);
        r10 = r14;
        r39 = r15;
        r14 = (int) (r12 >> 32);
        r15 = r9 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r15 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        r0 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
    
        r8.n(r3, r0);
        r0 = r6.o(r3, r12);
        r12 = b0(r2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
    
        if (r15 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0177, code lost:
    
        r31 = r8.h(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        r13 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (r14 >= r9) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        r7[r14] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r31 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0183, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        r41 = (r0.l() + r12) + r15;
        r2[r14] = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        if ((r39 + r41) > 0) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0196, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0185, code lost:
    
        r15 = r31[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0168, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05c0 A[LOOP:23: B:274:0x05be->B:275:0x05c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0703 A[LOOP:28: B:349:0x0701->B:350:0x0703, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0635  */
    /* JADX WARN: Type inference failed for: r30v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.sg2 c0(defpackage.qg2 r61, int r62, int[] r63, int[] r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 3030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.c0(qg2, int, int[], int[], boolean):sg2");
    }

    public static final boolean d0(int[] iArr, qg2 qg2Var, int[] iArr2, int i2) {
        yv yvVar = qg2Var.q;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (yvVar.g(iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (yvVar.g(iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int i5 = yvVar.i(0);
        return (i5 == 0 || i5 == -1 || i5 == -2) ? false : true;
    }

    public static int e(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            a42 a42Var = (a42) list.get(i5);
            float I = ut0.I(ut0.G(a42Var));
            if (I == 0.0f) {
                int min2 = Math.min(a42Var.t(androidx.media3.common.util.Log.LOG_LEVEL_OFF), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, a42Var.b(min2));
            } else if (I > 0.0f) {
                f2 += I;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            a42 a42Var2 = (a42) list.get(i6);
            float I2 = ut0.I(ut0.G(a42Var2));
            if (I2 > 0.0f) {
                i4 = Math.max(i4, a42Var2.b(round != Integer.MAX_VALUE ? Math.round(round * I2) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public static int f(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            a42 a42Var = (a42) list.get(i6);
            float I = ut0.I(ut0.G(a42Var));
            int t = a42Var.t(i2);
            if (I == 0.0f) {
                i5 += t;
            } else if (I > 0.0f) {
                f2 += I;
                i4 = Math.max(i4, Math.round(t / I));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(i4 * f2) + i5;
    }

    public static final void f0(int i2, int[] iArr) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    public static int g(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            a42 a42Var = (a42) list.get(i5);
            float I = ut0.I(ut0.G(a42Var));
            if (I == 0.0f) {
                int min2 = Math.min(a42Var.t(androidx.media3.common.util.Log.LOG_LEVEL_OFF), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, a42Var.Q(min2));
            } else if (I > 0.0f) {
                f2 += I;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            a42 a42Var2 = (a42) list.get(i6);
            float I2 = ut0.I(ut0.G(a42Var2));
            if (I2 > 0.0f) {
                i4 = Math.max(i4, a42Var2.Q(round != Integer.MAX_VALUE ? Math.round(round * I2) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public static void g0(EdgeEffect edgeEffect, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i2);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i2);
        }
    }

    public static int h(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            a42 a42Var = (a42) list.get(i6);
            float I = ut0.I(ut0.G(a42Var));
            int p = a42Var.p(i2);
            if (I == 0.0f) {
                i5 += p;
            } else if (I > 0.0f) {
                f2 += I;
                i4 = Math.max(i4, Math.round(p / I));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(i4 * f2) + i5;
    }

    public static float h0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ub.p(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final void i(ur1 ur1Var, l13 l13Var, wd2 wd2Var, li3 li3Var, mp mpVar, ip ipVar, gf1 gf1Var, boolean z, sc scVar, tm1 tm1Var, fe0 fe0Var, int i2) {
        gf1 gf1Var2;
        boolean z2;
        sc scVar2;
        gf1 gf1Var3;
        int i3;
        boolean z3;
        sc b2;
        boolean z4;
        ip ipVar2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2072102870);
        int i4 = i2 | (go1Var.g(ur1Var) ? 4 : 2) | (go1Var.g(wd2Var) ? 256 : 128) | 373317632;
        int i5 = go1Var.i(tm1Var) ? 4 : 2;
        if (go1Var.T(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            go1Var.Y();
            int i6 = i2 & 1;
            Object obj = de0.a;
            if (i6 == 0 || go1Var.C()) {
                up0 a2 = fu4.a(go1Var);
                boolean g2 = go1Var.g(a2);
                Object Q = go1Var.Q();
                if (g2 || Q == obj) {
                    Q = new mr0(a2);
                    go1Var.o0(Q);
                }
                gf1Var3 = (mr0) Q;
                i3 = i4 & (-1908408321);
                z3 = true;
                b2 = lh3.b(go1Var);
                z4 = true;
            } else {
                go1Var.W();
                i3 = i4 & (-1908408321);
                gf1Var3 = gf1Var;
                z3 = z;
                z4 = true;
                b2 = scVar;
            }
            go1Var.r();
            int i7 = (i3 & 14) | 48;
            boolean z5 = ((((i7 & 14) ^ 6) > 4 && go1Var.g(ur1Var)) || (i7 & 6) == 4) ? z4 : false;
            Object Q2 = go1Var.Q();
            if (z5 || Q2 == obj) {
                ipVar2 = ipVar;
                Q2 = new xr1(new bj1(ur1Var, ipVar2, (byte) 11));
                go1Var.o0(Q2);
            } else {
                ipVar2 = ipVar;
            }
            gf1 gf1Var4 = gf1Var3;
            e41.g(l13Var, wd2Var, (xr1) Q2, li3Var, gf1Var4, z3, b2, mpVar, ipVar2, tm1Var, go1Var, ((i3 >> 3) & 112) | 818113542, 6 | ((i5 << 3) & 112));
            scVar2 = b2;
            z2 = z3;
            gf1Var2 = gf1Var4;
        } else {
            go1Var.W();
            gf1Var2 = gf1Var;
            z2 = z;
            scVar2 = scVar;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hj0(ur1Var, l13Var, wd2Var, li3Var, mpVar, ipVar, gf1Var2, z2, scVar2, tm1Var, i2);
        }
    }

    public static void i0(EdgeEffect edgeEffect, float f2) {
        if (!(edgeEffect instanceof cr1)) {
            edgeEffect.onRelease();
            return;
        }
        cr1 cr1Var = (cr1) edgeEffect;
        float f3 = cr1Var.b + f2;
        cr1Var.b = f3;
        if (Math.abs(f3) > cr1Var.a) {
            cr1Var.onRelease();
        }
    }

    public static int j(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            a42 a42Var = (a42) list.get(i6);
            float I = ut0.I(ut0.G(a42Var));
            int b2 = a42Var.b(i2);
            if (I == 0.0f) {
                i5 += b2;
            } else if (I > 0.0f) {
                f2 += I;
                i4 = Math.max(i4, Math.round(b2 / I));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(i4 * f2) + i5;
    }

    public static ek1 j0(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            s0(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nz3.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nz3.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            s0(xmlResourceParser);
                        }
                        arrayList.add(new gk1(i7, i9, resourceId2, string7, string6, z));
                    } else {
                        s0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new fk1((gk1[]) arrayList.toArray(new gk1[0]));
        }
        List n0 = n0(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nz3.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            s0(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                xj1 xj1Var = new xj1(string, string2, string8, n0, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(xj1Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                s0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new hk1(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            s83.t("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new xj1(string, string2, string3, n0, null, null));
        if (string4 != null) {
            arrayList2.add(new xj1(string, string2, string4, n0, null, null));
        }
        return new hk1(arrayList2, i11, integer2, string5);
    }

    public static int k(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            a42 a42Var = (a42) list.get(i5);
            float I = ut0.I(ut0.G(a42Var));
            if (I == 0.0f) {
                int min2 = Math.min(a42Var.b(androidx.media3.common.util.Log.LOG_LEVEL_OFF), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, a42Var.t(min2));
            } else if (I > 0.0f) {
                f2 += I;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            a42 a42Var2 = (a42) list.get(i6);
            float I2 = ut0.I(ut0.G(a42Var2));
            if (I2 > 0.0f) {
                i4 = Math.max(i4, a42Var2.t(round != Integer.MAX_VALUE ? Math.round(round * I2) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public static int l(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            a42 a42Var = (a42) list.get(i6);
            float I = ut0.I(ut0.G(a42Var));
            int Q = a42Var.Q(i2);
            if (I == 0.0f) {
                i5 += Q;
            } else if (I > 0.0f) {
                f2 += I;
                i4 = Math.max(i4, Math.round(Q / I));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(i4 * f2) + i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(defpackage.tc0 r4, defpackage.gj0 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.sp1
            if (r0 == 0) goto L13
            r0 = r5
            sp1 r0 = (defpackage.sp1) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            sp1 r0 = new sp1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.J
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L27:
            d92 r4 = defpackage.r7.s(r5)
            throw r4
        L2c:
            defpackage.mu0.V(r5)
            tk0 r5 = r0.getContext()
            k04 r1 = defpackage.k04.P
            rk0 r5 = r5.get(r1)
            xo r5 = (defpackage.xo) r5
            if (r5 == 0) goto L43
            r0.J = r2
            r5.a(r4, r0)
            return
        L43:
            java.lang.String r4 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            defpackage.zy.i(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.l0(tc0, gj0):void");
    }

    public static int m(List list, int i2, int i3) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            a42 a42Var = (a42) list.get(i5);
            float I = ut0.I(ut0.G(a42Var));
            if (I == 0.0f) {
                int min2 = Math.min(a42Var.b(androidx.media3.common.util.Log.LOG_LEVEL_OFF), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, a42Var.p(min2));
            } else if (I > 0.0f) {
                f2 += I;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            a42 a42Var2 = (a42) list.get(i6);
            float I2 = ut0.I(ut0.G(a42Var2));
            if (I2 > 0.0f) {
                i4 = Math.max(i4, a42Var2.p(round != Integer.MAX_VALUE ? Math.round(round * I2) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public static byte[] m0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                zy.i(hf1.u(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static float n(EdgeEffect edgeEffect, float f2, float f3, iu0 iu0Var) {
        float f4 = q61.a;
        double density = iu0Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d2 = q61.a * density;
        if (((float) (Math.exp((q61.b / q61.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2)) > D(edgeEffect) * f3) {
            return 0.0f;
        }
        g0(edgeEffect, mw2.P(f2));
        return f2;
    }

    public static List n0(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int o(int i2, int i3) {
        long j = i2 + i3;
        int i4 = (int) j;
        if (j == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(hf1.v("overflow: checkedAdd(", i2, ", ", i3, ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] o0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.o0(java.io.FileInputStream, int, int):byte[]");
    }

    public static byte[] p(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static long p0(InputStream inputStream, int i2) {
        byte[] m0 = m0(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (m0[i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static EdgeEffect q(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? ub.d(context) : new cr1(context);
    }

    public static final sw4 q0(boolean z, rm1 rm1Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        oy oyVar = (oy) go1Var.k(py.a);
        da2 da2Var = (da2) go1Var.k(hf0.n);
        boolean e2 = ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var.g(rm1Var)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 14) ^ 6) > 4 && go1Var.h(false)) || (i2 & 6) == 4) | go1Var.e(da2Var.ordinal()) | go1Var.g(oyVar) | ((((i2 & 112) ^ 48) > 32 && go1Var.h(z)) || (i2 & 48) == 32);
        Object Q = go1Var.Q();
        if (e2 || Q == de0.a) {
            Q = new sw4(rm1Var, da2Var, z, oyVar);
            go1Var.o0(Q);
        }
        return (sw4) Q;
    }

    public static IconCompat r(Icon icon) {
        icon.getClass();
        int T = T(icon);
        if (T == 2) {
            return IconCompat.c(null, Q(icon), P(icon));
        }
        if (T == 4) {
            Uri U = U(icon);
            PorterDuff.Mode mode = IconCompat.k;
            U.getClass();
            String uri = U.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = uri;
            return iconCompat;
        }
        if (T != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri U2 = U(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        U2.getClass();
        String uri2 = U2.toString();
        uri2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = uri2;
        return iconCompat3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0205, code lost:
    
        if (r43 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0209, code lost:
    
        if (r7 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020c, code lost:
    
        r0 = ((((defpackage.j16.w(r41) & 255) << 16) | (-16777216)) | ((defpackage.j16.w(r43) & 255) << 8)) | (defpackage.j16.w(r7) & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0201, code lost:
    
        if (r41 > 100.01d) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long r0(long r63, float r65) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.r0(long, float):long");
    }

    public static int s(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (o22.a[roundingMode.ordinal()]) {
            case 1:
                dq2.r(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i5);
                int abs2 = abs - (Math.abs(i3) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (abs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static void s0(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final k80 t(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            l85 v = v(context);
            long j = v.x;
            long j2 = v.A;
            long j3 = v.z;
            long j4 = v.w;
            long j5 = v.y;
            long j6 = v.E;
            long j7 = v.H;
            long j8 = v.G;
            long j9 = v.D;
            long j10 = v.L;
            long j11 = v.O;
            long j12 = v.N;
            long j13 = v.K;
            long j14 = v.s;
            long j15 = v.g;
            long j16 = v.l;
            return q80.c(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, v.i, j, j15, v.o, v.j, j16, v.u, v.m, v.q, v.p, v.n, v.r, v.t, j14, j4, j, v.B, j3, j9, j6, v.I, j8, j13, j10, v.P, j12, 62914560);
        }
        long x = d4.x(context, R.color.system_primary_dark);
        long x2 = d4.x(context, R.color.system_on_primary_dark);
        long x3 = d4.x(context, R.color.system_primary_container_dark);
        long x4 = d4.x(context, R.color.system_on_primary_container_dark);
        long x5 = d4.x(context, R.color.system_primary_light);
        long x6 = d4.x(context, R.color.system_secondary_dark);
        long x7 = d4.x(context, R.color.system_on_secondary_dark);
        long x8 = d4.x(context, R.color.system_secondary_container_dark);
        long x9 = d4.x(context, R.color.system_on_secondary_container_dark);
        long x10 = d4.x(context, R.color.system_tertiary_dark);
        long x11 = d4.x(context, R.color.system_on_tertiary_dark);
        long x12 = d4.x(context, R.color.system_tertiary_container_dark);
        long x13 = d4.x(context, R.color.system_on_tertiary_container_dark);
        long x14 = d4.x(context, R.color.system_background_dark);
        long x15 = d4.x(context, R.color.system_on_background_dark);
        long x16 = d4.x(context, R.color.system_surface_dark);
        long x17 = d4.x(context, R.color.system_on_surface_dark);
        long x18 = d4.x(context, R.color.system_surface_variant_dark);
        long x19 = d4.x(context, R.color.system_on_surface_variant_dark);
        long x20 = d4.x(context, R.color.system_surface_light);
        long x21 = d4.x(context, R.color.system_on_surface_light);
        long x22 = d4.x(context, R.color.system_outline_dark);
        long x23 = d4.x(context, R.color.system_outline_variant_dark);
        long x24 = d4.x(context, R.color.system_surface_bright_dark);
        long x25 = d4.x(context, R.color.system_surface_dim_dark);
        return q80.c(x, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, d4.x(context, R.color.system_primary_dark), x20, x21, x22, x23, 0L, x24, d4.x(context, R.color.system_surface_container_dark), d4.x(context, R.color.system_surface_container_high_dark), d4.x(context, R.color.system_surface_container_highest_dark), d4.x(context, R.color.system_surface_container_low_dark), d4.x(context, R.color.system_surface_container_lowest_dark), x25, d4.x(context, R.color.system_primary_fixed), d4.x(context, R.color.system_primary_fixed_dim), d4.x(context, R.color.system_on_primary_fixed), d4.x(context, R.color.system_on_primary_fixed_variant), d4.x(context, R.color.system_secondary_fixed), d4.x(context, R.color.system_secondary_fixed_dim), d4.x(context, R.color.system_on_secondary_fixed), d4.x(context, R.color.system_on_secondary_fixed_variant), d4.x(context, R.color.system_tertiary_fixed), d4.x(context, R.color.system_tertiary_fixed_dim), d4.x(context, R.color.system_on_tertiary_fixed), d4.x(context, R.color.system_on_tertiary_fixed_variant), 331350016);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon t0(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.t0(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }

    public static final k80 u(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            l85 v = v(context);
            long j = v.y;
            long j2 = v.v;
            long j3 = v.w;
            long j4 = v.B;
            long j5 = v.x;
            long j6 = v.F;
            long j7 = v.C;
            long j8 = v.D;
            long j9 = v.I;
            long j10 = v.M;
            long j11 = v.J;
            long j12 = v.K;
            long j13 = v.P;
            long j14 = v.b;
            long j15 = v.r;
            long j16 = v.g;
            return q80.f(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, v.l, j, v.o, v.d, 0L, v.k, v.i, v.u, j14, v.e, v.f, j16, v.c, v.a, v.h, j3, j5, j4, v.z, j8, v.E, j9, v.G, j12, v.L, j13, v.N, 62914560, 0);
        }
        long x = d4.x(context, R.color.system_primary_light);
        long x2 = d4.x(context, R.color.system_on_primary_light);
        long x3 = d4.x(context, R.color.system_primary_container_light);
        long x4 = d4.x(context, R.color.system_on_primary_container_light);
        long x5 = d4.x(context, R.color.system_primary_dark);
        long x6 = d4.x(context, R.color.system_secondary_light);
        long x7 = d4.x(context, R.color.system_on_secondary_light);
        long x8 = d4.x(context, R.color.system_secondary_container_light);
        long x9 = d4.x(context, R.color.system_on_secondary_container_light);
        long x10 = d4.x(context, R.color.system_tertiary_light);
        long x11 = d4.x(context, R.color.system_on_tertiary_light);
        long x12 = d4.x(context, R.color.system_tertiary_container_light);
        long x13 = d4.x(context, R.color.system_on_tertiary_container_light);
        long x14 = d4.x(context, R.color.system_background_light);
        long x15 = d4.x(context, R.color.system_on_background_light);
        long x16 = d4.x(context, R.color.system_surface_light);
        long x17 = d4.x(context, R.color.system_on_surface_light);
        long x18 = d4.x(context, R.color.system_surface_variant_light);
        long x19 = d4.x(context, R.color.system_on_surface_variant_light);
        long x20 = d4.x(context, R.color.system_surface_dark);
        long x21 = d4.x(context, R.color.system_on_surface_dark);
        long x22 = d4.x(context, R.color.system_outline_light);
        long x23 = d4.x(context, R.color.system_outline_variant_light);
        long x24 = d4.x(context, R.color.system_surface_bright_light);
        long x25 = d4.x(context, R.color.system_surface_dim_light);
        return q80.f(x, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, d4.x(context, R.color.system_primary_light), x20, x21, 0L, x22, x23, 0L, x24, d4.x(context, R.color.system_surface_container_light), d4.x(context, R.color.system_surface_container_high_light), d4.x(context, R.color.system_surface_container_highest_light), d4.x(context, R.color.system_surface_container_low_light), d4.x(context, R.color.system_surface_container_lowest_light), x25, d4.x(context, R.color.system_primary_fixed), d4.x(context, R.color.system_primary_fixed_dim), d4.x(context, R.color.system_on_primary_fixed), d4.x(context, R.color.system_on_primary_fixed_variant), d4.x(context, R.color.system_secondary_fixed), d4.x(context, R.color.system_secondary_fixed_dim), d4.x(context, R.color.system_on_secondary_fixed), d4.x(context, R.color.system_on_secondary_fixed_variant), d4.x(context, R.color.system_tertiary_fixed), d4.x(context, R.color.system_tertiary_fixed_dim), d4.x(context, R.color.system_on_tertiary_fixed), d4.x(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r7 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u0(defpackage.rp1 r5, android.content.Context r6, defpackage.fj0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.tp1
            if (r0 == 0) goto L13
            r0 = r7
            tp1 r0 = (defpackage.tp1) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            tp1 r0 = new tp1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.L
            int r1 = r0.M
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            java.util.Iterator r5 = r0.K
            android.content.Context r6 = r0.J
            rp1 r1 = r0.I
            defpackage.mu0.V(r7)
            goto L60
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L37:
            android.content.Context r6 = r0.J
            rp1 r5 = r0.I
            defpackage.mu0.V(r7)
            goto L58
        L3f:
            defpackage.mu0.V(r7)
            yp1 r7 = new yp1
            r7.<init>(r6)
            java.lang.Class r1 = r5.getClass()
            r0.I = r5
            r0.J = r6
            r0.M = r3
            java.io.Serializable r7 = r7.b(r1, r0)
            if (r7 != r4) goto L58
            goto L7a
        L58:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = r5
            r5 = r7
        L60:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r5.next()
            iq1 r7 = (defpackage.iq1) r7
            r0.I = r1
            r0.J = r6
            r0.K = r5
            r0.M = r2
            java.lang.Object r7 = r1.update(r6, r7, r0)
            if (r7 != r4) goto L60
        L7a:
            return r4
        L7b:
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.u0(rp1, android.content.Context, fj0):java.lang.Object");
    }

    public static final l85 v(Context context) {
        d4.x(context, R.color.system_neutral1_0);
        d4.x(context, R.color.system_neutral1_10);
        r0(d4.x(context, R.color.system_neutral1_600), 98.0f);
        r0(d4.x(context, R.color.system_neutral1_600), 96.0f);
        d4.x(context, R.color.system_neutral1_50);
        r0(d4.x(context, R.color.system_neutral1_600), 94.0f);
        r0(d4.x(context, R.color.system_neutral1_600), 92.0f);
        d4.x(context, R.color.system_neutral1_100);
        r0(d4.x(context, R.color.system_neutral1_600), 87.0f);
        d4.x(context, R.color.system_neutral1_200);
        d4.x(context, R.color.system_neutral1_300);
        d4.x(context, R.color.system_neutral1_400);
        d4.x(context, R.color.system_neutral1_500);
        d4.x(context, R.color.system_neutral1_600);
        d4.x(context, R.color.system_neutral1_700);
        r0(d4.x(context, R.color.system_neutral1_600), 24.0f);
        r0(d4.x(context, R.color.system_neutral1_600), 22.0f);
        d4.x(context, R.color.system_neutral1_800);
        r0(d4.x(context, R.color.system_neutral1_600), 17.0f);
        r0(d4.x(context, R.color.system_neutral1_600), 12.0f);
        d4.x(context, R.color.system_neutral1_900);
        r0(d4.x(context, R.color.system_neutral1_600), 6.0f);
        r0(d4.x(context, R.color.system_neutral1_600), 4.0f);
        d4.x(context, R.color.system_neutral1_1000);
        long x = d4.x(context, R.color.system_neutral2_0);
        d4.x(context, R.color.system_neutral2_10);
        long r0 = r0(d4.x(context, R.color.system_neutral2_600), 98.0f);
        long r02 = r0(d4.x(context, R.color.system_neutral2_600), 96.0f);
        long x2 = d4.x(context, R.color.system_neutral2_50);
        long r03 = r0(d4.x(context, R.color.system_neutral2_600), 94.0f);
        long r04 = r0(d4.x(context, R.color.system_neutral2_600), 92.0f);
        long x3 = d4.x(context, R.color.system_neutral2_100);
        long r05 = r0(d4.x(context, R.color.system_neutral2_600), 87.0f);
        long x4 = d4.x(context, R.color.system_neutral2_200);
        d4.x(context, R.color.system_neutral2_300);
        long x5 = d4.x(context, R.color.system_neutral2_400);
        long x6 = d4.x(context, R.color.system_neutral2_500);
        d4.x(context, R.color.system_neutral2_600);
        long x7 = d4.x(context, R.color.system_neutral2_700);
        long r06 = r0(d4.x(context, R.color.system_neutral2_600), 24.0f);
        long r07 = r0(d4.x(context, R.color.system_neutral2_600), 22.0f);
        long x8 = d4.x(context, R.color.system_neutral2_800);
        long r08 = r0(d4.x(context, R.color.system_neutral2_600), 17.0f);
        long r09 = r0(d4.x(context, R.color.system_neutral2_600), 12.0f);
        long x9 = d4.x(context, R.color.system_neutral2_900);
        long r010 = r0(d4.x(context, R.color.system_neutral2_600), 6.0f);
        long r011 = r0(d4.x(context, R.color.system_neutral2_600), 4.0f);
        long x10 = d4.x(context, R.color.system_neutral2_1000);
        long x11 = d4.x(context, R.color.system_accent1_0);
        d4.x(context, R.color.system_accent1_10);
        d4.x(context, R.color.system_accent1_50);
        long x12 = d4.x(context, R.color.system_accent1_100);
        long x13 = d4.x(context, R.color.system_accent1_200);
        d4.x(context, R.color.system_accent1_300);
        d4.x(context, R.color.system_accent1_400);
        d4.x(context, R.color.system_accent1_500);
        long x14 = d4.x(context, R.color.system_accent1_600);
        long x15 = d4.x(context, R.color.system_accent1_700);
        long x16 = d4.x(context, R.color.system_accent1_800);
        long x17 = d4.x(context, R.color.system_accent1_900);
        d4.x(context, R.color.system_accent1_1000);
        long x18 = d4.x(context, R.color.system_accent2_0);
        d4.x(context, R.color.system_accent2_10);
        d4.x(context, R.color.system_accent2_50);
        long x19 = d4.x(context, R.color.system_accent2_100);
        long x20 = d4.x(context, R.color.system_accent2_200);
        d4.x(context, R.color.system_accent2_300);
        d4.x(context, R.color.system_accent2_400);
        d4.x(context, R.color.system_accent2_500);
        long x21 = d4.x(context, R.color.system_accent2_600);
        long x22 = d4.x(context, R.color.system_accent2_700);
        long x23 = d4.x(context, R.color.system_accent2_800);
        long x24 = d4.x(context, R.color.system_accent2_900);
        d4.x(context, R.color.system_accent2_1000);
        long x25 = d4.x(context, R.color.system_accent3_0);
        d4.x(context, R.color.system_accent3_10);
        d4.x(context, R.color.system_accent3_50);
        long x26 = d4.x(context, R.color.system_accent3_100);
        long x27 = d4.x(context, R.color.system_accent3_200);
        d4.x(context, R.color.system_accent3_300);
        d4.x(context, R.color.system_accent3_400);
        d4.x(context, R.color.system_accent3_500);
        long x28 = d4.x(context, R.color.system_accent3_600);
        long x29 = d4.x(context, R.color.system_accent3_700);
        long x30 = d4.x(context, R.color.system_accent3_800);
        long x31 = d4.x(context, R.color.system_accent3_900);
        d4.x(context, R.color.system_accent3_1000);
        return new l85(x, r0, r02, x2, r03, r04, x3, r05, x4, x5, x6, x7, r06, r07, x8, r08, r09, x9, r010, r011, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28, x29, x30, x31);
    }

    public static final int v0(uf2 uf2Var) {
        List list = uf2Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((vf2) list.get(i3)).m;
        }
        return (i2 / list.size()) + uf2Var.r;
    }

    public static final boolean w(int i2, int i3) {
        return i2 == i3;
    }

    public static void w0(OutputStream outputStream, long j, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static long x() {
        return j82.a;
    }

    public static void x0(int i2, ByteArrayOutputStream byteArrayOutputStream) {
        w0(byteArrayOutputStream, i2, 2);
    }

    public static long y() {
        return j82.h;
    }

    public static long z() {
        return j82.e;
    }

    @Override // defpackage.nh4
    public int a(int i2) {
        int e0 = e0(i2);
        if (e0 == -1 || e0(e0) == -1) {
            return -1;
        }
        return e0;
    }

    @Override // defpackage.nh4
    public int b(int i2) {
        int k0 = k0(i2);
        if (k0 == -1 || k0(k0) == -1) {
            return -1;
        }
        return k0;
    }

    @Override // defpackage.nh4
    public int c(int i2) {
        return k0(i2);
    }

    @Override // defpackage.nh4
    public int d(int i2) {
        return e0(i2);
    }

    public abstract int e0(int i2);

    public abstract int k0(int i2);
}
