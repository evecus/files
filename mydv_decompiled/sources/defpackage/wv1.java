package defpackage;

import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wv1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Http2Connection J;
    public final /* synthetic */ int K;
    public final /* synthetic */ ErrorCode L;

    public /* synthetic */ wv1(Http2Connection http2Connection, int i, ErrorCode errorCode, byte b) {
        this.I = b;
        this.J = http2Connection;
        this.K = i;
        this.L = errorCode;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 writeSynResetLater$lambda$0;
        wd5 pushResetLater$lambda$0;
        byte b = this.I;
        ErrorCode errorCode = this.L;
        int i = this.K;
        Http2Connection http2Connection = this.J;
        switch (b) {
            case 0:
                writeSynResetLater$lambda$0 = Http2Connection.writeSynResetLater$lambda$0(http2Connection, i, errorCode);
                return writeSynResetLater$lambda$0;
            default:
                pushResetLater$lambda$0 = Http2Connection.pushResetLater$lambda$0(http2Connection, i, errorCode);
                return pushResetLater$lambda$0;
        }
    }
}
