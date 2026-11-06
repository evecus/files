package com.github.mytv.dv.widget;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.r7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetPlayback {
    public static final int $stable = 0;
    private final String author;
    private final String coverUrl;
    private final long durationMs;
    private final String id;
    private final boolean isLive;
    private final boolean isPlaying;
    private final String source;
    private final String title;

    public /* synthetic */ WidgetPlayback(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j, int i, er0 er0Var) {
        this(str, str2, str3, str4, str5, z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? 0L : j);
    }

    public static /* synthetic */ WidgetPlayback copy$default(WidgetPlayback widgetPlayback, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetPlayback.id;
        }
        if ((i & 2) != 0) {
            str2 = widgetPlayback.title;
        }
        if ((i & 4) != 0) {
            str3 = widgetPlayback.author;
        }
        if ((i & 8) != 0) {
            str4 = widgetPlayback.coverUrl;
        }
        if ((i & 16) != 0) {
            str5 = widgetPlayback.source;
        }
        if ((i & 32) != 0) {
            z = widgetPlayback.isPlaying;
        }
        if ((i & 64) != 0) {
            z2 = widgetPlayback.isLive;
        }
        if ((i & 128) != 0) {
            j = widgetPlayback.durationMs;
        }
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        String str6 = str5;
        String str7 = str3;
        return widgetPlayback.copy(str, str2, str7, str4, str6, z3, z4, j2);
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
        return this.coverUrl;
    }

    public final String component5() {
        return this.source;
    }

    public final boolean component6() {
        return this.isPlaying;
    }

    public final boolean component7() {
        return this.isLive;
    }

    public final long component8() {
        return this.durationMs;
    }

    public final WidgetPlayback copy(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new WidgetPlayback(str, str2, str3, str4, str5, z, z2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetPlayback)) {
            return false;
        }
        WidgetPlayback widgetPlayback = (WidgetPlayback) obj;
        return j42.c(this.id, widgetPlayback.id) && j42.c(this.title, widgetPlayback.title) && j42.c(this.author, widgetPlayback.author) && j42.c(this.coverUrl, widgetPlayback.coverUrl) && j42.c(this.source, widgetPlayback.source) && this.isPlaying == widgetPlayback.isPlaying && this.isLive == widgetPlayback.isLive && this.durationMs == widgetPlayback.durationMs;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n = (hf1.n(hf1.n(hf1.n(hf1.n(this.id.hashCode() * 31, 31, this.title), 31, this.author), 31, this.coverUrl), 31, this.source) + (this.isPlaying ? 1231 : 1237)) * 31;
        int i = this.isLive ? 1231 : 1237;
        long j = this.durationMs;
        return ((n + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.coverUrl;
        String str5 = this.source;
        boolean z = this.isPlaying;
        boolean z2 = this.isLive;
        long j = this.durationMs;
        StringBuilder F = r7.F("WidgetPlayback(id=", str, ", title=", str2, ", author=");
        r7.N(F, str3, ", coverUrl=", str4, ", source=");
        F.append(str5);
        F.append(", isPlaying=");
        F.append(z);
        F.append(", isLive=");
        F.append(z2);
        F.append(", durationMs=");
        F.append(j);
        F.append(")");
        return F.toString();
    }

    public WidgetPlayback(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.id = str;
        this.title = str2;
        this.author = str3;
        this.coverUrl = str4;
        this.source = str5;
        this.isPlaying = z;
        this.isLive = z2;
        this.durationMs = j;
    }
}
