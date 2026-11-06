package coil3;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "execute", v = 1)
/* loaded from: classes.dex */
public final class RealImageLoader$execute$3 extends gj0 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = realImageLoader;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object execute;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        execute = this.this$0.execute(null, 0, this);
        return execute;
    }
}
