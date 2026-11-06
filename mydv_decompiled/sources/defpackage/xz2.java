package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xz2 implements bn {
    public static final wz2 Companion = new wz2();
    public final String a;
    public final String b;

    public xz2(String str) {
        str.getClass();
        this.a = str;
        this.b = hf1.w("mix_detail/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz2) && j42.c(this.a, ((xz2) obj).a);
    }

    @Override // defpackage.bn
    public final String getRoute() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return r7.C("MixDetailDestination(mixId=", this.a, ")");
    }
}
