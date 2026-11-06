package coil3.network;

import defpackage.fj0;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ConcurrentRequestStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ConcurrentRequestStrategy UNCOORDINATED = new UncoordinatedConcurrentRequestStrategy();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Object apply(String str, tm1 tm1Var, fj0 fj0Var);
}
