package defpackage;

import android.content.Context;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.datasource.okhttp.OkHttpDataSource;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sn5 {
    public static volatile SimpleCache d;
    public static rn5 e;
    public static final sn5 a = new sn5();
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new g((byte) 2));
    public static final Object c = new Object();
    public static final Map f = sv2.K(new uj3("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"), new uj3("Referer", "https://www.douyin.com/"), new uj3("Accept", "*/*"), new uj3("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8"), new uj3("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"147\", \"Google Chrome\";v=\"147\""), new uj3("sec-ch-ua-mobile", "?0"), new uj3("sec-ch-ua-platform", "\"Windows\""));

    public static void a() {
        synchronized (c) {
            try {
                rn5 rn5Var = e;
                if (rn5Var != null) {
                    rn5Var.b().cancel();
                }
                e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CacheDataSource.Factory b(Context context, OkHttpClient okHttpClient) {
        context.getClass();
        okHttpClient.getClass();
        OkHttpDataSource.Factory defaultRequestProperties = new OkHttpDataSource.Factory(okHttpClient).setDefaultRequestProperties(f);
        defaultRequestProperties.getClass();
        CacheDataSource.Factory flags = new CacheDataSource.Factory().setCache(c(context)).setUpstreamDataSourceFactory(defaultRequestProperties).setFlags(2);
        flags.getClass();
        return flags;
    }

    public final synchronized SimpleCache c(Context context) {
        SimpleCache simpleCache = d;
        if (simpleCache != null) {
            return simpleCache;
        }
        Context applicationContext = context.getApplicationContext();
        SimpleCache simpleCache2 = new SimpleCache(new File(applicationContext.getCacheDir(), "video-media"), new LeastRecentlyUsedCacheEvictor(100663296L), new StandaloneDatabaseProvider(applicationContext));
        d = simpleCache2;
        return simpleCache2;
    }

    public final void d(Context context, String str, OkHttpClient okHttpClient) {
        context.getClass();
        str.getClass();
        okHttpClient.getClass();
        if (jx4.L(str) || c(context).isCached(str, 0L, 2097152L)) {
            return;
        }
        CacheDataSource createDataSourceForDownloading = b(context, okHttpClient).createDataSourceForDownloading();
        createDataSourceForDownloading.getClass();
        CacheWriter cacheWriter = new CacheWriter(createDataSourceForDownloading, new DataSpec.Builder().setUri(str).setPosition(0L).setLength(2097152L).build(), null, null);
        rn5 rn5Var = new rn5(str, cacheWriter);
        synchronized (c) {
            try {
                rn5 rn5Var2 = e;
                if (j42.c(rn5Var2 != null ? rn5Var2.a() : null, str)) {
                    return;
                }
                rn5 rn5Var3 = e;
                if (rn5Var3 != null) {
                    rn5Var3.b().cancel();
                }
                e = rn5Var;
                b.execute(new n95(cacheWriter, str, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
