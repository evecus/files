package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zb2 extends ap1 {
    private static final zb2 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile mk3 PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        zb2 zb2Var = new zb2();
        DEFAULT_INSTANCE = zb2Var;
        ap1.j(zb2.class, zb2Var);
    }

    public static mb2 x() {
        return (mb2) DEFAULT_INSTANCE.b();
    }

    public static zb2 y(byte[] bArr) {
        zb2 zb2Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        lc1 a = lc1.a();
        if (length != 0) {
            ap1 i = zb2Var.i();
            try {
                sx3 sx3Var = sx3.c;
                sx3Var.getClass();
                qa4 a2 = sx3Var.a(i.getClass());
                op opVar = new op();
                a.getClass();
                a2.g(i, bArr, 0, length, opVar);
                a2.a(i);
                zb2Var = i;
            } catch (IndexOutOfBoundsException unused) {
                throw x42.f();
            } catch (ud5 e) {
                throw new x42(e.getMessage());
            } catch (x42 e2) {
                if (e2.I) {
                    throw new x42(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof x42) {
                    throw ((x42) e3.getCause());
                }
                throw new x42(e3.getMessage(), e3);
            }
        }
        if (zb2Var == null || ap1.f(zb2Var, true)) {
            return zb2Var;
        }
        throw new x42(new ud5().getMessage());
    }

    public final void A(qb2 qb2Var) {
        this.request_ = qb2Var;
        this.requestCase_ = 4;
    }

    public final void B(sb2 sb2Var) {
        this.request_ = sb2Var;
        this.requestCase_ = 6;
    }

    public final void C(ub2 ub2Var) {
        this.request_ = ub2Var;
        this.requestCase_ = 2;
    }

    public final void D(wb2 wb2Var) {
        this.request_ = wb2Var;
        this.requestCase_ = 5;
    }

    public final void E(yb2 yb2Var) {
        this.request_ = yb2Var;
        this.requestCase_ = 1;
    }

    @Override // defpackage.ap1
    public final Object c(int i) {
        mk3 mk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new i04(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", yb2.class, ub2.class, ob2.class, qb2.class, wb2.class, sb2.class});
            case 3:
                return new zb2();
            case 4:
                return new mb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (zb2.class) {
                    try {
                        mk3Var = PARSER;
                        if (mk3Var == null) {
                            mk3Var = new yo1();
                            PARSER = mk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return mk3Var;
            default:
                e1.a();
                return null;
        }
    }

    public final ob2 m() {
        return this.requestCase_ == 3 ? (ob2) this.request_ : ob2.o();
    }

    public final qb2 n() {
        return this.requestCase_ == 4 ? (qb2) this.request_ : qb2.o();
    }

    public final ub2 o() {
        return this.requestCase_ == 2 ? (ub2) this.request_ : ub2.o();
    }

    public final wb2 p() {
        return this.requestCase_ == 5 ? (wb2) this.request_ : wb2.p();
    }

    public final yb2 q() {
        return this.requestCase_ == 1 ? (yb2) this.request_ : yb2.o();
    }

    public final boolean r() {
        return this.requestCase_ == 3;
    }

    public final boolean s() {
        return this.requestCase_ == 4;
    }

    public final boolean t() {
        return this.requestCase_ == 6;
    }

    public final boolean u() {
        return this.requestCase_ == 2;
    }

    public final boolean v() {
        return this.requestCase_ == 5;
    }

    public final boolean w() {
        return this.requestCase_ == 1;
    }

    public final void z(ob2 ob2Var) {
        this.request_ = ob2Var;
        this.requestCase_ = 3;
    }
}
