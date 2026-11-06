package coil3.compose;

import coil3.compose.AsyncImagePainter;
import defpackage.dl0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.rp0;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {233, 237}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AsyncImagePainter$launchJob$1 extends k05 implements hn1 {
    final /* synthetic */ AsyncImagePainter.Input $input;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$launchJob$1(AsyncImagePainter asyncImagePainter, AsyncImagePainter.Input input, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = asyncImagePainter;
        this.$input = input;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new AsyncImagePainter$launchJob$1(this.this$0, this.$input, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((AsyncImagePainter$launchJob$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r6 == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r6 == r4) goto L18;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r5.L$2
            coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
            java.lang.Object r1 = r5.L$1
            coil3.request.ImageRequest r1 = (coil3.request.ImageRequest) r1
            java.lang.Object r1 = r5.L$0
            coil3.compose.AsyncImagePreviewHandler r1 = (coil3.compose.AsyncImagePreviewHandler) r1
            defpackage.mu0.V(r6)
            goto L7e
        L1b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L21:
            java.lang.Object r0 = r5.L$1
            coil3.request.ImageRequest r0 = (coil3.request.ImageRequest) r0
            java.lang.Object r0 = r5.L$0
            coil3.compose.AsyncImagePreviewHandler r0 = (coil3.compose.AsyncImagePreviewHandler) r0
            defpackage.mu0.V(r6)
            goto L59
        L2d:
            defpackage.mu0.V(r6)
            coil3.compose.AsyncImagePainter r6 = r5.this$0
            coil3.compose.AsyncImagePreviewHandler r6 = r6.getPreviewHandler$io_coil_kt_coil3_coil_compose_core()
            coil3.compose.AsyncImagePainter r0 = r5.this$0
            el0 r4 = defpackage.el0.I
            if (r6 == 0) goto L5c
            coil3.compose.AsyncImagePainter$Input r1 = r5.$input
            coil3.request.ImageRequest r1 = r1.getRequest()
            coil3.request.ImageRequest r0 = coil3.compose.AsyncImagePainter.access$updateRequest(r0, r1, r2)
            coil3.compose.AsyncImagePainter$Input r1 = r5.$input
            coil3.ImageLoader r1 = r1.getImageLoader()
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r2
            java.lang.Object r6 = r6.handle(r1, r0, r5)
            if (r6 != r4) goto L59
            goto L7d
        L59:
            coil3.compose.AsyncImagePainter$State r6 = (coil3.compose.AsyncImagePainter.State) r6
            goto L84
        L5c:
            coil3.compose.AsyncImagePainter$Input r6 = r5.$input
            coil3.request.ImageRequest r6 = r6.getRequest()
            r2 = 0
            coil3.request.ImageRequest r6 = coil3.compose.AsyncImagePainter.access$updateRequest(r0, r6, r2)
            coil3.compose.AsyncImagePainter r0 = r5.this$0
            coil3.compose.AsyncImagePainter$Input r2 = r5.$input
            coil3.ImageLoader r2 = r2.getImageLoader()
            r5.L$0 = r3
            r5.L$1 = r3
            r5.L$2 = r0
            r5.label = r1
            java.lang.Object r6 = r2.execute(r6, r5)
            if (r6 != r4) goto L7e
        L7d:
            return r4
        L7e:
            coil3.request.ImageResult r6 = (coil3.request.ImageResult) r6
            coil3.compose.AsyncImagePainter$State r6 = coil3.compose.AsyncImagePainter.access$toState(r0, r6)
        L84:
            coil3.compose.AsyncImagePainter r5 = r5.this$0
            coil3.compose.AsyncImagePainter.access$updateState(r5, r6)
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
