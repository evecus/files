package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.df0;
import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EmojiUrl {
    private final String uri;
    private final List<String> urlList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {null, ut0.K(dh2.I, new df0(15))};

    public /* synthetic */ EmojiUrl(int i, String str, List list, yj4 yj4Var) {
        this.uri = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.urlList = o91.I;
        } else {
            this.urlList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(fx4.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiUrl copy$default(EmojiUrl emojiUrl, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emojiUrl.uri;
        }
        if ((i & 2) != 0) {
            list = emojiUrl.urlList;
        }
        return emojiUrl.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$app(EmojiUrl emojiUrl, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(emojiUrl.uri, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, emojiUrl.uri);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(emojiUrl.urlList, o91.I)) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), emojiUrl.urlList);
    }

    public final String component1() {
        return this.uri;
    }

    public final List<String> component2() {
        return this.urlList;
    }

    public final EmojiUrl copy(String str, List<String> list) {
        str.getClass();
        list.getClass();
        return new EmojiUrl(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiUrl)) {
            return false;
        }
        EmojiUrl emojiUrl = (EmojiUrl) obj;
        return j42.c(this.uri, emojiUrl.uri) && j42.c(this.urlList, emojiUrl.urlList);
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public int hashCode() {
        return this.urlList.hashCode() + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "EmojiUrl(uri=" + this.uri + ", urlList=" + this.urlList + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return EmojiUrl$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiUrl() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public EmojiUrl(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.uri = str;
        this.urlList = list;
    }

    public /* synthetic */ EmojiUrl(String str, List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? o91.I : list);
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    public static /* synthetic */ void getUrlList$annotations() {
    }
}
