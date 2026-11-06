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
public final class LiveFeedResponse {
    private final LiveFeedData data;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LiveFeedResponse(int i, LiveFeedData liveFeedData, int i2, yj4 yj4Var) {
        this.data = (i & 1) == 0 ? null : liveFeedData;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ LiveFeedResponse copy$default(LiveFeedResponse liveFeedResponse, LiveFeedData liveFeedData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveFeedData = liveFeedResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = liveFeedResponse.statusCode;
        }
        return liveFeedResponse.copy(liveFeedData, i);
    }

    public static final /* synthetic */ void write$Self$app(LiveFeedResponse liveFeedResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || liveFeedResponse.data != null) {
            me0Var.k(serialDescriptor, 0, LiveFeedData$$serializer.INSTANCE, liveFeedResponse.data);
        }
        if (!me0Var.q(serialDescriptor) && liveFeedResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, liveFeedResponse.statusCode);
    }

    public final LiveFeedData component1() {
        return this.data;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final LiveFeedResponse copy(LiveFeedData liveFeedData, int i) {
        return new LiveFeedResponse(liveFeedData, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveFeedResponse)) {
            return false;
        }
        LiveFeedResponse liveFeedResponse = (LiveFeedResponse) obj;
        return j42.c(this.data, liveFeedResponse.data) && this.statusCode == liveFeedResponse.statusCode;
    }

    public final LiveFeedData getData() {
        return this.data;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        LiveFeedData liveFeedData = this.data;
        return ((liveFeedData == null ? 0 : liveFeedData.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "LiveFeedResponse(data=" + this.data + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveFeedResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveFeedResponse() {
        this((LiveFeedData) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public LiveFeedResponse(LiveFeedData liveFeedData, int i) {
        this.data = liveFeedData;
        this.statusCode = i;
    }

    public /* synthetic */ LiveFeedResponse(LiveFeedData liveFeedData, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : liveFeedData, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
