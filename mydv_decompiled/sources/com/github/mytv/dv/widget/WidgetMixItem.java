package com.github.mytv.dv.widget;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.r7;
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
public final class WidgetMixItem {
    private final String author;
    private final String coverUrl;
    private final int episode;
    private final String id;
    private final String name;
    private final List<WidgetEpisode> nextEpisodes;
    private final String resumeAwemeId;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {null, null, null, null, null, null, null, ut0.K(dh2.I, new yw4(20))};

    public /* synthetic */ WidgetMixItem(int i, String str, String str2, String str3, String str4, int i2, int i3, String str5, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.author = "";
        } else {
            this.author = str3;
        }
        if ((i & 8) == 0) {
            this.coverUrl = "";
        } else {
            this.coverUrl = str4;
        }
        if ((i & 16) == 0) {
            this.episode = 0;
        } else {
            this.episode = i2;
        }
        if ((i & 32) == 0) {
            this.total = 0;
        } else {
            this.total = i3;
        }
        if ((i & 64) == 0) {
            this.resumeAwemeId = "";
        } else {
            this.resumeAwemeId = str5;
        }
        if ((i & 128) == 0) {
            this.nextEpisodes = o91.I;
        } else {
            this.nextEpisodes = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(WidgetEpisode$$serializer.INSTANCE);
    }

    public static /* synthetic */ WidgetMixItem copy$default(WidgetMixItem widgetMixItem, String str, String str2, String str3, String str4, int i, int i2, String str5, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = widgetMixItem.id;
        }
        if ((i3 & 2) != 0) {
            str2 = widgetMixItem.name;
        }
        if ((i3 & 4) != 0) {
            str3 = widgetMixItem.author;
        }
        if ((i3 & 8) != 0) {
            str4 = widgetMixItem.coverUrl;
        }
        if ((i3 & 16) != 0) {
            i = widgetMixItem.episode;
        }
        if ((i3 & 32) != 0) {
            i2 = widgetMixItem.total;
        }
        if ((i3 & 64) != 0) {
            str5 = widgetMixItem.resumeAwemeId;
        }
        if ((i3 & 128) != 0) {
            list = widgetMixItem.nextEpisodes;
        }
        String str6 = str5;
        List list2 = list;
        int i4 = i;
        int i5 = i2;
        return widgetMixItem.copy(str, str2, str3, str4, i4, i5, str6, list2);
    }

    public static final /* synthetic */ void write$Self$app(WidgetMixItem widgetMixItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(widgetMixItem.id, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, widgetMixItem.id);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetMixItem.name, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, widgetMixItem.name);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetMixItem.author, "")) {
            ((ax4) me0Var).E(serialDescriptor, 2, widgetMixItem.author);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetMixItem.coverUrl, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, widgetMixItem.coverUrl);
        }
        if (me0Var.q(serialDescriptor) || widgetMixItem.episode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 4, widgetMixItem.episode);
        }
        if (me0Var.q(serialDescriptor) || widgetMixItem.total != 0) {
            ((ax4) me0Var).A(serialDescriptor, 5, widgetMixItem.total);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(widgetMixItem.resumeAwemeId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 6, widgetMixItem.resumeAwemeId);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(widgetMixItem.nextEpisodes, o91.I)) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 7, (KSerializer) uc2VarArr[7].getValue(), widgetMixItem.nextEpisodes);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.coverUrl;
    }

    public final int component5() {
        return this.episode;
    }

    public final int component6() {
        return this.total;
    }

    public final String component7() {
        return this.resumeAwemeId;
    }

    public final List<WidgetEpisode> component8() {
        return this.nextEpisodes;
    }

    public final WidgetMixItem copy(String str, String str2, String str3, String str4, int i, int i2, String str5, List<WidgetEpisode> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        return new WidgetMixItem(str, str2, str3, str4, i, i2, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetMixItem)) {
            return false;
        }
        WidgetMixItem widgetMixItem = (WidgetMixItem) obj;
        return j42.c(this.id, widgetMixItem.id) && j42.c(this.name, widgetMixItem.name) && j42.c(this.author, widgetMixItem.author) && j42.c(this.coverUrl, widgetMixItem.coverUrl) && this.episode == widgetMixItem.episode && this.total == widgetMixItem.total && j42.c(this.resumeAwemeId, widgetMixItem.resumeAwemeId) && j42.c(this.nextEpisodes, widgetMixItem.nextEpisodes);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final int getEpisode() {
        return this.episode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<WidgetEpisode> getNextEpisodes() {
        return this.nextEpisodes;
    }

    public final String getResumeAwemeId() {
        return this.resumeAwemeId;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.nextEpisodes.hashCode() + hf1.n((((hf1.n(hf1.n(hf1.n(this.id.hashCode() * 31, 31, this.name), 31, this.author), 31, this.coverUrl) + this.episode) * 31) + this.total) * 31, 31, this.resumeAwemeId);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.author;
        String str4 = this.coverUrl;
        int i = this.episode;
        int i2 = this.total;
        String str5 = this.resumeAwemeId;
        List<WidgetEpisode> list = this.nextEpisodes;
        StringBuilder F = r7.F("WidgetMixItem(id=", str, ", name=", str2, ", author=");
        r7.N(F, str3, ", coverUrl=", str4, ", episode=");
        F.append(i);
        F.append(", total=");
        F.append(i2);
        F.append(", resumeAwemeId=");
        F.append(str5);
        F.append(", nextEpisodes=");
        F.append(list);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WidgetMixItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WidgetMixItem() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (List) null, 255, (er0) null);
    }

    public WidgetMixItem(String str, String str2, String str3, String str4, int i, int i2, String str5, List<WidgetEpisode> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        this.id = str;
        this.name = str2;
        this.author = str3;
        this.coverUrl = str4;
        this.episode = i;
        this.total = i2;
        this.resumeAwemeId = str5;
        this.nextEpisodes = list;
    }

    public /* synthetic */ WidgetMixItem(String str, String str2, String str3, String str4, int i, int i2, String str5, List list, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? o91.I : list);
    }
}
