package coil3.intercept;

import androidx.media3.extractor.ts.TsExtractor;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 148}, m = "execute", v = 1)
/* loaded from: classes.dex */
public final class EngineInterceptor$execute$1 extends gj0 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = engineInterceptor;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object execute;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        execute = this.this$0.execute(null, null, null, null, this);
        return execute;
    }
}
