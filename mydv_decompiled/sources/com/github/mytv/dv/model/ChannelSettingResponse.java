package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.u7;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ChannelSettingResponse {
    private final List<ChannelItem> data;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new u7((byte) 8)), null};

    public /* synthetic */ ChannelSettingResponse(int i, List list, int i2, yj4 yj4Var) {
        this.data = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(ChannelItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelSettingResponse copy$default(ChannelSettingResponse channelSettingResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = channelSettingResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = channelSettingResponse.statusCode;
        }
        return channelSettingResponse.copy(list, i);
    }

    public static final /* synthetic */ void write$Self$app(ChannelSettingResponse channelSettingResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || channelSettingResponse.data != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), channelSettingResponse.data);
        }
        if (!me0Var.q(serialDescriptor) && channelSettingResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, channelSettingResponse.statusCode);
    }

    public final List<ChannelItem> component1() {
        return this.data;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final ChannelSettingResponse copy(List<ChannelItem> list, int i) {
        return new ChannelSettingResponse(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelSettingResponse)) {
            return false;
        }
        ChannelSettingResponse channelSettingResponse = (ChannelSettingResponse) obj;
        return j42.c(this.data, channelSettingResponse.data) && this.statusCode == channelSettingResponse.statusCode;
    }

    public final List<ChannelItem> getData() {
        return this.data;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<ChannelItem> list = this.data;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "ChannelSettingResponse(data=" + this.data + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return ChannelSettingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingResponse() {
        this((List) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public ChannelSettingResponse(List<ChannelItem> list, int i) {
        this.data = list;
        this.statusCode = i;
    }

    public /* synthetic */ ChannelSettingResponse(List list, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
