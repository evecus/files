package coil3.util;

import androidx.media3.extractor.AacUtil;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE}, m = "awaitStarted", v = 1)
/* loaded from: classes2.dex */
public final class LifecyclesKt$awaitStarted$1 extends gj0 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public LifecyclesKt$awaitStarted$1(fj0 fj0Var) {
        super(fj0Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LifecyclesKt.awaitStarted(null, this);
    }
}
