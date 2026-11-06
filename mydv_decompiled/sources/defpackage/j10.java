package defpackage;

import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetMixItem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j10 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ j10(o53 o53Var, n53 n53Var) {
        this.I = (byte) 7;
        this.J = o53Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 SearchExpanded$lambda$0$1;
        wd5 MixCompact$lambda$0$2;
        byte b = this.I;
        byte b2 = 9;
        i13 i13Var = i13.a;
        Object obj4 = de0.a;
        boolean z = true;
        wd5 wd5Var = wd5.a;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                ((tf2) obj5).invoke((Throwable) obj);
                return wd5Var;
            case 1:
                mk0 mk0Var = (mk0) obj5;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = mk0Var.O.c(intValue);
                }
                if (!booleanValue) {
                    intValue2 = mk0Var.O.c(intValue2);
                }
                if (mk0Var.N) {
                    long j = mk0Var.L.b;
                    int i = d65.c;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                        int min = Math.min(intValue, intValue2);
                        ks1 ks1Var = ks1.I;
                        if (min >= 0 && Math.max(intValue, intValue2) <= mk0Var.L.a.J.length()) {
                            if (booleanValue || intValue == intValue2) {
                                u45 u45Var = mk0Var.P;
                                u45Var.u(false);
                                u45Var.r(ks1Var);
                            } else {
                                mk0Var.P.e(true);
                            }
                            mk0Var.M.v.invoke(new d55(mk0Var.L.a, ui4.c(intValue, intValue2), (d65) null));
                            return Boolean.valueOf(z);
                        }
                        u45 u45Var2 = mk0Var.P;
                        u45Var2.u(false);
                        u45Var2.r(ks1Var);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                SearchExpanded$lambda$0$1 = DesktopWidgetsKt.SearchExpanded$lambda$0$1((List) obj5, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return SearchExpanded$lambda$0$1;
            case 3:
                MixCompact$lambda$0$2 = DesktopWidgetsKt.MixCompact$lambda$0$2((WidgetMixItem) obj5, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return MixCompact$lambda$0$2;
            case 4:
                ((ur2) obj5).J.a(((rp3) obj2).c, n84.S);
                return wd5Var;
            case 5:
                cw4 cw4Var = (cw4) obj5;
                fe0 fe0Var = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    j16.c((LiveRoom) cw4Var.getValue(), go1Var, LiveRoom.$stable);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 6:
                ki1 ki1Var = (ki1) obj5;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((mg2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (go1Var2.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    p70.q(li4.g(), "暂无内容", mw2.B(j42.x(i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 40.0f, 1), ki1Var), false, null, 3), null, null, false, null, go1Var2, 48, 120);
                } else {
                    go1Var2.W();
                }
                return wd5Var;
            case 7:
                o53 o53Var = (o53) obj5;
                o53.Q.set(o53Var, null);
                o53Var.g(null);
                return wd5Var;
            case 8:
                t43 t43Var = (t43) obj5;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (go1Var3.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Object Q = go1Var3.Q();
                    if (Q == obj4) {
                        Q = new sf(t43Var, (byte) 17);
                        go1Var3.o0(Q);
                    }
                    j16.a((rm1) Q, go1Var3, 6);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
            case 9:
                tm1 tm1Var = (tm1) obj5;
                fe0 fe0Var4 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ih1) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (go1Var4.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    for (String str : qe4.c) {
                        boolean g = go1Var4.g(tm1Var) | go1Var4.g(str);
                        Object Q2 = go1Var4.Q();
                        if (g || Q2 == obj4) {
                            Q2 = new le4(tm1Var, str, (byte) 2);
                            go1Var4.o0(Q2);
                        }
                        qe4.e(str, (rm1) Q2, null, null, null, null, go1Var4, 0, 60);
                    }
                } else {
                    go1Var4.W();
                }
                return wd5Var;
            case 10:
                qr4 qr4Var = (qr4) obj5;
                ww2 ww2Var = (ww2) obj;
                bn3 u = ((pw2) obj2).u(((dh0) obj3).a);
                int X = r11.c(Float.NaN, Float.NaN) ? qr4Var.c() ? u.I / 2 : u.J / 2 : ww2Var.X(Float.NaN);
                int i2 = u.I;
                int i3 = u.J;
                Map singletonMap = Collections.singletonMap(or4.a, Integer.valueOf(X));
                singletonMap.getClass();
                return ww2Var.A(i2, i3, singletonMap, new b2(u, (byte) 9));
            case 11:
                u45 u45Var3 = (u45) obj5;
                l13 l13Var = (l13) obj;
                ((Integer) obj3).getClass();
                go1 go1Var5 = (go1) ((fe0) obj2);
                go1Var5.d0(1980580247);
                iu0 iu0Var = (iu0) go1Var5.k(hf0.h);
                Object Q3 = go1Var5.Q();
                Object obj6 = Q3;
                if (Q3 == obj4) {
                    Object w = ad4.w(new z22(0L));
                    go1Var5.o0(w);
                    obj6 = w;
                }
                t43 t43Var2 = (t43) obj6;
                boolean i4 = go1Var5.i(u45Var3);
                Object Q4 = go1Var5.Q();
                Object obj7 = Q4;
                if (i4 || Q4 == obj4) {
                    Object x45Var = new x45(u45Var3, t43Var2, r11 ? (byte) 1 : (byte) 0);
                    go1Var5.o0(x45Var);
                    obj7 = x45Var;
                }
                rm1 rm1Var = (rm1) obj7;
                boolean g2 = go1Var5.g(iu0Var);
                Object Q5 = go1Var5.Q();
                Object obj8 = Q5;
                if (g2 || Q5 == obj4) {
                    Object y45Var = new y45(iu0Var, t43Var2, r11 ? (byte) 1 : (byte) 0);
                    go1Var5.o0(y45Var);
                    obj8 = y45Var;
                }
                ej ejVar = gi4.a;
                l13 k0 = i42.k0(l13Var, new a91(rm1Var, (tm1) obj8, b2));
                go1Var5.q(false);
                return k0;
            default:
                MixInfo mixInfo = (MixInfo) obj5;
                fe0 fe0Var5 = (fe0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var5;
                if (go1Var6.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    p70.q(li4.g(), mixInfo == null ? "暂无相关视频" : "暂无合集视频", nq4.g(nq4.e(i13Var, 1.0f), 200.0f), null, null, true, null, go1Var6, 196992, 88);
                } else {
                    go1Var6.W();
                }
                return wd5Var;
        }
    }

    public /* synthetic */ j10(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }
}
