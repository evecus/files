package okhttp3.internal.connection;

import defpackage.o70;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RouteDatabase {
    private final Set<Route> _failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        route.getClass();
        this._failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        route.getClass();
        this._failedRoutes.add(route);
    }

    public final synchronized Set<Route> getFailedRoutes() {
        return o70.u1(this._failedRoutes);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        route.getClass();
        return this._failedRoutes.contains(route);
    }
}
