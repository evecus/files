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
public final class ApiStatusResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int statusCode;
    private final String statusMsg;

    public /* synthetic */ ApiStatusResponse(int i, int i2, String str, yj4 yj4Var) {
        this.statusCode = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.statusMsg = "";
        } else {
            this.statusMsg = str;
        }
    }

    public static /* synthetic */ ApiStatusResponse copy$default(ApiStatusResponse apiStatusResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = apiStatusResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = apiStatusResponse.statusMsg;
        }
        return apiStatusResponse.copy(i, str);
    }

    public static final /* synthetic */ void write$Self$app(ApiStatusResponse apiStatusResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || apiStatusResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 0, apiStatusResponse.statusCode);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(apiStatusResponse.statusMsg, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 1, apiStatusResponse.statusMsg);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMsg;
    }

    public final ApiStatusResponse copy(int i, String str) {
        str.getClass();
        return new ApiStatusResponse(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiStatusResponse)) {
            return false;
        }
        ApiStatusResponse apiStatusResponse = (ApiStatusResponse) obj;
        return this.statusCode == apiStatusResponse.statusCode && j42.c(this.statusMsg, apiStatusResponse.statusMsg);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public int hashCode() {
        return this.statusMsg.hashCode() + (this.statusCode * 31);
    }

    public String toString() {
        return "ApiStatusResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return ApiStatusResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiStatusResponse() {
        this(0, (String) null, 3, (er0) (0 == true ? 1 : 0));
    }

    public ApiStatusResponse(int i, String str) {
        str.getClass();
        this.statusCode = i;
        this.statusMsg = str;
    }

    public /* synthetic */ ApiStatusResponse(int i, String str, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getStatusMsg$annotations() {
    }
}
