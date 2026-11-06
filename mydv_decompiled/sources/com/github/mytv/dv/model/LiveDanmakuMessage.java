package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveDanmakuMessage {
    public static final int $stable = 0;
    private final int badgeLevel;
    private final String badgeName;
    private final String content;
    private final boolean isVip;
    private final int level;
    private final long messageId;
    private final int onlineCount;
    private final long timestamp;
    private final String type;
    private final String userId;
    private final String userName;

    public /* synthetic */ LiveDanmakuMessage(long j, String str, String str2, long j2, String str3, int i, boolean z, String str4, int i2, String str5, int i3, int i4, er0 er0Var) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? System.currentTimeMillis() : j2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? false : z, (i4 & 128) == 0 ? str4 : "", (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? "chat" : str5, (i4 & 1024) != 0 ? 0 : i3);
    }

    public final long component1() {
        return this.messageId;
    }

    public final String component10() {
        return this.type;
    }

    public final int component11() {
        return this.onlineCount;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.content;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final String component5() {
        return this.userId;
    }

    public final int component6() {
        return this.level;
    }

    public final boolean component7() {
        return this.isVip;
    }

    public final String component8() {
        return this.badgeName;
    }

    public final int component9() {
        return this.badgeLevel;
    }

    public final LiveDanmakuMessage copy(long j, String str, String str2, long j2, String str3, int i, boolean z, String str4, int i2, String str5, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new LiveDanmakuMessage(j, str, str2, j2, str3, i, z, str4, i2, str5, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveDanmakuMessage)) {
            return false;
        }
        LiveDanmakuMessage liveDanmakuMessage = (LiveDanmakuMessage) obj;
        return this.messageId == liveDanmakuMessage.messageId && j42.c(this.userName, liveDanmakuMessage.userName) && j42.c(this.content, liveDanmakuMessage.content) && this.timestamp == liveDanmakuMessage.timestamp && j42.c(this.userId, liveDanmakuMessage.userId) && this.level == liveDanmakuMessage.level && this.isVip == liveDanmakuMessage.isVip && j42.c(this.badgeName, liveDanmakuMessage.badgeName) && this.badgeLevel == liveDanmakuMessage.badgeLevel && j42.c(this.type, liveDanmakuMessage.type) && this.onlineCount == liveDanmakuMessage.onlineCount;
    }

    public final int getBadgeLevel() {
        return this.badgeLevel;
    }

    public final String getBadgeName() {
        return this.badgeName;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final int getOnlineCount() {
        return this.onlineCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        long j = this.messageId;
        int n = hf1.n(hf1.n(((int) (j ^ (j >>> 32))) * 31, 31, this.userName), 31, this.content);
        long j2 = this.timestamp;
        return hf1.n((hf1.n((((hf1.n((n + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.userId) + this.level) * 31) + (this.isVip ? 1231 : 1237)) * 31, 31, this.badgeName) + this.badgeLevel) * 31, 31, this.type) + this.onlineCount;
    }

    public final boolean isVip() {
        return this.isVip;
    }

    public String toString() {
        return "LiveDanmakuMessage(messageId=" + this.messageId + ", userName=" + this.userName + ", content=" + this.content + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", level=" + this.level + ", isVip=" + this.isVip + ", badgeName=" + this.badgeName + ", badgeLevel=" + this.badgeLevel + ", type=" + this.type + ", onlineCount=" + this.onlineCount + ")";
    }

    public LiveDanmakuMessage(long j, String str, String str2, long j2, String str3, int i, boolean z, String str4, int i2, String str5, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.messageId = j;
        this.userName = str;
        this.content = str2;
        this.timestamp = j2;
        this.userId = str3;
        this.level = i;
        this.isVip = z;
        this.badgeName = str4;
        this.badgeLevel = i2;
        this.type = str5;
        this.onlineCount = i3;
    }

    public LiveDanmakuMessage() {
        this(0L, null, null, 0L, null, 0, false, null, 0, null, 0, 2047, null);
    }
}
