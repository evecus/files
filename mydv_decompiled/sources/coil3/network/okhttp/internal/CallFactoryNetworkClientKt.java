package coil3.network.okhttp.internal;

import coil3.network.NetworkClientKt;
import coil3.network.NetworkHeaders;
import coil3.network.NetworkResponse;
import defpackage.mz;
import defpackage.uj3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CallFactoryNetworkClientKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readByteString(coil3.network.NetworkRequestBody r4, defpackage.fj0 r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r4 = r0.L$1
            cz r4 = (defpackage.cz) r4
            java.lang.Object r0 = r0.L$0
            coil3.network.NetworkRequestBody r0 = (coil3.network.NetworkRequestBody) r0
            defpackage.mu0.V(r5)
            goto L4c
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L34:
            defpackage.mu0.V(r5)
            cz r5 = new cz
            r5.<init>()
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r4 = r4.writeTo(r5, r0)
            el0 r0 = defpackage.el0.I
            if (r4 != r0) goto L4b
            return r0
        L4b:
            r4 = r5
        L4c:
            long r0 = r4.J
            h00 r4 = r4.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClientKt.readByteString(coil3.network.NetworkRequestBody, fj0):java.lang.Object");
    }

    private static final Headers toHeaders(NetworkHeaders networkHeaders) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : networkHeaders.asMap().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder.addUnsafeNonAscii(key, it.next());
            }
        }
        return builder.build();
    }

    private static final NetworkHeaders toNetworkHeaders(Headers headers) {
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder();
        Iterator<uj3> it = headers.iterator();
        while (it.hasNext()) {
            uj3 next = it.next();
            builder.add((String) next.I, (String) next.J);
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkResponse toNetworkResponse(Response response) {
        mz source;
        int code = response.code();
        long sentRequestAtMillis = response.sentRequestAtMillis();
        long receivedResponseAtMillis = response.receivedResponseAtMillis();
        NetworkHeaders networkHeaders = toNetworkHeaders(response.headers());
        ResponseBody body = response.body();
        return new NetworkResponse(code, sentRequestAtMillis, receivedResponseAtMillis, networkHeaders, (body == null || (source = body.source()) == null) ? null : NetworkClientKt.NetworkResponseBody(source), response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toRequest(coil3.network.NetworkRequest r6, defpackage.fj0 r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L36
            java.lang.Object r6 = r0.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.L$2
            okhttp3.Request$Builder r1 = (okhttp3.Request.Builder) r1
            java.lang.Object r4 = r0.L$1
            okhttp3.Request$Builder r4 = (okhttp3.Request.Builder) r4
            java.lang.Object r0 = r0.L$0
            coil3.network.NetworkRequest r0 = (coil3.network.NetworkRequest) r0
            defpackage.mu0.V(r7)
            goto L6d
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L3c:
            defpackage.mu0.V(r7)
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            java.lang.String r7 = r6.getUrl()
            r1.url(r7)
            java.lang.String r7 = r6.getMethod()
            coil3.network.NetworkRequestBody r4 = r6.getBody()
            if (r4 == 0) goto L7b
            r0.L$0 = r6
            r0.L$1 = r1
            r0.L$2 = r1
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r0 = readByteString(r4, r0)
            el0 r4 = defpackage.el0.I
            if (r0 != r4) goto L68
            return r4
        L68:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
            r4 = r1
        L6d:
            h00 r7 = (defpackage.h00) r7
            if (r7 == 0) goto L78
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r2 = okhttp3.RequestBody.Companion.create$default(r5, r7, r2, r3, r2)
            goto L7e
        L78:
            r7 = r6
            r6 = r0
            goto L7c
        L7b:
            r4 = r1
        L7c:
            r0 = r6
            r6 = r7
        L7e:
            r1.method(r6, r2)
            coil3.network.NetworkHeaders r6 = r0.getHeaders()
            okhttp3.Headers r6 = toHeaders(r6)
            r4.headers(r6)
            okhttp3.Request r6 = r4.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClientKt.toRequest(coil3.network.NetworkRequest, fj0):java.lang.Object");
    }
}
