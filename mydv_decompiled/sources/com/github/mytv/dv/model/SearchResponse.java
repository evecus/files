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
public final class SearchResponse {
    private static final uc2[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final List<Aweme> awemeList;
    private final long cursor;
    private final List<SearchItem> data;
    private final boolean hasMore;
    private final LogPb logPb;
    private final SearchNilInfo searchNilInfo;
    private final int statusCode;
    private final String statusMsg;

    static {
        wd3 wd3Var = new wd3((byte) 16);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, wd3Var), ut0.K(dh2Var, new wd3((byte) 17)), null, null, null, null, null, null};
    }

    public /* synthetic */ SearchResponse(int i, List list, List list2, boolean z, long j, int i2, String str, SearchNilInfo searchNilInfo, LogPb logPb, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 2) == 0) {
            this.awemeList = null;
        } else {
            this.awemeList = list2;
        }
        if ((i & 4) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 8) == 0) {
            this.cursor = 0L;
        } else {
            this.cursor = j;
        }
        if ((i & 16) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
        if ((i & 32) == 0) {
            this.statusMsg = "";
        } else {
            this.statusMsg = str;
        }
        if ((i & 64) == 0) {
            this.searchNilInfo = null;
        } else {
            this.searchNilInfo = searchNilInfo;
        }
        if ((i & 128) == 0) {
            this.logPb = null;
        } else {
            this.logPb = logPb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(SearchItem$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(Aweme$$serializer.INSTANCE);
    }

    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, List list, List list2, boolean z, long j, int i, String str, SearchNilInfo searchNilInfo, LogPb logPb, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchResponse.data;
        }
        if ((i2 & 2) != 0) {
            list2 = searchResponse.awemeList;
        }
        if ((i2 & 4) != 0) {
            z = searchResponse.hasMore;
        }
        if ((i2 & 8) != 0) {
            j = searchResponse.cursor;
        }
        if ((i2 & 16) != 0) {
            i = searchResponse.statusCode;
        }
        if ((i2 & 32) != 0) {
            str = searchResponse.statusMsg;
        }
        if ((i2 & 64) != 0) {
            searchNilInfo = searchResponse.searchNilInfo;
        }
        if ((i2 & 128) != 0) {
            logPb = searchResponse.logPb;
        }
        long j2 = j;
        boolean z2 = z;
        return searchResponse.copy(list, list2, z2, j2, i, str, searchNilInfo, logPb);
    }

    public static final /* synthetic */ void write$Self$app(SearchResponse searchResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || searchResponse.data != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), searchResponse.data);
        }
        if (me0Var.q(serialDescriptor) || searchResponse.awemeList != null) {
            me0Var.k(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), searchResponse.awemeList);
        }
        if (me0Var.q(serialDescriptor) || searchResponse.hasMore) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(searchResponse.hasMore));
        }
        if (me0Var.q(serialDescriptor) || searchResponse.cursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, searchResponse.cursor);
        }
        if (me0Var.q(serialDescriptor) || searchResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 4, searchResponse.statusCode);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(searchResponse.statusMsg, "")) {
            ((ax4) me0Var).E(serialDescriptor, 5, searchResponse.statusMsg);
        }
        if (me0Var.q(serialDescriptor) || searchResponse.searchNilInfo != null) {
            me0Var.k(serialDescriptor, 6, SearchNilInfo$$serializer.INSTANCE, searchResponse.searchNilInfo);
        }
        if (!me0Var.q(serialDescriptor) && searchResponse.logPb == null) {
            return;
        }
        me0Var.k(serialDescriptor, 7, LogPb$$serializer.INSTANCE, searchResponse.logPb);
    }

    public final List<SearchItem> component1() {
        return this.data;
    }

    public final List<Aweme> component2() {
        return this.awemeList;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final long component4() {
        return this.cursor;
    }

    public final int component5() {
        return this.statusCode;
    }

    public final String component6() {
        return this.statusMsg;
    }

    public final SearchNilInfo component7() {
        return this.searchNilInfo;
    }

    public final LogPb component8() {
        return this.logPb;
    }

    public final SearchResponse copy(List<SearchItem> list, List<Aweme> list2, boolean z, long j, int i, String str, SearchNilInfo searchNilInfo, LogPb logPb) {
        str.getClass();
        return new SearchResponse(list, list2, z, j, i, str, searchNilInfo, logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        return j42.c(this.data, searchResponse.data) && j42.c(this.awemeList, searchResponse.awemeList) && this.hasMore == searchResponse.hasMore && this.cursor == searchResponse.cursor && this.statusCode == searchResponse.statusCode && j42.c(this.statusMsg, searchResponse.statusMsg) && j42.c(this.searchNilInfo, searchResponse.searchNilInfo) && j42.c(this.logPb, searchResponse.logPb);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<SearchItem> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
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
        List<SearchItem> list = this.data;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Aweme> list2 = this.awemeList;
        int hashCode2 = (((hashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.hasMore ? 1231 : 1237)) * 31;
        long j = this.cursor;
        int n = hf1.n((((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.statusCode) * 31, 31, this.statusMsg);
        SearchNilInfo searchNilInfo = this.searchNilInfo;
        int hashCode3 = (n + (searchNilInfo == null ? 0 : searchNilInfo.hashCode())) * 31;
        LogPb logPb = this.logPb;
        return hashCode3 + (logPb != null ? logPb.hashCode() : 0);
    }

    public String toString() {
        return "SearchResponse(data=" + this.data + ", awemeList=" + this.awemeList + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", searchNilInfo=" + this.searchNilInfo + ", logPb=" + this.logPb + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchResponse$$serializer.INSTANCE;
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

    public static /* synthetic */ void getLogPb$annotations() {
    }

    public static /* synthetic */ void getSearchNilInfo$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getStatusMsg$annotations() {
    }

    public SearchResponse() {
        this((List) null, (List) null, false, 0L, 0, (String) null, (SearchNilInfo) null, (LogPb) null, 255, (er0) null);
    }

    public SearchResponse(List<SearchItem> list, List<Aweme> list2, boolean z, long j, int i, String str, SearchNilInfo searchNilInfo, LogPb logPb) {
        str.getClass();
        this.data = list;
        this.awemeList = list2;
        this.hasMore = z;
        this.cursor = j;
        this.statusCode = i;
        this.statusMsg = str;
        this.searchNilInfo = searchNilInfo;
        this.logPb = logPb;
    }

    public /* synthetic */ SearchResponse(List list, List list2, boolean z, long j, int i, String str, SearchNilInfo searchNilInfo, LogPb logPb, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : searchNilInfo, (i2 & 128) != 0 ? null : logPb);
    }
}
