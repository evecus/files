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
public final class LiveRoomData {
    private final LiveRoom room;
    private final String webRid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveRoomData(int i, String str, LiveRoom liveRoom, yj4 yj4Var) {
        this.webRid = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.room = null;
        } else {
            this.room = liveRoom;
        }
    }

    public static /* synthetic */ LiveRoomData copy$default(LiveRoomData liveRoomData, String str, LiveRoom liveRoom, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveRoomData.webRid;
        }
        if ((i & 2) != 0) {
            liveRoom = liveRoomData.room;
        }
        return liveRoomData.copy(str, liveRoom);
    }

    public static final /* synthetic */ void write$Self$app(LiveRoomData liveRoomData, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(liveRoomData.webRid, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, liveRoomData.webRid);
        }
        if (!me0Var.q(serialDescriptor) && liveRoomData.room == null) {
            return;
        }
        me0Var.k(serialDescriptor, 1, LiveRoom$$serializer.INSTANCE, liveRoomData.room);
    }

    public final String component1() {
        return this.webRid;
    }

    public final LiveRoom component2() {
        return this.room;
    }

    public final LiveRoomData copy(String str, LiveRoom liveRoom) {
        str.getClass();
        return new LiveRoomData(str, liveRoom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRoomData)) {
            return false;
        }
        LiveRoomData liveRoomData = (LiveRoomData) obj;
        return j42.c(this.webRid, liveRoomData.webRid) && j42.c(this.room, liveRoomData.room);
    }

    public final LiveRoom getRoom() {
        return this.room;
    }

    public final LiveRoom getRoomWithWebRid() {
        LiveRoom liveRoom = this.room;
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
        LiveRoom liveRoom = this.room;
        return hashCode + (liveRoom == null ? 0 : liveRoom.hashCode());
    }

    public String toString() {
        return "LiveRoomData(webRid=" + this.webRid + ", room=" + this.room + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveRoomData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveRoomData() {
        this((String) null, (LiveRoom) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveRoomData(String str, LiveRoom liveRoom) {
        str.getClass();
        this.webRid = str;
        this.room = liveRoom;
    }

    public /* synthetic */ LiveRoomData(String str, LiveRoom liveRoom, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : liveRoom);
    }

    public static /* synthetic */ void getRoom$annotations() {
    }

    public static /* synthetic */ void getWebRid$annotations() {
    }
}
