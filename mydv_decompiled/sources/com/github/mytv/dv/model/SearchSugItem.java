package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchSugItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String sugType;

    public /* synthetic */ SearchSugItem(int i, String str, String str2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.sugType = "";
        } else {
            this.sugType = str2;
        }
    }

    public static /* synthetic */ SearchSugItem copy$default(SearchSugItem searchSugItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchSugItem.content;
        }
        if ((i & 2) != 0) {
            str2 = searchSugItem.sugType;
        }
        return searchSugItem.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(SearchSugItem searchSugItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(searchSugItem.content, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, searchSugItem.content);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(searchSugItem.sugType, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 1, searchSugItem.sugType);
    }

    public final String component1() {
        return this.content;
    }

    public final String component2() {
        return this.sugType;
    }

    public final SearchSugItem copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new SearchSugItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSugItem)) {
            return false;
        }
        SearchSugItem searchSugItem = (SearchSugItem) obj;
        return j42.c(this.content, searchSugItem.content) && j42.c(this.sugType, searchSugItem.sugType);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSugType() {
        return this.sugType;
    }

    public int hashCode() {
        return this.sugType.hashCode() + (this.content.hashCode() * 31);
    }

    public String toString() {
        return hf1.x("SearchSugItem(content=", this.content, ", sugType=", this.sugType, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchSugItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSugItem() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public SearchSugItem(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.content = str;
        this.sugType = str2;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void getSugType$annotations() {
    }

    public /* synthetic */ SearchSugItem(String str, String str2, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
