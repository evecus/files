package coil3.util;

import defpackage.o70;
import defpackage.o91;
import defpackage.p91;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Collections_jvmCommonKt {
    public static final <K, V> Map<K, V> LruMutableMap(int i, float f) {
        return new LinkedHashMap(i, f, true);
    }

    public static /* synthetic */ Map LruMutableMap$default(int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.75f;
        }
        return LruMutableMap(i, f);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(o70.T0(list)) : o91.I;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return p91.I;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) o70.S0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
