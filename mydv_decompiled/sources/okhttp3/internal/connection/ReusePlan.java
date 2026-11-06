package okhttp3.internal.connection;

import okhttp3.internal.connection.RoutePlanner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ReusePlan implements RoutePlanner.Plan {
    private final RealConnection connection;
    private final boolean isReady;

    public ReusePlan(RealConnection realConnection) {
        realConnection.getClass();
        this.connection = realConnection;
        this.isReady = true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo352cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public Void connectTcp() {
        throw new IllegalStateException("already connected");
    }

    public Void connectTlsEtc() {
        throw new IllegalStateException("already connected");
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public RealConnection mo353handleSuccess() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
        return this.isReady;
    }

    public Void retry() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo356connectTcp() {
        return (RoutePlanner.ConnectResult) connectTcp();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo357connectTlsEtc() {
        return (RoutePlanner.ConnectResult) connectTlsEtc();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public /* bridge */ /* synthetic */ RoutePlanner.Plan mo354retry() {
        return (RoutePlanner.Plan) retry();
    }
}
