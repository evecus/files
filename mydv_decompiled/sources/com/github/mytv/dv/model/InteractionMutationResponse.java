package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.x22;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class InteractionMutationResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer isCollect;
    private final Integer isDigg;
    private final int statusCode;
    private final String statusMsg;

    public /* synthetic */ InteractionMutationResponse(int i, int i2, String str, Integer num, Integer num2, yj4 yj4Var) {
        this.statusCode = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.statusMsg = "";
        } else {
            this.statusMsg = str;
        }
        if ((i & 4) == 0) {
            this.isDigg = null;
        } else {
            this.isDigg = num;
        }
        if ((i & 8) == 0) {
            this.isCollect = null;
        } else {
            this.isCollect = num2;
        }
    }

    public static /* synthetic */ InteractionMutationResponse copy$default(InteractionMutationResponse interactionMutationResponse, int i, String str, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = interactionMutationResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = interactionMutationResponse.statusMsg;
        }
        if ((i2 & 4) != 0) {
            num = interactionMutationResponse.isDigg;
        }
        if ((i2 & 8) != 0) {
            num2 = interactionMutationResponse.isCollect;
        }
        return interactionMutationResponse.copy(i, str, num, num2);
    }

    public static final /* synthetic */ void write$Self$app(InteractionMutationResponse interactionMutationResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || interactionMutationResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 0, interactionMutationResponse.statusCode);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(interactionMutationResponse.statusMsg, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, interactionMutationResponse.statusMsg);
        }
        if (me0Var.q(serialDescriptor) || interactionMutationResponse.isDigg != null) {
            me0Var.k(serialDescriptor, 2, x22.a, interactionMutationResponse.isDigg);
        }
        if (!me0Var.q(serialDescriptor) && interactionMutationResponse.isCollect == null) {
            return;
        }
        me0Var.k(serialDescriptor, 3, x22.a, interactionMutationResponse.isCollect);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMsg;
    }

    public final Integer component3() {
        return this.isDigg;
    }

    public final Integer component4() {
        return this.isCollect;
    }

    public final InteractionMutationResponse copy(int i, String str, Integer num, Integer num2) {
        str.getClass();
        return new InteractionMutationResponse(i, str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionMutationResponse)) {
            return false;
        }
        InteractionMutationResponse interactionMutationResponse = (InteractionMutationResponse) obj;
        return this.statusCode == interactionMutationResponse.statusCode && j42.c(this.statusMsg, interactionMutationResponse.statusMsg) && j42.c(this.isDigg, interactionMutationResponse.isDigg) && j42.c(this.isCollect, interactionMutationResponse.isCollect);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public int hashCode() {
        int n = hf1.n(this.statusCode * 31, 31, this.statusMsg);
        Integer num = this.isDigg;
        int hashCode = (n + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isCollect;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer isCollect() {
        return this.isCollect;
    }

    public final Integer isDigg() {
        return this.isDigg;
    }

    public String toString() {
        return "InteractionMutationResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", isDigg=" + this.isDigg + ", isCollect=" + this.isCollect + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return InteractionMutationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getStatusMsg$annotations() {
    }

    public static /* synthetic */ void isCollect$annotations() {
    }

    public static /* synthetic */ void isDigg$annotations() {
    }

    public InteractionMutationResponse() {
        this(0, (String) null, (Integer) null, (Integer) null, 15, (er0) null);
    }

    public InteractionMutationResponse(int i, String str, Integer num, Integer num2) {
        str.getClass();
        this.statusCode = i;
        this.statusMsg = str;
        this.isDigg = num;
        this.isCollect = num2;
    }

    public /* synthetic */ InteractionMutationResponse(int i, String str, Integer num, Integer num2, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }
}
