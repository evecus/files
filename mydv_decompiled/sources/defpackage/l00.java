package defpackage;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l00 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;

    public /* synthetic */ l00(tm1 tm1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        Intent intent;
        ArrayList<String> stringArrayListExtra;
        String str;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                zh0 zh0Var = (zh0) obj;
                tm1Var.invoke(zh0Var);
                ((ya2) zh0Var).a();
                return wd5Var;
            case 1:
                g10 g10Var = (g10) obj;
                ki1 ki1Var = (ki1) tm1Var.invoke(new oh1(g10Var.a));
                if (ki1Var == ki1.c) {
                    g10Var.b = true;
                } else if (ki1Var != ki1.b) {
                    ki1.a(ki1Var);
                }
                return wd5Var;
            case 2:
                la5 la5Var = (la5) obj;
                if (la5Var instanceof kp1) {
                    return Boolean.valueOf(((Boolean) tm1Var.invoke(((kp1) la5Var).I)).booleanValue());
                }
                zy.i("Node is not a GestureNode instance");
                return null;
            case 3:
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                tm1Var.invoke(Boolean.valueOf(oi1Var.a()));
                return wd5Var;
            case 4:
                oi1 oi1Var2 = (oi1) obj;
                oi1Var2.getClass();
                tm1Var.invoke(Boolean.valueOf(oi1Var2.b()));
                return wd5Var;
            case 5:
                m7 m7Var = (m7) obj;
                m7Var.getClass();
                if (m7Var.I == -1 && (intent = m7Var.J) != null && (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null && (str = (String) o70.U0(stringArrayListExtra)) != null) {
                    tm1Var.invoke(str);
                }
                return wd5Var;
            case 6:
                vo0 vo0Var = (vo0) obj;
                vo0Var.getClass();
                if (tm1Var != null) {
                    tm1Var.invoke(vo0Var);
                }
                return wd5Var;
            case 7:
                so3 so3Var = (so3) obj;
                so3Var.getClass();
                if (tm1Var != null) {
                    tm1Var.invoke(so3Var);
                }
                return wd5Var;
            case 8:
                Float f = (Float) obj;
                f.floatValue();
                if (tm1Var != null) {
                    tm1Var.invoke(f);
                }
                return wd5Var;
            case 9:
                Integer num = (Integer) obj;
                num.intValue();
                if (tm1Var != null) {
                    tm1Var.invoke(num);
                }
                return wd5Var;
            case 10:
                Float f2 = (Float) obj;
                f2.floatValue();
                if (tm1Var != null) {
                    tm1Var.invoke(f2);
                }
                return wd5Var;
            case 11:
                Float f3 = (Float) obj;
                f3.floatValue();
                if (tm1Var != null) {
                    tm1Var.invoke(f3);
                }
                return wd5Var;
            case 12:
                so0 so0Var = (so0) obj;
                so0Var.getClass();
                if (tm1Var != null) {
                    tm1Var.invoke(so0Var);
                }
                return wd5Var;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(tm1Var != null ? ((Boolean) tm1Var.invoke(str2)).booleanValue() : false);
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                if (tm1Var != null) {
                    tm1Var.invoke(str3);
                }
                return wd5Var;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (tm1Var != null) {
                    tm1Var.invoke(bool);
                }
                return wd5Var;
            case 16:
                tm1Var.invoke(Float.valueOf(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f));
                return wd5Var;
            case 17:
                tm1Var.invoke(Integer.valueOf(ut0.r((int) ((Float) obj).floatValue(), 1, 100)));
                return wd5Var;
            case 18:
                tm1Var.invoke(Float.valueOf(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f));
                return wd5Var;
            case 19:
                tm1Var.invoke(Float.valueOf(ut0.r((int) ((Float) obj).floatValue(), 1, 100) / 100.0f));
                return wd5Var;
            default:
                ((ay0) obj).getClass();
                return new x7(tm1Var, (byte) 7);
        }
    }
}
