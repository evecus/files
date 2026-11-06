package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EmojiItem {
    private final String displayName;
    private final EmojiUrl emojiUrl;
    private final int hide;
    private final String originUri;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EmojiItem(int i, String str, String str2, int i2, EmojiUrl emojiUrl, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str;
        }
        if ((i & 2) == 0) {
            this.originUri = "";
        } else {
            this.originUri = str2;
        }
        if ((i & 4) == 0) {
            this.hide = 0;
        } else {
            this.hide = i2;
        }
        if ((i & 8) == 0) {
            this.emojiUrl = null;
        } else {
            this.emojiUrl = emojiUrl;
        }
    }

    public static /* synthetic */ EmojiItem copy$default(EmojiItem emojiItem, String str, String str2, int i, EmojiUrl emojiUrl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emojiItem.displayName;
        }
        if ((i2 & 2) != 0) {
            str2 = emojiItem.originUri;
        }
        if ((i2 & 4) != 0) {
            i = emojiItem.hide;
        }
        if ((i2 & 8) != 0) {
            emojiUrl = emojiItem.emojiUrl;
        }
        return emojiItem.copy(str, str2, i, emojiUrl);
    }

    public static final /* synthetic */ void write$Self$app(EmojiItem emojiItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(emojiItem.displayName, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, emojiItem.displayName);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(emojiItem.originUri, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, emojiItem.originUri);
        }
        if (me0Var.q(serialDescriptor) || emojiItem.hide != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, emojiItem.hide);
        }
        if (!me0Var.q(serialDescriptor) && emojiItem.emojiUrl == null) {
            return;
        }
        me0Var.k(serialDescriptor, 3, EmojiUrl$$serializer.INSTANCE, emojiItem.emojiUrl);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.originUri;
    }

    public final int component3() {
        return this.hide;
    }

    public final EmojiUrl component4() {
        return this.emojiUrl;
    }

    public final EmojiItem copy(String str, String str2, int i, EmojiUrl emojiUrl) {
        str.getClass();
        str2.getClass();
        return new EmojiItem(str, str2, i, emojiUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiItem)) {
            return false;
        }
        EmojiItem emojiItem = (EmojiItem) obj;
        return j42.c(this.displayName, emojiItem.displayName) && j42.c(this.originUri, emojiItem.originUri) && this.hide == emojiItem.hide && j42.c(this.emojiUrl, emojiItem.emojiUrl);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final EmojiUrl getEmojiUrl() {
        return this.emojiUrl;
    }

    public final int getHide() {
        return this.hide;
    }

    public final String getOriginUri() {
        return this.originUri;
    }

    public int hashCode() {
        int n = (hf1.n(this.displayName.hashCode() * 31, 31, this.originUri) + this.hide) * 31;
        EmojiUrl emojiUrl = this.emojiUrl;
        return n + (emojiUrl == null ? 0 : emojiUrl.hashCode());
    }

    public String toString() {
        String str = this.displayName;
        String str2 = this.originUri;
        int i = this.hide;
        EmojiUrl emojiUrl = this.emojiUrl;
        StringBuilder F = r7.F("EmojiItem(displayName=", str, ", originUri=", str2, ", hide=");
        F.append(i);
        F.append(", emojiUrl=");
        F.append(emojiUrl);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return EmojiItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getEmojiUrl$annotations() {
    }

    public static /* synthetic */ void getHide$annotations() {
    }

    public static /* synthetic */ void getOriginUri$annotations() {
    }

    public EmojiItem() {
        this((String) null, (String) null, 0, (EmojiUrl) null, 15, (er0) null);
    }

    public EmojiItem(String str, String str2, int i, EmojiUrl emojiUrl) {
        str.getClass();
        str2.getClass();
        this.displayName = str;
        this.originUri = str2;
        this.hide = i;
        this.emojiUrl = emojiUrl;
    }

    public /* synthetic */ EmojiItem(String str, String str2, int i, EmojiUrl emojiUrl, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : emojiUrl);
    }
}
