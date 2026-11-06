package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.CameraInfo;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.LiveDanmakuSettings;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.ResolvedLiveStream;
import com.github.mytv.dv.model.StreamUrl;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class co2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ op2 J;

    public /* synthetic */ co2(op2 op2Var, byte b) {
        this.I = b;
        this.J = op2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        StreamUrl streamUrl;
        ResolvedLiveStream resolveLiveStreamForQuality;
        String qualityName;
        String qualityName2;
        byte b = this.I;
        op2 op2Var = this.J;
        switch (b) {
            case 0:
                rm2 rm2Var = (rm2) obj;
                rm2Var.getClass();
                float f = rm2Var.J;
                fw4 fw4Var = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings = (LiveDanmakuSettings) fw4Var.getValue();
                float q = ut0.q(f, 0.8f, 1.5f);
                fw4Var.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings, false, false, null, 0.0f, q, 0.0f, 0, 0.0f, 0.0f, false, false, null, 4079, null));
                fl4 fl4Var = op2Var.c;
                fl4Var.a.edit().putFloat("danmaku_font_size", q).apply();
                fw4 fw4Var2 = fl4Var.W;
                Float valueOf = Float.valueOf(q);
                fw4Var2.getClass();
                fw4Var2.i(null, valueOf);
                return wd5.a;
            case 1:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                fw4 fw4Var3 = op2Var.L;
                fw4 fw4Var4 = op2Var.J;
                fl4 fl4Var2 = op2Var.c;
                fw4 fw4Var5 = op2Var.G;
                op2Var.B();
                List list = (List) op2Var.E.getValue();
                String str = "默认";
                if (intValue < 0 || intValue >= list.size()) {
                    fw4Var5.getClass();
                    fw4Var5.i(null, -1);
                    op2Var.I = null;
                    fw4Var4.h(null);
                    LiveRoom liveRoom = (LiveRoom) op2Var.k.getValue();
                    if (liveRoom != null && (streamUrl = liveRoom.getStreamUrl()) != null && (resolveLiveStreamForQuality = DataModelKt.resolveLiveStreamForQuality(streamUrl, (lq5) ((fw4) fl4Var2.p.I).getValue())) != null && (qualityName = resolveLiveStreamForQuality.getQualityName()) != null && !jx4.L(qualityName)) {
                        str = qualityName;
                    }
                    fw4Var3.getClass();
                    fw4Var3.i(null, str);
                } else {
                    fw4Var5.getClass();
                    fw4Var5.i(null, num);
                    op2Var.I = ((CameraInfo) list.get(intValue)).getCameraIdStr();
                    StreamUrl streamInfo = ((CameraInfo) list.get(intValue)).getStreamInfo();
                    ResolvedLiveStream resolveLiveStreamForQuality2 = streamInfo != null ? DataModelKt.resolveLiveStreamForQuality(streamInfo, (lq5) ((fw4) fl4Var2.p.I).getValue()) : null;
                    fw4Var4.h(resolveLiveStreamForQuality2 != null ? resolveLiveStreamForQuality2.getUrls() : null);
                    if (resolveLiveStreamForQuality2 != null && (qualityName2 = resolveLiveStreamForQuality2.getQualityName()) != null && !jx4.L(qualityName2)) {
                        str = qualityName2;
                    }
                    fw4Var3.getClass();
                    fw4Var3.i(null, str);
                }
                return wd5.a;
            case 2:
                zm2 zm2Var = (zm2) obj;
                zm2Var.getClass();
                float f2 = zm2Var.J;
                fw4 fw4Var6 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings2 = (LiveDanmakuSettings) fw4Var6.getValue();
                float q2 = ut0.q(f2, 0.5f, 2.0f);
                fw4Var6.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings2, false, false, null, q2, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, false, null, 4087, null));
                fl4 fl4Var3 = op2Var.c;
                fl4Var3.a.edit().putFloat("danmaku_speed", q2).apply();
                fw4 fw4Var7 = fl4Var3.Y;
                Float valueOf2 = Float.valueOf(q2);
                fw4Var7.getClass();
                fw4Var7.i(null, valueOf2);
                return wd5.a;
            case 3:
                fw4 fw4Var8 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings3 = (LiveDanmakuSettings) fw4Var8.getValue();
                float q3 = ut0.q(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f, 0.5f, 2.0f);
                fw4Var8.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings3, false, false, null, 0.0f, 0.0f, 0.0f, 0, q3, 0.0f, false, false, null, 3967, null));
                op2Var.c.F(q3);
                return wd5.a;
            case 4:
                ((Boolean) obj).getClass();
                fw4 fw4Var9 = op2Var.z;
                boolean z = !((LiveDanmakuSettings) fw4Var9.getValue()).getFilterPackageComment();
                LiveDanmakuSettings liveDanmakuSettings4 = (LiveDanmakuSettings) fw4Var9.getValue();
                if (liveDanmakuSettings4.getFilterPackageComment() != z) {
                    fw4Var9.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings4, false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, z, false, null, 3583, null));
                    fl4 fl4Var4 = op2Var.c;
                    i82.V(fl4Var4.a, "danmaku_filter_package", z);
                    fw4 fw4Var10 = fl4Var4.k0;
                    Boolean valueOf3 = Boolean.valueOf(z);
                    fw4Var10.getClass();
                    fw4Var10.i(null, valueOf3);
                    op2Var.w.p = z;
                    Log.d("LiveWebSocket", "filterPackageComment=" + z);
                }
                return wd5.a;
            case 5:
                fw4 fw4Var11 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings5 = (LiveDanmakuSettings) fw4Var11.getValue();
                float q4 = ut0.q(ut0.r((int) ((Float) obj).floatValue(), 1, 100) / 100.0f, 0.01f, 1.0f);
                fw4Var11.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings5, false, false, null, 0.0f, 0.0f, q4, 0, 0.0f, 0.0f, false, false, null, 4063, null));
                op2Var.c.E(q4);
                return wd5.a;
            case 6:
                ((Boolean) obj).getClass();
                fw4 fw4Var12 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings6 = (LiveDanmakuSettings) fw4Var12.getValue();
                boolean z2 = !liveDanmakuSettings6.getEnabled();
                fw4Var12.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings6, z2, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, false, null, 4094, null));
                fl4 fl4Var5 = op2Var.c;
                i82.V(fl4Var5.a, "live_danmaku_enabled", z2);
                fw4 fw4Var13 = fl4Var5.K;
                Boolean valueOf4 = Boolean.valueOf(z2);
                fw4Var13.getClass();
                fw4Var13.i(null, valueOf4);
                return wd5.a;
            case 7:
                fw4 fw4Var14 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings7 = (LiveDanmakuSettings) fw4Var14.getValue();
                float q5 = ut0.q(((int) (((Float) obj).floatValue() * 10.0f)) / 10.0f, 0.5f, 2.0f);
                fw4Var14.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings7, false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, q5, false, false, null, 3839, null));
                op2Var.c.D(q5);
                return wd5.a;
            case 8:
                int floatValue = (int) ((Float) obj).floatValue();
                fw4 fw4Var15 = op2Var.z;
                LiveDanmakuSettings liveDanmakuSettings8 = (LiveDanmakuSettings) fw4Var15.getValue();
                int r = ut0.r(floatValue, 1, 100);
                fw4Var15.h(LiveDanmakuSettings.copy$default(liveDanmakuSettings8, false, false, null, 0.0f, 0.0f, 0.0f, r, 0.0f, 0.0f, false, false, null, 4031, null));
                op2Var.c.C(r);
                return wd5.a;
            case 9:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                fw4 fw4Var16 = op2Var.z;
                fw4Var16.h(LiveDanmakuSettings.copy$default((LiveDanmakuSettings) fw4Var16.getValue(), false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, booleanValue, null, 3071, null));
                fl4 fl4Var6 = op2Var.c;
                i82.V(fl4Var6.a, "danmaku_block_enabled", booleanValue);
                fw4 fw4Var17 = fl4Var6.a0;
                fw4Var17.getClass();
                fw4Var17.i(null, bool);
                op2Var.y();
                return wd5.a;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                op2Var.getClass();
                fl4 fl4Var7 = op2Var.c;
                boolean a = fl4Var7.a(str2);
                if (a) {
                    fw4 fw4Var18 = op2Var.z;
                    fw4Var18.h(LiveDanmakuSettings.copy$default((LiveDanmakuSettings) fw4Var18.getValue(), false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, false, (List) fl4Var7.c0.getValue(), 2047, null));
                    op2Var.y();
                }
                return Boolean.valueOf(a);
            default:
                String str3 = (String) obj;
                str3.getClass();
                op2Var.getClass();
                fl4 fl4Var8 = op2Var.c;
                fl4Var8.z(str3);
                fw4 fw4Var19 = op2Var.z;
                fw4Var19.h(LiveDanmakuSettings.copy$default((LiveDanmakuSettings) fw4Var19.getValue(), false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, false, (List) fl4Var8.c0.getValue(), 2047, null));
                op2Var.y();
                return wd5.a;
        }
    }
}
