package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
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
public final class SearchVideoWorkResponse {
    private final long cursor;
    private final List<SearchVideoWorkData> data;
    private final int hasMore;
    private final LogPb logPb;
    private final SearchNilInfo searchNilInfo;
    private final int statusCode;
    private final String statusMsg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new wd3((byte) 22)), null, null, null, null, null, null};

    public /* synthetic */ SearchVideoWorkResponse(int i, List list, int i2, long j, int i3, String str, SearchNilInfo searchNilInfo, LogPb logPb, yj4 yj4Var) {
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
            this.cursor = 0L;
        } else {
            this.cursor = j;
        }
        if ((i & 8) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i3;
        }
        if ((i & 16) == 0) {
            this.statusMsg = "";
        } else {
            this.statusMsg = str;
        }
        if ((i & 32) == 0) {
            this.searchNilInfo = null;
        } else {
            this.searchNilInfo = searchNilInfo;
        }
        if ((i & 64) == 0) {
            this.logPb = null;
        } else {
            this.logPb = logPb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(SearchVideoWorkData$$serializer.INSTANCE);
    }

    public static /* synthetic */ SearchVideoWorkResponse copy$default(SearchVideoWorkResponse searchVideoWorkResponse, List list, int i, long j, int i2, String str, SearchNilInfo searchNilInfo, LogPb logPb, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = searchVideoWorkResponse.data;
        }
        if ((i3 & 2) != 0) {
            i = searchVideoWorkResponse.hasMore;
        }
        if ((i3 & 4) != 0) {
            j = searchVideoWorkResponse.cursor;
        }
        if ((i3 & 8) != 0) {
            i2 = searchVideoWorkResponse.statusCode;
        }
        if ((i3 & 16) != 0) {
            str = searchVideoWorkResponse.statusMsg;
        }
        if ((i3 & 32) != 0) {
            searchNilInfo = searchVideoWorkResponse.searchNilInfo;
        }
        if ((i3 & 64) != 0) {
            logPb = searchVideoWorkResponse.logPb;
        }
        long j2 = j;
        return searchVideoWorkResponse.copy(list, i, j2, i2, str, searchNilInfo, logPb);
    }

    public static final /* synthetic */ void write$Self$app(SearchVideoWorkResponse searchVideoWorkResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || searchVideoWorkResponse.data != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), searchVideoWorkResponse.data);
        }
        if (me0Var.q(serialDescriptor) || searchVideoWorkResponse.hasMore != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, searchVideoWorkResponse.hasMore);
        }
        if (me0Var.q(serialDescriptor) || searchVideoWorkResponse.cursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 2, searchVideoWorkResponse.cursor);
        }
        if (me0Var.q(serialDescriptor) || searchVideoWorkResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 3, searchVideoWorkResponse.statusCode);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(searchVideoWorkResponse.statusMsg, "")) {
            ((ax4) me0Var).E(serialDescriptor, 4, searchVideoWorkResponse.statusMsg);
        }
        if (me0Var.q(serialDescriptor) || searchVideoWorkResponse.searchNilInfo != null) {
            me0Var.k(serialDescriptor, 5, SearchNilInfo$$serializer.INSTANCE, searchVideoWorkResponse.searchNilInfo);
        }
        if (!me0Var.q(serialDescriptor) && searchVideoWorkResponse.logPb == null) {
            return;
        }
        me0Var.k(serialDescriptor, 6, LogPb$$serializer.INSTANCE, searchVideoWorkResponse.logPb);
    }

    public final List<SearchVideoWorkData> component1() {
        return this.data;
    }

    public final int component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.cursor;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.statusMsg;
    }

    public final SearchNilInfo component6() {
        return this.searchNilInfo;
    }

    public final LogPb component7() {
        return this.logPb;
    }

    public final SearchVideoWorkResponse copy(List<SearchVideoWorkData> list, int i, long j, int i2, String str, SearchNilInfo searchNilInfo, LogPb logPb) {
        str.getClass();
        return new SearchVideoWorkResponse(list, i, j, i2, str, searchNilInfo, logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchVideoWorkResponse)) {
            return false;
        }
        SearchVideoWorkResponse searchVideoWorkResponse = (SearchVideoWorkResponse) obj;
        return j42.c(this.data, searchVideoWorkResponse.data) && this.hasMore == searchVideoWorkResponse.hasMore && this.cursor == searchVideoWorkResponse.cursor && this.statusCode == searchVideoWorkResponse.statusCode && j42.c(this.statusMsg, searchVideoWorkResponse.statusMsg) && j42.c(this.searchNilInfo, searchVideoWorkResponse.searchNilInfo) && j42.c(this.logPb, searchVideoWorkResponse.logPb);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<SearchVideoWorkData> getData() {
        return this.data;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public final SearchNilInfo getSearchNilInfo() {
        return this.searchNilInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public int hashCode() {
        List<SearchVideoWorkData> list = this.data;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.hasMore) * 31;
        long j = this.cursor;
        int n = hf1.n((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.statusCode) * 31, 31, this.statusMsg);
        SearchNilInfo searchNilInfo = this.searchNilInfo;
        int hashCode2 = (n + (searchNilInfo == null ? 0 : searchNilInfo.hashCode())) * 31;
        LogPb logPb = this.logPb;
        return hashCode2 + (logPb != null ? logPb.hashCode() : 0);
    }

    public String toString() {
        return "SearchVideoWorkResponse(data=" + this.data + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", searchNilInfo=" + this.searchNilInfo + ", logPb=" + this.logPb + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchVideoWorkResponse$$serializer.INSTANCE;
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

    public static /* synthetic */ void getSearchNilInfo$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getStatusMsg$annotations() {
    }

    public SearchVideoWorkResponse() {
        this((List) null, 0, 0L, 0, (String) null, (SearchNilInfo) null, (LogPb) null, 127, (er0) null);
    }

    public SearchVideoWorkResponse(List<SearchVideoWorkData> list, int i, long j, int i2, String str, SearchNilInfo searchNilInfo, LogPb logPb) {
        str.getClass();
        this.data = list;
        this.hasMore = i;
        this.cursor = j;
        this.statusCode = i2;
        this.statusMsg = str;
        this.searchNilInfo = searchNilInfo;
        this.logPb = logPb;
    }

    public /* synthetic */ SearchVideoWorkResponse(List list, int i, long j, int i2, String str, SearchNilInfo searchNilInfo, LogPb logPb, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? null : searchNilInfo, (i3 & 64) != 0 ? null : logPb);
    }
}
