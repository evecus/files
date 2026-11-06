package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.df0;
import defpackage.dh2;
import defpackage.er0;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.pt1;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FeedResponse {
    private static final uc2[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final List<Aweme> awemeList;
    private final long cursor;
    private final List<FeedDataItem> data;
    private final boolean hasMore;
    private final long maxCursor;
    private final int statusCode;

    static {
        df0 df0Var = new df0((byte) 16);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, df0Var), ut0.K(dh2Var, new df0((byte) 17)), null, null, null, null};
    }

    public /* synthetic */ FeedResponse(int i, List list, List list2, boolean z, long j, long j2, int i2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.awemeList = null;
        } else {
            this.awemeList = list;
        }
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = list2;
        }
        if ((i & 4) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 8) == 0) {
            this.maxCursor = 0L;
        } else {
            this.maxCursor = j;
        }
        if ((i & 16) == 0) {
            this.cursor = 0L;
        } else {
            this.cursor = j2;
        }
        if ((i & 32) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(Aweme$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(FeedDataItem$$serializer.INSTANCE);
    }

    public static /* synthetic */ FeedResponse copy$default(FeedResponse feedResponse, List list, List list2, boolean z, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = feedResponse.awemeList;
        }
        if ((i2 & 2) != 0) {
            list2 = feedResponse.data;
        }
        if ((i2 & 4) != 0) {
            z = feedResponse.hasMore;
        }
        if ((i2 & 8) != 0) {
            j = feedResponse.maxCursor;
        }
        if ((i2 & 16) != 0) {
            j2 = feedResponse.cursor;
        }
        if ((i2 & 32) != 0) {
            i = feedResponse.statusCode;
        }
        int i3 = i;
        long j3 = j2;
        boolean z2 = z;
        return feedResponse.copy(list, list2, z2, j, j3, i3);
    }

    public static final /* synthetic */ void write$Self$app(FeedResponse feedResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || feedResponse.awemeList != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), feedResponse.awemeList);
        }
        if (me0Var.q(serialDescriptor) || feedResponse.data != null) {
            me0Var.k(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), feedResponse.data);
        }
        if (me0Var.q(serialDescriptor) || feedResponse.hasMore) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(feedResponse.hasMore));
        }
        if (me0Var.q(serialDescriptor) || feedResponse.maxCursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, feedResponse.maxCursor);
        }
        if (me0Var.q(serialDescriptor) || feedResponse.cursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 4, feedResponse.cursor);
        }
        if (!me0Var.q(serialDescriptor) && feedResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 5, feedResponse.statusCode);
    }

    public final List<Aweme> component1() {
        return this.awemeList;
    }

    public final List<FeedDataItem> component2() {
        return this.data;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final long component4() {
        return this.maxCursor;
    }

    public final long component5() {
        return this.cursor;
    }

    public final int component6() {
        return this.statusCode;
    }

    public final FeedResponse copy(List<Aweme> list, List<FeedDataItem> list2, boolean z, long j, long j2, int i) {
        return new FeedResponse(list, list2, z, j, j2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedResponse)) {
            return false;
        }
        FeedResponse feedResponse = (FeedResponse) obj;
        return j42.c(this.awemeList, feedResponse.awemeList) && j42.c(this.data, feedResponse.data) && this.hasMore == feedResponse.hasMore && this.maxCursor == feedResponse.maxCursor && this.cursor == feedResponse.cursor && this.statusCode == feedResponse.statusCode;
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<FeedDataItem> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FeedDataItem> list2 = this.data;
        return ((i82.Q(this.cursor) + ((i82.Q(this.maxCursor) + ((pt1.o(this.hasMore) + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + this.statusCode;
    }

    public String toString() {
        List<Aweme> list = this.awemeList;
        List<FeedDataItem> list2 = this.data;
        boolean z = this.hasMore;
        long j = this.maxCursor;
        long j2 = this.cursor;
        int i = this.statusCode;
        StringBuilder sb = new StringBuilder("FeedResponse(awemeList=");
        sb.append(list);
        sb.append(", data=");
        sb.append(list2);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", maxCursor=");
        sb.append(j);
        sb.append(", cursor=");
        sb.append(j2);
        sb.append(", statusCode=");
        return nt3.n(sb, i, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return FeedResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAwemeList$annotations() {
    }

    public static /* synthetic */ void getCursor$annotations() {
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getMaxCursor$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public FeedResponse() {
        this((List) null, (List) null, false, 0L, 0L, 0, 63, (er0) null);
    }

    public FeedResponse(List<Aweme> list, List<FeedDataItem> list2, boolean z, long j, long j2, int i) {
        this.awemeList = list;
        this.data = list2;
        this.hasMore = z;
        this.maxCursor = j;
        this.cursor = j2;
        this.statusCode = i;
    }

    public /* synthetic */ FeedResponse(List list, List list2, boolean z, long j, long j2, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0 : i);
    }
}
