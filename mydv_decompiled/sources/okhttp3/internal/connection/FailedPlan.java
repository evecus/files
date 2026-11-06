package okhttp3.internal.connection;

import okhttp3.internal.connection.RoutePlanner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FailedPlan implements RoutePlanner.Plan {
    private final boolean isReady;
    private final RoutePlanner.ConnectResult result;

    public FailedPlan(Throwable th) {
        th.getClass();
        this.result = new RoutePlanner.ConnectResult(this, null, th, 2, null);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo352cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp */
    public RoutePlanner.ConnectResult mo356connectTcp() {
        return this.result;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    public RoutePlanner.ConnectResult mo357connectTlsEtc() {
        return this.result;
    }

    public final RoutePlanner.ConnectResult getResult() {
        return this.result;
    }

    public Void handleSuccess() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
        return this.isReady;
    }

    public Void retry() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RealConnection mo353handleSuccess() {
        return (RealConnection) handleSuccess();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.Plan mo354retry() {
        return (RoutePlanner.Plan) retry();
    }
}
