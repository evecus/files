package com.github.mytv.dv.model;

import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import defpackage.yw4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SuggestWordGroup {
    private final List<SuggestWord> words;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new yw4(1))};

    public /* synthetic */ SuggestWordGroup(int i, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.words = null;
        } else {
            this.words = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(SuggestWord$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestWordGroup copy$default(SuggestWordGroup suggestWordGroup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = suggestWordGroup.words;
        }
        return suggestWordGroup.copy(list);
    }

    public static final /* synthetic */ void write$Self$app(SuggestWordGroup suggestWordGroup, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (!me0Var.q(serialDescriptor) && suggestWordGroup.words == null) {
            return;
        }
        me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), suggestWordGroup.words);
    }

    public final List<SuggestWord> component1() {
        return this.words;
    }

    public final SuggestWordGroup copy(List<SuggestWord> list) {
        return new SuggestWordGroup(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestWordGroup) && j42.c(this.words, ((SuggestWordGroup) obj).words);
    }

    public final List<SuggestWord> getWords() {
        return this.words;
    }

    public int hashCode() {
        List<SuggestWord> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "SuggestWordGroup(words=" + this.words + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SuggestWordGroup$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestWordGroup() {
        this((List) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public SuggestWordGroup(List<SuggestWord> list) {
        this.words = list;
    }

    public /* synthetic */ SuggestWordGroup(List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ void getWords$annotations() {
    }
}
