package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.fx4;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchUserItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String rawAdCommon;
    private final Author userInfo;

    public /* synthetic */ SearchUserItem(int i, Author author, String str, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.userInfo = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.userInfo = author;
        }
        this.rawAdCommon = (i & 2) == 0 ? null : str;
    }

    public static /* synthetic */ SearchUserItem copy$default(SearchUserItem searchUserItem, Author author, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            author = searchUserItem.userInfo;
        }
        if ((i & 2) != 0) {
            str = searchUserItem.rawAdCommon;
        }
        return searchUserItem.copy(author, str);
    }

    public static final /* synthetic */ void write$Self$app(SearchUserItem searchUserItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(searchUserItem.userInfo, new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null))) {
            ((ax4) me0Var).C(serialDescriptor, 0, Author$$serializer.INSTANCE, searchUserItem.userInfo);
        }
        if (!me0Var.q(serialDescriptor) && searchUserItem.rawAdCommon == null) {
            return;
        }
        me0Var.k(serialDescriptor, 1, fx4.a, searchUserItem.rawAdCommon);
    }

    public final Author component1() {
        return this.userInfo;
    }

    public final String component2() {
        return this.rawAdCommon;
    }

    public final SearchUserItem copy(Author author, String str) {
        author.getClass();
        return new SearchUserItem(author, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUserItem)) {
            return false;
        }
        SearchUserItem searchUserItem = (SearchUserItem) obj;
        return j42.c(this.userInfo, searchUserItem.userInfo) && j42.c(this.rawAdCommon, searchUserItem.rawAdCommon);
    }

    public final String getRawAdCommon() {
        return this.rawAdCommon;
    }

    public final Author getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int hashCode = this.userInfo.hashCode() * 31;
        String str = this.rawAdCommon;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SearchUserItem(userInfo=" + this.userInfo + ", rawAdCommon=" + this.rawAdCommon + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchUserItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getRawAdCommon$annotations() {
    }

    public static /* synthetic */ void getUserInfo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchUserItem() {
        this((Author) null, (String) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public SearchUserItem(Author author, String str) {
        author.getClass();
        this.userInfo = author;
        this.rawAdCommon = str;
    }

    public /* synthetic */ SearchUserItem(Author author, String str, int i, er0 er0Var) {
        this((i & 1) != 0 ? new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null) : author, (i & 2) != 0 ? null : str);
    }
}
