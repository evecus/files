package com.github.mytv.dv.model;

import defpackage.d52;
import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.r7;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class LiveRoom {
    private final List<CameraInfo> cameraInfos;
    private final Cover cover;
    private final String enterRoomId;
    private final EpisodeExtra episodeExtra;
    private final String idStr;
    private final Author owner;
    private final String roomId;
    private final RoomViewStats roomViewStats;
    private final int status;
    private final StreamUrl streamUrl;
    private final String title;
    private final String userCount;
    private final String webRid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, ut0.K(dh2.I, new d52((byte) 14)), null};

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ LiveRoom(int i, String str, String str2, String str3, String str4, String str5, Cover cover, String str6, RoomViewStats roomViewStats, Author author, StreamUrl streamUrl, int i2, List list, EpisodeExtra episodeExtra, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.roomId = "";
        } else {
            this.roomId = str;
        }
        if ((i & 2) == 0) {
            this.idStr = "";
        } else {
            this.idStr = str2;
        }
        if ((i & 4) == 0) {
            this.enterRoomId = "";
        } else {
            this.enterRoomId = str3;
        }
        if ((i & 8) == 0) {
            this.webRid = "";
        } else {
            this.webRid = str4;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
        this.cover = (i & 32) == 0 ? new Cover((List) null, 1, (er0) (0 == true ? 1 : 0)) : cover;
        this.userCount = (i & 64) == 0 ? "0" : str6;
        if ((i & 128) == 0) {
            this.roomViewStats = null;
        } else {
            this.roomViewStats = roomViewStats;
        }
        if ((i & 256) == 0) {
            this.owner = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.owner = author;
        }
        if ((i & 512) == 0) {
            this.streamUrl = null;
        } else {
            this.streamUrl = streamUrl;
        }
        this.status = (i & 1024) == 0 ? 0 : i2;
        if ((i & 2048) == 0) {
            this.cameraInfos = null;
        } else {
            this.cameraInfos = list;
        }
        if ((i & 4096) == 0) {
            this.episodeExtra = null;
        } else {
            this.episodeExtra = episodeExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(CameraInfo$$serializer.INSTANCE);
    }

    public static /* synthetic */ LiveRoom copy$default(LiveRoom liveRoom, String str, String str2, String str3, String str4, String str5, Cover cover, String str6, RoomViewStats roomViewStats, Author author, StreamUrl streamUrl, int i, List list, EpisodeExtra episodeExtra, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveRoom.roomId;
        }
        return liveRoom.copy(str, (i2 & 2) != 0 ? liveRoom.idStr : str2, (i2 & 4) != 0 ? liveRoom.enterRoomId : str3, (i2 & 8) != 0 ? liveRoom.webRid : str4, (i2 & 16) != 0 ? liveRoom.title : str5, (i2 & 32) != 0 ? liveRoom.cover : cover, (i2 & 64) != 0 ? liveRoom.userCount : str6, (i2 & 128) != 0 ? liveRoom.roomViewStats : roomViewStats, (i2 & 256) != 0 ? liveRoom.owner : author, (i2 & 512) != 0 ? liveRoom.streamUrl : streamUrl, (i2 & 1024) != 0 ? liveRoom.status : i, (i2 & 2048) != 0 ? liveRoom.cameraInfos : list, (i2 & 4096) != 0 ? liveRoom.episodeExtra : episodeExtra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        if (defpackage.j42.c(r25.owner, new com.github.mytv.dv.model.Author((java.lang.String) null, (java.lang.String) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, 0, 4095, (defpackage.er0) null)) == false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.github.mytv.dv.model.LiveRoom r25, defpackage.me0 r26, kotlinx.serialization.descriptors.SerialDescriptor r27) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.LiveRoom.write$Self$app(com.github.mytv.dv.model.LiveRoom, me0, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.roomId;
    }

    public final StreamUrl component10() {
        return this.streamUrl;
    }

    public final int component11() {
        return this.status;
    }

    public final List<CameraInfo> component12() {
        return this.cameraInfos;
    }

    public final EpisodeExtra component13() {
        return this.episodeExtra;
    }

    public final String component2() {
        return this.idStr;
    }

    public final String component3() {
        return this.enterRoomId;
    }

    public final String component4() {
        return this.webRid;
    }

    public final String component5() {
        return this.title;
    }

    public final Cover component6() {
        return this.cover;
    }

    public final String component7() {
        return this.userCount;
    }

    public final RoomViewStats component8() {
        return this.roomViewStats;
    }

    public final Author component9() {
        return this.owner;
    }

    public final LiveRoom copy(String str, String str2, String str3, String str4, String str5, Cover cover, String str6, RoomViewStats roomViewStats, Author author, StreamUrl streamUrl, int i, List<CameraInfo> list, EpisodeExtra episodeExtra) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        cover.getClass();
        str6.getClass();
        author.getClass();
        return new LiveRoom(str, str2, str3, str4, str5, cover, str6, roomViewStats, author, streamUrl, i, list, episodeExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRoom)) {
            return false;
        }
        LiveRoom liveRoom = (LiveRoom) obj;
        return j42.c(this.roomId, liveRoom.roomId) && j42.c(this.idStr, liveRoom.idStr) && j42.c(this.enterRoomId, liveRoom.enterRoomId) && j42.c(this.webRid, liveRoom.webRid) && j42.c(this.title, liveRoom.title) && j42.c(this.cover, liveRoom.cover) && j42.c(this.userCount, liveRoom.userCount) && j42.c(this.roomViewStats, liveRoom.roomViewStats) && j42.c(this.owner, liveRoom.owner) && j42.c(this.streamUrl, liveRoom.streamUrl) && this.status == liveRoom.status && j42.c(this.cameraInfos, liveRoom.cameraInfos) && j42.c(this.episodeExtra, liveRoom.episodeExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o91] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.util.List, java.util.List<com.github.mytv.dv.model.CameraInfo>] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final List<CameraInfo> getAllCameraInfos() {
        ArrayList arrayList;
        List<CameraInfo> cameraInfos;
        List<CameraInfo> list = this.cameraInfos;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((CameraInfo) obj).getStreamInfo() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ?? r0 = o91.I;
        if (arrayList == null) {
            arrayList = r0;
        }
        EpisodeExtra episodeExtra = this.episodeExtra;
        if (episodeExtra != null && (cameraInfos = episodeExtra.getCameraInfos()) != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : cameraInfos) {
                if (((CameraInfo) obj2).getStreamInfo() != null) {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList2 != null) {
            r0 = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return r0;
        }
        if (r0.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(p70.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((CameraInfo) it.next()).getCameraIdStr());
        }
        Set u1 = o70.u1(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : r0) {
            if (!u1.contains(((CameraInfo) obj3).getCameraIdStr())) {
                arrayList4.add(obj3);
            }
        }
        return o70.f1(arrayList, arrayList4);
    }

    public final List<CameraInfo> getCameraInfos() {
        return this.cameraInfos;
    }

    public final Cover getCover() {
        return this.cover;
    }

    public final String getEnterRoomId() {
        return this.enterRoomId;
    }

    public final EpisodeExtra getEpisodeExtra() {
        return this.episodeExtra;
    }

    public final String getIdStr() {
        return this.idStr;
    }

    public final Author getOwner() {
        return this.owner;
    }

    public final String getResolvedRoomId() {
        String str = this.roomId;
        if (jx4.L(str)) {
            str = this.idStr;
            if (jx4.L(str)) {
                str = this.enterRoomId;
                if (jx4.L(str)) {
                    return this.webRid;
                }
            }
        }
        return str;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final RoomViewStats getRoomViewStats() {
        return this.roomViewStats;
    }

    public final String getStableId() {
        String resolvedRoomId = getResolvedRoomId();
        if (jx4.L(resolvedRoomId)) {
            resolvedRoomId = this.webRid;
            if (jx4.L(resolvedRoomId)) {
                resolvedRoomId = this.owner.getSecUid();
                if (jx4.L(resolvedRoomId)) {
                    return this.title;
                }
            }
        }
        return resolvedRoomId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserCount() {
        return this.userCount;
    }

    public final String getWebRid() {
        return this.webRid;
    }

    public int hashCode() {
        int n = hf1.n((this.cover.hashCode() + hf1.n(hf1.n(hf1.n(hf1.n(this.roomId.hashCode() * 31, 31, this.idStr), 31, this.enterRoomId), 31, this.webRid), 31, this.title)) * 31, 31, this.userCount);
        RoomViewStats roomViewStats = this.roomViewStats;
        int hashCode = (this.owner.hashCode() + ((n + (roomViewStats == null ? 0 : roomViewStats.hashCode())) * 31)) * 31;
        StreamUrl streamUrl = this.streamUrl;
        int hashCode2 = (((hashCode + (streamUrl == null ? 0 : streamUrl.hashCode())) * 31) + this.status) * 31;
        List<CameraInfo> list = this.cameraInfos;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        EpisodeExtra episodeExtra = this.episodeExtra;
        return hashCode3 + (episodeExtra != null ? episodeExtra.hashCode() : 0);
    }

    public String toString() {
        String str = this.roomId;
        String str2 = this.idStr;
        String str3 = this.enterRoomId;
        String str4 = this.webRid;
        String str5 = this.title;
        Cover cover = this.cover;
        String str6 = this.userCount;
        RoomViewStats roomViewStats = this.roomViewStats;
        Author author = this.owner;
        StreamUrl streamUrl = this.streamUrl;
        int i = this.status;
        List<CameraInfo> list = this.cameraInfos;
        EpisodeExtra episodeExtra = this.episodeExtra;
        StringBuilder F = r7.F("LiveRoom(roomId=", str, ", idStr=", str2, ", enterRoomId=");
        r7.N(F, str3, ", webRid=", str4, ", title=");
        F.append(str5);
        F.append(", cover=");
        F.append(cover);
        F.append(", userCount=");
        F.append(str6);
        F.append(", roomViewStats=");
        F.append(roomViewStats);
        F.append(", owner=");
        F.append(author);
        F.append(", streamUrl=");
        F.append(streamUrl);
        F.append(", status=");
        F.append(i);
        F.append(", cameraInfos=");
        F.append(list);
        F.append(", episodeExtra=");
        F.append(episodeExtra);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveRoom$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCameraInfos$annotations() {
    }

    public static /* synthetic */ void getCover$annotations() {
    }

    public static /* synthetic */ void getEnterRoomId$annotations() {
    }

    public static /* synthetic */ void getEpisodeExtra$annotations() {
    }

    public static /* synthetic */ void getIdStr$annotations() {
    }

    public static /* synthetic */ void getOwner$annotations() {
    }

    public static /* synthetic */ void getRoomId$annotations() {
    }

    public static /* synthetic */ void getRoomViewStats$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getStreamUrl$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUserCount$annotations() {
    }

    public static /* synthetic */ void getWebRid$annotations() {
    }

    public LiveRoom() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Cover) null, (String) null, (RoomViewStats) null, (Author) null, (StreamUrl) null, 0, (List) null, (EpisodeExtra) null, 8191, (er0) null);
    }

    public LiveRoom(String str, String str2, String str3, String str4, String str5, Cover cover, String str6, RoomViewStats roomViewStats, Author author, StreamUrl streamUrl, int i, List<CameraInfo> list, EpisodeExtra episodeExtra) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        cover.getClass();
        str6.getClass();
        author.getClass();
        this.roomId = str;
        this.idStr = str2;
        this.enterRoomId = str3;
        this.webRid = str4;
        this.title = str5;
        this.cover = cover;
        this.userCount = str6;
        this.roomViewStats = roomViewStats;
        this.owner = author;
        this.streamUrl = streamUrl;
        this.status = i;
        this.cameraInfos = list;
        this.episodeExtra = episodeExtra;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LiveRoom(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.github.mytv.dv.model.Cover r37, java.lang.String r38, com.github.mytv.dv.model.RoomViewStats r39, com.github.mytv.dv.model.Author r40, com.github.mytv.dv.model.StreamUrl r41, int r42, java.util.List r43, com.github.mytv.dv.model.EpisodeExtra r44, int r45, defpackage.er0 r46) {
        /*
            r31 = this;
            r0 = r45
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r32
        Lc:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = r2
            goto L14
        L12:
            r3 = r33
        L14:
            r4 = r0 & 4
            if (r4 == 0) goto L1a
            r4 = r2
            goto L1c
        L1a:
            r4 = r34
        L1c:
            r5 = r0 & 8
            if (r5 == 0) goto L22
            r5 = r2
            goto L24
        L22:
            r5 = r35
        L24:
            r6 = r0 & 16
            if (r6 == 0) goto L29
            goto L2b
        L29:
            r2 = r36
        L2b:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L37
            com.github.mytv.dv.model.Cover r6 = new com.github.mytv.dv.model.Cover
            r8 = 1
            r6.<init>(r7, r8, r7)
            goto L39
        L37:
            r6 = r37
        L39:
            r8 = r0 & 64
            if (r8 == 0) goto L40
            java.lang.String r8 = "0"
            goto L42
        L40:
            r8 = r38
        L42:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L48
            r9 = r7
            goto L4a
        L48:
            r9 = r39
        L4a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L6c
            com.github.mytv.dv.model.Author r11 = new com.github.mytv.dv.model.Author
            r29 = 4095(0xfff, float:5.738E-42)
            r30 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r27, r29, r30)
            goto L6e
        L6c:
            r11 = r40
        L6e:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L74
            r10 = r7
            goto L76
        L74:
            r10 = r41
        L76:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L7c
            r12 = 0
            goto L7e
        L7c:
            r12 = r42
        L7e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L84
            r13 = r7
            goto L86
        L84:
            r13 = r43
        L86:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto La7
            r45 = r7
        L8c:
            r32 = r31
            r33 = r1
            r37 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r38 = r6
            r39 = r8
            r40 = r9
            r42 = r10
            r41 = r11
            r43 = r12
            r44 = r13
            goto Laa
        La7:
            r45 = r44
            goto L8c
        Laa:
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.LiveRoom.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.github.mytv.dv.model.Cover, java.lang.String, com.github.mytv.dv.model.RoomViewStats, com.github.mytv.dv.model.Author, com.github.mytv.dv.model.StreamUrl, int, java.util.List, com.github.mytv.dv.model.EpisodeExtra, int, er0):void");
    }
}
