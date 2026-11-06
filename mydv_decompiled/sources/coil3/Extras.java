package coil3;

import coil3.util.Collections_jvmCommonKt;
import defpackage.er0;
import defpackage.j42;
import defpackage.sv2;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Extras {
    public static final Companion Companion = new Companion(null);
    public static final Extras EMPTY = new Builder().build();
    private final Map<Key<?>, Object> data;

    private Extras(Map<Key<?>, ? extends Object> map) {
        this.data = map;
    }

    public final Map<Key<?>, Object> asMap() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Extras) && j42.c(this.data, ((Extras) obj).data);
    }

    public final <T> T get(Key<T> key) {
        return (T) this.data.get(key);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Extras(data=" + this.data + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Key<T> {
        public static final Companion Companion = new Companion(null);

        /* renamed from: default, reason: not valid java name */
        private final T f0default;

        public Key(T t) {
            this.f0default = t;
        }

        public final T getDefault() {
            return this.f0default;
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Extras(Map map, er0 er0Var) {
        this(map);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Map<Key<?>, Object> data;

        public Builder(Extras extras) {
            this.data = sv2.Y(extras.data);
        }

        public final Extras build() {
            return new Extras(Collections_jvmCommonKt.toImmutableMap(this.data), null);
        }

        public final <T> Builder set(Key<T> key, T t) {
            Map<Key<?>, Object> map = this.data;
            if (t != null) {
                map.put(key, t);
                return this;
            }
            map.remove(key);
            return this;
        }

        public final Builder setAll(Extras extras) {
            for (Map.Entry entry : extras.data.entrySet()) {
                Key key = (Key) entry.getKey();
                Object value = entry.getValue();
                key.getClass();
                set(key, value);
            }
            return this;
        }

        public Builder(Map<Key<?>, ? extends Object> map) {
            this.data = sv2.Y(map);
        }

        public Builder() {
            this.data = new LinkedHashMap();
        }
    }
}
