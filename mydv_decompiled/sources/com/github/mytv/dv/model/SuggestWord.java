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
public final class SuggestWord {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String word;
    private final int wordType;

    public /* synthetic */ SuggestWord(int i, String str, int i2, yj4 yj4Var) {
        this.word = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.wordType = 0;
        } else {
            this.wordType = i2;
        }
    }

    public static /* synthetic */ SuggestWord copy$default(SuggestWord suggestWord, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = suggestWord.word;
        }
        if ((i2 & 2) != 0) {
            i = suggestWord.wordType;
        }
        return suggestWord.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$app(SuggestWord suggestWord, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(suggestWord.word, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, suggestWord.word);
        }
        if (!me0Var.q(serialDescriptor) && suggestWord.wordType == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, suggestWord.wordType);
    }

    public final String component1() {
        return this.word;
    }

    public final int component2() {
        return this.wordType;
    }

    public final SuggestWord copy(String str, int i) {
        str.getClass();
        return new SuggestWord(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestWord)) {
            return false;
        }
        SuggestWord suggestWord = (SuggestWord) obj;
        return j42.c(this.word, suggestWord.word) && this.wordType == suggestWord.wordType;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordType() {
        return this.wordType;
    }

    public int hashCode() {
        return (this.word.hashCode() * 31) + this.wordType;
    }

    public String toString() {
        return "SuggestWord(word=" + this.word + ", wordType=" + this.wordType + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SuggestWord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestWord() {
        this((String) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public SuggestWord(String str, int i) {
        str.getClass();
        this.word = str;
        this.wordType = i;
    }

    public /* synthetic */ SuggestWord(String str, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getWord$annotations() {
    }

    public static /* synthetic */ void getWordType$annotations() {
    }
}
