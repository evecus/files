package com.github.mytv.dv.widget;

import defpackage.ab1;
import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import defpackage.yw4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class VideoListSnapshot {
    private static final uc2[] $childSerializers;
    private final String accountId;
    private final List<WidgetVideo> items;
    private final WidgetLoadState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        yw4 yw4Var = new yw4((byte) 18);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{null, ut0.K(dh2Var, yw4Var), ut0.K(dh2Var, new yw4((byte) 19))};
    }

    public /* synthetic */ VideoListSnapshot(int i, String str, WidgetLoadState widgetLoadState, List list, yj4 yj4Var) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.state = WidgetLoadState.LOADING;
        } else {
            this.state = widgetLoadState;
        }
        if ((i & 4) == 0) {
            this.items = o91.I;
        } else {
            this.items = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        WidgetLoadState[] values = WidgetLoadState.values();
        values.getClass();
        return new ab1("com.github.mytv.dv.widget.WidgetLoadState", values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(WidgetVideo$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoListSnapshot copy$default(VideoListSnapshot videoListSnapshot, String str, WidgetLoadState widgetLoadState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoListSnapshot.accountId;
        }
        if ((i & 2) != 0) {
            widgetLoadState = videoListSnapshot.state;
        }
        if ((i & 4) != 0) {
            list = videoListSnapshot.items;
        }
        return videoListSnapshot.copy(str, widgetLoadState, list);
    }

    public static final /* synthetic */ void write$Self$app(VideoListSnapshot videoListSnapshot, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(videoListSnapshot.accountId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, videoListSnapshot.accountId);
        }
        if (me0Var.q(serialDescriptor) || videoListSnapshot.state != WidgetLoadState.LOADING) {
            ((ax4) me0Var).C(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), videoListSnapshot.state);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(videoListSnapshot.items, o91.I)) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 2, (KSerializer) uc2VarArr[2].getValue(), videoListSnapshot.items);
    }

    public final String component1() {
        return this.accountId;
    }

    public final WidgetLoadState component2() {
        return this.state;
    }

    public final List<WidgetVideo> component3() {
        return this.items;
    }

    public final VideoListSnapshot copy(String str, WidgetLoadState widgetLoadState, List<WidgetVideo> list) {
        str.getClass();
        widgetLoadState.getClass();
        list.getClass();
        return new VideoListSnapshot(str, widgetLoadState, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoListSnapshot)) {
            return false;
        }
        VideoListSnapshot videoListSnapshot = (VideoListSnapshot) obj;
        return j42.c(this.accountId, videoListSnapshot.accountId) && this.state == videoListSnapshot.state && j42.c(this.items, videoListSnapshot.items);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final List<WidgetVideo> getItems() {
        return this.items;
    }

    public final WidgetLoadState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.items.hashCode() + ((this.state.hashCode() + (this.accountId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "VideoListSnapshot(accountId=" + this.accountId + ", state=" + this.state + ", items=" + this.items + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return VideoListSnapshot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VideoListSnapshot() {
        this((String) null, (WidgetLoadState) null, (List) null, 7, (er0) null);
    }

    public VideoListSnapshot(String str, WidgetLoadState widgetLoadState, List<WidgetVideo> list) {
        str.getClass();
        widgetLoadState.getClass();
        list.getClass();
        this.accountId = str;
        this.state = widgetLoadState;
        this.items = list;
    }

    public /* synthetic */ VideoListSnapshot(String str, WidgetLoadState widgetLoadState, List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? WidgetLoadState.LOADING : widgetLoadState, (i & 4) != 0 ? o91.I : list);
    }
}
