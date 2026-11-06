package coil3.network;

import defpackage.er0;
import defpackage.j42;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.sv2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NetworkHeaders {
    public static final Companion Companion = new Companion(null);
    public static final NetworkHeaders EMPTY = new Builder().build();
    private final Map<String, List<String>> data;

    /* JADX WARN: Multi-variable type inference failed */
    private NetworkHeaders(Map<String, ? extends List<String>> map) {
        this.data = map;
    }

    public final Map<String, List<String>> asMap() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkHeaders) && j42.c(this.data, ((NetworkHeaders) obj).data);
    }

    public final String get(String str) {
        Map<String, List<String>> map = this.data;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = map.get(lowerCase);
        if (list != null) {
            return (String) o70.b1(list);
        }
        return null;
    }

    public final List<String> getAll(String str) {
        Map<String, List<String>> map = this.data;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = map.get(lowerCase);
        return list == null ? o91.I : list;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.data + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ NetworkHeaders(Map map, er0 er0Var) {
        this(map);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Map<String, List<String>> data;

        public Builder(NetworkHeaders networkHeaders) {
            Map map = networkHeaders.data;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), o70.s1((Collection) entry.getValue()));
            }
            this.data = linkedHashMap;
        }

        public final Builder add(String str, String str2) {
            Map<String, List<String>> map = this.data;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            List<String> list = map.get(lowerCase);
            if (list == null) {
                list = new ArrayList<>();
                map.put(lowerCase, list);
            }
            list.add(str2);
            return this;
        }

        public final NetworkHeaders build() {
            return new NetworkHeaders(sv2.X(this.data), null);
        }

        public final Builder set(String str, String str2) {
            Map<String, List<String>> map = this.data;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, p70.n0(str2));
            return this;
        }

        public final Builder set(String str, List<String> list) {
            Map<String, List<String>> map = this.data;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, o70.s1(list));
            return this;
        }

        public Builder() {
            this.data = new LinkedHashMap();
        }
    }
}
