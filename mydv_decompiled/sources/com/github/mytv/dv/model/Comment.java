package com.github.mytv.dv.model;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.r7;
import defpackage.sp;
import defpackage.u7;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Comment {
    public static final int $stable = 0;
    private final String awemeId;
    private final String cid;
    private final long createTime;
    private final long diggCount;
    private final String ipLabel;
    private final int isUserDigg;
    private final long replyCommentTotal;
    private final List<Comment> replyComments;
    private final String text;
    private final Author user;
    public static final Companion Companion = new Companion(null);
    private static final uc2[] $childSerializers = {null, null, null, null, null, null, null, null, ut0.K(dh2.I, new u7((byte) 10)), null};

    public /* synthetic */ Comment(int i, String str, String str2, Author author, long j, long j2, long j3, String str3, String str4, List list, int i2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.cid = "";
        } else {
            this.cid = str;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.user = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.user = author;
        }
        if ((i & 8) == 0) {
            this.diggCount = 0L;
        } else {
            this.diggCount = j;
        }
        if ((i & 16) == 0) {
            this.replyCommentTotal = 0L;
        } else {
            this.replyCommentTotal = j2;
        }
        this.createTime = (i & 32) != 0 ? j3 : 0L;
        if ((i & 64) == 0) {
            this.awemeId = "";
        } else {
            this.awemeId = str3;
        }
        if ((i & 128) == 0) {
            this.ipLabel = "";
        } else {
            this.ipLabel = str4;
        }
        this.replyComments = (i & 256) == 0 ? null : list;
        this.isUserDigg = (i & 512) == 0 ? 0 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(Comment$$serializer.INSTANCE);
    }

    public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, Author author, long j, long j2, long j3, String str3, String str4, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comment.cid;
        }
        return comment.copy(str, (i2 & 2) != 0 ? comment.text : str2, (i2 & 4) != 0 ? comment.user : author, (i2 & 8) != 0 ? comment.diggCount : j, (i2 & 16) != 0 ? comment.replyCommentTotal : j2, (i2 & 32) != 0 ? comment.createTime : j3, (i2 & 64) != 0 ? comment.awemeId : str3, (i2 & 128) != 0 ? comment.ipLabel : str4, (i2 & 256) != 0 ? comment.replyComments : list, (i2 & 512) != 0 ? comment.isUserDigg : i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (defpackage.j42.c(r26.user, new com.github.mytv.dv.model.Author((java.lang.String) null, (java.lang.String) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (com.github.mytv.dv.model.Avatar) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, 0, 4095, (defpackage.er0) null)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.github.mytv.dv.model.Comment r26, defpackage.me0 r27, kotlinx.serialization.descriptors.SerialDescriptor r28) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.Comment.write$Self$app(com.github.mytv.dv.model.Comment, me0, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.cid;
    }

    public final int component10() {
        return this.isUserDigg;
    }

    public final String component2() {
        return this.text;
    }

    public final Author component3() {
        return this.user;
    }

    public final long component4() {
        return this.diggCount;
    }

    public final long component5() {
        return this.replyCommentTotal;
    }

    public final long component6() {
        return this.createTime;
    }

    public final String component7() {
        return this.awemeId;
    }

    public final String component8() {
        return this.ipLabel;
    }

    public final List<Comment> component9() {
        return this.replyComments;
    }

    public final Comment copy(String str, String str2, Author author, long j, long j2, long j3, String str3, String str4, List<Comment> list, int i) {
        str.getClass();
        str2.getClass();
        author.getClass();
        str3.getClass();
        str4.getClass();
        return new Comment(str, str2, author, j, j2, j3, str3, str4, list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return j42.c(this.cid, comment.cid) && j42.c(this.text, comment.text) && j42.c(this.user, comment.user) && this.diggCount == comment.diggCount && this.replyCommentTotal == comment.replyCommentTotal && this.createTime == comment.createTime && j42.c(this.awemeId, comment.awemeId) && j42.c(this.ipLabel, comment.ipLabel) && j42.c(this.replyComments, comment.replyComments) && this.isUserDigg == comment.isUserDigg;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getDiggCount() {
        return this.diggCount;
    }

    public final String getIpLabel() {
        return this.ipLabel;
    }

    public final long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public final List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public final String getText() {
        return this.text;
    }

    public final Author getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = (this.user.hashCode() + hf1.n(this.cid.hashCode() * 31, 31, this.text)) * 31;
        long j = this.diggCount;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.replyCommentTotal;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.createTime;
        int n = hf1.n(hf1.n((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.awemeId), 31, this.ipLabel);
        List<Comment> list = this.replyComments;
        return ((n + (list == null ? 0 : list.hashCode())) * 31) + this.isUserDigg;
    }

    public final int isUserDigg() {
        return this.isUserDigg;
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.text;
        Author author = this.user;
        long j = this.diggCount;
        long j2 = this.replyCommentTotal;
        long j3 = this.createTime;
        String str3 = this.awemeId;
        String str4 = this.ipLabel;
        List<Comment> list = this.replyComments;
        int i = this.isUserDigg;
        StringBuilder F = r7.F("Comment(cid=", str, ", text=", str2, ", user=");
        F.append(author);
        F.append(", diggCount=");
        F.append(j);
        F.append(", replyCommentTotal=");
        F.append(j2);
        F.append(", createTime=");
        F.append(j3);
        F.append(", awemeId=");
        F.append(str3);
        F.append(", ipLabel=");
        F.append(str4);
        F.append(", replyComments=");
        F.append(list);
        F.append(", isUserDigg=");
        F.append(i);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Comment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAwemeId$annotations() {
    }

    public static /* synthetic */ void getCid$annotations() {
    }

    public static /* synthetic */ void getCreateTime$annotations() {
    }

    public static /* synthetic */ void getDiggCount$annotations() {
    }

    public static /* synthetic */ void getIpLabel$annotations() {
    }

    public static /* synthetic */ void getReplyCommentTotal$annotations() {
    }

    public static /* synthetic */ void getReplyComments$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static /* synthetic */ void isUserDigg$annotations() {
    }

    public Comment() {
        this((String) null, (String) null, (Author) null, 0L, 0L, 0L, (String) null, (String) null, (List) null, 0, AnalyticsListener.EVENT_DRM_KEYS_LOADED, (er0) null);
    }

    public Comment(String str, String str2, Author author, long j, long j2, long j3, String str3, String str4, List<Comment> list, int i) {
        str.getClass();
        str2.getClass();
        author.getClass();
        str3.getClass();
        str4.getClass();
        this.cid = str;
        this.text = str2;
        this.user = author;
        this.diggCount = j;
        this.replyCommentTotal = j2;
        this.createTime = j3;
        this.awemeId = str3;
        this.ipLabel = str4;
        this.replyComments = list;
        this.isUserDigg = i;
    }

    public /* synthetic */ Comment(String str, String str2, Author author, long j, long j2, long j3, String str3, String str4, List list, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null) : author, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) == 0 ? j3 : 0L, (i2 & 64) != 0 ? "" : str3, (i2 & 128) == 0 ? str4 : "", (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? 0 : i);
    }
}
