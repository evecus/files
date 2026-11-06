package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.CameraInfo;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.ResolvedLiveStream;
import com.github.mytv.dv.model.StreamUrl;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class np2 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ String J;
    public final /* synthetic */ ho2 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ op2 M;
    public final /* synthetic */ LiveRoom N;
    public final /* synthetic */ String O;
    public final /* synthetic */ long P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ lq5 R;
    public final /* synthetic */ r24 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(String str, ho2 ho2Var, int i, op2 op2Var, LiveRoom liveRoom, String str2, long j, long j2, lq5 lq5Var, r24 r24Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = str;
        this.K = ho2Var;
        this.L = i;
        this.M = op2Var;
        this.N = liveRoom;
        this.O = str2;
        this.P = j;
        this.Q = j2;
        this.R = lq5Var;
        this.S = r24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new np2(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((np2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object r;
        Object obj2;
        StreamUrl streamInfo;
        long j;
        rv4 rv4Var;
        Object obj3;
        boolean z = this.I;
        ho2 ho2Var = this.K;
        String str = this.J;
        String str2 = this.O;
        r24 r24Var = this.S;
        long j2 = this.Q;
        op2 op2Var = this.M;
        try {
            if (!z) {
                mu0.V(obj);
                Log.i("LiveViewModel", "重新拉取直播间地址: roomId=" + str + ", reason=" + ho2Var + ", attempt=" + this.L);
                LiveRoom liveRoom = this.N;
                this.I = true;
                r = op2Var.r(liveRoom, str2, this);
                el0 el0Var = el0.I;
                if (r == el0Var) {
                    return el0Var;
                }
            } else {
                if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                r = obj;
            }
            LiveRoom liveRoom2 = (LiveRoom) r;
            boolean t = this.M.t(this.J, this.P, this.Q, this.R, this.O);
            wd5 wd5Var = wd5.a;
            if (!t) {
                if ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) {
                    if (rv4Var == obj3) {
                        return wd5Var;
                    }
                }
                return wd5Var;
            }
            List<CameraInfo> allCameraInfos = liveRoom2 != null ? liveRoom2.getAllCameraInfos() : null;
            if (allCameraInfos == null) {
                allCameraInfos = o91.I;
            }
            if (str2 == null) {
                if (liveRoom2 != null) {
                    streamInfo = liveRoom2.getStreamUrl();
                }
                streamInfo = null;
            } else {
                Iterator<T> it = allCameraInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (j42.c(((CameraInfo) obj2).getCameraIdStr(), str2)) {
                        break;
                    }
                }
                CameraInfo cameraInfo = (CameraInfo) obj2;
                if (cameraInfo != null) {
                    streamInfo = cameraInfo.getStreamInfo();
                }
                streamInfo = null;
            }
            ResolvedLiveStream resolveLiveStreamForQuality = streamInfo != null ? DataModelKt.resolveLiveStreamForQuality(streamInfo, this.R) : null;
            List<String> urls = resolveLiveStreamForQuality != null ? resolveLiveStreamForQuality.getUrls() : null;
            if (urls == null || urls.isEmpty()) {
                Log.w("LiveViewModel", "重新拉取直播间地址失败: roomId=" + str + ", reason=" + ho2Var + ", cameraId=" + str2);
                if (op2Var.Y != j2 || op2Var.S != r24Var.I) {
                    return wd5Var;
                }
                op2Var.S = null;
                op2Var.T = null;
                return wd5Var;
            }
            if (!this.M.t(this.J, this.P, this.Q, this.R, this.O)) {
                if (op2Var.Y != j2 || op2Var.S != r24Var.I) {
                    return wd5Var;
                }
                op2Var.S = null;
                op2Var.T = null;
                return wd5Var;
            }
            if (str2 != null) {
                Iterator<CameraInfo> it2 = allCameraInfos.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (j42.c(it2.next().getCameraIdStr(), str2)) {
                        break;
                    }
                    i++;
                }
                if (i < 0) {
                    if (op2Var.Y != j2 || op2Var.S != r24Var.I) {
                        return wd5Var;
                    }
                    op2Var.S = null;
                    op2Var.T = null;
                    return wd5Var;
                }
                fw4 fw4Var = op2Var.E;
                fw4Var.getClass();
                fw4Var.i(null, allCameraInfos);
                fw4 fw4Var2 = op2Var.G;
                Integer num = new Integer(i);
                fw4Var2.getClass();
                fw4Var2.i(null, num);
                fw4 fw4Var3 = op2Var.J;
                resolveLiveStreamForQuality.getClass();
                fw4Var3.h(resolveLiveStreamForQuality.getUrls());
            }
            fw4 fw4Var4 = op2Var.L;
            resolveLiveStreamForQuality.getClass();
            String qualityName = resolveLiveStreamForQuality.getQualityName();
            if (jx4.L(qualityName)) {
                qualityName = "默认";
            }
            fw4Var4.getClass();
            fw4Var4.i(null, qualityName);
            op2Var.O.h(resolveLiveStreamForQuality.getUrls());
            fw4 fw4Var5 = op2Var.Q;
            fw4Var5.i(null, new Integer(((Number) fw4Var5.getValue()).intValue() + 1));
            if (op2Var.Y != j2 || op2Var.S != r24Var.I) {
                return wd5Var;
            }
            op2Var.S = null;
            op2Var.T = null;
            return wd5Var;
        } finally {
            if (op2Var.Y == j2 && op2Var.S == r24Var.I) {
                op2Var.S = null;
                op2Var.T = 0 == true ? 1 : 0;
            }
        }
    }
}
