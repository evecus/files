package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k04 implements hx, sk0, ju0, yy4, ak4, vz3, i64, k64, m64, o64 {
    public static final k04 X;
    public static final k04 Y;
    public static final k04 Z;
    public static final k04 a0;
    public static final k04 b0;
    public static final k04 c0;
    public static final k04 d0;
    public static final k04 e0;
    public static final k04 f0;
    public static final k04 g0;
    public static final k04 h0;
    public static final k04 i0;
    public static final k04 j0;
    public static final k04 k0;
    public static final k04 l0;
    public static final k04 m0;
    public static final k04 n0;
    public static final k04 o0;
    public static final k04 p0;
    public final /* synthetic */ byte I;
    public static final k04 J = new k04(1);
    public static final k04 K = new k04(2);
    public static final k04 L = new k04(3);
    public static final k04 M = new k04(4);
    public static final k04 N = new k04(5);
    public static final j0 O = new j0(19);
    public static final /* synthetic */ k04 P = new k04(7);
    public static final k04 Q = new k04(8);
    public static final k04 R = new k04(10);
    public static final k04 S = new k04(11);
    public static final k04 T = new k04(12);
    public static final /* synthetic */ k04 U = new k04(13);
    public static final k04 V = new k04(14);
    public static final k04 W = new k04(15);
    public static final k04 q0 = new k04(21);
    public static final k04 r0 = new k04(22);
    public static final k04 s0 = new k04(23);
    public static final k04 t0 = new k04(24);
    public static final k04 u0 = new k04(25);
    public static final k04 v0 = new k04(26);
    public static final k04 w0 = new k04(27);
    public static final k04 x0 = new k04(28);
    public static final k04 y0 = new k04(29);

    static {
        byte b = 17;
        X = new k04(b);
        Y = new k04(b);
        Z = new k04(b);
        a0 = new k04(b);
        byte b2 = 18;
        b0 = new k04(b2);
        c0 = new k04(b2);
        d0 = new k04(b2);
        e0 = new k04(b2);
        f0 = new k04(b2);
        g0 = new k04(b2);
        byte b3 = 19;
        h0 = new k04(b3);
        i0 = new k04(b3);
        j0 = new k04(b3);
        k0 = new k04(b3);
        l0 = new k04(b3);
        m0 = new k04(b3);
        byte b4 = 20;
        n0 = new k04(b4);
        o0 = new k04(b4);
        p0 = new k04(b4);
    }

    public /* synthetic */ k04(byte b) {
        this.I = b;
    }

    public static t35 l(long j, long j2, long j3, long j4, long j5, long j6, go1 go1Var) {
        t35 t35Var;
        long j7;
        t35 t35Var2;
        long j8 = x70.g;
        k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
        t35 t35Var3 = k80Var.Y;
        boolean z = false;
        if (t35Var3 == null) {
            go1Var.d0(390452338);
            go1Var.q(false);
            t35Var = null;
        } else {
            go1Var.d0(390452339);
            f65 f65Var = (f65) go1Var.k(g65.a);
            if (!j42.c(t35Var3.k, f65Var)) {
                t35Var3 = t35Var3.a(t35Var3.a, t35Var3.b, t35Var3.c, t35Var3.d, t35Var3.e, t35Var3.f, t35Var3.g, t35Var3.h, t35Var3.i, t35Var3.j, f65Var, t35Var3.l, t35Var3.m, t35Var3.n, t35Var3.o, t35Var3.p, t35Var3.q, t35Var3.r, t35Var3.s, t35Var3.t, t35Var3.u, t35Var3.v, t35Var3.w, t35Var3.x, t35Var3.y, t35Var3.z, t35Var3.A, t35Var3.B, t35Var3.C, t35Var3.D, t35Var3.E, t35Var3.F, t35Var3.G, t35Var3.H, t35Var3.I, t35Var3.J, t35Var3.K, t35Var3.L, t35Var3.M, t35Var3.N, t35Var3.O, t35Var3.P, t35Var3.Q);
                k80Var.Y = t35Var3;
                z = false;
            }
            go1Var.q(z);
            t35Var = t35Var3;
        }
        if (t35Var == null) {
            go1Var.d0(-1788321191);
            long d = q80.d(k80Var, wx5.N);
            long d2 = q80.d(k80Var, wx5.T);
            l80 l80Var = wx5.A;
            long c = x70.c(q80.d(k80Var, l80Var), 0.38f);
            long d3 = q80.d(k80Var, wx5.H);
            long j9 = x70.f;
            long d4 = q80.d(k80Var, wx5.z);
            long d5 = q80.d(k80Var, wx5.G);
            f65 f65Var2 = (f65) go1Var.k(g65.a);
            long d6 = q80.d(k80Var, wx5.Q);
            long d7 = q80.d(k80Var, wx5.Z);
            long c2 = x70.c(q80.d(k80Var, wx5.D), 0.12f);
            long d8 = q80.d(k80Var, wx5.K);
            long d9 = q80.d(k80Var, wx5.P);
            long d10 = q80.d(k80Var, wx5.Y);
            long c3 = x70.c(q80.d(k80Var, wx5.C), 0.38f);
            long d11 = q80.d(k80Var, wx5.J);
            long d12 = q80.d(k80Var, wx5.S);
            long d13 = q80.d(k80Var, wx5.b0);
            long c4 = x70.c(q80.d(k80Var, wx5.F), 0.38f);
            long d14 = q80.d(k80Var, wx5.M);
            long d15 = q80.d(k80Var, wx5.O);
            long d16 = q80.d(k80Var, wx5.X);
            long c5 = x70.c(q80.d(k80Var, wx5.B), 0.38f);
            long d17 = q80.d(k80Var, wx5.I);
            l80 l80Var2 = wx5.U;
            long d18 = q80.d(k80Var, l80Var2);
            long d19 = q80.d(k80Var, l80Var2);
            j7 = j8;
            long c6 = x70.c(q80.d(k80Var, l80Var), 0.38f);
            long d20 = q80.d(k80Var, l80Var2);
            long d21 = q80.d(k80Var, wx5.R);
            long d22 = q80.d(k80Var, wx5.a0);
            long c7 = x70.c(q80.d(k80Var, wx5.E), 0.38f);
            long d23 = q80.d(k80Var, wx5.L);
            l80 l80Var3 = wx5.V;
            long d24 = q80.d(k80Var, l80Var3);
            long d25 = q80.d(k80Var, l80Var3);
            long c8 = x70.c(q80.d(k80Var, l80Var3), 0.38f);
            long d26 = q80.d(k80Var, l80Var3);
            l80 l80Var4 = wx5.W;
            t35 t35Var4 = new t35(d, d2, c, d3, j9, j9, j9, j9, d4, d5, f65Var2, d6, d7, c2, d8, d9, d10, c3, d11, d12, d13, c4, d14, d15, d16, c5, d17, d18, d19, c6, d20, d21, d22, c7, d23, d24, d25, c8, d26, q80.d(k80Var, l80Var4), q80.d(k80Var, l80Var4), x70.c(q80.d(k80Var, l80Var4), 0.38f), q80.d(k80Var, l80Var4));
            k80Var.Y = t35Var4;
            go1Var.q(false);
            t35Var2 = t35Var4;
        } else {
            j7 = j8;
            go1Var.d0(-1788515437);
            go1Var.q(false);
            t35Var2 = t35Var;
        }
        return t35Var2.a(j, j2, j7, j7, j3, j4, j7, j7, j7, j7, null, j5, j6, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7);
    }

    public static String m() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(107);
        for (int i = 0; i < 107; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(secureRandom.nextInt(62)));
        }
        return sb.toString();
    }

    public static byte[] n(String str, long j, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a1 a1Var = new a1(byteArrayOutputStream);
        int i = a1Var.c;
        byte[] bArr2 = (byte[]) a1Var.b;
        if (j != 0) {
            if (i - a1Var.d < 20) {
                a1Var.c();
            }
            a1Var.a(16);
            int i2 = a1Var.d;
            if ((j & (-128)) == 0) {
                bArr2[i2] = (byte) j;
                a1Var.d = i2 + 1;
            } else {
                bArr2[i2] = (byte) (((int) j) | 128);
                long j2 = j >>> 7;
                if ((j2 & (-128)) == 0) {
                    bArr2[i2 + 1] = (byte) j2;
                    a1Var.d = i2 + 2;
                } else {
                    bArr2[i2 + 1] = (byte) (((int) j2) | 128);
                    long j3 = j >>> 14;
                    if ((j3 & (-128)) == 0) {
                        bArr2[i2 + 2] = (byte) j3;
                        a1Var.d = i2 + 3;
                    } else {
                        bArr2[i2 + 2] = (byte) (((int) j3) | 128);
                        long j4 = j >>> 21;
                        if ((j4 & (-128)) == 0) {
                            bArr2[i2 + 3] = (byte) j4;
                            a1Var.d = i2 + 4;
                        } else {
                            bArr2[i2 + 3] = (byte) (((int) j4) | 128);
                            long j5 = j >>> 28;
                            if ((j5 & (-128)) == 0) {
                                bArr2[i2 + 4] = (byte) j5;
                                a1Var.d = i2 + 5;
                            } else {
                                bArr2[i2 + 4] = (byte) (((int) j5) | 128);
                                long j6 = j >>> 35;
                                if ((j6 & (-128)) == 0) {
                                    bArr2[i2 + 5] = (byte) j6;
                                    a1Var.d = i2 + 6;
                                } else {
                                    bArr2[i2 + 5] = (byte) (((int) j6) | 128);
                                    long j7 = j >>> 42;
                                    if ((j7 & (-128)) == 0) {
                                        bArr2[i2 + 6] = (byte) j7;
                                        a1Var.d = i2 + 7;
                                    } else {
                                        bArr2[i2 + 6] = (byte) (((int) j7) | 128);
                                        long j8 = j >>> 49;
                                        if ((j8 & (-128)) == 0) {
                                            bArr2[i2 + 7] = (byte) j8;
                                            a1Var.d = i2 + 8;
                                        } else {
                                            bArr2[i2 + 7] = (byte) (((int) j8) | 128);
                                            long j9 = j >>> 56;
                                            if (((-128) & j9) == 0) {
                                                bArr2[i2 + 8] = (byte) j9;
                                                a1Var.d = i2 + 9;
                                            } else {
                                                bArr2[i2 + 8] = (byte) (((int) j9) | 128);
                                                bArr2[i2 + 9] = (byte) (j >>> 63);
                                                a1Var.d = i2 + 10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i - a1Var.d < 5) {
            a1Var.c();
        }
        a1Var.a(58);
        int length = str.length() * 3;
        int numberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6;
        int i3 = numberOfLeadingZeros + length;
        if (i3 > i) {
            byte[] bArr3 = new byte[length];
            int k = mg5.a.k(str, bArr3, 0, length);
            if (i - a1Var.d < 5) {
                a1Var.c();
            }
            a1Var.a(k);
            a1Var.q(k, bArr3);
        } else {
            if (i3 > i - a1Var.d) {
                a1Var.c();
            }
            int numberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            int i4 = a1Var.d;
            try {
                if (numberOfLeadingZeros2 == numberOfLeadingZeros) {
                    int i5 = i4 + numberOfLeadingZeros2;
                    a1Var.d = i5;
                    int k2 = mg5.a.k(str, bArr2, i5, i - i5);
                    a1Var.d = i4;
                    a1Var.a((k2 - i4) - numberOfLeadingZeros2);
                    a1Var.d = k2;
                } else {
                    eg5 eg5Var = mg5.a;
                    int m = eg5Var.m(str);
                    a1Var.a(m);
                    a1Var.d = eg5Var.k(str, bArr2, a1Var.d, m);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new f70("CodedOutputStream was writing to a flat byte array and ran out of space.", (Throwable) e);
            }
        }
        if (bArr.length != 0) {
            int length2 = bArr.length;
            if (i - a1Var.d < 5) {
                a1Var.c();
            }
            a1Var.a(66);
            if (i - a1Var.d < 5) {
                a1Var.c();
            }
            a1Var.a(length2);
            a1Var.q(length2, bArr);
        }
        if (a1Var.d > 0) {
            a1Var.c();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static LinkedHashMap p(String str) {
        str.getClass();
        uj3[] uj3VarArr = {new uj3("aid", "6383"), new uj3("app_name", "douyin_web"), new uj3("live_id", "1"), new uj3("device_platform", "web"), new uj3("language", "zh-CN"), new uj3("browser_language", "zh-CN"), new uj3("browser_platform", "Win32"), new uj3("browser_name", "Chrome"), new uj3("browser_version", "125.0.0.0"), new uj3("web_rid", str), new uj3("msToken", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sv2.J(11));
        sv2.S(linkedHashMap, uj3VarArr);
        return linkedHashMap;
    }

    public static String q(String str, Map map) {
        map.getClass();
        String Z0 = o70.Z0(map.entrySet(), "&", null, null, 0, new m90((byte) 21), 30);
        String encode = URLEncoder.encode(str, "UTF-8");
        encode.getClass();
        return Z0 + "&msToken=" + encode;
    }

    public static rp2 r(byte[] bArr) {
        int j;
        int j2;
        bArr.getClass();
        c70 b = c70.b(bArr);
        wp2 wp2Var = new wp2(0L, "", 0, "");
        String str = "";
        long j3 = 0;
        int i = 0;
        while (!b.a() && (j = b.j()) != 0) {
            int i2 = j >>> 3;
            if (i2 == 2) {
                byte[] d = b.d();
                d.getClass();
                c70 b2 = c70.b(d);
                String str2 = "";
                String str3 = str2;
                long j4 = 0;
                int i3 = 0;
                while (!b2.a() && (j2 = b2.j()) != 0) {
                    int i4 = j2 >>> 3;
                    if (i4 == 1) {
                        j4 = b2.g();
                    } else if (i4 == 3) {
                        str2 = b2.i();
                    } else if (i4 == 6) {
                        i3 = b2.f();
                    } else if (i4 != 1028) {
                        b2.k(j2);
                    } else {
                        str3 = b2.i();
                    }
                }
                wp2Var = new wp2(j4, str2, i3, str3);
            } else if (i2 == 3) {
                str = b.i();
            } else if (i2 == 15) {
                j3 = b.g();
            } else if (i2 != 20) {
                b.k(j);
            } else {
                i = b.f();
            }
        }
        return new rp2(wp2Var, str, j3, i);
    }

    public static tp2 s(byte[] bArr) {
        int j;
        int j2;
        bArr.getClass();
        c70 b = c70.b(bArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j3 = 0;
        byte[] bArr2 = new byte[0];
        String str = "";
        String str2 = str;
        while (!b.a() && (j = b.j()) != 0) {
            int i = j >>> 3;
            if (i == 2) {
                j3 = b.g();
            } else if (i == 5) {
                byte[] d = b.d();
                d.getClass();
                c70 b2 = c70.b(d);
                String str3 = "";
                String str4 = str3;
                while (!b2.a() && (j2 = b2.j()) != 0) {
                    int i2 = j2 >>> 3;
                    if (i2 == 1) {
                        str3 = b2.i();
                    } else if (i2 != 2) {
                        b2.k(j2);
                    } else {
                        str4 = b2.i();
                    }
                }
                if (!jx4.L(str3)) {
                    linkedHashMap.put(str3, str4);
                }
            } else if (i == 6) {
                str = b.i();
            } else if (i == 7) {
                str2 = b.i();
            } else if (i != 8) {
                b.k(j);
            } else {
                bArr2 = b.d();
                bArr2.getClass();
            }
        }
        return new tp2(j3, str, str2, bArr2, linkedHashMap);
    }

    public static up2 t(byte[] bArr) {
        boolean z;
        int j;
        int j2;
        c70 b = c70.b(bArr);
        ArrayList arrayList = new ArrayList();
        String str = "";
        loop0: while (true) {
            z = false;
            while (!b.a() && (j = b.j()) != 0) {
                int i = j >>> 3;
                if (i == 1) {
                    byte[] d = b.d();
                    d.getClass();
                    c70 b2 = c70.b(d);
                    byte[] bArr2 = new byte[0];
                    String str2 = "";
                    while (!b2.a() && (j2 = b2.j()) != 0) {
                        int i2 = j2 >>> 3;
                        if (i2 == 1) {
                            str2 = b2.i();
                        } else if (i2 != 2) {
                            b2.k(j2);
                        } else {
                            bArr2 = b2.d();
                            bArr2.getClass();
                        }
                    }
                    arrayList.add(new sp2(str2, bArr2));
                } else if (i == 5) {
                    str = b.i();
                } else if (i != 9) {
                    b.k(j);
                } else if (b.g() != 0) {
                    z = true;
                }
            }
        }
        return new up2(str, arrayList, z);
    }

    public static vp2 u(byte[] bArr) {
        int j;
        bArr.getClass();
        c70 b = c70.b(bArr);
        long j2 = 0;
        while (!b.a() && (j = b.j()) != 0) {
            if ((j >>> 3) == 7) {
                j2 = b.g();
            } else {
                b.k(j);
            }
        }
        return new vp2(j2);
    }

    public static String v(String str) {
        str.getClass();
        return "https://live.douyin.com/".concat(str);
    }

    public static String w(Map map, String str, String str2) {
        map.getClass();
        StringBuilder sb = new StringBuilder("https://live.douyin.com/webcast/room/web/enter/?");
        sb.append(q(str, map));
        sb.append("&a_bogus=");
        String encode = URLEncoder.encode(str2, "UTF-8");
        encode.getClass();
        sb.append(encode);
        return sb.toString();
    }

    @Override // defpackage.ak4
    public void a(Object obj, mp4 mp4Var) {
        bp1 a;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((j43) obj).a);
        unmodifiableMap.getClass();
        ds3 k = fs3.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            bs3 bs3Var = (bs3) entry.getKey();
            Object value = entry.getValue();
            String str = bs3Var.a;
            if (value instanceof Boolean) {
                is3 r = js3.r();
                boolean booleanValue = ((Boolean) value).booleanValue();
                r.c();
                ((js3) r.J).s(booleanValue);
                a = r.a();
            } else if (value instanceof Float) {
                is3 r2 = js3.r();
                float floatValue = ((Number) value).floatValue();
                r2.c();
                ((js3) r2.J).u(floatValue);
                a = r2.a();
            } else if (value instanceof Double) {
                is3 r3 = js3.r();
                double doubleValue = ((Number) value).doubleValue();
                r3.c();
                ((js3) r3.J).t(doubleValue);
                a = r3.a();
            } else if (value instanceof Integer) {
                is3 r4 = js3.r();
                int intValue = ((Number) value).intValue();
                r4.c();
                ((js3) r4.J).v(intValue);
                a = r4.a();
            } else if (value instanceof Long) {
                is3 r5 = js3.r();
                long longValue = ((Number) value).longValue();
                r5.c();
                ((js3) r5.J).w(longValue);
                a = r5.a();
            } else if (value instanceof String) {
                is3 r6 = js3.r();
                r6.c();
                ((js3) r6.J).x((String) value);
                a = r6.a();
            } else {
                if (!(value instanceof Set)) {
                    zy.i(j42.d0(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return;
                }
                is3 r7 = js3.r();
                gs3 l = hs3.l();
                l.c();
                ((hs3) l.J).i((Set) value);
                r7.c();
                ((js3) r7.J).y(l);
                a = r7.a();
            }
            k.getClass();
            k.c();
            ((fs3) k.J).j().put(str, (js3) a);
        }
        fs3 fs3Var = (fs3) k.a();
        int a2 = fs3Var.a();
        Logger logger = i70.f;
        if (a2 > 4096) {
            a2 = 4096;
        }
        i70 i70Var = new i70(mp4Var, a2);
        fs3Var.c(i70Var);
        if (i70Var.d > 0) {
            i70Var.p();
        }
    }

    @Override // defpackage.ak4
    public Object b() {
        return new j43(true);
    }

    @Override // defpackage.yy4
    public void c(xy4 xy4Var) {
        xy4Var.clear();
    }

    @Override // defpackage.hx
    public Rect d(Activity activity) {
        int i;
        DisplayCutout l;
        byte b = this.I;
        gx gxVar = hx.a;
        switch (b) {
            case 2:
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getClass();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect();
                int i2 = point.x;
                if (i2 == 0 || (i = point.y) == 0) {
                    defaultDisplay.getRectSize(rect);
                } else {
                    rect.right = i2;
                    rect.bottom = i;
                }
                return rect;
            case 3:
                Rect rect2 = new Rect();
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay2.getRectSize(rect2);
                if (!g7.k(activity)) {
                    Point point2 = new Point();
                    defaultDisplay2.getRealSize(point2);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect2.bottom + dimensionPixelSize;
                    if (i3 == point2.y) {
                        rect2.bottom = i3;
                    } else {
                        int i4 = rect2.right + dimensionPixelSize;
                        if (i4 == point2.x) {
                            rect2.right = i4;
                        }
                    }
                }
                return rect2;
            case 4:
                Rect rect3 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (g7.k(activity)) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect3.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect3.set((Rect) invoke2);
                    }
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    gxVar.getClass();
                    Log.w(gx.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect3);
                }
                Display defaultDisplay3 = activity.getWindowManager().getDefaultDisplay();
                Point point3 = new Point();
                defaultDisplay3.getRealSize(point3);
                if (!g7.k(activity)) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i5 = rect3.bottom + dimensionPixelSize2;
                    if (i5 == point3.y) {
                        rect3.bottom = i5;
                    } else {
                        int i6 = rect3.right + dimensionPixelSize2;
                        if (i6 == point3.x) {
                            rect3.right = i6;
                        } else if (rect3.left == dimensionPixelSize2) {
                            rect3.left = 0;
                        }
                    }
                }
                if ((rect3.width() < point3.x || rect3.height() < point3.y) && !g7.k(activity) && (l = ck.l(defaultDisplay3)) != null) {
                    if (rect3.left == ck.E(l)) {
                        rect3.left = 0;
                    }
                    if (point3.x - rect3.right == ck.F(l)) {
                        rect3.right = ck.F(l) + rect3.right;
                    }
                    if (rect3.top == ck.G(l)) {
                        rect3.top = 0;
                    }
                    if (point3.y - rect3.bottom == ck.D(l)) {
                        rect3.bottom = ck.D(l) + rect3.bottom;
                    }
                }
                return rect3;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object invoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    gxVar.getClass();
                    Log.w(gx.b, e2);
                    return M.d(activity);
                }
        }
    }

    @Override // defpackage.vz3
    public float e(float f) {
        switch (this.I) {
            case 24:
                return f;
            default:
                double d = f;
                return (float) (d < 0.031248d ? d / 16.0d : e21.Q(d, 1.8d));
        }
    }

    @Override // defpackage.ak4
    public Object f(FileInputStream fileInputStream) {
        try {
            fs3 l = fs3.l(fileInputStream);
            j43 j43Var = new j43(false);
            cs3[] cs3VarArr = (cs3[]) Arrays.copyOf(new cs3[0], 0);
            if (j43Var.b.get()) {
                zy.i("Do mutate preferences once returned to DataStore.");
                return null;
            }
            if (cs3VarArr.length > 0) {
                cs3 cs3Var = cs3VarArr[0];
                throw null;
            }
            Map i = l.i();
            i.getClass();
            for (Map.Entry entry : i.entrySet()) {
                String str = (String) entry.getKey();
                js3 js3Var = (js3) entry.getValue();
                str.getClass();
                js3Var.getClass();
                int q = js3Var.q();
                switch (q == 0 ? -1 : ks3.a[pt1.F(q)]) {
                    case -1:
                        throw new kl0("Value case is null.", null);
                    case 0:
                    default:
                        s83.v();
                        return null;
                    case 1:
                        j43Var.a(new bs3(str), Boolean.valueOf(js3Var.i()));
                        break;
                    case 2:
                        j43Var.a(new bs3(str), Float.valueOf(js3Var.l()));
                        break;
                    case 3:
                        j43Var.a(new bs3(str), Double.valueOf(js3Var.k()));
                        break;
                    case 4:
                        j43Var.a(new bs3(str), Integer.valueOf(js3Var.m()));
                        break;
                    case 5:
                        j43Var.a(new bs3(str), Long.valueOf(js3Var.n()));
                        break;
                    case 6:
                        bs3 bs3Var = new bs3(str);
                        String o = js3Var.o();
                        o.getClass();
                        j43Var.a(bs3Var, o);
                        break;
                    case 7:
                        bs3 bs3Var2 = new bs3(str);
                        o32 k = js3Var.p().k();
                        k.getClass();
                        j43Var.a(bs3Var2, o70.u1(k));
                        break;
                    case 8:
                        throw new kl0("Value not set.", null);
                }
            }
            return j43Var.b();
        } catch (z42 e) {
            throw new kl0("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.yy4
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.vz3
    public float h(float f) {
        switch (this.I) {
            case 24:
                return f;
            default:
                double d = f;
                return (float) (d < 0.001953d ? d * 16.0d : e21.Q(d, 0.5555555555555556d));
        }
    }

    @Override // defpackage.ju0
    public float i(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(final boolean r25, final defpackage.t33 r26, defpackage.l13 r27, final defpackage.t35 r28, final defpackage.dn4 r29, float r30, float r31, defpackage.fe0 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k04.j(boolean, t33, l13, t35, dn4, float, float, fe0, int, int):void");
    }

    public void k(final String str, final hn1 hn1Var, final boolean z, final boolean z2, final hn3 hn3Var, final t33 t33Var, final hn1 hn1Var2, final t35 t35Var, ji3 ji3Var, final tc0 tc0Var, fe0 fe0Var, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        hn3 hn3Var2;
        go1 go1Var;
        final ji3 ji3Var2;
        ji3 li3Var;
        int i3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (go1Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.i(hn1Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z3 = z;
            i2 |= go1Var2.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= go1Var2.h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            hn3Var2 = hn3Var;
            i2 |= go1Var2.g(hn3Var2) ? 16384 : 8192;
        } else {
            hn3Var2 = hn3Var;
        }
        if ((i & 196608) == 0) {
            i2 |= go1Var2.g(t33Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= go1Var2.h(false) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= go1Var2.i(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= go1Var2.i(hn1Var2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= go1Var2.i(null) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i4 = 14155776 | (go1Var2.i(null) ? 4 : 2) | (go1Var2.i(null) ? 32 : 16) | (go1Var2.i(null) ? 256 : 128) | (go1Var2.i(null) ? 2048 : 1024) | (go1Var2.g(t35Var) ? 16384 : 8192) | 65536;
        if (go1Var2.T(i2 & 1, ((306783379 & i2) == 306783378 && (4793491 & i4) == 4793490) ? false : true)) {
            go1Var2.Y();
            if ((i & 1) == 0 || go1Var2.C()) {
                li3Var = new li3(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i4 & (-458753);
            } else {
                go1Var2.W();
                i3 = i4 & (-458753);
                li3Var = ji3Var;
            }
            go1Var2.r();
            boolean z5 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object Q2 = go1Var2.Q();
            if (z5 || Q2 == de0.a) {
                oj ojVar = new oj(str);
                hn3Var2.getClass();
                Q2 = new u95(ojVar, sd3.a);
                go1Var2.o0(Q2);
            }
            String str2 = ((u95) Q2).a.J;
            f45 f45Var = new f45();
            go1Var2.d0(1927010204);
            go1Var2.q(false);
            int i5 = i2 >> 12;
            int i6 = i3 << 18;
            go1Var = go1Var2;
            kb4.a(str2, hn1Var, f45Var, null, hn1Var2, z4, z3, t33Var, li3Var, t35Var, tc0Var, go1Var, (i2 & 112) | (57344 & i5) | (i5 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & C.ENCODING_PCM_DOUBLE), ((i2 >> 6) & 7168) | ((i2 >> 9) & 14) | ((i2 >> 3) & 112) | (i5 & 896) | ((i3 << 3) & 458752) | 1572864);
            ji3Var2 = li3Var;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            ji3Var2 = ji3Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: bh3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k04.this.k(str, hn1Var, z, z2, hn3Var, t33Var, hn1Var2, t35Var, ji3Var2, tc0Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }
}
