package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cd4 {
    public final String a;
    public final Aweme b;

    static {
        Aweme.Companion companion = Aweme.Companion;
    }

    public cd4(String str, Aweme aweme) {
        this.a = str;
        this.b = aweme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd4)) {
            return false;
        }
        cd4 cd4Var = (cd4) obj;
        return this.a.equals(cd4Var.a) && this.b.equals(cd4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchResultEntry(key=" + this.a + ", aweme=" + this.b + ")";
    }
}
