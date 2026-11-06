package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.sp;
import defpackage.u7;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CommentListResponse {
    private final List<Comment> comments;
    private final long cursor;
    private final int hasMore;
    private final int statusCode;
    private final long total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new u7((byte) 11)), null, null, null, null};

    public /* synthetic */ CommentListResponse(int i, List list, int i2, long j, long j2, int i3, yj4 yj4Var) {
        this.comments = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.hasMore = 0;
        } else {
            this.hasMore = i2;
        }
        if ((i & 4) == 0) {
            this.cursor = 0L;
        } else {
            this.cursor = j;
        }
        if ((i & 8) == 0) {
            this.total = 0L;
        } else {
            this.total = j2;
        }
        if ((i & 16) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(Comment$$serializer.INSTANCE);
    }

    public static /* synthetic */ CommentListResponse copy$default(CommentListResponse commentListResponse, List list, int i, long j, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = commentListResponse.comments;
        }
        if ((i3 & 2) != 0) {
            i = commentListResponse.hasMore;
        }
        if ((i3 & 4) != 0) {
            j = commentListResponse.cursor;
        }
        if ((i3 & 8) != 0) {
            j2 = commentListResponse.total;
        }
        if ((i3 & 16) != 0) {
            i2 = commentListResponse.statusCode;
        }
        int i4 = i2;
        long j3 = j2;
        return commentListResponse.copy(list, i, j, j3, i4);
    }

    public static final /* synthetic */ void write$Self$app(CommentListResponse commentListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || commentListResponse.comments != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), commentListResponse.comments);
        }
        if (me0Var.q(serialDescriptor) || commentListResponse.hasMore != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, commentListResponse.hasMore);
        }
        if (me0Var.q(serialDescriptor) || commentListResponse.cursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 2, commentListResponse.cursor);
        }
        if (me0Var.q(serialDescriptor) || commentListResponse.total != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, commentListResponse.total);
        }
        if (!me0Var.q(serialDescriptor) && commentListResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 4, commentListResponse.statusCode);
    }

    public final List<Comment> component1() {
        return this.comments;
    }

    public final int component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.cursor;
    }

    public final long component4() {
        return this.total;
    }

    public final int component5() {
        return this.statusCode;
    }

    public final CommentListResponse copy(List<Comment> list, int i, long j, long j2, int i2) {
        return new CommentListResponse(list, i, j, j2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentListResponse)) {
            return false;
        }
        CommentListResponse commentListResponse = (CommentListResponse) obj;
        return j42.c(this.comments, commentListResponse.comments) && this.hasMore == commentListResponse.hasMore && this.cursor == commentListResponse.cursor && this.total == commentListResponse.total && this.statusCode == commentListResponse.statusCode;
    }

    public final List<Comment> getComments() {
        return this.comments;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final long getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<Comment> list = this.comments;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.hasMore) * 31;
        long j = this.cursor;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.total;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.statusCode;
    }

    public String toString() {
        List<Comment> list = this.comments;
        int i = this.hasMore;
        long j = this.cursor;
        long j2 = this.total;
        int i2 = this.statusCode;
        StringBuilder sb = new StringBuilder("CommentListResponse(comments=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(i);
        sb.append(", cursor=");
        sb.append(j);
        sb.append(", total=");
        sb.append(j2);
        sb.append(", statusCode=");
        return nt3.n(sb, i2, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return CommentListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getComments$annotations() {
    }

    public static /* synthetic */ void getCursor$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getTotal$annotations() {
    }

    public CommentListResponse() {
        this((List) null, 0, 0L, 0L, 0, 31, (er0) null);
    }

    public CommentListResponse(List<Comment> list, int i, long j, long j2, int i2) {
        this.comments = list;
        this.hasMore = i;
        this.cursor = j;
        this.total = j2;
        this.statusCode = i2;
    }

    public /* synthetic */ CommentListResponse(List list, int i, long j, long j2, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? 0 : i2);
    }
}
