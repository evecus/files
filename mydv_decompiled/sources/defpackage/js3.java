package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class js3 extends bp1 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final js3 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile nk3 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        js3 js3Var = new js3();
        DEFAULT_INSTANCE = js3Var;
        bp1.h(js3.class, js3Var);
    }

    public static js3 j() {
        return DEFAULT_INSTANCE;
    }

    public static is3 r() {
        return (is3) ((xo1) DEFAULT_INSTANCE.d(5));
    }

    @Override // defpackage.bp1
    public final Object d(int i) {
        nk3 nk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new j04(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", hs3.class});
            case 3:
                return new js3();
            case 4:
                return new is3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nk3 nk3Var2 = PARSER;
                if (nk3Var2 != null) {
                    return nk3Var2;
                }
                synchronized (js3.class) {
                    try {
                        nk3Var = PARSER;
                        if (nk3Var == null) {
                            nk3Var = new zo1();
                            PARSER = nk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nk3Var;
            default:
                e1.a();
                return null;
        }
    }

    public final boolean i() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double k() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float l() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int m() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long n() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String o() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final hs3 p() {
        return this.valueCase_ == 6 ? (hs3) this.value_ : hs3.j();
    }

    public final int q() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public final void s(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void t(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void u(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void v(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void w(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void x(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void y(gs3 gs3Var) {
        this.value_ = gs3Var.a();
        this.valueCase_ = 6;
    }
}
