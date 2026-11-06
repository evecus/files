package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class px5 implements qx5 {
    public final Aweme a;

    static {
        Aweme.Companion companion = Aweme.Companion;
    }

    public px5(Aweme aweme) {
        aweme.getClass();
        this.a = aweme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof px5) && j42.c(this.a, ((px5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Video(aweme=" + this.a + ")";
    }
}
