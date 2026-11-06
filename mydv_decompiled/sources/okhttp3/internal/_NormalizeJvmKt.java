package okhttp3.internal;

import java.text.Normalizer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(String str) {
        str.getClass();
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        normalize.getClass();
        return normalize;
    }
}
