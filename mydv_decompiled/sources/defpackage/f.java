package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class f {
    public static final h00 a;
    public static final h00 b;
    public static final h00 c;
    public static final h00 d;
    public static final h00 e;

    static {
        h00 h00Var = h00.L;
        a = jp.h("/");
        b = jp.h("\\");
        c = jp.h("/\\");
        d = jp.h(".");
        e = jp.h("..");
    }

    public static final ok3 a(ok3 ok3Var, ok3 ok3Var2, boolean z) {
        ok3Var2.getClass();
        if (c(ok3Var2) != -1 || ok3Var2.h() != null) {
            return ok3Var2;
        }
        h00 b2 = b(ok3Var);
        if (b2 == null && (b2 = b(ok3Var2)) == null) {
            b2 = f(ok3.J);
        }
        cz czVar = new cz();
        czVar.c0(ok3Var.I);
        if (czVar.J > 0) {
            czVar.c0(b2);
        }
        czVar.c0(ok3Var2.I);
        return d(czVar, z);
    }

    public static final h00 b(ok3 ok3Var) {
        h00 h00Var = ok3Var.I;
        h00 h00Var2 = a;
        if (h00.g(h00Var, h00Var2) != -1) {
            return h00Var2;
        }
        h00 h00Var3 = ok3Var.I;
        h00 h00Var4 = b;
        if (h00.g(h00Var3, h00Var4) != -1) {
            return h00Var4;
        }
        return null;
    }

    public static final int c(ok3 ok3Var) {
        h00 h00Var = ok3Var.I;
        if (h00Var.d() != 0) {
            if (h00Var.i(0) != 47) {
                if (h00Var.i(0) == 92) {
                    if (h00Var.d() > 2 && h00Var.i(1) == 92) {
                        h00 h00Var2 = b;
                        h00Var2.getClass();
                        int f = h00Var.f(2, h00Var2.h());
                        return f == -1 ? h00Var.d() : f;
                    }
                } else if (h00Var.d() > 2 && h00Var.i(1) == 58 && h00Var.i(2) == 92) {
                    char i = (char) h00Var.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' <= i && i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ok3 d(defpackage.cz r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.d(cz, boolean):ok3");
    }

    public static final h00 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        s83.t(hf1.u(b2, "not a directory separator: "));
        return null;
    }

    public static final h00 f(String str) {
        if (j42.c(str, "/")) {
            return a;
        }
        if (j42.c(str, "\\")) {
            return b;
        }
        s83.t(hf1.w("not a directory separator: ", str));
        return null;
    }
}
