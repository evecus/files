package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class of5 implements bn {
    public static final nf5 Companion = new nf5();
    public final String a;
    public final String b;
    public final String c;

    public of5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = "user_profile/" + Uri.encode(str) + "/" + Uri.encode(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of5)) {
            return false;
        }
        of5 of5Var = (of5) obj;
        return j42.c(this.a, of5Var.a) && j42.c(this.b, of5Var.b);
    }

    @Override // defpackage.bn
    public final String getRoute() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hf1.x("UserProfileDestination(uid=", this.a, ", secUid=", this.b, ")");
    }
}
