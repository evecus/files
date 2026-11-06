package androidx.media3.datasource.cache;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import defpackage.r7;
import defpackage.sp0;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j, long j2, CachedContentIndex cachedContentIndex) {
        long j3;
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String keyForId = cachedContentIndex.getKeyForId(Integer.parseInt(group));
        if (keyForId == null) {
            return null;
        }
        if (j == -1) {
            j = file2.length();
        }
        long j4 = j;
        if (j4 == 0) {
            return null;
        }
        String group2 = matcher.group(2);
        group2.getClass();
        long parseLong = Long.parseLong(group2);
        if (j2 == C.TIME_UNSET) {
            String group3 = matcher.group(3);
            group3.getClass();
            j3 = Long.parseLong(group3);
        } else {
            j3 = j2;
        }
        return new SimpleCacheSpan(keyForId, parseLong, j4, j3, file2);
    }

    public static SimpleCacheSpan createHole(String str, long j, long j2) {
        return new SimpleCacheSpan(str, j, j2, C.TIME_UNSET, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j) {
        return new SimpleCacheSpan(str, j, -1L, C.TIME_UNSET, null);
    }

    public static File getCacheFile(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, r7.D(sb, j2, SUFFIX));
    }

    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String str;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            str = Util.unescapeFileName(group);
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (matcher.matches()) {
                str = matcher.group(1);
                str.getClass();
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        File parentFile = file.getParentFile();
        parentFile.getClass();
        int assignIdForKey = cachedContentIndex.assignIdForKey(str);
        String group2 = matcher.group(2);
        group2.getClass();
        long parseLong = Long.parseLong(group2);
        String group3 = matcher.group(3);
        group3.getClass();
        File cacheFile = getCacheFile(parentFile, assignIdForKey, parseLong, Long.parseLong(group3));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j) {
        sp0.z(this.isCached);
        return new SimpleCacheSpan(this.key, this.position, this.length, j, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j, CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j, C.TIME_UNSET, cachedContentIndex);
    }
}
