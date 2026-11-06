package okhttp3.internal;

import defpackage.cz;
import defpackage.mz;
import defpackage.s04;
import defpackage.u75;
import defpackage.ut4;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UnreadableResponseBody extends ResponseBody implements ut4 {
    private final long contentLength;
    private final MediaType mediaType;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.mediaType = mediaType;
        this.contentLength = j;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.mediaType;
    }

    @Override // defpackage.ut4
    public long read(cz czVar, long j) {
        czVar.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public mz source() {
        return new s04(this);
    }

    @Override // defpackage.ut4
    public u75 timeout() {
        return u75.NONE;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
