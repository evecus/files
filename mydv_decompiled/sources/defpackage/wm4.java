package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wm4 extends qr5 {
    public final fw4 A;
    public final fw4 A0;
    public final p04 B;
    public final p04 B0;
    public final fw4 C;
    public final fw4 C0;
    public final p04 D;
    public final fw4 D0;
    public final fw4 E;
    public final p04 E0;
    public final p04 F;
    public final fw4 G;
    public final p04 H;
    public final p04 I;
    public final fw4 J;
    public final p04 K;
    public final fw4 L;
    public final p04 M;
    public final fw4 N;
    public final p04 O;
    public final fw4 P;
    public final p04 Q;
    public final fw4 R;
    public final p04 S;
    public final fw4 T;
    public final p04 U;
    public final fw4 V;
    public final p04 W;
    public final fw4 X;
    public final p04 Y;
    public final fw4 Z;
    public final p04 a0;
    public final fl4 b;
    public final fw4 b0;
    public final Set c;
    public final p04 c0;
    public final p04 d;
    public final p04 d0;
    public final p04 e;
    public final p04 e0;
    public final p04 f;
    public final fw4 f0;
    public final p04 g;
    public final p04 g0;
    public final p04 h;
    public final fw4 h0;
    public final p04 i;
    public final p04 i0;
    public final p04 j;
    public final fw4 j0;
    public final p04 k;
    public final p04 k0;
    public final p04 l;
    public final fw4 l0;
    public final p04 m;
    public final p04 m0;
    public final p04 n;
    public final fw4 n0;
    public final p04 o;
    public final p04 o0;
    public final p04 p;
    public final fw4 p0;
    public final fw4 q;
    public final p04 q0;
    public final p04 r;
    public final fw4 r0;
    public final fw4 s;
    public final p04 s0;
    public final p04 t;
    public final p04 t0;
    public final fw4 u;
    public final fw4 u0;
    public final p04 v;
    public final p04 v0;
    public final fw4 w;
    public final fw4 w0;
    public final p04 x;
    public final p04 x0;
    public final fw4 y;
    public final fw4 y0;
    public final p04 z;
    public final p04 z0;

    public wm4(fl4 fl4Var) {
        fj0 fj0Var;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        this.b = fl4Var;
        Float valueOf = Float.valueOf(0.5f);
        Float valueOf2 = Float.valueOf(0.75f);
        Float valueOf3 = Float.valueOf(1.0f);
        byte b = 0;
        byte b2 = 1;
        byte b3 = 3;
        byte b4 = 4;
        byte b5 = 5;
        this.c = dq.p1(new Float[]{valueOf, valueOf2, valueOf3, Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(3.0f)});
        this.d = fl4Var.n;
        this.e = fl4Var.p0;
        this.f = fl4Var.r0;
        this.g = fl4Var.t0;
        this.h = fl4Var.p;
        this.i = fl4Var.r;
        this.j = fl4Var.t;
        this.k = fl4Var.v;
        this.l = fl4Var.x;
        this.m = fl4Var.z;
        this.n = fl4Var.B;
        this.o = fl4Var.D;
        w84 w84Var = new w84(fl4Var.F, (byte) 1);
        y60 B = o7.B(this);
        za1 za1Var = qn5.M;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            fj0Var = null;
            if (!o.hasNext()) {
                obj = null;
                break;
            } else {
                obj = o.next();
                if (((qn5) obj).J == ((Number) this.b.E.getValue()).intValue()) {
                    break;
                }
            }
        }
        qn5 qn5Var = (qn5) obj;
        this.p = sv2.V(w84Var, B, rn4.a, qn5Var == null ? qn5.K : qn5Var);
        SharedPreferences sharedPreferences = this.b.a;
        fw4 c = o7.c(Boolean.valueOf(sharedPreferences.contains("video_danmaku_enabled") ? sharedPreferences.getBoolean("video_danmaku_enabled", true) : sharedPreferences.getBoolean("danmaku_enabled", true)));
        this.q = c;
        this.r = sv2.j(c);
        SharedPreferences sharedPreferences2 = this.b.a;
        fw4 c2 = o7.c(Boolean.valueOf(sharedPreferences2.contains("live_danmaku_enabled") ? sharedPreferences2.getBoolean("live_danmaku_enabled", true) : sharedPreferences2.getBoolean("danmaku_enabled", true)));
        this.s = c2;
        this.t = sv2.j(c2);
        fw4 c3 = o7.c(this.b.n());
        this.u = c3;
        this.v = sv2.j(c3);
        za1 za1Var2 = t65.M;
        v2 o2 = hf1.o(za1Var2, za1Var2);
        while (true) {
            if (!o2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = o2.next();
                if (((t65) obj2).J == this.b.a.getInt("theme_mode", 0)) {
                    break;
                }
            }
        }
        t65 t65Var = (t65) obj2;
        fw4 c4 = o7.c(t65Var == null ? t65.K : t65Var);
        this.w = c4;
        this.x = sv2.j(c4);
        fw4 c5 = o7.c(this.b.e());
        this.y = c5;
        this.z = sv2.j(c5);
        fw4 c6 = o7.c(this.b.f());
        this.A = c6;
        this.B = sv2.j(c6);
        fw4 c7 = o7.c(this.b.d());
        this.C = c7;
        this.D = sv2.j(c7);
        fw4 r = hf1.r(this.b.a, "ambient_backdrop", true);
        this.E = r;
        this.F = sv2.j(r);
        fl4 fl4Var2 = this.b;
        fl4Var2.getClass();
        u90 u90Var = v90.Companion;
        String string = fl4Var2.a.getString("color_transition", null);
        u90Var.getClass();
        Iterator it = v90.M.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it.next();
                if (((v90) obj3).J.equals(string)) {
                    break;
                }
            }
        }
        v90 v90Var = (v90) obj3;
        fw4 c8 = o7.c(v90Var == null ? v90.K : v90Var);
        this.G = c8;
        this.H = sv2.j(c8);
        this.I = this.b.j;
        za1 a = on.a();
        v2 o3 = hf1.o(a, a);
        while (true) {
            if (!o3.hasNext()) {
                obj4 = null;
                break;
            } else {
                obj4 = o3.next();
                if (((on) obj4).b() == ((Number) this.b.k.getValue()).floatValue()) {
                    break;
                }
            }
        }
        on onVar = (on) obj4;
        fw4 c9 = o7.c(onVar == null ? on.K : onVar);
        this.J = c9;
        this.K = sv2.j(c9);
        fw4 c10 = o7.c(Float.valueOf(this.b.a.getFloat("playback_speed", 1.0f)));
        this.L = c10;
        this.M = sv2.j(c10);
        fw4 c11 = o7.c(Float.valueOf(ut0.q(this.b.a.getFloat("danmaku_opacity", 1.0f), 0.01f, 1.0f)));
        this.N = c11;
        this.O = sv2.j(c11);
        fw4 c12 = o7.c(Integer.valueOf(this.b.j()));
        this.P = c12;
        this.Q = sv2.j(c12);
        fw4 c13 = o7.c(oh4.o(((Number) c12.getValue()).floatValue() / 100.0f));
        this.R = c13;
        this.S = sv2.j(c13);
        fw4 c14 = o7.c(Float.valueOf(ut0.q(this.b.a.getFloat("danmaku_vertical_spacing", 1.0f), 0.5f, 2.0f)));
        this.T = c14;
        this.U = sv2.j(c14);
        fw4 c15 = o7.c(Float.valueOf(ut0.q(this.b.a.getFloat("danmaku_horizontal_spacing", 1.0f), 0.5f, 2.0f)));
        this.V = c15;
        this.W = sv2.j(c15);
        za1 za1Var3 = so0.M;
        v2 o4 = hf1.o(za1Var3, za1Var3);
        while (true) {
            if (!o4.hasNext()) {
                obj5 = null;
                break;
            } else {
                obj5 = o4.next();
                if (((so0) obj5).J == this.b.a.getFloat("danmaku_font_size", 1.0f)) {
                    break;
                }
            }
        }
        so0 so0Var = (so0) obj5;
        fw4 c16 = o7.c(so0Var == null ? so0.K : so0Var);
        this.X = c16;
        this.Y = sv2.j(c16);
        za1 za1Var4 = vo0.M;
        v2 o5 = hf1.o(za1Var4, za1Var4);
        while (true) {
            if (!o5.hasNext()) {
                obj6 = null;
                break;
            } else {
                obj6 = o5.next();
                if (((vo0) obj6).J == this.b.a.getFloat("danmaku_speed", 1.0f)) {
                    break;
                }
            }
        }
        vo0 vo0Var = (vo0) obj6;
        fw4 c17 = o7.c(vo0Var == null ? vo0.K : vo0Var);
        this.Z = c17;
        this.a0 = sv2.j(c17);
        fw4 r2 = hf1.r(this.b.a, "danmaku_emoji_enabled", true);
        this.b0 = r2;
        this.c0 = sv2.j(r2);
        fl4 fl4Var3 = this.b;
        this.d0 = fl4Var3.b0;
        this.e0 = fl4Var3.d0;
        fw4 r3 = hf1.r(fl4Var3.a, "filter_mobile_video", false);
        this.f0 = r3;
        this.g0 = sv2.j(r3);
        fw4 r4 = hf1.r(this.b.a, "pip_enabled", false);
        this.h0 = r4;
        this.i0 = sv2.j(r4);
        fw4 r5 = hf1.r(this.b.a, "reverse_navigation", false);
        this.j0 = r5;
        this.k0 = sv2.j(r5);
        fw4 r6 = hf1.r(this.b.a, "reverse_playlist_in_profile", false);
        this.l0 = r6;
        this.m0 = sv2.j(r6);
        fw4 r7 = hf1.r(this.b.a, "disable_double_back_exit", false);
        this.n0 = r7;
        this.o0 = sv2.j(r7);
        za1 za1Var5 = rr0.N;
        v2 o6 = hf1.o(za1Var5, za1Var5);
        while (true) {
            if (!o6.hasNext()) {
                obj7 = null;
                break;
            } else {
                obj7 = o6.next();
                if (((rr0) obj7).J == this.b.a.getInt("default_home_screen", 0)) {
                    break;
                }
            }
        }
        rr0 rr0Var = (rr0) obj7;
        fw4 c18 = o7.c(rr0Var == null ? rr0.L : rr0Var);
        this.p0 = c18;
        this.q0 = sv2.j(c18);
        fw4 r8 = hf1.r(this.b.a, "show_details_on_start", true);
        this.r0 = r8;
        this.s0 = sv2.j(r8);
        fl4 fl4Var4 = this.b;
        this.t0 = fl4Var4.f0;
        fw4 r9 = hf1.r(fl4Var4.a, "featured_auto_play", true);
        this.u0 = r9;
        this.v0 = sv2.j(r9);
        za1 za1Var6 = so3.O;
        v2 o7 = hf1.o(za1Var6, za1Var6);
        while (true) {
            if (!o7.hasNext()) {
                obj8 = null;
                break;
            } else {
                obj8 = o7.next();
                if (((so3) obj8).J.equals(this.b.p())) {
                    break;
                }
            }
        }
        so3 so3Var = (so3) obj8;
        fw4 c19 = o7.c(so3Var == null ? so3.K : so3Var);
        this.w0 = c19;
        this.x0 = sv2.j(c19);
        za1 za1Var7 = po3.M;
        v2 o8 = hf1.o(za1Var7, za1Var7);
        while (true) {
            if (!o8.hasNext()) {
                obj9 = null;
                break;
            }
            obj9 = o8.next();
            String str = ((po3) obj9).J;
            String string2 = this.b.a.getString("playback_clock_display_mode", "never");
            if (str.equals(string2 != null ? string2 : "never")) {
                break;
            }
        }
        po3 po3Var = (po3) obj9;
        fw4 c20 = o7.c(po3Var == null ? po3.K : po3Var);
        this.y0 = c20;
        this.z0 = sv2.j(c20);
        fw4 r10 = hf1.r(this.b.a, "player_progress_bar", false);
        this.A0 = r10;
        this.B0 = sv2.j(r10);
        this.C0 = o7.c(Boolean.valueOf(j42.c(this.b.p(), "auto_next")));
        za1 za1Var8 = sd1.M;
        v2 o9 = hf1.o(za1Var8, za1Var8);
        while (true) {
            if (!o9.hasNext()) {
                obj10 = null;
                break;
            } else {
                obj10 = o9.next();
                if (((sd1) obj10).J == this.b.a.getInt("feed_history_capacity", 100)) {
                    break;
                }
            }
        }
        sd1 sd1Var = (sd1) obj10;
        fw4 c21 = o7.c(sd1Var == null ? sd1.K : sd1Var);
        this.D0 = c21;
        this.E0 = sv2.j(c21);
        if (!this.c.contains(this.L.getValue())) {
            fw4 fw4Var = this.L;
            fw4Var.getClass();
            fw4Var.i(null, valueOf3);
            this.b.a.edit().putFloat("playback_speed", 1.0f).apply();
        }
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, b3), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, b4), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, b5), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 6), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 7), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 8), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 9), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 10), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 11), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, b), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, b2), 3);
        p70.g0(o7.B(this), null, null, new sm4(this, fj0Var, (byte) 2), 3);
    }

    public final void A(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        fw4 fw4Var = this.q;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
        fl4 fl4Var = this.b;
        i82.V(fl4Var.a, "video_danmaku_enabled", z);
        fw4 fw4Var2 = fl4Var.I;
        Boolean valueOf2 = Boolean.valueOf(z);
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf2);
    }

    public final boolean B(String str, String str2) {
        Object obj;
        str.getClass();
        fl4 fl4Var = this.b;
        fl4Var.getClass();
        Iterator it = ((Iterable) fl4Var.g0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j42.c(((dl4) obj).a, str)) {
                break;
            }
        }
        dl4 dl4Var = (dl4) obj;
        if (dl4Var != null && dl4Var.b()) {
            return fl4.t(str2, dl4Var.h).equals(dl4Var.g);
        }
        return false;
    }

    public final void p(String str) {
        str.getClass();
        fl4 fl4Var = this.b;
        fl4Var.getClass();
        ArrayList s1 = o70.s1((Collection) fl4Var.g0.getValue());
        int size = s1.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = s1.get(i2);
            i2++;
            if (j42.c(((dl4) obj).a, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        s1.set(i, dl4.a((dl4) s1.get(i), "", "", null, 831));
        fl4Var.A(s1);
    }

    public final void q(ro0 ro0Var) {
        fw4 fw4Var = this.R;
        fw4Var.getClass();
        fw4Var.i(null, ro0Var);
        float f = ro0Var.I;
        Integer valueOf = Integer.valueOf(ut0.r((int) (f * 100.0f), 1, 100));
        fw4 fw4Var2 = this.P;
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf);
        fl4 fl4Var = this.b;
        fl4Var.getClass();
        float q = ut0.q(f, 0.01f, 1.0f);
        int r = ut0.r((int) (100.0f * q), 1, 100);
        fl4Var.a.edit().putFloat("danmaku_area", q).putInt("danmaku_area_percent", r).apply();
        fw4 fw4Var3 = fl4Var.Q;
        Integer valueOf2 = Integer.valueOf(r);
        fw4Var3.getClass();
        fw4Var3.i(null, valueOf2);
    }

    public final void r(int i) {
        int r = ut0.r(i, 1, 100);
        Integer valueOf = Integer.valueOf(r);
        fw4 fw4Var = this.P;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
        ro0 o = oh4.o(r / 100.0f);
        fw4 fw4Var2 = this.R;
        fw4Var2.getClass();
        fw4Var2.i(null, o);
        this.b.C(r);
    }

    public final void s(so0 so0Var) {
        fw4 fw4Var = this.X;
        fw4Var.getClass();
        fw4Var.i(null, so0Var);
        float f = so0Var.J;
        fl4 fl4Var = this.b;
        fl4Var.a.edit().putFloat("danmaku_font_size", f).apply();
        fw4 fw4Var2 = fl4Var.W;
        Float valueOf = Float.valueOf(f);
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf);
    }

    public final void t(float f) {
        float q = ut0.q(f, 0.5f, 2.0f);
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.V;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
        this.b.D(q);
    }

    public final void u(float f) {
        float q = ut0.q(f, 0.01f, 1.0f);
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.N;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
        this.b.E(q);
    }

    public final void v(vo0 vo0Var) {
        fw4 fw4Var = this.Z;
        fw4Var.getClass();
        fw4Var.i(null, vo0Var);
        float f = vo0Var.J;
        fl4 fl4Var = this.b;
        fl4Var.a.edit().putFloat("danmaku_speed", f).apply();
        fw4 fw4Var2 = fl4Var.Y;
        Float valueOf = Float.valueOf(f);
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf);
    }

    public final void w(float f) {
        float q = ut0.q(f, 0.5f, 2.0f);
        Float valueOf = Float.valueOf(q);
        fw4 fw4Var = this.T;
        fw4Var.getClass();
        fw4Var.i(null, valueOf);
        this.b.F(q);
    }

    public final void x(lq5 lq5Var) {
        Object obj;
        String str = lq5Var.J;
        fl4 fl4Var = this.b;
        fl4Var.getClass();
        fl4Var.a.edit().putString("live_video_resolution", str).apply();
        fw4 fw4Var = fl4Var.o;
        Iterator it = lq5.O.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((lq5) obj).J.equals(str)) {
                    break;
                }
            }
        }
        lq5 lq5Var2 = (lq5) obj;
        if (lq5Var2 == null) {
            lq5Var2 = lq5.L;
        }
        fw4Var.getClass();
        fw4Var.i(null, lq5Var2);
    }

    public final void y(so3 so3Var) {
        fw4 fw4Var = this.w0;
        fw4Var.getClass();
        fw4Var.i(null, so3Var);
        Boolean valueOf = Boolean.valueOf(so3Var == so3.K);
        fw4 fw4Var2 = this.C0;
        fw4Var2.getClass();
        fw4Var2.i(null, valueOf);
        String str = so3Var.J;
        fl4 fl4Var = this.b;
        fl4Var.getClass();
        fl4Var.a.edit().putString("playback_completion_action", str).putBoolean("auto_play_next_video", str.equals("auto_next")).apply();
    }

    public final void z(float f) {
        if (this.c.contains(Float.valueOf(f))) {
            Float valueOf = Float.valueOf(f);
            fw4 fw4Var = this.L;
            fw4Var.getClass();
            fw4Var.i(null, valueOf);
            this.b.a.edit().putFloat("playback_speed", f).apply();
        }
    }
}
