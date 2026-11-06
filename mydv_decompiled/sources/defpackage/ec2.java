package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ec2 extends ap1 {
    private static final ec2 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile mk3 PARSER;
    private n32 layout_ = ux3.L;
    private int nextIndex_;

    static {
        ec2 ec2Var = new ec2();
        DEFAULT_INSTANCE = ec2Var;
        ap1.j(ec2.class, ec2Var);
    }

    public static ec2 o() {
        return DEFAULT_INSTANCE;
    }

    public static ec2 r(FileInputStream fileInputStream) {
        ec2 ec2Var = DEFAULT_INSTANCE;
        d70 d70Var = new d70(fileInputStream, (byte) 0);
        lc1 a = lc1.a();
        ap1 i = ec2Var.i();
        try {
            sx3 sx3Var = sx3.c;
            sx3Var.getClass();
            qa4 a2 = sx3Var.a(i.getClass());
            h60 h60Var = (h60) d70Var.k;
            if (h60Var == null) {
                h60Var = new h60(d70Var);
            }
            a2.j(i, h60Var, a);
            a2.a(i);
            if (ap1.f(i, true)) {
                return (ec2) i;
            }
            throw new x42(new ud5().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof x42) {
                throw ((x42) e.getCause());
            }
            throw new x42(e.getMessage(), e);
        } catch (ud5 e2) {
            throw new x42(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof x42) {
                throw ((x42) e3.getCause());
            }
            throw e3;
        } catch (x42 e4) {
            if (e4.I) {
                throw new x42(e4.getMessage(), e4);
            }
            throw e4;
        }
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
                return new i04(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", gc2.class, "nextIndex_"});
            case 3:
                return new ec2();
            case 4:
                return new dc2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (ec2.class) {
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

    public final void m(gc2 gc2Var) {
        n32 n32Var = this.layout_;
        if (!((e4) n32Var).I) {
            int size = n32Var.size();
            n32Var = n32Var.a(size == 0 ? 10 : size * 2);
            this.layout_ = n32Var;
        }
        n32Var.add(gc2Var);
    }

    public final void n() {
        this.layout_ = ux3.L;
    }

    public final n32 p() {
        return this.layout_;
    }

    public final int q() {
        return this.nextIndex_;
    }

    public final void s(int i) {
        this.nextIndex_ = i;
    }
}
