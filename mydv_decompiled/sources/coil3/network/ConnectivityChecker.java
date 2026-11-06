package coil3.network;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ConnectivityChecker {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ConnectivityChecker ONLINE = new ConnectivityChecker() { // from class: fg0
        @Override // coil3.network.ConnectivityChecker
        public final boolean isOnline() {
            int i = gg0.a;
            return true;
        }
    };

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    boolean isOnline();
}
