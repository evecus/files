package coil3.util;

import defpackage.kt0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CoroutinesKt {
    public static final <T> T getCompletedOrNull(kt0 kt0Var) {
        try {
            return (T) kt0Var.g();
        } catch (Throwable unused) {
            return null;
        }
    }
}
