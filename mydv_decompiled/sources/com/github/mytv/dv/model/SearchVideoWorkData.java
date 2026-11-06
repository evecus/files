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
public final class SearchVideoWorkData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Aweme awemeInfo;

    public /* synthetic */ SearchVideoWorkData(int i, Aweme aweme, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.awemeInfo = new Aweme((String) null, (String) null, (Video) null, (Author) null, (Statistics) null, 0L, 0, (PlayProgress) null, 0L, 0L, (String) null, (MixInfo) null, 4095, (er0) null);
        } else {
            this.awemeInfo = aweme;
        }
    }

    public static /* synthetic */ SearchVideoWorkData copy$default(SearchVideoWorkData searchVideoWorkData, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = searchVideoWorkData.awemeInfo;
        }
        return searchVideoWorkData.copy(aweme);
    }

    public static final /* synthetic */ void write$Self$app(SearchVideoWorkData searchVideoWorkData, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (!me0Var.q(serialDescriptor) && j42.c(searchVideoWorkData.awemeInfo, new Aweme((String) null, (String) null, (Video) null, (Author) null, (Statistics) null, 0L, 0, (PlayProgress) null, 0L, 0L, (String) null, (MixInfo) null, 4095, (er0) null))) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 0, Aweme$$serializer.INSTANCE, searchVideoWorkData.awemeInfo);
    }

    public final Aweme component1() {
        return this.awemeInfo;
    }

    public final SearchVideoWorkData copy(Aweme aweme) {
        aweme.getClass();
        return new SearchVideoWorkData(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchVideoWorkData) && j42.c(this.awemeInfo, ((SearchVideoWorkData) obj).awemeInfo);
    }

    public final Aweme getAwemeInfo() {
        return this.awemeInfo;
    }

    public int hashCode() {
        return this.awemeInfo.hashCode();
    }

    public String toString() {
        return "SearchVideoWorkData(awemeInfo=" + this.awemeInfo + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchVideoWorkData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAwemeInfo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchVideoWorkData() {
        this((Aweme) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public SearchVideoWorkData(Aweme aweme) {
        aweme.getClass();
        this.awemeInfo = aweme;
    }

    public /* synthetic */ SearchVideoWorkData(Aweme aweme, int i, er0 er0Var) {
        this((i & 1) != 0 ? new Aweme((String) null, (String) null, (Video) null, (Author) null, (Statistics) null, 0L, 0, (PlayProgress) null, 0L, 0L, (String) null, (MixInfo) null, 4095, (er0) null) : aweme);
    }
}
