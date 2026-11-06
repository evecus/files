package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ic2 extends ap1 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final ic2 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile mk3 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private n32 children_ = ux3.L;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        ic2 ic2Var = new ic2();
        DEFAULT_INSTANCE = ic2Var;
        ap1.j(ic2.class, ic2Var);
    }

    public static ic2 n() {
        return DEFAULT_INSTANCE;
    }

    public static hc2 o() {
        return (hc2) DEFAULT_INSTANCE.b();
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
                return new i04(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", ic2.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new ic2();
            case 4:
                return new hc2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (ic2.class) {
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

    public final void m(ArrayList arrayList) {
        n32 n32Var = this.children_;
        if (!((e4) n32Var).I) {
            int size = n32Var.size();
            n32Var = n32Var.a(size == 0 ? 10 : size * 2);
            this.children_ = n32Var;
        }
        wo1.a(arrayList, n32Var);
    }

    public final void p(boolean z) {
        this.hasAction_ = z;
    }

    public final void q(boolean z) {
        this.hasImageAlpha_ = z;
    }

    public final void r(boolean z) {
        this.hasImageColorFilter_ = z;
    }

    public final void s(boolean z) {
        this.hasImageDescription_ = z;
    }

    public final void t(bc2 bc2Var) {
        this.height_ = bc2Var.a();
    }

    public final void u(cc2 cc2Var) {
        if (cc2Var != cc2.UNRECOGNIZED) {
            this.horizontalAlignment_ = cc2Var.I;
        } else {
            s83.t("Can't get the number of an unknown enum value.");
        }
    }

    public final void v() {
        this.identity_ = 1;
    }

    public final void w(ac2 ac2Var) {
        if (ac2Var != ac2.UNRECOGNIZED) {
            this.imageScale_ = ac2Var.I;
        } else {
            s83.t("Can't get the number of an unknown enum value.");
        }
    }

    public final void x(jc2 jc2Var) {
        if (jc2Var != jc2.UNRECOGNIZED) {
            this.type_ = jc2Var.I;
        } else {
            s83.t("Can't get the number of an unknown enum value.");
        }
    }

    public final void y(kc2 kc2Var) {
        if (kc2Var != kc2.UNRECOGNIZED) {
            this.verticalAlignment_ = kc2Var.I;
        } else {
            s83.t("Can't get the number of an unknown enum value.");
        }
    }

    public final void z(bc2 bc2Var) {
        this.width_ = bc2Var.a();
    }
}
