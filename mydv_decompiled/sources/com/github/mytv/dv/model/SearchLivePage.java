package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchLivePage {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final List<LiveRoom> rooms;
    private final String searchId;

    public SearchLivePage(List<LiveRoom> list, boolean z, String str) {
        list.getClass();
        str.getClass();
        this.rooms = list;
        this.hasMore = z;
        this.searchId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchLivePage copy$default(SearchLivePage searchLivePage, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchLivePage.rooms;
        }
        if ((i & 2) != 0) {
            z = searchLivePage.hasMore;
        }
        if ((i & 4) != 0) {
            str = searchLivePage.searchId;
        }
        return searchLivePage.copy(list, z, str);
    }

    public final List<LiveRoom> component1() {
        return this.rooms;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final String component3() {
        return this.searchId;
    }

    public final SearchLivePage copy(List<LiveRoom> list, boolean z, String str) {
        list.getClass();
        str.getClass();
        return new SearchLivePage(list, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLivePage)) {
            return false;
        }
        SearchLivePage searchLivePage = (SearchLivePage) obj;
        return j42.c(this.rooms, searchLivePage.rooms) && this.hasMore == searchLivePage.hasMore && j42.c(this.searchId, searchLivePage.searchId);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<LiveRoom> getRooms() {
        return this.rooms;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public int hashCode() {
        return this.searchId.hashCode() + (((this.rooms.hashCode() * 31) + (this.hasMore ? 1231 : 1237)) * 31);
    }

    public String toString() {
        List<LiveRoom> list = this.rooms;
        boolean z = this.hasMore;
        String str = this.searchId;
        StringBuilder sb = new StringBuilder("SearchLivePage(rooms=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", searchId=");
        return hf1.z(sb, str, ")");
    }

    public /* synthetic */ SearchLivePage(List list, boolean z, String str, int i, er0 er0Var) {
        this(list, z, (i & 4) != 0 ? "" : str);
    }
}
