package com.github.mytv.dv.model;

import defpackage.j42;
import defpackage.jx4;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ResolvedStreamQuality {
    private final int level;
    private final String name;
    private final List<String> urls;

    public ResolvedStreamQuality(String str, int i, List<String> list) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.level = i;
        this.urls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolvedStreamQuality copy$default(ResolvedStreamQuality resolvedStreamQuality, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = resolvedStreamQuality.name;
        }
        if ((i2 & 2) != 0) {
            i = resolvedStreamQuality.level;
        }
        if ((i2 & 4) != 0) {
            list = resolvedStreamQuality.urls;
        }
        return resolvedStreamQuality.copy(str, i, list);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.level;
    }

    public final List<String> component3() {
        return this.urls;
    }

    public final ResolvedStreamQuality copy(String str, int i, List<String> list) {
        str.getClass();
        list.getClass();
        return new ResolvedStreamQuality(str, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedStreamQuality)) {
            return false;
        }
        ResolvedStreamQuality resolvedStreamQuality = (ResolvedStreamQuality) obj;
        return j42.c(this.name, resolvedStreamQuality.name) && this.level == resolvedStreamQuality.level && j42.c(this.urls, resolvedStreamQuality.urls);
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return this.urls.hashCode() + (((this.name.hashCode() * 31) + this.level) * 31);
    }

    public final ResolvedLiveStream toResolvedLiveStream() {
        List<String> list = this.urls;
        String str = this.name;
        if (jx4.L(str)) {
            str = "默认";
        }
        return new ResolvedLiveStream(list, str);
    }

    public String toString() {
        return "ResolvedStreamQuality(name=" + this.name + ", level=" + this.level + ", urls=" + this.urls + ")";
    }
}
