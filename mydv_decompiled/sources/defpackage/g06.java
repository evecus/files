package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public abstract class g06 {
    public static final y06 a(ht5 ht5Var) {
        ht5Var.getClass();
        return ht5Var.equals(sw1.b) ? z06.a : ht5Var.equals(sw1.a) ? z06.b : new y06(ht5Var);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = ok3.J;
        ok3 f = o63.f("/");
        LinkedHashMap O = sv2.O(new uj3(f, new e16(f, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (e16 e16Var : o70.k1(arrayList, new xi1((byte) 19))) {
            if (((e16) O.put(e16Var.a, e16Var)) == null) {
                while (true) {
                    ok3 ok3Var = e16Var.a;
                    ok3 c = ok3Var.c();
                    if (c != null) {
                        e16 e16Var2 = (e16) O.get(c);
                        if (e16Var2 != null) {
                            e16Var2.q.add(ok3Var);
                            break;
                        }
                        e16 e16Var3 = new e16(c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        O.put(c, e16Var3);
                        e16Var3.q.add(ok3Var);
                        e16Var = e16Var3;
                    }
                }
            }
        }
        return O;
    }

    public static final String c(int i) {
        o7.k(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    public static final f16 d(ok3 ok3Var, ke1 ke1Var, tm1 tm1Var) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int g;
        ge1 openReadOnly = ke1Var.openReadOnly(ok3Var);
        try {
            long size = openReadOnly.size();
            long j = size - 22;
            if (j < 0) {
                throw new IOException("not a zip: size=" + openReadOnly.size());
            }
            long max = Math.max(size - 65558, 0L);
            do {
                s04 s04Var = new s04(openReadOnly.t(j));
                try {
                    if (s04Var.g() == 101010256) {
                        int t = s04Var.t() & 65535;
                        int t2 = s04Var.t() & 65535;
                        long t3 = s04Var.t() & 65535;
                        if (t3 != (s04Var.t() & 65535) || t != 0 || t2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        s04Var.skip(4L);
                        int t4 = s04Var.t() & 65535;
                        bb1 bb1Var = new bb1(t3, 4294967295L & s04Var.g(), t4);
                        s04Var.f(t4);
                        s04Var.close();
                        long j2 = j - 20;
                        if (j2 > 0) {
                            s04Var = new s04(openReadOnly.t(j2));
                            try {
                                if (s04Var.g() == 117853008) {
                                    int g2 = s04Var.g();
                                    long n = s04Var.n();
                                    if (s04Var.g() != 1 || g2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    s04Var = new s04(openReadOnly.t(n));
                                    try {
                                        g = s04Var.g();
                                    } catch (Throwable th4) {
                                        try {
                                        } catch (Throwable th5) {
                                            sv2.i(th4, th5);
                                        }
                                        th3 = th4;
                                    }
                                    if (g != 101075792) {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(g));
                                    }
                                    s04Var.skip(12L);
                                    int g3 = s04Var.g();
                                    int g4 = s04Var.g();
                                    long n2 = s04Var.n();
                                    if (n2 != s04Var.n() || g3 != 0 || g4 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    s04Var.skip(8L);
                                    try {
                                        th3 = null;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                    }
                                    bb1Var = new bb1(n2, s04Var.n(), t4);
                                    if (th3 != null) {
                                        throw th3;
                                    }
                                }
                                try {
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                } catch (Throwable th9) {
                                    sv2.i(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        s04Var = new s04(openReadOnly.t(bb1Var.b));
                        try {
                            long j3 = bb1Var.a;
                            for (long j4 = 0; j4 < j3; j4++) {
                                e16 f = f(s04Var);
                                if (f.h >= bb1Var.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) tm1Var.invoke(f)).booleanValue()) {
                                    arrayList.add(f);
                                }
                            }
                            try {
                                th = null;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            try {
                            } catch (Throwable th12) {
                                sv2.i(th11, th12);
                            }
                            th = th11;
                        }
                        if (th != null) {
                            throw th;
                        }
                        f16 f16Var = new f16(ok3Var, ke1Var, b(arrayList));
                        try {
                            openReadOnly.close();
                        } catch (Throwable unused) {
                        }
                        return f16Var;
                    }
                    s04Var.close();
                    j--;
                } finally {
                    s04Var.close();
                }
            } while (j >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static byte[] e(int i, int i2, long j) {
        byte[] bArr = new byte[32];
        dq2.a0(bArr, i, 0);
        dq2.n0(bArr, 4, j);
        dq2.a0(bArr, 0, 12);
        dq2.a0(bArr, i2, 16);
        return bArr;
    }

    public static final e16 f(final s04 s04Var) {
        int g = s04Var.g();
        if (g != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(g));
        }
        s04Var.skip(4L);
        short t = s04Var.t();
        int i = t & 65535;
        if ((t & 1) != 0) {
            zl1.g("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        int t2 = s04Var.t() & 65535;
        int t3 = s04Var.t() & 65535;
        int t4 = s04Var.t() & 65535;
        long g2 = s04Var.g() & 4294967295L;
        final q24 q24Var = new q24();
        q24Var.I = s04Var.g() & 4294967295L;
        final q24 q24Var2 = new q24();
        q24Var2.I = s04Var.g() & 4294967295L;
        int t5 = s04Var.t() & 65535;
        int t6 = s04Var.t() & 65535;
        int t7 = s04Var.t() & 65535;
        s04Var.skip(8L);
        final q24 q24Var3 = new q24();
        q24Var3.I = s04Var.g() & 4294967295L;
        String f = s04Var.f(t5);
        if (jx4.E(f, (char) 0)) {
            zl1.g("bad zip: filename contains 0x00");
            return null;
        }
        long j = q24Var2.I == 4294967295L ? 8L : 0L;
        if (q24Var.I == 4294967295L) {
            j += 8;
        }
        if (q24Var3.I == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final r24 r24Var = new r24();
        final r24 r24Var2 = new r24();
        final r24 r24Var3 = new r24();
        final n24 n24Var = new n24();
        g(s04Var, t6, new hn1() { // from class: h16
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                s04 s04Var2 = s04Var;
                if (intValue == 1) {
                    n24 n24Var2 = n24.this;
                    if (n24Var2.I) {
                        zl1.g("bad zip: zip64 extra repeated");
                        return null;
                    }
                    n24Var2.I = true;
                    if (longValue < j2) {
                        zl1.g("bad zip: zip64 extra too short");
                        return null;
                    }
                    q24 q24Var4 = q24Var2;
                    long j3 = q24Var4.I;
                    if (j3 == 4294967295L) {
                        j3 = s04Var2.n();
                    }
                    q24Var4.I = j3;
                    q24 q24Var5 = q24Var;
                    q24Var5.I = q24Var5.I == 4294967295L ? s04Var2.n() : 0L;
                    q24 q24Var6 = q24Var3;
                    q24Var6.I = q24Var6.I == 4294967295L ? s04Var2.n() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        zl1.g("bad zip: NTFS extra too short");
                        return null;
                    }
                    s04Var2.skip(4L);
                    g06.g(s04Var2, (int) (longValue - 4), new g16(r24Var, s04Var2, r24Var2, r24Var3));
                }
                return wd5.a;
            }
        });
        if (j2 > 0 && !n24Var.I) {
            zl1.g("bad zip: zip64 extra required but absent");
            return null;
        }
        String f2 = s04Var.f(t7);
        String str = ok3.J;
        return new e16(o63.f("/").f(f), qx4.s(f, "/", false), f2, g2, q24Var.I, q24Var2.I, t2, q24Var3.I, t4, t3, (Long) r24Var.I, (Long) r24Var2.I, (Long) r24Var3.I, 57344);
    }

    public static final void g(s04 s04Var, int i, hn1 hn1Var) {
        cz czVar = s04Var.J;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                zl1.g("bad zip: truncated header in extra field");
                return;
            }
            int t = s04Var.t() & 65535;
            long t2 = s04Var.t() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < t2) {
                zl1.g("bad zip: truncated value in extra field");
                return;
            }
            s04Var.U(t2);
            long j3 = czVar.J;
            hn1Var.invoke(Integer.valueOf(t), Long.valueOf(t2));
            long j4 = (czVar.J + t2) - j3;
            if (j4 < 0) {
                zl1.g(hf1.u(t, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    czVar.skip(j4);
                }
                j = j2 - t2;
            }
        }
    }

    public static final e16 h(s04 s04Var, e16 e16Var) {
        int g = s04Var.g();
        if (g != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(g));
        }
        s04Var.skip(2L);
        short t = s04Var.t();
        int i = t & 65535;
        if ((t & 1) != 0) {
            zl1.g("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        s04Var.skip(18L);
        long t2 = s04Var.t() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int t3 = s04Var.t() & 65535;
        s04Var.skip(t2);
        if (e16Var == null) {
            s04Var.skip(t3);
            return null;
        }
        r24 r24Var = new r24();
        r24 r24Var2 = new r24();
        r24 r24Var3 = new r24();
        g(s04Var, t3, new g16(s04Var, r24Var, r24Var2, r24Var3));
        return new e16(e16Var.a, e16Var.b, e16Var.c, e16Var.d, e16Var.e, e16Var.f, e16Var.g, e16Var.h, e16Var.i, e16Var.j, e16Var.k, e16Var.l, e16Var.m, (Integer) r24Var.I, (Integer) r24Var2.I, (Integer) r24Var3.I);
    }

    public static byte[] i(int i, byte[] bArr) {
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        dq2.a0(bArr2, i, 12);
        return bArr2;
    }
}
