package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.i82;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Statistics {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long collectCount;
    private final long commentCount;
    private final long diggCount;
    private final long playCount;
    private final long shareCount;

    public /* synthetic */ Statistics(int i, long j, long j2, long j3, long j4, long j5, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.diggCount = 0L;
        } else {
            this.diggCount = j;
        }
        if ((i & 2) == 0) {
            this.commentCount = 0L;
        } else {
            this.commentCount = j2;
        }
        if ((i & 4) == 0) {
            this.shareCount = 0L;
        } else {
            this.shareCount = j3;
        }
        if ((i & 8) == 0) {
            this.collectCount = 0L;
        } else {
            this.collectCount = j4;
        }
        if ((i & 16) == 0) {
            this.playCount = 0L;
        } else {
            this.playCount = j5;
        }
    }

    public static /* synthetic */ Statistics copy$default(Statistics statistics, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = statistics.diggCount;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j2 = statistics.commentCount;
        }
        return statistics.copy(j6, j2, (i & 4) != 0 ? statistics.shareCount : j3, (i & 8) != 0 ? statistics.collectCount : j4, (i & 16) != 0 ? statistics.playCount : j5);
    }

    public static final /* synthetic */ void write$Self$app(Statistics statistics, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || statistics.diggCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 0, FlexibleLongSerializer.INSTANCE, Long.valueOf(statistics.diggCount));
        }
        if (me0Var.q(serialDescriptor) || statistics.commentCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 1, FlexibleLongSerializer.INSTANCE, Long.valueOf(statistics.commentCount));
        }
        if (me0Var.q(serialDescriptor) || statistics.shareCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleLongSerializer.INSTANCE, Long.valueOf(statistics.shareCount));
        }
        if (me0Var.q(serialDescriptor) || statistics.collectCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 3, FlexibleLongSerializer.INSTANCE, Long.valueOf(statistics.collectCount));
        }
        if (!me0Var.q(serialDescriptor) && statistics.playCount == 0) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 4, FlexibleLongSerializer.INSTANCE, Long.valueOf(statistics.playCount));
    }

    public final long component1() {
        return this.diggCount;
    }

    public final long component2() {
        return this.commentCount;
    }

    public final long component3() {
        return this.shareCount;
    }

    public final long component4() {
        return this.collectCount;
    }

    public final long component5() {
        return this.playCount;
    }

    public final Statistics copy(long j, long j2, long j3, long j4, long j5) {
        return new Statistics(j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Statistics)) {
            return false;
        }
        Statistics statistics = (Statistics) obj;
        return this.diggCount == statistics.diggCount && this.commentCount == statistics.commentCount && this.shareCount == statistics.shareCount && this.collectCount == statistics.collectCount && this.playCount == statistics.playCount;
    }

    public final long getCollectCount() {
        return this.collectCount;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final long getDiggCount() {
        return this.diggCount;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final long getShareCount() {
        return this.shareCount;
    }

    public int hashCode() {
        return i82.Q(this.playCount) + ((i82.Q(this.collectCount) + ((i82.Q(this.shareCount) + ((i82.Q(this.commentCount) + (i82.Q(this.diggCount) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        long j = this.diggCount;
        long j2 = this.commentCount;
        long j3 = this.shareCount;
        long j4 = this.collectCount;
        long j5 = this.playCount;
        StringBuilder A = hf1.A(j, "Statistics(diggCount=", ", commentCount=");
        A.append(j2);
        A.append(", shareCount=");
        A.append(j3);
        A.append(", collectCount=");
        A.append(j4);
        A.append(", playCount=");
        A.append(j5);
        A.append(")");
        return A.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Statistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCollectCount$annotations() {
    }

    public static /* synthetic */ void getCommentCount$annotations() {
    }

    public static /* synthetic */ void getDiggCount$annotations() {
    }

    public static /* synthetic */ void getPlayCount$annotations() {
    }

    public static /* synthetic */ void getShareCount$annotations() {
    }

    public Statistics() {
        this(0L, 0L, 0L, 0L, 0L, 31, (er0) null);
    }

    public Statistics(long j, long j2, long j3, long j4, long j5) {
        this.diggCount = j;
        this.commentCount = j2;
        this.shareCount = j3;
        this.collectCount = j4;
        this.playCount = j5;
    }

    public /* synthetic */ Statistics(long j, long j2, long j3, long j4, long j5, int i, er0 er0Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5);
    }
}
