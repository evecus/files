package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class mw2 {
    public static final q4 a = new q4(8);
    public static final h90 b = new h90();
    public static final p90 c = new p90();
    public static final tc0 d = new tc0(-1759434350, new sg(12), false);
    public static final yx3 e = new yx3();
    public static final ay0 f = new ay0();
    public static final yy0 g = new yy0(20);
    public static final gw2 h = new gw2(7);
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final aj5 j = new aj5(1);
    public static final m14 k = new m14(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Object l = new Object();
    public static final ba4 m = new ba4(28);

    public static final l13 A(l13 l13Var, boolean z, t33 t33Var) {
        return l13Var.then(z ? new yi1(t33Var) : i13.a);
    }

    public static /* synthetic */ l13 B(l13 l13Var, boolean z, t33 t33Var, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            t33Var = null;
        }
        return A(l13Var, z, t33Var);
    }

    public static final q33 C(xi4 xi4Var, tm1 tm1Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            si4 a2 = xi4Var.a();
            wa2 wa2Var = a2.c;
            if (wa2Var.L() && wa2Var.K()) {
                m14 g2 = a2.g();
                q33 q33Var = new q33(48);
                ep epVar = new ep((byte) 18);
                epVar.I(rt0.F(g2));
                F(new ep((byte) 18), epVar, tm1Var, q33Var, a2, a2);
                return q33Var;
            }
            q33 q33Var2 = q22.a;
            q33Var2.getClass();
            return q33Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void D(ep epVar, ep epVar2, tm1 tm1Var, q33 q33Var, si4 si4Var, si4 si4Var2) {
        List i2;
        ep epVar3 = epVar;
        Region region = (Region) epVar3.J;
        ep epVar4 = epVar2;
        Region region2 = (Region) epVar4.J;
        wa2 wa2Var = si4Var2.c;
        wa2 wa2Var2 = si4Var2.c;
        if (!wa2Var.L() || !wa2Var2.K() || region2.isEmpty()) {
            if (si4Var2.n()) {
                E(q33Var, si4Var, si4Var2);
                return;
            }
            return;
        }
        m14 m2 = si4Var2.m();
        if (m2.f()) {
            pi4 f2 = si4Var2.f();
            if (f2 == null) {
                x02 x02Var = wa2Var2.n0.c;
                m2 = mu0.q(x02Var).J(x02Var, false);
            } else {
                k13 node = f2.getNode();
                Object g2 = si4Var2.d.I.g(ii4.b);
                if (g2 == null) {
                    g2 = null;
                }
                m2 = qi4.e(node, g2 != null, false);
            }
        }
        v22 F = rt0.F(m2);
        epVar3.I(F);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i3 = si4Var2.f;
            si4 si4Var3 = si4Var;
            if (i3 == si4Var3.f) {
                i3 = -1;
            }
            Rect bounds = region.getBounds();
            vi4 vi4Var = new vi4(si4Var2, new v22(bounds.left, bounds.top, bounds.right, bounds.bottom));
            q33 q33Var2 = q33Var;
            q33Var2.i(i3, vi4Var);
            i2 = si4Var2.i((r4 & 1) != 0 ? !si4Var2.b : false, (r4 & 2) == 0);
            int size = i2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) tm1Var.invoke(i2.get(size))).booleanValue()) {
                    D(epVar3, epVar4, tm1Var, q33Var2, si4Var3, (si4) i2.get(size));
                }
                size--;
                epVar3 = epVar;
                epVar4 = epVar2;
                q33Var2 = q33Var;
                si4Var3 = si4Var;
            }
            if (I(si4Var2)) {
                region2.op(F.a, F.b, F.c, F.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void E(q33 q33Var, si4 si4Var, si4 si4Var2) {
        wa2 wa2Var;
        si4 l2 = si4Var2.l();
        m14 g2 = (l2 == null || (wa2Var = l2.c) == null || !wa2Var.L()) ? k : l2.g();
        int i2 = si4Var2.f;
        if (i2 == si4Var.f) {
            i2 = -1;
        }
        q33Var.i(i2, new vi4(si4Var2, rt0.F(g2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(defpackage.ep r17, defpackage.ep r18, defpackage.tm1 r19, defpackage.q33 r20, defpackage.si4 r21, defpackage.si4 r22) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.F(ep, ep, tm1, q33, si4, si4):void");
    }

    public static final k10 G(fj0 fj0Var) {
        Unsafe unsafe;
        k10 k10Var;
        k10 k10Var2;
        if (!(fj0Var instanceof nx0)) {
            return new k10(1, fj0Var);
        }
        nx0 nx0Var = (nx0) fj0Var;
        ep epVar = qb.f;
        long j2 = nx0.P;
        loop0: while (true) {
            unsafe = gq.a;
            Object objectVolatile = unsafe.getObjectVolatile(nx0Var, j2);
            k10Var = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(nx0Var, j2, epVar);
                k10Var2 = null;
                break;
            }
            if (objectVolatile instanceof k10) {
                do {
                    unsafe = gq.a;
                    if (unsafe.compareAndSwapObject(nx0Var, nx0.P, objectVolatile, epVar)) {
                        k10Var2 = (k10) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(nx0Var, j2) == objectVolatile);
            } else if (objectVolatile != epVar && !(objectVolatile instanceof Throwable)) {
                zy.h(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (k10Var2 != null) {
            long j3 = k10.P;
            Object objectVolatile2 = unsafe.getObjectVolatile(k10Var2, j3);
            if (!(objectVolatile2 instanceof sb0) || ((sb0) objectVolatile2).d == null) {
                unsafe.putIntVolatile(k10Var2, k10.N, 536870911);
                unsafe.putObjectVolatile(k10Var2, j3, e7.a);
                k10Var = k10Var2;
            } else {
                k10Var2.o();
            }
            if (k10Var != null) {
                return k10Var;
            }
        }
        return new k10(2, fj0Var);
    }

    public static final boolean H(si4 si4Var) {
        na3 d2 = si4Var.d();
        n43 n43Var = si4Var.d.I;
        return (d2 != null ? d2.T0() : false) || n43Var.c(zi4.q) || n43Var.c(zi4.p);
    }

    public static final boolean I(si4 si4Var) {
        if (!H(si4Var)) {
            ki4 ki4Var = si4Var.d;
            if (ki4Var.K) {
                return true;
            }
            n43 n43Var = ki4Var.I;
            Object[] objArr = n43Var.b;
            Object[] objArr2 = n43Var.c;
            long[] jArr = n43Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((bj4) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final boolean J(ab4 ab4Var) {
        ab4Var.getClass();
        int ordinal = ab4Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 7 || ordinal == 12;
    }

    public static final l13 K(fe2 fe2Var, cy cyVar, pg3 pg3Var) {
        return new be2(fe2Var, cyVar, pg3Var);
    }

    public static final void L(fe0 fe0Var, rm1 rm1Var) {
        lg3 lg3Var = ((go1) fe0Var).M.b.g;
        lg3Var.i0(zf3.c);
        rt0.G(lg3Var, 0, rm1Var);
    }

    public static final Object M(Object obj) {
        return obj instanceof ub0 ? mu0.o(((ub0) obj).a) : obj;
    }

    public static final ir5 N(wa2 wa2Var) {
        ir5 ir5Var = wa2Var.W;
        if (ir5Var != null) {
            return ir5Var;
        }
        throw r7.t("Required value was null.");
    }

    public static int O(double d2) {
        if (Double.isNaN(d2)) {
            s83.t("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Log.LOG_LEVEL_OFF;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int P(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        s83.t("Cannot round NaN value.");
        return 0;
    }

    public static long Q(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        s83.t("Cannot round NaN value.");
        return 0L;
    }

    public static final Shader.TileMode R(int i2) {
        return i2 == 0 ? Shader.TileMode.CLAMP : i2 == 1 ? Shader.TileMode.REPEAT : i2 == 2 ? Shader.TileMode.MIRROR : i2 == 3 ? Build.VERSION.SDK_INT >= 31 ? ub.l() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final long S(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        return i2 <= 15 ? j2 : i2 == z80.u.c ? qb.i0(j2) : ((i2 == z80.v.c || i2 == z80.w.c) && Build.VERSION.SDK_INT < 34) ? qb.i0(j2) : (i2 != z80.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : qb.i0(j2);
    }

    public static final ab4 T(i73 i73Var) {
        String str;
        if (i73Var == null || (str = (String) i73Var.J.f) == null) {
            return null;
        }
        String c0 = jx4.c0(jx4.c0(str, '/'), '?');
        switch (c0.hashCode()) {
            case -1314184421:
                if (c0.equals("mobile_feed")) {
                    return ab4.L;
                }
                return null;
            case -1268958287:
                if (c0.equals("follow")) {
                    return ab4.K;
                }
                return null;
            case -906336856:
                if (c0.equals("search")) {
                    return ab4.N;
                }
                return null;
            case -773784604:
                if (c0.equals("profile_picker")) {
                    return ab4.V;
                }
                return null;
            case -692203628:
                if (c0.equals("mix_detail")) {
                    return ab4.S;
                }
                return null;
            case -309425751:
                if (c0.equals("profile")) {
                    return ab4.P;
                }
                return null;
            case -89091291:
                if (c0.equals("video_player")) {
                    return ab4.T;
                }
                return null;
            case 3138974:
                if (c0.equals("feed")) {
                    return ab4.J;
                }
                return null;
            case 3322092:
                if (c0.equals("live")) {
                    return ab4.M;
                }
                return null;
            case 166757441:
                if (c0.equals("license")) {
                    return ab4.U;
                }
                return null;
            case 738950403:
                if (c0.equals("channel")) {
                    return ab4.I;
                }
                return null;
            case 1216225589:
                if (c0.equals("user_profile")) {
                    return ab4.R;
                }
                return null;
            case 1252597855:
                if (c0.equals("search_results")) {
                    return ab4.O;
                }
                return null;
            case 1434631203:
                if (c0.equals("settings")) {
                    return ab4.Q;
                }
                return null;
            default:
                return null;
        }
    }

    public static String U(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? r7.C("CornerRadius.circular(", e41.x0(Float.intBitsToFloat(i2)), ")") : hf1.x("CornerRadius.elliptical(", e41.x0(Float.intBitsToFloat(i2)), ", ", e41.x0(Float.intBitsToFloat(i3)), ")");
    }

    public static final long V(long j2) {
        int i2 = (int) (63 & j2);
        return (i2 == z80.x.c || i2 == z80.s.c || i2 == z80.t.c) ? S(x70.b(j2, z80.e)) : S(j2);
    }

    public static final bn W(ab4 ab4Var) {
        ab4Var.getClass();
        int ordinal = ab4Var.ordinal();
        if (ordinal == 0) {
            return m20.a;
        }
        if (ordinal == 1) {
            return rd1.a;
        }
        if (ordinal == 2) {
            return fj1.a;
        }
        if (ordinal == 3) {
            return a13.a;
        }
        if (ordinal == 4) {
            return cn2.a;
        }
        if (ordinal == 5) {
            return qc4.a;
        }
        if (ordinal == 7) {
            return cu3.a;
        }
        if (ordinal == 8) {
            return cl4.a;
        }
        if (ordinal == 12) {
            return gi2.a;
        }
        if (ordinal == 13) {
            return hu3.a;
        }
        throw new IllegalStateException(("Screen " + ab4Var + " requires a dedicated navigation method").toString());
    }

    public static final String X(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final void Y() {
        throw new UnsupportedOperationException();
    }

    public static final ea5 Z(Object obj, String str, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = new ea5(new z43(obj), null, str);
            go1Var.o0(Q);
        }
        ea5 ea5Var = (ea5) Q;
        ea5Var.a(obj, go1Var, (i2 & 8) | 48 | (i2 & 14));
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = new fa5(ea5Var, (byte) 0);
            go1Var.o0(Q2);
        }
        e(ea5Var, (tm1) Q2, go1Var);
        return ea5Var;
    }

    public static final void a(final tm1 tm1Var, l13 l13Var, tm1 tm1Var2, tm1 tm1Var3, fe0 fe0Var, int i2) {
        j94 j94Var;
        boolean z;
        Object obj;
        iu0 iu0Var;
        da2 da2Var;
        l13 l13Var2;
        vi2 vi2Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-180024211);
        k1 k1Var = go1Var.a;
        int i3 = i2 | (go1Var.i(tm1Var) ? 4 : 2) | (go1Var.g(l13Var) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK | (go1Var.i(tm1Var2) ? 2048 : 1024) | (go1Var.i(tm1Var3) ? 16384 : 8192);
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            l13 x0 = i42.x0(go1Var, l13Var.then(qh1.a).then(ti1.a).then(vi1.a).then(pi1.a));
            iu0 iu0Var2 = (iu0) go1Var.k(hf0.h);
            da2 da2Var2 = (da2) go1Var.k(hf0.n);
            am3 m2 = go1Var.m();
            vi2 vi2Var2 = (vi2) go1Var.k(mq2.a);
            w94 w94Var = (w94) go1Var.k(qq2.a);
            go1Var.d0(1314774735);
            int i5 = i3 & 14;
            long j3 = go1Var.T;
            final int i6 = (int) (j3 ^ (j3 >>> 32));
            final Context context = (Context) go1Var.k(rb.b);
            final eo1 b0 = qb.b0(go1Var);
            j94 j94Var2 = (j94) go1Var.k(l94.a);
            final View view = (View) go1Var.k(rb.f);
            boolean i7 = go1Var.i(context);
            byte b2 = 6;
            if ((((i5 & 14) ^ 6) <= 4 || !go1Var.g(tm1Var)) && (i5 & 6) != 4) {
                j94Var = j94Var2;
                z = false;
            } else {
                j94Var = j94Var2;
                z = true;
            }
            boolean i8 = i7 | z | go1Var.i(b0) | go1Var.i(j94Var) | go1Var.e(i6) | go1Var.i(view);
            Object Q = go1Var.Q();
            if (i8 || Q == de0.a) {
                iu0Var = iu0Var2;
                da2Var = da2Var2;
                l13Var2 = x0;
                final j94 j94Var3 = j94Var;
                vi2Var = vi2Var2;
                obj = new rm1() { // from class: ug
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        KeyEvent.Callback callback = view;
                        callback.getClass();
                        return new ir5(context, tm1Var, b0, j94Var3, i6, (qh3) callback).getLayoutNode();
                    }
                };
                go1Var.o0(obj);
            } else {
                l13Var2 = x0;
                da2Var = da2Var2;
                obj = Q;
                vi2Var = vi2Var2;
                iu0Var = iu0Var2;
            }
            rm1 rm1Var = (rm1) obj;
            if (!(k1Var instanceof ld5)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(rm1Var);
            } else {
                go1Var.r0();
            }
            xd0.c.getClass();
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, new sg((byte) 2), l13Var2);
            qi4.k(go1Var, new sg((byte) 3), iu0Var);
            qi4.k(go1Var, new sg((byte) 4), vi2Var);
            qi4.k(go1Var, new sg((byte) 5), w94Var);
            qi4.k(go1Var, new sg(b2), da2Var);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.k(go1Var, new sg((byte) 0), tm1Var3);
            qi4.k(go1Var, new sg((byte) 1), tm1Var2);
            go1Var.q(true);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tg(tm1Var, l13Var, tm1Var2, tm1Var3, i2, (byte) 0);
        }
    }

    public static final l13 a0(l13 l13Var, vu5 vu5Var) {
        return l13Var.then(new s12(vu5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ay3 r11, defpackage.hn1 r12, defpackage.fe0 r13, int r14) {
        /*
            go1 r13 = (defpackage.go1) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.f0(r0)
            a32 r0 = r13.x
            am3 r1 = r13.m()
            r2 = 201(0xc9, float:2.82E-43)
            ze3 r3 = defpackage.ke0.b
            r13.Z(r2, r3)
            java.lang.Object r2 = r13.Q()
            jp r3 = defpackage.de0.a
            boolean r3 = defpackage.j42.c(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            dh5 r2 = (defpackage.dh5) r2
        L29:
            xx3 r3 = r11.a
            dh5 r5 = r3.d(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r13.o0(r5)
        L38:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L55
            boolean r2 = r11.g
            if (r2 != 0) goto L4b
            r2 = r1
            zl3 r2 = (defpackage.zl3) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L51
        L4b:
            zl3 r1 = (defpackage.zl3) r1
            zl3 r1 = r1.c(r3, r5)
        L51:
            r13.J = r7
        L53:
            r2 = r8
            goto L95
        L55:
            sr4 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r9, r10)
            r6.getClass()
            am3 r6 = (defpackage.am3) r6
            boolean r9 = r13.F()
            if (r9 == 0) goto L6c
            if (r2 != 0) goto L7a
        L6c:
            boolean r9 = r11.g
            if (r9 != 0) goto L88
            r9 = r1
            zl3 r9 = (defpackage.zl3) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L7a
            goto L88
        L7a:
            if (r2 == 0) goto L81
            boolean r2 = r13.w
            if (r2 != 0) goto L81
            goto L86
        L81:
            boolean r2 = r13.w
            if (r2 == 0) goto L86
            goto L8e
        L86:
            r1 = r6
            goto L8e
        L88:
            zl3 r1 = (defpackage.zl3) r1
            zl3 r1 = r1.c(r3, r5)
        L8e:
            boolean r2 = r13.y
            if (r2 != 0) goto L94
            if (r6 == r1) goto L53
        L94:
            r2 = r7
        L95:
            if (r2 == 0) goto L9e
            boolean r3 = r13.S
            if (r3 != 0) goto L9e
            r13.O(r1)
        L9e:
            boolean r3 = r13.w
            r0.d(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            ze3 r3 = defpackage.ke0.c
            r13.X(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.q(r8)
            r13.q(r8)
            int r0 = r0.c()
            if (r0 == 0) goto Lc6
            r8 = r7
        Lc6:
            r13.w = r8
            r13.K = r4
            x04 r13 = r13.u()
            if (r13 == 0) goto Ld7
            qc0 r0 = new qc0
            r0.<init>(r7, r14, r11, r12)
            r13.d = r0
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.b(ay3, hn1, fe0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ay3[] r8, defpackage.hn1 r9, defpackage.fe0 r10, int r11) {
        /*
            go1 r10 = (defpackage.go1) r10
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.f0(r0)
            a32 r0 = r10.x
            am3 r1 = r10.m()
            r2 = 201(0xc9, float:2.82E-43)
            ze3 r3 = defpackage.ke0.b
            r10.Z(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L29
            zl3 r2 = defpackage.zl3.L
            zl3 r2 = defpackage.p70.C0(r8, r1, r2)
            zl3 r1 = r10.n0(r1, r2)
            r10.J = r3
        L27:
            r2 = r4
            goto L74
        L29:
            sr4 r2 = r10.G
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            r2.getClass()
            am3 r2 = (defpackage.am3) r2
            sr4 r5 = r10.G
            int r6 = r5.g
            java.lang.Object r5 = r5.h(r6, r3)
            r5.getClass()
            am3 r5 = (defpackage.am3) r5
            zl3 r6 = defpackage.p70.C0(r8, r1, r5)
            boolean r7 = r10.F()
            if (r7 == 0) goto L65
            boolean r7 = r10.y
            if (r7 != 0) goto L65
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.l
            sr4 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.l = r5
            r1 = r2
            goto L27
        L65:
            zl3 r1 = r10.n0(r1, r6)
            boolean r5 = r10.y
            if (r5 != 0) goto L73
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L27
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.O(r1)
        L7d:
            boolean r5 = r10.w
            r0.d(r5)
            r10.w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            ze3 r5 = defpackage.ke0.c
            r10.X(r2, r4, r5, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.q(r4)
            r10.q(r4)
            int r0 = r0.c()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.w = r3
            r0 = 0
            r10.K = r0
            x04 r10 = r10.u()
            if (r10 == 0) goto Lb9
            qc0 r0 = new qc0
            r1 = 2
            r0.<init>(r1, r11, r8, r9)
            r10.d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.c(ay3[], hn1, fe0, int):void");
    }

    public static final km0 d(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new km0(new float[]{f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public static final void e(Object obj, tm1 tm1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        boolean g2 = go1Var.g(obj);
        Object Q = go1Var.Q();
        if (g2 || Q == de0.a) {
            Q = new yx0(tm1Var);
            go1Var.o0(Q);
        }
    }

    public static final void f(Object obj, Object obj2, tm1 tm1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        boolean g2 = go1Var.g(obj) | go1Var.g(obj2);
        Object Q = go1Var.Q();
        if (g2 || Q == de0.a) {
            Q = new yx0(tm1Var);
            go1Var.o0(Q);
        }
    }

    public static final void g(Object[] objArr, tm1 tm1Var, fe0 fe0Var) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        go1 go1Var = (go1) fe0Var;
        boolean e2 = go1Var.e(copyOf.length);
        for (Object obj : copyOf) {
            e2 |= go1Var.g(obj);
        }
        Object Q = go1Var.Q();
        if (e2 || Q == de0.a) {
            go1Var.o0(new yx0(tm1Var));
        }
    }

    public static final void h(fe0 fe0Var, hn1 hn1Var, Object obj) {
        tk0 tk0Var = ((go1) fe0Var).R;
        go1 go1Var = (go1) fe0Var;
        boolean g2 = go1Var.g(obj);
        Object Q = go1Var.Q();
        if (g2 || Q == de0.a) {
            Q = new v92(tk0Var, hn1Var);
            go1Var.o0(Q);
        }
    }

    public static final void i(Object obj, Object obj2, hn1 hn1Var, fe0 fe0Var) {
        tk0 tk0Var = ((go1) fe0Var).R;
        go1 go1Var = (go1) fe0Var;
        boolean g2 = go1Var.g(obj) | go1Var.g(obj2);
        Object Q = go1Var.Q();
        if (g2 || Q == de0.a) {
            Q = new v92(tk0Var, hn1Var);
            go1Var.o0(Q);
        }
    }

    public static final void j(Object obj, Object obj2, Object obj3, hn1 hn1Var, fe0 fe0Var) {
        tk0 tk0Var = ((go1) fe0Var).R;
        go1 go1Var = (go1) fe0Var;
        boolean g2 = go1Var.g(obj) | go1Var.g(obj2) | go1Var.g(obj3);
        Object Q = go1Var.Q();
        if (g2 || Q == de0.a) {
            Q = new v92(tk0Var, hn1Var);
            go1Var.o0(Q);
        }
    }

    public static final void k(Object[] objArr, hn1 hn1Var, fe0 fe0Var) {
        tk0 tk0Var = ((go1) fe0Var).R;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        go1 go1Var = (go1) fe0Var;
        boolean e2 = go1Var.e(copyOf.length);
        for (Object obj : copyOf) {
            e2 |= go1Var.g(obj);
        }
        Object Q = go1Var.Q();
        if (e2 || Q == de0.a) {
            go1Var.o0(new v92(tk0Var, hn1Var));
        }
    }

    public static final void l(Object obj, rm1 rm1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.g(obj)) {
            L(go1Var, rm1Var);
        }
    }

    public static final void m(Object obj, Object obj2, rm1 rm1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.g(obj) || go1Var.g(obj2)) {
            L(go1Var, rm1Var);
        }
    }

    public static final void n(ea5 ea5Var, ba5 ba5Var, Object obj, Object obj2, ve1 ve1Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(ea5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(ba5Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? go1Var.g(obj) : go1Var.i(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? go1Var.g(obj2) : go1Var.i(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? go1Var.g(ve1Var) : go1Var.i(ve1Var) ? 16384 : 8192;
        }
        if (!go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            go1Var.W();
        } else if (ea5Var.i()) {
            ba5Var.h(obj, obj2, ve1Var);
        } else {
            ba5Var.i(obj2, ve1Var, null, null);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ra0(ea5Var, ba5Var, obj, obj2, ve1Var, i2, (byte) 3);
        }
    }

    public static l13 o(l13 l13Var, sj2 sj2Var) {
        return l13Var.then(new pt(0L, sj2Var, j, 1));
    }

    public static final l13 p(l13 l13Var, long j2, dn4 dn4Var) {
        return l13Var.then(new pt(j2, null, dn4Var, 2));
    }

    public static l13 q(long j2, l13 l13Var) {
        return p(l13Var, j2, j);
    }

    public static final Object r(tt0 tt0Var, rm1 rm1Var, gj0 gj0Var) {
        Object obj;
        na3 T;
        Object d0;
        ja3 ja3Var;
        if (tt0Var.getNode().isAttached()) {
            if (!tt0Var.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 parent$ui = tt0Var.getNode().getParent$ui();
            wa2 U = ut0.U(tt0Var);
            loop0: while (true) {
                obj = null;
                if (U == null) {
                    break;
                }
                if ((U.n0.f.getAggregateChildKindSet$ui() & 524288) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 524288) != 0) {
                            k13 k13Var = parent$ui;
                            b53 b53Var = null;
                            while (k13Var != null) {
                                if (k13Var instanceof zx) {
                                    obj = k13Var;
                                    break loop0;
                                }
                                if ((k13Var.getKindSet$ui() & 524288) != 0 && (k13Var instanceof wt0)) {
                                    int i2 = 0;
                                    for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                        if ((k13Var2.getKindSet$ui() & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k13Var = k13Var2;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var != null) {
                                                    b53Var.c(k13Var);
                                                    k13Var = null;
                                                }
                                                b53Var.c(k13Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                k13Var = ut0.M(b53Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                U = U.v();
                parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
            }
            zx zxVar = (zx) obj;
            if (zxVar != null && (d0 = zxVar.d0((T = ut0.T(tt0Var)), new k9(rm1Var, T, (byte) 2), gj0Var)) == el0.I) {
                return d0;
            }
        }
        return wd5.a;
    }

    public static final boolean s(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = o91.I;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    si4 si4Var = (si4) obj2;
                    si4 si4Var2 = (si4) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (si4Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (si4Var.g().b() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (si4Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (si4Var.g().b() & 4294967295L)));
                    arrayList2.add(new pd3((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((pd3) o70.T0(list)).a;
            } else {
                if (list.isEmpty()) {
                    dl2.c("Empty collection can't be reduced.");
                }
                Object T0 = o70.T0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        T0 = new pd3(pd3.f(((pd3) T0).a, ((pd3) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((pd3) T0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final byte t(char c2) {
        if (c2 < '~') {
            return j50.b[c2];
        }
        return (byte) 0;
    }

    public static final void u(long j2, pg3 pg3Var) {
        if (pg3Var == pg3.I) {
            if (dh0.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            t02.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (dh0.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            t02.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void v(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    hf1.F(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    sv2.i(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                em0.b((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else if (autoCloseable instanceof ContentProviderClient) {
                ((ContentProviderClient) autoCloseable).release();
            } else {
                s83.d();
            }
        }
    }

    public static final dl0 w(fe0 fe0Var) {
        return new n34(((go1) fe0Var).R);
    }

    public static final y95 x(ea5 ea5Var, ub5 ub5Var, String str, fe0 fe0Var, int i2, int i3) {
        x95 x95Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean g2 = ((go1) fe0Var).g(ea5Var);
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g2 || Q == jpVar) {
            Q = new y95(ea5Var, ub5Var, str);
            go1Var.o0(Q);
        }
        y95 y95Var = (y95) Q;
        boolean g3 = go1Var.g(ea5Var) | go1Var.i(y95Var);
        Object Q2 = go1Var.Q();
        if (g3 || Q2 == jpVar) {
            Q2 = new m1(ea5Var, y95Var, (byte) 22);
            go1Var.o0(Q2);
        }
        e(y95Var, (tm1) Q2, go1Var);
        if (ea5Var.i() && (x95Var = (x95) y95Var.b.getValue()) != null) {
            ea5 ea5Var2 = y95Var.c;
            x95Var.I.h(x95Var.K.invoke(ea5Var2.g().b()), x95Var.K.invoke(ea5Var2.g().d()), (ve1) x95Var.J.invoke(ea5Var2.g()));
        }
        return y95Var;
    }

    public static final ba5 y(ea5 ea5Var, Object obj, Object obj2, ve1 ve1Var, ub5 ub5Var, fe0 fe0Var, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z = true;
        boolean z2 = (i4 > 4 && ((go1) fe0Var).g(ea5Var)) || (i2 & 6) == 4;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (z2 || Q == jpVar) {
            ns4 i5 = o63.i();
            tm1 e2 = i5 != null ? i5.e() : null;
            ns4 j2 = o63.j(i5);
            try {
                obj3 = obj2;
                hj hjVar = (hj) ub5Var.a.invoke(obj3);
                hjVar.d();
                obj4 = obj;
                ba5 ba5Var = new ba5(ea5Var, obj4, hjVar, ub5Var);
                o63.o(i5, j2, e2);
                go1Var.o0(ba5Var);
                Q = ba5Var;
            } catch (Throwable th) {
                o63.o(i5, j2, e2);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        ba5 ba5Var2 = (ba5) Q;
        int i6 = (i2 >> 3) & 8;
        int i7 = i2 << 3;
        n(ea5Var, ba5Var2, obj4, obj3, ve1Var, go1Var, i3 | (i6 << 6) | (i7 & 896) | (i6 << 9) | (i7 & 7168) | (57344 & i7));
        if ((i4 <= 4 || !go1Var.g(ea5Var)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean g2 = go1Var.g(ba5Var2) | z;
        Object Q2 = go1Var.Q();
        if (g2 || Q2 == jpVar) {
            Q2 = new ap3((Object) ea5Var, (Object) ba5Var2, (byte) 14);
            go1Var.o0(Q2);
        }
        e(ba5Var2, (tm1) Q2, go1Var);
        return ba5Var2;
    }

    public static final boolean z(long j2, long j3) {
        return j2 == j3;
    }
}
