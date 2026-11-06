package com.github.mytv.dv.model;

import defpackage.c72;
import defpackage.er0;
import defpackage.hf1;
import defpackage.i82;
import defpackage.j42;
import defpackage.r7;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Aweme {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authenticationToken;
    private final Author author;
    private final String awemeId;
    private final int awemeType;
    private final long collectStat;
    private final long createTime;
    private final String desc;
    private final MixInfo mixInfo;
    private final PlayProgress playProgress;
    private final Statistics statistics;
    private final long userDigged;
    private final Video video;

    public /* synthetic */ Aweme(int i, String str, String str2, Video video, Author author, Statistics statistics, long j, int i2, PlayProgress playProgress, long j2, long j3, String str3, MixInfo mixInfo, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.awemeId = "";
        } else {
            this.awemeId = str;
        }
        if ((i & 2) == 0) {
            this.desc = "";
        } else {
            this.desc = str2;
        }
        if ((i & 4) == 0) {
            this.video = new Video((List) null, (PlayAddr) null, (PlayAddr) null, (PlayAddr) null, (Cover) null, (Cover) null, (Cover) null, (List) null, 0, 0, 0, (String) null, (String) null, 8191, (er0) null);
        } else {
            this.video = video;
        }
        if ((i & 8) == 0) {
            this.author = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.author = author;
        }
        if ((i & 16) == 0) {
            this.statistics = new Statistics(0L, 0L, 0L, 0L, 0L, 31, (er0) null);
        } else {
            this.statistics = statistics;
        }
        if ((i & 32) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        this.awemeType = (i & 64) == 0 ? 0 : i2;
        this.playProgress = (i & 128) == 0 ? new PlayProgress(0L, 0L, (Long) null, 7, (er0) null) : playProgress;
        if ((i & 256) == 0) {
            this.userDigged = 0L;
        } else {
            this.userDigged = j2;
        }
        this.collectStat = (i & 512) != 0 ? j3 : 0L;
        if ((i & 1024) == 0) {
            this.authenticationToken = "";
        } else {
            this.authenticationToken = str3;
        }
        this.mixInfo = (i & 2048) == 0 ? null : mixInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (defpackage.j42.c(r25.video, new com.github.mytv.dv.model.Video((java.util.List) null, (com.github.mytv.dv.model.PlayAddr) null, (com.github.mytv.dv.model.PlayAddr) null, (com.github.mytv.dv.model.PlayAddr) null, (com.github.mytv.dv.model.Cover) null, (com.github.mytv.dv.model.Cover) null, (com.github.mytv.dv.model.Cover) null, (java.util.List) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, 8191, (defpackage.er0) null)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (defpackage.j42.c(r25.author, new com.github.mytv.dv.model.Author((java.lang.String) null, (java.lang.String) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, 0, 4095, (defpackage.er0) null)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (defpackage.j42.c(r25.statistics, new com.github.mytv.dv.model.Statistics(0, 0, 0, 0, 0, 31, (defpackage.er0) null)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        if (defpackage.j42.c(r25.playProgress, new com.github.mytv.dv.model.PlayProgress(0, 0, (java.lang.Long) null, 7, (defpackage.er0) null)) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.github.mytv.dv.model.Aweme r25, defpackage.me0 r26, kotlinx.serialization.descriptors.SerialDescriptor r27) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.Aweme.write$Self$app(com.github.mytv.dv.model.Aweme, me0, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.awemeId;
    }

    public final long component10() {
        return this.collectStat;
    }

    public final String component11() {
        return this.authenticationToken;
    }

    public final MixInfo component12() {
        return this.mixInfo;
    }

    public final String component2() {
        return this.desc;
    }

    public final Video component3() {
        return this.video;
    }

    public final Author component4() {
        return this.author;
    }

    public final Statistics component5() {
        return this.statistics;
    }

    public final long component6() {
        return this.createTime;
    }

    public final int component7() {
        return this.awemeType;
    }

    public final PlayProgress component8() {
        return this.playProgress;
    }

    public final long component9() {
        return this.userDigged;
    }

    public final Aweme copy(String str, String str2, Video video, Author author, Statistics statistics, long j, int i, PlayProgress playProgress, long j2, long j3, String str3, MixInfo mixInfo) {
        str.getClass();
        str2.getClass();
        video.getClass();
        author.getClass();
        statistics.getClass();
        playProgress.getClass();
        str3.getClass();
        return new Aweme(str, str2, video, author, statistics, j, i, playProgress, j2, j3, str3, mixInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aweme)) {
            return false;
        }
        Aweme aweme = (Aweme) obj;
        return j42.c(this.awemeId, aweme.awemeId) && j42.c(this.desc, aweme.desc) && j42.c(this.video, aweme.video) && j42.c(this.author, aweme.author) && j42.c(this.statistics, aweme.statistics) && this.createTime == aweme.createTime && this.awemeType == aweme.awemeType && j42.c(this.playProgress, aweme.playProgress) && this.userDigged == aweme.userDigged && this.collectStat == aweme.collectStat && j42.c(this.authenticationToken, aweme.authenticationToken) && j42.c(this.mixInfo, aweme.mixInfo);
    }

    public final String getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final long getCollectStat() {
        return this.collectStat;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final MixInfo getMixInfo() {
        return this.mixInfo;
    }

    public final PlayProgress getPlayProgress() {
        return this.playProgress;
    }

    public final Statistics getStatistics() {
        return this.statistics;
    }

    public final long getUserDigged() {
        return this.userDigged;
    }

    public final Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        int n = hf1.n((i82.Q(this.collectStat) + ((i82.Q(this.userDigged) + ((this.playProgress.hashCode() + ((((i82.Q(this.createTime) + ((this.statistics.hashCode() + ((this.author.hashCode() + ((this.video.hashCode() + hf1.n(this.awemeId.hashCode() * 31, 31, this.desc)) * 31)) * 31)) * 31)) * 31) + this.awemeType) * 31)) * 31)) * 31)) * 31, 31, this.authenticationToken);
        MixInfo mixInfo = this.mixInfo;
        return n + (mixInfo == null ? 0 : mixInfo.hashCode());
    }

    public String toString() {
        String str = this.awemeId;
        String str2 = this.desc;
        Video video = this.video;
        Author author = this.author;
        Statistics statistics = this.statistics;
        long j = this.createTime;
        int i = this.awemeType;
        PlayProgress playProgress = this.playProgress;
        long j2 = this.userDigged;
        long j3 = this.collectStat;
        String str3 = this.authenticationToken;
        MixInfo mixInfo = this.mixInfo;
        StringBuilder F = r7.F("Aweme(awemeId=", str, ", desc=", str2, ", video=");
        F.append(video);
        F.append(", author=");
        F.append(author);
        F.append(", statistics=");
        F.append(statistics);
        F.append(", createTime=");
        F.append(j);
        F.append(", awemeType=");
        F.append(i);
        F.append(", playProgress=");
        F.append(playProgress);
        F.append(", userDigged=");
        F.append(j2);
        F.append(", collectStat=");
        F.append(j3);
        F.append(", authenticationToken=");
        F.append(str3);
        F.append(", mixInfo=");
        F.append(mixInfo);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Aweme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthenticationToken$annotations() {
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getAwemeId$annotations() {
    }

    public static /* synthetic */ void getAwemeType$annotations() {
    }

    @c72(names = {"collect_stat", "collect_status", "is_collect", "is_collected", "is_favorited"})
    public static /* synthetic */ void getCollectStat$annotations() {
    }

    public static /* synthetic */ void getCreateTime$annotations() {
    }

    public static /* synthetic */ void getDesc$annotations() {
    }

    public static /* synthetic */ void getMixInfo$annotations() {
    }

    public static /* synthetic */ void getPlayProgress$annotations() {
    }

    public static /* synthetic */ void getStatistics$annotations() {
    }

    @c72(names = {"user_digged", "is_digg", "digg_status"})
    public static /* synthetic */ void getUserDigged$annotations() {
    }

    public static /* synthetic */ void getVideo$annotations() {
    }

    public Aweme() {
        this((String) null, (String) null, (Video) null, (Author) null, (Statistics) null, 0L, 0, (PlayProgress) null, 0L, 0L, (String) null, (MixInfo) null, 4095, (er0) null);
    }

    public Aweme(String str, String str2, Video video, Author author, Statistics statistics, long j, int i, PlayProgress playProgress, long j2, long j3, String str3, MixInfo mixInfo) {
        str.getClass();
        str2.getClass();
        video.getClass();
        author.getClass();
        statistics.getClass();
        playProgress.getClass();
        str3.getClass();
        this.awemeId = str;
        this.desc = str2;
        this.video = video;
        this.author = author;
        this.statistics = statistics;
        this.createTime = j;
        this.awemeType = i;
        this.playProgress = playProgress;
        this.userDigged = j2;
        this.collectStat = j3;
        this.authenticationToken = str3;
        this.mixInfo = mixInfo;
    }

    public /* synthetic */ Aweme(String str, String str2, Video video, Author author, Statistics statistics, long j, int i, PlayProgress playProgress, long j2, long j3, String str3, MixInfo mixInfo, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new Video((List) null, (PlayAddr) null, (PlayAddr) null, (PlayAddr) null, (Cover) null, (Cover) null, (Cover) null, (List) null, 0, 0, 0, (String) null, (String) null, 8191, (er0) null) : video, (i2 & 8) != 0 ? new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null) : author, (i2 & 16) != 0 ? new Statistics(0L, 0L, 0L, 0L, 0L, 31, (er0) null) : statistics, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? new PlayProgress(0L, 0L, (Long) null, 7, (er0) null) : playProgress, (i2 & 256) != 0 ? 0L : j2, (i2 & 512) == 0 ? j3 : 0L, (i2 & 1024) == 0 ? str3 : "", (i2 & 2048) != 0 ? null : mixInfo);
    }
}
