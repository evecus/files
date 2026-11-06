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
public final class MixStatis {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long collectVv;
    private final int currentEpisode;
    private final long playVv;
    private final int totalEpisode;
    private final int updatedToEpisode;

    public /* synthetic */ MixStatis(int i, int i2, int i3, int i4, long j, long j2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.currentEpisode = 0;
        } else {
            this.currentEpisode = i2;
        }
        if ((i & 2) == 0) {
            this.updatedToEpisode = 0;
        } else {
            this.updatedToEpisode = i3;
        }
        if ((i & 4) == 0) {
            this.totalEpisode = 0;
        } else {
            this.totalEpisode = i4;
        }
        if ((i & 8) == 0) {
            this.playVv = 0L;
        } else {
            this.playVv = j;
        }
        if ((i & 16) == 0) {
            this.collectVv = 0L;
        } else {
            this.collectVv = j2;
        }
    }

    public static /* synthetic */ MixStatis copy$default(MixStatis mixStatis, int i, int i2, int i3, long j, long j2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mixStatis.currentEpisode;
        }
        if ((i4 & 2) != 0) {
            i2 = mixStatis.updatedToEpisode;
        }
        if ((i4 & 4) != 0) {
            i3 = mixStatis.totalEpisode;
        }
        if ((i4 & 8) != 0) {
            j = mixStatis.playVv;
        }
        if ((i4 & 16) != 0) {
            j2 = mixStatis.collectVv;
        }
        long j3 = j2;
        int i5 = i3;
        return mixStatis.copy(i, i2, i5, j, j3);
    }

    public static final /* synthetic */ void write$Self$app(MixStatis mixStatis, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || mixStatis.currentEpisode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 0, mixStatis.currentEpisode);
        }
        if (me0Var.q(serialDescriptor) || mixStatis.updatedToEpisode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, mixStatis.updatedToEpisode);
        }
        if (me0Var.q(serialDescriptor) || mixStatis.totalEpisode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, mixStatis.totalEpisode);
        }
        if (me0Var.q(serialDescriptor) || mixStatis.playVv != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, mixStatis.playVv);
        }
        if (!me0Var.q(serialDescriptor) && mixStatis.collectVv == 0) {
            return;
        }
        ((ax4) me0Var).B(serialDescriptor, 4, mixStatis.collectVv);
    }

    public final int component1() {
        return this.currentEpisode;
    }

    public final int component2() {
        return this.updatedToEpisode;
    }

    public final int component3() {
        return this.totalEpisode;
    }

    public final long component4() {
        return this.playVv;
    }

    public final long component5() {
        return this.collectVv;
    }

    public final MixStatis copy(int i, int i2, int i3, long j, long j2) {
        return new MixStatis(i, i2, i3, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStatis)) {
            return false;
        }
        MixStatis mixStatis = (MixStatis) obj;
        return this.currentEpisode == mixStatis.currentEpisode && this.updatedToEpisode == mixStatis.updatedToEpisode && this.totalEpisode == mixStatis.totalEpisode && this.playVv == mixStatis.playVv && this.collectVv == mixStatis.collectVv;
    }

    public final long getCollectVv() {
        return this.collectVv;
    }

    public final int getCurrentEpisode() {
        return this.currentEpisode;
    }

    public final long getPlayVv() {
        return this.playVv;
    }

    public final int getTotalEpisode() {
        return this.totalEpisode;
    }

    public final int getUpdatedToEpisode() {
        return this.updatedToEpisode;
    }

    public int hashCode() {
        return i82.Q(this.collectVv) + ((i82.Q(this.playVv) + (((((this.currentEpisode * 31) + this.updatedToEpisode) * 31) + this.totalEpisode) * 31)) * 31);
    }

    public String toString() {
        int i = this.currentEpisode;
        int i2 = this.updatedToEpisode;
        int i3 = this.totalEpisode;
        long j = this.playVv;
        long j2 = this.collectVv;
        StringBuilder D = hf1.D("MixStatis(currentEpisode=", i, ", updatedToEpisode=", i2, ", totalEpisode=");
        D.append(i3);
        D.append(", playVv=");
        D.append(j);
        D.append(", collectVv=");
        D.append(j2);
        D.append(")");
        return D.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return MixStatis$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCollectVv$annotations() {
    }

    public static /* synthetic */ void getCurrentEpisode$annotations() {
    }

    public static /* synthetic */ void getPlayVv$annotations() {
    }

    public static /* synthetic */ void getTotalEpisode$annotations() {
    }

    public static /* synthetic */ void getUpdatedToEpisode$annotations() {
    }

    public MixStatis() {
        this(0, 0, 0, 0L, 0L, 31, (er0) null);
    }

    public MixStatis(int i, int i2, int i3, long j, long j2) {
        this.currentEpisode = i;
        this.updatedToEpisode = i2;
        this.totalEpisode = i3;
        this.playVv = j;
        this.collectVv = j2;
    }

    public /* synthetic */ MixStatis(int i, int i2, int i3, long j, long j2, int i4, er0 er0Var) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? 0L : j2);
    }
}
