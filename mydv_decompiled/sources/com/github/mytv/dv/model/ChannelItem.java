package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ChannelItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chId;
    private final String chName;
    private final String tagId;

    public /* synthetic */ ChannelItem(int i, String str, String str2, String str3, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.chName = "";
        } else {
            this.chName = str;
        }
        if ((i & 2) == 0) {
            this.tagId = "";
        } else {
            this.tagId = str2;
        }
        if ((i & 4) == 0) {
            this.chId = "";
        } else {
            this.chId = str3;
        }
    }

    public static /* synthetic */ ChannelItem copy$default(ChannelItem channelItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelItem.chName;
        }
        if ((i & 2) != 0) {
            str2 = channelItem.tagId;
        }
        if ((i & 4) != 0) {
            str3 = channelItem.chId;
        }
        return channelItem.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(ChannelItem channelItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(channelItem.chName, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, channelItem.chName);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(channelItem.tagId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, channelItem.tagId);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(channelItem.chId, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 2, channelItem.chId);
    }

    public final String component1() {
        return this.chName;
    }

    public final String component2() {
        return this.tagId;
    }

    public final String component3() {
        return this.chId;
    }

    public final ChannelItem copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ChannelItem(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelItem)) {
            return false;
        }
        ChannelItem channelItem = (ChannelItem) obj;
        return j42.c(this.chName, channelItem.chName) && j42.c(this.tagId, channelItem.tagId) && j42.c(this.chId, channelItem.chId);
    }

    public final String getChId() {
        return this.chId;
    }

    public final String getChName() {
        return this.chName;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public int hashCode() {
        return this.chId.hashCode() + hf1.n(this.chName.hashCode() * 31, 31, this.tagId);
    }

    public String toString() {
        String str = this.chName;
        String str2 = this.tagId;
        return hf1.z(r7.F("ChannelItem(chName=", str, ", tagId=", str2, ", chId="), this.chId, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return ChannelItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getChId$annotations() {
    }

    public static /* synthetic */ void getChName$annotations() {
    }

    public static /* synthetic */ void getTagId$annotations() {
    }

    public ChannelItem() {
        this((String) null, (String) null, (String) null, 7, (er0) null);
    }

    public ChannelItem(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.chName = str;
        this.tagId = str2;
        this.chId = str3;
    }

    public /* synthetic */ ChannelItem(String str, String str2, String str3, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
