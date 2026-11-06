package com.github.mytv.dv.model;

import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.o91;
import defpackage.sp;
import defpackage.tg5;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Video {
    private static final uc2[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authenticationToken;
    private final List<VideoBigThumb> bigThumbs;
    private final List<BitRate> bitRate;
    private final Cover cover;
    private final PlayAddr downloadAddr;
    private final int duration;
    private final Cover dynamicCover;
    private final int height;
    private final Cover originCover;
    private final PlayAddr playAddr;
    private final PlayAddr playAddr265;
    private final String ratio;
    private final int width;

    static {
        tg5 tg5Var = new tg5((byte) 2);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, tg5Var), null, null, null, null, null, null, ut0.K(dh2Var, new tg5((byte) 3)), null, null, null, null, null};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Video(int i, List list, PlayAddr playAddr, PlayAddr playAddr2, PlayAddr playAddr3, Cover cover, Cover cover2, Cover cover3, List list2, int i2, int i3, int i4, String str, String str2, yj4 yj4Var) {
        int i5 = i & 1;
        o91 o91Var = o91.I;
        if (i5 == 0) {
            this.bitRate = o91Var;
        } else {
            this.bitRate = list;
        }
        if ((i & 2) == 0) {
            this.playAddr = new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
        } else {
            this.playAddr = playAddr;
        }
        if ((i & 4) == 0) {
            this.playAddr265 = new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
        } else {
            this.playAddr265 = playAddr2;
        }
        if ((i & 8) == 0) {
            this.downloadAddr = new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
        } else {
            this.downloadAddr = playAddr3;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i6 = 1;
        this.cover = (i & 16) == 0 ? new Cover((List) null, i6, (er0) (0 == true ? 1 : 0)) : cover;
        this.dynamicCover = (i & 32) == 0 ? new Cover((List) (objArr4 == true ? 1 : 0), i6, (er0) (objArr3 == true ? 1 : 0)) : cover2;
        this.originCover = (i & 64) == 0 ? new Cover((List) (objArr2 == true ? 1 : 0), i6, (er0) (objArr == true ? 1 : 0)) : cover3;
        if ((i & 128) == 0) {
            this.bigThumbs = o91Var;
        } else {
            this.bigThumbs = list2;
        }
        if ((i & 256) == 0) {
            this.duration = 0;
        } else {
            this.duration = i2;
        }
        if ((i & 512) == 0) {
            this.width = 0;
        } else {
            this.width = i3;
        }
        if ((i & 1024) == 0) {
            this.height = 0;
        } else {
            this.height = i4;
        }
        if ((i & 2048) == 0) {
            this.ratio = "";
        } else {
            this.ratio = str;
        }
        if ((i & 4096) == 0) {
            this.authenticationToken = "";
        } else {
            this.authenticationToken = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(BitRate$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(VideoBigThumb$$serializer.INSTANCE);
    }

    public static /* synthetic */ Video copy$default(Video video, List list, PlayAddr playAddr, PlayAddr playAddr2, PlayAddr playAddr3, Cover cover, Cover cover2, Cover cover3, List list2, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = video.bitRate;
        }
        return video.copy(list, (i4 & 2) != 0 ? video.playAddr : playAddr, (i4 & 4) != 0 ? video.playAddr265 : playAddr2, (i4 & 8) != 0 ? video.downloadAddr : playAddr3, (i4 & 16) != 0 ? video.cover : cover, (i4 & 32) != 0 ? video.dynamicCover : cover2, (i4 & 64) != 0 ? video.originCover : cover3, (i4 & 128) != 0 ? video.bigThumbs : list2, (i4 & 256) != 0 ? video.duration : i, (i4 & 512) != 0 ? video.width : i2, (i4 & 1024) != 0 ? video.height : i3, (i4 & 2048) != 0 ? video.ratio : str, (i4 & 4096) != 0 ? video.authenticationToken : str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (defpackage.j42.c(r13.playAddr265, new com.github.mytv.dv.model.PlayAddr((java.util.List) null, (java.lang.String) null, 0, 0, 0, 31, (defpackage.er0) null)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        if (defpackage.j42.c(r13.downloadAddr, new com.github.mytv.dv.model.PlayAddr((java.util.List) null, (java.lang.String) null, 0, 0, 0, 31, (defpackage.er0) null)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (defpackage.j42.c(r13.playAddr, new com.github.mytv.dv.model.PlayAddr((java.util.List) null, (java.lang.String) null, 0, 0, 0, 31, (defpackage.er0) null)) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.github.mytv.dv.model.Video r13, defpackage.me0 r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.Video.write$Self$app(com.github.mytv.dv.model.Video, me0, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final List<BitRate> component1() {
        return this.bitRate;
    }

    public final int component10() {
        return this.width;
    }

    public final int component11() {
        return this.height;
    }

    public final String component12() {
        return this.ratio;
    }

    public final String component13() {
        return this.authenticationToken;
    }

    public final PlayAddr component2() {
        return this.playAddr;
    }

    public final PlayAddr component3() {
        return this.playAddr265;
    }

    public final PlayAddr component4() {
        return this.downloadAddr;
    }

    public final Cover component5() {
        return this.cover;
    }

    public final Cover component6() {
        return this.dynamicCover;
    }

    public final Cover component7() {
        return this.originCover;
    }

    public final List<VideoBigThumb> component8() {
        return this.bigThumbs;
    }

    public final int component9() {
        return this.duration;
    }

    public final Video copy(List<BitRate> list, PlayAddr playAddr, PlayAddr playAddr2, PlayAddr playAddr3, Cover cover, Cover cover2, Cover cover3, List<VideoBigThumb> list2, int i, int i2, int i3, String str, String str2) {
        list.getClass();
        playAddr.getClass();
        playAddr2.getClass();
        playAddr3.getClass();
        cover.getClass();
        cover2.getClass();
        cover3.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        return new Video(list, playAddr, playAddr2, playAddr3, cover, cover2, cover3, list2, i, i2, i3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return j42.c(this.bitRate, video.bitRate) && j42.c(this.playAddr, video.playAddr) && j42.c(this.playAddr265, video.playAddr265) && j42.c(this.downloadAddr, video.downloadAddr) && j42.c(this.cover, video.cover) && j42.c(this.dynamicCover, video.dynamicCover) && j42.c(this.originCover, video.originCover) && j42.c(this.bigThumbs, video.bigThumbs) && this.duration == video.duration && this.width == video.width && this.height == video.height && j42.c(this.ratio, video.ratio) && j42.c(this.authenticationToken, video.authenticationToken);
    }

    public final String getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final List<VideoBigThumb> getBigThumbs() {
        return this.bigThumbs;
    }

    public final List<BitRate> getBitRate() {
        return this.bitRate;
    }

    public final Cover getCover() {
        return this.cover;
    }

    public final PlayAddr getDownloadAddr() {
        return this.downloadAddr;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final Cover getDynamicCover() {
        return this.dynamicCover;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Cover getOriginCover() {
        return this.originCover;
    }

    public final PlayAddr getPlayAddr() {
        return this.playAddr;
    }

    public final PlayAddr getPlayAddr265() {
        return this.playAddr265;
    }

    public final String getRatio() {
        return this.ratio;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.authenticationToken.hashCode() + hf1.n((((((((this.bigThumbs.hashCode() + ((this.originCover.hashCode() + ((this.dynamicCover.hashCode() + ((this.cover.hashCode() + ((this.downloadAddr.hashCode() + ((this.playAddr265.hashCode() + ((this.playAddr.hashCode() + (this.bitRate.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.duration) * 31) + this.width) * 31) + this.height) * 31, 31, this.ratio);
    }

    public String toString() {
        List<BitRate> list = this.bitRate;
        PlayAddr playAddr = this.playAddr;
        PlayAddr playAddr2 = this.playAddr265;
        PlayAddr playAddr3 = this.downloadAddr;
        Cover cover = this.cover;
        Cover cover2 = this.dynamicCover;
        Cover cover3 = this.originCover;
        List<VideoBigThumb> list2 = this.bigThumbs;
        int i = this.duration;
        int i2 = this.width;
        int i3 = this.height;
        String str = this.ratio;
        String str2 = this.authenticationToken;
        StringBuilder sb = new StringBuilder("Video(bitRate=");
        sb.append(list);
        sb.append(", playAddr=");
        sb.append(playAddr);
        sb.append(", playAddr265=");
        sb.append(playAddr2);
        sb.append(", downloadAddr=");
        sb.append(playAddr3);
        sb.append(", cover=");
        sb.append(cover);
        sb.append(", dynamicCover=");
        sb.append(cover2);
        sb.append(", originCover=");
        sb.append(cover3);
        sb.append(", bigThumbs=");
        sb.append(list2);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", ratio=");
        sb.append(str);
        sb.append(", authenticationToken=");
        return hf1.z(sb, str2, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Video$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthenticationToken$annotations() {
    }

    public static /* synthetic */ void getBigThumbs$annotations() {
    }

    public static /* synthetic */ void getBitRate$annotations() {
    }

    public static /* synthetic */ void getCover$annotations() {
    }

    public static /* synthetic */ void getDownloadAddr$annotations() {
    }

    public static /* synthetic */ void getDuration$annotations() {
    }

    public static /* synthetic */ void getDynamicCover$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getOriginCover$annotations() {
    }

    public static /* synthetic */ void getPlayAddr$annotations() {
    }

    public static /* synthetic */ void getPlayAddr265$annotations() {
    }

    public static /* synthetic */ void getRatio$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public Video() {
        this((List) null, (PlayAddr) null, (PlayAddr) null, (PlayAddr) null, (Cover) null, (Cover) null, (Cover) null, (List) null, 0, 0, 0, (String) null, (String) null, 8191, (er0) null);
    }

    public Video(List<BitRate> list, PlayAddr playAddr, PlayAddr playAddr2, PlayAddr playAddr3, Cover cover, Cover cover2, Cover cover3, List<VideoBigThumb> list2, int i, int i2, int i3, String str, String str2) {
        list.getClass();
        playAddr.getClass();
        playAddr2.getClass();
        playAddr3.getClass();
        cover.getClass();
        cover2.getClass();
        cover3.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        this.bitRate = list;
        this.playAddr = playAddr;
        this.playAddr265 = playAddr2;
        this.downloadAddr = playAddr3;
        this.cover = cover;
        this.dynamicCover = cover2;
        this.originCover = cover3;
        this.bigThumbs = list2;
        this.duration = i;
        this.width = i2;
        this.height = i3;
        this.ratio = str;
        this.authenticationToken = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Video(java.util.List r16, com.github.mytv.dv.model.PlayAddr r17, com.github.mytv.dv.model.PlayAddr r18, com.github.mytv.dv.model.PlayAddr r19, com.github.mytv.dv.model.Cover r20, com.github.mytv.dv.model.Cover r21, com.github.mytv.dv.model.Cover r22, java.util.List r23, int r24, int r25, int r26, java.lang.String r27, java.lang.String r28, int r29, defpackage.er0 r30) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.Video.<init>(java.util.List, com.github.mytv.dv.model.PlayAddr, com.github.mytv.dv.model.PlayAddr, com.github.mytv.dv.model.PlayAddr, com.github.mytv.dv.model.Cover, com.github.mytv.dv.model.Cover, com.github.mytv.dv.model.Cover, java.util.List, int, int, int, java.lang.String, java.lang.String, int, er0):void");
    }
}
