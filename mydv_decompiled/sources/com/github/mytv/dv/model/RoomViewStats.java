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
public final class RoomViewStats {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String displayLong;
    private final String displayLongAnchor;
    private final String displayMiddle;
    private final String displayMiddleAnchor;
    private final String displayShort;
    private final String displayShortAnchor;
    private final int displayType;
    private final long displayValue;
    private final long displayVersion;
    private final boolean incremental;
    private final boolean isHidden;

    public /* synthetic */ RoomViewStats(boolean z, String str, String str2, String str3, long j, long j2, boolean z2, int i, String str4, String str5, String str6, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0L : j, (i2 & 32) == 0 ? j2 : 0L, (i2 & 64) != 0 ? false : z2, (i2 & 128) == 0 ? i : 0, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6);
    }

    public static /* synthetic */ RoomViewStats copy$default(RoomViewStats roomViewStats, boolean z, String str, String str2, String str3, long j, long j2, boolean z2, int i, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = roomViewStats.isHidden;
        }
        return roomViewStats.copy(z, (i2 & 2) != 0 ? roomViewStats.displayShort : str, (i2 & 4) != 0 ? roomViewStats.displayMiddle : str2, (i2 & 8) != 0 ? roomViewStats.displayLong : str3, (i2 & 16) != 0 ? roomViewStats.displayValue : j, (i2 & 32) != 0 ? roomViewStats.displayVersion : j2, (i2 & 64) != 0 ? roomViewStats.incremental : z2, (i2 & 128) != 0 ? roomViewStats.displayType : i, (i2 & 256) != 0 ? roomViewStats.displayShortAnchor : str4, (i2 & 512) != 0 ? roomViewStats.displayMiddleAnchor : str5, (i2 & 1024) != 0 ? roomViewStats.displayLongAnchor : str6);
    }

    public static final /* synthetic */ void write$Self$app(RoomViewStats roomViewStats, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || roomViewStats.isHidden) {
            ((ax4) me0Var).C(serialDescriptor, 0, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(roomViewStats.isHidden));
        }
        if (me0Var.q(serialDescriptor) || !j42.c(roomViewStats.displayShort, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, roomViewStats.displayShort);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(roomViewStats.displayMiddle, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, roomViewStats.displayMiddle);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(roomViewStats.displayLong, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, roomViewStats.displayLong);
        }
        if (me0Var.q(serialDescriptor) || roomViewStats.displayValue != 0) {
            ((ax4) me0Var).C(serialDescriptor, 4, FlexibleLongSerializer.INSTANCE, Long.valueOf(roomViewStats.displayValue));
        }
        if (me0Var.q(serialDescriptor) || roomViewStats.displayVersion != 0) {
            ((ax4) me0Var).C(serialDescriptor, 5, FlexibleLongSerializer.INSTANCE, Long.valueOf(roomViewStats.displayVersion));
        }
        if (me0Var.q(serialDescriptor) || roomViewStats.incremental) {
            ((ax4) me0Var).C(serialDescriptor, 6, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(roomViewStats.incremental));
        }
        if (me0Var.q(serialDescriptor) || roomViewStats.displayType != 0) {
            ((ax4) me0Var).C(serialDescriptor, 7, FlexibleIntSerializer.INSTANCE, Integer.valueOf(roomViewStats.displayType));
        }
        if (me0Var.q(serialDescriptor) || !j42.c(roomViewStats.displayShortAnchor, "")) {
            ((ax4) me0Var).E(serialDescriptor, 8, roomViewStats.displayShortAnchor);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(roomViewStats.displayMiddleAnchor, "")) {
            ((ax4) me0Var).E(serialDescriptor, 9, roomViewStats.displayMiddleAnchor);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(roomViewStats.displayLongAnchor, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 10, roomViewStats.displayLongAnchor);
    }

    public final boolean component1() {
        return this.isHidden;
    }

    public final String component10() {
        return this.displayMiddleAnchor;
    }

    public final String component11() {
        return this.displayLongAnchor;
    }

    public final String component2() {
        return this.displayShort;
    }

    public final String component3() {
        return this.displayMiddle;
    }

    public final String component4() {
        return this.displayLong;
    }

    public final long component5() {
        return this.displayValue;
    }

    public final long component6() {
        return this.displayVersion;
    }

    public final boolean component7() {
        return this.incremental;
    }

    public final int component8() {
        return this.displayType;
    }

    public final String component9() {
        return this.displayShortAnchor;
    }

    public final RoomViewStats copy(boolean z, String str, String str2, String str3, long j, long j2, boolean z2, int i, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new RoomViewStats(z, str, str2, str3, j, j2, z2, i, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomViewStats)) {
            return false;
        }
        RoomViewStats roomViewStats = (RoomViewStats) obj;
        return this.isHidden == roomViewStats.isHidden && j42.c(this.displayShort, roomViewStats.displayShort) && j42.c(this.displayMiddle, roomViewStats.displayMiddle) && j42.c(this.displayLong, roomViewStats.displayLong) && this.displayValue == roomViewStats.displayValue && this.displayVersion == roomViewStats.displayVersion && this.incremental == roomViewStats.incremental && this.displayType == roomViewStats.displayType && j42.c(this.displayShortAnchor, roomViewStats.displayShortAnchor) && j42.c(this.displayMiddleAnchor, roomViewStats.displayMiddleAnchor) && j42.c(this.displayLongAnchor, roomViewStats.displayLongAnchor);
    }

    public final String getDisplayLong() {
        return this.displayLong;
    }

    public final String getDisplayLongAnchor() {
        return this.displayLongAnchor;
    }

    public final String getDisplayMiddle() {
        return this.displayMiddle;
    }

    public final String getDisplayMiddleAnchor() {
        return this.displayMiddleAnchor;
    }

    public final String getDisplayShort() {
        return this.displayShort;
    }

    public final String getDisplayShortAnchor() {
        return this.displayShortAnchor;
    }

    public final int getDisplayType() {
        return this.displayType;
    }

    public final long getDisplayValue() {
        return this.displayValue;
    }

    public final long getDisplayVersion() {
        return this.displayVersion;
    }

    public final boolean getIncremental() {
        return this.incremental;
    }

    public int hashCode() {
        int n = hf1.n(hf1.n(hf1.n((this.isHidden ? 1231 : 1237) * 31, 31, this.displayShort), 31, this.displayMiddle), 31, this.displayLong);
        long j = this.displayValue;
        int i = (n + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.displayVersion;
        return this.displayLongAnchor.hashCode() + hf1.n(hf1.n((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.incremental ? 1231 : 1237)) * 31) + this.displayType) * 31, 31, this.displayShortAnchor), 31, this.displayMiddleAnchor);
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        boolean z = this.isHidden;
        String str = this.displayShort;
        String str2 = this.displayMiddle;
        String str3 = this.displayLong;
        long j = this.displayValue;
        long j2 = this.displayVersion;
        boolean z2 = this.incremental;
        int i = this.displayType;
        String str4 = this.displayShortAnchor;
        String str5 = this.displayMiddleAnchor;
        String str6 = this.displayLongAnchor;
        StringBuilder sb = new StringBuilder("RoomViewStats(isHidden=");
        sb.append(z);
        sb.append(", displayShort=");
        sb.append(str);
        sb.append(", displayMiddle=");
        r7.N(sb, str2, ", displayLong=", str3, ", displayValue=");
        sb.append(j);
        sb.append(", displayVersion=");
        sb.append(j2);
        sb.append(", incremental=");
        sb.append(z2);
        sb.append(", displayType=");
        sb.append(i);
        sb.append(", displayShortAnchor=");
        r7.N(sb, str4, ", displayMiddleAnchor=", str5, ", displayLongAnchor=");
        return hf1.z(sb, str6, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return RoomViewStats$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getDisplayLong$annotations() {
    }

    public static /* synthetic */ void getDisplayLongAnchor$annotations() {
    }

    public static /* synthetic */ void getDisplayMiddle$annotations() {
    }

    public static /* synthetic */ void getDisplayMiddleAnchor$annotations() {
    }

    public static /* synthetic */ void getDisplayShort$annotations() {
    }

    public static /* synthetic */ void getDisplayShortAnchor$annotations() {
    }

    public static /* synthetic */ void getDisplayType$annotations() {
    }

    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    public static /* synthetic */ void getDisplayVersion$annotations() {
    }

    public static /* synthetic */ void getIncremental$annotations() {
    }

    public static /* synthetic */ void isHidden$annotations() {
    }

    public /* synthetic */ RoomViewStats(int i, boolean z, String str, String str2, String str3, long j, long j2, boolean z2, int i2, String str4, String str5, String str6, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.isHidden = false;
        } else {
            this.isHidden = z;
        }
        if ((i & 2) == 0) {
            this.displayShort = "";
        } else {
            this.displayShort = str;
        }
        if ((i & 4) == 0) {
            this.displayMiddle = "";
        } else {
            this.displayMiddle = str2;
        }
        if ((i & 8) == 0) {
            this.displayLong = "";
        } else {
            this.displayLong = str3;
        }
        if ((i & 16) == 0) {
            this.displayValue = 0L;
        } else {
            this.displayValue = j;
        }
        if ((i & 32) == 0) {
            this.displayVersion = 0L;
        } else {
            this.displayVersion = j2;
        }
        if ((i & 64) == 0) {
            this.incremental = false;
        } else {
            this.incremental = z2;
        }
        if ((i & 128) == 0) {
            this.displayType = 0;
        } else {
            this.displayType = i2;
        }
        if ((i & 256) == 0) {
            this.displayShortAnchor = "";
        } else {
            this.displayShortAnchor = str4;
        }
        if ((i & 512) == 0) {
            this.displayMiddleAnchor = "";
        } else {
            this.displayMiddleAnchor = str5;
        }
        if ((i & 1024) == 0) {
            this.displayLongAnchor = "";
        } else {
            this.displayLongAnchor = str6;
        }
    }

    public RoomViewStats(boolean z, String str, String str2, String str3, long j, long j2, boolean z2, int i, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.isHidden = z;
        this.displayShort = str;
        this.displayMiddle = str2;
        this.displayLong = str3;
        this.displayValue = j;
        this.displayVersion = j2;
        this.incremental = z2;
        this.displayType = i;
        this.displayShortAnchor = str4;
        this.displayMiddleAnchor = str5;
        this.displayLongAnchor = str6;
    }

    public RoomViewStats() {
        this(false, (String) null, (String) null, (String) null, 0L, 0L, false, 0, (String) null, (String) null, (String) null, 2047, (er0) null);
    }
}
