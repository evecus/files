package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchUserPage {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final String searchId;
    private final List<Author> users;

    public SearchUserPage(List<Author> list, boolean z, String str) {
        list.getClass();
        str.getClass();
        this.users = list;
        this.hasMore = z;
        this.searchId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchUserPage copy$default(SearchUserPage searchUserPage, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchUserPage.users;
        }
        if ((i & 2) != 0) {
            z = searchUserPage.hasMore;
        }
        if ((i & 4) != 0) {
            str = searchUserPage.searchId;
        }
        return searchUserPage.copy(list, z, str);
    }

    public final List<Author> component1() {
        return this.users;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final String component3() {
        return this.searchId;
    }

    public final SearchUserPage copy(List<Author> list, boolean z, String str) {
        list.getClass();
        str.getClass();
        return new SearchUserPage(list, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUserPage)) {
            return false;
        }
        SearchUserPage searchUserPage = (SearchUserPage) obj;
        return j42.c(this.users, searchUserPage.users) && this.hasMore == searchUserPage.hasMore && j42.c(this.searchId, searchUserPage.searchId);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final List<Author> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.searchId.hashCode() + (((this.users.hashCode() * 31) + (this.hasMore ? 1231 : 1237)) * 31);
    }

    public String toString() {
        List<Author> list = this.users;
        boolean z = this.hasMore;
        String str = this.searchId;
        StringBuilder sb = new StringBuilder("SearchUserPage(users=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", searchId=");
        return hf1.z(sb, str, ")");
    }

    public /* synthetic */ SearchUserPage(List list, boolean z, String str, int i, er0 er0Var) {
        this(list, z, (i & 4) != 0 ? "" : str);
    }
}
