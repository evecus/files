package okhttp3.internal.http;

import okhttp3.Interceptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private CallServerInterceptor() {
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[Catch: IOException -> 0x00cd, TryCatch #2 {IOException -> 0x00cd, blocks: (B:71:0x00bf, B:73:0x00c8, B:25:0x00d0, B:26:0x00f6, B:28:0x00fc, B:30:0x0105, B:32:0x0108, B:35:0x012f, B:39:0x013b, B:42:0x0146, B:43:0x014d, B:47:0x0151, B:52:0x0162, B:53:0x01a5, B:55:0x01b3, B:62:0x01c8, B:64:0x01d7, B:65:0x01fd, B:66:0x01bd, B:67:0x018c), top: B:70:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
