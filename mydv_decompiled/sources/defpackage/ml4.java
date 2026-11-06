package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ml4 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ ml4(Object obj, Object obj2, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, byte b) {
        this.I = b;
        this.N = obj;
        this.O = obj2;
        this.J = t43Var;
        this.K = t43Var2;
        this.L = t43Var3;
        this.M = t43Var4;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.M;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.O;
        Object obj6 = this.N;
        switch (b) {
            case 0:
                ((hu2) obj6).E((String) ((t43) obj4).getValue(), (String) ((t43) obj3).getValue(), (String) ((t43) obj2).getValue(), (String) ((t43) obj).getValue());
                qm4.m((t43) obj5, true);
                return wd5Var;
            case 1:
                String str = (String) obj6;
                tm1 tm1Var = (tm1) obj5;
                t43 t43Var = (t43) obj4;
                t43 t43Var2 = (t43) obj3;
                t43 t43Var3 = (t43) obj2;
                t43 t43Var4 = (t43) obj;
                if (j42.c(str, "⌫")) {
                    t43Var.setValue(Boolean.FALSE);
                    String str2 = (String) t43Var2.getValue();
                    if (j42.c(str2, "confirm")) {
                        if (((String) t43Var3.getValue()).length() > 0) {
                            t43Var3.setValue(jx4.F((String) t43Var3.getValue()));
                        }
                    } else if (j42.c(str2, "input") && ((String) t43Var4.getValue()).length() > 0) {
                        t43Var4.setValue(jx4.F((String) t43Var4.getValue()));
                    }
                } else if (j42.c(str, "←")) {
                    t43Var.setValue(Boolean.FALSE);
                    t43Var3.setValue("");
                    t43Var2.setValue("input");
                } else {
                    String str3 = (String) t43Var2.getValue();
                    if (j42.c(str3, "input")) {
                        if (((String) t43Var4.getValue()).length() < 4) {
                            t43Var4.setValue(((String) t43Var4.getValue()) + str);
                            if (((String) t43Var4.getValue()).length() == 4) {
                                t43Var2.setValue("confirm");
                            }
                        }
                    } else if (j42.c(str3, "confirm") && ((String) t43Var3.getValue()).length() < 4) {
                        t43Var3.setValue(((String) t43Var3.getValue()) + str);
                        if (((String) t43Var3.getValue()).length() == 4) {
                            if (j42.c((String) t43Var3.getValue(), (String) t43Var4.getValue())) {
                                tm1Var.invoke((String) t43Var4.getValue());
                            } else {
                                t43Var3.setValue("");
                                t43Var.setValue(Boolean.TRUE);
                            }
                        }
                    }
                }
                return wd5Var;
            case 2:
                rm1 rm1Var = (rm1) obj6;
                on5.I((Aweme) obj5, (t43) obj4, "first_frame");
                ((t43) obj3).setValue(null);
                Boolean bool = Boolean.TRUE;
                ((t43) obj2).setValue(bool);
                ((t43) obj).setValue(bool);
                if (rm1Var != null) {
                    rm1Var.invoke();
                }
                return wd5Var;
            case 3:
                tm1 tm1Var2 = (tm1) obj4;
                Aweme aweme = (Aweme) obj3;
                in1 in1Var = (in1) obj2;
                List list = (List) obj;
                MixPlaylistPagination mixPlaylistPagination = (MixPlaylistPagination) obj5;
                if (((MixInfo) obj6) == null) {
                    tm1Var2.invoke(aweme);
                } else {
                    in1Var.invoke(list, aweme, mixPlaylistPagination);
                }
                return wd5Var;
            default:
                String str4 = (String) obj6;
                t43 t43Var5 = (t43) obj4;
                t43 t43Var6 = (t43) obj3;
                t43 t43Var7 = (t43) obj2;
                t43 t43Var8 = (t43) obj;
                boolean z = (((Boolean) t43Var5.getValue()).booleanValue() || str4.length() <= 0 || str4.equals((String) obj5)) ? false : true;
                if (z) {
                    Boolean bool2 = Boolean.TRUE;
                    t43Var5.setValue(bool2);
                    t43Var6.setValue(bool2);
                    t43Var7.setValue(Boolean.FALSE);
                    t43Var8.setValue(null);
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ml4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.I = b;
        this.N = obj;
        this.J = obj2;
        this.K = obj3;
        this.L = obj4;
        this.M = obj5;
        this.O = obj6;
    }
}
