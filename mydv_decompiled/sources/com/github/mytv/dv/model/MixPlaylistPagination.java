package com.github.mytv.dv.model;

import defpackage.j42;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MixPlaylistPagination {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final String mixId;
    private final int nextCursor;
    private final Map<Integer, List<Aweme>> pages;

    /* JADX WARN: Multi-variable type inference failed */
    public MixPlaylistPagination(String str, Map<Integer, ? extends List<Aweme>> map, int i, boolean z) {
        str.getClass();
        map.getClass();
        this.mixId = str;
        this.pages = map;
        this.nextCursor = i;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MixPlaylistPagination copy$default(MixPlaylistPagination mixPlaylistPagination, String str, Map map, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mixPlaylistPagination.mixId;
        }
        if ((i2 & 2) != 0) {
            map = mixPlaylistPagination.pages;
        }
        if ((i2 & 4) != 0) {
            i = mixPlaylistPagination.nextCursor;
        }
        if ((i2 & 8) != 0) {
            z = mixPlaylistPagination.hasMore;
        }
        return mixPlaylistPagination.copy(str, map, i, z);
    }

    public final String component1() {
        return this.mixId;
    }

    public final Map<Integer, List<Aweme>> component2() {
        return this.pages;
    }

    public final int component3() {
        return this.nextCursor;
    }

    public final boolean component4() {
        return this.hasMore;
    }

    public final MixPlaylistPagination copy(String str, Map<Integer, ? extends List<Aweme>> map, int i, boolean z) {
        str.getClass();
        map.getClass();
        return new MixPlaylistPagination(str, map, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixPlaylistPagination)) {
            return false;
        }
        MixPlaylistPagination mixPlaylistPagination = (MixPlaylistPagination) obj;
        return j42.c(this.mixId, mixPlaylistPagination.mixId) && j42.c(this.pages, mixPlaylistPagination.pages) && this.nextCursor == mixPlaylistPagination.nextCursor && this.hasMore == mixPlaylistPagination.hasMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final Map<Integer, List<Aweme>> getPages() {
        return this.pages;
    }

    public int hashCode() {
        return ((((this.pages.hashCode() + (this.mixId.hashCode() * 31)) * 31) + this.nextCursor) * 31) + (this.hasMore ? 1231 : 1237);
    }

    public String toString() {
        return "MixPlaylistPagination(mixId=" + this.mixId + ", pages=" + this.pages + ", nextCursor=" + this.nextCursor + ", hasMore=" + this.hasMore + ")";
    }
}
