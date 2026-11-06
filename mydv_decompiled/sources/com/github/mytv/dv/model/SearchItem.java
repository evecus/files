package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Aweme awemeInfo;
    private final int type;

    public /* synthetic */ SearchItem(int i, Aweme aweme, int i2, yj4 yj4Var) {
        this.awemeInfo = (i & 1) == 0 ? null : aweme;
        if ((i & 2) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
    }

    public static /* synthetic */ SearchItem copy$default(SearchItem searchItem, Aweme aweme, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = searchItem.awemeInfo;
        }
        if ((i2 & 2) != 0) {
            i = searchItem.type;
        }
        return searchItem.copy(aweme, i);
    }

    public static final /* synthetic */ void write$Self$app(SearchItem searchItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || searchItem.awemeInfo != null) {
            me0Var.k(serialDescriptor, 0, Aweme$$serializer.INSTANCE, searchItem.awemeInfo);
        }
        if (!me0Var.q(serialDescriptor) && searchItem.type == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, searchItem.type);
    }

    public final Aweme component1() {
        return this.awemeInfo;
    }

    public final int component2() {
        return this.type;
    }

    public final SearchItem copy(Aweme aweme, int i) {
        return new SearchItem(aweme, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) obj;
        return j42.c(this.awemeInfo, searchItem.awemeInfo) && this.type == searchItem.type;
    }

    public final Aweme getAwemeInfo() {
        return this.awemeInfo;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        Aweme aweme = this.awemeInfo;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + this.type;
    }

    public String toString() {
        return "SearchItem(awemeInfo=" + this.awemeInfo + ", type=" + this.type + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchItem() {
        this((Aweme) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public SearchItem(Aweme aweme, int i) {
        this.awemeInfo = aweme;
        this.type = i;
    }

    public /* synthetic */ SearchItem(Aweme aweme, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : aweme, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getAwemeInfo$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
