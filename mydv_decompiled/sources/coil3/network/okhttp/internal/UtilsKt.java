package coil3.network.okhttp.internal;

import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final void closeQuietly(AutoCloseable autoCloseable) {
        try {
            hf1.E(autoCloseable);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
