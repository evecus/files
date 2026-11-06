package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hu2 extends rg {
    public static final wt2 Companion = new wt2();
    public final p04 A;
    public boolean B;
    public rv4 C;
    public final fw4 D;
    public final p04 E;
    public final mn4 F;
    public final n04 G;
    public final fw4 H;
    public final p04 I;
    public final jk3 J;
    public final jk3 K;
    public final fw4 L;
    public final p04 M;
    public final fw4 N;
    public final p04 O;
    public final fw4 P;
    public final p04 Q;
    public final fw4 R;
    public final p04 S;
    public final n94 c;
    public final fl4 d;
    public final s e;
    public final n11 f;
    public final kq5 g;
    public final wm4 h;
    public final r83 i;
    public final yd1 j;
    public final yd1 k;
    public final ij1 l;
    public final f50 m;
    public final op2 n;
    public final ye4 o;
    public final gx3 p;
    public final mb5 q;
    public final qj0 r;
    public final mn4 s;
    public final n04 t;
    public boolean u;
    public final fw4 v;
    public final p04 w;
    public final fw4 x;
    public final p04 y;
    public final fw4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(Application application, n94 n94Var) {
        super(application);
        application.getClass();
        n94Var.getClass();
        this.c = n94Var;
        fl4 fl4Var = new fl4(application);
        this.d = fl4Var;
        s sVar = new s(application);
        this.e = sVar;
        n11 n11Var = new n11(fl4Var, sVar);
        this.f = n11Var;
        kq5 kq5Var = new kq5(n11Var, fl4Var);
        this.g = kq5Var;
        no4 no4Var = new no4(application);
        wm4 wm4Var = new wm4(fl4Var);
        this.h = wm4Var;
        this.i = new r83();
        byte b = 0;
        this.j = new yd1(kq5Var, wm4Var, false);
        byte b2 = 1;
        this.k = new yd1(kq5Var, wm4Var, true);
        this.l = new ij1(kq5Var, wm4Var);
        this.m = new f50(kq5Var, wm4Var);
        this.n = new op2(application, kq5Var, fl4Var, no4Var, n11Var);
        this.o = new ye4(kq5Var, n94Var, new tc4(application), new zc4(application, fl4Var), fl4Var);
        this.p = new gx3(kq5Var, fl4Var, n94Var);
        this.q = new mb5(application);
        qj0 qj0Var = new qj0(application, fl4Var);
        this.r = qj0Var;
        byte b3 = 5;
        fj0 fj0Var = null;
        mn4 b4 = o7.b(1, 5, null);
        this.s = b4;
        this.t = new n04(b4);
        fw4 c = o7.c(null);
        this.v = c;
        this.w = sv2.j(c);
        fw4 c2 = o7.c(p91.I);
        this.x = c2;
        this.y = sv2.j(c2);
        Boolean bool = Boolean.FALSE;
        fw4 c3 = o7.c(bool);
        this.z = c3;
        this.A = sv2.j(c3);
        fw4 c4 = o7.c(null);
        this.D = c4;
        this.E = sv2.j(c4);
        mn4 b5 = o7.b(1, 5, null);
        this.F = b5;
        this.G = new n04(b5);
        fw4 c5 = o7.c(bool);
        this.H = c5;
        this.I = sv2.j(c5);
        this.J = ad4.w(null);
        this.K = ad4.w(bool);
        fw4 c6 = o7.c(null);
        this.L = c6;
        this.M = sv2.j(c6);
        fw4 c7 = o7.c(bool);
        this.N = c7;
        this.O = sv2.j(c7);
        fw4 c8 = o7.c(0);
        this.P = c8;
        this.Q = sv2.j(c8);
        fw4 c9 = o7.c(bool);
        this.R = c9;
        this.S = sv2.j(c9);
        byte b6 = 3;
        p70.g0(o7.B(this), null, null, new ut2(this, fj0Var, b), 3);
        p70.g0(o7.B(this), null, null, new ut2(this, fj0Var, b2), 3);
        byte b7 = 2;
        p70.g0(o7.B(this), null, null, new ut2(this, fj0Var, b7), 3);
        if (qj0Var.b == null || qj0Var.c == null || qj0Var.b.isClosed() || !qj0Var.c.isAlive()) {
            try {
                qj0Var.e(false);
                Log.i("CookieServer", "Cookie 服务器启动: ".concat(qj0Var.h()));
            } catch (Exception e) {
                Log.e("CookieServer", "服务器启动失败", e);
            }
        }
        jb5 jb5Var = mb5.Companion;
        Application application2 = this.b;
        jb5Var.getClass();
        boolean a = jb5.a(application2);
        byte b8 = 4;
        if (a) {
            p70.g0(o7.B(this), null, null, new pu1(this, fj0Var, b7), 3);
            p70.g0(o7.B(this), null, null, new pu1(this, fj0Var, b6), 3);
            p70.g0(o7.B(this), null, null, new pu1(this, fj0Var, b8), 3);
        }
        Application application3 = this.b;
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b2), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b7), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b6), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b8), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, b3), 3);
        p70.g0(o7.B(this), null, null, new bu2(this, application3, fj0Var, (byte) 6), 3);
    }

    public static void B(hu2 hu2Var, List list, Aweme aweme, String str, MixPlaylistPagination mixPlaylistPagination, int i) {
        String str2 = (i & 4) != 0 ? null : str;
        boolean z = (i & 8) == 0;
        MixPlaylistPagination mixPlaylistPagination2 = (i & 16) != 0 ? null : mixPlaylistPagination;
        hu2Var.getClass();
        list.getClass();
        aweme.getClass();
        if (((Boolean) ((fw4) hu2Var.h.m0.I).getValue()).booleanValue() && str2 == null && !z) {
            list = o70.h1(list);
        }
        List list2 = list;
        Iterator it = list2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (j42.c(((Aweme) it.next()).getAwemeId(), aweme.getAwemeId())) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
        hu2Var.p.U(list2, valueOf != null ? valueOf.intValue() : 0, "profile", str2, mixPlaylistPagination2);
        hu2Var.q(new h83(new co5("profile")));
        hu2Var.C(aweme);
    }

    public final void A(Aweme aweme, List list, int i) {
        this.p.U(list, i, "search", null, null);
        q(new h83(new co5("search")));
        C(aweme);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [fj0, gl0, tk0] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void C(Aweme aweme) {
        ?? r8;
        aweme.getClass();
        gx3 gx3Var = this.p;
        gx3Var.getClass();
        String awemeId = aweme.getAwemeId();
        fj0 fj0Var = null;
        if (!jx4.L(awemeId)) {
            fl4 fl4Var = gx3Var.b.b;
            SharedPreferences sharedPreferences = fl4Var.a;
            if (!jx4.L(awemeId)) {
                ArrayList arrayList = new ArrayList(fl4Var.s());
                arrayList.remove(awemeId);
                arrayList.add(awemeId);
                List m1 = o70.m1(sharedPreferences.getInt("feed_history_capacity", 100), arrayList);
                sharedPreferences.edit().putString("viewed_video_ids", o70.Z0(m1, ",", null, null, 0, null, 62)).apply();
                fw4 fw4Var = fl4Var.g;
                Set u1 = o70.u1(m1);
                fw4Var.getClass();
                fw4Var.i(null, u1);
            }
        }
        if (!jx4.L(gx3Var.c.g())) {
            String uid = aweme.getAuthor().getUid();
            if (!jx4.L(uid)) {
                p70.g0(o7.B(gx3Var), null, null, new ni((Object) gx3Var, (Object) uid, (Object) awemeId, fj0Var, (byte) 5), 3);
                Object obj = null;
                p70.g0(o7.B(gx3Var), null, null, new ni((Object) gx3Var, (Object) awemeId, (Object) aweme, fj0Var, (byte) 6), 3);
                MixInfo mixInfo = aweme.getMixInfo();
                r8 = obj;
                if (mixInfo != null) {
                    int currentEpisode = mixInfo.getStatis().getCurrentEpisode();
                    r8 = obj;
                    r8 = obj;
                    if (!jx4.L(mixInfo.getMixId()) && currentEpisode > 0) {
                        p70.g0(o7.B(gx3Var), null, null, new fx3(gx3Var, mixInfo, currentEpisode, awemeId, null), 3);
                        r8 = obj;
                    }
                }
                p70.g0(o7.B(this), r8, r8, new gu2((Object) this, (Object) aweme, (fj0) r8, (byte) 0), 3);
            }
        }
        r8 = 0;
        p70.g0(o7.B(this), r8, r8, new gu2((Object) this, (Object) aweme, (fj0) r8, (byte) 0), 3);
    }

    public final boolean D() {
        Object obj;
        fl4 fl4Var = this.d;
        List list = (List) ((fw4) fl4Var.h0.I).getValue();
        if (list.size() < 2) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (j42.c(((dl4) obj).a, fl4Var.i())) {
                    break;
                }
            }
            dl4 dl4Var = (dl4) obj;
            if (dl4Var == null || !dl4Var.b()) {
                return false;
            }
        }
        return true;
    }

    public final void E(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        rv4 rv4Var = this.C;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.C = null;
        fl4 fl4Var = this.h.b;
        String obj = jx4.g0(str4).toString();
        if (jx4.L(obj)) {
            obj = "main";
        }
        String str5 = obj;
        fl4Var.H(jx4.g0(str).toString());
        d32 d = f32.d(str2, str3);
        fl4Var.G(jx4.g0(str2).toString(), d);
        String obj2 = jx4.g0(str).toString();
        String obj3 = jx4.g0(str2).toString();
        String str6 = d.b;
        String str7 = d.c;
        String str8 = d.d;
        String str9 = d.e;
        obj2.getClass();
        obj3.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        ArrayList s1 = o70.s1((Collection) fl4Var.g0.getValue());
        int size = s1.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj4 = s1.get(i2);
            i2++;
            if (j42.c(((dl4) obj4).a, str5)) {
                break;
            } else {
                i++;
            }
        }
        int i3 = i;
        dl4 dl4Var = new dl4(str5, obj2, obj3, str6, str7, str8, null, str9, 448);
        if (i3 >= 0) {
            s1.set(i3, dl4Var);
        } else {
            s1.add(dl4Var);
        }
        fl4Var.A(s1);
        fl4Var.B(str5);
        gx3 gx3Var = this.p;
        gx3Var.r();
        fl4 fl4Var2 = this.d;
        String i4 = fl4Var2.i();
        fw4 fw4Var = this.x;
        Map M = sv2.M(i4, (Map) fw4Var.getValue());
        fw4Var.getClass();
        fw4Var.i(null, M);
        if (jx4.L(fl4Var2.g())) {
            return;
        }
        gx3Var.J();
        p(i4);
    }

    public final void F(ab4 ab4Var) {
        this.L.h(ab4Var);
    }

    public final void G(String str) {
        str.getClass();
        if (this.d.v()) {
            ye4 ye4Var = this.o;
            ye4Var.getClass();
            if (!ye4Var.Z.e(jx4.g0(str).toString())) {
                ye4Var.s();
                w(str);
                return;
            }
            String obj = jx4.g0(str).toString();
            bo boVar = new bo(this, (byte) 6);
            obj.getClass();
            rv4 rv4Var = ye4Var.Y;
            fj0 fj0Var = null;
            if (rv4Var != null) {
                rv4Var.e(null);
            }
            p70.g0(o7.B(ye4Var), null, null, new o1(ye4Var, obj, boVar, fj0Var, (byte) 15), 3);
        }
    }

    public final void H(String str) {
        str.getClass();
        fl4 fl4Var = this.d;
        boolean equals = str.equals(fl4Var.i());
        fw4 fw4Var = this.x;
        gx3 gx3Var = this.p;
        if (equals) {
            Author author = (Author) ((Map) fw4Var.getValue()).get(str);
            if (author != null) {
                if (((fw4) gx3Var.f.I).getValue() == null) {
                    gx3Var.T(author);
                    return;
                }
                return;
            } else {
                if (jx4.L(fl4Var.g()) || ((fw4) gx3Var.f.I).getValue() != null || ((Boolean) ((fw4) gx3Var.s.I).getValue()).booleanValue()) {
                    return;
                }
                gx3Var.t.i(null, Boolean.FALSE);
                gx3Var.J();
                p(str);
                return;
            }
        }
        rv4 rv4Var = this.C;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.C = null;
        fl4Var.K(str);
        gx3Var.r();
        Author author2 = (Author) ((Map) fw4Var.getValue()).get(str);
        if (author2 != null) {
            gx3Var.T(author2);
        } else {
            if (jx4.L(fl4Var.g())) {
                return;
            }
            gx3Var.J();
            p(str);
        }
    }

    public final void I(Author author) {
        author.getClass();
        jt2 jt2Var = new jt2((Object) this, (Object) author, (byte) 3);
        gx3 gx3Var = this.p;
        gx3Var.getClass();
        gx3Var.y();
        int i = gx3Var.A;
        String secUid = author.getSecUid();
        gx3Var.E.i(null, author);
        gx3Var.d.c("works", "profile.currentTab");
        fw4 fw4Var = gx3Var.G;
        o91 o91Var = o91.I;
        fw4Var.i(null, o91Var);
        gx3Var.I = 0L;
        gx3Var.J = true;
        gx3Var.L.i(null, o91Var);
        gx3Var.N = 0L;
        gx3Var.O = true;
        gx3Var.Q.i(null, o91Var);
        gx3Var.S = 0L;
        gx3Var.T = true;
        gx3Var.V.i(null, o91Var);
        gx3Var.X = 0L;
        gx3Var.Y = true;
        gx3Var.C0.i(null, o91Var);
        gx3Var.E0 = 0L;
        gx3Var.F0 = true;
        jt2Var.invoke();
        gx3Var.z = p70.g0(o7.B(gx3Var), null, null, new dq1(gx3Var, secUid, i, null, (byte) 2), 3);
    }

    @Override // defpackage.qr5
    public final void o() {
        qj0 qj0Var = this.r;
        qj0Var.getClass();
        try {
            qj0Var.f();
            Log.i("CookieServer", "Cookie 服务器已停止");
        } catch (Exception e) {
            Log.e("CookieServer", "服务器停止失败", e);
        }
        this.e.a();
    }

    public final void p(String str) {
        rv4 rv4Var = this.C;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.C = p70.g0(o7.B(this), null, null, new xt2(this, str, fj0Var, (byte) 0), 3);
    }

    public final void q(i83 i83Var) {
        if (this.F.b(i83Var)) {
            return;
        }
        p70.g0(o7.B(this), null, null, new r((Object) this, (Object) i83Var, (fj0) null, (byte) 29), 3);
    }

    public final void r(int i, boolean z) {
        MixPlaylistPagination c;
        int nextCursor;
        gx3 gx3Var = this.p;
        tw3 tw3Var = (tw3) o70.b1((List) gx3Var.Z0.getValue());
        if (tw3Var == null || (c = tw3Var.c()) == null || c.getMixId().length() == 0) {
            return;
        }
        if (z || c.getHasMore()) {
            Integer num = (Integer) o70.d1(c.getPages().keySet());
            if (!z || (num != null && num.intValue() > 0)) {
                rv4 rv4Var = gx3Var.d1;
                if (rv4Var == null || !rv4Var.isActive()) {
                    if (z) {
                        nextCursor = 0;
                        int intValue = (num != null ? num.intValue() : 0) - 20;
                        if (intValue >= 0) {
                            nextCursor = intValue;
                        }
                    } else {
                        nextCursor = c.getNextCursor();
                    }
                    gx3Var.d1 = p70.g0(o7.B(gx3Var), null, null, new yw3(gx3Var, c.getMixId(), nextCursor, i, z, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(2:102|(1:(1:(6:106|107|108|109|60|61)(2:110|111))(2:112|113))(5:124|125|59|60|61))(18:10|11|12|13|14|15|16|17|(1:19)(1:95)|20|(1:22)(1:94)|23|(3:27|(1:29)|(1:31))|32|33|34|(5:36|(2:38|(8:40|17|(0)(0)|20|(0)(0)|23|(4:25|27|(0)|(0))|32))|33|34|(9:43|(1:45)(1:75)|(2:66|(2:67|(1:74)(2:69|(2:71|72)(1:73))))(1:49)|50|(1:52)(2:62|(1:64)(1:65))|53|(4:55|56|(1:58)|59)|60|61)(0))(0)|41))(2:127|(1:129)(3:130|131|(11:133|(2:134|(2:136|(2:138|139)(1:149))(2:150|151))|140|(1:142)(1:148)|(1:144)|145|146|147|34|(0)(0)|41)(2:152|(2:154|(2:156|41))(3:157|60|61))))|114|(2:116|(1:118)(1:122))(1:123)|119|120))|7|(0)(0)|114|(0)(0)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025c, code lost:
    
        if (r1 != r4) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:112:0x004e, B:114:0x0229, B:116:0x022f, B:118:0x0233, B:122:0x0237, B:123:0x023d, B:47:0x016e, B:50:0x0190, B:52:0x019d, B:53:0x01b0, B:62:0x01a1, B:64:0x01a7, B:65:0x01ab, B:66:0x0175, B:67:0x0179, B:69:0x017f, B:72:0x018d, B:81:0x01ec, B:83:0x020e, B:84:0x01f2, B:85:0x01f6, B:87:0x01fc, B:91:0x020b, B:131:0x00a7, B:133:0x00bd, B:134:0x00c6, B:136:0x00cc, B:140:0x00dd, B:142:0x00e1, B:145:0x00e9, B:152:0x020f, B:154:0x021b, B:157:0x0265), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023d A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:112:0x004e, B:114:0x0229, B:116:0x022f, B:118:0x0233, B:122:0x0237, B:123:0x023d, B:47:0x016e, B:50:0x0190, B:52:0x019d, B:53:0x01b0, B:62:0x01a1, B:64:0x01a7, B:65:0x01ab, B:66:0x0175, B:67:0x0179, B:69:0x017f, B:72:0x018d, B:81:0x01ec, B:83:0x020e, B:84:0x01f2, B:85:0x01f6, B:87:0x01fc, B:91:0x020b, B:131:0x00a7, B:133:0x00bd, B:134:0x00c6, B:136:0x00cc, B:140:0x00dd, B:142:0x00e1, B:145:0x00e9, B:152:0x020f, B:154:0x021b, B:157:0x0265), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:15:0x007c, B:17:0x012d, B:20:0x0134, B:22:0x0138, B:23:0x0142, B:25:0x014a, B:27:0x014e, B:31:0x0155), top: B:14:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0155 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #1 {all -> 0x0087, blocks: (B:15:0x007c, B:17:0x012d, B:20:0x0134, B:22:0x0138, B:23:0x0142, B:25:0x014a, B:27:0x014e, B:31:0x0155), top: B:14:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd A[Catch: all -> 0x015d, TryCatch #5 {all -> 0x015d, blocks: (B:34:0x00f7, B:36:0x00fd, B:38:0x010d, B:147:0x00ee), top: B:146:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #3 {all -> 0x0059, blocks: (B:112:0x004e, B:114:0x0229, B:116:0x022f, B:118:0x0233, B:122:0x0237, B:123:0x023d, B:47:0x016e, B:50:0x0190, B:52:0x019d, B:53:0x01b0, B:62:0x01a1, B:64:0x01a7, B:65:0x01ab, B:66:0x0175, B:67:0x0179, B:69:0x017f, B:72:0x018d, B:81:0x01ec, B:83:0x020e, B:84:0x01f2, B:85:0x01f6, B:87:0x01fc, B:91:0x020b, B:131:0x00a7, B:133:0x00bd, B:134:0x00c6, B:136:0x00cc, B:140:0x00dd, B:142:0x00e1, B:145:0x00e9, B:152:0x020f, B:154:0x021b, B:157:0x0265), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:112:0x004e, B:114:0x0229, B:116:0x022f, B:118:0x0233, B:122:0x0237, B:123:0x023d, B:47:0x016e, B:50:0x0190, B:52:0x019d, B:53:0x01b0, B:62:0x01a1, B:64:0x01a7, B:65:0x01ab, B:66:0x0175, B:67:0x0179, B:69:0x017f, B:72:0x018d, B:81:0x01ec, B:83:0x020e, B:84:0x01f2, B:85:0x01f6, B:87:0x01fc, B:91:0x020b, B:131:0x00a7, B:133:0x00bd, B:134:0x00c6, B:136:0x00cc, B:140:0x00dd, B:142:0x00e1, B:145:0x00e9, B:152:0x020f, B:154:0x021b, B:157:0x0265), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020e A[EDGE_INSN: B:92:0x020e->B:83:0x020e BREAK  A[LOOP:1: B:85:0x01f6->B:89:0x020a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010b -> B:33:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x012b -> B:17:0x012d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.gj0 r21) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu2.s(gj0):java.lang.Object");
    }

    public final boolean t() {
        fw4 fw4Var = this.p.Z0;
        List list = (List) fw4Var.getValue();
        if (list.size() <= 1) {
            return false;
        }
        fw4Var.i(null, o70.R0(list));
        return true;
    }

    public final void u() {
        gx3 gx3Var = this.p;
        if (((tw3) o70.b1((List) gx3Var.Z0.getValue())) != null) {
            gx3Var.q();
            q(g83.a);
        } else if (((fw4) gx3Var.c1.I).getValue() != null) {
            gx3Var.q();
        }
    }

    public final void v(ab4 ab4Var) {
        ab4Var.getClass();
        if (ab4Var == ab4.Q) {
            q(new h83(mw2.W(ab4Var), false));
        } else if (mw2.J(ab4Var)) {
            q(new h83(mw2.W(ab4Var), true));
        }
    }

    public final void w(String str) {
        str.getClass();
        if (this.d.v()) {
            q(new h83(new ed4(str)));
        }
    }

    public final void x(MixInfo mixInfo) {
        jt2 jt2Var = new jt2((Object) this, (Object) mixInfo, (byte) 4);
        gx3 gx3Var = this.p;
        gx3Var.getClass();
        gx3Var.H0.i(null, mixInfo);
        gx3Var.J0.i(null, o91.I);
        gx3Var.N0.i(null, p91.I);
        gx3Var.P0 = 0L;
        gx3Var.Q0 = true;
        gx3Var.R0 = false;
        jt2Var.invoke();
        gx3.D(gx3Var, false, 3);
    }

    public final void y() {
        this.p.d.c(((Boolean) ((fw4) this.h.m.I).getValue()).booleanValue() ? "history" : "works", "profile.currentTab");
        q(new h83(mw2.W(ab4.P), true));
    }

    public final void z() {
        Boolean bool = Boolean.TRUE;
        this.K.setValue(bool);
        fw4 fw4Var = this.N;
        fw4Var.getClass();
        fw4Var.i(null, bool);
    }
}
