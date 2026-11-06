package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ma1 {
    public static final ub5 a = new ub5(hh.N, hh.O);
    public static final ku4 b = qb.g0(0.0f, 400.0f, null, 5);
    public static final ku4 c = qb.g0(0.0f, 400.0f, null, 5);
    public static final ku4 d;
    public static final ku4 e;

    static {
        Map map = js5.a;
        d = qb.g0(0.0f, 400.0f, new r22(4294967297L), 1);
        e = qb.g0(0.0f, 400.0f, new z22(4294967297L), 1);
    }

    public static final void a(ea5 ea5Var, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(ea5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(rm1Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            jk3 jk3Var = ea5Var.e;
            jk3 jk3Var2 = ea5Var.d;
            boolean z = jk3Var.getValue() != null;
            if (j42.c(ea5Var.a.d(), jk3Var2.getValue()) && !z) {
                rm1Var.invoke();
            }
            Object Q = go1Var.Q();
            Object obj = de0.a;
            Object obj2 = Q;
            if (Q == obj) {
                boolean[] zArr = {z};
                go1Var.o0(zArr);
                obj2 = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj2;
            Object Q2 = go1Var.Q();
            if (Q2 == obj) {
                Q2 = new Object[1];
                go1Var.o0(Q2);
            }
            Object[] objArr = (Object[]) Q2;
            if (!j42.c(objArr[0], jk3Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    rm1Var.invoke();
                }
                objArr[0] = jk3Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new da1(ea5Var, rm1Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.l13 b(defpackage.ea5 r19, defpackage.ta1 r20, defpackage.bc1 r21, defpackage.on4 r22, java.lang.String r23, defpackage.fe0 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma1.b(ea5, ta1, bc1, on4, java.lang.String, fe0, int, int):l13");
    }

    public static final ta1 c(ve1 ve1Var, u8 u8Var, tm1 tm1Var) {
        return new ta1(new da5((cd1) null, (xq4) null, new i20(u8Var, tm1Var, ve1Var, true), (ga4) null, (LinkedHashMap) null, 123));
    }

    public static ta1 d() {
        Map map = js5.a;
        ku4 g0 = qb.g0(0.0f, 400.0f, new z22(4294967297L), 1);
        uv uvVar = q8.U;
        return c(g0, uvVar.equals(q8.S) ? q8.K : uvVar.equals(uvVar) ? q8.Q : q8.N, new fh((byte) 11));
    }

    public static ta1 e(ve1 ve1Var, int i) {
        if ((i & 1) != 0) {
            ve1Var = qb.g0(0.0f, 400.0f, null, 5);
        }
        return new ta1(new da5(new cd1(0.0f, ve1Var), (xq4) null, (i20) null, (ga4) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static bc1 f(ve1 ve1Var, int i) {
        if ((i & 1) != 0) {
            ve1Var = qb.g0(0.0f, 400.0f, null, 5);
        }
        return new bc1(new da5(new cd1(0.0f, ve1Var), (xq4) null, (i20) null, (ga4) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static final bc1 g(ve1 ve1Var, u8 u8Var, tm1 tm1Var) {
        return new bc1(new da5((cd1) null, (xq4) null, new i20(u8Var, tm1Var, ve1Var, true), (ga4) null, (LinkedHashMap) null, 123));
    }

    public static bc1 h() {
        Map map = js5.a;
        ku4 g0 = qb.g0(0.0f, 400.0f, new z22(4294967297L), 1);
        uv uvVar = q8.U;
        return g(g0, uvVar.equals(q8.S) ? q8.K : uvVar.equals(uvVar) ? q8.Q : q8.N, new fh((byte) 13));
    }

    public static final ta1 i(ve1 ve1Var, tm1 tm1Var) {
        return new ta1(new da5((cd1) null, new xq4(ve1Var, new la1(tm1Var, (byte) 1)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
    }

    public static final bc1 j(ve1 ve1Var, tm1 tm1Var) {
        return new bc1(new da5((cd1) null, new xq4(ve1Var, new la1(tm1Var, (byte) 3)), (i20) null, (ga4) null, (LinkedHashMap) null, 125));
    }

    public static final ta1 k(ea5 ea5Var, ta1 ta1Var, fe0 fe0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((go1) fe0Var).g(ea5Var)) || (i & 6) == 4;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (z || Q == de0.a) {
            Q = ad4.w(ta1Var);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        ss4 ss4Var = ea5Var.a;
        jk3 jk3Var = ea5Var.d;
        if (ss4Var.d() == jk3Var.getValue() && ea5Var.a.d() == aa1.J) {
            if (ea5Var.i()) {
                t43Var.setValue(ta1Var);
            } else {
                t43Var.setValue(ta1.b);
            }
        } else if (jk3Var.getValue() != aa1.K) {
            t43Var.setValue(((ta1) t43Var.getValue()).a(ta1Var));
        }
        return (ta1) t43Var.getValue();
    }

    public static final bc1 l(ea5 ea5Var, bc1 bc1Var, fe0 fe0Var, int i) {
        xq4 xq4Var;
        i20 i20Var;
        boolean z = (((i & 14) ^ 6) > 4 && ((go1) fe0Var).g(ea5Var)) || (i & 6) == 4;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (z || Q == jpVar) {
            Q = ad4.w(bc1Var);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        ss4 ss4Var = ea5Var.a;
        jk3 jk3Var = ea5Var.d;
        Object d2 = ss4Var.d();
        Object value = jk3Var.getValue();
        aa1 aa1Var = aa1.J;
        if (d2 == value && ea5Var.a.d() == aa1Var) {
            go1Var.d0(-505142498);
            go1Var.q(false);
            if (ea5Var.i()) {
                t43Var.setValue(bc1Var);
            } else {
                t43Var.setValue(bc1.b);
            }
        } else if (jk3Var.getValue() != aa1Var) {
            go1Var.d0(-504838512);
            cd1 cd1Var = ((bc1) t43Var.getValue()).a.a;
            cd1 cd1Var2 = cd1Var != null ? new cd1(1.0f, cd1Var.b) : null;
            ga4 ga4Var = ((bc1) t43Var.getValue()).a.d;
            ga4 ga4Var2 = ga4Var != null ? new ga4(1.0f, ga4Var.b, ga4Var.c) : null;
            xq4 xq4Var2 = ((bc1) t43Var.getValue()).a.b;
            if (xq4Var2 == null) {
                go1Var.d0(-504119809);
                go1Var.q(false);
                xq4Var = null;
            } else {
                go1Var.d0(-708998590);
                Object Q2 = go1Var.Q();
                if (Q2 == jpVar) {
                    Q2 = hh.P;
                    go1Var.o0(Q2);
                }
                xq4 xq4Var3 = new xq4(xq4Var2.b, (tm1) Q2);
                go1Var.q(false);
                xq4Var = xq4Var3;
            }
            i20 i20Var2 = ((bc1) t43Var.getValue()).a.c;
            if (i20Var2 == null) {
                go1Var.d0(-504024174);
                go1Var.q(false);
                i20Var = null;
            } else {
                go1Var.d0(-708995505);
                Object Q3 = go1Var.Q();
                if (Q3 == jpVar) {
                    Q3 = fh.P;
                    go1Var.o0(Q3);
                }
                i20 i20Var3 = new i20(i20Var2.a, (tm1) Q3, i20Var2.c, i20Var2.d);
                go1Var.q(false);
                i20Var = i20Var3;
            }
            da5 da5Var = ((bc1) t43Var.getValue()).a;
            t43Var.setValue(new bc1(new da5(cd1Var2, xq4Var, i20Var, ga4Var2, (LinkedHashMap) null, 96)).a(bc1Var));
            go1Var.q(false);
        } else {
            go1Var.d0(-503833306);
            go1Var.q(false);
        }
        return (bc1) t43Var.getValue();
    }
}
