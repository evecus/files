package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.PsExtractor;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fl4 {
    public static final el4 Companion = new el4();
    public static final Set u0 = dq.p1(new Integer[]{5, 10, 15, 30, 60});
    public final fw4 A;
    public final p04 B;
    public final fw4 C;
    public final p04 D;
    public final fw4 E;
    public final p04 F;
    public final fw4 G;
    public final p04 H;
    public final fw4 I;
    public final p04 J;
    public final fw4 K;
    public final p04 L;
    public final fw4 M;
    public final p04 N;
    public final fw4 O;
    public final p04 P;
    public final fw4 Q;
    public final p04 R;
    public final fw4 S;
    public final p04 T;
    public final fw4 U;
    public final p04 V;
    public final fw4 W;
    public final p04 X;
    public final fw4 Y;
    public final p04 Z;
    public final SharedPreferences a;
    public final fw4 a0;
    public final Context b;
    public final p04 b0;
    public final fw4 c;
    public final fw4 c0;
    public final p04 d;
    public final p04 d0;
    public final fw4 e;
    public final fw4 e0;
    public final p04 f;
    public final p04 f0;
    public final fw4 g;
    public final fw4 g0;
    public final p04 h;
    public final p04 h0;
    public final fw4 i;
    public final fw4 i0;
    public final p04 j;
    public final p04 j0;
    public final fw4 k;
    public final fw4 k0;
    public final p04 l;
    public final p04 l0;
    public final fw4 m;
    public final fw4 m0;
    public final p04 n;
    public final p04 n0;
    public final fw4 o;
    public final fw4 o0;
    public final p04 p;
    public final p04 p0;
    public final fw4 q;
    public final fw4 q0;
    public final p04 r;
    public final p04 r0;
    public final fw4 s;
    public final fw4 s0;
    public final p04 t;
    public final p04 t0;
    public final fw4 u;
    public final p04 v;
    public final fw4 w;
    public final p04 x;
    public final fw4 y;
    public final p04 z;

    public fl4(Context context) {
        Object obj;
        Object obj2;
        Object obj3;
        Object g54Var;
        Object obj4;
        List c;
        Object obj5;
        Object g54Var2;
        Object obj6;
        String str;
        context.getClass();
        Context context2 = context;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("douyin_auth", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        Context applicationContext = context2.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context2;
        String string = sharedPreferences.getString("cookie_string", "");
        fw4 c2 = o7.c(string == null ? "" : string);
        this.c = c2;
        this.d = sv2.j(c2);
        el4 el4Var = Companion;
        String string2 = sharedPreferences.getString("cookie_string", "");
        string2 = string2 == null ? "" : string2;
        el4Var.getClass();
        fw4 c3 = o7.c(Boolean.valueOf(el4.a(string2)));
        this.e = c3;
        this.f = sv2.j(c3);
        String string3 = sharedPreferences.getString("viewed_video_ids", "");
        List X = jx4.X(string3 == null ? "" : string3, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj7 : X) {
            if (!jx4.L((String) obj7)) {
                arrayList.add(obj7);
            }
        }
        fw4 c4 = o7.c(o70.u1(arrayList));
        this.g = c4;
        this.h = sv2.j(c4);
        md5 md5Var = nd5.Companion;
        String string4 = this.a.getString("ui_form_factor", null);
        md5Var.getClass();
        fw4 c5 = o7.c(md5.a(string4));
        this.i = c5;
        this.j = sv2.j(c5);
        fw4 c6 = o7.c(Float.valueOf(ut0.q(this.a.getFloat("app_font_scale", 1.0f), 1.0f, 1.6f)));
        this.k = c6;
        this.l = sv2.j(c6);
        za1 za1Var = lq5.O;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            if (o.hasNext()) {
                obj = o.next();
                if (((lq5) obj).J.equals(this.a.getString("video_resolution", TtmlNode.TEXT_EMPHASIS_AUTO))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        lq5 lq5Var = (lq5) obj;
        fw4 c7 = o7.c(lq5Var == null ? lq5.L : lq5Var);
        this.m = c7;
        this.n = sv2.j(c7);
        boolean contains = this.a.contains("live_video_resolution");
        SharedPreferences sharedPreferences2 = this.a;
        fw4 c8 = o7.c(contains ? w(sharedPreferences2.getString("live_video_resolution", TtmlNode.TEXT_EMPHASIS_AUTO)) : w(sharedPreferences2.getString("video_resolution", TtmlNode.TEXT_EMPHASIS_AUTO)));
        this.o = c8;
        this.p = sv2.j(c8);
        bj5 bj5Var = cj5.Companion;
        String string5 = this.a.getString("video_codec_preference", TtmlNode.TEXT_EMPHASIS_AUTO);
        bj5Var.getClass();
        Iterator it = cj5.N.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((cj5) obj2).J.equals(string5)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        cj5 cj5Var = (cj5) obj2;
        fw4 c9 = o7.c(cj5Var == null ? cj5.K : cj5Var);
        this.q = c9;
        this.r = sv2.j(c9);
        fw4 r = hf1.r(this.a, "separate_video_fetch", true);
        this.s = r;
        this.t = sv2.j(r);
        fw4 r2 = hf1.r(this.a, "video_start_prefetch", false);
        this.u = r2;
        this.v = sv2.j(r2);
        fw4 r3 = hf1.r(this.a, "mix_playlist_panel_enabled", true);
        this.w = r3;
        this.x = sv2.j(r3);
        fw4 r4 = hf1.r(this.a, "open_own_profile_on_history_tab", false);
        this.y = r4;
        this.z = sv2.j(r4);
        fw4 r5 = hf1.r(this.a, "clean_pause", false);
        this.A = r5;
        this.B = sv2.j(r5);
        fw4 r6 = hf1.r(this.a, "tv_launcher_channel_enabled", false);
        this.C = r6;
        this.D = sv2.j(r6);
        int i = this.a.getInt("video_load_timeout_seconds", 10);
        Integer valueOf = u0.contains(Integer.valueOf(i)) ? Integer.valueOf(i) : null;
        fw4 c10 = o7.c(Integer.valueOf(valueOf != null ? valueOf.intValue() : 10));
        this.E = c10;
        this.F = sv2.j(c10);
        hf1.r(this.a, "danmaku_enabled", true);
        fw4 r7 = hf1.r(this.a, "danmaku_emoji_enabled", true);
        this.G = r7;
        this.H = sv2.j(r7);
        boolean contains2 = this.a.contains("video_danmaku_enabled");
        SharedPreferences sharedPreferences3 = this.a;
        fw4 c11 = o7.c(Boolean.valueOf(contains2 ? sharedPreferences3.getBoolean("video_danmaku_enabled", true) : sharedPreferences3.getBoolean("danmaku_enabled", true)));
        this.I = c11;
        this.J = sv2.j(c11);
        boolean contains3 = this.a.contains("live_danmaku_enabled");
        SharedPreferences sharedPreferences4 = this.a;
        fw4 c12 = o7.c(Boolean.valueOf(contains3 ? sharedPreferences4.getBoolean("live_danmaku_enabled", true) : sharedPreferences4.getBoolean("danmaku_enabled", true)));
        this.K = c12;
        this.L = sv2.j(c12);
        za1 za1Var2 = an2.N;
        v2 o2 = hf1.o(za1Var2, za1Var2);
        while (true) {
            if (o2.hasNext()) {
                obj3 = o2.next();
                if (((an2) obj3).J.equals(this.a.getString("live_danmaku_style", "scroll"))) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        an2 an2Var = (an2) obj3;
        fw4 c13 = o7.c(an2Var == null ? an2.K : an2Var);
        this.M = c13;
        this.N = sv2.j(c13);
        fw4 c14 = o7.c(Float.valueOf(ut0.q(this.a.getFloat("danmaku_opacity", 1.0f), 0.01f, 1.0f)));
        this.O = c14;
        this.P = sv2.j(c14);
        boolean contains4 = this.a.contains("danmaku_area_percent");
        SharedPreferences sharedPreferences5 = this.a;
        fw4 c15 = o7.c(Integer.valueOf(contains4 ? ut0.r(sharedPreferences5.getInt("danmaku_area_percent", 100), 1, 100) : ut0.r((int) (ut0.q(sharedPreferences5.getFloat("danmaku_area", 1.0f), 0.01f, 1.0f) * 100.0f), 1, 100)));
        this.Q = c15;
        this.R = sv2.j(c15);
        fw4 c16 = o7.c(Float.valueOf(ut0.q(this.a.getFloat("danmaku_vertical_spacing", 1.0f), 0.5f, 2.0f)));
        this.S = c16;
        this.T = sv2.j(c16);
        fw4 c17 = o7.c(Float.valueOf(ut0.q(this.a.getFloat("danmaku_horizontal_spacing", 1.0f), 0.5f, 2.0f)));
        this.U = c17;
        this.V = sv2.j(c17);
        fw4 c18 = o7.c(Float.valueOf(this.a.getFloat("danmaku_font_size", 1.0f)));
        this.W = c18;
        this.X = sv2.j(c18);
        fw4 c19 = o7.c(Float.valueOf(this.a.getFloat("danmaku_speed", 1.0f)));
        this.Y = c19;
        this.Z = sv2.j(c19);
        fw4 r8 = hf1.r(this.a, "danmaku_block_enabled", false);
        this.a0 = r8;
        this.b0 = sv2.j(r8);
        String string6 = this.a.getString("danmaku_block_words", null);
        Object obj8 = o91.I;
        if (string6 == null) {
            obj4 = obj8;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(string6);
                mk2 K = p70.K();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    optString.getClass();
                    String obj9 = jx4.g0(optString).toString();
                    if (obj9.length() <= 0) {
                        obj9 = null;
                    }
                    if (obj9 != null) {
                        K.add(obj9);
                    }
                }
                g54Var = o70.P0(p70.D(K));
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            Throwable a = h54.a(g54Var);
            if (a != null) {
                Log.e("SettingsManager", "解析弹幕屏蔽词失败", a);
                g54Var = obj8;
            }
            obj4 = (List) g54Var;
        }
        fw4 c20 = o7.c(obj4);
        this.c0 = c20;
        this.d0 = sv2.j(c20);
        fw4 c21 = o7.c(Boolean.valueOf(u()));
        this.e0 = c21;
        this.f0 = sv2.j(c21);
        fw4 c22 = o7.c(obj8);
        this.g0 = c22;
        this.h0 = sv2.j(c22);
        fw4 c23 = o7.c("");
        this.i0 = c23;
        this.j0 = sv2.j(c23);
        SharedPreferences sharedPreferences6 = this.a;
        String string7 = sharedPreferences6.getString("accounts_list", null);
        if (string7 == null || jx4.L(string7)) {
            c = c();
        } else {
            try {
                JSONArray jSONArray2 = new JSONArray(string7);
                mk2 K2 = p70.K();
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject optJSONObject = jSONArray2.optJSONObject(i3);
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString(TtmlNode.ATTR_ID, "");
                        optString2 = jx4.L(optString2) ? optJSONObject.optString("name", "") : optString2;
                        String optString3 = optJSONObject.optString("name", optString2);
                        if (!jx4.L(optString3)) {
                            optString2 = optString3;
                        } else if (jx4.L(optString2)) {
                            optString2 = "account_" + i3;
                        }
                        String optString4 = optJSONObject.optString("cookie", "");
                        optString4.getClass();
                        String optString5 = optJSONObject.optString("securityPayload", "");
                        optString5.getClass();
                        String optString6 = optJSONObject.optString("ticket", "");
                        optString6.getClass();
                        String optString7 = optJSONObject.optString("tsSign", "");
                        optString7.getClass();
                        String optString8 = optJSONObject.optString("privateKey", "");
                        optString8.getClass();
                        String optString9 = optJSONObject.optString("pinHash", "");
                        optString9.getClass();
                        String optString10 = optJSONObject.optString("pinSalt", "");
                        optString10.getClass();
                        String optString11 = optJSONObject.optString("userId", "");
                        optString11.getClass();
                        String optString12 = optJSONObject.optString("serverCert", "");
                        optString12.getClass();
                        K2.add(new dl4(optString2, optString4, optString5, optString6, optString7, optString8, optString9, optString10, optString11, optString12));
                    }
                }
                g54Var2 = p70.D(K2);
            } catch (Throwable th2) {
                g54Var2 = new g54(th2);
            }
            Throwable a2 = h54.a(g54Var2);
            if (a2 == null) {
                obj8 = g54Var2;
            } else {
                Log.e("SettingsManager", "解析 accounts_list 失败，尝试回退迁移", a2);
            }
            List list = (List) obj8;
            if (list.isEmpty()) {
                sharedPreferences6.edit().remove("accounts_list").apply();
                c = c();
            } else {
                if (!list.isEmpty()) {
                    Iterator<E> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (j42.c(((dl4) it2.next()).a, "main")) {
                            break;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(list);
                if (!arrayList2.isEmpty()) {
                    arrayList2.set(0, dl4.a((dl4) arrayList2.get(0), null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED));
                    x(arrayList2);
                }
                list = arrayList2;
                String i4 = i();
                if (!list.isEmpty()) {
                    if (!jx4.L(i4) && !list.isEmpty()) {
                        Iterator<E> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (j42.c(((dl4) it3.next()).a, i4)) {
                                break;
                            }
                        }
                    }
                    Iterator<E> it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj6 = it4.next();
                            if (j42.c(((dl4) obj6).a, "main")) {
                                break;
                            }
                        } else {
                            obj6 = null;
                            break;
                        }
                    }
                    dl4 dl4Var = (dl4) obj6;
                    B((dl4Var == null || (str = dl4Var.a) == null) ? ((dl4) o70.T0(list)).a : str);
                }
                c = list;
            }
        }
        Object obj10 = null;
        c22.i(null, c);
        fw4 fw4Var = this.i0;
        String i5 = i();
        fw4Var.getClass();
        fw4Var.i(null, i5);
        fw4 r9 = hf1.r(this.a, "danmaku_filter_package", true);
        this.k0 = r9;
        this.l0 = sv2.j(r9);
        fw4 r10 = hf1.r(this.a, "pip_enabled", false);
        this.m0 = r10;
        this.n0 = sv2.j(r10);
        er erVar = fr.Companion;
        String string8 = this.a.getString("audio_balance_level", "off");
        erVar.getClass();
        Iterator it5 = fr.M.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj5 = it5.next();
                if (((fr) obj5).J.equals(string8)) {
                    break;
                }
            } else {
                obj5 = null;
                break;
            }
        }
        fr frVar = (fr) obj5;
        fw4 c24 = o7.c(frVar == null ? fr.K : frVar);
        this.o0 = c24;
        this.p0 = sv2.j(c24);
        cp3 cp3Var = dp3.Companion;
        String string9 = this.a.getString("player_surface_type", "surface_view");
        cp3Var.getClass();
        Iterator it6 = dp3.O.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next = it6.next();
            if (((dp3) next).J.equals(string9)) {
                obj10 = next;
                break;
            }
        }
        dp3 dp3Var = (dp3) obj10;
        fw4 c25 = o7.c(dp3Var == null ? dp3.K : dp3Var);
        this.q0 = c25;
        this.r0 = sv2.j(c25);
        fw4 r11 = hf1.r(this.a, "surface_buffer_align", false);
        zz4.a().h(r11.getValue());
        this.s0 = r11;
        this.t0 = sv2.j(r11);
    }

    public static String t(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = (str2 + ":" + str).getBytes(z50.a);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : digest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static lq5 w(String str) {
        Object obj;
        za1 za1Var = lq5.O;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            if (!o.hasNext()) {
                obj = null;
                break;
            }
            obj = o.next();
            if (((lq5) obj).J.equals(str)) {
                break;
            }
        }
        lq5 lq5Var = (lq5) obj;
        return (lq5Var == null || lq5Var == lq5.L) ? lq5.M : lq5Var;
    }

    public final void A(ArrayList arrayList) {
        x(arrayList);
        fw4 fw4Var = this.g0;
        fw4Var.getClass();
        fw4Var.i(null, arrayList);
    }

    public final void B(String str) {
        this.a.edit().putString("current_account_id", str).apply();
        this.i0.h(str);
    }

    public final void C(int i) {
        int r = ut0.r(i, 1, 100);
        this.a.edit().putInt("danmaku_area_percent", r).putFloat("danmaku_area", r / 100.0f).apply();
        Integer valueOf = Integer.valueOf(r);
        fw4 fw4Var = this.Q;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
    }

    public final void D(float f) {
        float q = ut0.q(f, 0.5f, 2.0f);
        this.a.edit().putFloat("danmaku_horizontal_spacing", q).apply();
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.U;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
    }

    public final void E(float f) {
        float q = ut0.q(f, 0.01f, 1.0f);
        this.a.edit().putFloat("danmaku_opacity", q).apply();
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.O;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
    }

    public final void F(float f) {
        float q = ut0.q(f, 0.5f, 2.0f);
        this.a.edit().putFloat("danmaku_vertical_spacing", q).apply();
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.S;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
    }

    public final void G(String str, d32 d32Var) {
        str.getClass();
        this.a.edit().putString("interaction_security_payload", str).putString("interaction_ticket", d32Var.b).putString("interaction_ts_sign", d32Var.c).putString("interaction_private_key", d32Var.d).putString("interaction_server_cert", d32Var.e).apply();
        Boolean valueOf = Boolean.valueOf(d32Var.a());
        fw4 fw4Var = this.e0;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
    }

    public final void H(String str) {
        str.getClass();
        this.a.edit().putString("cookie_string", str).apply();
        fw4 fw4Var = this.c;
        fw4Var.getClass();
        fw4Var.i(null, str);
        Companion.getClass();
        Boolean valueOf = Boolean.valueOf(el4.a(str));
        fw4 fw4Var2 = this.e;
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf);
    }

    public final void I(String str) {
        String i = i();
        ArrayList s1 = o70.s1((Collection) this.g0.getValue());
        int size = s1.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i2 = -1;
                break;
            }
            Object obj = s1.get(i3);
            i3++;
            if (j42.c(((dl4) obj).a, i)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            this.a.edit().putString("self_user_id", str).apply();
        } else {
            if (j42.c(((dl4) s1.get(i2)).i, str)) {
                return;
            }
            s1.set(i2, dl4.a((dl4) s1.get(i2), null, null, str, 767));
            A(s1);
        }
    }

    public final void J(String str) {
        this.a.edit().putString("user_unique_id", str).apply();
    }

    public final void K(String str) {
        Object obj;
        str.getClass();
        Iterator it = ((Iterable) this.g0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (j42.c(((dl4) obj).a, str)) {
                    break;
                }
            }
        }
        dl4 dl4Var = (dl4) obj;
        if (dl4Var == null) {
            return;
        }
        H(dl4Var.b);
        if (jx4.L(dl4Var.d)) {
            b();
        } else {
            String str2 = dl4Var.c;
            G(str2, new d32(str2, dl4Var.d, dl4Var.e, dl4Var.f, ""));
        }
        B(str);
    }

    public final boolean a(String str) {
        String obj = jx4.g0(str).toString();
        if (obj.length() == 0) {
            return false;
        }
        List list = (List) this.c0.getValue();
        if (!nt3.r(list) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (qx4.t((String) it.next(), obj, true)) {
                    return false;
                }
            }
        }
        y(o70.g1(list, obj));
        return true;
    }

    public final void b() {
        this.a.edit().remove("interaction_security_payload").remove("interaction_ticket").remove("interaction_ts_sign").remove("interaction_private_key").remove("interaction_server_cert").apply();
        Boolean bool = Boolean.FALSE;
        fw4 fw4Var = this.e0;
        fw4Var.getClass();
        fw4Var.i(null, bool);
    }

    public final List c() {
        String g = g();
        String m = m();
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("interaction_ticket", "");
        if (string == null) {
            string = "";
        }
        String string2 = sharedPreferences.getString("interaction_ts_sign", "");
        if (string2 == null) {
            string2 = "";
        }
        String k = k();
        String string3 = sharedPreferences.getString("self_user_id", "");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = sharedPreferences.getString("interaction_server_cert", "");
        dl4 dl4Var = new dl4("main", g, m, string, string2, k, string3, string4 != null ? string4 : "", PsExtractor.AUDIO_STREAM);
        if (jx4.L(g()) && !u()) {
            return o91.I;
        }
        x(p70.j0(dl4Var));
        B("main");
        return p70.j0(dl4Var);
    }

    public final z70 d() {
        boolean z;
        y70 y70Var = z70.Companion;
        Object obj = null;
        String string = this.a.getString("color_contrast", null);
        y70Var.getClass();
        Iterator it = z70.O.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((z70) next).J.equals(string)) {
                obj = next;
                break;
            }
        }
        z70 z70Var = (z70) obj;
        if (z70Var != null) {
            return z70Var;
        }
        Context context = this.b;
        context.getClass();
        Boolean bool = sp0.a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = (context.getResources().getConfiguration().uiMode & 15) == 4 || context.getPackageManager().hasSystemFeature("android.software.leanback");
            sp0.a = Boolean.valueOf(z);
        }
        return z ? z70.M : z70.L;
    }

    public final t80 e() {
        s80 s80Var = t80.Companion;
        SharedPreferences sharedPreferences = this.a;
        Object obj = null;
        String string = sharedPreferences.getString("color_source", null);
        s80Var.getClass();
        Iterator it = t80.O.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((t80) next).J.equals(string)) {
                obj = next;
                break;
            }
        }
        t80 t80Var = (t80) obj;
        if (t80Var != null) {
            return t80Var;
        }
        boolean contains = sharedPreferences.contains("dynamic_color");
        t80 t80Var2 = t80.K;
        if (contains) {
            if (!sharedPreferences.getBoolean("dynamic_color", true)) {
                t80Var2 = t80.M;
            } else if (Build.VERSION.SDK_INT >= 31) {
                t80Var2 = t80.L;
            }
        }
        sharedPreferences.edit().putString("color_source", t80Var2.J).apply();
        return t80Var2;
    }

    public final s90 f() {
        r90 r90Var = s90.Companion;
        Object obj = null;
        String string = this.a.getString("color_style", null);
        r90Var.getClass();
        Iterator it = s90.M.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((s90) next).J.equals(string)) {
                obj = next;
                break;
            }
        }
        s90 s90Var = (s90) obj;
        return s90Var == null ? s90.K : s90Var;
    }

    public final String g() {
        String string = this.a.getString("cookie_string", "");
        return string == null ? "" : string;
    }

    public final LinkedHashMap h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = jx4.X(g(), new String[]{";"}, 6).iterator();
        while (it.hasNext()) {
            List X = jx4.X(jx4.g0((String) it.next()).toString(), new String[]{"="}, 2);
            if (X.size() == 2) {
                linkedHashMap.put(jx4.g0((String) X.get(0)).toString(), jx4.g0((String) X.get(1)).toString());
            }
        }
        return linkedHashMap;
    }

    public final String i() {
        String string = this.a.getString("current_account_id", "");
        return string == null ? "" : string;
    }

    public final int j() {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences.contains("danmaku_area_percent") ? ut0.r(sharedPreferences.getInt("danmaku_area_percent", 100), 1, 100) : ut0.r((int) (ut0.q(sharedPreferences.getFloat("danmaku_area", 1.0f), 0.01f, 1.0f) * 100.0f), 1, 100);
    }

    public final String k() {
        String string = this.a.getString("interaction_private_key", "");
        return string == null ? "" : string;
    }

    public final d32 l() {
        String str;
        String str2;
        String str3;
        String m = m();
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("interaction_ticket", "");
        if (string == null) {
            string = "";
        }
        String string2 = sharedPreferences.getString("interaction_ts_sign", "");
        if (string2 == null) {
            string2 = "";
        }
        String k = k();
        String string3 = sharedPreferences.getString("interaction_server_cert", "");
        if (string3 == null) {
            str2 = string;
            str3 = string2;
            str = "";
        } else {
            String str4 = string2;
            str = string3;
            str2 = string;
            str3 = str4;
        }
        return new d32(m, str2, str3, k, str);
    }

    public final String m() {
        String string = this.a.getString("interaction_security_payload", "");
        return string == null ? "" : string;
    }

    public final an2 n() {
        Object obj;
        za1 za1Var = an2.N;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            if (!o.hasNext()) {
                obj = null;
                break;
            }
            obj = o.next();
            if (((an2) obj).J.equals(this.a.getString("live_danmaku_style", "scroll"))) {
                break;
            }
        }
        an2 an2Var = (an2) obj;
        return an2Var == null ? an2.K : an2Var;
    }

    public final String o(String str) {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString(str, "");
        String str2 = string != null ? string : "";
        if (str2.length() == 16) {
            for (int i = 0; i < str2.length(); i++) {
                if (Character.isDigit(str2.charAt(i))) {
                }
            }
            return str2;
        }
        String valueOf = String.valueOf(((new SecureRandom().nextLong() >>> 1) % 9000000000000000L) + 1000000000000000L);
        sharedPreferences.edit().putString(str, valueOf).apply();
        return valueOf;
    }

    public final String p() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("playback_completion_action", null);
        return (string == null || jx4.L(string)) ? sharedPreferences.getBoolean("auto_play_next_video", true) ? "auto_next" : "pause" : string;
    }

    public final String q() {
        Object obj;
        Iterator it = ((Iterable) this.g0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j42.c(((dl4) obj).a, i())) {
                break;
            }
        }
        dl4 dl4Var = (dl4) obj;
        String str = dl4Var != null ? dl4Var.i : null;
        if (str == null) {
            str = "";
        }
        if (!jx4.L(str)) {
            return str;
        }
        String string = this.a.getString("self_user_id", "");
        return string == null ? "" : string;
    }

    public final String r() {
        String string = this.a.getString("user_unique_id", "");
        return string == null ? "" : string;
    }

    public final List s() {
        String string = this.a.getString("viewed_video_ids", "");
        String str = string != null ? string : "";
        if (jx4.L(str)) {
            return o91.I;
        }
        List X = jx4.X(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : X) {
            if (!jx4.L((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean u() {
        return l().a();
    }

    public final boolean v() {
        el4 el4Var = Companion;
        String g = g();
        el4Var.getClass();
        return el4.a(g);
    }

    public final void x(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dl4 dl4Var = (dl4) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.ATTR_ID, dl4Var.a);
            jSONObject.put("name", dl4Var.a);
            jSONObject.put("cookie", dl4Var.b);
            jSONObject.put("securityPayload", dl4Var.c);
            jSONObject.put("ticket", dl4Var.d);
            jSONObject.put("tsSign", dl4Var.e);
            jSONObject.put("privateKey", dl4Var.f);
            jSONObject.put("serverCert", dl4Var.j);
            jSONObject.put("pinHash", dl4Var.g);
            jSONObject.put("pinSalt", dl4Var.h);
            jSONObject.put("userId", dl4Var.i);
            jSONArray.put(jSONObject);
        }
        this.a.edit().putString("accounts_list", jSONArray.toString()).apply();
    }

    public final void y(ArrayList arrayList) {
        List P0 = o70.P0(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        this.a.edit().putString("danmaku_block_words", jSONArray.toString()).apply();
        fw4 fw4Var = this.c0;
        fw4Var.getClass();
        fw4Var.i(null, P0);
    }

    public final void z(String str) {
        Iterable iterable = (Iterable) this.c0.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!j42.c((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        y(arrayList);
    }
}
