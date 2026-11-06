package coil3.compose;

import defpackage.d52;
import defpackage.hn1;
import defpackage.i51;
import defpackage.su0;
import defpackage.xx3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LocalAsyncImagePreviewHandlerKt {
    private static final xx3 LocalAsyncImagePreviewHandler = new i51(new d52((byte) 19), (byte) 1);

    @su0
    public static final AsyncImagePreviewHandler AsyncImagePreviewHandler(hn1 hn1Var) {
        return new LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2(hn1Var);
    }

    public static final AsyncImagePreviewHandler AsyncImagePreviewHandlerNotNull(hn1 hn1Var) {
        return new LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1(hn1Var);
    }

    public static final xx3 getLocalAsyncImagePreviewHandler() {
        return LocalAsyncImagePreviewHandler;
    }

    public static /* synthetic */ void getLocalAsyncImagePreviewHandler$annotations() {
    }
}
