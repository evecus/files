package coil3.compose;

import coil3.Image;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import defpackage.fj0;
import defpackage.hn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2 implements AsyncImagePreviewHandler {
    final /* synthetic */ hn1 $image;

    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2(hn1 hn1Var) {
        this.$image = hn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handle(coil3.ImageLoader r4, coil3.request.ImageRequest r5, defpackage.fj0 r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1
            if (r4 == 0) goto L13
            r4 = r6
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1 r4 = (coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1 r4 = new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.result
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L2b
            java.lang.Object r3 = r4.L$0
            r5 = r3
            coil3.request.ImageRequest r5 = (coil3.request.ImageRequest) r5
            defpackage.mu0.V(r6)
            goto L43
        L2b:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r3)
            return r1
        L31:
            defpackage.mu0.V(r6)
            hn1 r3 = r3.$image
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r6 = r3.invoke(r5, r4)
            el0 r3 = defpackage.el0.I
            if (r6 != r3) goto L43
            return r3
        L43:
            coil3.Image r6 = (coil3.Image) r6
            if (r6 == 0) goto L51
            android.content.Context r3 = r5.getContext()
            r4 = 0
            r5 = 2
            rj3 r1 = coil3.compose.ImagePainter_androidKt.m54asPainter55t9rM$default(r6, r3, r4, r5, r1)
        L51:
            coil3.compose.AsyncImagePainter$State$Loading r3 = new coil3.compose.AsyncImagePainter$State$Loading
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2.handle(coil3.ImageLoader, coil3.request.ImageRequest, fj0):java.lang.Object");
    }

    public final Object handle$$forInline(ImageLoader imageLoader, ImageRequest imageRequest, fj0 fj0Var) {
        new LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1(this, fj0Var);
        Image image = (Image) this.$image.invoke(imageRequest, fj0Var);
        return new AsyncImagePainter.State.Loading(image != null ? ImagePainter_androidKt.m54asPainter55t9rM$default(image, imageRequest.getContext(), 0, 2, null) : null);
    }
}
