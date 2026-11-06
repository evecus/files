package com.github.mytv.dv.model;

import defpackage.j42;
import defpackage.o70;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ResolvedLiveStream {
    public static final int $stable = 8;
    private final String qualityName;
    private final List<String> urls;

    public ResolvedLiveStream(List<String> list, String str) {
        list.getClass();
        str.getClass();
        this.urls = list;
        this.qualityName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolvedLiveStream copy$default(ResolvedLiveStream resolvedLiveStream, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resolvedLiveStream.urls;
        }
        if ((i & 2) != 0) {
            str = resolvedLiveStream.qualityName;
        }
        return resolvedLiveStream.copy(list, str);
    }

    public final List<String> component1() {
        return this.urls;
    }

    public final String component2() {
        return this.qualityName;
    }

    public final ResolvedLiveStream copy(List<String> list, String str) {
        list.getClass();
        str.getClass();
        return new ResolvedLiveStream(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedLiveStream)) {
            return false;
        }
        ResolvedLiveStream resolvedLiveStream = (ResolvedLiveStream) obj;
        return j42.c(this.urls, resolvedLiveStream.urls) && j42.c(this.qualityName, resolvedLiveStream.qualityName);
    }

    public final String getQualityName() {
        return this.qualityName;
    }

    public final String getUrl() {
        String str = (String) o70.U0(this.urls);
        return str == null ? "" : str;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return this.qualityName.hashCode() + (this.urls.hashCode() * 31);
    }

    public String toString() {
        return "ResolvedLiveStream(urls=" + this.urls + ", qualityName=" + this.qualityName + ")";
    }
}
