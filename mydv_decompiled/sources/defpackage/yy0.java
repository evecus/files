package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class yy0 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ yy0(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        gv1 gv1Var;
        switch (this.I) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return URLEncoder.encode((String) entry.getKey(), "UTF-8") + "=" + URLEncoder.encode((String) entry.getValue(), "UTF-8");
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return URLEncoder.encode((String) entry2.getKey(), "UTF-8") + "=" + URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            case 2:
                String str = (String) obj;
                str.getClass();
                return "\"" + str + "\"";
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                entry3.getClass();
                return entry3.getKey() + "=" + entry3.getValue();
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                entry4.getClass();
                return entry4.getKey() + "=" + entry4.getValue();
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                entry5.getClass();
                return entry5.getKey() + "=" + URLEncoder.encode((String) entry5.getValue(), "UTF-8");
            case 6:
                Map.Entry entry6 = (Map.Entry) obj;
                return entry6.getKey() + "=" + entry6.getValue();
            case 7:
                String group = ((zv2) obj).a.group();
                group.getClass();
                return group;
            case 8:
                Map.Entry entry7 = (Map.Entry) obj;
                return entry7.getKey() + "=" + entry7.getValue();
            case 9:
                ((k51) obj).getClass();
                return Double.valueOf(50.0d);
            case 10:
                return wd5.a;
            case 11:
                return obj;
            case 12:
                return wd5.a;
            case 13:
                return wd5.a;
            case 14:
                synchronized (ws4.c) {
                    List list = ws4.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((tm1) list.get(i)).invoke(obj);
                    }
                }
                return wd5.a;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 16:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 18:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 19:
                return wd5.a;
            case 20:
                return wd5.a;
            case 21:
                dn3 dn3Var = (dn3) obj;
                if (dn3Var.l()) {
                    hs2 hs2Var = dn3Var.J;
                    if (!hs2Var.W) {
                        tm1 e = dn3Var.I.e();
                        if (dn3Var.I.d() != null) {
                            hs2Var.y0();
                        } else if (e == null) {
                            hs2Var.P = null;
                            hs2Var.Q = null;
                            hs2Var.O = null;
                            hs2Var.y0();
                        } else {
                            hs2Var.P = null;
                            hs2Var.Q = null;
                            hs2Var.l0(dn3Var, 9223372034707292159L, 0L);
                            hs2Var.O = e;
                        }
                    }
                }
                return wd5.a;
            case 22:
                dn3 dn3Var2 = (dn3) obj;
                if (dn3Var2.l() && (gv1Var = dn3Var2.K) != null) {
                    hs2 hs2Var2 = dn3Var2.J;
                    n43 n43Var = hs2Var2.Z;
                    o43 o43Var = n43Var != null ? (o43) n43Var.g(gv1Var) : null;
                    if (o43Var != null) {
                        c8 c8Var = hs2Var2.Y;
                        if (c8Var != null) {
                            c8Var.K(gv1Var);
                        }
                        hs2Var2.w0(o43Var);
                        o43Var.e();
                    }
                }
                return wd5.a;
            case 23:
                return new lt(qb.C((vl0) obj));
            case 24:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 25:
                ((vl0) obj).getClass();
                return new b73();
            case 26:
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                return i73Var.K;
            case 27:
                return ma1.e(qb.k0(700, 6, null), 2);
            case 28:
                i73 i73Var2 = ((p63) ((uh) obj).d()).J;
                i73Var2.getClass();
                int i2 = i73.M;
                for (i73 i73Var3 : mu0.y((id0) i73Var2)) {
                }
                return null;
            default:
                return ma1.f(qb.k0(700, 6, null), 2);
        }
    }
}
