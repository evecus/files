package okhttp3;

import defpackage.mz;
import defpackage.o70;
import defpackage.qx4;
import defpackage.sv2;
import defpackage.ut4;
import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.internal.http.HttpHeaders;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class CompressionInterceptor implements Interceptor {
    private final String acceptEncoding;
    private final DecompressionAlgorithm[] algorithms;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface DecompressionAlgorithm {
        ut4 decompress(mz mzVar);

        String getEncoding();
    }

    public CompressionInterceptor(DecompressionAlgorithm... decompressionAlgorithmArr) {
        decompressionAlgorithmArr.getClass();
        this.algorithms = decompressionAlgorithmArr;
        ArrayList arrayList = new ArrayList(decompressionAlgorithmArr.length);
        for (DecompressionAlgorithm decompressionAlgorithm : decompressionAlgorithmArr) {
            arrayList.add(decompressionAlgorithm.getEncoding());
        }
        this.acceptEncoding = o70.Z0(arrayList, ", ", null, null, 0, null, 62);
    }

    public final Response decompress$okhttp(Response response) {
        DecompressionAlgorithm lookupDecompressor$okhttp;
        response.getClass();
        if (HttpHeaders.promisesBody(response)) {
            ResponseBody body = response.body();
            String header$default = Response.header$default(response, "Content-Encoding", null, 2, null);
            if (header$default != null && (lookupDecompressor$okhttp = lookupDecompressor$okhttp(header$default)) != null) {
                return response.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(ResponseBody.Companion.create(sv2.m(lookupDecompressor$okhttp.decompress(body.source())), body.contentType(), -1L)).build();
            }
        }
        return response;
    }

    public final String getAcceptEncoding$okhttp() {
        return this.acceptEncoding;
    }

    public final DecompressionAlgorithm[] getAlgorithms() {
        return this.algorithms;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        return ((this.algorithms.length == 0) || chain.request().header("Accept-Encoding") != null) ? chain.proceed(chain.request()) : decompress$okhttp(chain.proceed(chain.request().newBuilder().header("Accept-Encoding", this.acceptEncoding).build()));
    }

    public final DecompressionAlgorithm lookupDecompressor$okhttp(String str) {
        str.getClass();
        for (DecompressionAlgorithm decompressionAlgorithm : this.algorithms) {
            if (qx4.t(decompressionAlgorithm.getEncoding(), str, true)) {
                return decompressionAlgorithm;
            }
        }
        return null;
    }
}
