package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NoticeItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Aweme aweme;
    private final String content;
    private final long createTime;
    private final String noticeId;
    private final int noticeType;
    private final Author user;

    public /* synthetic */ NoticeItem(int i, String str, int i2, String str2, long j, Author author, Aweme aweme, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.noticeId = "";
        } else {
            this.noticeId = str;
        }
        this.noticeType = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        this.createTime = (i & 8) == 0 ? 0L : j;
        if ((i & 16) == 0) {
            this.user = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.user = author;
        }
        this.aweme = (i & 32) == 0 ? null : aweme;
    }

    public static /* synthetic */ NoticeItem copy$default(NoticeItem noticeItem, String str, int i, String str2, long j, Author author, Aweme aweme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noticeItem.noticeId;
        }
        if ((i2 & 2) != 0) {
            i = noticeItem.noticeType;
        }
        if ((i2 & 4) != 0) {
            str2 = noticeItem.content;
        }
        if ((i2 & 8) != 0) {
            j = noticeItem.createTime;
        }
        if ((i2 & 16) != 0) {
            author = noticeItem.user;
        }
        if ((i2 & 32) != 0) {
            aweme = noticeItem.aweme;
        }
        long j2 = j;
        String str3 = str2;
        return noticeItem.copy(str, i, str3, j2, author, aweme);
    }

    public static final /* synthetic */ void write$Self$app(NoticeItem noticeItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(noticeItem.noticeId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, noticeItem.noticeId);
        }
        if (me0Var.q(serialDescriptor) || noticeItem.noticeType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, noticeItem.noticeType);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(noticeItem.content, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, noticeItem.content);
        }
        if (me0Var.q(serialDescriptor) || noticeItem.createTime != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, noticeItem.createTime);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(noticeItem.user, new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null))) {
            ((ax4) me0Var).C(serialDescriptor, 4, Author$$serializer.INSTANCE, noticeItem.user);
        }
        if (!me0Var.q(serialDescriptor) && noticeItem.aweme == null) {
            return;
        }
        me0Var.k(serialDescriptor, 5, Aweme$$serializer.INSTANCE, noticeItem.aweme);
    }

    public final String component1() {
        return this.noticeId;
    }

    public final int component2() {
        return this.noticeType;
    }

    public final String component3() {
        return this.content;
    }

    public final long component4() {
        return this.createTime;
    }

    public final Author component5() {
        return this.user;
    }

    public final Aweme component6() {
        return this.aweme;
    }

    public final NoticeItem copy(String str, int i, String str2, long j, Author author, Aweme aweme) {
        str.getClass();
        str2.getClass();
        author.getClass();
        return new NoticeItem(str, i, str2, j, author, aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeItem)) {
            return false;
        }
        NoticeItem noticeItem = (NoticeItem) obj;
        return j42.c(this.noticeId, noticeItem.noticeId) && this.noticeType == noticeItem.noticeType && j42.c(this.content, noticeItem.content) && this.createTime == noticeItem.createTime && j42.c(this.user, noticeItem.user) && j42.c(this.aweme, noticeItem.aweme);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getNoticeId() {
        return this.noticeId;
    }

    public final int getNoticeType() {
        return this.noticeType;
    }

    public final Author getUser() {
        return this.user;
    }

    public int hashCode() {
        int n = hf1.n(((this.noticeId.hashCode() * 31) + this.noticeType) * 31, 31, this.content);
        long j = this.createTime;
        int hashCode = (this.user.hashCode() + ((n + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        Aweme aweme = this.aweme;
        return hashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public String toString() {
        return "NoticeItem(noticeId=" + this.noticeId + ", noticeType=" + this.noticeType + ", content=" + this.content + ", createTime=" + this.createTime + ", user=" + this.user + ", aweme=" + this.aweme + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return NoticeItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAweme$annotations() {
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void getCreateTime$annotations() {
    }

    public static /* synthetic */ void getNoticeId$annotations() {
    }

    public static /* synthetic */ void getNoticeType$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public NoticeItem() {
        this((String) null, 0, (String) null, 0L, (Author) null, (Aweme) null, 63, (er0) null);
    }

    public NoticeItem(String str, int i, String str2, long j, Author author, Aweme aweme) {
        str.getClass();
        str2.getClass();
        author.getClass();
        this.noticeId = str;
        this.noticeType = i;
        this.content = str2;
        this.createTime = j;
        this.user = author;
        this.aweme = aweme;
    }

    public /* synthetic */ NoticeItem(String str, int i, String str2, long j, Author author, Aweme aweme, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null) : author, (i2 & 32) != 0 ? null : aweme);
    }
}
