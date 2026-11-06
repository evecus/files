package com.github.mytv.dv.widget;

import defpackage.ab1;
import defpackage.ax4;
import defpackage.d52;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveSnapshot {
    private static final uc2[] $childSerializers;
    private final String accountId;
    private final List<WidgetLiveItem> items;
    private final WidgetLoadState state;
    private final long updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        d52 d52Var = new d52((byte) 16);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{null, ut0.K(dh2Var, d52Var), ut0.K(dh2Var, new d52((byte) 17)), null};
    }

    public /* synthetic */ LiveSnapshot(int i, String str, WidgetLoadState widgetLoadState, List list, long j, yj4 yj4Var) {
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
        if ((i & 8) == 0) {
            this.updatedAt = 0L;
        } else {
            this.updatedAt = j;
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
        return new sp(WidgetLiveItem$$serializer.INSTANCE);
    }

    public static /* synthetic */ LiveSnapshot copy$default(LiveSnapshot liveSnapshot, String str, WidgetLoadState widgetLoadState, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveSnapshot.accountId;
        }
        if ((i & 2) != 0) {
            widgetLoadState = liveSnapshot.state;
        }
        if ((i & 4) != 0) {
            list = liveSnapshot.items;
        }
        if ((i & 8) != 0) {
            j = liveSnapshot.updatedAt;
        }
        List list2 = list;
        return liveSnapshot.copy(str, widgetLoadState, list2, j);
    }

    public static final /* synthetic */ void write$Self$app(LiveSnapshot liveSnapshot, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(liveSnapshot.accountId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, liveSnapshot.accountId);
        }
        if (me0Var.q(serialDescriptor) || liveSnapshot.state != WidgetLoadState.LOADING) {
            ((ax4) me0Var).C(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), liveSnapshot.state);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(liveSnapshot.items, o91.I)) {
            ((ax4) me0Var).C(serialDescriptor, 2, (KSerializer) uc2VarArr[2].getValue(), liveSnapshot.items);
        }
        if (!me0Var.q(serialDescriptor) && liveSnapshot.updatedAt == 0) {
            return;
        }
        ((ax4) me0Var).B(serialDescriptor, 3, liveSnapshot.updatedAt);
    }

    public final String component1() {
        return this.accountId;
    }

    public final WidgetLoadState component2() {
        return this.state;
    }

    public final List<WidgetLiveItem> component3() {
        return this.items;
    }

    public final long component4() {
        return this.updatedAt;
    }

    public final LiveSnapshot copy(String str, WidgetLoadState widgetLoadState, List<WidgetLiveItem> list, long j) {
        str.getClass();
        widgetLoadState.getClass();
        list.getClass();
        return new LiveSnapshot(str, widgetLoadState, list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveSnapshot)) {
            return false;
        }
        LiveSnapshot liveSnapshot = (LiveSnapshot) obj;
        return j42.c(this.accountId, liveSnapshot.accountId) && this.state == liveSnapshot.state && j42.c(this.items, liveSnapshot.items) && this.updatedAt == liveSnapshot.updatedAt;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final List<WidgetLiveItem> getItems() {
        return this.items;
    }

    public final WidgetLoadState getState() {
        return this.state;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = (this.items.hashCode() + ((this.state.hashCode() + (this.accountId.hashCode() * 31)) * 31)) * 31;
        long j = this.updatedAt;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LiveSnapshot(accountId=" + this.accountId + ", state=" + this.state + ", items=" + this.items + ", updatedAt=" + this.updatedAt + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveSnapshot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LiveSnapshot() {
        this((String) null, (WidgetLoadState) null, (List) null, 0L, 15, (er0) null);
    }

    public LiveSnapshot(String str, WidgetLoadState widgetLoadState, List<WidgetLiveItem> list, long j) {
        str.getClass();
        widgetLoadState.getClass();
        list.getClass();
        this.accountId = str;
        this.state = widgetLoadState;
        this.items = list;
        this.updatedAt = j;
    }

    public /* synthetic */ LiveSnapshot(String str, WidgetLoadState widgetLoadState, List list, long j, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? WidgetLoadState.LOADING : widgetLoadState, (i & 4) != 0 ? o91.I : list, (i & 8) != 0 ? 0L : j);
    }
}
