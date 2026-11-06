package coil3.compose;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2", f = "LocalAsyncImagePreviewHandler.kt", l = {TsExtractor.TS_SYNC_BYTE}, m = "handle", v = 1)
/* loaded from: classes2.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1 extends gj0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2$handle$1(LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2 localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handle(null, null, this);
    }
}
