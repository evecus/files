package defpackage;

import com.github.mytv.dv.model.Author;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fm4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ fm4(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean a;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                fl4 fl4Var = hu2Var.h.b;
                i82.V(fl4Var.a, "mix_playlist_panel_enabled", booleanValue);
                fw4 fw4Var = fl4Var.w;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                return wd5Var;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                wm4 wm4Var = hu2Var.h;
                fw4 fw4Var2 = wm4Var.f0;
                fw4Var2.getClass();
                fw4Var2.i(null, bool2);
                i82.V(wm4Var.b.a, "filter_mobile_video", booleanValue2);
                return wd5Var;
            case 2:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                wm4 wm4Var2 = hu2Var.h;
                fw4 fw4Var3 = wm4Var2.u0;
                fw4Var3.getClass();
                fw4Var3.i(null, bool3);
                i82.V(wm4Var2.b.a, "featured_auto_play", booleanValue3);
                return wd5Var;
            case 3:
                so3 so3Var = (so3) obj;
                so3Var.getClass();
                hu2Var.h.y(so3Var);
                return wd5Var;
            case 4:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                wm4 wm4Var3 = hu2Var.h;
                wm4Var3.getClass();
                fw4 fw4Var4 = wm4Var3.C;
                fw4Var4.getClass();
                fw4Var4.i(null, z70Var);
                fl4 fl4Var2 = wm4Var3.b;
                fl4Var2.getClass();
                fl4Var2.a.edit().putString("color_contrast", z70Var.J).apply();
                return wd5Var;
            case 5:
                v90 v90Var = (v90) obj;
                v90Var.getClass();
                wm4 wm4Var4 = hu2Var.h;
                wm4Var4.getClass();
                fw4 fw4Var5 = wm4Var4.G;
                fw4Var5.getClass();
                fw4Var5.i(null, v90Var);
                fl4 fl4Var3 = wm4Var4.b;
                fl4Var3.getClass();
                fl4Var3.a.edit().putString("color_transition", v90Var.J).apply();
                return wd5Var;
            case 6:
                qn5 qn5Var = (qn5) obj;
                qn5Var.getClass();
                wm4 wm4Var5 = hu2Var.h;
                wm4Var5.getClass();
                fl4 fl4Var4 = wm4Var5.b;
                byte b2 = qn5Var.J;
                fl4Var4.getClass();
                if (fl4.u0.contains(Integer.valueOf(b2))) {
                    fl4Var4.a.edit().putInt("video_load_timeout_seconds", b2).apply();
                    fw4 fw4Var6 = fl4Var4.E;
                    Integer valueOf = Integer.valueOf(b2);
                    fw4Var6.getClass();
                    fw4Var6.i(null, valueOf);
                }
                return wd5Var;
            case 7:
                hu2Var.h.t(((Float) obj).floatValue());
                return wd5Var;
            case 8:
                so0 so0Var = (so0) obj;
                so0Var.getClass();
                hu2Var.h.s(so0Var);
                return wd5Var;
            case 9:
                vo0 vo0Var = (vo0) obj;
                vo0Var.getClass();
                hu2Var.h.v(vo0Var);
                return wd5Var;
            case 10:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                fl4 fl4Var5 = hu2Var.h.b;
                i82.V(fl4Var5.a, "danmaku_block_enabled", booleanValue4);
                fw4 fw4Var7 = fl4Var5.a0;
                fw4Var7.getClass();
                fw4Var7.i(null, bool4);
                return wd5Var;
            case 11:
                String str = (String) obj;
                str.getClass();
                wm4 wm4Var6 = hu2Var.h;
                wm4Var6.getClass();
                a = wm4Var6.b.a(str);
                break;
            case 12:
                String str2 = (String) obj;
                str2.getClass();
                wm4 wm4Var7 = hu2Var.h;
                wm4Var7.getClass();
                wm4Var7.b.z(str2);
                return wd5Var;
            case 13:
                so3 so3Var2 = (so3) obj;
                so3Var2.getClass();
                hu2Var.h.y(so3Var2);
                return wd5Var;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                hu2Var.p.S(str3);
                return wd5Var;
            case 15:
                Author author = (Author) obj;
                author.getClass();
                hu2Var.I(author);
                return wd5Var;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                fw4 fw4Var8 = hu2Var.i.b;
                fw4Var8.getClass();
                fw4Var8.i(null, bool5);
                return wd5Var;
            case 17:
                ((ay0) obj).getClass();
                return new hp2(hu2Var, (byte) 2);
            case 18:
                hu2Var.h.z(((Float) obj).floatValue());
                return wd5Var;
            case 19:
                hu2Var.h.A(((Boolean) obj).booleanValue());
                return wd5Var;
            case 20:
                hu2Var.h.u(((Float) obj).floatValue());
                return wd5Var;
            case 21:
                ro0 ro0Var = (ro0) obj;
                ro0Var.getClass();
                hu2Var.h.q(ro0Var);
                return wd5Var;
            case 22:
                hu2Var.h.r(((Integer) obj).intValue());
                return wd5Var;
            case 23:
                hu2Var.h.w(((Float) obj).floatValue());
                return wd5Var;
            case 24:
                so0 so0Var2 = (so0) obj;
                so0Var2.getClass();
                hu2Var.h.s(so0Var2);
                return wd5Var;
            case 25:
                vo0 vo0Var2 = (vo0) obj;
                vo0Var2.getClass();
                hu2Var.h.v(vo0Var2);
                return wd5Var;
            case 26:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue5 = bool6.booleanValue();
                fl4 fl4Var6 = hu2Var.h.b;
                i82.V(fl4Var6.a, "danmaku_block_enabled", booleanValue5);
                fw4 fw4Var9 = fl4Var6.a0;
                fw4Var9.getClass();
                fw4Var9.i(null, bool6);
                return wd5Var;
            case 27:
                String str4 = (String) obj;
                str4.getClass();
                wm4 wm4Var8 = hu2Var.h;
                wm4Var8.getClass();
                a = wm4Var8.b.a(str4);
                break;
            case 28:
                String str5 = (String) obj;
                str5.getClass();
                wm4 wm4Var9 = hu2Var.h;
                wm4Var9.getClass();
                wm4Var9.b.z(str5);
                return wd5Var;
            default:
                Author author2 = (Author) obj;
                author2.getClass();
                hu2Var.I(author2);
                return wd5Var;
        }
        return Boolean.valueOf(a);
    }
}
