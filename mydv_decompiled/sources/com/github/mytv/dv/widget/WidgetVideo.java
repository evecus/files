package com.github.mytv.dv.widget;

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
/* loaded from: classes2.dex */
public final class WidgetVideo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String author;
    private final String avatarUrl;
    private final String coverUrl;
    private final String duration;
    private final String id;
    private final String likes;
    private final String title;

    public /* synthetic */ WidgetVideo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.author = "";
        } else {
            this.author = str3;
        }
        if ((i & 8) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str4;
        }
        if ((i & 16) == 0) {
            this.coverUrl = "";
        } else {
            this.coverUrl = str5;
        }
        if ((i & 32) == 0) {
            this.duration = "";
        } else {
            this.duration = str6;
        }
        if ((i & 64) == 0) {
            this.likes = "";
        } else {
            this.likes = str7;
        }
    }

    public static /* synthetic */ WidgetVideo copy$default(WidgetVideo widgetVideo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetVideo.id;
        }
        if ((i & 2) != 0) {
            str2 = widgetVideo.title;
        }
        if ((i & 4) != 0) {
            str3 = widgetVideo.author;
        }
        if ((i & 8) != 0) {
            str4 = widgetVideo.avatarUrl;
        }
        if ((i & 16) != 0) {
            str5 = widgetVideo.coverUrl;
        }
        if ((i & 32) != 0) {
            str6 = widgetVideo.duration;
        }
        if ((i & 64) != 0) {
            str7 = widgetVideo.likes;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return widgetVideo.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$app(WidgetVideo widgetVideo, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.id, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, widgetVideo.id);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.title, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, widgetVideo.title);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.author, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, widgetVideo.author);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.avatarUrl, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, widgetVideo.avatarUrl);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.coverUrl, "")) {
            ((ax4) me0Var).E(serialDescriptor, 4, widgetVideo.coverUrl);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetVideo.duration, "")) {
            ((ax4) me0Var).E(serialDescriptor, 5, widgetVideo.duration);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(widgetVideo.likes, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 6, widgetVideo.likes);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.coverUrl;
    }

    public final String component6() {
        return this.duration;
    }

    public final String component7() {
        return this.likes;
    }

    public final WidgetVideo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new WidgetVideo(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetVideo)) {
            return false;
        }
        WidgetVideo widgetVideo = (WidgetVideo) obj;
        return j42.c(this.id, widgetVideo.id) && j42.c(this.title, widgetVideo.title) && j42.c(this.author, widgetVideo.author) && j42.c(this.avatarUrl, widgetVideo.avatarUrl) && j42.c(this.coverUrl, widgetVideo.coverUrl) && j42.c(this.duration, widgetVideo.duration) && j42.c(this.likes, widgetVideo.likes);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLikes() {
        return this.likes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.likes.hashCode() + hf1.n(hf1.n(hf1.n(hf1.n(hf1.n(this.id.hashCode() * 31, 31, this.title), 31, this.author), 31, this.avatarUrl), 31, this.coverUrl), 31, this.duration);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.avatarUrl;
        String str5 = this.coverUrl;
        String str6 = this.duration;
        String str7 = this.likes;
        StringBuilder F = r7.F("WidgetVideo(id=", str, ", title=", str2, ", author=");
        r7.N(F, str3, ", avatarUrl=", str4, ", coverUrl=");
        r7.N(F, str5, ", duration=", str6, ", likes=");
        return hf1.z(F, str7, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WidgetVideo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WidgetVideo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (er0) null);
    }

    public WidgetVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.id = str;
        this.title = str2;
        this.author = str3;
        this.avatarUrl = str4;
        this.coverUrl = str5;
        this.duration = str6;
        this.likes = str7;
    }

    public /* synthetic */ WidgetVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
