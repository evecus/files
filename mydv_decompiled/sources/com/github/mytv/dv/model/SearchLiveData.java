package com.github.mytv.dv.model;

import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchLiveData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final SearchLiveLives lives;

    public /* synthetic */ SearchLiveData(int i, SearchLiveLives searchLiveLives, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.lives = null;
        } else {
            this.lives = searchLiveLives;
        }
    }

    public static /* synthetic */ SearchLiveData copy$default(SearchLiveData searchLiveData, SearchLiveLives searchLiveLives, int i, Object obj) {
        if ((i & 1) != 0) {
            searchLiveLives = searchLiveData.lives;
        }
        return searchLiveData.copy(searchLiveLives);
    }

    public static final /* synthetic */ void write$Self$app(SearchLiveData searchLiveData, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (!me0Var.q(serialDescriptor) && searchLiveData.lives == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, SearchLiveLives$$serializer.INSTANCE, searchLiveData.lives);
    }

    public final SearchLiveLives component1() {
        return this.lives;
    }

    public final SearchLiveData copy(SearchLiveLives searchLiveLives) {
        return new SearchLiveData(searchLiveLives);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchLiveData) && j42.c(this.lives, ((SearchLiveData) obj).lives);
    }

    public final SearchLiveLives getLives() {
        return this.lives;
    }

    public int hashCode() {
        SearchLiveLives searchLiveLives = this.lives;
        if (searchLiveLives == null) {
            return 0;
        }
        return searchLiveLives.hashCode();
    }

    public String toString() {
        return "SearchLiveData(lives=" + this.lives + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchLiveData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchLiveData() {
        this((SearchLiveLives) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public SearchLiveData(SearchLiveLives searchLiveLives) {
        this.lives = searchLiveLives;
    }

    public /* synthetic */ SearchLiveData(SearchLiveLives searchLiveLives, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : searchLiveLives);
    }

    public static /* synthetic */ void getLives$annotations() {
    }
}
