package okhttp3;

import defpackage.ds1;
import defpackage.mz;
import defpackage.ut4;
import okhttp3.CompressionInterceptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Gzip implements CompressionInterceptor.DecompressionAlgorithm {
    public static final Gzip INSTANCE = new Gzip();

    private Gzip() {
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public ut4 decompress(mz mzVar) {
        mzVar.getClass();
        return new ds1(mzVar);
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public String getEncoding() {
        return "gzip";
    }
}
