package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.github.mytv.dv.MainActivity;
import com.github.mytv.dv.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class rt0 {
    public static hx1 a;
    public static hx1 b;

    public static Object A(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return ((List) iterable).get(r2.size() - 1);
            }
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final mi2 B(MainActivity mainActivity) {
        xi2 xi2Var = mainActivity.I;
        xi2Var.getClass();
        ep epVar = xi2Var.a;
        while (true) {
            mi2 mi2Var = (mi2) ((AtomicReference) epVar.J).get();
            if (mi2Var != null) {
                return mi2Var;
            }
            fz4 b2 = ui4.b();
            os0 os0Var = sx0.a;
            mi2 mi2Var2 = new mi2(xi2Var, p70.p0(b2, ju2.a.L));
            AtomicReference atomicReference = (AtomicReference) epVar.J;
            do {
                fj0 fj0Var = null;
                if (atomicReference.compareAndSet(null, mi2Var2)) {
                    os0 os0Var2 = sx0.a;
                    p70.g0(mi2Var2, ju2.a.L, null, new u32((Object) mi2Var2, fj0Var, (byte) 1), 2);
                    return mi2Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final hx1 C() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 12.0f);
        r.r(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        r.D(-1.79f, -4.0f, -4.0f, -4.0f);
        r.D(-4.0f, 1.79f, -4.0f, 4.0f);
        r.D(1.79f, 4.0f, 4.0f, 4.0f);
        r.p();
        r.z(12.0f, 14.0f);
        r.r(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        r.M(2.0f);
        r.v(16.0f);
        r.M(-2.0f);
        r.r(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static float D(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        float f5 = 0.0f;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            f2 = fArr[0];
            f3 = fArr2[0];
            f4 = 0.0f;
        } else {
            float f8 = fArr[i2];
            f2 = fArr[i];
            f5 = fArr2[i2];
            f3 = fArr2[i];
            f4 = f8;
        }
        return lq2.u(f5, f3, f4, f2, abs) * signum;
    }

    public static final k13 E(tt0 tt0Var, int i) {
        k13 child$ui = tt0Var.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & 2) != 0) {
                return null;
            }
            if ((kindSet$ui & i) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }

    public static final v22 F(m14 m14Var) {
        return new v22(Math.round(m14Var.a), Math.round(m14Var.b), Math.round(m14Var.c), Math.round(m14Var.d));
    }

    public static final void G(lg3 lg3Var, int i, Object obj) {
        lg3Var.h[(lg3Var.i - lg3Var.d[lg3Var.e - 1].b) + i] = obj;
    }

    public static final void H(lg3 lg3Var, int i, Object obj, int i2, Object obj2) {
        int i3 = lg3Var.i - lg3Var.d[lg3Var.e - 1].b;
        Object[] objArr = lg3Var.h;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static void I(List list, mr3 mr3Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (mr3Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final long J(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long K(long j) {
        jp jpVar = t41.J;
        boolean z = j > 0;
        if (z) {
            return t41.d(t41.g(j, sp0.o0(999999L, x41.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        s83.v();
        return 0L;
    }

    public static final ew2 L(n74 n74Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        boolean g = go1Var.g(n74Var) | go1Var.e(0);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new ew2(n74Var);
            go1Var.o0(Q);
        }
        return (ew2) Q;
    }

    public static String M(long j) {
        return "PointerId(value=" + j + ")";
    }

    public static dd a(int i, int i2, int i3) {
        Bitmap createBitmap;
        v54 v54Var = z80.e;
        Bitmap.Config i4 = ed.i(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = ed.b(i, i2, i3, v54Var);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, i4);
            createBitmap.setHasAlpha(true);
        }
        return new dd(createBitmap);
    }

    public static final void b(rm1 rm1Var, l13 l13Var, bf2 bf2Var, oe2 oe2Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1055276397);
        int i2 = (go1Var.i(rm1Var) ? 4 : 2) | i | (go1Var.g(l13Var) ? 32 : 16) | (go1Var.g(bf2Var) ? 256 : 128) | (go1Var.g(oe2Var) ? 2048 : 1024);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            mu0.e(p70.u0(-933153643, new ne2(bf2Var, l13Var, oe2Var, ad4.x(rm1Var, go1Var)), go1Var), go1Var, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tg(rm1Var, l13Var, bf2Var, oe2Var, i, (byte) 1);
        }
    }

    public static final void c(p63 p63Var, g94 g94Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(233973821);
        if ((((go1Var.i(p63Var) ? 4 : 2) | i | (go1Var.i(g94Var) ? 32 : 16)) & 147) == 146 && go1Var.F()) {
            go1Var.W();
        } else {
            mw2.c(new ay3[]{rq2.a.a(p63Var), mq2.a.a(p63Var), qq2.a.a(p63Var)}, p70.u0(1808964477, new s63(g94Var, tc0Var, (byte) 0), go1Var), go1Var, 56);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cf0(p63Var, g94Var, tc0Var, i, (byte) 2);
        }
    }

    public static final void d(final boolean z, final hn1 hn1Var, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-642000585);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 16;
        if ((i & 48) == 0) {
            i2 |= go1Var.i(hn1Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (k83) go1Var.k(nq2.a);
            if (obj == null) {
                go1Var.d0(950836184);
                View view = (View) go1Var.k(rb.f);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    k83 k83Var = tag instanceof k83 ? (k83) tag : null;
                    if (k83Var != null) {
                        obj = k83Var;
                        break;
                    } else {
                        Object f = oh4.f(view);
                        view = f instanceof View ? (View) f : null;
                    }
                }
                go1Var.q(false);
            } else {
                go1Var.d0(950834231);
                go1Var.q(false);
            }
            if (obj == null) {
                go1Var.d0(1512740606);
                obj = oq2.a(go1Var);
            } else {
                go1Var.d0(1512737723);
            }
            go1Var.q(false);
            if (obj == null) {
                zy.i("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean g = go1Var.g(obj);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                k83 k83Var2 = obj instanceof k83 ? (k83) obj : null;
                ts0 a2 = k83Var2 != null ? k83Var2.a() : null;
                le3 le3Var = obj instanceof le3 ? (le3) obj : null;
                Q = new kt(a2, le3Var != null ? le3Var.b() : null);
                go1Var.o0(Q);
            }
            kt ktVar = (kt) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = mw2.w(go1Var);
                go1Var.o0(Q2);
            }
            dl0 dl0Var = (dl0) Q2;
            long j = go1Var.T;
            boolean g2 = go1Var.g(ktVar) | go1Var.f(j);
            Object Q3 = go1Var.Q();
            if (g2 || Q3 == jpVar) {
                Q3 = new qd0(dl0Var, new tr3(obj, j));
                go1Var.o0(Q3);
            }
            qd0 qd0Var = (qd0) Q3;
            go1Var.d0(-348514256);
            boolean i3 = go1Var.i(qd0Var) | go1Var.i(hn1Var);
            Object Q4 = go1Var.Q();
            if (i3 || Q4 == jpVar) {
                Q4 = new k9(qd0Var, hn1Var, (byte) 12);
                go1Var.o0(Q4);
            }
            mw2.L(go1Var, (rm1) Q4);
            int i4 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean i6 = (i5 == 4) | go1Var.i(qd0Var);
            Object Q5 = go1Var.Q();
            if (i6 || Q5 == jpVar) {
                Q5 = new iu1(qd0Var, z);
                go1Var.o0(Q5);
            }
            sv2.d(valueOf, qd0Var, null, (tm1) Q5, go1Var, i5);
            boolean i7 = go1Var.i(ktVar) | go1Var.i(qd0Var);
            Object Q6 = go1Var.Q();
            if (i7 || Q6 == jpVar) {
                Q6 = new m1(ktVar, qd0Var, b2);
                go1Var.o0(Q6);
            }
            mw2.f(ktVar, qd0Var, (tm1) Q6, go1Var);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ur3
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int X = mu0.X(i | 1);
                    rt0.d(z, hn1Var, (fe0) obj2, X);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable, n74] */
    public static final n74 e(float[] fArr, ok0 ok0Var, AbstractList abstractList, float f, float f2) {
        float f3;
        int i;
        ArrayList arrayList;
        List j0;
        km0 d;
        ok0 ok0Var2;
        float f4 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        ok0Var.getClass();
        n74 n74Var = null;
        if (fArr.length < 6) {
            s83.t("Polygons must have at least 3 vertices");
            return null;
        }
        int i2 = 2;
        int i3 = 1;
        if (fArr.length % 2 == 1) {
            s83.t("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            s83.t("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            ok0 ok0Var3 = (abstractList == null || (ok0Var2 = (ok0) abstractList.get(i5)) == null) ? ok0Var : ok0Var2;
            int i6 = (((i5 + length) - 1) % length) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % length) * 2;
            int i9 = i5 * 2;
            arrayList3.add(new i74(rf1.a(fArr[i6], fArr[i6 + 1]), rf1.a(fArr[i9], fArr[i9 + 1]), rf1.a(fArr[i8], fArr[i8 + 1]), ok0Var3));
            i5 = i7;
            f4 = f4;
        }
        float f5 = f4;
        u22 c0 = ut0.c0(0, length);
        ArrayList arrayList4 = new ArrayList(p70.J(c0, 10));
        Iterator it = c0.iterator();
        while (true) {
            f3 = 0.0f;
            if (!((t22) it).K) {
                break;
            }
            int nextInt = ((l22) it).nextInt();
            int i10 = (nextInt + 1) % length;
            float f6 = ((i74) arrayList3.get(nextInt)).h + ((i74) arrayList3.get(i10)).h;
            float c = ((i74) arrayList3.get(i10)).c() + ((i74) arrayList3.get(nextInt)).c();
            int i11 = nextInt * 2;
            float f7 = fArr[i11];
            float f8 = fArr[i11 + 1];
            int i12 = i10 * 2;
            float f9 = f7 - fArr[i12];
            float f10 = f8 - fArr[i12 + 1];
            float f11 = sg5.b;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            arrayList4.add(f6 > sqrt ? new uj3(Float.valueOf(sqrt / f6), Float.valueOf(0.0f)) : c > sqrt ? new uj3(valueOf, Float.valueOf((sqrt - f6) / (c - f6))) : new uj3(valueOf, valueOf));
        }
        int i13 = 0;
        while (i13 < length) {
            float[] fArr2 = new float[i2];
            ?? r16 = n74Var;
            int i14 = i4;
            int i15 = i14;
            while (i14 < i2) {
                int i16 = i4;
                uj3 uj3Var = (uj3) arrayList4.get((((i13 + length) - 1) + i14) % length);
                float f12 = f3;
                int i17 = i2;
                float c2 = ((((i74) arrayList3.get(i13)).c() - ((i74) arrayList3.get(i13)).h) * ((Number) uj3Var.J).floatValue()) + (((i74) arrayList3.get(i13)).h * ((Number) uj3Var.I).floatValue());
                int i18 = i15 + 1;
                if (fArr2.length < i18) {
                    fArr2 = Arrays.copyOf(fArr2, Math.max(i18, (fArr2.length * 3) / 2));
                }
                fArr2[i15] = c2;
                i14++;
                f3 = f12;
                i15 = i18;
                fArr2 = fArr2;
                i4 = i16;
                i2 = i17;
            }
            int i19 = i2;
            int i20 = i4;
            float f13 = f3;
            i74 i74Var = (i74) arrayList3.get(i13);
            if (i15 <= 0) {
                dq2.J0("Index must be between 0 and size");
                throw r16;
            }
            float f14 = fArr2[i20];
            if (i3 >= i15) {
                dq2.J0("Index must be between 0 and size");
                throw r16;
            }
            float f15 = fArr2[i3];
            long j = i74Var.e;
            long j2 = i74Var.d;
            int i21 = i3;
            float f16 = i74Var.f;
            ArrayList arrayList5 = arrayList2;
            long j3 = i74Var.b;
            float min = Math.min(f14, f15);
            float f17 = i74Var.h;
            if (f17 < 1.0E-4f || min < 1.0E-4f || f16 < 1.0E-4f) {
                i = i13;
                arrayList = arrayList4;
                i74Var.i = j3;
                float V = sp0.V(j3);
                float W = sp0.W(j3);
                float V2 = sp0.V(j3);
                float W2 = sp0.W(j3);
                j0 = p70.j0(mw2.d(V, W, sg5.b(V, V2, 0.33333334f), sg5.b(W, W2, 0.33333334f), sg5.b(V, V2, 0.6666667f), sg5.b(W, W2, 0.6666667f), V2, W2));
            } else {
                float min2 = Math.min(min, f17);
                float a2 = i74Var.a(f14);
                float a3 = i74Var.a(f15);
                float f18 = (f16 * min2) / f17;
                float f19 = sg5.b;
                i = i13;
                float sqrt2 = (float) Math.sqrt((min2 * min2) + (f18 * f18));
                arrayList = arrayList4;
                long D = sp0.D(sp0.c0(j2, j), 2.0f);
                float N = sp0.N(D);
                if (N <= f13) {
                    s83.t("Can't get the direction of a 0-length vector");
                    return r16;
                }
                i74Var.i = sp0.c0(j3, sp0.f0(sp0.D(D, N), sqrt2));
                long c02 = sp0.c0(j3, sp0.f0(j2, min2));
                long c03 = sp0.c0(j3, sp0.f0(j, min2));
                km0 b2 = i74.b(min2, a2, i74Var.b, i74Var.a, c02, c03, i74Var.i, f18);
                km0 b3 = i74.b(min2, a3, i74Var.b, i74Var.c, c03, c02, i74Var.i, f18);
                float a4 = b3.a();
                float b4 = b3.b();
                float[] fArr3 = b3.a;
                km0 d2 = mw2.d(a4, b4, fArr3[4], fArr3[5], fArr3[i19], fArr3[3], fArr3[i20], fArr3[i21]);
                float V3 = sp0.V(i74Var.i);
                float W3 = sp0.W(i74Var.i);
                float a5 = b2.a();
                float b5 = b2.b();
                float[] fArr4 = d2.a;
                float f20 = fArr4[i20];
                float f21 = fArr4[i21];
                long a6 = sg5.a(a5 - V3, b5 - W3);
                float f22 = f20 - V3;
                float f23 = f21 - W3;
                long a7 = sg5.a(f22, f23);
                long a8 = rf1.a(-sp0.W(a6), sp0.V(a6));
                long a9 = rf1.a(-sp0.W(a7), sp0.V(a7));
                int i22 = (sp0.W(a8) * f23) + (sp0.V(a8) * f22) >= f13 ? i21 : i20;
                float E = sp0.E(a6, a7);
                if (E > 0.999f) {
                    d = mw2.d(a5, b5, sg5.b(a5, f20, 0.33333334f), sg5.b(b5, f21, 0.33333334f), sg5.b(a5, f20, 0.6666667f), sg5.b(b5, f21, 0.6666667f), f20, f21);
                } else {
                    float sqrt3 = (((((float) Math.sqrt(2.0f * r5)) - ((float) Math.sqrt(f5 - (E * E)))) * ((((float) Math.sqrt((r13 * r13) + (r12 * r12))) * 4.0f) / 3.0f)) / (f5 - E)) * (i22 != 0 ? f5 : -1.0f);
                    d = mw2.d(a5, b5, (sp0.V(a8) * sqrt3) + a5, (sp0.W(a8) * sqrt3) + b5, f20 - (sp0.V(a9) * sqrt3), f21 - (sp0.W(a9) * sqrt3), f20, f21);
                }
                km0[] km0VarArr = new km0[3];
                km0VarArr[i20] = b2;
                km0VarArr[i21] = d;
                km0VarArr[i19] = d2;
                j0 = p70.k0(km0VarArr);
            }
            arrayList5.add(j0);
            int i23 = i + 1;
            f3 = f13;
            arrayList2 = arrayList5;
            arrayList4 = arrayList;
            n74Var = r16;
            i3 = i21;
            i4 = i20;
            i2 = i19;
            i13 = i23;
        }
        ArrayList arrayList6 = arrayList2;
        int i24 = i2;
        n74 n74Var2 = n74Var;
        int i25 = i3;
        int i26 = i4;
        float f24 = f3;
        ArrayList arrayList7 = new ArrayList();
        int i27 = i26;
        while (i27 < length) {
            int i28 = i27 + 1;
            int i29 = i28 % length;
            int i30 = i27 * 2;
            long a10 = rf1.a(fArr[i30], fArr[i30 + 1]);
            int i31 = (((i27 + length) - 1) % length) * 2;
            long a11 = rf1.a(fArr[i31], fArr[i31 + 1]);
            int i32 = i29 * 2;
            long a12 = rf1.a(fArr[i32], fArr[i32 + 1]);
            float f25 = sg5.b;
            long a0 = sp0.a0(a10, a11);
            long a02 = sp0.a0(a12, a10);
            arrayList7.add(new nd1((List) arrayList6.get(i27), (sp0.W(a02) * sp0.V(a0)) - (sp0.V(a02) * sp0.W(a0)) > f24 ? i25 : i26));
            float a13 = ((km0) o70.a1((List) arrayList6.get(i27))).a();
            float b6 = ((km0) o70.a1((List) arrayList6.get(i27))).b();
            float f26 = ((km0) o70.T0((List) arrayList6.get(i29))).a[i26];
            float f27 = ((km0) o70.T0((List) arrayList6.get(i29))).a[i25];
            arrayList7.add(new od1(p70.j0(mw2.d(a13, b6, sg5.b(a13, f26, 0.33333334f), sg5.b(b6, f27, 0.33333334f), sg5.b(a13, f26, 0.6666667f), sg5.b(b6, f27, 0.6666667f), f26, f27))));
            i27 = i28;
        }
        long h = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? h(fArr) : rf1.a(f, f2);
        float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        if (arrayList7.size() < i24) {
            s83.t("Polygons must have at least 2 features");
            return n74Var2;
        }
        mk2 K = p70.K();
        int size = arrayList7.size();
        int i33 = i26;
        while (i33 < size) {
            Object obj = arrayList7.get(i33);
            i33++;
            for (km0 km0Var : ((pd1) obj).a) {
                K.add(Float.valueOf(km0Var.a[i26]));
                K.add(Float.valueOf(km0Var.a[i25]));
            }
        }
        float[] o1 = o70.o1(p70.D(K));
        if (Float.isNaN(intBitsToFloat)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h(o1) >> 32));
        }
        if (Float.isNaN(intBitsToFloat2)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h(o1) & 4294967295L));
        }
        return new n74(arrayList7, rf1.a(intBitsToFloat, intBitsToFloat2));
    }

    public static final void f(g94 g94Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(832919318);
        int i2 = (go1Var.i(g94Var) ? 4 : 2) | i | (go1Var.i(tc0Var) ? 32 : 16);
        if ((i2 & 19) == 18 && go1Var.F()) {
            go1Var.W();
        } else {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = new yy0((byte) 23);
                go1Var.o0(Q);
            }
            tm1 tm1Var = (tm1) Q;
            wr5 wr5Var = (wr5) go1Var.k(rq2.a);
            if (wr5Var == null) {
                zy.i("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            k60 a2 = s24.a(lt.class);
            l02 l02Var = new l02((byte) 0);
            l02Var.a(s24.a(lt.class), tm1Var);
            lt ltVar = (lt) wi4.z(a2, wr5Var, l02Var.b(), wr5Var instanceof ws1 ? ((ws1) wr5Var).d() : ul0.b, go1Var);
            ltVar.c = new at5(g94Var);
            g94Var.b(ltVar.b, tc0Var, go1Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uh0((byte) 9, i, g94Var, tc0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.gj0 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.qt0
            if (r0 == 0) goto L13
            r0 = r4
            qt0 r0 = (defpackage.qt0) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            qt0 r0 = new qt0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.I
            int r1 = r0.J
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L27:
            defpackage.mu0.V(r4)
            goto L45
        L2b:
            defpackage.mu0.V(r4)
            r0.J = r2
            k10 r4 = new k10
            fj0 r0 = defpackage.mu0.G(r0)
            r4.<init>(r2, r0)
            r4.t()
            java.lang.Object r4 = r4.r()
            el0 r0 = defpackage.el0.I
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.zy.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt0.g(gj0):void");
    }

    public static final long h(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return rf1.a(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    public static Handler j(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ls1.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            zl1.k(cause);
            return null;
        }
    }

    public static final q73 k(Context context) {
        context.getClass();
        q73 q73Var = new q73(context);
        a73 a73Var = q73Var.b;
        v83 v83Var = a73Var.t;
        v83Var.a(new hd0(v83Var));
        v83 v83Var2 = a73Var.t;
        v83Var2.a(new jd0());
        v83Var2.a(new sw0());
        return q73Var;
    }

    public static qr5 l(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (qr5) newInstance;
            } catch (IllegalAccessException e) {
                s83.o("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                s83.o("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            s83.o("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final long m(jj3 jj3Var) {
        return mw2.Q(jj3Var.d.c.h() * jj3Var.n()) + (jj3Var.d.b.h() * jj3Var.n());
    }

    public static final Object n(long j, fj0 fj0Var) {
        if (j > 0) {
            k10 k10Var = new k10(1, mu0.G(fj0Var));
            k10Var.t();
            if (j < Long.MAX_VALUE) {
                w(k10Var.M).K(j, k10Var);
            }
            Object r = k10Var.r();
            if (r == el0.I) {
                return r;
            }
        }
        return wd5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.ag1 r7, defpackage.k20 r8, boolean r9, defpackage.fj0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.fg1
            if (r0 == 0) goto L13
            r0 = r10
            fg1 r0 = (defpackage.fg1) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.N = r1
            goto L18
        L13:
            fg1 r0 = new fg1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.M
            int r1 = r0.N
            r2 = 2
            r3 = 1
            r4 = 0
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.L
            fz r7 = r0.K
            k20 r8 = r0.J
            ag1 r1 = r0.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r4
        L3d:
            boolean r9 = r0.L
            fz r7 = r0.K
            k20 r8 = r0.J
            ag1 r1 = r0.I
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.mu0.V(r10)
            boolean r10 = r7 instanceof defpackage.g75
            if (r10 != 0) goto L96
            fz r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.I = r7     // Catch: java.lang.Throwable -> L35
            r0.J = r8     // Catch: java.lang.Throwable -> L35
            r0.K = r10     // Catch: java.lang.Throwable -> L35
            r0.L = r9     // Catch: java.lang.Throwable -> L35
            r0.N = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.I = r1     // Catch: java.lang.Throwable -> L35
            r0.J = r8     // Catch: java.lang.Throwable -> L35
            r0.K = r7     // Catch: java.lang.Throwable -> L35
            r0.L = r9     // Catch: java.lang.Throwable -> L35
            r0.N = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            defpackage.g4.m(r8, r4)
        L8b:
            wd5 r7 = defpackage.wd5.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.g4.m(r8, r7)
        L95:
            throw r10
        L96:
            g75 r7 = (defpackage.g75) r7
            java.lang.Throwable r7 = r7.I
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt0.o(ag1, k20, boolean, fj0):java.lang.Object");
    }

    public static final boolean p(long j, long j2) {
        return j == j2;
    }

    public static final long q(long j, boolean z, int i, float f) {
        int h = ((z || i == 2 || i == 4 || i == 5) && dh0.d(j)) ? dh0.h(j) : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (dh0.j(j) != h) {
            h = ut0.r(qi4.b(f), dh0.j(j), h);
        }
        return o7.v(0, h, 0, dh0.g(j));
    }

    public static final zv2 r(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new zv2(matcher, charSequence);
        }
        return null;
    }

    public static zs1 s(zs1 zs1Var) {
        zs1Var.getClass();
        double rint = Math.rint(zs1Var.b);
        return (((90.0d > rint ? 1 : (90.0d == rint ? 0 : -1)) <= 0 && (rint > 111.0d ? 1 : (rint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(zs1Var.c) > 16.0d ? 1 : (Math.rint(zs1Var.c) == 16.0d ? 0 : -1)) > 0) && (Math.rint(zs1Var.d) < 65.0d)) ? new zs1(o7.Q(zs1Var.b, zs1Var.c, 70.0d)) : zs1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double t(double r10, double r12) {
        /*
            double r0 = defpackage.j42.K(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = defpackage.j42.s(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = defpackage.j42.W(r0, r10)
            double r6 = defpackage.j42.W(r2, r10)
            double r10 = java.lang.Math.rint(r10)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            r10 = 1
            goto L40
        L3f:
            r10 = 0
        L40:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L54
            if (r10 == 0) goto L55
            goto L54
        L4b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt0.t(double, double):double");
    }

    public static final vk0 u(Executor executor) {
        return new qb1(executor);
    }

    public static final pt0 w(tk0 tk0Var) {
        rk0 rk0Var = tk0Var.get(q8.i0);
        pt0 pt0Var = rk0Var instanceof pt0 ? (pt0) rk0Var : null;
        return pt0Var == null ? jr0.a : pt0Var;
    }

    public static final View x(k13 k13Var) {
        ir5 ir5Var = ut0.U(k13Var.getNode()).W;
        View interopView = ir5Var != null ? ir5Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        zy.i("Could not fetch interop view");
        return null;
    }

    public static Object y(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object z(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        zy.k();
        return null;
    }

    public boolean i(yx3 yx3Var) {
        return false;
    }

    public Object v() {
        throw new IllegalStateException("");
    }
}
