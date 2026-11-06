package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchNilInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isLoadMore;
    private final String searchNilItem;
    private final String searchNilType;
    private final String textType;

    public /* synthetic */ SearchNilInfo(int i, String str, String str2, String str3, String str4, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.searchNilType = "";
        } else {
            this.searchNilType = str;
        }
        if ((i & 2) == 0) {
            this.isLoadMore = "";
        } else {
            this.isLoadMore = str2;
        }
        if ((i & 4) == 0) {
            this.searchNilItem = "";
        } else {
            this.searchNilItem = str3;
        }
        if ((i & 8) == 0) {
            this.textType = "";
        } else {
            this.textType = str4;
        }
    }

    public static /* synthetic */ SearchNilInfo copy$default(SearchNilInfo searchNilInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchNilInfo.searchNilType;
        }
        if ((i & 2) != 0) {
            str2 = searchNilInfo.isLoadMore;
        }
        if ((i & 4) != 0) {
            str3 = searchNilInfo.searchNilItem;
        }
        if ((i & 8) != 0) {
            str4 = searchNilInfo.textType;
        }
        return searchNilInfo.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app(SearchNilInfo searchNilInfo, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(searchNilInfo.searchNilType, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, searchNilInfo.searchNilType);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(searchNilInfo.isLoadMore, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, searchNilInfo.isLoadMore);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(searchNilInfo.searchNilItem, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, searchNilInfo.searchNilItem);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(searchNilInfo.textType, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 3, searchNilInfo.textType);
    }

    public final String component1() {
        return this.searchNilType;
    }

    public final String component2() {
        return this.isLoadMore;
    }

    public final String component3() {
        return this.searchNilItem;
    }

    public final String component4() {
        return this.textType;
    }

    public final SearchNilInfo copy(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new SearchNilInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchNilInfo)) {
            return false;
        }
        SearchNilInfo searchNilInfo = (SearchNilInfo) obj;
        return j42.c(this.searchNilType, searchNilInfo.searchNilType) && j42.c(this.isLoadMore, searchNilInfo.isLoadMore) && j42.c(this.searchNilItem, searchNilInfo.searchNilItem) && j42.c(this.textType, searchNilInfo.textType);
    }

    public final String getSearchNilItem() {
        return this.searchNilItem;
    }

    public final String getSearchNilType() {
        return this.searchNilType;
    }

    public final String getTextType() {
        return this.textType;
    }

    public int hashCode() {
        return this.textType.hashCode() + hf1.n(hf1.n(this.searchNilType.hashCode() * 31, 31, this.isLoadMore), 31, this.searchNilItem);
    }

    public final String isLoadMore() {
        return this.isLoadMore;
    }

    public String toString() {
        String str = this.searchNilType;
        String str2 = this.isLoadMore;
        String str3 = this.searchNilItem;
        String str4 = this.textType;
        StringBuilder F = r7.F("SearchNilInfo(searchNilType=", str, ", isLoadMore=", str2, ", searchNilItem=");
        F.append(str3);
        F.append(", textType=");
        F.append(str4);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchNilInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getSearchNilItem$annotations() {
    }

    public static /* synthetic */ void getSearchNilType$annotations() {
    }

    public static /* synthetic */ void getTextType$annotations() {
    }

    public static /* synthetic */ void isLoadMore$annotations() {
    }

    public SearchNilInfo() {
        this((String) null, (String) null, (String) null, (String) null, 15, (er0) null);
    }

    public SearchNilInfo(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.searchNilType = str;
        this.isLoadMore = str2;
        this.searchNilItem = str3;
        this.textType = str4;
    }

    public /* synthetic */ SearchNilInfo(String str, String str2, String str3, String str4, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
