package okhttp3.internal.connection;

import defpackage.sv2;
import defpackage.zl1;
import java.io.IOException;
import okhttp3.internal.connection.RoutePlanner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {
    private final RoutePlanner routePlanner;

    public SequentialExchangeFinder(RoutePlanner routePlanner) {
        routePlanner.getClass();
        this.routePlanner = routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RealConnection find() {
        RoutePlanner.Plan plan;
        IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                plan = getRoutePlanner().plan();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    sv2.i(iOException, e);
                }
                if (!RetryTlsHandshakeKt.attemptAnotherConnection(e)) {
                    throw iOException;
                }
                if (!getRoutePlanner().hasNext(null)) {
                    throw iOException;
                }
            }
            if (!plan.isReady()) {
                RoutePlanner.ConnectResult mo356connectTcp = plan.mo356connectTcp();
                if (mo356connectTcp.isSuccess()) {
                    mo356connectTcp = plan.mo357connectTlsEtc();
                }
                RoutePlanner.Plan component2 = mo356connectTcp.component2();
                Throwable component3 = mo356connectTcp.component3();
                if (component3 != null) {
                    throw component3;
                }
                if (component2 != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(component2);
                }
            }
            return plan.mo353handleSuccess();
        }
        zl1.g("Canceled");
        return null;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}
