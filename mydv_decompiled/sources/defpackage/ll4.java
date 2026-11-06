package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ ll4(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                wm4 wm4Var = hu2Var.h;
                fw4 fw4Var = wm4Var.s;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                fl4 fl4Var = wm4Var.b;
                i82.V(fl4Var.a, "live_danmaku_enabled", booleanValue);
                fw4 fw4Var2 = fl4Var.K;
                fw4Var2.getClass();
                fw4Var2.i(null, bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                wm4 wm4Var2 = hu2Var.h;
                fw4 fw4Var3 = wm4Var2.l0;
                fw4Var3.getClass();
                fw4Var3.i(null, bool2);
                i82.V(wm4Var2.b.a, "reverse_playlist_in_profile", booleanValue2);
                break;
            case 2:
                fr frVar = (fr) obj;
                frVar.getClass();
                wm4 wm4Var3 = hu2Var.h;
                wm4Var3.getClass();
                fl4 fl4Var2 = wm4Var3.b;
                fl4Var2.getClass();
                fl4Var2.a.edit().putString("audio_balance_level", frVar.J).apply();
                fw4 fw4Var4 = fl4Var2.o0;
                fw4Var4.getClass();
                fw4Var4.i(null, frVar);
                break;
            case 3:
                on onVar = (on) obj;
                onVar.getClass();
                wm4 wm4Var4 = hu2Var.h;
                wm4Var4.getClass();
                fl4 fl4Var3 = wm4Var4.b;
                float f = onVar.J;
                fl4Var3.getClass();
                float q = ut0.q(f, 1.0f, 1.6f);
                fl4Var3.a.edit().putFloat("app_font_scale", q).apply();
                fw4 fw4Var5 = fl4Var3.k;
                Float valueOf = Float.valueOf(q);
                fw4Var5.getClass();
                fw4Var5.i(null, valueOf);
                break;
            case 4:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                wm4 wm4Var5 = hu2Var.h;
                fw4 fw4Var6 = wm4Var5.n0;
                fw4Var6.getClass();
                fw4Var6.i(null, bool3);
                i82.V(wm4Var5.b.a, "disable_double_back_exit", booleanValue3);
                break;
            case 5:
                t65 t65Var = (t65) obj;
                t65Var.getClass();
                wm4 wm4Var6 = hu2Var.h;
                wm4Var6.getClass();
                fw4 fw4Var7 = wm4Var6.w;
                fw4Var7.getClass();
                fw4Var7.i(null, t65Var);
                wm4Var6.b.a.edit().putInt("theme_mode", t65Var.J).apply();
                break;
            case 6:
                s90 s90Var = (s90) obj;
                s90Var.getClass();
                wm4 wm4Var7 = hu2Var.h;
                wm4Var7.getClass();
                fw4 fw4Var8 = wm4Var7.A;
                fw4Var8.getClass();
                fw4Var8.i(null, s90Var);
                fl4 fl4Var4 = wm4Var7.b;
                fl4Var4.getClass();
                fl4Var4.a.edit().putString("color_style", s90Var.J).apply();
                break;
            case 7:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                fl4 fl4Var5 = hu2Var.h.b;
                i82.V(fl4Var5.a, "surface_buffer_align", booleanValue4);
                fw4 fw4Var9 = fl4Var5.s0;
                fw4Var9.getClass();
                fw4Var9.i(null, bool4);
                fw4 fw4Var10 = zz4.a;
                fw4Var10.getClass();
                fw4Var10.i(null, bool4);
                break;
            case 8:
                po3 po3Var = (po3) obj;
                po3Var.getClass();
                wm4 wm4Var8 = hu2Var.h;
                wm4Var8.getClass();
                fw4 fw4Var11 = wm4Var8.y0;
                fw4Var11.getClass();
                fw4Var11.i(null, po3Var);
                fl4 fl4Var6 = wm4Var8.b;
                String str = po3Var.J;
                fl4Var6.getClass();
                fl4Var6.a.edit().putString("playback_clock_display_mode", str).apply();
                break;
            case 9:
                dp3 dp3Var = (dp3) obj;
                dp3Var.getClass();
                wm4 wm4Var9 = hu2Var.h;
                wm4Var9.getClass();
                fl4 fl4Var7 = wm4Var9.b;
                fl4Var7.getClass();
                fl4Var7.a.edit().putString("player_surface_type", dp3Var.J).apply();
                fw4 fw4Var12 = fl4Var7.q0;
                fw4Var12.getClass();
                fw4Var12.i(null, dp3Var);
                break;
            case 10:
                an2 an2Var = (an2) obj;
                an2Var.getClass();
                wm4 wm4Var10 = hu2Var.h;
                wm4Var10.getClass();
                fw4 fw4Var13 = wm4Var10.u;
                fw4Var13.getClass();
                fw4Var13.i(null, an2Var);
                fl4 fl4Var8 = wm4Var10.b;
                fl4Var8.getClass();
                fl4Var8.a.edit().putString("live_danmaku_style", an2Var.J).apply();
                fw4 fw4Var14 = fl4Var8.M;
                fw4Var14.getClass();
                fw4Var14.i(null, an2Var);
                break;
            case 11:
                hu2Var.h.u(ut0.r((int) ((Float) obj).floatValue(), 1, 100) / 100.0f);
                break;
            case 12:
                hu2Var.h.r((int) ((Float) obj).floatValue());
                break;
            case 13:
                hu2Var.h.w(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f);
                break;
            case 14:
                hu2Var.h.t(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f);
                break;
            case 15:
                so0 so0Var = (so0) obj;
                so0Var.getClass();
                hu2Var.h.s(so0Var);
                break;
            case 16:
                vo0 vo0Var = (vo0) obj;
                vo0Var.getClass();
                hu2Var.h.v(vo0Var);
                break;
            case 17:
                Boolean bool5 = (Boolean) obj;
                boolean booleanValue5 = bool5.booleanValue();
                wm4 wm4Var11 = hu2Var.h;
                fw4 fw4Var15 = wm4Var11.b0;
                fw4Var15.getClass();
                fw4Var15.i(null, bool5);
                fl4 fl4Var9 = wm4Var11.b;
                i82.V(fl4Var9.a, "danmaku_emoji_enabled", booleanValue5);
                fw4 fw4Var16 = fl4Var9.G;
                fw4Var16.getClass();
                fw4Var16.i(null, bool5);
                break;
            case 18:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                fl4 fl4Var10 = hu2Var.h.b;
                i82.V(fl4Var10.a, "danmaku_block_enabled", booleanValue6);
                fw4 fw4Var17 = fl4Var10.a0;
                fw4Var17.getClass();
                fw4Var17.i(null, bool6);
                break;
            case 19:
                String str2 = (String) obj;
                str2.getClass();
                wm4 wm4Var12 = hu2Var.h;
                wm4Var12.getClass();
                break;
            case 20:
                String str3 = (String) obj;
                str3.getClass();
                wm4 wm4Var13 = hu2Var.h;
                wm4Var13.getClass();
                wm4Var13.b.z(str3);
                break;
            case 21:
                Boolean bool7 = (Boolean) obj;
                boolean booleanValue7 = bool7.booleanValue();
                fl4 fl4Var11 = hu2Var.h.b;
                fl4Var11.getClass();
                Log.i("SettingsManager", "saveSeparateVideoFetch: " + booleanValue7);
                i82.V(fl4Var11.a, "separate_video_fetch", booleanValue7);
                fw4 fw4Var18 = fl4Var11.s;
                fw4Var18.getClass();
                fw4Var18.i(null, bool7);
                break;
            case 22:
                sd1 sd1Var = (sd1) obj;
                sd1Var.getClass();
                wm4 wm4Var14 = hu2Var.h;
                wm4Var14.getClass();
                fw4 fw4Var19 = wm4Var14.D0;
                fw4Var19.getClass();
                fw4Var19.i(null, sd1Var);
                wm4Var14.b.a.edit().putInt("feed_history_capacity", sd1Var.J).apply();
                break;
            case 23:
                Boolean bool8 = (Boolean) obj;
                boolean booleanValue8 = bool8.booleanValue();
                fl4 fl4Var12 = hu2Var.h.b;
                fl4Var12.getClass();
                Log.i("SettingsManager", "saveVideoStartPrefetch: " + booleanValue8);
                i82.V(fl4Var12.a, "video_start_prefetch", booleanValue8);
                fw4 fw4Var20 = fl4Var12.u;
                fw4Var20.getClass();
                fw4Var20.i(null, bool8);
                break;
            case 24:
                Boolean bool9 = (Boolean) obj;
                boolean booleanValue9 = bool9.booleanValue();
                wm4 wm4Var15 = hu2Var.h;
                fw4 fw4Var21 = wm4Var15.A0;
                fw4Var21.getClass();
                fw4Var21.i(null, bool9);
                i82.V(wm4Var15.b.a, "player_progress_bar", booleanValue9);
                break;
            case 25:
                Boolean bool10 = (Boolean) obj;
                boolean booleanValue10 = bool10.booleanValue();
                fl4 fl4Var13 = hu2Var.h.b;
                i82.V(fl4Var13.a, "clean_pause", booleanValue10);
                fw4 fw4Var22 = fl4Var13.A;
                fw4Var22.getClass();
                fw4Var22.i(null, bool10);
                break;
            case 26:
                Boolean bool11 = (Boolean) obj;
                boolean booleanValue11 = bool11.booleanValue();
                wm4 wm4Var16 = hu2Var.h;
                fw4 fw4Var23 = wm4Var16.j0;
                fw4Var23.getClass();
                fw4Var23.i(null, bool11);
                i82.V(wm4Var16.b.a, "reverse_navigation", booleanValue11);
                break;
            case 27:
                Boolean bool12 = (Boolean) obj;
                boolean booleanValue12 = bool12.booleanValue();
                wm4 wm4Var17 = hu2Var.h;
                fw4 fw4Var24 = wm4Var17.r0;
                fw4Var24.getClass();
                fw4Var24.i(null, bool12);
                i82.V(wm4Var17.b.a, "show_details_on_start", booleanValue12);
                break;
            case 28:
                Boolean bool13 = (Boolean) obj;
                boolean booleanValue13 = bool13.booleanValue();
                wm4 wm4Var18 = hu2Var.h;
                fw4 fw4Var25 = wm4Var18.E;
                fw4Var25.getClass();
                fw4Var25.i(null, bool13);
                i82.V(wm4Var18.b.a, "ambient_backdrop", booleanValue13);
                break;
            default:
                Boolean bool14 = (Boolean) obj;
                boolean booleanValue14 = bool14.booleanValue();
                fl4 fl4Var14 = hu2Var.h.b;
                i82.V(fl4Var14.a, "open_own_profile_on_history_tab", booleanValue14);
                fw4 fw4Var26 = fl4Var14.y;
                fw4Var26.getClass();
                fw4Var26.i(null, bool14);
                break;
        }
        return wd5Var;
    }
}
