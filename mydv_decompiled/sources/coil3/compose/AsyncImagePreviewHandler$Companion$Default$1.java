package coil3.compose;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1 implements AsyncImagePreviewHandler {
    public static final AsyncImagePreviewHandler$Companion$Default$1 INSTANCE = new AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handle(coil3.ImageLoader r5, coil3.request.ImageRequest r6, defpackage.fj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = (coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = new coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.result
            int r7 = r0.label
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L35
            if (r7 != r1) goto L2f
            java.lang.Object r5 = r0.L$1
            r6 = r5
            coil3.request.ImageRequest r6 = (coil3.request.ImageRequest) r6
            java.lang.Object r5 = r0.L$0
            coil3.ImageLoader r5 = (coil3.ImageLoader) r5
            defpackage.mu0.V(r4)
            goto L47
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L35:
            defpackage.mu0.V(r4)
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r1
            java.lang.Object r4 = r5.execute(r6, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L47
            return r5
        L47:
            coil3.request.ImageResult r4 = (coil3.request.ImageResult) r4
            boolean r5 = r4 instanceof coil3.request.SuccessResult
            r7 = 2
            r0 = 0
            if (r5 == 0) goto L63
            coil3.compose.AsyncImagePainter$State$Success r5 = new coil3.compose.AsyncImagePainter$State$Success
            coil3.request.SuccessResult r4 = (coil3.request.SuccessResult) r4
            coil3.Image r1 = r4.getImage()
            android.content.Context r6 = r6.getContext()
            rj3 r6 = coil3.compose.ImagePainter_androidKt.m54asPainter55t9rM$default(r1, r6, r0, r7, r2)
            r5.<init>(r6, r4)
            return r5
        L63:
            boolean r5 = r4 instanceof coil3.request.ErrorResult
            if (r5 == 0) goto L7d
            coil3.compose.AsyncImagePainter$State$Error r5 = new coil3.compose.AsyncImagePainter$State$Error
            coil3.request.ErrorResult r4 = (coil3.request.ErrorResult) r4
            coil3.Image r1 = r4.getImage()
            if (r1 == 0) goto L79
            android.content.Context r6 = r6.getContext()
            rj3 r2 = coil3.compose.ImagePainter_androidKt.m54asPainter55t9rM$default(r1, r6, r0, r7, r2)
        L79:
            r5.<init>(r2, r4)
            return r5
        L7d:
            defpackage.s83.v()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePreviewHandler$Companion$Default$1.handle(coil3.ImageLoader, coil3.request.ImageRequest, fj0):java.lang.Object");
    }
}
