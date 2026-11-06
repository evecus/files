package coil3.compose;

import coil3.Image;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import defpackage.fj0;
import defpackage.hn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 implements AsyncImagePreviewHandler {
    final /* synthetic */ hn1 $image;

    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1(hn1 hn1Var) {
        this.$image = hn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handle(coil3.ImageLoader r13, coil3.request.ImageRequest r14, defpackage.fj0 r15) {
        /*
            r12 = this;
            boolean r13 = r15 instanceof coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1
            if (r13 == 0) goto L13
            r13 = r15
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 r13 = (coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1) r13
            int r0 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r13.label = r0
            goto L18
        L13:
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 r13 = new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1
            r13.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r13.result
            int r0 = r13.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            java.lang.Object r12 = r13.L$0
            r14 = r12
            coil3.request.ImageRequest r14 = (coil3.request.ImageRequest) r14
            defpackage.mu0.V(r15)
        L2a:
            r4 = r14
            goto L44
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r1
        L32:
            defpackage.mu0.V(r15)
            hn1 r12 = r12.$image
            r13.L$0 = r14
            r13.label = r2
            java.lang.Object r15 = r12.invoke(r14, r13)
            el0 r12 = defpackage.el0.I
            if (r15 != r12) goto L2a
            return r12
        L44:
            r3 = r15
            coil3.Image r3 = (coil3.Image) r3
            coil3.compose.AsyncImagePainter$State$Success r12 = new coil3.compose.AsyncImagePainter$State$Success
            android.content.Context r13 = r4.getContext()
            r14 = 0
            r15 = 2
            rj3 r13 = coil3.compose.ImagePainter_androidKt.m54asPainter55t9rM$default(r3, r13, r14, r15, r1)
            coil3.request.SuccessResult r2 = new coil3.request.SuccessResult
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.<init>(r13, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1.handle(coil3.ImageLoader, coil3.request.ImageRequest, fj0):java.lang.Object");
    }

    public final Object handle$$forInline(ImageLoader imageLoader, ImageRequest imageRequest, fj0 fj0Var) {
        new LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1(this, fj0Var);
        Image image = (Image) this.$image.invoke(imageRequest, fj0Var);
        return new AsyncImagePainter.State.Success(ImagePainter_androidKt.m54asPainter55t9rM$default(image, imageRequest.getContext(), 0, 2, null), new SuccessResult(image, imageRequest, null, null, null, false, false, 124, null));
    }
}
