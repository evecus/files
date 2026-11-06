package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.LiveDanmakuMessage;
import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.ResolvedLiveStream;
import com.github.mytv.dv.model.StreamUrl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class op2 extends qr5 {
    public static final kp2 Companion = new kp2();
    public final p04 A;
    public final fw4 B;
    public final fw4 C;
    public final p04 D;
    public final fw4 E;
    public final p04 F;
    public final fw4 G;
    public final p04 H;
    public String I;
    public final fw4 J;
    public final p04 K;
    public final fw4 L;
    public final fw4 M;
    public final p04 N;
    public final fw4 O;
    public final p04 P;
    public final fw4 Q;
    public final p04 R;
    public rv4 S;
    public ho2 T;
    public int U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public rv4 Z;
    public long a0;
    public final kq5 b;
    public final fl4 c;
    public final n11 d;
    public final List e = p70.k0(new go2("follow", "关注", "", "", "favorite"), new go2("recommend", "推荐", "", "", "recommend"), new go2("chat", "聊天", "101", "4", "chat"), new go2("music", "音乐", "102", "4", "music"), new go2("game", "游戏", "103", "4", "game"), new go2("anime", "二次元", "104", "4", "anime"), new go2("dance", "舞蹈", "105", "4", "dance"), new go2("culture", "文化", "106", "4", "culture"), new go2("life", "生活", "107", "4", "life"), new go2("sports", "运动", "108", "4", "sports"));
    public final fw4 f;
    public final p04 g;
    public boolean h;
    public final fw4 i;
    public final p04 j;
    public final fw4 k;
    public final p04 l;
    public final fw4 m;
    public final p04 n;
    public final fw4 o;
    public final p04 p;
    public final fw4 q;
    public final fw4 r;
    public final p04 s;
    public final fw4 t;
    public final p04 u;
    public final p04 v;
    public final cq2 w;
    public final fw4 x;
    public final p04 y;
    public final fw4 z;

    public op2(Application application, kq5 kq5Var, fl4 fl4Var, no4 no4Var, n11 n11Var) {
        this.b = kq5Var;
        this.c = fl4Var;
        this.d = n11Var;
        fw4 c = o7.c(0);
        this.f = c;
        this.g = sv2.j(c);
        fw4 c2 = o7.c(p91.I);
        this.i = c2;
        this.j = sv2.j(c2);
        fj0 fj0Var = null;
        fw4 c3 = o7.c(null);
        this.k = c3;
        this.l = sv2.j(c3);
        fw4 c4 = o7.c(0);
        this.m = c4;
        this.n = sv2.j(c4);
        Boolean bool = Boolean.FALSE;
        fw4 c5 = o7.c(bool);
        this.o = c5;
        this.p = sv2.j(c5);
        this.q = o7.c(null);
        fw4 c6 = o7.c(bool);
        this.r = c6;
        this.s = sv2.j(c6);
        o91 o91Var = o91.I;
        fw4 c7 = o7.c(o91Var);
        this.t = c7;
        this.u = sv2.j(c7);
        this.v = sv2.j(o7.c(bool));
        this.w = new cq2(o7.B(this), no4Var, n11Var);
        fw4 c8 = o7.c(o91Var);
        this.x = c8;
        this.y = sv2.j(c8);
        fw4 c9 = o7.c(u());
        this.z = c9;
        this.A = sv2.j(c9);
        this.B = o7.c(bool);
        fw4 c10 = o7.c(bool);
        this.C = c10;
        this.D = sv2.j(c10);
        fw4 c11 = o7.c(o91Var);
        this.E = c11;
        this.F = sv2.j(c11);
        fw4 c12 = o7.c(-1);
        this.G = c12;
        this.H = sv2.j(c12);
        fw4 c13 = o7.c(null);
        this.J = c13;
        this.K = sv2.j(c13);
        this.L = o7.c("默认");
        fw4 c14 = o7.c(null);
        this.M = c14;
        this.N = sv2.j(c14);
        fw4 c15 = o7.c(null);
        this.O = c15;
        this.P = sv2.j(c15);
        fw4 c16 = o7.c(0);
        this.Q = c16;
        this.R = sv2.j(c16);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 6), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 7), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 8), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 9), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 10), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 11), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 12), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 13), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 14), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 0), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 1), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 2), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 3), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 4), 3);
        p70.g0(o7.B(this), null, null, new jp2(this, fj0Var, (byte) 5), 3);
    }

    public static ArrayList x(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!jx4.L(((LiveRoom) obj).getResolvedRoomId())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (hashSet.add(((LiveRoom) obj2).getResolvedRoomId())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() != list.size()) {
            Log.w("LiveViewModel", "Filtered " + (list.size() - arrayList2.size()) + " live rooms with blank or duplicate IDs");
        }
        return arrayList2;
    }

    public final void A(String str, ho2 ho2Var) {
        String str2;
        str.getClass();
        LiveRoom liveRoom = (LiveRoom) this.k.getValue();
        if (liveRoom == null || jx4.L(str) || !j42.c(liveRoom.getResolvedRoomId(), str)) {
            return;
        }
        ho2 ho2Var2 = ho2.I;
        boolean z = ho2Var == ho2Var2;
        if (((Number) this.G.getValue()).intValue() >= 0 && ((str2 = this.I) == null || jx4.L(str2))) {
            Log.w("LiveViewModel", "当前机位缺少稳定 ID，无法重新拉取: roomId=" + str + ", reason=" + ho2Var);
            return;
        }
        rv4 rv4Var = this.S;
        if (rv4Var != null && rv4Var.isActive()) {
            if (!z || this.T == ho2Var2) {
                return;
            }
            this.Y++;
            rv4 rv4Var2 = this.S;
            if (rv4Var2 != null) {
                rv4Var2.e(null);
            }
            this.S = null;
            this.T = null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            this.U = 0;
            this.V = 0L;
            this.W = 0L;
        } else {
            long j = this.V;
            if (j == 0 || elapsedRealtime - j >= 60000) {
                this.V = elapsedRealtime;
                this.U = 0;
            }
            long j2 = this.W;
            if (j2 != 0 && elapsedRealtime - j2 < 30000) {
                Log.w("LiveViewModel", "播放恢复仍在冷却: roomId=" + str + ", reason=" + ho2Var);
                return;
            }
            int i = this.U;
            if (i >= 3) {
                Log.w("LiveViewModel", "播放恢复重试次数已用尽: roomId=" + str + ", reason=" + ho2Var);
                return;
            }
            this.U = i + 1;
            this.W = elapsedRealtime;
        }
        long j3 = this.X;
        lq5 lq5Var = (lq5) ((fw4) this.c.p.I).getValue();
        boolean z2 = z;
        String str3 = this.I;
        long j4 = this.Y + 1;
        this.Y = j4;
        int i2 = z2 ? 0 : this.U;
        this.T = ho2Var;
        r24 r24Var = new r24();
        rv4 g0 = p70.g0(o7.B(this), null, gl0.J, new np2(str, ho2Var, i2, this, liveRoom, str3, j3, j4, lq5Var, r24Var, null), 1);
        r24Var.I = g0;
        this.S = g0;
        g0.start();
    }

    public final void B() {
        this.X++;
        this.Y++;
        rv4 rv4Var = this.S;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.S = null;
        this.T = null;
        this.U = 0;
        this.V = 0L;
        this.W = 0L;
        this.O.h(null);
    }

    public final void C(int i) {
        if (i >= 0) {
            List list = this.e;
            if (i >= list.size()) {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            fw4 fw4Var = this.f;
            fw4Var.getClass();
            fw4Var.i(null, valueOf);
            String str = ((go2) list.get(i)).a;
            if (!str.equals("follow") || this.h) {
                return;
            }
            this.h = true;
            v(str);
        }
    }

    public final void D(LiveRoom liveRoom, int i) {
        String str;
        ResolvedLiveStream resolveLiveStreamForQuality;
        String qualityName;
        int i2;
        Object obj;
        ResolvedLiveStream resolveLiveStreamForQuality2;
        B();
        rv4 rv4Var = this.Z;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.a0++;
        fw4 fw4Var = this.E;
        fw4Var.getClass();
        o91 o91Var = o91.I;
        fw4Var.i(null, o91Var);
        fw4 fw4Var2 = this.G;
        fw4Var2.getClass();
        fw4Var2.i(null, -1);
        this.I = null;
        this.J.h(null);
        this.M.h(jx4.L(liveRoom.getWebRid()) ? null : o91Var);
        StreamUrl streamUrl = liveRoom.getStreamUrl();
        fl4 fl4Var = this.c;
        String str2 = "默认";
        if (streamUrl == null || (resolveLiveStreamForQuality2 = DataModelKt.resolveLiveStreamForQuality(streamUrl, (lq5) ((fw4) fl4Var.p.I).getValue())) == null || (str = resolveLiveStreamForQuality2.getQualityName()) == null || jx4.L(str)) {
            str = "默认";
        }
        fw4 fw4Var3 = this.L;
        fw4Var3.getClass();
        fw4Var3.i(null, str);
        fw4 fw4Var4 = this.t;
        List list = (List) fw4Var4.getValue();
        boolean r = nt3.r(list);
        fw4 fw4Var5 = this.x;
        fw4 fw4Var6 = this.r;
        fw4 fw4Var7 = this.m;
        fw4 fw4Var8 = this.k;
        if (!r || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (j42.c(((LiveRoom) it.next()).getResolvedRoomId(), liveRoom.getResolvedRoomId())) {
                    break;
                }
            }
        }
        for (Map.Entry entry : ((Map) this.i.getValue()).entrySet()) {
            String str3 = (String) entry.getKey();
            dn2 dn2Var = (dn2) entry.getValue();
            Iterator it2 = dn2Var.b().iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else if (j42.c(((LiveRoom) it2.next()).getResolvedRoomId(), liveRoom.getResolvedRoomId())) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 >= 0) {
                Iterator it3 = this.e.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (((go2) it3.next()).a.equals(str3)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    Integer valueOf = Integer.valueOf(i2);
                    fw4 fw4Var9 = this.f;
                    fw4Var9.getClass();
                    obj = null;
                    fw4Var9.i(null, valueOf);
                } else {
                    obj = null;
                }
                fw4Var4.h(dn2Var.b());
                fw4Var8.getClass();
                fw4Var8.i(obj, liveRoom);
                Integer valueOf2 = Integer.valueOf(i4);
                fw4Var7.getClass();
                fw4Var7.i(obj, valueOf2);
                Boolean bool = Boolean.FALSE;
                fw4Var6.getClass();
                fw4Var6.i(obj, bool);
                fw4Var5.getClass();
                fw4Var5.i(obj, o91Var);
                String resolvedRoomId = liveRoom.getResolvedRoomId();
                if (resolvedRoomId.length() > 0) {
                    p(resolvedRoomId);
                }
                q(liveRoom);
                return;
            }
        }
        fw4Var8.getClass();
        fw4Var8.i(null, liveRoom);
        Integer valueOf3 = Integer.valueOf(i);
        fw4Var7.getClass();
        fw4Var7.i(null, valueOf3);
        Boolean bool2 = Boolean.FALSE;
        fw4Var6.getClass();
        fw4Var6.i(null, bool2);
        fw4Var5.getClass();
        fw4Var5.i(null, o91Var);
        StreamUrl streamUrl2 = liveRoom.getStreamUrl();
        if (streamUrl2 != null && (resolveLiveStreamForQuality = DataModelKt.resolveLiveStreamForQuality(streamUrl2, (lq5) ((fw4) fl4Var.p.I).getValue())) != null && (qualityName = resolveLiveStreamForQuality.getQualityName()) != null && !jx4.L(qualityName)) {
            str2 = qualityName;
        }
        fw4Var3.getClass();
        fw4Var3.i(null, str2);
        String resolvedRoomId2 = liveRoom.getResolvedRoomId();
        if (resolvedRoomId2.length() > 0) {
            p(resolvedRoomId2);
        }
        q(liveRoom);
    }

    public final void E() {
        this.h = false;
        Boolean bool = Boolean.TRUE;
        fw4 fw4Var = this.r;
        fw4Var.getClass();
        fw4Var.i(null, bool);
        go2 go2Var = (go2) o70.V0(((Number) this.f.getValue()).intValue(), this.e);
        String str = go2Var != null ? go2Var.a : null;
        if (j42.c(str, "follow")) {
            this.h = true;
            v(str);
        }
    }

    public final void F() {
        LiveDanmakuSettings u = u();
        fw4 fw4Var = this.z;
        fw4Var.getClass();
        fw4Var.i(null, u);
        Boolean bool = Boolean.TRUE;
        fw4 fw4Var2 = this.C;
        fw4Var2.getClass();
        fw4Var2.i(null, bool);
    }

    @Override // defpackage.qr5
    public final void o() {
        cq2 cq2Var = this.w;
        rv4 rv4Var = cq2Var.f;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        cq2Var.f = null;
        cq2Var.l = 0;
        rv4 rv4Var2 = cq2Var.e;
        if (rv4Var2 != null) {
            rv4Var2.e(null);
        }
        cq2Var.j = null;
        cq2Var.i = null;
        cq2Var.b(qp2.K);
        cq2Var.d.dispatcher().executorService().shutdown();
    }

    public final void p(String str) {
        str.getClass();
        p70.g0(o7.B(this), null, null, new k(this, str, null, (byte) 9), 3);
    }

    public final void q(LiveRoom liveRoom) {
        String webRid = liveRoom.getWebRid();
        String str = !jx4.L(webRid) ? webRid : null;
        if (str == null) {
            Log.w("LiveViewModel", "fetchCameraInfosForRoom: webRid is blank, skipping");
            return;
        }
        rv4 rv4Var = this.Z;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        long j = this.a0 + 1;
        this.a0 = j;
        this.Z = p70.g0(o7.B(this), null, null, new ci0(this, str, j, str, liveRoom, (lq5) ((fw4) this.c.p.I).getValue(), null, (byte) 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        if (r6 == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d4, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005f, code lost:
    
        if (r9 == r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.github.mytv.dv.model.LiveRoom r7, java.lang.String r8, defpackage.gj0 r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op2.r(com.github.mytv.dv.model.LiveRoom, java.lang.String, gj0):java.lang.Object");
    }

    public final void s() {
        if (((Boolean) this.o.getValue()).booleanValue()) {
            return;
        }
        p70.g0(o7.B(this), null, null, new h40((Object) this, (fj0) null, (byte) 13), 3);
    }

    public final boolean t(String str, long j, long j2, lq5 lq5Var, String str2) {
        LiveRoom liveRoom = (LiveRoom) this.k.getValue();
        return j42.c(liveRoom != null ? liveRoom.getResolvedRoomId() : null, str) && this.X == j && this.Y == j2 && ((fw4) this.c.p.I).getValue() == lq5Var && j42.c(this.I, str2);
    }

    public final LiveDanmakuSettings u() {
        fl4 fl4Var = this.c;
        SharedPreferences sharedPreferences = fl4Var.a;
        SharedPreferences sharedPreferences2 = fl4Var.a;
        return new LiveDanmakuSettings(sharedPreferences.contains("live_danmaku_enabled") ? sharedPreferences.getBoolean("live_danmaku_enabled", true) : sharedPreferences.getBoolean("danmaku_enabled", true), false, fl4Var.n(), sharedPreferences2.getFloat("danmaku_speed", 1.0f), sharedPreferences2.getFloat("danmaku_font_size", 1.0f), ut0.q(sharedPreferences2.getFloat("danmaku_opacity", 1.0f), 0.01f, 1.0f), fl4Var.j(), ut0.q(sharedPreferences2.getFloat("danmaku_vertical_spacing", 1.0f), 0.5f, 2.0f), ut0.q(sharedPreferences2.getFloat("danmaku_horizontal_spacing", 1.0f), 0.5f, 2.0f), ((Boolean) fl4Var.k0.getValue()).booleanValue(), ((Boolean) fl4Var.a0.getValue()).booleanValue(), (List) fl4Var.c0.getValue(), 2, null);
    }

    public final void v(String str) {
        p70.g0(o7.B(this), null, null, new jd(this, str, null, (byte) 3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r18, defpackage.gj0 r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op2.w(java.lang.String, gj0):java.lang.Object");
    }

    public final void y() {
        LiveDanmakuSettings liveDanmakuSettings = (LiveDanmakuSettings) this.z.getValue();
        if (!liveDanmakuSettings.getBlockEnabled() || liveDanmakuSettings.getBlockWords().isEmpty()) {
            return;
        }
        fw4 fw4Var = this.x;
        Iterable iterable = (Iterable) fw4Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            LiveDanmakuMessage liveDanmakuMessage = (LiveDanmakuMessage) obj;
            List<String> blockWords = liveDanmakuSettings.getBlockWords();
            if (blockWords == null || !blockWords.isEmpty()) {
                Iterator<T> it = blockWords.iterator();
                while (it.hasNext()) {
                    if (jx4.D(liveDanmakuMessage.getContent(), (String) it.next(), true)) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        if (arrayList.size() != ((List) fw4Var.getValue()).size()) {
            fw4Var.getClass();
            fw4Var.i(null, arrayList);
        }
    }

    public final void z() {
        go2 go2Var = (go2) o70.V0(((Number) this.f.getValue()).intValue(), this.e);
        if (go2Var != null) {
            v(go2Var.a);
        }
    }
}
