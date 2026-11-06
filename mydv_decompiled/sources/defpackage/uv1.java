package defpackage;

import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uv1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Lockable K;

    public /* synthetic */ uv1(Lockable lockable, long j, byte b) {
        this.I = b;
        this.K = lockable;
        this.J = j;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        long _init_$lambda$0;
        byte b = this.I;
        long j = this.J;
        Lockable lockable = this.K;
        switch (b) {
            case 0:
                _init_$lambda$0 = Http2Connection._init_$lambda$0((Http2Connection) lockable, j);
                break;
            default:
                _init_$lambda$0 = RealWebSocket.initReaderAndWriter$lambda$0$0((RealWebSocket) lockable, j);
                break;
        }
        return Long.valueOf(_init_$lambda$0);
    }
}
