package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class FeedDataItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Aweme aweme;

    public /* synthetic */ FeedDataItem(int i, Aweme aweme, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.aweme = null;
        } else {
            this.aweme = aweme;
        }
    }

    public static /* synthetic */ FeedDataItem copy$default(FeedDataItem feedDataItem, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = feedDataItem.aweme;
        }
        return feedDataItem.copy(aweme);
    }

    public static final /* synthetic */ void write$Self$app(FeedDataItem feedDataItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (!me0Var.q(serialDescriptor) && feedDataItem.aweme == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, Aweme$$serializer.INSTANCE, feedDataItem.aweme);
    }

    public final Aweme component1() {
        return this.aweme;
    }

    public final FeedDataItem copy(Aweme aweme) {
        return new FeedDataItem(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedDataItem) && j42.c(this.aweme, ((FeedDataItem) obj).aweme);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public String toString() {
        return "FeedDataItem(aweme=" + this.aweme + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return FeedDataItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedDataItem() {
        this((Aweme) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public FeedDataItem(Aweme aweme) {
        this.aweme = aweme;
    }

    public /* synthetic */ FeedDataItem(Aweme aweme, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : aweme);
    }

    public static /* synthetic */ void getAweme$annotations() {
    }
}
