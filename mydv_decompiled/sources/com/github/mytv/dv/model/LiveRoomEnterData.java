package com.github.mytv.dv.model;

import defpackage.d52;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveRoomEnterData {
    private final List<LiveRoom> data;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new d52((byte) 15))};

    public /* synthetic */ LiveRoomEnterData(int i, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(LiveRoom$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveRoomEnterData copy$default(LiveRoomEnterData liveRoomEnterData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liveRoomEnterData.data;
        }
        return liveRoomEnterData.copy(list);
    }

    public static final /* synthetic */ void write$Self$app(LiveRoomEnterData liveRoomEnterData, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (!me0Var.q(serialDescriptor) && liveRoomEnterData.data == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), liveRoomEnterData.data);
    }

    public final List<LiveRoom> component1() {
        return this.data;
    }

    public final LiveRoomEnterData copy(List<LiveRoom> list) {
        return new LiveRoomEnterData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveRoomEnterData) && j42.c(this.data, ((LiveRoomEnterData) obj).data);
    }

    public final List<LiveRoom> getData() {
        return this.data;
    }

    public int hashCode() {
        List<LiveRoom> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "LiveRoomEnterData(data=" + this.data + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveRoomEnterData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveRoomEnterData() {
        this((List) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public LiveRoomEnterData(List<LiveRoom> list) {
        this.data = list;
    }

    public /* synthetic */ LiveRoomEnterData(List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ void getData$annotations() {
    }
}
