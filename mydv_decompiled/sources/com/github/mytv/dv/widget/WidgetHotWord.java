package com.github.mytv.dv.widget;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetHotWord {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int label;
    private final String word;

    public /* synthetic */ WidgetHotWord(int i, String str, int i2, yj4 yj4Var) {
        this.word = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.label = 0;
        } else {
            this.label = i2;
        }
    }

    public static /* synthetic */ WidgetHotWord copy$default(WidgetHotWord widgetHotWord, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = widgetHotWord.word;
        }
        if ((i2 & 2) != 0) {
            i = widgetHotWord.label;
        }
        return widgetHotWord.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$app(WidgetHotWord widgetHotWord, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(widgetHotWord.word, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, widgetHotWord.word);
        }
        if (!me0Var.q(serialDescriptor) && widgetHotWord.label == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, widgetHotWord.label);
    }

    public final String component1() {
        return this.word;
    }

    public final int component2() {
        return this.label;
    }

    public final WidgetHotWord copy(String str, int i) {
        str.getClass();
        return new WidgetHotWord(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetHotWord)) {
            return false;
        }
        WidgetHotWord widgetHotWord = (WidgetHotWord) obj;
        return j42.c(this.word, widgetHotWord.word) && this.label == widgetHotWord.label;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return (this.word.hashCode() * 31) + this.label;
    }

    public String toString() {
        return "WidgetHotWord(word=" + this.word + ", label=" + this.label + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WidgetHotWord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetHotWord() {
        this((String) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public WidgetHotWord(String str, int i) {
        str.getClass();
        this.word = str;
        this.label = i;
    }

    public /* synthetic */ WidgetHotWord(String str, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
