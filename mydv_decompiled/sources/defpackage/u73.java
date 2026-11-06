package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u73 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ u73(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        yt4 yt4Var = null;
        yt4Var = null;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((p63) obj).N;
            case 1:
                ((ca3) obj).c();
                return wd5Var;
            case 2:
                na3 na3Var = (na3) obj;
                wa2 wa2Var = na3Var.c0;
                try {
                    if (na3Var.l()) {
                        na3Var.l1(true);
                    }
                    return wd5Var;
                } catch (Throwable th) {
                    wa2Var.b0(th);
                    throw null;
                }
            case 3:
                mr1 mr1Var = ((na3) obj).B0;
                if (mr1Var != null) {
                    mr1Var.c();
                }
                return wd5Var;
            case 4:
                ld3 ld3Var = (ld3) obj;
                if (ld3Var.l()) {
                    ld3Var.I.U();
                }
                return wd5Var;
            case 5:
                xe0 xe0Var = (xe0) obj;
                int i = od.a;
                Context context = (Context) xe0Var.Q(rb.b);
                iu0 iu0Var = (iu0) xe0Var.Q(hf0.h);
                jh3 jh3Var = (jh3) xe0Var.Q(kh3.a);
                if (jh3Var == null) {
                    return null;
                }
                return new tc(context, iu0Var, jh3Var.a, jh3Var.b);
            case 6:
                wa2 wa2Var2 = (wa2) obj;
                if (wa2Var2.K()) {
                    wa2.W(wa2Var2, false, 7);
                }
                return wd5Var;
            case 7:
                wa2 wa2Var3 = (wa2) obj;
                if (wa2Var3.K()) {
                    wa2.Y(wa2Var3, false, 7);
                }
                return wd5Var;
            case 8:
                wa2 wa2Var4 = (wa2) obj;
                if (wa2Var4.K()) {
                    wa2Var4.I();
                }
                return wd5Var;
            case 9:
                wa2 wa2Var5 = (wa2) obj;
                if (wa2Var5.K()) {
                    wa2Var5.X(false);
                }
                return wd5Var;
            case 10:
                wa2 wa2Var6 = (wa2) obj;
                if (wa2Var6.K()) {
                    wa2Var6.X(false);
                }
                return wd5Var;
            case 11:
                wa2 wa2Var7 = (wa2) obj;
                if (wa2Var7.K()) {
                    wa2Var7.V(false);
                }
                return wd5Var;
            case 12:
                wa2 wa2Var8 = (wa2) obj;
                if (wa2Var8.K()) {
                    wa2Var8.V(false);
                }
                return wd5Var;
            case 13:
                obj.getClass();
                return Boolean.valueOf(!((rh3) obj).l());
            case 14:
                return wd5Var;
            case 15:
                return wd5Var;
            case 16:
                hx3 hx3Var = hx3.d;
                d82[] d82VarArr = aj4.a;
                bj4 bj4Var = zi4.c;
                d82 d82Var = aj4.a[1];
                bj4Var.getClass();
                ((cj4) obj).c(bj4Var, hx3Var);
                return wd5Var;
            case 17:
                String str = (String) obj;
                str.getClass();
                byte[] decode = Base64.decode(str, 0);
                decode.getClass();
                return new String(decode, z50.a);
            case 18:
                return new z54();
            case 19:
                return wd5Var;
            case 20:
                return new h94((Map) obj);
            case 21:
                return obj;
            case 22:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                tm1 tm1Var = (tm1) ea4.h.K;
                Boolean bool = Boolean.FALSE;
                yt4 yt4Var2 = (j42.c(obj2, bool) || obj2 == null) ? null : (yt4) tm1Var.invoke(obj2);
                Object obj3 = list.get(1);
                yt4 yt4Var3 = (j42.c(obj3, bool) || obj3 == null) ? null : (yt4) tm1Var.invoke(obj3);
                Object obj4 = list.get(2);
                yt4 yt4Var4 = (j42.c(obj4, bool) || obj4 == null) ? null : (yt4) tm1Var.invoke(obj4);
                Object obj5 = list.get(3);
                if (!j42.c(obj5, bool) && obj5 != null) {
                    yt4Var = (yt4) tm1Var.invoke(obj5);
                }
                return new z55(yt4Var2, yt4Var3, yt4Var4, yt4Var);
            case 23:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (j42.c(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((tm1) ea4.a.K).invoke(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new oj(list3, str2);
            case 24:
                obj.getClass();
                return new m35(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list4 = (List) obj;
                return new h55(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 26:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                q65[] q65VarArr = p65.b;
                tm1 tm1Var2 = ea4.v.J;
                Boolean bool2 = Boolean.FALSE;
                j42.c(obj8, bool2);
                p65 p65Var = obj8 != null ? (p65) tm1Var2.invoke(obj8) : null;
                p65Var.getClass();
                long j = p65Var.a;
                Object obj9 = list5.get(1);
                j42.c(obj9, bool2);
                p65 p65Var2 = obj9 != null ? (p65) tm1Var2.invoke(obj9) : null;
                p65Var2.getClass();
                return new i55(j, p65Var2.a);
            case 27:
                obj.getClass();
                return new qk1(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new wu(((Float) obj).floatValue());
            default:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new d65(ui4.c(intValue, num2.intValue()));
        }
    }
}
