package defpackage;

import androidx.media3.common.MimeTypes;
import coil3.network.internal.UtilsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bz0 implements Interceptor {
    public final /* synthetic */ n11 a;

    public bz0(n11 n11Var) {
        this.a = n11Var;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        String host = request.url().host();
        boolean z = jx4.D(host, "douyinvod.com", false) || jx4.D(host, "byteimg.com", false);
        Request.Builder header = request.newBuilder().header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36").header("Referer", "https://www.douyin.com/").header("Accept", "*/*").header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8").header("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"147\", \"Google Chrome\";v=\"147\"").header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"");
        if (z) {
            header.header("Sec-Fetch-Dest", MimeTypes.BASE_TYPE_VIDEO).header("Sec-Fetch-Mode", "no-cors").header("Sec-Fetch-Site", "cross-site").removeHeader("Origin");
        } else {
            header.header("Origin", "https://www.douyin.com").header(UtilsKt.CACHE_CONTROL, "no-cache").header("Pragma", "no-cache").header("Sec-Fetch-Dest", "empty").header("Sec-Fetch-Mode", "cors").header("Sec-Fetch-Site", "same-origin");
        }
        if (jx4.D(host, "douyin.com", false) || jx4.D(host, "douyinvod.com", false)) {
            header.header("Cookie", this.a.a.g());
        }
        return chain.proceed(header.build());
    }
}
