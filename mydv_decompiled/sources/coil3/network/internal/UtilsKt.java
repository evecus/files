package coil3.network.internal;

import coil3.disk.DiskCache;
import coil3.network.NetworkHeaders;
import coil3.network.NetworkResponse;
import coil3.network.NetworkResponseBody;
import defpackage.hf1;
import defpackage.jx4;
import defpackage.s83;
import defpackage.zy;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String HTTP_METHOD_GET = "GET";
    public static final int HTTP_RESPONSE_NOT_MODIFIED = 304;
    public static final int HTTP_RESPONSE_OK = 200;
    public static final String MIME_TYPE_TEXT_PLAIN = "text/plain";

    public static final void abortQuietly(DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders.Builder append(NetworkHeaders.Builder builder, String str) {
        int I = jx4.I(str, ':', 0, 6);
        if (I != -1) {
            builder.add(jx4.g0(str.substring(0, I)).toString(), str.substring(I + 1));
            return builder;
        }
        s83.h("Unexpected header: ".concat(str));
        return null;
    }

    public static final void closeQuietly(AutoCloseable autoCloseable) {
        try {
            hf1.E(autoCloseable);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders plus(NetworkHeaders networkHeaders, NetworkHeaders networkHeaders2) {
        NetworkHeaders.Builder newBuilder = networkHeaders.newBuilder();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.asMap().entrySet()) {
            newBuilder.set(entry.getKey(), entry.getValue());
        }
        return newBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBuffer(coil3.network.NetworkResponseBody r4, defpackage.fj0 r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L38
            java.lang.Object r4 = r0.L$3
            cz r4 = (defpackage.cz) r4
            java.lang.Object r1 = r0.L$2
            coil3.network.NetworkResponseBody r1 = (coil3.network.NetworkResponseBody) r1
            java.lang.Object r1 = r0.L$1
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            java.lang.Object r0 = r0.L$0
            coil3.network.NetworkResponseBody r0 = (coil3.network.NetworkResponseBody) r0
            defpackage.mu0.V(r5)     // Catch: java.lang.Throwable -> L36
            goto L5b
        L36:
            r4 = move-exception
            goto L62
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r3
        L3e:
            defpackage.mu0.V(r5)
            cz r5 = new cz     // Catch: java.lang.Throwable -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L5f
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L5f
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L5f
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L5f
            r0.label = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r4.writeTo(r5, r0)     // Catch: java.lang.Throwable -> L5f
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r4
            r4 = r5
        L5b:
            defpackage.mw2.v(r1, r3)
            return r4
        L5f:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L62:
            throw r4     // Catch: java.lang.Throwable -> L63
        L63:
            r5 = move-exception
            defpackage.mw2.v(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.readBuffer(coil3.network.NetworkResponseBody, fj0):java.lang.Object");
    }

    public static final NetworkResponseBody requireBody(NetworkResponse networkResponse) {
        NetworkResponseBody body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        zy.i("body == null");
        return null;
    }
}
