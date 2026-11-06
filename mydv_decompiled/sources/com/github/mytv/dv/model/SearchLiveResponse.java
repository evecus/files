package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.wd3;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchLiveResponse {
    private final int cursor;
    private final List<SearchLiveData> data;
    private final int hasMore;
    private final LogPb logPb;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new wd3((byte) 15)), null, null, null, null};

    public /* synthetic */ SearchLiveResponse(int i, List list, int i2, int i3, int i4, LogPb logPb, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 2) == 0) {
            this.hasMore = 0;
        } else {
            this.hasMore = i2;
        }
        if ((i & 4) == 0) {
            this.cursor = 0;
        } else {
            this.cursor = i3;
        }
        if ((i & 8) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i4;
        }
        if ((i & 16) == 0) {
            this.logPb = null;
        } else {
            this.logPb = logPb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(SearchLiveData$$serializer.INSTANCE);
    }

    public static /* synthetic */ SearchLiveResponse copy$default(SearchLiveResponse searchLiveResponse, List list, int i, int i2, int i3, LogPb logPb, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = searchLiveResponse.data;
        }
        if ((i4 & 2) != 0) {
            i = searchLiveResponse.hasMore;
        }
        if ((i4 & 4) != 0) {
            i2 = searchLiveResponse.cursor;
        }
        if ((i4 & 8) != 0) {
            i3 = searchLiveResponse.statusCode;
        }
        if ((i4 & 16) != 0) {
            logPb = searchLiveResponse.logPb;
        }
        LogPb logPb2 = logPb;
        int i5 = i2;
        return searchLiveResponse.copy(list, i, i5, i3, logPb2);
    }

    public static final /* synthetic */ void write$Self$app(SearchLiveResponse searchLiveResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || searchLiveResponse.data != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), searchLiveResponse.data);
        }
        if (me0Var.q(serialDescriptor) || searchLiveResponse.hasMore != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, searchLiveResponse.hasMore);
        }
        if (me0Var.q(serialDescriptor) || searchLiveResponse.cursor != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, searchLiveResponse.cursor);
        }
        if (me0Var.q(serialDescriptor) || searchLiveResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 3, searchLiveResponse.statusCode);
        }
        if (!me0Var.q(serialDescriptor) && searchLiveResponse.logPb == null) {
            return;
        }
        me0Var.k(serialDescriptor, 4, LogPb$$serializer.INSTANCE, searchLiveResponse.logPb);
    }

    public final List<SearchLiveData> component1() {
        return this.data;
    }

    public final int component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.cursor;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final LogPb component5() {
        return this.logPb;
    }

    public final SearchLiveResponse copy(List<SearchLiveData> list, int i, int i2, int i3, LogPb logPb) {
        return new SearchLiveResponse(list, i, i2, i3, logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLiveResponse)) {
            return false;
        }
        SearchLiveResponse searchLiveResponse = (SearchLiveResponse) obj;
        return j42.c(this.data, searchLiveResponse.data) && this.hasMore == searchLiveResponse.hasMore && this.cursor == searchLiveResponse.cursor && this.statusCode == searchLiveResponse.statusCode && j42.c(this.logPb, searchLiveResponse.logPb);
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<SearchLiveData> getData() {
        return this.data;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<SearchLiveData> list = this.data;
        int hashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + this.hasMore) * 31) + this.cursor) * 31) + this.statusCode) * 31;
        LogPb logPb = this.logPb;
        return hashCode + (logPb != null ? logPb.hashCode() : 0);
    }

    public String toString() {
        return "SearchLiveResponse(data=" + this.data + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", statusCode=" + this.statusCode + ", logPb=" + this.logPb + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchLiveResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCursor$annotations() {
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getLogPb$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public SearchLiveResponse() {
        this((List) null, 0, 0, 0, (LogPb) null, 31, (er0) null);
    }

    public SearchLiveResponse(List<SearchLiveData> list, int i, int i2, int i3, LogPb logPb) {
        this.data = list;
        this.hasMore = i;
        this.cursor = i2;
        this.statusCode = i3;
        this.logPb = logPb;
    }

    public /* synthetic */ SearchLiveResponse(List list, int i, int i2, int i3, LogPb logPb, int i4, er0 er0Var) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : logPb);
    }
}
