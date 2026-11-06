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
public final class HotWord {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long hotValue;
    private final int label;
    private final int position;
    private final String sentenceId;
    private final String word;

    public /* synthetic */ HotWord(int i, String str, long j, int i2, String str2, int i3, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.word = "";
        } else {
            this.word = str;
        }
        if ((i & 2) == 0) {
            this.hotValue = 0L;
        } else {
            this.hotValue = j;
        }
        if ((i & 4) == 0) {
            this.position = 0;
        } else {
            this.position = i2;
        }
        if ((i & 8) == 0) {
            this.sentenceId = "";
        } else {
            this.sentenceId = str2;
        }
        if ((i & 16) == 0) {
            this.label = 0;
        } else {
            this.label = i3;
        }
    }

    public static /* synthetic */ HotWord copy$default(HotWord hotWord, String str, long j, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hotWord.word;
        }
        if ((i3 & 2) != 0) {
            j = hotWord.hotValue;
        }
        if ((i3 & 4) != 0) {
            i = hotWord.position;
        }
        if ((i3 & 8) != 0) {
            str2 = hotWord.sentenceId;
        }
        if ((i3 & 16) != 0) {
            i2 = hotWord.label;
        }
        int i4 = i2;
        int i5 = i;
        return hotWord.copy(str, j, i5, str2, i4);
    }

    public static final /* synthetic */ void write$Self$app(HotWord hotWord, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(hotWord.word, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, hotWord.word);
        }
        if (me0Var.q(serialDescriptor) || hotWord.hotValue != 0) {
            ((ax4) me0Var).B(serialDescriptor, 1, hotWord.hotValue);
        }
        if (me0Var.q(serialDescriptor) || hotWord.position != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, hotWord.position);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(hotWord.sentenceId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, hotWord.sentenceId);
        }
        if (!me0Var.q(serialDescriptor) && hotWord.label == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 4, hotWord.label);
    }

    public final String component1() {
        return this.word;
    }

    public final long component2() {
        return this.hotValue;
    }

    public final int component3() {
        return this.position;
    }

    public final String component4() {
        return this.sentenceId;
    }

    public final int component5() {
        return this.label;
    }

    public final HotWord copy(String str, long j, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        return new HotWord(str, j, i, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotWord)) {
            return false;
        }
        HotWord hotWord = (HotWord) obj;
        return j42.c(this.word, hotWord.word) && this.hotValue == hotWord.hotValue && this.position == hotWord.position && j42.c(this.sentenceId, hotWord.sentenceId) && this.label == hotWord.label;
    }

    public final long getHotValue() {
        return this.hotValue;
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getSentenceId() {
        return this.sentenceId;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        int hashCode = this.word.hashCode() * 31;
        long j = this.hotValue;
        return hf1.n((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.position) * 31, 31, this.sentenceId) + this.label;
    }

    public String toString() {
        return "HotWord(word=" + this.word + ", hotValue=" + this.hotValue + ", position=" + this.position + ", sentenceId=" + this.sentenceId + ", label=" + this.label + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return HotWord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHotValue$annotations() {
    }

    public static /* synthetic */ void getLabel$annotations() {
    }

    public static /* synthetic */ void getPosition$annotations() {
    }

    public static /* synthetic */ void getSentenceId$annotations() {
    }

    public static /* synthetic */ void getWord$annotations() {
    }

    public HotWord() {
        this((String) null, 0L, 0, (String) null, 0, 31, (er0) null);
    }

    public HotWord(String str, long j, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.word = str;
        this.hotValue = j;
        this.position = i;
        this.sentenceId = str2;
        this.label = i2;
    }

    public /* synthetic */ HotWord(String str, long j, int i, String str2, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0 : i2);
    }
}
