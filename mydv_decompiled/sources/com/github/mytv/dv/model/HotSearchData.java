package com.github.mytv.dv.model;

import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
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
public final class HotSearchData {
    private final List<HotWord> wordList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new u7((byte) 25))};

    public /* synthetic */ HotSearchData(int i, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.wordList = null;
        } else {
            this.wordList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(HotWord$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotSearchData copy$default(HotSearchData hotSearchData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotSearchData.wordList;
        }
        return hotSearchData.copy(list);
    }

    public static final /* synthetic */ void write$Self$app(HotSearchData hotSearchData, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (!me0Var.q(serialDescriptor) && hotSearchData.wordList == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), hotSearchData.wordList);
    }

    public final List<HotWord> component1() {
        return this.wordList;
    }

    public final HotSearchData copy(List<HotWord> list) {
        return new HotSearchData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HotSearchData) && j42.c(this.wordList, ((HotSearchData) obj).wordList);
    }

    public final List<HotWord> getWordList() {
        return this.wordList;
    }

    public int hashCode() {
        List<HotWord> list = this.wordList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "HotSearchData(wordList=" + this.wordList + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return HotSearchData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotSearchData() {
        this((List) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public HotSearchData(List<HotWord> list) {
        this.wordList = list;
    }

    public /* synthetic */ HotSearchData(List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ void getWordList$annotations() {
    }
}
