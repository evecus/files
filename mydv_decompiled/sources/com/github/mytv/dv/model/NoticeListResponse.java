package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.d52;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NoticeListResponse {
    private final int hasMore;
    private final long maxTime;
    private final long minTime;
    private final List<NoticeItem> noticeList;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new d52((byte) 29)), null, null, null, null};

    public /* synthetic */ NoticeListResponse(int i, List list, int i2, long j, long j2, int i3, yj4 yj4Var) {
        this.noticeList = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.hasMore = 0;
        } else {
            this.hasMore = i2;
        }
        if ((i & 4) == 0) {
            this.minTime = 0L;
        } else {
            this.minTime = j;
        }
        if ((i & 8) == 0) {
            this.maxTime = 0L;
        } else {
            this.maxTime = j2;
        }
        if ((i & 16) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(NoticeItem$$serializer.INSTANCE);
    }

    public static /* synthetic */ NoticeListResponse copy$default(NoticeListResponse noticeListResponse, List list, int i, long j, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = noticeListResponse.noticeList;
        }
        if ((i3 & 2) != 0) {
            i = noticeListResponse.hasMore;
        }
        if ((i3 & 4) != 0) {
            j = noticeListResponse.minTime;
        }
        if ((i3 & 8) != 0) {
            j2 = noticeListResponse.maxTime;
        }
        if ((i3 & 16) != 0) {
            i2 = noticeListResponse.statusCode;
        }
        int i4 = i2;
        long j3 = j2;
        return noticeListResponse.copy(list, i, j, j3, i4);
    }

    public static final /* synthetic */ void write$Self$app(NoticeListResponse noticeListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || noticeListResponse.noticeList != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), noticeListResponse.noticeList);
        }
        if (me0Var.q(serialDescriptor) || noticeListResponse.hasMore != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, noticeListResponse.hasMore);
        }
        if (me0Var.q(serialDescriptor) || noticeListResponse.minTime != 0) {
            ((ax4) me0Var).B(serialDescriptor, 2, noticeListResponse.minTime);
        }
        if (me0Var.q(serialDescriptor) || noticeListResponse.maxTime != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, noticeListResponse.maxTime);
        }
        if (!me0Var.q(serialDescriptor) && noticeListResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 4, noticeListResponse.statusCode);
    }

    public final List<NoticeItem> component1() {
        return this.noticeList;
    }

    public final int component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.minTime;
    }

    public final long component4() {
        return this.maxTime;
    }

    public final int component5() {
        return this.statusCode;
    }

    public final NoticeListResponse copy(List<NoticeItem> list, int i, long j, long j2, int i2) {
        return new NoticeListResponse(list, i, j, j2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListResponse)) {
            return false;
        }
        NoticeListResponse noticeListResponse = (NoticeListResponse) obj;
        return j42.c(this.noticeList, noticeListResponse.noticeList) && this.hasMore == noticeListResponse.hasMore && this.minTime == noticeListResponse.minTime && this.maxTime == noticeListResponse.maxTime && this.statusCode == noticeListResponse.statusCode;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final List<NoticeItem> getNoticeList() {
        return this.noticeList;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<NoticeItem> list = this.noticeList;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.hasMore) * 31;
        long j = this.minTime;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.maxTime;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.statusCode;
    }

    public String toString() {
        List<NoticeItem> list = this.noticeList;
        int i = this.hasMore;
        long j = this.minTime;
        long j2 = this.maxTime;
        int i2 = this.statusCode;
        StringBuilder sb = new StringBuilder("NoticeListResponse(noticeList=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(i);
        sb.append(", minTime=");
        sb.append(j);
        sb.append(", maxTime=");
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
            return NoticeListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getMaxTime$annotations() {
    }

    public static /* synthetic */ void getMinTime$annotations() {
    }

    public static /* synthetic */ void getNoticeList$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public NoticeListResponse() {
        this((List) null, 0, 0L, 0L, 0, 31, (er0) null);
    }

    public NoticeListResponse(List<NoticeItem> list, int i, long j, long j2, int i2) {
        this.noticeList = list;
        this.hasMore = i;
        this.minTime = j;
        this.maxTime = j2;
        this.statusCode = i2;
    }

    public /* synthetic */ NoticeListResponse(List list, int i, long j, long j2, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? 0 : i2);
    }
}
