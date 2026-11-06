package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.mytv.dv.R;
import com.github.mytv.dv.model.Aweme;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class eg5 {
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;
    public static hx1 g;
    public static hx1 h;
    public final /* synthetic */ byte a;

    public /* synthetic */ eg5(byte b2) {
        this.a = b2;
    }

    public static void A(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        r(jArr, jArr2, jArr4);
        N(jArr4, jArr3);
    }

    public static final long B() {
        b4 b4Var = f04.I;
        return f04.I.d();
    }

    public static void C(d55 d55Var, p35 p35Var, u55 u55Var, ca2 ca2Var, m55 m55Var, boolean z, td3 td3Var) {
        if (z) {
            int k = td3Var.k(d65.e(d55Var.b));
            String str = u35.a;
            m14 b2 = k < u55Var.a.a.J.length() ? u55Var.b(k) : k != 0 ? u55Var.b(k - 1) : new m14(0.0f, 0.0f, 1.0f, (int) (u35.a(p35Var.b, p35Var.g, p35Var.h) & 4294967295L));
            float f2 = b2.b;
            float f3 = b2.a;
            long M = ca2Var.M((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            m14 g2 = sv2.g((Float.floatToRawIntBits(Float.intBitsToFloat((int) (M & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (M >> 32))) << 32), (Float.floatToRawIntBits(b2.c - f3) << 32) | (Float.floatToRawIntBits(b2.d - f2) & 4294967295L));
            if (j42.c((m55) m55Var.a.b.get(), m55Var)) {
                m55Var.b.h(g2);
            }
        }
    }

    public static boolean D(ViewParent viewParent, ViewGroup viewGroup, float f2, float f3, boolean z) {
        try {
            return viewParent.onNestedFling(viewGroup, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static boolean E(ViewParent viewParent, ViewGroup viewGroup, float f2, float f3) {
        try {
            return viewParent.onNestedPreFling(viewGroup, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static void F(ViewParent viewParent, ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof m93) {
            ((m93) viewParent).f(i, i2, i3, iArr);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(viewGroup, i, i2, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static void G(ViewParent viewParent, ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof n93) {
            ((n93) viewParent).c(viewGroup, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof m93) {
            ((m93) viewParent).a(viewGroup, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(viewGroup, i, i2, i3, i4);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    public static void H(ViewParent viewParent, View view, ViewGroup viewGroup, int i, int i2) {
        if (viewParent instanceof m93) {
            ((m93) viewParent).h(view, viewGroup, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, viewGroup, i);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    public static boolean I(ViewParent viewParent, View view, ViewGroup viewGroup, int i, int i2) {
        if (viewParent instanceof m93) {
            return ((m93) viewParent).g(view, viewGroup, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, viewGroup, i);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    public static void J(ViewParent viewParent, ViewGroup viewGroup, int i) {
        if (viewParent instanceof m93) {
            ((m93) viewParent).e(i, viewGroup);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(viewGroup);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    public static final List K(q84 q84Var) {
        int t = dq2.t(q84Var, TtmlNode.ATTR_ID);
        int t2 = dq2.t(q84Var, "seq");
        int t3 = dq2.t(q84Var, "from");
        int t4 = dq2.t(q84Var, "to");
        mk2 K = p70.K();
        while (q84Var.T()) {
            K.add(new yk1((int) q84Var.getLong(t), (int) q84Var.getLong(t2), q84Var.H(t3), q84Var.H(t4)));
        }
        return o70.j1(p70.D(K));
    }

    public static final n15 L(o84 o84Var, String str, boolean z) {
        q84 Y = o84Var.Y("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int t = dq2.t(Y, "seqno");
            int t2 = dq2.t(Y, CmcdConfiguration.KEY_CONTENT_ID);
            int t3 = dq2.t(Y, "name");
            int t4 = dq2.t(Y, "desc");
            if (t != -1 && t2 != -1 && t3 != -1 && t4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (Y.T()) {
                    if (((int) Y.getLong(t2)) >= 0) {
                        int i = (int) Y.getLong(t);
                        String H = Y.H(t3);
                        String str2 = Y.getLong(t4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), H);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List k1 = o70.k1(linkedHashMap.entrySet(), new xi1((byte) 15));
                ArrayList arrayList = new ArrayList(p70.J(k1, 10));
                Iterator it = k1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List r1 = o70.r1(arrayList);
                List k12 = o70.k1(linkedHashMap2.entrySet(), new xi1((byte) 16));
                ArrayList arrayList2 = new ArrayList(p70.J(k12, 10));
                Iterator it2 = k12.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                n15 n15Var = new n15(str, z, r1, o70.r1(arrayList2));
                mw2.v(Y, null);
                return n15Var;
            }
            mw2.v(Y, null);
            return null;
        } finally {
        }
    }

    public static final g34 M(long j, long j2, long j3, long j4, long j5, js jsVar, float[] fArr) {
        na3 S = ut0.S(jsVar, 2);
        wa2 U = ut0.U(jsVar);
        boolean L = U.L();
        ja3 ja3Var = U.n0;
        if (!L) {
            return null;
        }
        if (ja3Var.d == S) {
            return new g34(j, j2, j3, j4, j5, jsVar, fArr);
        }
        long floatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (j & 4294967295L));
        long j6 = S.K;
        na3 na3Var = ja3Var.d;
        na3Var.getClass();
        long U2 = sv2.U(na3Var.I(S, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L)));
        return new g34(U2, (4294967295L & (((int) (U2 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (U2 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, jsVar, fArr);
    }

    public static void N(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static final void O(RemoteViews remoteViews, ha5 ha5Var, int i, String str, l65 l65Var, int i2) {
        Context context = ha5Var.a;
        if (i2 != Integer.MAX_VALUE) {
            remoteViews.setInt(i, "setMaxLines", i2);
        }
        if (l65Var == null) {
            remoteViews.setTextViewText(i, str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        p65 p65Var = l65Var.b;
        if (p65Var != null) {
            long j = p65Var.a;
            if ((1095216660480L & j) != 4294967296L) {
                s83.t("Only Sp is currently supported for font sizes");
                return;
            }
            remoteViews.setTextViewTextSize(i, 2, p65.c(j));
        }
        ArrayList arrayList = new ArrayList();
        pk1 pk1Var = l65Var.c;
        if (pk1Var != null) {
            short s = pk1Var.a;
            arrayList.add(new TextAppearanceSpan(context, s == 700 ? R.style.Glance_AppWidget_TextAppearance_Bold : s == 500 ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal));
        }
        if (l65Var.d != null) {
            arrayList.add(new TypefaceSpan("Google Sans Flex"));
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            spannableString.setSpan((ParcelableSpan) obj, 0, length, 17);
        }
        remoteViews.setTextViewText(i, spannableString);
        i80 i80Var = l65Var.a;
        if (i80Var instanceof ze1) {
            remoteViews.setTextColor(i, qb.i0(((ze1) i80Var).a));
            return;
        }
        if (i80Var instanceof t44) {
            if (Build.VERSION.SDK_INT >= 31) {
                v34.g(remoteViews, i, "setTextColor", ((t44) i80Var).a);
                return;
            } else {
                remoteViews.setTextColor(i, qb.i0(qb.i(context.getColor(((t44) i80Var).a))));
                return;
            }
        }
        if (!(i80Var instanceof pp0)) {
            Log.w("GlanceAppWidget", "Unexpected text color: " + i80Var);
        } else if (Build.VERSION.SDK_INT < 31) {
            remoteViews.setTextColor(i, qb.i0(((pp0) i80Var).a(context)));
        } else {
            pp0 pp0Var = (pp0) i80Var;
            v34.f(remoteViews, i, "setTextColor", qb.i0(pp0Var.a), qb.i0(pp0Var.b));
        }
    }

    public static void P(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            x9.P(view, charSequence);
            return;
        }
        a95 a95Var = a95.S;
        if (a95Var != null && a95Var.I == view) {
            a95.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a95(view, charSequence);
            return;
        }
        a95 a95Var2 = a95.T;
        if (a95Var2 != null && a95Var2.I == view) {
            a95Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void Q(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        e41.E(4, jArr, jArr3);
        N(jArr3, jArr2);
    }

    public static void R(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        e41.E(4, jArr, jArr3);
        while (true) {
            N(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                e41.E(4, jArr2, jArr3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r2 instanceof defpackage.bx0) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.bc2 S(defpackage.ex0 r2) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = r2 instanceof defpackage.bx0
            if (r2 == 0) goto L18
            goto L26
        Lb:
            java.util.Map r0 = defpackage.mc2.a
            boolean r0 = r2 instanceof defpackage.ax0
            if (r0 == 0) goto L14
            bc2 r2 = defpackage.bc2.EXACT
            return r2
        L14:
            boolean r0 = r2 instanceof defpackage.dx0
            if (r0 == 0) goto L1b
        L18:
            bc2 r2 = defpackage.bc2.WRAP
            return r2
        L1b:
            boolean r0 = r2 instanceof defpackage.cx0
            if (r0 == 0) goto L22
            bc2 r2 = defpackage.bc2.FILL
            return r2
        L22:
            boolean r2 = r2 instanceof defpackage.bx0
            if (r2 == 0) goto L29
        L26:
            bc2 r2 = defpackage.bc2.EXPAND
            return r2
        L29:
            java.lang.String r2 = "After resolution, no other type should be present"
            defpackage.zy.i(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.S(ex0):bc2");
    }

    public static final kc2 T(int i) {
        if (i == 0) {
            return kc2.TOP;
        }
        if (i == 1) {
            return kc2.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return kc2.BOTTOM;
        }
        s83.x(s8.b(i), "unknown vertical alignment ");
        return null;
    }

    public static final cc2 U(int i) {
        if (i == 0) {
            return cc2.START;
        }
        if (i == 1) {
            return cc2.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return cc2.END;
        }
        s83.x(r8.b(i), "unknown horizontal alignment ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(defpackage.q05 r12, defpackage.s35 r13, defpackage.kp3 r14, defpackage.fu r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.V(q05, s35, kp3, fu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.q05 r11, defpackage.s35 r12, defpackage.kp3 r13, int r14, defpackage.fu r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.W(q05, s35, kp3, int, fu):java.lang.Object");
    }

    public static final String X(long j) {
        if (j <= 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        if (i == Calendar.getInstance().get(1)) {
            return i2 + "月" + i3 + "日";
        }
        return i + "年" + i2 + "月" + i3 + "日";
    }

    public static final String Y(long j) {
        if (j <= 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return String.format(Locale.US, "%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 2));
    }

    public static final tn5 Z(long j) {
        if (j <= 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return new tn5(calendar.get(1), calendar.get(2) + 1);
    }

    /* JADX WARN: Type inference failed for: r1v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.ArrayList] */
    public static final void a(int i, long j, fe0 fe0Var, hn1 hn1Var, rq4 rq4Var) {
        Collection collection;
        Object next;
        uj3 uj3Var;
        ?? j0;
        Collection collection2;
        rq4 rq4Var2 = rq4Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(361732211);
        hn1 hn1Var2 = hn1Var;
        int i2 = i | (go1Var.g(rq4Var2) ? 4 : 2) | (go1Var.f(j) ? 32 : 16) | (go1Var.i(hn1Var2) ? 256 : 128);
        if ((i2 & 147) == 146 && go1Var.F()) {
            go1Var.W();
        } else {
            if (rq4Var2 instanceof qq4) {
                collection2 = p70.j0(new v11(j));
            } else {
                boolean z = false;
                if (rq4Var2 instanceof oq4) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        go1Var.d0(291633998);
                        Bundle bundle = (Bundle) go1Var.k(gf0.a);
                        boolean z2 = (i2 & 112) == 32;
                        Object Q = go1Var.Q();
                        if (z2 || Q == de0.a) {
                            Q = new vm2(j, (byte) 2);
                            go1Var.o0(Q);
                        }
                        rm1 rm1Var = (rm1) Q;
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                            int i3 = bundle.getInt("appWidgetMinHeight", 0);
                            int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                            int i5 = bundle.getInt("appWidgetMinWidth", 0);
                            int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                            j0 = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? p70.j0(rm1Var.invoke()) : p70.k0(new v11(vt0.a(i5, i4)), new v11(vt0.a(i6, i3)));
                        } else {
                            j0 = new ArrayList(p70.J(parcelableArrayList, 10));
                            int size = parcelableArrayList.size();
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj = parcelableArrayList.get(i7);
                                i7++;
                                SizeF sizeF = (SizeF) obj;
                                j0.add(new v11(vt0.a(sizeF.getWidth(), sizeF.getHeight())));
                            }
                        }
                        go1Var.q(false);
                        collection2 = j0;
                    } else {
                        go1Var.d0(291738344);
                        ArrayList v = d4.v((Bundle) go1Var.k(gf0.a));
                        boolean isEmpty = v.isEmpty();
                        Collection collection3 = v;
                        if (isEmpty) {
                            collection3 = p70.j0(new v11(j));
                        }
                        go1Var.q(false);
                        collection2 = collection3;
                    }
                } else {
                    if (!(rq4Var2 instanceof pq4)) {
                        s83.v();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        go1Var.d0(292006649);
                        go1Var.q(false);
                        collection2 = ((pq4) rq4Var2).a;
                    } else {
                        go1Var.d0(292075221);
                        Set set = ((pq4) rq4Var2).a;
                        v11 v11Var = (v11) o70.k1(set, j42.o(new t5((byte) 14), new t5((byte) 15))).get(0);
                        long j2 = v11Var.a;
                        ArrayList v2 = d4.v((Bundle) go1Var.k(gf0.a));
                        ArrayList arrayList = new ArrayList(p70.J(v2, 10));
                        int size2 = v2.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj2 = v2.get(i8);
                            i8++;
                            boolean z3 = z;
                            long j3 = ((v11) obj2).a;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                v11 v11Var2 = (v11) it.next();
                                long j4 = j3;
                                long j5 = v11Var2.a;
                                if (((float) Math.ceil(v11.b(j4))) + 1.0f <= v11.b(j5) || ((float) Math.ceil(v11.a(j4))) + 1.0f <= v11.a(j5)) {
                                    uj3Var = null;
                                } else {
                                    float b2 = v11.b(j4) - v11.b(j5);
                                    float a = v11.a(j4) - v11.a(j5);
                                    uj3Var = new uj3(v11Var2, Float.valueOf((a * a) + (b2 * b2)));
                                }
                                if (uj3Var != null) {
                                    arrayList2.add(uj3Var);
                                }
                                j3 = j4;
                            }
                            Iterator it2 = arrayList2.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    float floatValue = ((Number) ((uj3) next).J).floatValue();
                                    while (true) {
                                        Object next2 = it2.next();
                                        Iterator it3 = it2;
                                        float floatValue2 = ((Number) ((uj3) next2).J).floatValue();
                                        if (Float.compare(floatValue, floatValue2) > 0) {
                                            floatValue = floatValue2;
                                            next = next2;
                                        }
                                        if (!it3.hasNext()) {
                                            break;
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                }
                            } else {
                                next = null;
                            }
                            uj3 uj3Var2 = (uj3) next;
                            v11 v11Var3 = uj3Var2 != null ? (v11) uj3Var2.I : null;
                            arrayList.add(new v11(v11Var3 != null ? v11Var3.a : j2));
                            z = z3;
                        }
                        boolean z4 = z;
                        if (arrayList.isEmpty()) {
                            v11[] v11VarArr = new v11[2];
                            v11VarArr[z4 ? 1 : 0] = v11Var;
                            v11VarArr[1] = v11Var;
                            collection = p70.k0(v11VarArr);
                        } else {
                            collection = arrayList;
                        }
                        go1Var.q(z4);
                        collection2 = collection;
                    }
                }
            }
            List P0 = o70.P0(collection2);
            ArrayList arrayList3 = new ArrayList(p70.J(P0, 10));
            Iterator it4 = P0.iterator();
            while (it4.hasNext()) {
                b(((i2 << 3) & 112) | (i2 & 896), ((v11) it4.next()).a, go1Var, hn1Var2, rq4Var2);
                arrayList3.add(wd5.a);
                hn1Var2 = hn1Var;
                rq4Var2 = rq4Var;
            }
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new kq4(i, j, hn1Var, rq4Var);
        }
    }

    public static final void b(int i, long j, fe0 fe0Var, hn1 hn1Var, rq4 rq4Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-771692794);
        int i2 = (go1Var.f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(rq4Var) : go1Var.i(rq4Var) ? 32 : 16;
        }
        if (((i2 | (go1Var.i(hn1Var) ? 256 : 128)) & 147) == 146 && go1Var.F()) {
            go1Var.W();
        } else {
            mw2.b(ff0.a.a(new v11(j)), p70.u0(-367769018, new kq4(hn1Var, j, rq4Var), go1Var), go1Var, 56);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new j30(i, j, hn1Var, rq4Var);
        }
    }

    public static final void c(lq1 lq1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1380468206);
        if ((((go1Var.g(lq1Var) ? 4 : 2) | i) & 3) == 2 && go1Var.F()) {
            go1Var.W();
        } else {
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = xt4.I;
                go1Var.o0(Q);
            }
            byte b2 = 0;
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
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
            qi4.k(go1Var, new fa4((byte) 21), lq1Var);
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(lq1Var, i, (byte) 15);
        }
    }

    public static final void d(boolean z, s44 s44Var, u45 u45Var, fe0 fe0Var, int i) {
        int i2;
        float f2;
        boolean i3;
        Object Q;
        v55 d2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1344558920);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.e(s44Var.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(u45Var) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean g2 = (i4 == 4) | go1Var.g(u45Var);
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (g2 || Q2 == jpVar) {
                Q2 = new r45(u45Var, z);
                go1Var.o0(Q2);
            }
            s35 s35Var = (s35) Q2;
            boolean i5 = (i4 == 4) | go1Var.i(u45Var);
            Object Q3 = go1Var.Q();
            if (i5 || Q3 == jpVar) {
                Q3 = new v45(u45Var, z);
                go1Var.o0(Q3);
            }
            vd3 vd3Var = (vd3) Q3;
            boolean g3 = d65.g(u45Var.l().b);
            d55 l = u45Var.l();
            int i6 = (int) (z ? l.b >> 32 : l.b & 4294967295L);
            oh2 oh2Var = u45Var.d;
            if (oh2Var != null && (d2 = oh2Var.d()) != null) {
                u55 u55Var = d2.a;
                if (i6 >= 0) {
                    t55 t55Var = u55Var.a;
                    w23 w23Var = u55Var.b;
                    if (t55Var.a.J.length() != 0) {
                        int min = Math.min(w23Var.d(i6), Math.min(w23Var.b - 1, w23Var.f - 1));
                        if (i6 <= w23Var.c(min, false)) {
                            w23Var.m(min);
                            ArrayList arrayList = w23Var.h;
                            yj3 yj3Var = (yj3) arrayList.get(dq2.G(min, arrayList));
                            f2 = yj3Var.a.d.h(min - yj3Var.d);
                            i3 = go1Var.i(s35Var);
                            Q = go1Var.Q();
                            if (!i3 || Q == jpVar) {
                                Q = new bi4(s35Var, b2);
                                go1Var.o0(Q);
                            }
                            c5.i(vd3Var, z, s44Var, g3, 0L, f2, new l05(s35Var, null, null, (PointerInputEventHandler) Q, 6), go1Var, (i2 << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
                        }
                    }
                }
            }
            f2 = 0.0f;
            i3 = go1Var.i(s35Var);
            Q = go1Var.Q();
            if (!i3) {
            }
            Q = new bi4(s35Var, b2);
            go1Var.o0(Q);
            c5.i(vd3Var, z, s44Var, g3, 0L, f2, new l05(s35Var, null, null, (PointerInputEventHandler) Q, 6), go1Var, (i2 << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rv0(z, (Object) s44Var, (Object) u45Var, i, (byte) 4);
        }
    }

    public static final long e(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.q05 r6, defpackage.fu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.vh4
            if (r0 == 0) goto L13
            r0 = r7
            vh4 r0 = (defpackage.vh4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            vh4 r0 = new vh4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            q05 r6 = r0.I
            defpackage.mu0.V(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.mu0.V(r7)
        L31:
            r0.I = r6
            r0.K = r2
            lp3 r7 = defpackage.lp3.J
            java.lang.Object r7 = r6.b(r7, r0)
            el0 r1 = defpackage.el0.I
            if (r7 != r1) goto L40
            return r1
        L40:
            kp3 r7 = (defpackage.kp3) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            rp3 r5 = (defpackage.rp3) r5
            boolean r5 = defpackage.dq2.l(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.g(q05, fu):java.lang.Object");
    }

    public static final long h(Aweme aweme, Map map) {
        aweme.getClass();
        map.getClass();
        Long l = (Long) map.get(aweme.getAwemeId());
        if (l != null) {
            if (l.longValue() <= 0) {
                l = null;
            }
            if (l != null) {
                return l.longValue();
            }
        }
        return aweme.getCreateTime();
    }

    public static void i(long j, long j2) {
        if (j <= j2) {
            return;
        }
        StringBuilder A = hf1.A(j, "corrupted stream - out of bounds length found: ", " > ");
        A.append(j2);
        throw new h0(A.toString(), (byte) 0);
    }

    public static final ic2 j(k71 k71Var) {
        jc2 jc2Var;
        ac2 ac2Var;
        hc2 o = ic2.o();
        if (k71Var instanceof l71) {
            jc2Var = jc2.BOX;
        } else if (k71Var instanceof m71) {
            jc2Var = jc2.BUTTON;
        } else if (k71Var instanceof r71) {
            jc2Var = lq2.P(((r71) k71Var).c) ? jc2.RADIO_ROW : jc2.ROW;
        } else if (k71Var instanceof n71) {
            jc2Var = lq2.P(((n71) k71Var).c) ? jc2.RADIO_COLUMN : jc2.COLUMN;
        } else if (k71Var instanceof u71) {
            jc2Var = jc2.TEXT;
        } else if (k71Var instanceof t71) {
            jc2Var = jc2.SPACER;
        } else if (k71Var instanceof p71) {
            jc2Var = jc2.IMAGE;
        } else if (k71Var instanceof q71) {
            jc2Var = jc2.LINEAR_PROGRESS_INDICATOR;
        } else if (k71Var instanceof y34) {
            jc2Var = jc2.REMOTE_VIEWS_ROOT;
        } else {
            if (!(k71Var instanceof s71)) {
                j0.l(k71Var.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            jc2Var = jc2.SIZE_BOX;
        }
        o.d();
        ((ic2) o.J).x(jc2Var);
        yt5 yt5Var = (yt5) k71Var.b().foldIn(null, cx1.i0);
        ex0 ex0Var = dx0.a;
        bc2 S = S(yt5Var != null ? yt5Var.a : ex0Var);
        o.d();
        ((ic2) o.J).z(S);
        dt1 dt1Var = (dt1) k71Var.b().foldIn(null, cx1.j0);
        if (dt1Var != null) {
            ex0Var = dt1Var.a;
        }
        bc2 S2 = S(ex0Var);
        o.d();
        ((ic2) o.J).t(S2);
        int i = 0;
        boolean z = k71Var.b().foldIn(null, cx1.g0) != null;
        o.d();
        ((ic2) o.J).p(z);
        if (k71Var.b().foldIn(null, cx1.h0) != null) {
            o.d();
            ((ic2) o.J).v();
        }
        if (k71Var instanceof p71) {
            p71 p71Var = (p71) k71Var;
            int i2 = p71Var.e;
            if (i2 == 1) {
                ac2Var = ac2.FIT;
            } else if (i2 == 0) {
                ac2Var = ac2.CROP;
            } else {
                if (i2 != 2) {
                    s83.x(mi0.a(p71Var.e), "Unknown content scale ");
                    return null;
                }
                ac2Var = ac2.FILL_BOUNDS;
            }
            o.d();
            ((ic2) o.J).w(ac2Var);
            boolean z2 = !c21.C(p71Var);
            o.d();
            ((ic2) o.J).s(z2);
            boolean z3 = p71Var.c != null;
            o.d();
            ((ic2) o.J).r(z3);
            boolean z4 = p71Var.d != null;
            o.d();
            ((ic2) o.J).q(z4);
        } else if (k71Var instanceof n71) {
            cc2 U = U(((n71) k71Var).e);
            o.d();
            ((ic2) o.J).u(U);
        } else if (k71Var instanceof r71) {
            kc2 T = T(((r71) k71Var).e);
            o.d();
            ((ic2) o.J).y(T);
        } else if (k71Var instanceof l71) {
            l71 l71Var = (l71) k71Var;
            cc2 U2 = U(l71Var.d.a);
            o.d();
            ((ic2) o.J).u(U2);
            kc2 T2 = T(l71Var.d.b);
            o.d();
            ((ic2) o.J).y(T2);
        }
        if (k71Var instanceof v71) {
            ArrayList arrayList = ((v71) k71Var).b;
            ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(j((k71) obj));
            }
            o.d();
            ((ic2) o.J).m(arrayList2);
        }
        return (ic2) o.b();
    }

    public static int l(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    public static final boolean n(int i, int i2) {
        return i == i2;
    }

    public static int o(int i) {
        return i & 15;
    }

    public static final hx1 p() {
        hx1 hx1Var = h;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Update", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(21.0f, 10.12f);
        epVar.v(-6.78f);
        epVar.y(2.74f, -2.82f);
        epVar.r(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        epVar.r(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f);
        epVar.D(7.15f, 2.71f, 9.88f, 0.0f);
        epVar.q(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        epVar.v(2.0f);
        epVar.r(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        epVar.r(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f);
        epVar.r(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        epVar.D(9.14f, -3.47f, 12.65f, 0.0f);
        epVar.x(21.0f, 3.0f);
        epVar.L(10.12f);
        epVar.p();
        epVar.z(12.5f, 8.0f);
        epVar.M(4.25f);
        epVar.y(3.5f, 2.08f);
        epVar.y(-0.72f, 1.21f);
        epVar.x(11.0f, 13.0f);
        epVar.L(8.0f);
        epVar.u(12.5f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        h = b2;
        return b2;
    }

    public static void q(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        q(jArr, jArr4);
        q(jArr2, jArr5);
        long[] jArr6 = new long[8];
        s(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        s(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        s(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        s(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        s(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        s(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        s(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        s(jArr6, j, j3, jArr7, 0);
        s(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void s(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr2[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr2[i5];
    }

    public static final boolean t(kp3 kp3Var) {
        return kp3Var.c == 2;
    }

    public static boolean u(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean v(u45 u45Var, boolean z) {
        ca2 c2;
        oh2 oh2Var = u45Var.d;
        if (oh2Var == null || (c2 = oh2Var.c()) == null) {
            return false;
        }
        m14 n0 = kb4.n0(c2);
        long j = u45Var.j(z);
        float f2 = n0.a;
        float f3 = n0.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > intBitsToFloat || intBitsToFloat > f3) {
            return false;
        }
        float f4 = n0.b;
        float f5 = n0.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= intBitsToFloat2 && intBitsToFloat2 <= f5;
    }

    public static final String w(int i) {
        return hf1.u(i, "appWidgetLayout-");
    }

    public static final zm4 x(zm4 zm4Var, zm4 zm4Var2, float f2) {
        zm4Var.getClass();
        zm4Var2.getClass();
        float G = vt0.G(t11.a(0L), t11.a(0L), f2);
        float G2 = vt0.G(t11.b(0L), t11.b(0L), f2);
        Float.floatToRawIntBits(G);
        Float.floatToRawIntBits(G2);
        qb.T(0L, 0L, f2);
        throw null;
    }

    public static final void y(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:36:0x004f, B:37:0x00b5, B:39:0x00bd, B:41:0x00c9, B:43:0x00d5, B:63:0x009b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.q05 r17, defpackage.zp4 r18, defpackage.yv r19, defpackage.kp3 r20, defpackage.fu r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.z(q05, zp4, yv, kp3, fu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r11 + r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.String r9, byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.k(java.lang.String, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 < r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (r1 + 4294967296L));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m(java.lang.String r5) {
        /*
            r4 = this;
            int r4 = r5.length()
            r0 = 0
        L5:
            if (r0 >= r4) goto L12
            char r1 = r5.charAt(r0)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L12
            int r0 = r0 + 1
            goto L5
        L12:
            r1 = r4
        L13:
            if (r0 >= r4) goto L33
            char r2 = r5.charAt(r0)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L25
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L13
        L25:
            int r5 = defpackage.mg5.a(r0, r5)     // Catch: defpackage.jg5 -> L2b
            int r1 = r1 + r5
            goto L33
        L2b:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r5.getBytes(r4)
            int r4 = r4.length
            return r4
        L33:
            if (r1 < r4) goto L36
            return r1
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            long r0 = (long) r1
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "UTF-8 length does not fit in int: "
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg5.m(java.lang.String):int");
    }
}
