package defpackage;

import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class k16 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? jx4.D(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
