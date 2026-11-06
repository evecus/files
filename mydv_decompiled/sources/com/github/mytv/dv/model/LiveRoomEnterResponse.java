package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveRoomEnterResponse {
    private final LiveRoomEnterData data;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveRoomEnterResponse(int i, LiveRoomEnterData liveRoomEnterData, int i2, yj4 yj4Var) {
        this.data = (i & 1) == 0 ? null : liveRoomEnterData;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ LiveRoomEnterResponse copy$default(LiveRoomEnterResponse liveRoomEnterResponse, LiveRoomEnterData liveRoomEnterData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveRoomEnterData = liveRoomEnterResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = liveRoomEnterResponse.statusCode;
        }
        return liveRoomEnterResponse.copy(liveRoomEnterData, i);
    }

    public static final /* synthetic */ void write$Self$app(LiveRoomEnterResponse liveRoomEnterResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || liveRoomEnterResponse.data != null) {
            me0Var.k(serialDescriptor, 0, LiveRoomEnterData$$serializer.INSTANCE, liveRoomEnterResponse.data);
        }
        if (!me0Var.q(serialDescriptor) && liveRoomEnterResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, liveRoomEnterResponse.statusCode);
    }

    public final LiveRoomEnterData component1() {
        return this.data;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final LiveRoomEnterResponse copy(LiveRoomEnterData liveRoomEnterData, int i) {
        return new LiveRoomEnterResponse(liveRoomEnterData, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRoomEnterResponse)) {
            return false;
        }
        LiveRoomEnterResponse liveRoomEnterResponse = (LiveRoomEnterResponse) obj;
        return j42.c(this.data, liveRoomEnterResponse.data) && this.statusCode == liveRoomEnterResponse.statusCode;
    }

    public final LiveRoomEnterData getData() {
        return this.data;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        LiveRoomEnterData liveRoomEnterData = this.data;
        return ((liveRoomEnterData == null ? 0 : liveRoomEnterData.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "LiveRoomEnterResponse(data=" + this.data + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveRoomEnterResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveRoomEnterResponse() {
        this((LiveRoomEnterData) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveRoomEnterResponse(LiveRoomEnterData liveRoomEnterData, int i) {
        this.data = liveRoomEnterData;
        this.statusCode = i;
    }

    public /* synthetic */ LiveRoomEnterResponse(LiveRoomEnterData liveRoomEnterData, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : liveRoomEnterData, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
