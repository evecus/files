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
public final class LiveCorePullOptions {
    private final List<LiveStreamQuality> qualities;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new d52((byte) 9))};

    public /* synthetic */ LiveCorePullOptions(int i, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.qualities = null;
        } else {
            this.qualities = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(LiveStreamQuality$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveCorePullOptions copy$default(LiveCorePullOptions liveCorePullOptions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liveCorePullOptions.qualities;
        }
        return liveCorePullOptions.copy(list);
    }

    public static final /* synthetic */ void write$Self$app(LiveCorePullOptions liveCorePullOptions, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (!me0Var.q(serialDescriptor) && liveCorePullOptions.qualities == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), liveCorePullOptions.qualities);
    }

    public final List<LiveStreamQuality> component1() {
        return this.qualities;
    }

    public final LiveCorePullOptions copy(List<LiveStreamQuality> list) {
        return new LiveCorePullOptions(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveCorePullOptions) && j42.c(this.qualities, ((LiveCorePullOptions) obj).qualities);
    }

    public final List<LiveStreamQuality> getQualities() {
        return this.qualities;
    }

    public int hashCode() {
        List<LiveStreamQuality> list = this.qualities;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "LiveCorePullOptions(qualities=" + this.qualities + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveCorePullOptions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveCorePullOptions() {
        this((List) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public LiveCorePullOptions(List<LiveStreamQuality> list) {
        this.qualities = list;
    }

    public /* synthetic */ LiveCorePullOptions(List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ void getQualities$annotations() {
    }
}
