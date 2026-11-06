package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.c72;
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
public final class MixListResponse {
    private final long cursor;
    private final boolean hasMore;
    private final List<MixInfo> mixInfos;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new d52((byte) 24)), null, null, null};

    public /* synthetic */ MixListResponse(int i, List list, boolean z, long j, int i2, yj4 yj4Var) {
        this.mixInfos = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 4) == 0) {
            this.cursor = 0L;
        } else {
            this.cursor = j;
        }
        if ((i & 8) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(MixInfo$$serializer.INSTANCE);
    }

    public static /* synthetic */ MixListResponse copy$default(MixListResponse mixListResponse, List list, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mixListResponse.mixInfos;
        }
        if ((i2 & 2) != 0) {
            z = mixListResponse.hasMore;
        }
        if ((i2 & 4) != 0) {
            j = mixListResponse.cursor;
        }
        if ((i2 & 8) != 0) {
            i = mixListResponse.statusCode;
        }
        int i3 = i;
        return mixListResponse.copy(list, z, j, i3);
    }

    public static final /* synthetic */ void write$Self$app(MixListResponse mixListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || mixListResponse.mixInfos != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), mixListResponse.mixInfos);
        }
        if (me0Var.q(serialDescriptor) || mixListResponse.hasMore) {
            ((ax4) me0Var).C(serialDescriptor, 1, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(mixListResponse.hasMore));
        }
        if (me0Var.q(serialDescriptor) || mixListResponse.cursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 2, mixListResponse.cursor);
        }
        if (!me0Var.q(serialDescriptor) && mixListResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 3, mixListResponse.statusCode);
    }

    public final List<MixInfo> component1() {
        return this.mixInfos;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.cursor;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final MixListResponse copy(List<MixInfo> list, boolean z, long j, int i) {
        return new MixListResponse(list, z, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixListResponse)) {
            return false;
        }
        MixListResponse mixListResponse = (MixListResponse) obj;
        return j42.c(this.mixInfos, mixListResponse.mixInfos) && this.hasMore == mixListResponse.hasMore && this.cursor == mixListResponse.cursor && this.statusCode == mixListResponse.statusCode;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MixInfo> getMixInfos() {
        return this.mixInfos;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<MixInfo> list = this.mixInfos;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + (this.hasMore ? 1231 : 1237)) * 31;
        long j = this.cursor;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.statusCode;
    }

    public String toString() {
        return "MixListResponse(mixInfos=" + this.mixInfos + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return MixListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c72(names = {"next_cursor"})
    public static /* synthetic */ void getCursor$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    @c72(names = {"mix_infos"})
    public static /* synthetic */ void getMixInfos$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public MixListResponse() {
        this((List) null, false, 0L, 0, 15, (er0) null);
    }

    public MixListResponse(List<MixInfo> list, boolean z, long j, int i) {
        this.mixInfos = list;
        this.hasMore = z;
        this.cursor = j;
        this.statusCode = i;
    }

    public /* synthetic */ MixListResponse(List list, boolean z, long j, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
    }
}
