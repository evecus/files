package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.common.C;
import java.io.IOException;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class j81 implements rz4, u80, ew1, td3, mo3, if0, mb4 {
    public final /* synthetic */ byte I;

    public j81(ce ceVar) {
        this.I = (byte) 28;
    }

    public static Typeface l(String str, qk1 qk1Var, int i) {
        if (i == 0 && j42.c(qk1Var, qk1.M) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int D = a5.D(i, qk1Var);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(D) : Typeface.create(str, D);
    }

    @Override // defpackage.mo3
    public Typeface a(int i, qk1 qk1Var) {
        return l(null, qk1Var, i);
    }

    @Override // defpackage.rz4
    public sz4 e(qz4 qz4Var) {
        return new mm1(qz4Var.a, qz4Var.b, qz4Var.c, qz4Var.d, qz4Var.e);
    }

    @Override // defpackage.ew1
    public gr2 f(String str) {
        return v53.I;
    }

    @Override // defpackage.mo3
    public Typeface i(fp1 fp1Var, qk1 qk1Var, int i) {
        String str;
        fp1Var.getClass();
        int i2 = qk1Var.I / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = C.SANS_SERIF_NAME;
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface l = l(str, qk1Var, i);
            if (!j42.c(l, Typeface.create(Typeface.DEFAULT, a5.D(i, qk1Var))) && !j42.c(l, l(null, qk1Var, i))) {
                typeface = l;
            }
        }
        return typeface == null ? l(C.SANS_SERIF_NAME, qk1Var, i) : typeface;
    }

    public void m(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(16:5|6|7|(1:(2:10|11)(2:31|32))(4:33|34|35|(1:37))|12|13|14|(1:16)|17|(2:20|18)|21|22|(1:24)(1:29)|25|26|27))|44|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|(0)(0)|25|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        android.util.Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + r8 + " is corrupted", r0);
        r6 = defpackage.ec2.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        android.util.Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r8, r0);
        r6 = defpackage.ec2.o();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[LOOP:0: B:18:0x00a4->B:20:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(android.content.Context r7, int r8, defpackage.gj0 r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j81.n(android.content.Context, int, gj0):java.lang.Object");
    }

    public k82 o(KeyEvent keyEvent) {
        k82 k82Var = null;
        switch (this.I) {
            case 8:
                int z = c21.z(keyEvent);
                k82 k82Var2 = k82.E0;
                if (z != 10) {
                    k82 k82Var3 = k82.a0;
                    k82 k82Var4 = k82.c0;
                    k82 k82Var5 = k82.b0;
                    if (z == 2) {
                        long b = e21.b(keyEvent.getKeyCode());
                        if (!j82.a(b, j82.j) && !j82.a(b, j82.x) && !j82.a(b, j82.N)) {
                            if (!j82.a(b, j82.l)) {
                                if (!j82.a(b, j82.m)) {
                                    if (j82.a(b, j82.i)) {
                                        return k82.j0;
                                    }
                                    if (!j82.a(b, j82.n)) {
                                        if (j82.a(b, j82.o)) {
                                            return k82.D0;
                                        }
                                        return null;
                                    }
                                }
                                return k82Var4;
                            }
                            return k82Var5;
                        }
                        return k82Var3;
                    }
                    if (z == 8) {
                        long b2 = e21.b(keyEvent.getKeyCode());
                        if (j82.a(b2, j82.f) || j82.a(b2, j82.H)) {
                            return k82.k0;
                        }
                        if (j82.a(b2, j82.g) || j82.a(b2, j82.I)) {
                            return k82.l0;
                        }
                        if (j82.a(b2, j82.d) || j82.a(b2, j82.F)) {
                            return k82.m0;
                        }
                        if (j82.a(b2, j82.e) || j82.a(b2, j82.G)) {
                            return k82.n0;
                        }
                        if (j82.a(b2, j82.C) || j82.a(b2, j82.L)) {
                            return k82.o0;
                        }
                        if (j82.a(b2, j82.D) || j82.a(b2, j82.M)) {
                            return k82.p0;
                        }
                        if (j82.a(b2, j82.v) || j82.a(b2, j82.J)) {
                            return k82.w0;
                        }
                        if (j82.a(b2, j82.w) || j82.a(b2, j82.K)) {
                            return k82.x0;
                        }
                        if (!j82.a(b2, j82.x) && !j82.a(b2, j82.N)) {
                            return null;
                        }
                    } else {
                        if (z != 0) {
                            return null;
                        }
                        long b3 = e21.b(keyEvent.getKeyCode());
                        if (j82.a(b3, j82.f) || j82.a(b3, j82.H)) {
                            return k82.J;
                        }
                        if (j82.a(b3, j82.g) || j82.a(b3, j82.I)) {
                            return k82.K;
                        }
                        if (j82.a(b3, j82.d) || j82.a(b3, j82.F)) {
                            return k82.T;
                        }
                        if (j82.a(b3, j82.e) || j82.a(b3, j82.G)) {
                            return k82.U;
                        }
                        if (j82.a(b3, j82.h)) {
                            return k82.V;
                        }
                        if (j82.a(b3, j82.C) || j82.a(b3, j82.L)) {
                            return k82.W;
                        }
                        if (j82.a(b3, j82.D) || j82.a(b3, j82.M)) {
                            return k82.X;
                        }
                        if (j82.a(b3, j82.v) || j82.a(b3, j82.J)) {
                            return k82.P;
                        }
                        if (j82.a(b3, j82.w) || j82.a(b3, j82.K)) {
                            return k82.Q;
                        }
                        if (j82.a(b3, j82.r) || j82.a(b3, j82.E)) {
                            return k82.B0;
                        }
                        if (j82.a(b3, j82.s)) {
                            return k82.d0;
                        }
                        if (j82.a(b3, j82.t)) {
                            return k82.e0;
                        }
                        if (!j82.a(b3, j82.A)) {
                            if (!j82.a(b3, j82.y)) {
                                if (!j82.a(b3, j82.z)) {
                                    if (j82.a(b3, j82.p)) {
                                        return k82.C0;
                                    }
                                    return null;
                                }
                                return k82Var3;
                            }
                            return k82Var4;
                        }
                    }
                    return k82Var5;
                }
                if (!j82.a(e21.b(keyEvent.getKeyCode()), j82.o)) {
                    return null;
                }
                return k82Var2;
            default:
                int z2 = c21.z(keyEvent);
                if (z2 == 9) {
                    long b4 = e21.b(keyEvent.getKeyCode());
                    if (j82.a(b4, j82.f)) {
                        k82Var = k82.y0;
                    } else if (j82.a(b4, j82.g)) {
                        k82Var = k82.z0;
                    } else if (j82.a(b4, j82.d)) {
                        k82Var = k82.q0;
                    } else if (j82.a(b4, j82.e)) {
                        k82Var = k82.r0;
                    }
                } else if (z2 == 1) {
                    long b5 = e21.b(keyEvent.getKeyCode());
                    if (j82.a(b5, j82.f)) {
                        k82Var = k82.R;
                    } else if (j82.a(b5, j82.g)) {
                        k82Var = k82.S;
                    } else if (j82.a(b5, j82.d)) {
                        k82Var = k82.Y;
                    } else if (j82.a(b5, j82.e)) {
                        k82Var = k82.Z;
                    } else if (j82.a(b5, j82.s)) {
                        k82Var = k82.h0;
                    }
                }
                return k82Var == null ? v82.a.D(keyEvent) : k82Var;
        }
    }

    public th3 p(byte[] bArr) {
        zy4 zy4Var;
        switch (this.I) {
            case 15:
                try {
                    x0 x = x0.x(bArr);
                    if (x.size() != 6) {
                        throw new h0("malformed sequence in DSA private key", (byte) 3);
                    }
                    if (!l0.v(x.y(0)).y(0)) {
                        throw new h0("wrong version for DSA private key", (byte) 3);
                    }
                    l0 v = l0.v(x.y(1));
                    l0 v2 = l0.v(x.y(2));
                    l0 v3 = l0.v(x.y(3));
                    l0 v4 = l0.v(x.y(4));
                    l0 v5 = l0.v(x.y(5));
                    q0 q0Var = f06.H;
                    return new th3(new zy4(new p8(q0Var, new eo0(v.x(), v2.x(), v3.x())), v4), new qt3(new p8(q0Var, new eo0(v.x(), v2.x(), v3.x())), v5));
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    b13.j("problem creating DSA private key: ", e2);
                    return null;
                }
            case 16:
                try {
                    i61 m = i61.m(x0.x(bArr));
                    p8 p8Var = new p8(f06.j, m.n(0, -1));
                    qt3 qt3Var = new qt3(p8Var, m);
                    a0 a0Var = (a0) m.n(1, 3);
                    if (a0Var != null) {
                        byte[] w = a0Var.w();
                        zy4Var = new zy4();
                        zy4Var.J = new dn0(w, 0);
                        zy4Var.I = p8Var;
                    } else {
                        zy4Var = null;
                    }
                    return new th3(zy4Var, qt3Var);
                } catch (IOException e3) {
                    throw e3;
                } catch (Exception e4) {
                    b13.j("problem creating EC private key: ", e4);
                    return null;
                }
            default:
                try {
                    x0 x2 = x0.x(bArr);
                    if (x2.size() != 9) {
                        throw new h0("malformed sequence in RSA private key", (byte) 3);
                    }
                    b04 m2 = b04.m(x2);
                    BigInteger bigInteger = m2.J;
                    BigInteger bigInteger2 = m2.K;
                    c04 c04Var = new c04();
                    c04Var.I = bigInteger;
                    c04Var.J = bigInteger2;
                    p8 p8Var2 = new p8(yh3.a, kn0.J);
                    return new th3(new zy4(p8Var2, c04Var), new qt3(p8Var2, m2));
                } catch (IOException e5) {
                    throw e5;
                } catch (Exception e6) {
                    b13.j("problem creating RSA private key: ", e6);
                    return null;
                }
        }
    }

    public /* synthetic */ j81(byte b) {
        this.I = b;
    }

    @Override // defpackage.td3
    public int c(int i) {
        return i;
    }

    @Override // defpackage.td3
    public int k(int i) {
        return i;
    }

    public void q(vq3 vq3Var, int i, int i2) {
    }

    @Override // defpackage.mb4
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.mb4
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
