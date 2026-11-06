package defpackage;

import androidx.media3.datasource.cache.CacheWriter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rn5 {
    public final String a;
    public final CacheWriter b;

    public rn5(String str, CacheWriter cacheWriter) {
        str.getClass();
        this.a = str;
        this.b = cacheWriter;
    }

    public final String a() {
        return this.a;
    }

    public final CacheWriter b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rn5) {
            rn5 rn5Var = (rn5) obj;
            return j42.c(this.a, rn5Var.a) && this.b == rn5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchTask(url=" + this.a + ", writer=" + this.b + ")";
    }
}
