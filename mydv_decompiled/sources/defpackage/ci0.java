package defpackage;

import com.github.mytv.dv.model.CameraInfo;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.EpisodeExtra;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.LiveRoomEnterData;
import com.github.mytv.dv.model.LiveRoomEnterResponse;
import com.github.mytv.dv.model.ResolvedLiveStream;
import com.github.mytv.dv.model.StreamUrl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ci0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ long K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci0(Object obj, String str, long j, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = str;
        this.K = j;
        this.N = obj2;
        this.O = obj3;
        this.P = obj4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        switch (b) {
            case 0:
                ci0 ci0Var = new ci0((bf5) obj5, (ei0) obj4, (oy) obj3, this.K, (v52) obj2, fj0Var);
                ci0Var.L = obj;
                return ci0Var;
            case 1:
                return new ci0((op2) this.L, (String) obj5, this.K, (String) obj4, (LiveRoom) obj3, (lq5) obj2, fj0Var, (byte) 1);
            default:
                return new ci0((wn3) this.L, (String) obj5, this.K, (d65) obj4, (u45) obj3, (td3) obj2, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((ci0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object p;
        ResolvedLiveStream resolveLiveStreamForQuality;
        ResolvedLiveStream resolveLiveStreamForQuality2;
        ResolvedLiveStream resolveLiveStreamForQuality3;
        String qualityName;
        LiveRoomEnterData data;
        List<LiveRoom> data2;
        Object obj2;
        String str;
        byte b = this.I;
        long j = this.K;
        Object obj3 = this.N;
        el0 el0Var = el0.I;
        Object obj4 = this.O;
        Object obj5 = this.M;
        Object obj6 = this.P;
        wd5 wd5Var = wd5.a;
        rv4 rv4Var = null;
        switch (b) {
            case 0:
                oy oyVar = (oy) obj4;
                ei0 ei0Var = (ei0) obj3;
                bf5 bf5Var = (bf5) obj5;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    mc4 mc4Var = (mc4) this.L;
                    bf5Var.e = ei0Var.j0(oyVar, j);
                    m6 m6Var = new m6(ei0Var, bf5Var, (v52) obj6, mc4Var);
                    yj yjVar = new yj((Object) ei0Var, (Object) bf5Var, (Object) oyVar, (byte) 5);
                    this.J = true;
                    if (bf5Var.a(m6Var, yjVar, this) == el0Var) {
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                break;
            case 1:
                LiveRoom liveRoom = (LiveRoom) obj4;
                lq5 lq5Var = (lq5) obj6;
                op2 op2Var = (op2) this.L;
                fw4 fw4Var = op2Var.M;
                fw4 fw4Var2 = op2Var.k;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    this.J = true;
                    p = op2Var.d.p((String) obj5, this);
                    if (p == el0Var) {
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    p = ((h54) obj).I;
                }
                if (p instanceof g54) {
                    p = null;
                }
                LiveRoomEnterResponse liveRoomEnterResponse = (LiveRoomEnterResponse) p;
                LiveRoom liveRoom2 = (liveRoomEnterResponse == null || (data = liveRoomEnterResponse.getData()) == null || (data2 = data.getData()) == null) ? null : (LiveRoom) o70.U0(data2);
                if (j == op2Var.a0) {
                    String str2 = (String) obj3;
                    LiveRoom liveRoom3 = (LiveRoom) fw4Var2.getValue();
                    if (str2.equals(liveRoom3 != null ? liveRoom3.getWebRid() : null)) {
                        LiveRoom liveRoom4 = (LiveRoom) fw4Var2.getValue();
                        if (j42.c(liveRoom4 != null ? liveRoom4.getResolvedRoomId() : null, liveRoom.getResolvedRoomId()) && lq5Var == ((fw4) op2Var.c.p.I).getValue()) {
                            List<String> list = o91.I;
                            if (liveRoom2 != null) {
                                LiveRoom liveRoom5 = (LiveRoom) fw4Var2.getValue();
                                if (liveRoom5 != null) {
                                    StreamUrl streamUrl = liveRoom2.getStreamUrl();
                                    if (streamUrl == null) {
                                        streamUrl = liveRoom5.getStreamUrl();
                                    }
                                    StreamUrl streamUrl2 = streamUrl;
                                    List<CameraInfo> cameraInfos = liveRoom2.getCameraInfos();
                                    if (cameraInfos == null) {
                                        cameraInfos = liveRoom5.getCameraInfos();
                                    }
                                    List<CameraInfo> list2 = cameraInfos;
                                    EpisodeExtra episodeExtra = liveRoom2.getEpisodeExtra();
                                    if (episodeExtra == null) {
                                        episodeExtra = liveRoom5.getEpisodeExtra();
                                    }
                                    LiveRoom copy$default = LiveRoom.copy$default(liveRoom5, null, null, null, null, null, null, null, null, null, streamUrl2, 0, list2, episodeExtra, 1535, null);
                                    fw4Var2.h(copy$default);
                                    fw4 fw4Var3 = op2Var.t;
                                    Iterable<LiveRoom> iterable = (Iterable) fw4Var3.getValue();
                                    ArrayList arrayList = new ArrayList(p70.J(iterable, 10));
                                    for (LiveRoom liveRoom6 : iterable) {
                                        if (j42.c(liveRoom6.getResolvedRoomId(), liveRoom.getResolvedRoomId())) {
                                            liveRoom6 = copy$default;
                                        }
                                        arrayList.add(liveRoom6);
                                    }
                                    fw4Var3.getClass();
                                    fw4Var3.i(null, arrayList);
                                    op2Var.E.h(liveRoom2.getAllCameraInfos());
                                    fw4 fw4Var4 = op2Var.L;
                                    StreamUrl streamUrl3 = copy$default.getStreamUrl();
                                    String str3 = "默认";
                                    if (streamUrl3 != null && (resolveLiveStreamForQuality3 = DataModelKt.resolveLiveStreamForQuality(streamUrl3, lq5Var)) != null && (qualityName = resolveLiveStreamForQuality3.getQualityName()) != null && !jx4.L(qualityName)) {
                                        str3 = qualityName;
                                    }
                                    fw4Var4.getClass();
                                    fw4Var4.i(null, str3);
                                    StreamUrl streamUrl4 = copy$default.getStreamUrl();
                                    List<String> urls = (streamUrl4 == null || (resolveLiveStreamForQuality2 = DataModelKt.resolveLiveStreamForQuality(streamUrl4, lq5Var)) == null) ? null : resolveLiveStreamForQuality2.getUrls();
                                    if (urls != null) {
                                        list = urls;
                                    }
                                    fw4Var.getClass();
                                    fw4Var.i(null, list);
                                    rv4Var = null;
                                }
                                break;
                            } else {
                                StreamUrl streamUrl5 = liveRoom.getStreamUrl();
                                List<String> urls2 = (streamUrl5 == null || (resolveLiveStreamForQuality = DataModelKt.resolveLiveStreamForQuality(streamUrl5, lq5Var)) == null) ? null : resolveLiveStreamForQuality.getUrls();
                                if (urls2 != null) {
                                    list = urls2;
                                }
                                fw4Var.getClass();
                                rv4Var = null;
                                fw4Var.i(null, list);
                            }
                        }
                    }
                }
                if (j == op2Var.a0) {
                    op2Var.Z = rv4Var;
                }
                break;
            default:
                td3 td3Var = (td3) obj6;
                String str4 = (String) obj5;
                u45 u45Var = (u45) obj4;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    wn3 wn3Var = (wn3) this.L;
                    this.J = true;
                    co3 co3Var = (co3) wn3Var;
                    co3Var.getClass();
                    if (str4.length() != 0) {
                        long j2 = this.K;
                        if (!d65.c(j2)) {
                            str = str4;
                            obj2 = p70.D0(co3Var.a, new ao3(co3Var, new bo3(j2, null, co3Var, str4), null), this);
                            if (obj2 == el0Var) {
                            }
                        }
                    }
                    obj2 = null;
                    str = str4;
                    if (obj2 == el0Var) {
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    obj2 = obj;
                    str = str4;
                }
                d65 d65Var = (d65) obj2;
                if (d65Var != null) {
                    long j3 = d65Var.a;
                    long c = ui4.c(td3Var.c((int) (j3 >> 32)), td3Var.c((int) (j3 & 4294967295L)));
                    if (!d65.a(c, (d65) obj3) && j42.c(u45Var.l().a.J, str) && td3Var == u45Var.b) {
                        u45Var.c.invoke(u45.b(u45Var.l().a, c));
                        u45Var.v = new d65(c);
                    }
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(bf5 bf5Var, ei0 ei0Var, oy oyVar, long j, v52 v52Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.M = bf5Var;
        this.N = ei0Var;
        this.O = oyVar;
        this.K = j;
        this.P = v52Var;
    }
}
