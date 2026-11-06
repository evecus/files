package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.c72;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MixDetailResponse {
    private final MixInfo mixInfo;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MixDetailResponse(int i, MixInfo mixInfo, int i2, yj4 yj4Var) {
        this.mixInfo = (i & 1) == 0 ? null : mixInfo;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ MixDetailResponse copy$default(MixDetailResponse mixDetailResponse, MixInfo mixInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mixInfo = mixDetailResponse.mixInfo;
        }
        if ((i2 & 2) != 0) {
            i = mixDetailResponse.statusCode;
        }
        return mixDetailResponse.copy(mixInfo, i);
    }

    public static final /* synthetic */ void write$Self$app(MixDetailResponse mixDetailResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || mixDetailResponse.mixInfo != null) {
            me0Var.k(serialDescriptor, 0, MixInfo$$serializer.INSTANCE, mixDetailResponse.mixInfo);
        }
        if (!me0Var.q(serialDescriptor) && mixDetailResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, mixDetailResponse.statusCode);
    }

    public final MixInfo component1() {
        return this.mixInfo;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final MixDetailResponse copy(MixInfo mixInfo, int i) {
        return new MixDetailResponse(mixInfo, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixDetailResponse)) {
            return false;
        }
        MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
        return j42.c(this.mixInfo, mixDetailResponse.mixInfo) && this.statusCode == mixDetailResponse.statusCode;
    }

    public final MixInfo getMixInfo() {
        return this.mixInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        MixInfo mixInfo = this.mixInfo;
        return ((mixInfo == null ? 0 : mixInfo.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "MixDetailResponse(mixInfo=" + this.mixInfo + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return MixDetailResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MixDetailResponse() {
        this((MixInfo) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public MixDetailResponse(MixInfo mixInfo, int i) {
        this.mixInfo = mixInfo;
        this.statusCode = i;
    }

    public /* synthetic */ MixDetailResponse(MixInfo mixInfo, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : mixInfo, (i2 & 2) != 0 ? 0 : i);
    }

    @c72(names = {"series_info"})
    public static /* synthetic */ void getMixInfo$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
