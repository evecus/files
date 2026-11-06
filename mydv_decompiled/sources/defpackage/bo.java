package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bo implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ bo(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean isEmpty;
        byte b = this.I;
        o91 o91Var = o91.I;
        byte b2 = 1;
        byte b3 = 0;
        fj0 fj0Var = null;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                gx3 gx3Var = hu2Var.p;
                gx3Var.getClass();
                fw4 fw4Var = gx3Var.Z0;
                fw4Var.i(null, o70.g1((List) fw4Var.getValue(), new tw3(p70.j0(aweme), 0, (String) null, (MixPlaylistPagination) null, 28)));
                hu2Var.C(aweme);
                break;
            case 1:
                hu2Var.r(((Integer) obj).intValue(), true);
                break;
            case 2:
                hu2Var.r(((Integer) obj).intValue(), false);
                break;
            case 3:
                Author author = (Author) obj;
                author.getClass();
                hu2Var.I(author);
                break;
            case 4:
                ((ay0) obj).getClass();
                break;
            case 5:
                List list = (List) obj;
                list.getClass();
                gx3 gx3Var2 = hu2Var.p;
                gx3Var2.getClass();
                fw4 fw4Var2 = gx3Var2.Z0;
                List list2 = (List) fw4Var2.getValue();
                if (!list2.isEmpty()) {
                    fw4Var2.i(null, o70.g1(o70.R0(list2), tw3.a((tw3) o70.a1(list2), list, 0, null, 30)));
                    break;
                }
                break;
            case 6:
                Aweme aweme2 = (Aweme) obj;
                aweme2.getClass();
                hu2Var.A(aweme2, p70.j0(aweme2), 0);
                break;
            case 7:
                ((ay0) obj).getClass();
                hu2Var.u = true;
                break;
            case 8:
                Author author2 = (Author) obj;
                author2.getClass();
                hu2Var.I(author2);
                break;
            case 9:
                MixInfo mixInfo = (MixInfo) obj;
                mixInfo.getClass();
                hu2Var.x(mixInfo);
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                hu2Var.o.B(str);
                break;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                hu2Var.o.x(str2);
                hu2Var.w(str2);
                break;
            case 12:
                re4 re4Var = (re4) obj;
                re4Var.getClass();
                ye4 ye4Var = hu2Var.o;
                ye4Var.getClass();
                fw4 fw4Var3 = ye4Var.n;
                if (fw4Var3.getValue() != re4Var) {
                    fw4Var3.i(null, re4Var);
                    ye4Var.M.h(null);
                    if (jx4.g0((String) ((fw4) ye4Var.F.I).getValue()).toString().length() != 0) {
                        int ordinal = re4Var.ordinal();
                        byte b4 = 2;
                        if (ordinal == 0) {
                            isEmpty = ((List) ye4Var.l.getValue()).isEmpty();
                        } else if (ordinal == 1) {
                            isEmpty = ((List) ye4Var.p.getValue()).isEmpty();
                        } else if (ordinal != 2) {
                            s83.v();
                            break;
                        } else {
                            isEmpty = ((List) ye4Var.r.getValue()).isEmpty();
                        }
                        if (isEmpty) {
                            rv4 rv4Var = ye4Var.Y;
                            if (rv4Var != null) {
                                rv4Var.e(null);
                            }
                            p70.g0(o7.B(ye4Var), null, null, new ft2(ye4Var, fj0Var, b4), 3);
                        }
                    }
                }
                break;
            case 13:
                Author author3 = (Author) obj;
                author3.getClass();
                hu2Var.I(author3);
                break;
            case 14:
                LiveRoom liveRoom = (LiveRoom) obj;
                liveRoom.getClass();
                hu2Var.n.D(liveRoom, 0);
                hu2Var.v(ab4.M);
                break;
            case 15:
                String str3 = (String) obj;
                str3.getClass();
                hu2Var.o.x(str3);
                hu2Var.w(str3);
                break;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                ye4 ye4Var2 = hu2Var.o;
                ye4Var2.getClass();
                tc4 tc4Var = ye4Var2.f;
                fw4 fw4Var4 = tc4Var.b;
                String obj2 = jx4.g0(str4).toString();
                if (obj2.length() != 0) {
                    Iterable iterable = (Iterable) fw4Var4.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (!j42.c((String) obj3, obj2)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (!arrayList.equals(fw4Var4.getValue())) {
                        fw4Var4.i(null, arrayList);
                        tc4Var.a.edit().putString("history", new JSONArray((Collection) arrayList).toString()).apply();
                        break;
                    }
                }
                break;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                hu2Var.o.x(str5);
                hu2Var.w(str5);
                break;
            case 18:
                String str6 = (String) obj;
                str6.getClass();
                hu2Var.o.x(str6);
                hu2Var.w(str6);
                break;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                ye4 ye4Var3 = hu2Var.o;
                ye4Var3.B(str7);
                fw4 fw4Var5 = ye4Var3.I;
                fw4Var5.getClass();
                fw4Var5.i(null, o91Var);
                ye4Var3.s();
                hu2Var.w(str7);
                break;
            case 20:
                String str8 = (String) obj;
                str8.getClass();
                hu2Var.o.B(str8);
                break;
            case 21:
                String str9 = (String) obj;
                str9.getClass();
                hu2Var.o.B(str9);
                break;
            case 22:
                String str10 = (String) obj;
                str10.getClass();
                hu2Var.o.B(str10);
                break;
            case 23:
                String str11 = (String) obj;
                str11.getClass();
                hu2Var.o.B(str11);
                break;
            case 24:
                String str12 = (String) obj;
                str12.getClass();
                ye4 ye4Var4 = hu2Var.o;
                ye4Var4.B(str12);
                fw4 fw4Var6 = ye4Var4.I;
                fw4Var6.getClass();
                fw4Var6.i(null, o91Var);
                ye4Var4.s();
                hu2Var.w(str12);
                break;
            case 25:
                String str13 = (String) obj;
                str13.getClass();
                hu2Var.o.B(str13);
                break;
            case 26:
                String str14 = (String) obj;
                str14.getClass();
                hu2Var.o.x(str14);
                hu2Var.w(str14);
                break;
            case 27:
                hu2Var.h.A(((Boolean) obj).booleanValue());
                break;
            case 28:
                rr0 rr0Var = (rr0) obj;
                rr0Var.getClass();
                wm4 wm4Var = hu2Var.h;
                wm4Var.getClass();
                fw4 fw4Var7 = wm4Var.p0;
                fw4Var7.getClass();
                fw4Var7.i(null, rr0Var);
                fl4 fl4Var = wm4Var.b;
                fl4Var.a.edit().putInt("default_home_screen", rr0Var.J).apply();
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                wm4 wm4Var2 = hu2Var.h;
                fw4 fw4Var8 = wm4Var2.h0;
                fw4Var8.getClass();
                fw4Var8.i(null, bool);
                fl4 fl4Var2 = wm4Var2.b;
                i82.V(fl4Var2.a, "pip_enabled", booleanValue);
                fw4 fw4Var9 = fl4Var2.m0;
                fw4Var9.getClass();
                fw4Var9.i(null, bool);
                break;
        }
        return wd5Var;
    }
}
