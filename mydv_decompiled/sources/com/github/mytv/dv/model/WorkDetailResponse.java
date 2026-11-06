package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class WorkDetailResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Aweme awemeDetail;
    private final int statusCode;

    public /* synthetic */ WorkDetailResponse(int i, Aweme aweme, int i2, yj4 yj4Var) {
        this.awemeDetail = (i & 1) == 0 ? null : aweme;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ WorkDetailResponse copy$default(WorkDetailResponse workDetailResponse, Aweme aweme, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = workDetailResponse.awemeDetail;
        }
        if ((i2 & 2) != 0) {
            i = workDetailResponse.statusCode;
        }
        return workDetailResponse.copy(aweme, i);
    }

    public static final /* synthetic */ void write$Self$app(WorkDetailResponse workDetailResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || workDetailResponse.awemeDetail != null) {
            me0Var.k(serialDescriptor, 0, Aweme$$serializer.INSTANCE, workDetailResponse.awemeDetail);
        }
        if (!me0Var.q(serialDescriptor) && workDetailResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, workDetailResponse.statusCode);
    }

    public final Aweme component1() {
        return this.awemeDetail;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final WorkDetailResponse copy(Aweme aweme, int i) {
        return new WorkDetailResponse(aweme, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkDetailResponse)) {
            return false;
        }
        WorkDetailResponse workDetailResponse = (WorkDetailResponse) obj;
        return j42.c(this.awemeDetail, workDetailResponse.awemeDetail) && this.statusCode == workDetailResponse.statusCode;
    }

    public final Aweme getAwemeDetail() {
        return this.awemeDetail;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        Aweme aweme = this.awemeDetail;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "WorkDetailResponse(awemeDetail=" + this.awemeDetail + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WorkDetailResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkDetailResponse() {
        this((Aweme) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public WorkDetailResponse(Aweme aweme, int i) {
        this.awemeDetail = aweme;
        this.statusCode = i;
    }

    public /* synthetic */ WorkDetailResponse(Aweme aweme, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : aweme, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getAwemeDetail$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
