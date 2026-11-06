package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class lw2 {
    public static final i51 a = new i51(new df0((byte) 29), (byte) 1);
    public static final i51 b = new i51(new gw2((byte) 0), (byte) 1);

    public static final void a(final k80 k80Var, final h23 h23Var, final hn4 hn4Var, final lc5 lc5Var, final hn1 hn1Var, fe0 fe0Var, int i) {
        int i2;
        k80 k80Var2;
        h23 h23Var2;
        lc5 lc5Var2;
        hn4 hn4Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1317329884);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(k80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(h23Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(hn4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(lc5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.i(hn1Var) ? 16384 : 8192;
        }
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            i51 i51Var = a;
            if (((Boolean) go1Var.k(i51Var)).booleanValue()) {
                go1Var.d0(1458663246);
                i51 i51Var2 = b;
                if (k80Var == null) {
                    go1Var.d0(-1061323065);
                    k80Var2 = ((fw2) go1Var.k(i51Var2)).a;
                    go1Var.q(false);
                } else {
                    go1Var.d0(-1061323964);
                    go1Var.q(false);
                    k80Var2 = k80Var;
                }
                if (h23Var == null) {
                    go1Var.d0(-1061320824);
                    h23Var2 = ((fw2) go1Var.k(i51Var2)).d;
                    go1Var.q(false);
                } else {
                    go1Var.d0(-1061321754);
                    go1Var.q(false);
                    h23Var2 = h23Var;
                }
                if (lc5Var == null) {
                    go1Var.d0(-1061318682);
                    lc5 lc5Var3 = ((fw2) go1Var.k(i51Var2)).b;
                    go1Var.q(false);
                    lc5Var2 = lc5Var3;
                } else {
                    go1Var.d0(-1061319550);
                    go1Var.q(false);
                    lc5Var2 = lc5Var;
                }
                if (hn4Var == null) {
                    go1Var.d0(-1061316862);
                    hn4 hn4Var3 = ((fw2) go1Var.k(i51Var2)).c;
                    go1Var.q(false);
                    hn4Var2 = hn4Var3;
                } else {
                    go1Var.d0(-1061317606);
                    go1Var.q(false);
                    hn4Var2 = hn4Var;
                }
                b(k80Var2, h23Var2, hn4Var2, lc5Var2, hn1Var, go1Var, i2 & 57344);
                go1Var.q(false);
            } else {
                go1Var.d0(1458990389);
                mw2.b(i51Var.a(Boolean.TRUE), p70.u0(1535649272, new hn1() { // from class: iw2
                    @Override // defpackage.hn1
                    public final Object invoke(Object obj, Object obj2) {
                        fe0 fe0Var2 = (fe0) obj;
                        int intValue = ((Integer) obj2).intValue();
                        go1 go1Var2 = (go1) fe0Var2;
                        if (go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            k80 k80Var3 = k80.this;
                            if (k80Var3 == null) {
                                i51 i51Var3 = q80.a;
                                k80Var3 = q80.f(0L, 0L, 0L, wj3.b(), 0L, 0L, 0L, 0L, wj3.c(), 0L, 0L, 0L, wj3.d(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, wj3.a(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            }
                            k80 k80Var4 = k80Var3;
                            h23 h23Var3 = h23Var;
                            if (h23Var3 == null) {
                                h23Var3 = f23.a;
                            }
                            h23 h23Var4 = h23Var3;
                            hn4 hn4Var4 = hn4Var;
                            if (hn4Var4 == null) {
                                hn4Var4 = new hn4();
                            }
                            hn4 hn4Var5 = hn4Var4;
                            lc5 lc5Var4 = lc5Var;
                            if (lc5Var4 == null) {
                                lc5Var4 = new lc5();
                            }
                            lw2.b(k80Var4, h23Var4, hn4Var5, lc5Var4, hn1Var, go1Var2, 0);
                        } else {
                            go1Var2.W();
                        }
                        return wd5.a;
                    }
                }, go1Var), go1Var, 56);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jw2(k80Var, h23Var, hn4Var, lc5Var, hn1Var, i, (byte) 0);
        }
    }

    public static final void b(k80 k80Var, h23 h23Var, hn4 hn4Var, lc5 lc5Var, hn1 hn1Var, fe0 fe0Var, int i) {
        int i2;
        char c;
        byte b2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(904511636);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(k80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(h23Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(hn4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(lc5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.i(hn1Var) ? 16384 : 8192;
        }
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            fw2 fw2Var = new fw2(k80Var, lc5Var, hn4Var, h23Var);
            q64 a2 = d64.a(0.0f, 255);
            long j = k80Var.a;
            boolean f = go1Var.f(j);
            Object Q = go1Var.Q();
            if (f || Q == de0.a) {
                c = 1;
                b2 = 0;
                Q = new f65(j, x70.c(j, 0.4f));
                go1Var.o0(Q);
            } else {
                c = 1;
                b2 = 0;
            }
            ay3 a3 = b.a(fw2Var);
            ay3 a4 = kz1.a.a(a2);
            ay3 a5 = g65.a.a((f65) Q);
            ay3[] ay3VarArr = new ay3[3];
            ay3VarArr[b2] = a3;
            ay3VarArr[c] = a4;
            ay3VarArr[2] = a5;
            mw2.c(ay3VarArr, p70.u0(-1750539308, new kw2(lc5Var, hn1Var, b2), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jw2(k80Var, h23Var, hn4Var, lc5Var, hn1Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if ((r13 & 4) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.k80 r7, defpackage.hn4 r8, defpackage.lc5 r9, defpackage.hn1 r10, defpackage.fe0 r11, final int r12, final int r13) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw2.c(k80, hn4, lc5, hn1, fe0, int, int):void");
    }
}
