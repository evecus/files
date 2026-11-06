package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.jx4;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveFeedDataHome {
    private final LiveRoom data;
    private final String webRid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveFeedDataHome(int i, String str, LiveRoom liveRoom, yj4 yj4Var) {
        this.webRid = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = liveRoom;
        }
    }

    public static /* synthetic */ LiveFeedDataHome copy$default(LiveFeedDataHome liveFeedDataHome, String str, LiveRoom liveRoom, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveFeedDataHome.webRid;
        }
        if ((i & 2) != 0) {
            liveRoom = liveFeedDataHome.data;
        }
        return liveFeedDataHome.copy(str, liveRoom);
    }

    public static final /* synthetic */ void write$Self$app(LiveFeedDataHome liveFeedDataHome, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(liveFeedDataHome.webRid, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, liveFeedDataHome.webRid);
        }
        if (!me0Var.q(serialDescriptor) && liveFeedDataHome.data == null) {
            return;
        }
        me0Var.k(serialDescriptor, 1, LiveRoom$$serializer.INSTANCE, liveFeedDataHome.data);
    }

    public final String component1() {
        return this.webRid;
    }

    public final LiveRoom component2() {
        return this.data;
    }

    public final LiveFeedDataHome copy(String str, LiveRoom liveRoom) {
        str.getClass();
        return new LiveFeedDataHome(str, liveRoom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveFeedDataHome)) {
            return false;
        }
        LiveFeedDataHome liveFeedDataHome = (LiveFeedDataHome) obj;
        return j42.c(this.webRid, liveFeedDataHome.webRid) && j42.c(this.data, liveFeedDataHome.data);
    }

    public final LiveRoom getData() {
        return this.data;
    }

    public final LiveRoom getRoom() {
        LiveRoom liveRoom = this.data;
        if (liveRoom != null) {
            return (!jx4.L(liveRoom.getWebRid()) || jx4.L(this.webRid)) ? liveRoom : LiveRoom.copy$default(liveRoom, null, null, null, this.webRid, null, null, null, null, null, null, 0, null, null, 8183, null);
        }
        return null;
    }

    public final String getWebRid() {
        return this.webRid;
    }

    public int hashCode() {
        int hashCode = this.webRid.hashCode() * 31;
        LiveRoom liveRoom = this.data;
        return hashCode + (liveRoom == null ? 0 : liveRoom.hashCode());
    }

    public String toString() {
        return "LiveFeedDataHome(webRid=" + this.webRid + ", data=" + this.data + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveFeedDataHome$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveFeedDataHome() {
        this((String) null, (LiveRoom) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveFeedDataHome(String str, LiveRoom liveRoom) {
        str.getClass();
        this.webRid = str;
        this.data = liveRoom;
    }

    public /* synthetic */ LiveFeedDataHome(String str, LiveRoom liveRoom, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : liveRoom);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getWebRid$annotations() {
    }
}
