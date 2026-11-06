package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x03 {
    public final Aweme a;
    public final int b;

    public x03(Aweme aweme, int i) {
        this.a = aweme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03)) {
            return false;
        }
        x03 x03Var = (x03) obj;
        return this.a.equals(x03Var.a) && this.b == x03Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "MixEpisode(aweme=" + this.a + ", number=" + this.b + ")";
    }
}
