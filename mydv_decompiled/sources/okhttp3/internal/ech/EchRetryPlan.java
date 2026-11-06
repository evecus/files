package okhttp3.internal.ech;

import defpackage.er0;
import defpackage.h00;
import defpackage.v24;
import okhttp3.internal._HostnamesCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EchRetryPlan {
    public static final Companion Companion = new Companion(null);
    private static final v24 INVALID_PUBLIC_NAME = new v24("(\\..*)|(.*\\.)|((.*\\.)?[0-9]+)|((.*\\.)?0[xX][0-9a-fA-F]*)");
    private final h00 configList;
    private final String publicName;

    private EchRetryPlan(String str, h00 h00Var) {
        this.publicName = str;
        this.configList = h00Var;
    }

    public final h00 getConfigList() {
        return this.configList;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final EchRetryPlan getOrNull(String str, h00 h00Var) {
            str.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            er0 er0Var = null;
            if (canonicalHost == null || _HostnamesCommonKt.canParseAsIpAddress(canonicalHost) || EchRetryPlan.INVALID_PUBLIC_NAME.e(canonicalHost)) {
                return null;
            }
            return new EchRetryPlan(str, h00Var, er0Var);
        }

        private Companion() {
        }
    }

    public /* synthetic */ EchRetryPlan(String str, h00 h00Var, er0 er0Var) {
        this(str, h00Var);
    }
}
