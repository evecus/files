package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.WavUtil;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.github.mytv.dv.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class qb {
    public static final ep d;
    public static final ep e;
    public static final ep f;
    public static final ep g;
    public static final ep h;
    public static n54 i;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final tc0 b = new tc0(954879418, new sg(7), false);
    public static final tc0 c = new tc0(1918065384, new sg(8), false);
    public static final jp j = new jp(17);
    public static final SerialDescriptor[] k = new SerialDescriptor[0];
    public static final o63 l = new o63((byte) 9);
    public static final o63 m = new o63((byte) 10);
    public static final o63 n = new o63((byte) 11);
    public static final o63 o = new o63((byte) 12);
    public static final Object p = new Object();

    static {
        byte b2 = 25;
        d = new ep("CLOSED", b2);
        e = new ep("UNDEFINED", b2);
        f = new ep("REUSABLE_CLAIMED", b2);
        g = new ep("REMOVED_TASK", b2);
        h = new ep("CLOSED_EMPTY", b2);
    }

    public static final long A(long j2, long j3) {
        float f2;
        float f3;
        long b2 = x70.b(j2, x70.f(j3));
        float d2 = x70.d(j3);
        float d3 = x70.d(b2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = x70.h(b2);
        float h3 = x70.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = x70.g(b2);
        float g3 = x70.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = x70.e(b2);
        float e3 = x70.e(j3);
        if (f5 != 0.0f) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return r(f2, f3, f6, f5, x70.f(j3));
    }

    public static final boolean B(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final n94 C(vl0 vl0Var) {
        n94 n94Var;
        vl0Var.getClass();
        w94 w94Var = (w94) vl0Var.a(l);
        Bundle bundle = null;
        if (w94Var == null) {
            s83.t("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        wr5 wr5Var = (wr5) vl0Var.a(m);
        if (wr5Var == null) {
            s83.t("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) vl0Var.a(n);
        String str = (String) vl0Var.a(i42.q);
        if (str == null) {
            s83.t("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        u94 n2 = w94Var.g().n("androidx.lifecycle.internal.SavedStateHandlesProvider");
        r94 r94Var = n2 instanceof r94 ? (r94) n2 : null;
        if (r94Var == null) {
            zy.i("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = N(wr5Var).b;
        n94 n94Var2 = (n94) linkedHashMap.get(str);
        if (n94Var2 != null) {
            return n94Var2;
        }
        r94Var.b();
        Bundle bundle3 = r94Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                r94Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            n94Var = new n94();
        } else {
            ClassLoader classLoader = n94.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            zu2 zu2Var = new zu2(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                zu2Var.put(str2, bundle2.get(str2));
            }
            n94Var = new n94(zu2Var.b());
        }
        linkedHashMap.put(str, n94Var);
        return n94Var;
    }

    public static final float D(int i2, float[] fArr, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void E(w94 w94Var) {
        ki2 ki2Var = ((xi2) w94Var.k()).i;
        if (ki2Var == ki2.J || ki2Var == ki2.K) {
            if (w94Var.g().n("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                r94 r94Var = new r94(w94Var.g(), (wr5) w94Var);
                w94Var.g().s("androidx.lifecycle.internal.SavedStateHandlesProvider", r94Var);
                w94Var.k().a(new l14(r94Var, (byte) 2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + w94Var + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + ki2Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final Object F(lh4 lh4Var, long j2, hn1 hn1Var) {
        while (true) {
            lh4 lh4Var2 = lh4Var;
            while (true) {
                if (lh4Var2.e >= j2 && !lh4Var2.d()) {
                    return lh4Var2;
                }
                Object objectVolatile = gq.a.getObjectVolatile(lh4Var2, sf0.c);
                ep epVar = d;
                if (objectVolatile == epVar) {
                    return epVar;
                }
                lh4Var = (lh4) ((sf0) objectVolatile);
                if (lh4Var != null) {
                    break;
                }
                lh4 lh4Var3 = (lh4) hn1Var.invoke(Long.valueOf(lh4Var2.e + 1), lh4Var2);
                while (true) {
                    Unsafe unsafe = gq.a;
                    long j3 = sf0.c;
                    if (unsafe.compareAndSwapObject(lh4Var2, j3, (Object) null, lh4Var3)) {
                        if (lh4Var2.d()) {
                            lh4Var2.e();
                        }
                        lh4Var2 = lh4Var3;
                    } else if (unsafe.getObjectVolatile(lh4Var2, j3) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final tk0 G(tk0 tk0Var, tk0 tk0Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 18;
        boolean booleanValue = ((Boolean) tk0Var.fold(bool, new sg(b2))).booleanValue();
        boolean booleanValue2 = ((Boolean) tk0Var2.fold(bool, new sg(b2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return tk0Var.plus(tk0Var2);
        }
        sg sgVar = new sg((byte) 19);
        l91 l91Var = l91.I;
        tk0 tk0Var3 = (tk0) tk0Var.fold(l91Var, sgVar);
        Object obj = tk0Var2;
        if (booleanValue2) {
            obj = tk0Var2.fold(l91Var, new sg((byte) 20));
        }
        return tk0Var3.plus((tk0) obj);
    }

    public static final void H(cu4 cu4Var) {
        int i2 = cu4Var.L;
        int[] iArr = cu4Var.J;
        Object[] objArr = cu4Var.K;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != p) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        cu4Var.I = false;
        cu4Var.L = i3;
    }

    public static final long I(fe0 fe0Var) {
        return ((go1) fe0Var).T;
    }

    public static final int J(SerialDescriptor serialDescriptor, i62 i62Var, String str) {
        serialDescriptor.getClass();
        str.getClass();
        V(i62Var, serialDescriptor);
        int d2 = serialDescriptor.d(str);
        if (d2 != -3 || !i62Var.a.h) {
            return d2;
        }
        ep epVar = i62Var.c;
        k9 k9Var = new k9(serialDescriptor, i62Var, (byte) 7);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) epVar.J;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        jp jpVar = j;
        Object obj = map != null ? map.get(jpVar) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = k9Var.invoke();
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(jpVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int K(SerialDescriptor serialDescriptor, i62 i62Var, String str, String str2) {
        serialDescriptor.getClass();
        str.getClass();
        int J = J(serialDescriptor, i62Var, str);
        if (J != -3) {
            return J;
        }
        throw new zj4(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static uq2 L(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new uq2(new xq2(dl.e(configuration))) : uq2.a(configuration.locale);
    }

    public static final KSerializer M(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().c() ? kSerializer : new wc3(kSerializer);
    }

    public static final s94 N(wr5 wr5Var) {
        vl1 vl1Var = new vl1((byte) 1);
        vl0 v = ad4.v(wr5Var);
        v.getClass();
        return (s94) new ts0(wr5Var.f(), vl1Var, v).p(s24.a(s94.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final l13 O(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new jw(tm1Var));
    }

    public static l13 P(l13 l13Var, float f2, float f3, dn4 dn4Var, boolean z, int i2) {
        float f4 = (i2 & 2) != 0 ? 1.0f : -1.0f;
        float f5 = (i2 & 4) != 0 ? 1.0f : f2;
        float f6 = (i2 & 32) != 0 ? 0.0f : f3;
        long j2 = r95.b;
        dn4 dn4Var2 = (i2 & 2048) != 0 ? mw2.j : dn4Var;
        boolean z2 = (i2 & 4096) != 0 ? false : z;
        long j3 = nr1.a;
        return l13Var.then(new kr1(1.0f, f4, f5, f6, j2, dn4Var2, z2, j3, j3, w92.a));
    }

    public static final boolean Q(i62 i62Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (i62Var.a.b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof y62) {
                return true;
            }
        }
        return false;
    }

    public static d02 R(u41 u41Var, d44 d44Var, long j2, int i2) {
        if ((i2 & 2) != 0) {
            d44Var = d44.I;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new d02(u41Var, d44Var, j2);
    }

    public static final void S() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final long T(long j2, long j3, float f2) {
        xd3 xd3Var = z80.x;
        long b2 = x70.b(j2, xd3Var);
        long b3 = x70.b(j3, xd3Var);
        float d2 = x70.d(b2);
        float h2 = x70.h(b2);
        float g2 = x70.g(b2);
        float e2 = x70.e(b2);
        float d3 = x70.d(b3);
        float h3 = x70.h(b3);
        float g3 = x70.g(b3);
        float e3 = x70.e(b3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return x70.b(r(vt0.G(h2, h3, f2), vt0.G(g2, g3, f2), vt0.G(e2, e3, f2), vt0.G(d2, d3, f2), xd3Var), x70.f(j3));
    }

    public static final ArrayList U(List list, rm1 rm1Var) {
        if (!((Boolean) rm1Var.invoke()).booleanValue()) {
            return null;
        }
        j81 j81Var = new j81((byte) 29);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pw2 pw2Var = (pw2) list.get(i2);
            Object z = pw2Var.z();
            z.getClass();
            yz b2 = ((e65) z).c().b(j81Var);
            arrayList.add(new uj3(pw2Var.u(o7.v(b2.n(), b2.n(), b2.l(), b2.l())), b2.m()));
        }
        return arrayList;
    }

    public static final void V(i62 i62Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        j42.c(serialDescriptor.e(), sx4.d);
    }

    public static final tk0 W(dl0 dl0Var, tk0 tk0Var) {
        tk0 G = G(dl0Var.getCoroutineContext(), tk0Var, true);
        os0 os0Var = sx0.a;
        return (G == os0Var || G.get(q8.i0) != null) ? G : G.plus(os0Var);
    }

    public static final l13 X(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new pe3(tm1Var));
    }

    public static final void Y(float[] fArr, float[] fArr2) {
        float D = D(0, fArr2, fArr, 0);
        float D2 = D(0, fArr2, fArr, 1);
        float D3 = D(0, fArr2, fArr, 2);
        float D4 = D(0, fArr2, fArr, 3);
        float D5 = D(1, fArr2, fArr, 0);
        float D6 = D(1, fArr2, fArr, 1);
        float D7 = D(1, fArr2, fArr, 2);
        float D8 = D(1, fArr2, fArr, 3);
        float D9 = D(2, fArr2, fArr, 0);
        float D10 = D(2, fArr2, fArr, 1);
        float D11 = D(2, fArr2, fArr, 2);
        float D12 = D(2, fArr2, fArr, 3);
        float D13 = D(3, fArr2, fArr, 0);
        float D14 = D(3, fArr2, fArr, 1);
        float D15 = D(3, fArr2, fArr, 2);
        float D16 = D(3, fArr2, fArr, 3);
        fArr[0] = D;
        fArr[1] = D2;
        fArr[2] = D3;
        fArr[3] = D4;
        fArr[4] = D5;
        fArr[5] = D6;
        fArr[6] = D7;
        fArr[7] = D8;
        fArr[8] = D9;
        fArr[9] = D10;
        fArr[10] = D11;
        fArr[11] = D12;
        fArr[12] = D13;
        fArr[13] = D14;
        fArr[14] = D15;
        fArr[15] = D16;
    }

    public static final void Z(float[] fArr, float f2, float f3, float[] fArr2) {
        nw2.d(fArr2);
        nw2.i(fArr2, f2, f3);
        Y(fArr, fArr2);
    }

    public static final void a(ea5 ea5Var, l13 l13Var, tm1 tm1Var, u8 u8Var, tm1 tm1Var2, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(511725103);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(ea5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(tm1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.g(u8Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.i(tm1Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= go1Var.i(tc0Var) ? 131072 : 65536;
        }
        if (go1Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = hh.K;
                go1Var.o0(Q);
            }
            c(ea5Var, l13Var, tm1Var, u8Var, tm1Var2, (tm1) Q, tc0Var, go1Var, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ih(ea5Var, l13Var, tm1Var, u8Var, tm1Var2, tc0Var, i2);
        }
    }

    public static final q73 a0(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Context context = (Context) go1Var.k(rb.b);
        Object[] copyOf = Arrays.copyOf(new u83[0], 0);
        da daVar = new da((Object) new sg((byte) 24), (Object) new i9(context, (byte) 16), (byte) 10);
        boolean i2 = go1Var.i(context);
        Object Q = go1Var.Q();
        if (i2 || Q == de0.a) {
            Q = new eq(context, (byte) 19);
            go1Var.o0(Q);
        }
        return (q73) ut0.P(copyOf, daVar, (rm1) Q, go1Var, 0, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.Object r17, defpackage.l13 r18, defpackage.tm1 r19, defpackage.u8 r20, java.lang.String r21, defpackage.tm1 r22, defpackage.tc0 r23, defpackage.fe0 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.b(java.lang.Object, l13, tm1, u8, java.lang.String, tm1, tc0, fe0, int, int):void");
    }

    public static final eo1 b0(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.Z(206, ke0.e);
        if (go1Var.S) {
            wr4.y(go1Var.I);
        }
        Object I = go1Var.I();
        lo1 lo1Var = I instanceof lo1 ? (lo1) I : null;
        if (lo1Var == null) {
            lo1Var = new m54(new do1(new eo1(go1Var, go1Var.T, go1Var.q, go1Var.C, go1Var.h.b0)), -1);
            go1Var.p0(lo1Var);
        }
        eo1 eo1Var = ((do1) lo1Var.a).I;
        eo1Var.g.setValue(go1Var.m());
        go1Var.q(false);
        return eo1Var;
    }

    public static final void c(ea5 ea5Var, l13 l13Var, tm1 tm1Var, u8 u8Var, tm1 tm1Var2, tm1 tm1Var3, tc0 tc0Var, fe0 fe0Var, int i2) {
        tm1 tm1Var4;
        go1 go1Var;
        jk3 jk3Var;
        y95 y95Var;
        Object obj;
        n43 n43Var;
        y95 y95Var2;
        ai aiVar;
        gt4 gt4Var;
        gt4 gt4Var2;
        y95 y95Var3;
        boolean z;
        int i3;
        int i4;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1935038908);
        int i5 = (i2 & 6) == 0 ? (go1Var2.g(ea5Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= go1Var2.g(l13Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var2.i(tm1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= go1Var2.g(u8Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= go1Var2.i(tm1Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= go1Var2.i(tm1Var3) ? 131072 : 65536;
        }
        tc0 tc0Var2 = tc0Var;
        if ((1572864 & i2) == 0) {
            i5 |= go1Var2.i(tc0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var2.T(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object Q = go1Var2.Q();
            Object obj2 = de0.a;
            if (z2 || Q == obj2) {
                Q = new ai(ea5Var, u8Var);
                go1Var2.o0(Q);
            }
            ai aiVar2 = (ai) Q;
            boolean z3 = i6 == 4;
            Object Q2 = go1Var2.Q();
            Object obj3 = Q2;
            if (z3 || Q2 == obj2) {
                Object[] objArr = {ea5Var.a.d()};
                gt4 gt4Var3 = new gt4();
                gt4Var3.addAll(dq.o1(objArr));
                go1Var2.o0(gt4Var3);
                obj3 = gt4Var3;
            }
            gt4 gt4Var4 = (gt4) obj3;
            jk3 jk3Var2 = ea5Var.e;
            jk3 jk3Var3 = ea5Var.d;
            int i7 = i5;
            ss4 ss4Var = ea5Var.a;
            boolean g2 = go1Var2.g(jk3Var2.getValue()) | (i6 == 4);
            Object Q3 = go1Var2.Q();
            if (g2 || Q3 == obj2) {
                long[] jArr = ia4.a;
                Q3 = new n43();
                go1Var2.o0(Q3);
            }
            n43 n43Var2 = (n43) Q3;
            if (!gt4Var4.contains(ss4Var.d())) {
                gt4Var4.clear();
                gt4Var4.add(ss4Var.d());
            }
            if (j42.c(ss4Var.d(), jk3Var3.getValue()) && jk3Var2.getValue() == null) {
                if (gt4Var4.size() != 1 || !j42.c(gt4Var4.get(0), ss4Var.d())) {
                    gt4Var4.clear();
                    gt4Var4.add(ss4Var.d());
                }
                if (n43Var2.e != 1 || n43Var2.c(ss4Var.d())) {
                    n43Var2.a();
                }
                aiVar2.b = u8Var;
            }
            Object value = jk3Var2.getValue();
            if (value == null || value.equals(ss4Var.d())) {
                jk3Var = jk3Var2;
            } else {
                ListIterator listIterator = gt4Var4.listIterator();
                int i8 = 0;
                while (true) {
                    lk2 lk2Var = (lk2) listIterator;
                    if (!lk2Var.hasNext()) {
                        jk3Var = jk3Var2;
                        i4 = -1;
                        break;
                    }
                    jk3Var = jk3Var2;
                    if (j42.c(tm1Var2.invoke(lk2Var.next()), tm1Var2.invoke(value))) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                        jk3Var2 = jk3Var;
                    }
                }
                if (i4 == -1) {
                    gt4Var4.add(value);
                } else if (!j42.c(gt4Var4.get(i4), value)) {
                    gt4Var4.set(i4, value);
                }
            }
            if (!j42.c(ss4Var.d(), jk3Var3.getValue())) {
                ListIterator listIterator2 = gt4Var4.listIterator();
                int i9 = 0;
                while (true) {
                    lk2 lk2Var2 = (lk2) listIterator2;
                    if (!lk2Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (j42.c(tm1Var2.invoke(lk2Var2.next()), tm1Var2.invoke(jk3Var3.getValue()))) {
                            i3 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == -1) {
                    gt4Var4.add(jk3Var3.getValue());
                } else if (!j42.c(gt4Var4.get(i3), jk3Var3.getValue()) || i3 != gt4Var4.size() - 1) {
                    j42.c(jk3Var3.getValue(), gt4Var4.get(i3));
                    gt4Var4.remove(i3);
                    gt4Var4.add(jk3Var3.getValue());
                }
            }
            Object value2 = jk3Var.getValue();
            boolean g3 = go1Var2.g(value2);
            Object Q4 = go1Var2.Q();
            if (g3 || Q4 == obj2) {
                Q4 = value2 != null ? new ul3(aiVar2, jk3Var3.getValue(), value2) : null;
                go1Var2.o0(Q4);
            }
            ul3 ul3Var = (ul3) Q4;
            boolean g4 = go1Var2.g(ul3Var) | ((i7 & 458752) == 131072);
            Object Q5 = go1Var2.Q();
            if (!g4 && Q5 != obj2) {
                obj = Q5;
                y95Var = null;
            } else if (ul3Var != null && tm1Var3.invoke(ul3Var) != null) {
                zl1.c();
                return;
            } else {
                y95Var = null;
                go1Var2.o0(null);
                obj = null;
            }
            if (obj != null) {
                zl1.c();
                return;
            }
            if (n43Var2.b(jk3Var3.getValue()) && n43Var2.b(ss4Var.d()) && (value2 == null || n43Var2.b(value2))) {
                go1Var2.d0(-297322234);
                go1Var2.q(false);
                n43Var = n43Var2;
                y95Var2 = y95Var;
                aiVar = aiVar2;
                gt4Var = gt4Var4;
                tm1Var4 = tm1Var;
            } else {
                go1Var2.d0(-302069574);
                n43Var2.a();
                int size = gt4Var4.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10;
                    Object obj4 = gt4Var4.get(i11);
                    n43 n43Var3 = n43Var2;
                    n43Var3.m(obj4, p70.u0(427839334, new ph(obj4, ea5Var, ul3Var, tm1Var, aiVar2, gt4Var4, tc0Var2), go1Var2));
                    i10 = i11 + 1;
                    gt4Var4 = gt4Var4;
                    n43Var2 = n43Var3;
                    y95Var = y95Var;
                    tc0Var2 = tc0Var;
                }
                n43Var = n43Var2;
                y95Var2 = y95Var;
                aiVar = aiVar2;
                gt4Var = gt4Var4;
                tm1Var4 = tm1Var;
                go1Var2.q(false);
            }
            boolean g5 = go1Var2.g(ea5Var.g()) | go1Var2.g(aiVar) | go1Var2.g(jk3Var.getValue());
            Object Q6 = go1Var2.Q();
            if (g5 || Q6 == obj2) {
                Q6 = (si0) tm1Var4.invoke(aiVar);
                go1Var2.o0(Q6);
            }
            si0 si0Var = (si0) Q6;
            ea5 ea5Var2 = aiVar.a;
            boolean g6 = go1Var2.g(aiVar);
            Object Q7 = go1Var2.Q();
            if (g6 || Q7 == obj2) {
                Q7 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q7);
            }
            t43 t43Var = (t43) Q7;
            t43 x = ad4.x(si0Var.d, go1Var2);
            if (j42.c(ea5Var2.a.d(), ea5Var2.d.getValue())) {
                t43Var.setValue(Boolean.FALSE);
            } else if (x.getValue() != null) {
                t43Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            l13 l13Var2 = i13.a;
            if (booleanValue) {
                go1Var2.d0(1353077497);
                gt4Var2 = gt4Var;
                go1Var = go1Var2;
                y95Var3 = mw2.x(aiVar.a, p70.M, null, go1Var, 0, 2);
                boolean g7 = go1Var.g(y95Var3);
                Object Q8 = go1Var.Q();
                if (g7 || Q8 == obj2) {
                    Q8 = o7.n(l13Var2);
                    go1Var.o0(Q8);
                }
                l13Var2 = (l13) Q8;
                go1Var.q(false);
            } else {
                go1Var = go1Var2;
                gt4Var2 = gt4Var;
                go1Var.d0(1353343539);
                go1Var.q(false);
                y95Var3 = y95Var2;
            }
            l13 then = l13Var.then(l13Var2.then(new wh(y95Var3, x, aiVar)));
            Object Q9 = go1Var.Q();
            if (Q9 == obj2) {
                Q9 = new sh(aiVar);
                go1Var.o0(Q9);
            }
            sh shVar = (sh) Q9;
            long j2 = go1Var.T;
            int i12 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, shVar);
            qi4.k(go1Var, q8.b0, m2);
            qi4.i(go1Var, Integer.valueOf(i12));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            go1Var.d0(758586195);
            int size2 = gt4Var2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Object obj5 = gt4Var2.get(i13);
                go1Var.a0(1420119555, tm1Var2.invoke(obj5));
                hn1 hn1Var = (hn1) n43Var.g(obj5);
                if (hn1Var == null) {
                    go1Var.d0(1074069702);
                    z = false;
                } else {
                    z = false;
                    go1Var.d0(1420120731);
                    hn1Var.invoke(go1Var, 0);
                }
                go1Var.q(z);
                go1Var.q(z);
            }
            go1Var.q(false);
            go1Var.q(true);
        } else {
            tm1Var4 = tm1Var;
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jh(ea5Var, l13Var, tm1Var4, u8Var, tm1Var2, tm1Var3, tc0Var, i2);
        }
    }

    public static final void c0(fj0 fj0Var, Object obj) {
        if (!(fj0Var instanceof nx0)) {
            fj0Var.resumeWith(obj);
            return;
        }
        nx0 nx0Var = (nx0) fj0Var;
        vk0 vk0Var = nx0Var.L;
        fj0 fj0Var2 = nx0Var.M;
        Throwable a2 = h54.a(obj);
        Object ub0Var = a2 == null ? obj : new ub0(a2, false);
        if (e0(vk0Var, fj0Var2.getContext())) {
            nx0Var.N = ub0Var;
            nx0Var.K = 1;
            d0(vk0Var, fj0Var2.getContext(), nx0Var);
            return;
        }
        eb1 a3 = x65.a();
        if (a3.I >= 4294967296L) {
            nx0Var.N = ub0Var;
            nx0Var.K = 1;
            a3.b0(nx0Var);
            return;
        }
        a3.c0(true);
        try {
            v52 v52Var = (v52) fj0Var2.getContext().get(q8.r0);
            if (v52Var == null || v52Var.isActive()) {
                Object obj2 = nx0Var.O;
                tk0 context = fj0Var2.getContext();
                Object l0 = j42.l0(context, obj2);
                qd5 l02 = l0 != j42.s ? l0(fj0Var2, context, l0) : null;
                try {
                    fj0Var2.resumeWith(obj);
                } finally {
                    if (l02 == null || l02.j0()) {
                        j42.Y(context, l0);
                    }
                }
            } else {
                nx0Var.resumeWith(mu0.o(v52Var.t()));
            }
            while (a3.e0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r0 != null) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.hu2 r22, final defpackage.l13 r23, final int r24, final int r25, final boolean r26, final int r27, final boolean r28, final defpackage.tm1 r29, final defpackage.rm1 r30, final defpackage.q73 r31, defpackage.fe0 r32, final int r33) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.d(hu2, l13, int, int, boolean, int, boolean, tm1, rm1, q73, fe0, int):void");
    }

    public static final void d0(vk0 vk0Var, tk0 tk0Var, Runnable runnable) {
        try {
            vk0Var.dispatch(tk0Var, runnable);
        } catch (Throwable th) {
            throw new mx0(th, vk0Var, tk0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.oj r19, final defpackage.l13 r20, final defpackage.m65 r21, defpackage.tm1 r22, final int r23, boolean r24, final int r25, int r26, final java.util.Map r27, defpackage.g80 r28, defpackage.fe0 r29, final int r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.e(oj, l13, m65, tm1, int, boolean, int, int, java.util.Map, g80, fe0, int, int, int):void");
    }

    public static final boolean e0(vk0 vk0Var, tk0 tk0Var) {
        try {
            return vk0Var.isDispatchNeeded(tk0Var);
        } catch (Throwable th) {
            throw new mx0(th, vk0Var, tk0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r21, final defpackage.l13 r22, final defpackage.m65 r23, int r24, boolean r25, final int r26, int r27, defpackage.g80 r28, defpackage.fe0 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.f(java.lang.String, l13, m65, int, boolean, int, int, g80, fe0, int, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String f0(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static iz g(int i2, int i3, ez ezVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        ez ezVar2 = ez.I;
        if (i4 != 0) {
            ezVar = ezVar2;
        }
        if (i2 == -2) {
            if (ezVar != ezVar2) {
                return new wf0(1, ezVar);
            }
            k20.b.getClass();
            return new iz(j20.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? ezVar == ezVar2 ? new iz(i2) : new wf0(i2, ezVar) : new iz(Log.LOG_LEVEL_OFF) : ezVar == ezVar2 ? new iz(0) : new wf0(1, ezVar);
        }
        if (ezVar == ezVar2) {
            return new wf0(1, ez.J);
        }
        s83.t("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static ku4 g0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new ku4(f2, f3, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(float r21, float r22, float r23, float r24, defpackage.v80 r25) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.h(float, float, float, float, v80):long");
    }

    public static final l13 h0(l13 l13Var, oj ojVar, m65 m65Var, tm1 tm1Var, int i2, boolean z, int i3, int i4, kj1 kj1Var, List list, tm1 tm1Var2, g80 g80Var, tm1 tm1Var3) {
        return l13Var.then(i13.a).then(new n25(ojVar, m65Var, kj1Var, tm1Var, i2, z, i3, i4, list, tm1Var2, g80Var, tm1Var3));
    }

    public static final long i(int i2) {
        long j2 = i2 << 32;
        int i3 = x70.h;
        return j2;
    }

    public static final int i0(long j2) {
        float[] fArr = z80.a;
        return (int) (x70.b(j2, z80.e) >>> 32);
    }

    public static final long j(long j2) {
        long j3 = j2 << 32;
        int i2 = x70.h;
        return j3;
    }

    public static final si0 j0(ta1 ta1Var, bc1 bc1Var) {
        return new si0(ta1Var, bc1Var, 0.0f, new vq4(qh.J));
    }

    public static long k(int i2, int i3, int i4) {
        return i(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static qb5 k0(int i2, int i3, l61 l61Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            l61Var = m61.a;
        }
        return new qb5(i2, i4, l61Var);
    }

    public static final void l(l13 l13Var, long j2, long j3, dn4 dn4Var, List list, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var;
        dn4 dn4Var2;
        List list2;
        int i4;
        dn4 a2;
        List list3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(663218740);
        if ((i2 & 6) == 0) {
            i3 = (go1Var2.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var2.f(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var2.f(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if (go1Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            go1Var2.Y();
            if ((i2 & 1) == 0 || go1Var2.C()) {
                float f2 = fq2.a;
                i4 = i3 & (-64513);
                a2 = in4.a(o7.o, go1Var2);
                list3 = fq2.c;
            } else {
                go1Var2.W();
                i4 = i3 & (-64513);
                a2 = dn4Var;
                list3 = list;
            }
            go1Var2.r();
            go1Var = go1Var2;
            q(l13Var, j2, j3, a2, list3, go1Var, i4 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            dn4Var2 = a2;
            list2 = list3;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            dn4Var2 = dn4Var;
            list2 = list;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new gq2(l13Var, j2, j3, dn4Var2, list2, i2, (byte) 0);
        }
    }

    public static final qd5 l0(fj0 fj0Var, tk0 tk0Var, Object obj) {
        qd5 qd5Var = null;
        if ((fj0Var instanceof fl0) && tk0Var.get(n10.K) != null) {
            fl0 fl0Var = (fl0) fj0Var;
            while (true) {
                if ((fl0Var instanceof ox0) || (fl0Var = fl0Var.getCallerFrame()) == null) {
                    break;
                }
                if (fl0Var instanceof qd5) {
                    qd5Var = (qd5) fl0Var;
                    break;
                }
            }
            if (qd5Var != null) {
                qd5Var.l0(tk0Var, obj);
            }
        }
        return qd5Var;
    }

    public static final nu0 m(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        ik1 a2 = jk1.a(f2);
        if (a2 == null) {
            a2 = new rj2(f2);
        }
        return new nu0(f3, f2, a2);
    }

    public static final void n(final boolean z, final boolean z2, final rm1 rm1Var, final rm1 rm1Var2, final String str, final String str2, fe0 fe0Var, final int i2) {
        int i3;
        float f2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(430900235);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.h(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(rm1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.i(rm1Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go1Var.g(str2) ? 131072 : 65536;
        }
        if (go1Var.T(i3 & 1, (74899 & i3) != 74898)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            l13 p2 = mw2.p(nq4.c, ((fw2) go1Var.k(i51Var)).a.p, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p2);
            xd0.c.getClass();
            go1Var.h0();
            boolean z3 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            tv tvVar = q8.W;
            int i5 = i3;
            ba0 a2 = z90.a(i42.d, tvVar, go1Var, 48);
            long j3 = go1Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            i13 i13Var = i13.a;
            l13 x02 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i6, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            byte b2 = 2;
            ut0.a(vt0.M(go1Var, R.mipmap.ic_launcher_foreground), "myDV", o7.m(nq4.k(i13Var, 80.0f), l74.a(20.0f)), null, li0.b, 0.0f, null, go1Var, rj3.$stable | 24624, 104);
            oh4.a(go1Var, nq4.g(i13Var, 16.0f));
            r55.b("myDV", null, k80Var.q, oh4.j(32), qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 1597446, 0, 262058);
            go1Var = go1Var;
            oh4.a(go1Var, nq4.g(i13Var, 24.0f));
            if (z) {
                go1Var.d0(-1385935885);
                p70.o(str, null, go1Var, (i5 >> 12) & 14, 2);
                go1Var.q(false);
                f2 = 24.0f;
            } else if (z2) {
                f2 = 24.0f;
                go1Var.d0(-1385415953);
                boolean z4 = str2 == null || jx4.L(str2);
                p70.q(!z4 ? e21.t() : li4.g(), "暂无视频", null, !z4 ? str2 : "请检查网络或认证配置", !z4 ? rw4.J : rw4.I, false, p70.u0(1539915653, new qi3(rm1Var2, rm1Var, b2), go1Var), go1Var, 1572912, 36);
                go1Var.q(false);
            } else {
                go1Var.d0(-1385836995);
                f2 = 24.0f;
                p70.q(a5.K(), "请先配置Cookie", null, null, rw4.K, false, p70.u0(1821327781, new ut1(rm1Var, (byte) 3), go1Var), go1Var, 1597488, 44);
                go1Var.q(false);
            }
            oh4.a(go1Var, nq4.g(i13Var, 40.0f));
            e41.d(i42.E0(i13Var, f2, 0.0f, 2), new kp(r13.e(go1Var) ? 16.0f : f2, true, new w7(tvVar, b2)), new kp(10.0f, true, new y9()), null, 0, 0, p70.u0(1186047114, new dd0((byte) 4), go1Var), go1Var, 1573254, 56);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: gj5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qb.n(z, z2, rm1Var, rm1Var2, str, str2, (fe0) obj, mu0.X(i2 | 1));
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [tm1] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, y55] */
    public static final void o(final l13 l13Var, final oj ojVar, final tm1 tm1Var, final boolean z, final Map map, final m65 m65Var, final int i2, final boolean z2, final int i3, final int i4, final kj1 kj1Var, final g80 g80Var, final tm1 tm1Var2, fe0 fe0Var, final int i5, final int i6) {
        int i7;
        int i8;
        y55 y55Var;
        ka kaVar;
        uj3 uj3Var;
        t43 t43Var;
        List list;
        t43 t43Var2;
        y55 y55Var2;
        ?? r26;
        Object obj;
        boolean z3;
        ?? r2;
        Object obj2;
        ?? r5 = (go1) fe0Var;
        r5.f0(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (r5.g(l13Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r5.g(ojVar) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= r5.i(tm1Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= r5.h(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= r5.i(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= r5.g(m65Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= r5.e(i2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= r5.h(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= r5.e(i3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= r5.e(i4) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (r5.i(kj1Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= r5.i(null) ? 32 : 16;
        }
        if ((i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= r5.i(g80Var) ? 256 : 128;
        }
        int i9 = i7;
        if ((i6 & 3072) == 0) {
            i8 |= r5.i(tm1Var2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? r5.g(null) : r5.i(null) ? 16384 : 8192;
        }
        if (r5.T(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean x = fb4.x(ojVar);
            jp jpVar = de0.a;
            if (x) {
                r5.d0(145641571);
                boolean z4 = (i9 & 112) == 32;
                ?? Q = r5.Q();
                y55 y55Var3 = Q;
                if (z4 || Q == jpVar) {
                    y55 y55Var4 = new y55(ojVar);
                    r5.o0(y55Var4);
                    y55Var3 = y55Var4;
                }
                y55Var = y55Var3;
                r5.q(false);
            } else {
                r5.d0(145707228);
                r5.q(false);
                y55Var = null;
            }
            if (fb4.x(ojVar)) {
                r5.d0(145905443);
                boolean g2 = ((i9 & 112) == 32) | r5.g(y55Var);
                ?? Q2 = r5.Q();
                ka kaVar2 = Q2;
                if (g2 || Q2 == jpVar) {
                    ka kaVar3 = new ka(y55Var, ojVar, (byte) 7);
                    r5.o0(kaVar3);
                    kaVar2 = kaVar3;
                }
                kaVar = kaVar2;
                r5.q(false);
            } else {
                r5.d0(146002721);
                boolean z5 = (i9 & 112) == 32;
                Object Q3 = r5.Q();
                Object obj3 = Q3;
                if (z5 || Q3 == jpVar) {
                    ce ceVar = new ce(ojVar, (byte) 6);
                    r5.o0(ceVar);
                    obj3 = ceVar;
                }
                kaVar = (rm1) obj3;
                r5.q(false);
            }
            if (z) {
                uj3Var = rj.c(ojVar, map);
                t43Var = null;
            } else {
                uj3Var = new uj3(null, null);
                t43Var = null;
            }
            List list2 = (List) uj3Var.I;
            List list3 = (List) uj3Var.J;
            if (z) {
                r5.d0(146318828);
                ?? Q4 = r5.Q();
                jk3 jk3Var = Q4;
                if (Q4 == jpVar) {
                    jk3 w = ad4.w(t43Var);
                    r5.o0(w);
                    jk3Var = w;
                }
                list = list3;
                r5.q(false);
                t43Var2 = jk3Var;
            } else {
                list = list3;
                r5.d0(146406588);
                r5.q(false);
                t43Var2 = t43Var;
            }
            if (z) {
                r5.d0(146499837);
                boolean g3 = r5.g(t43Var2);
                y55Var2 = y55Var;
                Object Q5 = r5.Q();
                Object obj4 = Q5;
                if (g3 || Q5 == jpVar) {
                    uf ufVar = new uf(t43Var2, (byte) 5);
                    r5.o0(ufVar);
                    obj4 = ufVar;
                }
                r5.q(false);
                r26 = (tm1) obj4;
            } else {
                y55Var2 = y55Var;
                r5.d0(146571260);
                r5.q(false);
                r26 = t43Var;
            }
            int i10 = (i9 >> 3) & 14;
            t43 t43Var3 = t43Var2;
            List list4 = list;
            final ?? r8 = y55Var2;
            mv.a(ojVar, m65Var, kj1Var, list2, z2, r5);
            oj ojVar2 = (oj) kaVar.invoke();
            boolean i11 = r5.i(r8) | ((i9 & 896) == 256);
            Object Q6 = r5.Q();
            Object obj5 = Q6;
            if (i11 || Q6 == jpVar) {
                hv hvVar = new hv(r8, tm1Var, (byte) 0);
                r5.o0(hvVar);
                obj5 = hvVar;
            }
            l13 h0 = h0(l13Var, ojVar2, m65Var, (tm1) obj5, i2, z2, i3, i4, kj1Var, list2, r26, g80Var, tm1Var2);
            if (z) {
                r5.d0(147956465);
                boolean i12 = r5.i(r8);
                Object Q7 = r5.Q();
                Object obj6 = Q7;
                if (i12 || Q7 == jpVar) {
                    final byte b2 = 1;
                    rm1 rm1Var = new rm1() { // from class: iv
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            t55 t55Var;
                            t55 t55Var2;
                            byte b3 = b2;
                            boolean z6 = false;
                            oj ojVar3 = null;
                            y55 y55Var5 = r8;
                            switch (b3) {
                                case 0:
                                    if (y55Var5 != null) {
                                        oj ojVar4 = y55Var5.b;
                                        u55 u55Var = (u55) y55Var5.a.getValue();
                                        if (u55Var != null && (t55Var = u55Var.a) != null) {
                                            ojVar3 = t55Var.a;
                                        }
                                        z6 = j42.c(ojVar4, ojVar3);
                                    }
                                    return Boolean.valueOf(z6);
                                default:
                                    if (y55Var5 != null) {
                                        oj ojVar5 = y55Var5.b;
                                        u55 u55Var2 = (u55) y55Var5.a.getValue();
                                        if (u55Var2 != null && (t55Var2 = u55Var2.a) != null) {
                                            ojVar3 = t55Var2.a;
                                        }
                                        z6 = j42.c(ojVar5, ojVar3);
                                    }
                                    return Boolean.valueOf(z6);
                            }
                        }
                    };
                    r5.o0(rm1Var);
                    obj6 = rm1Var;
                }
                rm1 rm1Var2 = (rm1) obj6;
                boolean g4 = r5.g(t43Var3);
                Object Q8 = r5.Q();
                Object obj7 = Q8;
                if (g4 || Q8 == jpVar) {
                    sf sfVar = new sf(t43Var3, (byte) 2);
                    r5.o0(sfVar);
                    obj7 = sfVar;
                }
                le leVar = new le(rm1Var2, (rm1) obj7, (byte) 1);
                r5.q(false);
                obj = leVar;
            } else {
                r5.d0(147779703);
                boolean i13 = r5.i(r8);
                Object Q9 = r5.Q();
                if (i13 || Q9 == jpVar) {
                    r2 = 0;
                    final boolean z6 = false ? 1 : 0;
                    rm1 rm1Var3 = new rm1() { // from class: iv
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            t55 t55Var;
                            t55 t55Var2;
                            byte b3 = z6;
                            boolean z62 = false;
                            oj ojVar3 = null;
                            y55 y55Var5 = r8;
                            switch (b3) {
                                case 0:
                                    if (y55Var5 != null) {
                                        oj ojVar4 = y55Var5.b;
                                        u55 u55Var = (u55) y55Var5.a.getValue();
                                        if (u55Var != null && (t55Var = u55Var.a) != null) {
                                            ojVar3 = t55Var.a;
                                        }
                                        z62 = j42.c(ojVar4, ojVar3);
                                    }
                                    return Boolean.valueOf(z62);
                                default:
                                    if (y55Var5 != null) {
                                        oj ojVar5 = y55Var5.b;
                                        u55 u55Var2 = (u55) y55Var5.a.getValue();
                                        if (u55Var2 != null && (t55Var2 = u55Var2.a) != null) {
                                            ojVar3 = t55Var2.a;
                                        }
                                        z62 = j42.c(ojVar5, ojVar3);
                                    }
                                    return Boolean.valueOf(z62);
                            }
                        }
                    };
                    r5.o0(rm1Var3);
                    obj2 = rm1Var3;
                } else {
                    r2 = 0;
                    obj2 = Q9;
                }
                obj = new jk2((rm1) obj2, (byte) r2);
                r5.q(r2);
            }
            int Q10 = i82.Q(r5.T);
            am3 m2 = r5.m();
            l13 x0 = i42.x0(r5, h0);
            xd0.c.getClass();
            r5.h0();
            if (r5.S) {
                r5.l(wa2.A0);
            } else {
                r5.r0();
            }
            qi4.k(r5, q8.c0, obj);
            qi4.k(r5, q8.b0, m2);
            qi4.k(r5, q8.d0, Integer.valueOf(Q10));
            qi4.j(r5);
            qi4.k(r5, q8.a0, x0);
            if (r8 == 0) {
                r5.d0(-433557001);
                z3 = false;
            } else {
                z3 = false;
                r5.d0(-291080374);
                r8.a(r5, 0);
            }
            r5.q(z3);
            if (list4 == null) {
                r5.d0(-433506223);
            } else {
                r5.d0(-433506222);
                rj.a(ojVar, list4, r5, i10);
            }
            r5.q(z3);
            r5.q(true);
        } else {
            r5.W();
        }
        x04 u = r5.u();
        if (u != null) {
            u.d = new hn1() { // from class: jv
                @Override // defpackage.hn1
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int X = mu0.X(i5 | 1);
                    int X2 = mu0.X(i6);
                    qb.o(l13.this, ojVar, tm1Var, z, map, m65Var, i2, z2, i3, i4, kj1Var, g80Var, tm1Var2, (fe0) obj8, X, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void p(l13 l13Var, long j2, List list, fe0 fe0Var, int i2) {
        int i3;
        long j3;
        l13 l13Var2;
        List list2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(387862047);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.f(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            go1Var.Y();
            if ((i2 & 1) == 0 || go1Var.C()) {
                list = fq2.c;
            } else {
                go1Var.W();
            }
            int i4 = i3 & (-897);
            List list3 = list;
            go1Var.r();
            long j4 = x70.g;
            float f2 = fq2.a;
            j3 = j2;
            q(l13Var, j4, j3, in4.a(o7.o, go1Var), list3, go1Var, (i4 & 14) | 48 | ((i4 << 3) & 896));
            l13Var2 = l13Var;
            list2 = list3;
        } else {
            j3 = j2;
            l13Var2 = l13Var;
            go1Var.W();
            list2 = list;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ev0(l13Var2, j3, list2, i2);
        }
    }

    public static final void q(l13 l13Var, long j2, final long j3, dn4 dn4Var, List list, fe0 fe0Var, int i2) {
        int i3;
        int i4;
        float f2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1776169461);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.f(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.f(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.g(dn4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.i(list) ? 16384 : 8192;
        }
        if (!go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            go1Var.W();
        } else {
            if (list.size() <= 1) {
                s83.t("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
            boolean g2 = go1Var.g(list);
            Object Q = go1Var.Q();
            Object obj = de0.a;
            if (g2 || Q == obj) {
                mk2 K = p70.K();
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        i4 = i6;
                        K.add(new y13(((n74) list.get(i5)).b(), ((n74) list.get(i6)).b()));
                    } else {
                        i4 = i6;
                        K.add(new y13(((n74) list.get(i5)).b(), ((n74) list.get(0)).b()));
                    }
                    i5 = i4;
                }
                Q = p70.D(K);
                go1Var.o0(Q);
            }
            final List list2 = (List) Q;
            boolean g3 = go1Var.g(list);
            Object Q2 = go1Var.Q();
            if (g3 || Q2 == obj) {
                float[] fArr = new float[4];
                int size2 = list.size();
                float f3 = 1.0f;
                int i7 = 0;
                f2 = 0.0f;
                while (i7 < size2) {
                    int i8 = size2;
                    n74 n74Var = (n74) list.get(i7);
                    n74.a(n74Var, fArr, 2);
                    mk2 mk2Var = n74Var.c;
                    int i9 = i7;
                    long j4 = n74Var.b;
                    int c2 = mk2Var.c();
                    float[] fArr2 = fArr;
                    float f4 = 0.0f;
                    int i10 = 0;
                    while (i10 < c2) {
                        km0 km0Var = (km0) mk2Var.get(i10);
                        int i11 = c2;
                        float V = km0Var.a[0] - sp0.V(j4);
                        float W = km0Var.a[1] - sp0.W(j4);
                        float f5 = sg5.b;
                        mk2 mk2Var2 = mk2Var;
                        long c3 = km0Var.c(0.5f);
                        float V2 = sp0.V(c3) - sp0.V(j4);
                        float W2 = sp0.W(c3) - sp0.W(j4);
                        f4 = Math.max(f4, Math.max((W * W) + (V * V), (W2 * W2) + (V2 * V2)));
                        i10++;
                        c2 = i11;
                        mk2Var = mk2Var2;
                    }
                    float sqrt = (float) Math.sqrt(f4);
                    float[] fArr3 = {sp0.V(j4) - sqrt, sp0.W(j4) - sqrt, sp0.V(j4) + sqrt, sp0.W(j4) + sqrt};
                    f3 = Math.min(f3, Math.max((fArr2[2] - fArr2[0]) / (fArr3[2] - fArr3[0]), (fArr2[3] - fArr2[1]) / (fArr3[3] - fArr3[1])));
                    i7 = i9 + 1;
                    fArr = fArr2;
                    size2 = i8;
                }
                Q2 = Float.valueOf(f3 * fq2.d);
                go1Var.o0(Q2);
            } else {
                f2 = 0.0f;
            }
            final float floatValue = ((Number) Q2).floatValue();
            Object Q3 = go1Var.Q();
            if (Q3 == obj) {
                Q3 = p70.a(f2);
                go1Var.o0(Q3);
            }
            final bh bhVar = (bh) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == obj) {
                Q4 = new fk3(90.0f);
                go1Var.o0(Q4);
            }
            final fk3 fk3Var = (fk3) Q4;
            Object Q5 = go1Var.Q();
            if (Q5 == obj) {
                Q5 = p70.a(f2);
                go1Var.o0(Q5);
            }
            final bh bhVar2 = (bh) Q5;
            boolean g4 = go1Var.g(list);
            Object Q6 = go1Var.Q();
            if (g4 || Q6 == obj) {
                Q6 = new gk3(0);
                go1Var.o0(Q6);
            }
            final s33 s33Var = (s33) Q6;
            boolean i12 = go1Var.i(bhVar) | go1Var.g(s33Var) | go1Var.i(list2) | go1Var.i(bhVar2);
            Object Q7 = go1Var.Q();
            if (i12 || Q7 == obj) {
                Q7 = new jq2(bhVar, list2, s33Var, fk3Var, bhVar2, null);
                go1Var.o0(Q7);
            }
            mw2.h(go1Var, (hn1) Q7, list);
            Object Q8 = go1Var.Q();
            if (Q8 == obj) {
                Q8 = ae.a();
                go1Var.o0(Q8);
            }
            final yd ydVar = (yd) Q8;
            Object Q9 = go1Var.Q();
            if (Q9 == obj) {
                Object nw2Var = new nw2(nw2.a());
                go1Var.o0(nw2Var);
                Q9 = nw2Var;
            }
            final float[] fArr4 = ((nw2) Q9).a;
            l13 p2 = mw2.p(o7.m(nq4.l(oi4.a(l13Var, true, new u73((byte) 16)), fq2.a, fq2.b).then(nq4.c), dn4Var), j2, mw2.j);
            uw2 c4 = px.c(q8.N, false);
            long j5 = go1Var.T;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c4);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i13));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            l13 e2 = j42.e(i13.a, 1.0f, true);
            boolean i14 = go1Var.i(bhVar) | go1Var.i(bhVar2) | go1Var.i(list2) | go1Var.g(s33Var) | go1Var.i(ydVar) | go1Var.d(floatValue) | go1Var.i(fArr4) | ((i3 & 896) == 256);
            Object Q10 = go1Var.Q();
            if (i14 || Q10 == obj) {
                Object obj2 = new tm1() { // from class: hq2
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj3) {
                        List list3 = list2;
                        yd ydVar2 = ydVar;
                        float f6 = floatValue;
                        float[] fArr5 = fArr4;
                        long j6 = j3;
                        s33 s33Var2 = s33Var;
                        float floatValue2 = ((Number) bh.this.d()).floatValue();
                        float h2 = fk3Var.h();
                        float floatValue3 = ((Number) bhVar2.d()).floatValue() + h2 + (90.0f * floatValue2);
                        ya2 ya2Var = (ya2) ((zh0) obj3);
                        long Y = ya2Var.I.Y();
                        pn pnVar = ya2Var.I.J;
                        long H = pnVar.H();
                        pnVar.q().f();
                        try {
                            ((ep) pnVar.b).F(Y, floatValue3);
                            li4.r((y13) list3.get(((gk3) s33Var2).h()), floatValue2, ydVar2);
                            long c5 = ya2Var.c();
                            nw2.d(fArr5);
                            nw2.g(fArr5, Float.intBitsToFloat((int) (c5 >> 32)) * f6, Float.intBitsToFloat((int) (4294967295L & c5)) * f6, 4);
                            ydVar2.f(fArr5);
                            ydVar2.g(pd3.e(ad4.q(c5), ydVar2.a().b()));
                            r7.k(ya2Var, ydVar2, j6, me1.a, 52);
                            r7.H(pnVar, H);
                            return wd5.a;
                        } catch (Throwable th) {
                            r7.H(pnVar, H);
                            throw th;
                        }
                    }
                };
                go1Var.o0(obj2);
                Q10 = obj2;
            }
            oh4.a(go1Var, j42.v(e2, (tm1) Q10));
            go1Var.q(true);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new gq2(l13Var, j2, j3, dn4Var, list, i2, (byte) 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long r(float r17, float r18, float r19, float r20, defpackage.v80 r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.r(float, float, float, float, v80):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final defpackage.hu2 r82, defpackage.l13 r83, final int r84, final boolean r85, final int r86, final defpackage.rm1 r87, final boolean r88, defpackage.zd1 r89, java.lang.String r90, defpackage.ab4 r91, defpackage.fe0 r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 2875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.s(hu2, l13, int, boolean, int, rm1, boolean, zd1, java.lang.String, ab4, fe0, int, int):void");
    }

    public static final void t(dl0 dl0Var, t43 t43Var, t43 t43Var2, t43 t43Var3, String str, boolean z) {
        t43Var.setValue(str);
        t43Var2.setValue(Boolean.valueOf(z));
        p70.g0(dl0Var, null, null, new dg5(str, t43Var, t43Var3, t43Var2, null, (byte) 1), 3);
    }

    public static final l13 u(l13 l13Var, pm4 pm4Var) {
        return l13Var.then(new iy(pm4Var));
    }

    public static final Set v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof p00) {
            return ((p00) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int f2 = serialDescriptor.f();
        for (int i2 = 0; i2 < f2; i2++) {
            hashSet.add(serialDescriptor.g(i2));
        }
        return hashSet;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String w(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        if (r15 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00da, code lost:
    
        r5.addLast(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e1, code lost:
    
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.pj4 r25, defpackage.ke1 r26, defpackage.pp r27, defpackage.ok3 r28, boolean r29, boolean r30, defpackage.fu r31) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.x(pj4, ke1, pp, ok3, boolean, boolean, fu):java.lang.Object");
    }

    public static final Object y(cu4 cu4Var, int i2) {
        Object obj;
        cu4Var.getClass();
        int g2 = o7.g(cu4Var.L, i2, cu4Var.J);
        if (g2 < 0 || (obj = cu4Var.K[g2]) == p) {
            return null;
        }
        return obj;
    }

    public static final SerialDescriptor[] z(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? k : serialDescriptorArr;
    }
}
