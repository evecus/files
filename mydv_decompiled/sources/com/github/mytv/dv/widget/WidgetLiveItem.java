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
public final class WidgetLiveItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String author;
    private final String avatarUrl;
    private final String roomId;
    private final String title;
    private final String viewers;

    public /* synthetic */ WidgetLiveItem(int i, String str, String str2, String str3, String str4, String str5, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.roomId = "";
        } else {
            this.roomId = str;
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
            this.viewers = "";
        } else {
            this.viewers = str5;
        }
    }

    public static /* synthetic */ WidgetLiveItem copy$default(WidgetLiveItem widgetLiveItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetLiveItem.roomId;
        }
        if ((i & 2) != 0) {
            str2 = widgetLiveItem.title;
        }
        if ((i & 4) != 0) {
            str3 = widgetLiveItem.author;
        }
        if ((i & 8) != 0) {
            str4 = widgetLiveItem.avatarUrl;
        }
        if ((i & 16) != 0) {
            str5 = widgetLiveItem.viewers;
        }
        String str6 = str5;
        String str7 = str3;
        return widgetLiveItem.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$app(WidgetLiveItem widgetLiveItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(widgetLiveItem.roomId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, widgetLiveItem.roomId);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetLiveItem.title, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, widgetLiveItem.title);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetLiveItem.author, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, widgetLiveItem.author);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetLiveItem.avatarUrl, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, widgetLiveItem.avatarUrl);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(widgetLiveItem.viewers, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 4, widgetLiveItem.viewers);
    }

    public final String component1() {
        return this.roomId;
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
        return this.viewers;
    }

    public final WidgetLiveItem copy(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new WidgetLiveItem(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetLiveItem)) {
            return false;
        }
        WidgetLiveItem widgetLiveItem = (WidgetLiveItem) obj;
        return j42.c(this.roomId, widgetLiveItem.roomId) && j42.c(this.title, widgetLiveItem.title) && j42.c(this.author, widgetLiveItem.author) && j42.c(this.avatarUrl, widgetLiveItem.avatarUrl) && j42.c(this.viewers, widgetLiveItem.viewers);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewers() {
        return this.viewers;
    }

    public int hashCode() {
        return this.viewers.hashCode() + hf1.n(hf1.n(hf1.n(this.roomId.hashCode() * 31, 31, this.title), 31, this.author), 31, this.avatarUrl);
    }

    public String toString() {
        String str = this.roomId;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.avatarUrl;
        String str5 = this.viewers;
        StringBuilder F = r7.F("WidgetLiveItem(roomId=", str, ", title=", str2, ", author=");
        r7.N(F, str3, ", avatarUrl=", str4, ", viewers=");
        return hf1.z(F, str5, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WidgetLiveItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WidgetLiveItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (er0) null);
    }

    public WidgetLiveItem(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.roomId = str;
        this.title = str2;
        this.author = str3;
        this.avatarUrl = str4;
        this.viewers = str5;
    }

    public /* synthetic */ WidgetLiveItem(String str, String str2, String str3, String str4, String str5, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
