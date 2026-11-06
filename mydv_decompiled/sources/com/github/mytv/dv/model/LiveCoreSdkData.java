package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveCoreSdkData {
    private final LiveCorePullData pullData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveCoreSdkData(int i, LiveCorePullData liveCorePullData, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.pullData = null;
        } else {
            this.pullData = liveCorePullData;
        }
    }

    public static /* synthetic */ LiveCoreSdkData copy$default(LiveCoreSdkData liveCoreSdkData, LiveCorePullData liveCorePullData, int i, Object obj) {
        if ((i & 1) != 0) {
            liveCorePullData = liveCoreSdkData.pullData;
        }
        return liveCoreSdkData.copy(liveCorePullData);
    }

    public static final /* synthetic */ void write$Self$app(LiveCoreSdkData liveCoreSdkData, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (!me0Var.q(serialDescriptor) && liveCoreSdkData.pullData == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, LiveCorePullData$$serializer.INSTANCE, liveCoreSdkData.pullData);
    }

    public final LiveCorePullData component1() {
        return this.pullData;
    }

    public final LiveCoreSdkData copy(LiveCorePullData liveCorePullData) {
        return new LiveCoreSdkData(liveCorePullData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveCoreSdkData) && j42.c(this.pullData, ((LiveCoreSdkData) obj).pullData);
    }

    public final LiveCorePullData getPullData() {
        return this.pullData;
    }

    public int hashCode() {
        LiveCorePullData liveCorePullData = this.pullData;
        if (liveCorePullData == null) {
            return 0;
        }
        return liveCorePullData.hashCode();
    }

    public String toString() {
        return "LiveCoreSdkData(pullData=" + this.pullData + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveCoreSdkData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveCoreSdkData() {
        this((LiveCorePullData) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public LiveCoreSdkData(LiveCorePullData liveCorePullData) {
        this.pullData = liveCorePullData;
    }

    public /* synthetic */ LiveCoreSdkData(LiveCorePullData liveCorePullData, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : liveCorePullData);
    }

    public static /* synthetic */ void getPullData$annotations() {
    }
}
