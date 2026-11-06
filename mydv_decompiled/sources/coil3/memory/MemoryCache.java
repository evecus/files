package coil3.memory;

import android.content.Context;
import coil3.Image;
import coil3.memory.MemoryCache;
import coil3.util.Collections_jvmCommonKt;
import coil3.util.ContextsKt;
import defpackage.er0;
import defpackage.j42;
import defpackage.p91;
import defpackage.rm1;
import defpackage.s83;
import defpackage.vm2;
import defpackage.zy;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface MemoryCache {
    void clear();

    Value get(Key key);

    long getInitialMaxSize();

    Set<Key> getKeys();

    long getMaxSize();

    long getSize();

    boolean remove(Key key);

    void set(Key key, Value value);

    void setMaxSize(long j);

    void trimToSize(long j);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private rm1 maxSizeBytesFactory;
        private boolean strongReferencesEnabled = true;
        private boolean weakReferencesEnabled = true;

        public static /* synthetic */ Builder maxSizePercent$default(Builder builder, Context context, double d, int i, Object obj) {
            if ((i & 2) != 0) {
                d = ContextsKt.defaultMemoryCacheSizePercent(context);
            }
            return builder.maxSizePercent(context, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long maxSizePercent$lambda$0$1(double d, Context context) {
            return (long) (d * ContextsKt.totalAvailableMemoryBytes(context));
        }

        public final MemoryCache build() {
            StrongMemoryCache emptyStrongMemoryCache;
            WeakMemoryCache realWeakMemoryCache = this.weakReferencesEnabled ? new RealWeakMemoryCache() : new EmptyWeakMemoryCache();
            if (this.strongReferencesEnabled) {
                rm1 rm1Var = this.maxSizeBytesFactory;
                if (rm1Var == null) {
                    zy.i("maxSizeBytesFactory == null");
                    return null;
                }
                emptyStrongMemoryCache = new RealStrongMemoryCache(((Number) rm1Var.invoke()).longValue(), realWeakMemoryCache);
            } else {
                emptyStrongMemoryCache = new EmptyStrongMemoryCache(realWeakMemoryCache);
            }
            return new RealMemoryCache(emptyStrongMemoryCache, realWeakMemoryCache);
        }

        public final Builder maxSizeBytes(long j) {
            this.maxSizeBytesFactory = new vm2(j, (byte) 1);
            return this;
        }

        public final Builder maxSizePercent(final Context context, final double d) {
            if (0.0d > d || d > 1.0d) {
                s83.t("percent must be in the range [0.0, 1.0].");
                return null;
            }
            this.maxSizeBytesFactory = new rm1() { // from class: ox2
                @Override // defpackage.rm1
                public final Object invoke() {
                    long maxSizePercent$lambda$0$1;
                    maxSizePercent$lambda$0$1 = MemoryCache.Builder.maxSizePercent$lambda$0$1(d, context);
                    return Long.valueOf(maxSizePercent$lambda$0$1);
                }
            };
            return this;
        }

        public final Builder strongReferencesEnabled(boolean z) {
            this.strongReferencesEnabled = z;
            return this;
        }

        public final Builder weakReferencesEnabled(boolean z) {
            this.weakReferencesEnabled = z;
            return this;
        }

        public final Builder maxSizeBytes(rm1 rm1Var) {
            this.maxSizeBytesFactory = rm1Var;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long maxSizeBytes$lambda$0$0(long j) {
            return j;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Key {
        private final Map<String, String> extras;
        private final String key;

        public Key(String str, Map<String, String> map) {
            this.key = str;
            this.extras = Collections_jvmCommonKt.toImmutableMap(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key copy$default(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.key;
            }
            if ((i & 2) != 0) {
                map = key.extras;
            }
            return key.copy(str, map);
        }

        public final Key copy(String str, Map<String, String> map) {
            return new Key(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return j42.c(this.key, key.key) && j42.c(this.extras, key.extras);
        }

        public final Map<String, String> getExtras() {
            return this.extras;
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.extras.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Key(String str, Map map, int i, er0 er0Var) {
            this(str, (i & 2) != 0 ? p91.I : map);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Value {
        private final Map<String, Object> extras;
        private final Image image;

        public Value(Image image, Map<String, ? extends Object> map) {
            this.image = image;
            this.extras = Collections_jvmCommonKt.toImmutableMap(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Value copy$default(Value value, Image image, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                image = value.image;
            }
            if ((i & 2) != 0) {
                map = value.extras;
            }
            return value.copy(image, map);
        }

        public final Value copy(Image image, Map<String, ? extends Object> map) {
            return new Value(image, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return j42.c(this.image, value.image) && j42.c(this.extras, value.extras);
        }

        public final Map<String, Object> getExtras() {
            return this.extras;
        }

        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.extras.hashCode() + (this.image.hashCode() * 31);
        }

        public String toString() {
            return "Value(image=" + this.image + ", extras=" + this.extras + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Value(Image image) {
            this(image, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Value(Image image, Map map, int i, er0 er0Var) {
            this(image, (i & 2) != 0 ? p91.I : map);
        }
    }
}
