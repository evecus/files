package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.sp;
import defpackage.u7;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CollectListResponse {
    private final List<CollectItem> collectsList;
    private final int hasMore;
    private final int statusCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new u7((byte) 9)), null, null};

    public /* synthetic */ CollectListResponse(int i, List list, int i2, int i3, yj4 yj4Var) {
        this.collectsList = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.hasMore = 0;
        } else {
            this.hasMore = i2;
        }
        if ((i & 4) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(CollectItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectListResponse copy$default(CollectListResponse collectListResponse, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = collectListResponse.collectsList;
        }
        if ((i3 & 2) != 0) {
            i = collectListResponse.hasMore;
        }
        if ((i3 & 4) != 0) {
            i2 = collectListResponse.statusCode;
        }
        return collectListResponse.copy(list, i, i2);
    }

    public static final /* synthetic */ void write$Self$app(CollectListResponse collectListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || collectListResponse.collectsList != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), collectListResponse.collectsList);
        }
        if (me0Var.q(serialDescriptor) || collectListResponse.hasMore != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, collectListResponse.hasMore);
        }
        if (!me0Var.q(serialDescriptor) && collectListResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 2, collectListResponse.statusCode);
    }

    public final List<CollectItem> component1() {
        return this.collectsList;
    }

    public final int component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.statusCode;
    }

    public final CollectListResponse copy(List<CollectItem> list, int i, int i2) {
        return new CollectListResponse(list, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectListResponse)) {
            return false;
        }
        CollectListResponse collectListResponse = (CollectListResponse) obj;
        return j42.c(this.collectsList, collectListResponse.collectsList) && this.hasMore == collectListResponse.hasMore && this.statusCode == collectListResponse.statusCode;
    }

    public final List<CollectItem> getCollectsList() {
        return this.collectsList;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<CollectItem> list = this.collectsList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.hasMore) * 31) + this.statusCode;
    }

    public String toString() {
        List<CollectItem> list = this.collectsList;
        int i = this.hasMore;
        int i2 = this.statusCode;
        StringBuilder sb = new StringBuilder("CollectListResponse(collectsList=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(i);
        sb.append(", statusCode=");
        return nt3.n(sb, i2, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return CollectListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCollectsList$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public CollectListResponse() {
        this((List) null, 0, 0, 7, (er0) null);
    }

    public CollectListResponse(List<CollectItem> list, int i, int i2) {
        this.collectsList = list;
        this.hasMore = i;
        this.statusCode = i2;
    }

    public /* synthetic */ CollectListResponse(List list, int i, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
