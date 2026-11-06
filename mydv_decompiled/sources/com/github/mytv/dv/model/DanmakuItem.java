package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.pt1;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DanmakuItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String danmakuId;
    private final int danmakuType;
    private final int danmakuTypeBits;
    private final int diggCount;
    private final int diggType;
    private final int dislikeType;
    private final boolean fromCopy;
    private final boolean hasEmoji;
    private final boolean isAd;
    private final String itemId;
    private final long offsetTime;
    private final double score;
    private final boolean showCopy;
    private final boolean showDigg;
    private final int status;
    private final String text;
    private final String userId;

    public /* synthetic */ DanmakuItem(String str, String str2, String str3, long j, String str4, int i, int i2, double d, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4, int i6, boolean z5, int i7, er0 er0Var) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? 0L : j, (i7 & 16) == 0 ? str4 : "", (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0.0d : d, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? false : z, (i7 & 2048) != 0 ? false : z2, (i7 & 4096) != 0 ? false : z3, (i7 & 8192) != 0 ? 0 : i5, (i7 & 16384) != 0 ? false : z4, (i7 & 32768) != 0 ? 0 : i6, (i7 & 65536) != 0 ? false : z5);
    }

    public static /* synthetic */ DanmakuItem copy$default(DanmakuItem danmakuItem, String str, String str2, String str3, long j, String str4, int i, int i2, double d, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4, int i6, boolean z5, int i7, Object obj) {
        boolean z6;
        int i8;
        String str5 = (i7 & 1) != 0 ? danmakuItem.danmakuId : str;
        String str6 = (i7 & 2) != 0 ? danmakuItem.itemId : str2;
        String str7 = (i7 & 4) != 0 ? danmakuItem.userId : str3;
        long j2 = (i7 & 8) != 0 ? danmakuItem.offsetTime : j;
        String str8 = (i7 & 16) != 0 ? danmakuItem.text : str4;
        int i9 = (i7 & 32) != 0 ? danmakuItem.status : i;
        int i10 = (i7 & 64) != 0 ? danmakuItem.diggType : i2;
        double d2 = (i7 & 128) != 0 ? danmakuItem.score : d;
        int i11 = (i7 & 256) != 0 ? danmakuItem.danmakuType : i3;
        int i12 = (i7 & 512) != 0 ? danmakuItem.diggCount : i4;
        boolean z7 = (i7 & 1024) != 0 ? danmakuItem.showDigg : z;
        boolean z8 = (i7 & 2048) != 0 ? danmakuItem.showCopy : z2;
        String str9 = str5;
        boolean z9 = (i7 & 4096) != 0 ? danmakuItem.fromCopy : z3;
        int i13 = (i7 & 8192) != 0 ? danmakuItem.danmakuTypeBits : i5;
        boolean z10 = (i7 & 16384) != 0 ? danmakuItem.hasEmoji : z4;
        int i14 = (i7 & 32768) != 0 ? danmakuItem.dislikeType : i6;
        if ((i7 & 65536) != 0) {
            i8 = i14;
            z6 = danmakuItem.isAd;
        } else {
            z6 = z5;
            i8 = i14;
        }
        return danmakuItem.copy(str9, str6, str7, j2, str8, i9, i10, d2, i11, i12, z7, z8, z9, i13, z10, i8, z6);
    }

    public static final /* synthetic */ void write$Self$app(DanmakuItem danmakuItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(danmakuItem.danmakuId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, danmakuItem.danmakuId);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(danmakuItem.itemId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, danmakuItem.itemId);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(danmakuItem.userId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, danmakuItem.userId);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.offsetTime != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, danmakuItem.offsetTime);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(danmakuItem.text, "")) {
            ((ax4) me0Var).E(serialDescriptor, 4, danmakuItem.text);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.status != 0) {
            ((ax4) me0Var).A(serialDescriptor, 5, danmakuItem.status);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.diggType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 6, danmakuItem.diggType);
        }
        if (me0Var.q(serialDescriptor) || Double.compare(danmakuItem.score, 0.0d) != 0) {
            ((ax4) me0Var).w(serialDescriptor, 7, danmakuItem.score);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.danmakuType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 8, danmakuItem.danmakuType);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.diggCount != 0) {
            ((ax4) me0Var).A(serialDescriptor, 9, danmakuItem.diggCount);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.showDigg) {
            ((ax4) me0Var).t(serialDescriptor, 10, danmakuItem.showDigg);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.showCopy) {
            ((ax4) me0Var).t(serialDescriptor, 11, danmakuItem.showCopy);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.fromCopy) {
            ((ax4) me0Var).t(serialDescriptor, 12, danmakuItem.fromCopy);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.danmakuTypeBits != 0) {
            ((ax4) me0Var).A(serialDescriptor, 13, danmakuItem.danmakuTypeBits);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.hasEmoji) {
            ((ax4) me0Var).t(serialDescriptor, 14, danmakuItem.hasEmoji);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.dislikeType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 15, danmakuItem.dislikeType);
        }
        if (me0Var.q(serialDescriptor) || danmakuItem.isAd) {
            ((ax4) me0Var).t(serialDescriptor, 16, danmakuItem.isAd);
        }
    }

    public final String component1() {
        return this.danmakuId;
    }

    public final int component10() {
        return this.diggCount;
    }

    public final boolean component11() {
        return this.showDigg;
    }

    public final boolean component12() {
        return this.showCopy;
    }

    public final boolean component13() {
        return this.fromCopy;
    }

    public final int component14() {
        return this.danmakuTypeBits;
    }

    public final boolean component15() {
        return this.hasEmoji;
    }

    public final int component16() {
        return this.dislikeType;
    }

    public final boolean component17() {
        return this.isAd;
    }

    public final String component2() {
        return this.itemId;
    }

    public final String component3() {
        return this.userId;
    }

    public final long component4() {
        return this.offsetTime;
    }

    public final String component5() {
        return this.text;
    }

    public final int component6() {
        return this.status;
    }

    public final int component7() {
        return this.diggType;
    }

    public final double component8() {
        return this.score;
    }

    public final int component9() {
        return this.danmakuType;
    }

    public final DanmakuItem copy(String str, String str2, String str3, long j, String str4, int i, int i2, double d, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4, int i6, boolean z5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new DanmakuItem(str, str2, str3, j, str4, i, i2, d, i3, i4, z, z2, z3, i5, z4, i6, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DanmakuItem)) {
            return false;
        }
        DanmakuItem danmakuItem = (DanmakuItem) obj;
        return j42.c(this.danmakuId, danmakuItem.danmakuId) && j42.c(this.itemId, danmakuItem.itemId) && j42.c(this.userId, danmakuItem.userId) && this.offsetTime == danmakuItem.offsetTime && j42.c(this.text, danmakuItem.text) && this.status == danmakuItem.status && this.diggType == danmakuItem.diggType && Double.compare(this.score, danmakuItem.score) == 0 && this.danmakuType == danmakuItem.danmakuType && this.diggCount == danmakuItem.diggCount && this.showDigg == danmakuItem.showDigg && this.showCopy == danmakuItem.showCopy && this.fromCopy == danmakuItem.fromCopy && this.danmakuTypeBits == danmakuItem.danmakuTypeBits && this.hasEmoji == danmakuItem.hasEmoji && this.dislikeType == danmakuItem.dislikeType && this.isAd == danmakuItem.isAd;
    }

    public final String getDanmakuId() {
        return this.danmakuId;
    }

    public final int getDanmakuType() {
        return this.danmakuType;
    }

    public final int getDanmakuTypeBits() {
        return this.danmakuTypeBits;
    }

    public final int getDiggCount() {
        return this.diggCount;
    }

    public final int getDiggType() {
        return this.diggType;
    }

    public final int getDislikeType() {
        return this.dislikeType;
    }

    public final boolean getFromCopy() {
        return this.fromCopy;
    }

    public final boolean getHasEmoji() {
        return this.hasEmoji;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final long getOffsetTime() {
        return this.offsetTime;
    }

    public final double getScore() {
        return this.score;
    }

    public final boolean getShowCopy() {
        return this.showCopy;
    }

    public final boolean getShowDigg() {
        return this.showDigg;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return pt1.o(this.isAd) + ((((pt1.o(this.hasEmoji) + ((((pt1.o(this.fromCopy) + ((pt1.o(this.showCopy) + ((pt1.o(this.showDigg) + ((((((nt3.i(this.score) + ((((hf1.n((i82.Q(this.offsetTime) + hf1.n(hf1.n(this.danmakuId.hashCode() * 31, 31, this.itemId), 31, this.userId)) * 31, 31, this.text) + this.status) * 31) + this.diggType) * 31)) * 31) + this.danmakuType) * 31) + this.diggCount) * 31)) * 31)) * 31)) * 31) + this.danmakuTypeBits) * 31)) * 31) + this.dislikeType) * 31);
    }

    public final boolean isAd() {
        return this.isAd;
    }

    public String toString() {
        String str = this.danmakuId;
        String str2 = this.itemId;
        String str3 = this.userId;
        long j = this.offsetTime;
        String str4 = this.text;
        int i = this.status;
        int i2 = this.diggType;
        double d = this.score;
        int i3 = this.danmakuType;
        int i4 = this.diggCount;
        boolean z = this.showDigg;
        boolean z2 = this.showCopy;
        boolean z3 = this.fromCopy;
        int i5 = this.danmakuTypeBits;
        boolean z4 = this.hasEmoji;
        int i6 = this.dislikeType;
        boolean z5 = this.isAd;
        StringBuilder F = r7.F("DanmakuItem(danmakuId=", str, ", itemId=", str2, ", userId=");
        F.append(str3);
        F.append(", offsetTime=");
        F.append(j);
        F.append(", text=");
        F.append(str4);
        F.append(", status=");
        F.append(i);
        F.append(", diggType=");
        F.append(i2);
        F.append(", score=");
        F.append(d);
        F.append(", danmakuType=");
        F.append(i3);
        F.append(", diggCount=");
        F.append(i4);
        F.append(", showDigg=");
        F.append(z);
        F.append(", showCopy=");
        F.append(z2);
        F.append(", fromCopy=");
        F.append(z3);
        F.append(", danmakuTypeBits=");
        F.append(i5);
        F.append(", hasEmoji=");
        F.append(z4);
        F.append(", dislikeType=");
        F.append(i6);
        F.append(", isAd=");
        F.append(z5);
        F.append(")");
        return F.toString();
    }

    public /* synthetic */ DanmakuItem(int i, String str, String str2, String str3, long j, String str4, int i2, int i3, double d, int i4, int i5, boolean z, boolean z2, boolean z3, int i6, boolean z4, int i7, boolean z5, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.danmakuId = "";
        } else {
            this.danmakuId = str;
        }
        if ((i & 2) == 0) {
            this.itemId = "";
        } else {
            this.itemId = str2;
        }
        if ((i & 4) == 0) {
            this.userId = "";
        } else {
            this.userId = str3;
        }
        if ((i & 8) == 0) {
            this.offsetTime = 0L;
        } else {
            this.offsetTime = j;
        }
        if ((i & 16) == 0) {
            this.text = "";
        } else {
            this.text = str4;
        }
        if ((i & 32) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        if ((i & 64) == 0) {
            this.diggType = 0;
        } else {
            this.diggType = i3;
        }
        if ((i & 128) == 0) {
            this.score = 0.0d;
        } else {
            this.score = d;
        }
        if ((i & 256) == 0) {
            this.danmakuType = 0;
        } else {
            this.danmakuType = i4;
        }
        if ((i & 512) == 0) {
            this.diggCount = 0;
        } else {
            this.diggCount = i5;
        }
        if ((i & 1024) == 0) {
            this.showDigg = false;
        } else {
            this.showDigg = z;
        }
        if ((i & 2048) == 0) {
            this.showCopy = false;
        } else {
            this.showCopy = z2;
        }
        if ((i & 4096) == 0) {
            this.fromCopy = false;
        } else {
            this.fromCopy = z3;
        }
        if ((i & 8192) == 0) {
            this.danmakuTypeBits = 0;
        } else {
            this.danmakuTypeBits = i6;
        }
        if ((i & 16384) == 0) {
            this.hasEmoji = false;
        } else {
            this.hasEmoji = z4;
        }
        if ((32768 & i) == 0) {
            this.dislikeType = 0;
        } else {
            this.dislikeType = i7;
        }
        if ((i & 65536) == 0) {
            this.isAd = false;
        } else {
            this.isAd = z5;
        }
    }

    public DanmakuItem(String str, String str2, String str3, long j, String str4, int i, int i2, double d, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4, int i6, boolean z5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.danmakuId = str;
        this.itemId = str2;
        this.userId = str3;
        this.offsetTime = j;
        this.text = str4;
        this.status = i;
        this.diggType = i2;
        this.score = d;
        this.danmakuType = i3;
        this.diggCount = i4;
        this.showDigg = z;
        this.showCopy = z2;
        this.fromCopy = z3;
        this.danmakuTypeBits = i5;
        this.hasEmoji = z4;
        this.dislikeType = i6;
        this.isAd = z5;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return DanmakuItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DanmakuItem() {
        this((String) null, (String) null, (String) null, 0L, (String) null, 0, 0, 0.0d, 0, 0, false, false, false, 0, false, 0, false, 131071, (er0) null);
    }

    public static /* synthetic */ void getDanmakuId$annotations() {
    }

    public static /* synthetic */ void getDanmakuType$annotations() {
    }

    public static /* synthetic */ void getDanmakuTypeBits$annotations() {
    }

    public static /* synthetic */ void getDiggCount$annotations() {
    }

    public static /* synthetic */ void getDiggType$annotations() {
    }

    public static /* synthetic */ void getDislikeType$annotations() {
    }

    public static /* synthetic */ void getFromCopy$annotations() {
    }

    public static /* synthetic */ void getHasEmoji$annotations() {
    }

    public static /* synthetic */ void getItemId$annotations() {
    }

    public static /* synthetic */ void getOffsetTime$annotations() {
    }

    public static /* synthetic */ void getScore$annotations() {
    }

    public static /* synthetic */ void getShowCopy$annotations() {
    }

    public static /* synthetic */ void getShowDigg$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void isAd$annotations() {
    }
}
