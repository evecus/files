package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import defpackage.zr2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlayProgress {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long lastModifiedTime;
    private final long playProgress;
    private final Long watchTimes;

    public /* synthetic */ PlayProgress(int i, long j, long j2, Long l, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.lastModifiedTime = 0L;
        } else {
            this.lastModifiedTime = j;
        }
        if ((i & 2) == 0) {
            this.playProgress = 0L;
        } else {
            this.playProgress = j2;
        }
        if ((i & 4) == 0) {
            this.watchTimes = null;
        } else {
            this.watchTimes = l;
        }
    }

    public static /* synthetic */ PlayProgress copy$default(PlayProgress playProgress, long j, long j2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playProgress.lastModifiedTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = playProgress.playProgress;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            l = playProgress.watchTimes;
        }
        return playProgress.copy(j3, j4, l);
    }

    public static final /* synthetic */ void write$Self$app(PlayProgress playProgress, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || playProgress.lastModifiedTime != 0) {
            ((ax4) me0Var).B(serialDescriptor, 0, playProgress.lastModifiedTime);
        }
        if (me0Var.q(serialDescriptor) || playProgress.playProgress != 0) {
            ((ax4) me0Var).B(serialDescriptor, 1, playProgress.playProgress);
        }
        if (!me0Var.q(serialDescriptor) && playProgress.watchTimes == null) {
            return;
        }
        me0Var.k(serialDescriptor, 2, zr2.a, playProgress.watchTimes);
    }

    public final long component1() {
        return this.lastModifiedTime;
    }

    public final long component2() {
        return this.playProgress;
    }

    public final Long component3() {
        return this.watchTimes;
    }

    public final PlayProgress copy(long j, long j2, Long l) {
        return new PlayProgress(j, j2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayProgress)) {
            return false;
        }
        PlayProgress playProgress = (PlayProgress) obj;
        return this.lastModifiedTime == playProgress.lastModifiedTime && this.playProgress == playProgress.playProgress && j42.c(this.watchTimes, playProgress.watchTimes);
    }

    public final long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final long getPlayProgress() {
        return this.playProgress;
    }

    public final Long getWatchTimes() {
        return this.watchTimes;
    }

    public int hashCode() {
        int Q = (i82.Q(this.playProgress) + (i82.Q(this.lastModifiedTime) * 31)) * 31;
        Long l = this.watchTimes;
        return Q + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.lastModifiedTime;
        long j2 = this.playProgress;
        Long l = this.watchTimes;
        StringBuilder A = hf1.A(j, "PlayProgress(lastModifiedTime=", ", playProgress=");
        A.append(j2);
        A.append(", watchTimes=");
        A.append(l);
        A.append(")");
        return A.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return PlayProgress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getLastModifiedTime$annotations() {
    }

    public static /* synthetic */ void getPlayProgress$annotations() {
    }

    public static /* synthetic */ void getWatchTimes$annotations() {
    }

    public PlayProgress() {
        this(0L, 0L, (Long) null, 7, (er0) null);
    }

    public PlayProgress(long j, long j2, Long l) {
        this.lastModifiedTime = j;
        this.playProgress = j2;
        this.watchTimes = l;
    }

    public /* synthetic */ PlayProgress(long j, long j2, Long l, int i, er0 er0Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : l);
    }
}
