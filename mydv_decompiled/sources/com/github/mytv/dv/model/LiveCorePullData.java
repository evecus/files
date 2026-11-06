package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.u62;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveCorePullData {
    private final b options;
    private final b streamData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveCorePullData(int i, b bVar, b bVar2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.options = null;
        } else {
            this.options = bVar;
        }
        if ((i & 2) == 0) {
            this.streamData = null;
        } else {
            this.streamData = bVar2;
        }
    }

    public static /* synthetic */ LiveCorePullData copy$default(LiveCorePullData liveCorePullData, b bVar, b bVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = liveCorePullData.options;
        }
        if ((i & 2) != 0) {
            bVar2 = liveCorePullData.streamData;
        }
        return liveCorePullData.copy(bVar, bVar2);
    }

    public static final /* synthetic */ void write$Self$app(LiveCorePullData liveCorePullData, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || liveCorePullData.options != null) {
            me0Var.k(serialDescriptor, 0, u62.a, liveCorePullData.options);
        }
        if (!me0Var.q(serialDescriptor) && liveCorePullData.streamData == null) {
            return;
        }
        me0Var.k(serialDescriptor, 1, u62.a, liveCorePullData.streamData);
    }

    public final b component1() {
        return this.options;
    }

    public final b component2() {
        return this.streamData;
    }

    public final LiveCorePullData copy(b bVar, b bVar2) {
        return new LiveCorePullData(bVar, bVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveCorePullData)) {
            return false;
        }
        LiveCorePullData liveCorePullData = (LiveCorePullData) obj;
        return j42.c(this.options, liveCorePullData.options) && j42.c(this.streamData, liveCorePullData.streamData);
    }

    public final b getOptions() {
        return this.options;
    }

    public final b getStreamData() {
        return this.streamData;
    }

    public int hashCode() {
        b bVar = this.options;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.streamData;
        return hashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public String toString() {
        return "LiveCorePullData(options=" + this.options + ", streamData=" + this.streamData + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveCorePullData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveCorePullData() {
        this((b) null, (b) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveCorePullData(b bVar, b bVar2) {
        this.options = bVar;
        this.streamData = bVar2;
    }

    public /* synthetic */ LiveCorePullData(b bVar, b bVar2, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : bVar2);
    }

    public static /* synthetic */ void getOptions$annotations() {
    }

    public static /* synthetic */ void getStreamData$annotations() {
    }
}
