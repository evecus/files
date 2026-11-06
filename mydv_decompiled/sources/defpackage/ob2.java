package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ob2 extends ap1 {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final ob2 DEFAULT_INSTANCE;
    private static volatile mk3 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = "";
    private m32 appWidgetIds_ = h22.L;

    static {
        ob2 ob2Var = new ob2();
        DEFAULT_INSTANCE = ob2Var;
        ap1.j(ob2.class, ob2Var);
    }

    public static ob2 o() {
        return DEFAULT_INSTANCE;
    }

    public static nb2 q() {
        return (nb2) DEFAULT_INSTANCE.b();
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
                return new i04(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new ob2();
            case 4:
                return new nb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (ob2.class) {
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

    public final void m(List list) {
        n32 n32Var = this.appWidgetIds_;
        if (!((e4) n32Var).I) {
            h22 h22Var = (h22) n32Var;
            int i = h22Var.K;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                s83.d();
                return;
            } else {
                h22 h22Var2 = new h22(Arrays.copyOf(h22Var.J, i2), h22Var.K, true);
                this.appWidgetIds_ = h22Var2;
                n32Var = h22Var2;
            }
        }
        wo1.a(list, n32Var);
    }

    public final m32 n() {
        return this.appWidgetIds_;
    }

    public final String p() {
        return this.receiver_;
    }

    public final void r(String str) {
        str.getClass();
        this.receiver_ = str;
    }
}
