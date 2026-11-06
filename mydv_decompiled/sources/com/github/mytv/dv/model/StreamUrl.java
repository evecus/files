package com.github.mytv.dv.model;

import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.hk2;
import defpackage.j42;
import defpackage.me0;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.wd3;
import defpackage.yj4;
import defpackage.yw4;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class StreamUrl {
    private static final uc2[] $childSerializers;
    private final Map<String, String> flvPullUrl;
    private final Map<String, String> hlsPullUrlMap;
    private final LiveCoreSdkData liveCoreSdkData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        wd3 wd3Var = new wd3((byte) 29);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, wd3Var), ut0.K(dh2Var, new yw4((byte) 0)), null};
    }

    public /* synthetic */ StreamUrl(int i, Map map, Map map2, LiveCoreSdkData liveCoreSdkData, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.flvPullUrl = null;
        } else {
            this.flvPullUrl = map;
        }
        if ((i & 2) == 0) {
            this.hlsPullUrlMap = null;
        } else {
            this.hlsPullUrlMap = map2;
        }
        if ((i & 4) == 0) {
            this.liveCoreSdkData = null;
        } else {
            this.liveCoreSdkData = liveCoreSdkData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        fx4 fx4Var = fx4.a;
        return new hk2(fx4Var, fx4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        fx4 fx4Var = fx4.a;
        return new hk2(fx4Var, fx4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamUrl copy$default(StreamUrl streamUrl, Map map, Map map2, LiveCoreSdkData liveCoreSdkData, int i, Object obj) {
        if ((i & 1) != 0) {
            map = streamUrl.flvPullUrl;
        }
        if ((i & 2) != 0) {
            map2 = streamUrl.hlsPullUrlMap;
        }
        if ((i & 4) != 0) {
            liveCoreSdkData = streamUrl.liveCoreSdkData;
        }
        return streamUrl.copy(map, map2, liveCoreSdkData);
    }

    public static final /* synthetic */ void write$Self$app(StreamUrl streamUrl, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || streamUrl.flvPullUrl != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), streamUrl.flvPullUrl);
        }
        if (me0Var.q(serialDescriptor) || streamUrl.hlsPullUrlMap != null) {
            me0Var.k(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), streamUrl.hlsPullUrlMap);
        }
        if (!me0Var.q(serialDescriptor) && streamUrl.liveCoreSdkData == null) {
            return;
        }
        me0Var.k(serialDescriptor, 2, LiveCoreSdkData$$serializer.INSTANCE, streamUrl.liveCoreSdkData);
    }

    public final Map<String, String> component1() {
        return this.flvPullUrl;
    }

    public final Map<String, String> component2() {
        return this.hlsPullUrlMap;
    }

    public final LiveCoreSdkData component3() {
        return this.liveCoreSdkData;
    }

    public final StreamUrl copy(Map<String, String> map, Map<String, String> map2, LiveCoreSdkData liveCoreSdkData) {
        return new StreamUrl(map, map2, liveCoreSdkData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamUrl)) {
            return false;
        }
        StreamUrl streamUrl = (StreamUrl) obj;
        return j42.c(this.flvPullUrl, streamUrl.flvPullUrl) && j42.c(this.hlsPullUrlMap, streamUrl.hlsPullUrlMap) && j42.c(this.liveCoreSdkData, streamUrl.liveCoreSdkData);
    }

    public final Map<String, String> getFlvPullUrl() {
        return this.flvPullUrl;
    }

    public final Map<String, String> getHlsPullUrlMap() {
        return this.hlsPullUrlMap;
    }

    public final LiveCoreSdkData getLiveCoreSdkData() {
        return this.liveCoreSdkData;
    }

    public int hashCode() {
        Map<String, String> map = this.flvPullUrl;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.hlsPullUrlMap;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        LiveCoreSdkData liveCoreSdkData = this.liveCoreSdkData;
        return hashCode2 + (liveCoreSdkData != null ? liveCoreSdkData.hashCode() : 0);
    }

    public String toString() {
        return "StreamUrl(flvPullUrl=" + this.flvPullUrl + ", hlsPullUrlMap=" + this.hlsPullUrlMap + ", liveCoreSdkData=" + this.liveCoreSdkData + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return StreamUrl$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getFlvPullUrl$annotations() {
    }

    public static /* synthetic */ void getHlsPullUrlMap$annotations() {
    }

    public static /* synthetic */ void getLiveCoreSdkData$annotations() {
    }

    public StreamUrl() {
        this((Map) null, (Map) null, (LiveCoreSdkData) null, 7, (er0) null);
    }

    public StreamUrl(Map<String, String> map, Map<String, String> map2, LiveCoreSdkData liveCoreSdkData) {
        this.flvPullUrl = map;
        this.hlsPullUrlMap = map2;
        this.liveCoreSdkData = liveCoreSdkData;
    }

    public /* synthetic */ StreamUrl(Map map, Map map2, LiveCoreSdkData liveCoreSdkData, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : liveCoreSdkData);
    }
}
