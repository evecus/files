package okhttp3.internal.http;

import defpackage.mz;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final mz source;

    public RealResponseBody(String str, long j, mz mzVar) {
        mzVar.getClass();
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = mzVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public mz source() {
        return this.source;
    }
}
