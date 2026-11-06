package androidx.media3.datasource.cache;

import androidx.media3.common.C;
import defpackage.r7;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j2, long j3, File file) {
        this.key = str;
        this.position = j;
        this.length = j2;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j3;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.position);
        sb.append(", ");
        return r7.D(sb, this.length, "]");
    }

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, C.TIME_UNSET, null);
    }
}
