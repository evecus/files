package okhttp3.internal.ech;

import defpackage.h00;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class EchRejectedException extends SSLException {
    private final h00 nextEchConfigList;
    private final String publicName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EchRejectedException(String str, h00 h00Var) {
        super("Encrypted Client Hello (ECH) rejected");
        str.getClass();
        this.publicName = str;
        this.nextEchConfigList = h00Var;
    }

    public final h00 getNextEchConfigList() {
        return this.nextEchConfigList;
    }

    public final String getPublicName() {
        return this.publicName;
    }
}
