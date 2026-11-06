package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class nq4 {
    public static final ne1 a;
    public static final ne1 b;
    public static final ne1 c;
    public static final fz5 d;
    public static final fz5 e;
    public static final fz5 f;
    public static final fz5 g;
    public static final fz5 h;
    public static final fz5 i;

    static {
        jx0 jx0Var = jx0.J;
        a = new ne1(jx0Var, 1.0f, "fillMaxWidth");
        jx0 jx0Var2 = jx0.I;
        b = new ne1(jx0Var2, 1.0f, "fillMaxHeight");
        jx0 jx0Var3 = jx0.K;
        c = new ne1(jx0Var3, 1.0f, "fillMaxSize");
        tv tvVar = q8.W;
        byte b2 = 13;
        d = new fz5(jx0Var, new y1(tvVar, b2), tvVar, "wrapContentWidth");
        tv tvVar2 = q8.V;
        e = new fz5(jx0Var, new y1(tvVar2, b2), tvVar2, "wrapContentWidth");
        uv uvVar = q8.T;
        byte b3 = 14;
        f = new fz5(jx0Var2, new y1(uvVar, b3), uvVar, "wrapContentHeight");
        uv uvVar2 = q8.S;
        g = new fz5(jx0Var2, new y1(uvVar2, b3), uvVar2, "wrapContentHeight");
        vv vvVar = q8.N;
        byte b4 = 15;
        h = new fz5(jx0Var3, new y1(vvVar, b4), vvVar, "wrapContentSize");
        vv vvVar2 = q8.J;
        i = new fz5(jx0Var3, new y1(vvVar2, b4), vvVar2, "wrapContentSize");
    }

    public static final l13 a(l13 l13Var) {
        return l13Var.then(new xe5());
    }

    public static final l13 b(l13 l13Var, float f2) {
        return l13Var.then(f2 == 1.0f ? b : new ne1(jx0.I, f2, "fillMaxHeight"));
    }

    public static /* synthetic */ l13 c(l13 l13Var) {
        return b(l13Var, 1.0f);
    }

    public static l13 d(l13 l13Var) {
        return l13Var.then(c);
    }

    public static final l13 e(l13 l13Var, float f2) {
        return l13Var.then(f2 == 1.0f ? a : new ne1(jx0.J, f2, "fillMaxWidth"));
    }

    public static /* synthetic */ l13 f(l13 l13Var) {
        return e(l13Var, 1.0f);
    }

    public static final l13 g(l13 l13Var, float f2) {
        return l13Var.then(new mq4(0.0f, f2, 0.0f, f2, 5));
    }

    public static final l13 h(l13 l13Var, float f2, float f3) {
        return l13Var.then(new mq4(0.0f, f2, 0.0f, f3, 5));
    }

    public static l13 i(l13 l13Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return h(l13Var, f2, f3);
    }

    public static l13 j(l13 l13Var, float f2, float f3, float f4, float f5, int i2) {
        return l13Var.then(new mq4(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final l13 k(l13 l13Var, float f2) {
        return l13Var.then(new mq4(f2, f2, f2, f2, true));
    }

    public static final l13 l(l13 l13Var, float f2, float f3) {
        return l13Var.then(new mq4(f2, f3, f2, f3, true));
    }

    public static final l13 m(l13 l13Var, float f2, float f3, float f4, float f5) {
        return l13Var.then(new mq4(f2, f3, f4, f5, true));
    }

    public static final l13 n(l13 l13Var, float f2) {
        return l13Var.then(new mq4(f2, 0.0f, f2, 0.0f, 10));
    }

    public static final l13 o(l13 l13Var, float f2, float f3) {
        return l13Var.then(new mq4(f2, 0.0f, f3, 0.0f, 10));
    }

    public static l13 p(l13 l13Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return o(l13Var, f2, f3);
    }

    public static l13 q(l13 l13Var) {
        fz5 fz5Var;
        uv uvVar = q8.T;
        if (j42.c(uvVar, uvVar)) {
            fz5Var = f;
        } else if (j42.c(uvVar, q8.S)) {
            fz5Var = g;
        } else {
            fz5Var = new fz5(jx0.I, new y1(uvVar, (byte) 14), uvVar, "wrapContentHeight");
        }
        return l13Var.then(fz5Var);
    }

    public static l13 r(l13 l13Var) {
        fz5 fz5Var;
        vv vvVar = q8.N;
        if (vvVar.equals(vvVar)) {
            fz5Var = h;
        } else if (vvVar.equals(q8.J)) {
            fz5Var = i;
        } else {
            fz5Var = new fz5(jx0.K, new y1(vvVar, (byte) 15), vvVar, "wrapContentSize");
        }
        return l13Var.then(fz5Var);
    }

    public static l13 s(l13 l13Var) {
        fz5 fz5Var;
        tv tvVar = q8.W;
        if (j42.c(tvVar, tvVar)) {
            fz5Var = d;
        } else if (j42.c(tvVar, q8.V)) {
            fz5Var = e;
        } else {
            fz5Var = new fz5(jx0.J, new y1(tvVar, (byte) 13), tvVar, "wrapContentWidth");
        }
        return l13Var.then(fz5Var);
    }
}
