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
public final class SeoLink {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String link;
    private final String title;

    public /* synthetic */ SeoLink(int i, String str, String str2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.link = "";
        } else {
            this.link = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public static /* synthetic */ SeoLink copy$default(SeoLink seoLink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seoLink.link;
        }
        if ((i & 2) != 0) {
            str2 = seoLink.title;
        }
        return seoLink.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(SeoLink seoLink, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(seoLink.link, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, seoLink.link);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(seoLink.title, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 1, seoLink.title);
    }

    public final String component1() {
        return this.link;
    }

    public final String component2() {
        return this.title;
    }

    public final SeoLink copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new SeoLink(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeoLink)) {
            return false;
        }
        SeoLink seoLink = (SeoLink) obj;
        return j42.c(this.link, seoLink.link) && j42.c(this.title, seoLink.title);
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.link.hashCode() * 31);
    }

    public String toString() {
        return hf1.x("SeoLink(link=", this.link, ", title=", this.title, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SeoLink$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeoLink() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (er0) (0 == true ? 1 : 0));
    }

    public SeoLink(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.link = str;
        this.title = str2;
    }

    public static /* synthetic */ void getLink$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public /* synthetic */ SeoLink(String str, String str2, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
