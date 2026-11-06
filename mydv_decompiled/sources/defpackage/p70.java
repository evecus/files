package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class p70 {
    public static final bj4 B;
    public static final bj4 C;
    public static final bj4 D;
    public static final ub5 F;
    public static final ub5 G;
    public static final ub5 H;
    public static final ub5 L;
    public static final ub5 M;
    public static final q4 i;
    public static final se3 n;
    public static final qe p;
    public static final ep q;
    public static final ep r;
    public static final ep s;
    public static final ep t;
    public static final ep u;
    public static final ep x;
    public static final ep y;
    public static final dj a = new dj(Float.POSITIVE_INFINITY);
    public static final ej b = new ej(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final fj c = new fj(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final gj d = new gj(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final dj e = new dj(Float.NEGATIVE_INFINITY);
    public static final ej f = new ej(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final fj g = new fj(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final gj h = new gj(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final double[][] j = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] k = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final double[] l = {95.047d, 100.0d, 108.883d};
    public static final Object m = new Object();
    public static final sx1 o = new sx1(false);
    public static final i91 v = new i91(false);
    public static final i91 w = new i91(true);
    public static final StackTraceElement[] z = new StackTraceElement[0];
    public static final s64 A = new s64(new r64());
    public static final z65 E = new z65(0, new long[0], new Object[0]);
    public static final ub5 I = new ub5(new hf5(6), new hf5(7));
    public static final ub5 J = new ub5(new hf5(8), new hf5(9));
    public static final ub5 K = new ub5(new hf5(10), new hf5(11));
    public static final ub5 N = new ub5(new hf5(16), new hf5(17));

    static {
        byte b2 = 12;
        i = new q4(b2);
        byte b3 = 3;
        byte b4 = 1;
        n = new se3(b4);
        p = new qe(b3);
        byte b5 = 25;
        q = new ep("COMPLETING_ALREADY", b5);
        r = new ep("COMPLETING_WAITING_CHILDREN", b5);
        s = new ep("COMPLETING_RETRY", b5);
        t = new ep("TOO_LATE_TO_CANCEL", b5);
        u = new ep("SEALED", b5);
        x = new ep("NULL", b5);
        y = new ep("UNINITIALIZED", b5);
        byte b6 = 13;
        B = new bj4("TestTagsAsResourceId", false, new yi4(b6));
        byte b7 = 5;
        C = new bj4("AccessibilityClassName", true, new yi4(b7));
        byte b8 = 14;
        D = new bj4("CredentialRequest", false, new yi4(b8));
        F = new ub5(new hf5(b4), new hf5((byte) 18));
        G = new ub5(new hf5((byte) 2), new hf5(b3));
        H = new ub5(new hf5((byte) 4), new hf5(b7));
        L = new ub5(new hf5(b2), new hf5(b6));
        M = new ub5(new hf5(b8), new hf5((byte) 15));
    }

    public static void A(int i2, Object obj) {
        if (obj == null || Y(i2, obj)) {
            return;
        }
        z0(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void A0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int B(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        q0(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int p2 = j42.p((Comparable) arrayList.get(i4), comparable);
            if (p2 < 0) {
                i3 = i4 + 1;
            } else {
                if (p2 <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final Object B0(Object obj) {
        zy1 zy1Var = obj instanceof zy1 ? (zy1) obj : null;
        return zy1Var != null ? zy1Var.a : obj;
    }

    public static final int C(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final zl3 C0(ay3[] ay3VarArr, am3 am3Var, am3 am3Var2) {
        zl3 zl3Var = zl3.L;
        yl3 yl3Var = new yl3(zl3Var);
        yl3Var.O = zl3Var;
        for (ay3 ay3Var : ay3VarArr) {
            xx3 xx3Var = ay3Var.a;
            if (ay3Var.g || !((zl3) am3Var).containsKey(xx3Var)) {
                yl3Var.put(xx3Var, xx3Var.d(ay3Var, (dh5) ((zl3) am3Var2).get(xx3Var)));
            }
        }
        return yl3Var.build();
    }

    public static mk2 D(mk2 mk2Var) {
        mk2Var.j();
        mk2Var.K = true;
        return mk2Var.J > 0 ? mk2Var : mk2.L;
    }

    public static final Object D0(tk0 tk0Var, hn1 hn1Var, fj0 fj0Var) {
        Unsafe unsafe;
        long j2;
        tk0 context = fj0Var.getContext();
        tk0 plus = !((Boolean) tk0Var.fold(Boolean.FALSE, new sg((byte) 18))).booleanValue() ? context.plus(tk0Var) : qb.G(context, tk0Var, false);
        vt0.p(plus);
        if (plus == context) {
            ya4 ya4Var = new ya4(fj0Var, plus);
            return oh4.s(ya4Var, true, ya4Var, hn1Var);
        }
        q8 q8Var = q8.i0;
        if (j42.c(plus.get(q8Var), context.get(q8Var))) {
            qd5 qd5Var = new qd5(fj0Var, plus);
            tk0 tk0Var2 = qd5Var.L;
            Object l0 = j42.l0(tk0Var2, null);
            try {
                return oh4.s(qd5Var, true, qd5Var, hn1Var);
            } finally {
                j42.Y(tk0Var2, l0);
            }
        }
        ox0 ox0Var = new ox0(fj0Var, plus);
        try {
            qb.c0(mu0.G(mu0.n(ox0Var, ox0Var, hn1Var)), wd5.a);
            do {
                unsafe = gq.a;
                j2 = ox0.N;
                int intVolatile = unsafe.getIntVolatile(ox0Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        zy.i("Already suspended");
                        return null;
                    }
                    Object B0 = B0(ox0Var.H());
                    if (B0 instanceof ub0) {
                        throw ((ub0) B0).a;
                    }
                    return B0;
                }
            } while (!unsafe.compareAndSwapInt(ox0Var, j2, 0, 1));
            return el0.I;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof mx0) {
                th2 = ((mx0) th2).I;
            }
            ox0Var.resumeWith(new g54(th2));
            throw th2;
        }
    }

    public static void E(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            zl1.e(i4, hf1.D("startIndex: ", i2, ", endIndex: ", i3, ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            s83.t(r7.x(i2, i3, "startIndex: ", " > endIndex: "));
        }
    }

    public static double[] E0(int i2) {
        return mu0.M(new double[]{i0((i2 >> 16) & 255), i0((i2 >> 8) & 255), i0(i2 & 255)}, j);
    }

    public static void F(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            zl1.e(i4, hf1.D("fromIndex: ", i2, ", toIndex: ", i3, ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            s83.t(r7.x(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static double F0(double d2) {
        return e0((d2 + 16.0d) / 116.0d) * 100.0d;
    }

    public static l13 G(l13 l13Var, final cw4 cw4Var, final long j2, boolean z2, Float f2, int i2) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        final boolean z3 = z2;
        if ((i2 & 8) != 0) {
            f2 = null;
        }
        final Float f3 = f2;
        l13Var.getClass();
        cw4Var.getClass();
        return qb.O(l13Var, new tm1() { // from class: g60
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                hw hwVar;
                n54 n54Var = (n54) obj;
                n54Var.getClass();
                long j3 = ((x70) cw4.this.getValue()).a;
                if (!z3 || zc5.a(j3, j2)) {
                    hwVar = null;
                } else {
                    Float f4 = f3;
                    if (f4 != null) {
                        j3 = x70.c(j3, f4.floatValue());
                    }
                    hwVar = new hw(j3, 5);
                }
                n54Var.g(hwVar);
                return wd5.a;
            }
        });
    }

    public static l13 H(l13 l13Var, cw4 cw4Var) {
        aj5 aj5Var = mw2.j;
        l13Var.getClass();
        cw4Var.getClass();
        return j42.t(l13Var, new be(cw4Var, aj5Var, (byte) 7));
    }

    public static final void I(sr4 sr4Var, ArrayList arrayList, int i2) {
        boolean l2 = sr4Var.l(i2);
        int[] iArr = sr4Var.b;
        if (l2) {
            arrayList.add(sr4Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            I(sr4Var, arrayList, i4);
        }
    }

    public static int J(Iterable iterable, int i2) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static mk2 K() {
        return new mk2(10);
    }

    public static final int L(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static int M(double d2) {
        double d3 = d2 / 100.0d;
        return (int) ut0.p(Math.rint((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    public static final boolean N(si4 si4Var) {
        ki4 k2 = si4Var.k();
        return !k2.I.c(zi4.j);
    }

    public static final int O(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int m2 = j42.m(((b52) list.get(i4)).b, i2);
            if (m2 < 0) {
                i3 = i4 + 1;
            } else {
                if (m2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static ArrayList P(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u70.I0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static Object Q(rk0 rk0Var, Object obj, hn1 hn1Var) {
        hn1Var.getClass();
        return hn1Var.invoke(obj, rk0Var);
    }

    public static rk0 R(rk0 rk0Var, sk0 sk0Var) {
        sk0Var.getClass();
        if (j42.c(rk0Var.getKey(), sk0Var)) {
            return rk0Var;
        }
        return null;
    }

    public static u22 S(Collection collection) {
        collection.getClass();
        return new u22(0, collection.size() - 1, 1);
    }

    public static final boolean T(si4 si4Var) {
        Object g2 = si4Var.d.I.g(zi4.L);
        if (g2 == null) {
            g2 = null;
        }
        h85 h85Var = (h85) g2;
        n43 n43Var = si4Var.d.I;
        Object g3 = n43Var.g(zi4.z);
        if (g3 == null) {
            g3 = null;
        }
        t64 t64Var = (t64) g3;
        boolean z2 = h85Var != null;
        Object g4 = n43Var.g(zi4.K);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (t64Var != null && t64Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String U(si4 si4Var, Resources resources) {
        ki4 ki4Var = si4Var.d;
        ki4 ki4Var2 = si4Var.d;
        Object g2 = ki4Var.I.g(zi4.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        n43 n43Var = ki4Var2.I;
        Object g3 = n43Var.g(zi4.L);
        if (g3 == null) {
            g3 = null;
        }
        h85 h85Var = (h85) g3;
        Object g4 = n43Var.g(zi4.z);
        if (g4 == null) {
            g4 = null;
        }
        t64 t64Var = (t64) g4;
        if (h85Var != null) {
            int ordinal = h85Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        s83.v();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (t64Var != null && t64Var.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (t64Var != null && t64Var.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = n43Var.g(zi4.K);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((t64Var == null || t64Var.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = n43Var.g(zi4.c);
        if (g6 == null) {
            g6 = null;
        }
        hx3 hx3Var = (hx3) g6;
        if (hx3Var != null) {
            if (hx3Var != hx3.d) {
                if (g2 == null) {
                    z60 z60Var = hx3Var.b;
                    float f2 = z60Var.b;
                    float f3 = z60Var.a;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (hx3Var.a - f3) / (z60Var.b - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(f4 == 0.0f ? 0 : f4 == 1.0f ? 100 : ut0.r(Math.round(f4 * 100.0f), 1, 99)));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        bj4 bj4Var = zi4.G;
        if (n43Var.c(bj4Var)) {
            n43 n43Var2 = new si4(si4Var.a, true, si4Var.c, ki4Var2).k().I;
            Object g7 = n43Var2.g(zi4.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = n43Var2.g(zi4.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = n43Var2.g(bj4Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final oj V(si4 si4Var) {
        Object g2 = si4Var.d.I.g(zi4.G);
        if (g2 == null) {
            g2 = null;
        }
        oj ojVar = (oj) g2;
        Object g3 = si4Var.d.I.g(zi4.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return ojVar == null ? list != null ? (oj) o70.U0(list) : null : ojVar;
    }

    public static final Object W(Object obj, Object obj2, Object obj3) {
        f62 f62Var = obj instanceof f62 ? (f62) obj : null;
        if (f62Var == null) {
            return null;
        }
        if (f62Var.a().equals(obj2) && j42.c(f62Var.b(), obj3)) {
            return obj;
        }
        Object W = W(f62Var.a(), obj2, obj3);
        return W == null ? W(f62Var.b(), obj2, obj3) : W;
    }

    public static int X(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static boolean Y(int i2, Object obj) {
        if (obj instanceof dn1) {
            if ((obj instanceof rn1 ? ((rn1) obj).getArity() : obj instanceof rm1 ? 0 : obj instanceof tm1 ? 1 : obj instanceof hn1 ? 2 : obj instanceof in1 ? 3 : obj instanceof jn1 ? 4 : obj instanceof kn1 ? 5 : obj instanceof ln1 ? 6 : obj instanceof mn1 ? 7 : obj instanceof nn1 ? 8 : obj instanceof on1 ? 9 : obj instanceof sm1 ? 10 : obj instanceof um1 ? 11 : obj instanceof wm1 ? 13 : obj instanceof xm1 ? 14 : obj instanceof ym1 ? 15 : obj instanceof zm1 ? 16 : obj instanceof an1 ? 17 : obj instanceof bn1 ? 18 : obj instanceof cn1 ? 19 : obj instanceof en1 ? 20 : obj instanceof fn1 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Z(si4 si4Var, Resources resources) {
        if (mw2.H(si4Var)) {
            return false;
        }
        ki4 ki4Var = si4Var.d;
        if (ki4Var.K) {
            return true;
        }
        Object g2 = ki4Var.I.g(zi4.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !((list != null ? (String) o70.U0(list) : null) == null && V(si4Var) == null && U(si4Var, resources) == null && !T(si4Var)) && b0(si4Var);
    }

    public static bh a(float f2) {
        return new bh(Float.valueOf(f2), F, Float.valueOf(0.01f), 8);
    }

    public static final boolean a0(go1 go1Var) {
        return (((Configuration) go1Var.k(rb.a)).uiMode & 48) == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20, types: [tc0] */
    public static final void b(ea5 ea5Var, tm1 tm1Var, l13 l13Var, ta1 ta1Var, bc1 bc1Var, hn1 hn1Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        tc0 tc0Var2;
        int i3;
        int i4;
        boolean z2;
        tc0 tc0Var3;
        aa1 y0;
        tc0 tc0Var4 = tc0Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1310802509);
        int i5 = (i2 & 6) == 0 ? (go1Var.g(ea5Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= go1Var.i(tm1Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= go1Var.g(ta1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= go1Var.g(bc1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= go1Var.i(hn1Var) ? 131072 : 65536;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= go1Var.i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= go1Var.i(tc0Var4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if (go1Var.T(i6 & 1, (38347923 & i6) != 38347922)) {
            jk3 jk3Var = ea5Var.e;
            jk3 jk3Var2 = ea5Var.d;
            ss4 ss4Var = ea5Var.a;
            Object value = jk3Var.getValue();
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                i3 = i6;
                Q2 = new li(t43Var, (byte) 0);
                go1Var.o0(Q2);
            } else {
                i3 = i6;
            }
            int i7 = i3 & 14;
            int i8 = i7 | 48;
            ma1.a(ea5Var, (rm1) Q2, go1Var, i8);
            if (value != null && ((Boolean) tm1Var.invoke(value)).booleanValue()) {
                t43Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) tm1Var.invoke(jk3Var2.getValue())).booleanValue() || ((Boolean) tm1Var.invoke(ss4Var.d())).booleanValue() || ((value != null && ((Boolean) tm1Var.invoke(value)).booleanValue()) || ((((Boolean) t43Var.getValue()).booleanValue() && !j42.c(ss4Var.d(), jk3Var2.getValue())) || ea5Var.i() || ea5Var.e()))) {
                go1Var.d0(-273709037);
                int i9 = i8 & 14;
                boolean z3 = ((i9 ^ 6) > 4 && go1Var.g(ea5Var)) || (i8 & 6) == 4;
                Object Q3 = go1Var.Q();
                if (z3 || Q3 == jpVar) {
                    Q3 = ss4Var.d();
                    go1Var.o0(Q3);
                }
                if (ea5Var.i()) {
                    Q3 = ss4Var.d();
                }
                go1Var.d0(2016262395);
                aa1 y02 = y0(ea5Var, tm1Var, Q3, go1Var);
                go1Var.q(false);
                Object value2 = jk3Var2.getValue();
                go1Var.d0(2016262395);
                aa1 y03 = y0(ea5Var, tm1Var, value2, go1Var);
                go1Var.q(false);
                int i10 = i9 | 3072;
                int i11 = (i10 & 14) ^ 6;
                boolean z4 = (i11 > 4 && go1Var.g(ea5Var)) || (i10 & 6) == 4;
                Object Q4 = go1Var.Q();
                if (z4 || Q4 == jpVar) {
                    i4 = i10;
                    Q4 = new ea5(new z43(y02), ea5Var, r7.B(ea5Var.c, " > EnterExitTransition"));
                    go1Var.o0(Q4);
                } else {
                    i4 = i10;
                }
                ea5 ea5Var2 = (ea5) Q4;
                boolean g2 = ((i11 > 4 && go1Var.g(ea5Var)) || (i4 & 6) == 4) | go1Var.g(ea5Var2);
                Object Q5 = go1Var.Q();
                byte b2 = 21;
                if (g2 || Q5 == jpVar) {
                    Q5 = new m1(ea5Var, ea5Var2, b2);
                    go1Var.o0(Q5);
                }
                mw2.e(ea5Var2, (tm1) Q5, go1Var);
                if (ea5Var.i()) {
                    ea5Var2.m(y02, y03);
                } else {
                    ea5Var2.s(y03);
                    ea5Var2.l.setValue(Boolean.FALSE);
                }
                if (ea5Var.i()) {
                    go1Var.d0(782538635);
                    go1Var.q(false);
                } else {
                    go1Var.d0(782386797);
                    Object value3 = ea5Var.e.getValue();
                    if (value3 == null) {
                        go1Var.d0(782437481);
                        go1Var.q(false);
                        y0 = null;
                    } else {
                        go1Var.d0(782437482);
                        go1Var.d0(2016262395);
                        y0 = y0(ea5Var, tm1Var, value3, go1Var);
                        go1Var.q(false);
                        go1Var.q(false);
                    }
                    ss4 ss4Var2 = ea5Var2.a;
                    jk3 jk3Var3 = ea5Var2.d;
                    jk3 jk3Var4 = ea5Var2.e;
                    Object value4 = jk3Var4.getValue();
                    boolean z5 = value4 != null && y0 == null && j42.c(jk3Var3.getValue(), ss4Var2.d());
                    jk3Var4.setValue(y0);
                    if (z5) {
                        ea5Var2.f.setValue(new aa5(value4, jk3Var3.getValue()));
                        ss4Var2.g(value4);
                        if (ea5Var2.h.h() == Long.MIN_VALUE) {
                            ea5Var2.q(true);
                        }
                        gt4 gt4Var = ea5Var2.j;
                        int size = gt4Var.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            ((ba5) gt4Var.get(i12)).P.i(-2.0f);
                        }
                    }
                    go1Var.q(false);
                }
                ta1 k2 = ma1.k(ea5Var2, ta1Var, go1Var, (i3 >> 6) & 112);
                jk3 jk3Var5 = ea5Var2.d;
                ss4 ss4Var3 = ea5Var2.a;
                bc1 l2 = ma1.l(ea5Var2, bc1Var, go1Var, (i3 >> 9) & 112);
                t43 x2 = ad4.x(hn1Var, go1Var);
                Object invoke = hn1Var.invoke(ss4Var3.d(), jk3Var5.getValue());
                boolean g3 = go1Var.g(ea5Var2) | go1Var.g(x2);
                Object Q6 = go1Var.Q();
                if (g3 || Q6 == jpVar) {
                    Q6 = new ni(ea5Var2, x2, null, (byte) 0);
                    go1Var.o0(Q6);
                }
                t43 n2 = ui4.n(go1Var, (hn1) Q6, invoke);
                Object d2 = ss4Var3.d();
                aa1 aa1Var = aa1.K;
                if (d2 == aa1Var && jk3Var5.getValue() == aa1Var && ((Boolean) n2.getValue()).booleanValue()) {
                    go1Var.d0(-270520625);
                    go1Var.q(false);
                    tc0Var3 = tc0Var;
                    z2 = false;
                } else {
                    go1Var.d0(-272022668);
                    boolean z6 = i7 == 4;
                    Object Q7 = go1Var.Q();
                    if (z6 || Q7 == jpVar) {
                        Q7 = new vi(ea5Var2);
                        go1Var.o0(Q7);
                    }
                    vi viVar = (vi) Q7;
                    z2 = false;
                    l13 b3 = ma1.b(ea5Var2, k2, l2, viVar.c, "Built-in", go1Var, 1575936, 8);
                    go1Var.d0(-1255657861);
                    go1Var.q(false);
                    l13 then = l13Var.then(b3.then(i13.a));
                    Object Q8 = go1Var.Q();
                    if (Q8 == jpVar) {
                        Q8 = new bi(viVar);
                        go1Var.o0(Q8);
                    }
                    bi biVar = (bi) Q8;
                    long j2 = go1Var.T;
                    int i13 = (int) (j2 ^ (j2 >>> 32));
                    am3 m2 = go1Var.m();
                    l13 x0 = i42.x0(go1Var, then);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, biVar);
                    qi4.k(go1Var, q8.b0, m2);
                    qi4.i(go1Var, Integer.valueOf(i13));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    ?? r7 = tc0Var;
                    r7.invoke(viVar, go1Var, Integer.valueOf((i3 >> 21) & 112));
                    go1Var.q(true);
                    go1Var.q(false);
                    tc0Var3 = r7;
                }
                go1Var.q(z2);
                tc0Var2 = tc0Var3;
            } else {
                go1Var.d0(-270514673);
                go1Var.q(false);
                tc0Var2 = tc0Var4;
            }
        } else {
            go1Var.W();
            tc0Var2 = tc0Var4;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new jh(ea5Var, tm1Var, l13Var, ta1Var, bc1Var, hn1Var, tc0Var2, i2);
        }
    }

    public static final boolean b0(si4 si4Var) {
        List i2;
        if (!si4Var.n()) {
            i2 = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (wi4.p((si4) i2.get(i3))) {
                }
            }
            wa2 v2 = si4Var.c.v();
            while (true) {
                if (v2 == null) {
                    v2 = null;
                    break;
                }
                ki4 x2 = v2.x();
                if (x2 != null && x2.K) {
                    break;
                }
                v2 = v2.v();
            }
            return !(v2 != null);
        }
        return false;
    }

    public static final void c(w74 w74Var, boolean z2, l13 l13Var, ta1 ta1Var, bc1 bc1Var, String str, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        l13 l13Var2;
        go1 go1Var;
        String str2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(234057107);
        if ((i2 & 48) == 0) {
            i3 = (go1Var2.h(z2) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i2 & 3072) == 0) {
            i4 |= go1Var2.g(ta1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go1Var2.g(bc1Var) ? 16384 : 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= go1Var2.i(tc0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var2.T(i5 & 1, (599185 & i5) != 599184)) {
            ea5 Z = mw2.Z(Boolean.valueOf(z2), "AnimatedVisibility", go1Var2, ((i5 >> 3) & 14) | ((i5 >> 12) & 112));
            Object Q = go1Var2.Q();
            if (Q == de0.a) {
                Q = fh.L;
                go1Var2.o0(Q);
            }
            i13 i13Var = i13.a;
            f(Z, (tm1) Q, i13Var, ta1Var, bc1Var, tc0Var, go1Var2, (i5 & 3670016) | (i5 & 896) | 48 | (i5 & 7168) | (57344 & i5));
            l13Var2 = i13Var;
            go1Var = go1Var2;
            str2 = "AnimatedVisibility";
        } else {
            go1Var2.W();
            l13Var2 = l13Var;
            go1Var = go1Var2;
            str2 = str;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new pi(w74Var, z2, l13Var2, ta1Var, bc1Var, str2, tc0Var, i2);
        }
    }

    public static double c0(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static final void d(boolean z2, l13 l13Var, ta1 ta1Var, bc1 bc1Var, String str, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        l13 l13Var2;
        String str2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1799879339);
        if ((i2 & 48) == 0) {
            i3 = (go1Var.h(z2) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i2 & 3072) == 0) {
            i4 |= go1Var.g(ta1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go1Var.g(bc1Var) ? 16384 : 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= go1Var.i(tc0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var.T(i5 & 1, (599185 & i5) != 599184)) {
            ea5 Z = mw2.Z(Boolean.valueOf(z2), "AnimatedVisibility", go1Var, ((i5 >> 3) & 14) | ((i5 >> 12) & 112));
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = fh.M;
                go1Var.o0(Q);
            }
            i13 i13Var = i13.a;
            f(Z, (tm1) Q, i13Var, ta1Var, bc1Var, tc0Var, go1Var, (i5 & 896) | 48 | (i5 & 7168) | (57344 & i5) | (i5 & 3670016));
            str2 = "AnimatedVisibility";
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
            str2 = str;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new qi(z2, l13Var2, ta1Var, bc1Var, str2, tc0Var, i2);
        }
    }

    public static double[] d0(int i2) {
        double i0 = i0((i2 >> 16) & 255);
        double i02 = i0((i2 >> 8) & 255);
        double i03 = i0(i2 & 255);
        double[][] dArr = j;
        double[] dArr2 = dArr[0];
        double d2 = (dArr2[2] * i03) + (dArr2[1] * i02) + (dArr2[0] * i0);
        double[] dArr3 = dArr[1];
        double d3 = (dArr3[2] * i03) + (dArr3[1] * i02) + (dArr3[0] * i0);
        double[] dArr4 = dArr[2];
        double d4 = (dArr4[2] * i03) + (dArr4[1] * i02) + (dArr4[0] * i0);
        double[] dArr5 = l;
        double d5 = d2 / dArr5[0];
        double d6 = d3 / dArr5[1];
        double d7 = d4 / dArr5[2];
        double c0 = c0(d5);
        double c02 = c0(d6);
        return new double[]{(116.0d * c02) - 16.0d, (c0 - c02) * 500.0d, (c02 - c0(d7)) * 200.0d};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(boolean r16, defpackage.l13 r17, defpackage.ta1 r18, defpackage.bc1 r19, java.lang.String r20, defpackage.tc0 r21, defpackage.fe0 r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.e(boolean, l13, ta1, bc1, java.lang.String, tc0, fe0, int, int):void");
    }

    public static double e0(double d2) {
        double d3 = d2 * d2 * d2;
        return d3 > 0.008856451679035631d ? d3 : ((116.0d * d2) - 16.0d) / 903.2962962962963d;
    }

    public static final void f(ea5 ea5Var, tm1 tm1Var, l13 l13Var, ta1 ta1Var, bc1 bc1Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        ta1 ta1Var2;
        bc1 bc1Var2;
        tc0 tc0Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(ea5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.i(tm1Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ta1Var2 = ta1Var;
            i3 |= go1Var.g(ta1Var2) ? 2048 : 1024;
        } else {
            ta1Var2 = ta1Var;
        }
        if ((i2 & 24576) == 0) {
            bc1Var2 = bc1Var;
            i3 |= go1Var.g(bc1Var2) ? 16384 : 8192;
        } else {
            bc1Var2 = bc1Var;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            tc0Var2 = tc0Var;
            i4 |= go1Var.i(tc0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            tc0Var2 = tc0Var;
        }
        if (go1Var.T(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z2 || Q == jpVar) {
                Q = new ri(tm1Var, ea5Var);
                go1Var.o0(Q);
            }
            l13 I2 = j42.I(l13Var, (in1) Q);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = si.J;
                go1Var.o0(Q2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            b(ea5Var, tm1Var, I2, ta1Var2, bc1Var2, (hn1) Q2, tc0Var2, go1Var, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new ih(ea5Var, tm1Var, l13Var, ta1Var, bc1Var, tc0Var, i2);
        }
    }

    public static final rv4 f0(dl0 dl0Var, tk0 tk0Var, gl0 gl0Var, hn1 hn1Var) {
        tk0 W = qb.W(dl0Var, tk0Var);
        gl0Var.getClass();
        rv4 ah2Var = gl0Var == gl0.J ? new ah2(W, hn1Var) : new rv4(W, true);
        ah2Var.h0(gl0Var, ah2Var, hn1Var);
        return ah2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.l13 r20, float r21, long r22, long r24, defpackage.fe0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.g(l13, float, long, long, fe0, int, int):void");
    }

    public static rv4 g0(dl0 dl0Var, tk0 tk0Var, gl0 gl0Var, hn1 hn1Var, int i2) {
        if ((i2 & 1) != 0) {
            tk0Var = l91.I;
        }
        if ((i2 & 2) != 0) {
            gl0Var = gl0.I;
        }
        return f0(dl0Var, tk0Var, gl0Var, hn1Var);
    }

    public static final void h(int i2, int i3, fe0 fe0Var, rm1 rm1Var, l13 l13Var, String str, boolean z2) {
        int i4;
        l13 l13Var2;
        int i5;
        long M2;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(31808049);
        if ((i2 & 6) == 0) {
            i4 = (go1Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.i(rm1Var) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3072;
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            i5 = i4 | (go1Var.g(l13Var2) ? 2048 : 1024);
        }
        int i7 = i5;
        if (go1Var.T(i7 & 1, (i7 & 1171) != 1170)) {
            i13 i13Var = i13.a;
            if (i6 != 0) {
                l13Var2 = i13Var;
            }
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
            t43 w2 = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long j2 = z2 ? k80Var.d : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            if (z2) {
                go1Var.d0(502783201);
                go1Var.q(false);
                M2 = k80Var.c;
            } else {
                go1Var.d0(502784478);
                M2 = c5.M(go1Var);
                go1Var.q(false);
            }
            long j3 = M2;
            l13 l13Var3 = l13Var2;
            cw4 t0 = t0(booleanValue, j3, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "AppDialogButton-bg", go1Var, 24576, 0);
            cw4 s0 = s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "AppDialogButton-fg", go1Var, 3072);
            l13 u2 = r7.u(12.0f, nq4.g(l13Var3, 44.0f), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new uf(t43Var, (byte) 2);
                go1Var.o0(Q3);
            }
            l13 E0 = i42.E0(mw2.B(r13.d(i42.A0(u2, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 20.0f, 0.0f, 2);
            uw2 c2 = px.c(q8.N, false);
            int Q4 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            r55.b(str, G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1.P, 0L, new k25(3), 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, (i7 & 14) | 1572864, 0, 129976);
            go1Var = go1Var;
            go1Var.q(true);
            l13Var2 = l13Var3;
        } else {
            go1Var.W();
        }
        x04 u3 = go1Var.u();
        if (u3 != null) {
            u3.d = new nn(i2, i3, rm1Var, l13Var2, str, z2);
        }
    }

    public static final l13 h0(l13 l13Var, c82 c82Var, ff2 ff2Var, pg3 pg3Var, boolean z2) {
        return l13Var.then(new if2(c82Var, ff2Var, pg3Var, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.l13 r16, float r17, long r18, defpackage.fe0 r20, int r21, int r22) {
        /*
            r4 = r20
            go1 r4 = (defpackage.go1) r4
            r0 = 227663882(0xd91e00a, float:8.99025E-31)
            r4.f0(r0)
            r0 = r21 | 6
            r1 = r22 & 2
            if (r1 == 0) goto L15
            r0 = r21 | 54
        L12:
            r2 = r17
            goto L27
        L15:
            r2 = r21 & 48
            if (r2 != 0) goto L12
            r2 = r17
            boolean r3 = r4.d(r2)
            if (r3 == 0) goto L24
            r3 = 32
            goto L26
        L24:
            r3 = 16
        L26:
            r0 = r0 | r3
        L27:
            r3 = r22 & 4
            r5 = r18
            if (r3 != 0) goto L36
            boolean r3 = r4.f(r5)
            if (r3 == 0) goto L36
            r3 = 256(0x100, float:3.59E-43)
            goto L38
        L36:
            r3 = 128(0x80, float:1.8E-43)
        L38:
            r0 = r0 | r3
            r3 = r0 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r3 == r7) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = 0
        L42:
            r7 = r0 & 1
            boolean r3 = r4.T(r7, r3)
            if (r3 == 0) goto L97
            r4.Y()
            r3 = r21 & 1
            if (r3 == 0) goto L66
            boolean r3 = r4.C()
            if (r3 == 0) goto L58
            goto L66
        L58:
            r4.W()
            r1 = r22 & 4
            if (r1 == 0) goto L61
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
        L61:
            r7 = r2
            r1 = r5
            r6 = r16
            goto L83
        L66:
            if (r1 == 0) goto L6b
            r1 = 1111490560(0x42400000, float:48.0)
            goto L6c
        L6b:
            r1 = r2
        L6c:
            r2 = r22 & 4
            i13 r3 = defpackage.i13.a
            if (r2 == 0) goto L80
            i51 r2 = defpackage.lw2.b
            java.lang.Object r2 = r4.k(r2)
            fw2 r2 = (defpackage.fw2) r2
            k80 r2 = r2.a
            long r5 = r2.a
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
        L80:
            r7 = r1
            r1 = r5
            r6 = r3
        L83:
            r4.r()
            r3 = r0
            l13 r0 = defpackage.nq4.k(r6, r7)
            int r3 = r3 >> 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r3 = 0
            defpackage.qb.p(r0, r1, r3, r4, r5)
            r11 = r1
            r9 = r6
            r10 = r7
            goto L9e
        L97:
            r4.W()
            r9 = r16
            r10 = r2
            r11 = r5
        L9e:
            x04 r0 = r4.u()
            if (r0 == 0) goto Lb0
            kn r8 = new kn
            r15 = 0
            r13 = r21
            r14 = r22
            r8.<init>(r9, r10, r11, r13, r14, r15)
            r0.d = r8
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.i(l13, float, long, fe0, int, int):void");
    }

    public static double i0(int i2) {
        double d2 = i2 / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static final void j(final int i2, fe0 fe0Var, final tm1 tm1Var, final l13 l13Var) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (go1Var.i(tm1Var) ? 32 : 16);
        if (go1Var.T(i4 & 1, (i4 & 19) != 18)) {
            oh4.a(go1Var, j42.t(l13Var, tm1Var));
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: t10
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p70.j(mu0.X(i2 | 1), (fe0) obj, tm1Var, l13.this);
                    return wd5.a;
                }
            };
        }
    }

    public static List j0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.String r15, defpackage.l13 r16, defpackage.hx1 r17, boolean r18, boolean r19, defpackage.hn1 r20, defpackage.fe0 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.k(java.lang.String, l13, hx1, boolean, boolean, hn1, fe0, int, int):void");
    }

    public static List k0(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return o91.I;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.l13 r12, boolean r13, long r14, final defpackage.tc0 r16, defpackage.fe0 r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.l(l13, boolean, long, tc0, fe0, int, int):void");
    }

    public static double l0(int i2) {
        return (c0(E0(i2)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r23, defpackage.l13 r24, boolean r25, long r26, defpackage.fe0 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.m(java.lang.String, l13, boolean, long, fe0, int, int):void");
    }

    public static tk0 m0(rk0 rk0Var, sk0 sk0Var) {
        sk0Var.getClass();
        return j42.c(rk0Var.getKey(), sk0Var) ? l91.I : rk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if ((r26 & 16) != 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final defpackage.hx1 r17, boolean r18, boolean r19, long r20, long r22, defpackage.fe0 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.n(hx1, boolean, boolean, long, long, fe0, int, int):void");
    }

    public static ArrayList n0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new np(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final java.lang.String r24, defpackage.l13 r25, defpackage.fe0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.o(java.lang.String, l13, fe0, int, int):void");
    }

    public static final List o0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : j0(list.get(0)) : o91.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final int r30, final int r31, defpackage.fe0 r32, final defpackage.rm1 r33, defpackage.l13 r34, final java.lang.String r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.p(int, int, fe0, rm1, l13, java.lang.String, boolean):void");
    }

    public static tk0 p0(rk0 rk0Var, tk0 tk0Var) {
        tk0Var.getClass();
        return tk0Var == l91.I ? rk0Var : (tk0) tk0Var.fold(rk0Var, new sg((byte) 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final defpackage.hx1 r36, final java.lang.String r37, defpackage.l13 r38, java.lang.String r39, defpackage.rw4 r40, boolean r41, defpackage.in1 r42, defpackage.fe0 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.q(hx1, java.lang.String, l13, java.lang.String, rw4, boolean, in1, fe0, int, int):void");
    }

    public static final void q0(int i2, int i3) {
        if (i3 < 0) {
            s83.t(r7.z("fromIndex (0) is greater than toIndex (", i3, ")."));
        } else {
            if (i3 <= i2) {
                return;
            }
            zy.o(hf1.v("toIndex (", i3, ") is greater than size (", i2, ")."));
        }
    }

    public static final long r(boolean z2, long j2, long j3, String str, fe0 fe0Var, int i2) {
        if (z2) {
            j2 = j3;
        }
        return ((x70) bq4.a(j2, z2 ? rn.c : rn.d, str, fe0Var, (i2 >> 3) & 896, 8).getValue()).a;
    }

    public static final Object r0(am3 am3Var, xx3 xx3Var) {
        xx3Var.getClass();
        zl3 zl3Var = (zl3) am3Var;
        Object obj = zl3Var.get(xx3Var);
        if (obj == null) {
            obj = xx3Var.b();
        }
        return ((dh5) obj).a(zl3Var);
    }

    public static int s(int i2, int i3, int i4) {
        return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
    }

    public static final cw4 s0(boolean z2, long j2, long j3, String str, fe0 fe0Var, int i2) {
        if (z2) {
            j2 = j3;
        }
        return bq4.a(j2, z2 ? rn.c : rn.d, str, fe0Var, (i2 >> 3) & 896, 8);
    }

    public static int t(double d2, double d3, double d4) {
        double[][] dArr = k;
        double[] dArr2 = dArr[0];
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        return s(M(d5), M(d6), M((dArr4[2] * d4) + (dArr4[1] * d3) + (dArr4[0] * d2)));
    }

    public static final cw4 t0(boolean z2, long j2, long j3, boolean z3, String str, fe0 fe0Var, int i2, int i3) {
        boolean z4 = (i3 & 8) != 0 ? false : z3;
        if (z2) {
            j2 = j3;
        }
        if (z2 && z4) {
            float[] fArr = new float[3];
            Color.colorToHSV(qb.i0(j3), fArr);
            fArr[2] = ut0.q(fArr[2] * 0.85f, 0.0f, 1.0f);
            j2 = qb.i(Color.HSVToColor(ut0.r((int) (x70.d(j3) * 255.0f), 0, 255), fArr));
        }
        return bq4.a(j2, (z2 && z4) ? rn.e : z2 ? rn.c : rn.d, str, fe0Var, (i2 >> 6) & 896, 8);
    }

    public static ArrayList u(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new np(objArr, true));
    }

    public static final tc0 u0(int i2, dn1 dn1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (Q == de0.a) {
            Q = new tc0(i2, dn1Var, true);
            go1Var.o0(Q);
        }
        tc0 tc0Var = (tc0) Q;
        if (!tc0Var.K.equals(dn1Var)) {
            tc0Var.K = dn1Var;
            if (tc0Var.J) {
                x04 x04Var = tc0Var.L;
                if (x04Var != null) {
                    y04 y04Var = x04Var.a;
                    if (y04Var != null) {
                        y04Var.c(x04Var, null);
                    }
                    tc0Var.L = null;
                }
                ArrayList arrayList = tc0Var.M;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        x04 x04Var2 = (x04) arrayList.get(i3);
                        y04 y04Var2 = x04Var2.a;
                        if (y04Var2 != null) {
                            y04Var2.c(x04Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return tc0Var;
    }

    public static Collection v(Object obj) {
        if ((obj instanceof w72) && !(obj instanceof x72)) {
            z0(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            j42.Z(e2, p70.class.getName());
            throw e2;
        }
    }

    public static final void v0(wr4 wr4Var, int i2, Object obj) {
        int g2 = wr4Var.g(i2);
        Object[] objArr = wr4Var.c;
        Object obj2 = objArr[g2];
        objArr[g2] = de0.a;
        if (obj == obj2) {
            return;
        }
        ke0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static List w(Object obj) {
        if ((obj instanceof w72) && !(obj instanceof y72)) {
            z0(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            j42.Z(e2, p70.class.getName());
            throw e2;
        }
    }

    public static final void w0(List list, int i2, int i3) {
        int O = O(i2, list);
        if (O < 0) {
            O = -(O + 1);
        }
        while (O < list.size() && ((b52) list.get(O)).b < i3) {
        }
    }

    public static Map x(Object obj) {
        if ((obj instanceof w72) && !(obj instanceof a82)) {
            z0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            j42.Z(e2, p70.class.getName());
            throw e2;
        }
    }

    public static final boolean x0(x04 x04Var, x04 x04Var2) {
        return x04Var == null || !x04Var.a() || x04Var == x04Var2 || j42.c(x04Var.c, x04Var2.c);
    }

    public static lt0 y(dl0 dl0Var, tk0 tk0Var, hn1 hn1Var, int i2) {
        if ((i2 & 1) != 0) {
            tk0Var = l91.I;
        }
        lt0 lt0Var = new lt0(qb.W(dl0Var, tk0Var), true);
        lt0Var.h0(gl0.I, lt0Var, hn1Var);
        return lt0Var;
    }

    public static final aa1 y0(ea5 ea5Var, tm1 tm1Var, Object obj, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.a0(-422486566, ea5Var);
        boolean i2 = ea5Var.i();
        ss4 ss4Var = ea5Var.a;
        aa1 aa1Var = aa1.K;
        aa1 aa1Var2 = aa1.J;
        aa1 aa1Var3 = aa1.I;
        if (i2) {
            go1Var.d0(-212166497);
            go1Var.q(false);
            if (((Boolean) tm1Var.invoke(obj)).booleanValue()) {
                aa1Var = aa1Var2;
            } else if (!((Boolean) tm1Var.invoke(ss4Var.d())).booleanValue()) {
                aa1Var = aa1Var3;
            }
        } else {
            go1Var.d0(-211886815);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object value = ea5Var.e.getValue();
            if (((Boolean) tm1Var.invoke(ss4Var.d())).booleanValue() || (value != null && ((Boolean) tm1Var.invoke(value)).booleanValue())) {
                t43Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) tm1Var.invoke(obj)).booleanValue()) {
                aa1Var = aa1Var2;
            } else if ((value != null && ((Boolean) tm1Var.invoke(value)).booleanValue()) || !((Boolean) t43Var.getValue()).booleanValue()) {
                aa1Var = aa1Var3;
            }
            go1Var.q(false);
        }
        go1Var.q(false);
        return aa1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z(ArrayList arrayList, fj0 fj0Var) {
        if (arrayList.isEmpty()) {
            return o91.I;
        }
        kt0[] kt0VarArr = (kt0[]) arrayList.toArray(new kt0[0]);
        is isVar = new is(kt0VarArr);
        k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        int length = kt0VarArr.length;
        gs[] gsVarArr = new gs[length];
        for (int i2 = 0; i2 < length; i2++) {
            mw mwVar = kt0VarArr[i2];
            mwVar.start();
            gs gsVar = new gs(isVar, k10Var);
            gsVar.N = vt0.D(mwVar, gsVar);
            gsVarArr[i2] = gsVar;
        }
        hs hsVar = new hs(gsVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            gs gsVar2 = gsVarArr[i3];
            gsVar2.getClass();
            gq.a.putObjectVolatile(gsVar2, gs.P, hsVar);
        }
        if (k10Var.s() instanceof za3) {
            k10Var.w(hsVar);
        } else {
            hsVar.b();
        }
        return k10Var.r();
    }

    public static void z0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(r7.C(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        j42.Z(classCastException, p70.class.getName());
        throw classCastException;
    }
}
