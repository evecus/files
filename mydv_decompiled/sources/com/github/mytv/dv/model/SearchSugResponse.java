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
public final class SearchSugResponse {
    private final int statusCode;
    private final List<SearchSugItem> sugList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new wd3((byte) 20)), null};

    public /* synthetic */ SearchSugResponse(int i, List list, int i2, yj4 yj4Var) {
        this.sugList = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(SearchSugItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchSugResponse copy$default(SearchSugResponse searchSugResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchSugResponse.sugList;
        }
        if ((i2 & 2) != 0) {
            i = searchSugResponse.statusCode;
        }
        return searchSugResponse.copy(list, i);
    }

    public static final /* synthetic */ void write$Self$app(SearchSugResponse searchSugResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || searchSugResponse.sugList != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), searchSugResponse.sugList);
        }
        if (!me0Var.q(serialDescriptor) && searchSugResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, searchSugResponse.statusCode);
    }

    public final List<SearchSugItem> component1() {
        return this.sugList;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final SearchSugResponse copy(List<SearchSugItem> list, int i) {
        return new SearchSugResponse(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSugResponse)) {
            return false;
        }
        SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
        return j42.c(this.sugList, searchSugResponse.sugList) && this.statusCode == searchSugResponse.statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final List<SearchSugItem> getSugList() {
        return this.sugList;
    }

    public int hashCode() {
        List<SearchSugItem> list = this.sugList;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "SearchSugResponse(sugList=" + this.sugList + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchSugResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSugResponse() {
        this((List) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public SearchSugResponse(List<SearchSugItem> list, int i) {
        this.sugList = list;
        this.statusCode = i;
    }

    public /* synthetic */ SearchSugResponse(List list, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getSugList$annotations() {
    }
}
