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
public final class HotSearchResponse {
    private final HotSearchData data;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ HotSearchResponse(int i, HotSearchData hotSearchData, int i2, yj4 yj4Var) {
        this.data = (i & 1) == 0 ? null : hotSearchData;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ HotSearchResponse copy$default(HotSearchResponse hotSearchResponse, HotSearchData hotSearchData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hotSearchData = hotSearchResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = hotSearchResponse.statusCode;
        }
        return hotSearchResponse.copy(hotSearchData, i);
    }

    public static final /* synthetic */ void write$Self$app(HotSearchResponse hotSearchResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || hotSearchResponse.data != null) {
            me0Var.k(serialDescriptor, 0, HotSearchData$$serializer.INSTANCE, hotSearchResponse.data);
        }
        if (!me0Var.q(serialDescriptor) && hotSearchResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, hotSearchResponse.statusCode);
    }

    public final HotSearchData component1() {
        return this.data;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final HotSearchResponse copy(HotSearchData hotSearchData, int i) {
        return new HotSearchResponse(hotSearchData, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSearchResponse)) {
            return false;
        }
        HotSearchResponse hotSearchResponse = (HotSearchResponse) obj;
        return j42.c(this.data, hotSearchResponse.data) && this.statusCode == hotSearchResponse.statusCode;
    }

    public final HotSearchData getData() {
        return this.data;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        HotSearchData hotSearchData = this.data;
        return ((hotSearchData == null ? 0 : hotSearchData.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "HotSearchResponse(data=" + this.data + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return HotSearchResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotSearchResponse() {
        this((HotSearchData) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public HotSearchResponse(HotSearchData hotSearchData, int i) {
        this.data = hotSearchData;
        this.statusCode = i;
    }

    public /* synthetic */ HotSearchResponse(HotSearchData hotSearchData, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : hotSearchData, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
