package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Author {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Avatar avatarLarger;
    private final Avatar avatarMedium;
    private final Avatar avatarThumb;
    private final long awemeCount;
    private final long favoritingCount;
    private final long followerCount;
    private final long followingCount;
    private final String nickname;
    private final String secUid;
    private final String signature;
    private final long totalFavorited;
    private final String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Author(java.lang.String r20, java.lang.String r21, com.github.mytv.dv.model.Avatar r22, com.github.mytv.dv.model.Avatar r23, com.github.mytv.dv.model.Avatar r24, java.lang.String r25, java.lang.String r26, long r27, long r29, long r31, long r33, long r35, int r37, defpackage.er0 r38) {
        /*
            r19 = this;
            r0 = r37
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r20
        Lc:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = r2
            goto L14
        L12:
            r3 = r21
        L14:
            r4 = r0 & 4
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L20
            com.github.mytv.dv.model.Avatar r4 = new com.github.mytv.dv.model.Avatar
            r4.<init>(r5, r6, r5)
            goto L22
        L20:
            r4 = r22
        L22:
            r7 = r0 & 8
            if (r7 == 0) goto L2c
            com.github.mytv.dv.model.Avatar r7 = new com.github.mytv.dv.model.Avatar
            r7.<init>(r5, r6, r5)
            goto L2e
        L2c:
            r7 = r23
        L2e:
            r8 = r0 & 16
            if (r8 == 0) goto L38
            com.github.mytv.dv.model.Avatar r8 = new com.github.mytv.dv.model.Avatar
            r8.<init>(r5, r6, r5)
            goto L3a
        L38:
            r8 = r24
        L3a:
            r5 = r0 & 32
            if (r5 == 0) goto L40
            r5 = r2
            goto L42
        L40:
            r5 = r25
        L42:
            r6 = r0 & 64
            if (r6 == 0) goto L47
            goto L49
        L47:
            r2 = r26
        L49:
            r6 = r0 & 128(0x80, float:1.8E-43)
            r9 = 0
            if (r6 == 0) goto L51
            r11 = r9
            goto L53
        L51:
            r11 = r27
        L53:
            r6 = r0 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L59
            r13 = r9
            goto L5b
        L59:
            r13 = r29
        L5b:
            r6 = r0 & 512(0x200, float:7.17E-43)
            if (r6 == 0) goto L61
            r15 = r9
            goto L63
        L61:
            r15 = r31
        L63:
            r6 = r0 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L6a
            r17 = r9
            goto L6c
        L6a:
            r17 = r33
        L6c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L8b
            r36 = r9
        L72:
            r20 = r19
            r21 = r1
            r27 = r2
            r22 = r3
            r23 = r4
            r26 = r5
            r24 = r7
            r25 = r8
            r28 = r11
            r30 = r13
            r32 = r15
            r34 = r17
            goto L8e
        L8b:
            r36 = r35
            goto L72
        L8e:
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.Author.<init>(java.lang.String, java.lang.String, com.github.mytv.dv.model.Avatar, com.github.mytv.dv.model.Avatar, com.github.mytv.dv.model.Avatar, java.lang.String, java.lang.String, long, long, long, long, long, int, er0):void");
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, Avatar avatar, Avatar avatar2, Avatar avatar3, String str3, String str4, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long j6;
        long j7;
        String str5;
        Avatar avatar4;
        Avatar avatar5;
        Avatar avatar6;
        String str6;
        String str7;
        long j8;
        long j9;
        long j10;
        String str8 = (i & 1) != 0 ? author.uid : str;
        String str9 = (i & 2) != 0 ? author.nickname : str2;
        Avatar avatar7 = (i & 4) != 0 ? author.avatarThumb : avatar;
        Avatar avatar8 = (i & 8) != 0 ? author.avatarMedium : avatar2;
        Avatar avatar9 = (i & 16) != 0 ? author.avatarLarger : avatar3;
        String str10 = (i & 32) != 0 ? author.secUid : str3;
        String str11 = (i & 64) != 0 ? author.signature : str4;
        long j11 = (i & 128) != 0 ? author.followerCount : j;
        long j12 = (i & 256) != 0 ? author.followingCount : j2;
        long j13 = (i & 512) != 0 ? author.totalFavorited : j3;
        String str12 = str8;
        String str13 = str9;
        long j14 = (i & 1024) != 0 ? author.awemeCount : j4;
        if ((i & 2048) != 0) {
            j7 = j14;
            j6 = author.favoritingCount;
            avatar4 = avatar7;
            avatar5 = avatar8;
            avatar6 = avatar9;
            str6 = str10;
            str7 = str11;
            j8 = j11;
            j9 = j12;
            j10 = j13;
            str5 = str13;
        } else {
            j6 = j5;
            j7 = j14;
            str5 = str13;
            avatar4 = avatar7;
            avatar5 = avatar8;
            avatar6 = avatar9;
            str6 = str10;
            str7 = str11;
            j8 = j11;
            j9 = j12;
            j10 = j13;
        }
        return author.copy(str12, str5, avatar4, avatar5, avatar6, str6, str7, j8, j9, j10, j7, j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$app(Author author, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(author.uid, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, author.uid);
        }
        int i = 1;
        if (me0Var.q(serialDescriptor) || !j42.c(author.nickname, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, author.nickname);
        }
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (me0Var.q(serialDescriptor) || !j42.c(author.avatarThumb, new Avatar(list, i, (er0) (objArr5 == true ? 1 : 0)))) {
            ((ax4) me0Var).C(serialDescriptor, 2, Avatar$$serializer.INSTANCE, author.avatarThumb);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(author.avatarMedium, new Avatar((List) (objArr4 == true ? 1 : 0), i, (er0) (objArr3 == true ? 1 : 0)))) {
            ((ax4) me0Var).C(serialDescriptor, 3, Avatar$$serializer.INSTANCE, author.avatarMedium);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(author.avatarLarger, new Avatar((List) (objArr2 == true ? 1 : 0), i, (er0) (objArr == true ? 1 : 0)))) {
            ((ax4) me0Var).C(serialDescriptor, 4, Avatar$$serializer.INSTANCE, author.avatarLarger);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(author.secUid, "")) {
            ((ax4) me0Var).E(serialDescriptor, 5, author.secUid);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(author.signature, "")) {
            ((ax4) me0Var).E(serialDescriptor, 6, author.signature);
        }
        if (me0Var.q(serialDescriptor) || author.followerCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 7, FlexibleLongSerializer.INSTANCE, Long.valueOf(author.followerCount));
        }
        if (me0Var.q(serialDescriptor) || author.followingCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 8, FlexibleLongSerializer.INSTANCE, Long.valueOf(author.followingCount));
        }
        if (me0Var.q(serialDescriptor) || author.totalFavorited != 0) {
            ((ax4) me0Var).C(serialDescriptor, 9, FlexibleLongSerializer.INSTANCE, Long.valueOf(author.totalFavorited));
        }
        if (me0Var.q(serialDescriptor) || author.awemeCount != 0) {
            ((ax4) me0Var).C(serialDescriptor, 10, FlexibleLongSerializer.INSTANCE, Long.valueOf(author.awemeCount));
        }
        if (!me0Var.q(serialDescriptor) && author.favoritingCount == 0) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 11, FlexibleLongSerializer.INSTANCE, Long.valueOf(author.favoritingCount));
    }

    public final String component1() {
        return this.uid;
    }

    public final long component10() {
        return this.totalFavorited;
    }

    public final long component11() {
        return this.awemeCount;
    }

    public final long component12() {
        return this.favoritingCount;
    }

    public final String component2() {
        return this.nickname;
    }

    public final Avatar component3() {
        return this.avatarThumb;
    }

    public final Avatar component4() {
        return this.avatarMedium;
    }

    public final Avatar component5() {
        return this.avatarLarger;
    }

    public final String component6() {
        return this.secUid;
    }

    public final String component7() {
        return this.signature;
    }

    public final long component8() {
        return this.followerCount;
    }

    public final long component9() {
        return this.followingCount;
    }

    public final Author copy(String str, String str2, Avatar avatar, Avatar avatar2, Avatar avatar3, String str3, String str4, long j, long j2, long j3, long j4, long j5) {
        str.getClass();
        str2.getClass();
        avatar.getClass();
        avatar2.getClass();
        avatar3.getClass();
        str3.getClass();
        str4.getClass();
        return new Author(str, str2, avatar, avatar2, avatar3, str3, str4, j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return j42.c(this.uid, author.uid) && j42.c(this.nickname, author.nickname) && j42.c(this.avatarThumb, author.avatarThumb) && j42.c(this.avatarMedium, author.avatarMedium) && j42.c(this.avatarLarger, author.avatarLarger) && j42.c(this.secUid, author.secUid) && j42.c(this.signature, author.signature) && this.followerCount == author.followerCount && this.followingCount == author.followingCount && this.totalFavorited == author.totalFavorited && this.awemeCount == author.awemeCount && this.favoritingCount == author.favoritingCount;
    }

    public final Avatar getAvatarLarger() {
        return this.avatarLarger;
    }

    public final Avatar getAvatarMedium() {
        return this.avatarMedium;
    }

    public final Avatar getAvatarThumb() {
        return this.avatarThumb;
    }

    public final long getAwemeCount() {
        return this.awemeCount;
    }

    public final long getFavoritingCount() {
        return this.favoritingCount;
    }

    public final long getFollowerCount() {
        return this.followerCount;
    }

    public final long getFollowingCount() {
        return this.followingCount;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final long getTotalFavorited() {
        return this.totalFavorited;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return i82.Q(this.favoritingCount) + ((i82.Q(this.awemeCount) + ((i82.Q(this.totalFavorited) + ((i82.Q(this.followingCount) + ((i82.Q(this.followerCount) + hf1.n(hf1.n((this.avatarLarger.hashCode() + ((this.avatarMedium.hashCode() + ((this.avatarThumb.hashCode() + hf1.n(this.uid.hashCode() * 31, 31, this.nickname)) * 31)) * 31)) * 31, 31, this.secUid), 31, this.signature)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.nickname;
        Avatar avatar = this.avatarThumb;
        Avatar avatar2 = this.avatarMedium;
        Avatar avatar3 = this.avatarLarger;
        String str3 = this.secUid;
        String str4 = this.signature;
        long j = this.followerCount;
        long j2 = this.followingCount;
        long j3 = this.totalFavorited;
        long j4 = this.awemeCount;
        long j5 = this.favoritingCount;
        StringBuilder F = r7.F("Author(uid=", str, ", nickname=", str2, ", avatarThumb=");
        F.append(avatar);
        F.append(", avatarMedium=");
        F.append(avatar2);
        F.append(", avatarLarger=");
        F.append(avatar3);
        F.append(", secUid=");
        F.append(str3);
        F.append(", signature=");
        F.append(str4);
        F.append(", followerCount=");
        F.append(j);
        F.append(", followingCount=");
        F.append(j2);
        F.append(", totalFavorited=");
        F.append(j3);
        F.append(", awemeCount=");
        F.append(j4);
        F.append(", favoritingCount=");
        return r7.D(F, j5, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Author$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvatarLarger$annotations() {
    }

    public static /* synthetic */ void getAvatarMedium$annotations() {
    }

    public static /* synthetic */ void getAvatarThumb$annotations() {
    }

    public static /* synthetic */ void getAwemeCount$annotations() {
    }

    public static /* synthetic */ void getFavoritingCount$annotations() {
    }

    public static /* synthetic */ void getFollowerCount$annotations() {
    }

    public static /* synthetic */ void getFollowingCount$annotations() {
    }

    public static /* synthetic */ void getNickname$annotations() {
    }

    public static /* synthetic */ void getSecUid$annotations() {
    }

    public static /* synthetic */ void getSignature$annotations() {
    }

    public static /* synthetic */ void getTotalFavorited$annotations() {
    }

    public static /* synthetic */ void getUid$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(int i, String str, String str2, Avatar avatar, Avatar avatar2, Avatar avatar3, String str3, String str4, long j, long j2, long j3, long j4, long j5, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.uid = "";
        } else {
            this.uid = str;
        }
        if ((i & 2) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str2;
        }
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i2 = 1;
        if ((i & 4) == 0) {
            this.avatarThumb = new Avatar(list, i2, (er0) (objArr5 == true ? 1 : 0));
        } else {
            this.avatarThumb = avatar;
        }
        if ((i & 8) == 0) {
            this.avatarMedium = new Avatar((List) (objArr4 == true ? 1 : 0), i2, (er0) (objArr3 == true ? 1 : 0));
        } else {
            this.avatarMedium = avatar2;
        }
        if ((i & 16) == 0) {
            this.avatarLarger = new Avatar((List) (objArr2 == true ? 1 : 0), i2, (er0) (objArr == true ? 1 : 0));
        } else {
            this.avatarLarger = avatar3;
        }
        if ((i & 32) == 0) {
            this.secUid = "";
        } else {
            this.secUid = str3;
        }
        if ((i & 64) == 0) {
            this.signature = "";
        } else {
            this.signature = str4;
        }
        if ((i & 128) == 0) {
            this.followerCount = 0L;
        } else {
            this.followerCount = j;
        }
        if ((i & 256) == 0) {
            this.followingCount = 0L;
        } else {
            this.followingCount = j2;
        }
        if ((i & 512) == 0) {
            this.totalFavorited = 0L;
        } else {
            this.totalFavorited = j3;
        }
        if ((i & 1024) == 0) {
            this.awemeCount = 0L;
        } else {
            this.awemeCount = j4;
        }
        if ((i & 2048) == 0) {
            this.favoritingCount = 0L;
        } else {
            this.favoritingCount = j5;
        }
    }

    public Author(String str, String str2, Avatar avatar, Avatar avatar2, Avatar avatar3, String str3, String str4, long j, long j2, long j3, long j4, long j5) {
        str.getClass();
        str2.getClass();
        avatar.getClass();
        avatar2.getClass();
        avatar3.getClass();
        str3.getClass();
        str4.getClass();
        this.uid = str;
        this.nickname = str2;
        this.avatarThumb = avatar;
        this.avatarMedium = avatar2;
        this.avatarLarger = avatar3;
        this.secUid = str3;
        this.signature = str4;
        this.followerCount = j;
        this.followingCount = j2;
        this.totalFavorited = j3;
        this.awemeCount = j4;
        this.favoritingCount = j5;
    }

    public Author() {
        this((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
    }
}
