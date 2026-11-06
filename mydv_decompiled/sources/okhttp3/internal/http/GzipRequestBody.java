package okhttp3.internal.http;

import defpackage.cs1;
import defpackage.lz;
import defpackage.q04;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class GzipRequestBody extends RequestBody {
    private final RequestBody delegate;

    public GzipRequestBody(RequestBody requestBody) {
        requestBody.getClass();
        this.delegate = requestBody;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.delegate.contentType();
    }

    public final RequestBody getDelegate() {
        return this.delegate;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.delegate.isOneShot();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(lz lzVar) {
        lzVar.getClass();
        q04 q04Var = new q04(new cs1(lzVar));
        try {
            this.delegate.writeTo(q04Var);
            q04Var.close();
        } finally {
        }
    }
}
