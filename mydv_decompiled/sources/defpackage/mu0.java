package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.view.View;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class mu0 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;

    public static final hx1 B() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(4.0f, 6.47f);
        epVar.x(5.76f, 10.0f);
        epVar.u(20.0f);
        epVar.M(8.0f);
        epVar.u(4.0f);
        epVar.L(6.47f);
        epVar.z(22.0f, 4.0f);
        epVar.v(-4.0f);
        epVar.y(2.0f, 4.0f);
        epVar.v(-3.0f);
        epVar.y(-2.0f, -4.0f);
        epVar.v(-2.0f);
        epVar.y(2.0f, 4.0f);
        epVar.v(-3.0f);
        epVar.y(-2.0f, -4.0f);
        epVar.u(8.0f);
        epVar.y(2.0f, 4.0f);
        epVar.u(7.0f);
        epVar.x(5.0f, 4.0f);
        epVar.u(4.0f);
        epVar.r(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        epVar.x(2.0f, 18.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(16.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.L(4.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final sq3 C(View view) {
        sq3 sq3Var = (sq3) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (sq3Var != null) {
            return sq3Var;
        }
        sq3 sq3Var2 = new sq3();
        view.setTag(R.id.pooling_container_listener_holder_tag, sq3Var2);
        return sq3Var2;
    }

    public static final hx1 D() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(15.5f, 14.0f);
        epVar.v(-0.79f);
        epVar.y(-0.28f, -0.27f);
        epVar.q(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        epVar.q(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        epVar.C(3.0f, 5.91f, 3.0f, 9.5f);
        epVar.C(5.91f, 16.0f, 9.5f, 16.0f);
        epVar.r(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        epVar.y(0.27f, 0.28f);
        epVar.M(0.79f);
        epVar.y(5.0f, 4.99f);
        epVar.x(20.49f, 19.0f);
        epVar.y(-4.99f, -5.0f);
        epVar.p();
        epVar.z(9.5f, 14.0f);
        epVar.q(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        epVar.C(7.01f, 5.0f, 9.5f, 5.0f);
        epVar.C(14.0f, 7.01f, 14.0f, 9.5f);
        epVar.C(11.99f, 14.0f, 9.5f, 14.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static final int E(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int f = serialDescriptor.f();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(f > 0)) {
                break;
            }
            int i3 = f - 1;
            int i4 = i * 31;
            String a2 = serialDescriptor.i(serialDescriptor.f() - f).a();
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            i = i4 + i2;
            f = i3;
        }
        int f2 = serialDescriptor.f();
        int i5 = 1;
        while (true) {
            if (!(f2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = f2 - 1;
            int i7 = i5 * 31;
            qi4 e = serialDescriptor.i(serialDescriptor.f() - f2).e();
            i5 = i7 + (e != null ? e.hashCode() : 0);
            f2 = i6;
        }
    }

    public static final long F(long j) {
        if (j < 0) {
            jp jpVar = t41.J;
            return t41.L;
        }
        jp jpVar2 = t41.J;
        return t41.K;
    }

    public static fj0 G(fj0 fj0Var) {
        fj0 intercepted;
        fj0Var.getClass();
        gj0 gj0Var = fj0Var instanceof gj0 ? (gj0) fj0Var : null;
        return (gj0Var == null || (intercepted = gj0Var.intercepted()) == null) ? fj0Var : intercepted;
    }

    public static final void H(c8 c8Var, String str) {
        c8Var.r("Trailing comma before the end of JSON ".concat(str), c8Var.b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void I(w31 w31Var) {
        if (w31Var.getNode().isAttached()) {
            ut0.S(w31Var, 1).S0();
        }
    }

    public static final void J(go1 go1Var, hn1 hn1Var) {
        hn1Var.getClass();
        p70.A(2, hn1Var);
        hn1Var.invoke(go1Var, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.g75 r4, defpackage.pd0 r5, java.lang.Throwable r6, defpackage.gj0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.gg1
            if (r0 == 0) goto L13
            r0 = r7
            gg1 r0 = (defpackage.gg1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            gg1 r0 = new gg1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.K
            wd5 r2 = defpackage.wd5.a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            java.lang.Throwable r6 = r0.I
            V(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L42
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L32:
            V(r7)
            r0.I = r6     // Catch: java.lang.Throwable -> L29
            r0.K = r3     // Catch: java.lang.Throwable -> L29
            r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            el0 r4 = defpackage.el0.I
            if (r2 != r4) goto L41
            return r4
        L41:
            return r2
        L42:
            if (r6 == 0) goto L49
            if (r6 == r4) goto L49
            defpackage.sv2.i(r4, r6)
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.K(g75, pd0, java.lang.Throwable, gj0):java.lang.Object");
    }

    public static final boolean L(ui1 ui1Var) {
        wa2 wa2Var;
        na3 coordinator$ui;
        wa2 wa2Var2;
        na3 coordinator$ui2 = ui1Var.getCoordinator$ui();
        return (coordinator$ui2 == null || (wa2Var = coordinator$ui2.c0) == null || !wa2Var.L() || (coordinator$ui = ui1Var.getCoordinator$ui()) == null || (wa2Var2 = coordinator$ui.c0) == null || !wa2Var2.K()) ? false : true;
    }

    public static double[] M(double[] dArr, double[][] dArr2) {
        dArr.getClass();
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    public static final CharSequence N(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String O(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return hf1.z(sb, str != null ? r7.C(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(k13 k13Var, rm1 rm1Var) {
        ld3 ownerScope$ui = k13Var.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new ld3((kd3) k13Var);
            k13Var.setOwnerScope$ui(ownerScope$ui);
        }
        sh3 snapshotObserver = ut0.V(k13Var).getSnapshotObserver();
        snapshotObserver.a.d(ownerScope$ui, ld3.J, rm1Var);
    }

    public static final h94 Q(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(1967007413);
        Object[] objArr = new Object[0];
        Object Q = go1Var.Q();
        if (Q == de0.a) {
            Q = new gw2((byte) 21);
            go1Var.o0(Q);
        }
        h94 h94Var = (h94) ut0.O(objArr, h94.M, (rm1) Q, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        h94Var.K = (j94) go1Var.k(l94.a);
        go1Var.q(false);
        return h94Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long R(long r34, long r36) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.R(long, long):long");
    }

    public static final long S(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        x41 x41Var = x41.NANOSECONDS;
        if (j4 >= 0) {
            return sp0.o0(j3, x41Var);
        }
        x41 x41Var2 = x41.MILLISECONDS;
        if (x41Var.compareTo(x41Var2) >= 0) {
            return t41.j(F(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        jp jpVar = t41.J;
        return t41.g(sp0.o0(j5, x41Var2), sp0.o0(j6, x41Var));
    }

    public static final void V(Object obj) {
        if (obj instanceof g54) {
            throw ((g54) obj).I;
        }
    }

    public static final String W(SerialDescriptor serialDescriptor) {
        return o70.Z0(ut0.c0(0, serialDescriptor.f()), ", ", serialDescriptor.a() + '(', ")", 0, new tf2(serialDescriptor, (byte) 17), 24);
    }

    public static final int X(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static Object Y(hn1 hn1Var, Object obj, fj0 fj0Var) {
        hn1Var.getClass();
        tk0 context = fj0Var.getContext();
        Object m42Var = context == l91.I ? new m42(fj0Var) : new n42(fj0Var, context);
        p70.A(2, hn1Var);
        return hn1Var.invoke(obj, m42Var);
    }

    public static lu0 a() {
        return new lu0(1.0f, 1.0f);
    }

    public static final void b(String str, String str2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1563223642);
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            r55.b(str, i42.D0(mw2.p(o7.m(i13Var, jo.a), k80Var.l, mw2.j), 8.0f, 4.0f), k80Var.m, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, 1572870, 0, 131000);
            r55.b(str2, null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, 6, 0, 131066);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uh0((byte) 3, i, str, str2);
        }
    }

    public static final m02 c(String str, KSerializer kSerializer) {
        return new m02(str, new n02(kSerializer));
    }

    public static final w62 d(SerialDescriptor serialDescriptor) {
        String str = "Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.e() + '\'';
        serialDescriptor.a();
        return new w62(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void e(tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-709502251);
        byte b2 = 0;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            xx3 xx3Var = l94.a;
            j94 j94Var = (j94) go1Var.k(xx3Var);
            h94 Q = Q(go1Var);
            Object[] objArr = {j94Var};
            byte b3 = 10;
            da daVar = new da(new sg((byte) 23), new m1(j94Var, Q, (byte) 9), b3);
            boolean i2 = go1Var.i(j94Var) | go1Var.i(Q);
            Object Q2 = go1Var.Q();
            if (i2 || Q2 == de0.a) {
                Q2 = new k9(j94Var, Q, b3);
                go1Var.o0(Q2);
            }
            eg2 eg2Var = (eg2) ut0.O(objArr, daVar, (rm1) Q2, go1Var, 0);
            mw2.b(xx3Var.a(eg2Var), p70.u0(-412824043, new uh0(tc0Var, eg2Var), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fg2(tc0Var, i, b2);
        }
    }

    public static final void f(final is0 is0Var, final l13 l13Var, ji3 ji3Var, q8 q8Var, tv tvVar, is4 is4Var, final boolean z, final tm1 tm1Var, a93 a93Var, q8 q8Var2, sc scVar, final tc0 tc0Var, fe0 fe0Var, final int i) {
        final ji3 ji3Var2;
        final q8 q8Var3;
        final tv tvVar2;
        final is4 is4Var2;
        final a93 a93Var2;
        final q8 q8Var4;
        final sc scVar2;
        byte b2;
        Object is4Var3;
        is4 is4Var4;
        int i2;
        int i3;
        ji3 ji3Var3;
        sc b3;
        a93 a93Var3;
        q8 q8Var5;
        tv tvVar3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1590376023);
        int i4 = i | (go1Var.g(is0Var) ? 4 : 2) | 5991808;
        if ((i & 100663296) == 0) {
            i4 |= go1Var.h(z) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i5 = i4 | 805306368;
        int i6 = (go1Var.i(tm1Var) ? 4 : 2) | 26000;
        if (go1Var.T(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                li3 li3Var = new li3(0.0f, 0.0f, 0.0f, 0.0f);
                q8 q8Var6 = q8.w0;
                tv tvVar4 = q8.W;
                int i7 = (i5 & 14) | 196608;
                cj3 cj3Var = new cj3();
                up0 a2 = fu4.a(go1Var);
                Map map = js5.a;
                ku4 g0 = qb.g0(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                iu0 iu0Var = (iu0) go1Var.k(hf0.h);
                i51 i51Var = hf0.n;
                da2 da2Var = (da2) go1Var.k(i51Var);
                boolean g = ((((i7 & 14) ^ 6) > 4 && go1Var.g(is0Var)) || (i7 & 6) == 4) | go1Var.g(a2) | go1Var.g(g0) | go1Var.g(cj3Var) | go1Var.g(iu0Var) | go1Var.e(da2Var.ordinal());
                Object Q = go1Var.Q();
                Object obj = de0.a;
                if (g || Q == obj) {
                    b2 = 0;
                    is4Var3 = new is4(new da(is0Var, new qi3(is0Var, da2Var, b2), cj3Var), a2, g0);
                    go1Var.o0(is4Var3);
                } else {
                    is4Var3 = Q;
                    b2 = 0;
                }
                is4 is4Var5 = (is4) is4Var3;
                int i8 = i5 & (-29360129);
                int i9 = (i5 & 14) | 432;
                da2 da2Var2 = (da2) go1Var.k(i51Var);
                int i10 = (((((i9 & 14) ^ 6) <= 4 || !go1Var.g(is0Var)) && (i9 & 6) != 4) ? b2 : (byte) 1) | (go1Var.e(da2Var2.ordinal()) ? 1 : 0);
                Object Q2 = go1Var.Q();
                Object obj2 = Q2;
                if (i10 != 0 || Q2 == obj) {
                    Object hs0Var = new hs0(is0Var, da2Var2);
                    go1Var.o0(hs0Var);
                    obj2 = hs0Var;
                }
                hs0 hs0Var2 = (hs0) obj2;
                q8 q8Var7 = q8.A0;
                is4Var4 = is4Var5;
                i2 = i8;
                i3 = i6 & (-7281);
                ji3Var3 = li3Var;
                b3 = lh3.b(go1Var);
                a93Var3 = hs0Var2;
                q8Var4 = q8Var7;
                q8Var5 = q8Var6;
                tvVar3 = tvVar4;
            } else {
                go1Var.W();
                i2 = i5 & (-29360129);
                q8Var5 = q8Var;
                tvVar3 = tvVar;
                is4Var4 = is4Var;
                a93Var3 = a93Var;
                q8Var4 = q8Var2;
                b3 = scVar;
                i3 = i6 & (-7281);
                ji3Var3 = ji3Var;
            }
            go1Var.r();
            ut0.e(l13Var, is0Var, ji3Var3, is4Var4, z, b3, q8Var5, a93Var3, tm1Var, tvVar3, q8Var4, tc0Var, go1Var, ((i2 >> 6) & 3670016) | ((i2 << 3) & 112) | 28038 | 905969664, ((i3 << 6) & 896) | 1797126);
            scVar2 = b3;
            q8Var3 = q8Var5;
            tvVar2 = tvVar3;
            is4Var2 = is4Var4;
            a93Var2 = a93Var3;
            ji3Var2 = ji3Var3;
        } else {
            go1Var.W();
            ji3Var2 = ji3Var;
            q8Var3 = q8Var;
            tvVar2 = tvVar;
            is4Var2 = is4Var;
            a93Var2 = a93Var;
            q8Var4 = q8Var2;
            scVar2 = scVar;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: si3
                @Override // defpackage.hn1
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int X = mu0.X(i | 1);
                    mu0.f(is0.this, l13Var, ji3Var2, q8Var3, tvVar2, is4Var2, z, tm1Var, a93Var2, q8Var4, scVar2, tc0Var, (fe0) obj3, X);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.bu3 r4, defpackage.rm1 r5, defpackage.gj0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.zt3
            if (r0 == 0) goto L13
            r0 = r6
            zt3 r0 = (defpackage.zt3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            zt3 r0 = new zt3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            rm1 r5 = r0.I
            V(r6)     // Catch: java.lang.Throwable -> L28
            goto L61
        L28:
            r4 = move-exception
            goto L67
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L30:
            V(r6)
            tk0 r6 = r0.getContext()
            q8 r1 = defpackage.q8.r0
            rk0 r6 = r6.get(r1)
            if (r6 != r4) goto L6b
            r0.I = r5     // Catch: java.lang.Throwable -> L28
            r0.K = r3     // Catch: java.lang.Throwable -> L28
            k10 r6 = new k10     // Catch: java.lang.Throwable -> L28
            fj0 r0 = G(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.t()     // Catch: java.lang.Throwable -> L28
            oe r0 = new oe     // Catch: java.lang.Throwable -> L28
            r1 = 5
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L28
            r4.i0(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L28
            el0 r6 = defpackage.el0.I
            if (r4 != r6) goto L61
            return r6
        L61:
            r5.invoke()
            wd5 r4 = defpackage.wd5.a
            return r4
        L67:
            r5.invoke()
            throw r4
        L6b:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.zy.i(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.g(bu3, rm1, gj0):java.lang.Object");
    }

    public static final m14 h(ca2 ca2Var) {
        ca2 C = ca2Var.C();
        return C != null ? C.J(ca2Var, true) : new m14(0.0f, 0.0f, (int) (ca2Var.o() >> 32), (int) (ca2Var.o() & 4294967295L));
    }

    public static final m14 i(ca2 ca2Var, boolean z) {
        ca2 q = q(ca2Var);
        float o = (int) (q.o() >> 32);
        float o2 = (int) (q.o() & 4294967295L);
        m14 J = q.J(ca2Var, z);
        float f = J.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > o) {
                f = o;
            }
        }
        float f2 = J.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > o2) {
                f2 = o2;
            }
        }
        float f3 = J.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= o) {
                o = f3;
            }
            f3 = o;
        }
        float f4 = J.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= o2) {
                o2 = f5;
            }
            f4 = o2;
        }
        if (f == f3 || f2 == f4) {
            return m14.e;
        }
        long d = q.d((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long d2 = q.d((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long d3 = q.d((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long d4 = q.d((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        return new m14(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final void j(View view) {
        view.getClass();
        Iterator it = kb4.v(view).iterator();
        while (true) {
            pj4 pj4Var = (pj4) it;
            if (!pj4Var.hasNext()) {
                return;
            }
            ArrayList arrayList = C((View) pj4Var.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((er5) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static final void k(int i, int i2) {
        if (i < 0 || i >= i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
        }
    }

    public static final void l(int i, int i2) {
        if (i < 0 || i > i2) {
            zy.o(r7.x(i, i2, "index: ", ", size: "));
        }
    }

    public static final void m(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            zl1.e(i3, hf1.D("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            s83.t(r7.x(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fj0 n(fj0 fj0Var, fj0 fj0Var2, hn1 hn1Var) {
        hn1Var.getClass();
        if (hn1Var instanceof fu) {
            return ((fu) hn1Var).create(fj0Var, fj0Var2);
        }
        tk0 context = fj0Var2.getContext();
        return context == l91.I ? new k42(fj0Var2, fj0Var, hn1Var) : new l42(fj0Var2, context, hn1Var, fj0Var);
    }

    public static final g54 o(Throwable th) {
        th.getClass();
        return new g54(th);
    }

    public static final ui1 p(ui1 ui1Var) {
        ui1 g = ((di1) ut0.V(ui1Var).getFocusOwner()).g();
        if (g == null || !g.isAttached()) {
            return null;
        }
        return g;
    }

    public static final ca2 q(ca2 ca2Var) {
        ca2 ca2Var2;
        ca2 C = ca2Var.C();
        while (true) {
            ca2 ca2Var3 = C;
            ca2Var2 = ca2Var;
            ca2Var = ca2Var3;
            if (ca2Var == null) {
                break;
            }
            C = ca2Var.C();
        }
        na3 na3Var = ca2Var2 instanceof na3 ? (na3) ca2Var2 : null;
        if (na3Var == null) {
            return ca2Var2;
        }
        na3 na3Var2 = na3Var.e0;
        while (true) {
            na3 na3Var3 = na3Var2;
            na3 na3Var4 = na3Var;
            na3Var = na3Var3;
            if (na3Var == null) {
                return na3Var4;
            }
            na3Var2 = na3Var.e0;
        }
    }

    public static final m14 r(ui1 ui1Var) {
        boolean isAttached = ui1Var.isAttached();
        m14 m14Var = m14.e;
        if (!isAttached) {
            return m14Var;
        }
        na3 coordinator$ui = ui1Var.getCoordinator$ui();
        if (coordinator$ui != null) {
            ca2 q = q(coordinator$ui);
            if (!q.h()) {
                q = null;
            }
            if (q != null) {
                return ui1Var.m0(q);
            }
        }
        return m14Var;
    }

    public static final String s(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !jx4.L(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !jx4.L(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ui1 t(defpackage.ui1 r8) {
        /*
            k13 r0 = r8.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Ld
            goto Lce
        Ld:
            k13 r0 = r8.getNode()
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto L1c
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.q02.b(r0)
        L1c:
            b53 r0 = new b53
            r2 = 16
            k13[] r3 = new defpackage.k13[r2]
            r0.<init>(r3)
            k13 r3 = r8.getNode()
            k13 r3 = r3.getChild$ui()
            if (r3 != 0) goto L37
            k13 r8 = r8.getNode()
            defpackage.ut0.h(r0, r8)
            goto L3a
        L37:
            r0.c(r3)
        L3a:
            int r8 = r0.K
            if (r8 == 0) goto Lce
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            k13 r8 = (defpackage.k13) r8
            int r3 = r8.getAggregateChildKindSet$ui()
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L52
            defpackage.ut0.h(r0, r8)
            goto L3a
        L52:
            if (r8 == 0) goto L3a
            int r3 = r8.getKindSet$ui()
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lc9
            r3 = r1
        L5d:
            if (r8 == 0) goto L3a
            boolean r4 = r8 instanceof defpackage.ui1
            r5 = 1
            if (r4 == 0) goto L88
            ui1 r8 = (defpackage.ui1) r8
            k13 r4 = r8.getNode()
            boolean r4 = r4.isAttached()
            if (r4 == 0) goto Lc4
            oi1 r4 = r8.o0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L87
            if (r4 == r5) goto L87
            r5 = 2
            if (r4 == r5) goto L87
            r8 = 3
            if (r4 != r8) goto L83
            goto Lc4
        L83:
            defpackage.s83.v()
            return r1
        L87:
            return r8
        L88:
            int r4 = r8.getKindSet$ui()
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lc4
            boolean r4 = r8 instanceof defpackage.wt0
            if (r4 == 0) goto Lc4
            r4 = r8
            wt0 r4 = (defpackage.wt0) r4
            k13 r4 = r4.J
            r6 = 0
        L9a:
            if (r4 == 0) goto Lc1
            int r7 = r4.getKindSet$ui()
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Lbc
            int r6 = r6 + 1
            if (r6 != r5) goto Laa
            r8 = r4
            goto Lbc
        Laa:
            if (r3 != 0) goto Lb3
            b53 r3 = new b53
            k13[] r7 = new defpackage.k13[r2]
            r3.<init>(r7)
        Lb3:
            if (r8 == 0) goto Lb9
            r3.c(r8)
            r8 = r1
        Lb9:
            r3.c(r4)
        Lbc:
            k13 r4 = r4.getChild$ui()
            goto L9a
        Lc1:
            if (r6 != r5) goto Lc4
            goto L5d
        Lc4:
            k13 r8 = defpackage.ut0.M(r3)
            goto L5d
        Lc9:
            k13 r8 = r8.getChild$ui()
            goto L52
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.t(ui1):ui1");
    }

    public static String v(yc ycVar, int i) {
        ycVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = ycVar.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final boolean x(m65 m65Var) {
        vn3 vn3Var;
        ko3 ko3Var = m65Var.c;
        y81 y81Var = (ko3Var == null || (vn3Var = ko3Var.b) == null) ? null : new y81(vn3Var.b);
        boolean z = false;
        if (y81Var != null && y81Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static oj4 y(i73 i73Var) {
        i73Var.getClass();
        return qj4.x(i73Var, new yy0((byte) 26));
    }

    public Object A(int i) {
        Object invoke;
        x32 c2 = z().c(i);
        int i2 = i - c2.a;
        tm1 key = c2.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? c21.v(i) : invoke;
    }

    public abstract void T(boolean z);

    public abstract void U(boolean z);

    public Object u(int i) {
        x32 c2 = z().c(i);
        return c2.c.getType().invoke(Integer.valueOf(i - c2.a));
    }

    public abstract InputFilter[] w(InputFilter[] inputFilterArr);

    public abstract tl z();
}
