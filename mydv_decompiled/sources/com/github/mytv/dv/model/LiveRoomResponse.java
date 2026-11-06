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
public final class LiveRoomResponse {
    private final LiveRoomData data;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveRoomResponse(int i, LiveRoomData liveRoomData, int i2, yj4 yj4Var) {
        this.data = (i & 1) == 0 ? null : liveRoomData;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ LiveRoomResponse copy$default(LiveRoomResponse liveRoomResponse, LiveRoomData liveRoomData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveRoomData = liveRoomResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = liveRoomResponse.statusCode;
        }
        return liveRoomResponse.copy(liveRoomData, i);
    }

    public static final /* synthetic */ void write$Self$app(LiveRoomResponse liveRoomResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || liveRoomResponse.data != null) {
            me0Var.k(serialDescriptor, 0, LiveRoomData$$serializer.INSTANCE, liveRoomResponse.data);
        }
        if (!me0Var.q(serialDescriptor) && liveRoomResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, liveRoomResponse.statusCode);
    }

    public final LiveRoomData component1() {
        return this.data;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final LiveRoomResponse copy(LiveRoomData liveRoomData, int i) {
        return new LiveRoomResponse(liveRoomData, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRoomResponse)) {
            return false;
        }
        LiveRoomResponse liveRoomResponse = (LiveRoomResponse) obj;
        return j42.c(this.data, liveRoomResponse.data) && this.statusCode == liveRoomResponse.statusCode;
    }

    public final LiveRoomData getData() {
        return this.data;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        LiveRoomData liveRoomData = this.data;
        return ((liveRoomData == null ? 0 : liveRoomData.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "LiveRoomResponse(data=" + this.data + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveRoomResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveRoomResponse() {
        this((LiveRoomData) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveRoomResponse(LiveRoomData liveRoomData, int i) {
        this.data = liveRoomData;
        this.statusCode = i;
    }

    public /* synthetic */ LiveRoomResponse(LiveRoomData liveRoomData, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : liveRoomData, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
