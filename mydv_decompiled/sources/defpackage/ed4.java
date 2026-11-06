package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ed4 implements bn {
    public static final dd4 Companion = new dd4();
    public final String a;
    public final String b;

    public ed4(String str) {
        str.getClass();
        this.a = str;
        this.b = hf1.w("search_results/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed4) && j42.c(this.a, ((ed4) obj).a);
    }

    @Override // defpackage.bn
    public final String getRoute() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return r7.C("SearchResultsDestination(query=", this.a, ")");
    }
}
