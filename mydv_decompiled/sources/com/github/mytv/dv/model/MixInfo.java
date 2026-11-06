package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.c72;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MixInfo {
    private final Cover coverUrl;
    private final String desc;
    private final String mixId;
    private final String mixName;
    private final MixStatis statis;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MixInfo(String str, String str2, String str3, Cover cover, MixStatis mixStatis, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new Cover((List) null, 1, (er0) (0 == true ? 1 : 0)) : cover, (i & 16) != 0 ? new MixStatis(0, 0, 0, 0L, 0L, 31, (er0) null) : mixStatis);
    }

    public static /* synthetic */ MixInfo copy$default(MixInfo mixInfo, String str, String str2, String str3, Cover cover, MixStatis mixStatis, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mixInfo.mixId;
        }
        if ((i & 2) != 0) {
            str2 = mixInfo.mixName;
        }
        if ((i & 4) != 0) {
            str3 = mixInfo.desc;
        }
        if ((i & 8) != 0) {
            cover = mixInfo.coverUrl;
        }
        if ((i & 16) != 0) {
            mixStatis = mixInfo.statis;
        }
        MixStatis mixStatis2 = mixStatis;
        String str4 = str3;
        return mixInfo.copy(str, str2, str4, cover, mixStatis2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$app(MixInfo mixInfo, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(mixInfo.mixId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, mixInfo.mixId);
        }
        int i = 1;
        if (me0Var.q(serialDescriptor) || !j42.c(mixInfo.mixName, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, mixInfo.mixName);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(mixInfo.desc, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, mixInfo.desc);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(mixInfo.coverUrl, new Cover((List) null, i, (er0) (0 == true ? 1 : 0)))) {
            ((ax4) me0Var).C(serialDescriptor, 3, Cover$$serializer.INSTANCE, mixInfo.coverUrl);
        }
        if (!me0Var.q(serialDescriptor)) {
            if (j42.c(mixInfo.statis, new MixStatis(0, 0, 0, 0L, 0L, 31, (er0) null))) {
                return;
            }
        }
        ((ax4) me0Var).C(serialDescriptor, 4, MixStatis$$serializer.INSTANCE, mixInfo.statis);
    }

    public final String component1() {
        return this.mixId;
    }

    public final String component2() {
        return this.mixName;
    }

    public final String component3() {
        return this.desc;
    }

    public final Cover component4() {
        return this.coverUrl;
    }

    public final MixStatis component5() {
        return this.statis;
    }

    public final MixInfo copy(String str, String str2, String str3, Cover cover, MixStatis mixStatis) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cover.getClass();
        mixStatis.getClass();
        return new MixInfo(str, str2, str3, cover, mixStatis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixInfo)) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) obj;
        return j42.c(this.mixId, mixInfo.mixId) && j42.c(this.mixName, mixInfo.mixName) && j42.c(this.desc, mixInfo.desc) && j42.c(this.coverUrl, mixInfo.coverUrl) && j42.c(this.statis, mixInfo.statis);
    }

    public final Cover getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final String getMixName() {
        return this.mixName;
    }

    public final MixStatis getStatis() {
        return this.statis;
    }

    public int hashCode() {
        return this.statis.hashCode() + ((this.coverUrl.hashCode() + hf1.n(hf1.n(this.mixId.hashCode() * 31, 31, this.mixName), 31, this.desc)) * 31);
    }

    public String toString() {
        String str = this.mixId;
        String str2 = this.mixName;
        String str3 = this.desc;
        Cover cover = this.coverUrl;
        MixStatis mixStatis = this.statis;
        StringBuilder F = r7.F("MixInfo(mixId=", str, ", mixName=", str2, ", desc=");
        F.append(str3);
        F.append(", coverUrl=");
        F.append(cover);
        F.append(", statis=");
        F.append(mixStatis);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return MixInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCoverUrl$annotations() {
    }

    public static /* synthetic */ void getDesc$annotations() {
    }

    @c72(names = {"series_id"})
    public static /* synthetic */ void getMixId$annotations() {
    }

    @c72(names = {"series_name"})
    public static /* synthetic */ void getMixName$annotations() {
    }

    public static /* synthetic */ void getStatis$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MixInfo(int i, String str, String str2, String str3, Cover cover, MixStatis mixStatis, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.mixId = "";
        } else {
            this.mixId = str;
        }
        if ((i & 2) == 0) {
            this.mixName = "";
        } else {
            this.mixName = str2;
        }
        if ((i & 4) == 0) {
            this.desc = "";
        } else {
            this.desc = str3;
        }
        if ((i & 8) == 0) {
            this.coverUrl = new Cover((List) null, 1, (er0) (0 == true ? 1 : 0));
        } else {
            this.coverUrl = cover;
        }
        if ((i & 16) != 0) {
            this.statis = mixStatis;
            return;
        }
        this.statis = new MixStatis(0, 0, 0, 0L, 0L, 31, (er0) null);
    }

    public MixInfo(String str, String str2, String str3, Cover cover, MixStatis mixStatis) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cover.getClass();
        mixStatis.getClass();
        this.mixId = str;
        this.mixName = str2;
        this.desc = str3;
        this.coverUrl = cover;
        this.statis = mixStatis;
    }

    public MixInfo() {
        this((String) null, (String) null, (String) null, (Cover) null, (MixStatis) null, 31, (er0) null);
    }
}
