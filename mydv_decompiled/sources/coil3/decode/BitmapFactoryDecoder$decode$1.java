package coil3.decode;

import androidx.media3.container.NalUnitUtil;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {213, NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI}, m = "decode", v = 1)
/* loaded from: classes.dex */
public final class BitmapFactoryDecoder$decode$1 extends gj0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BitmapFactoryDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = bitmapFactoryDecoder;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decode(this);
    }
}
