package coil3;

import coil3.Extras;
import coil3.request.ImageRequest;
import coil3.request.Options;
import defpackage.sv2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ExtrasKt {
    public static final <T> T getExtra(ImageRequest imageRequest, Extras.Key<T> key) {
        T t = (T) imageRequest.getExtras().get(key);
        if (t != null) {
            return t;
        }
        T t2 = (T) imageRequest.getDefaults().getExtras().get(key);
        return t2 == null ? key.getDefault() : t2;
    }

    public static final <T> T getOrDefault(Extras extras, Extras.Key<T> key) {
        T t = (T) extras.get(key);
        return t == null ? key.getDefault() : t;
    }

    public static final Extras orEmpty(Extras extras) {
        return extras == null ? Extras.EMPTY : extras;
    }

    public static final Extras plus(Extras extras, Extras extras2) {
        return new Extras.Builder(sv2.P(extras.asMap(), extras2.asMap())).build();
    }

    public static final <T> T getExtra(Options options, Extras.Key<T> key) {
        T t = (T) options.getExtras().get(key);
        return t == null ? key.getDefault() : t;
    }
}
