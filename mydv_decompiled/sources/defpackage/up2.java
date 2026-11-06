package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class up2 {
    public final ArrayList a;
    public final String b;
    public final boolean c;

    public up2(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up2)) {
            return false;
        }
        up2 up2Var = (up2) obj;
        return this.a.equals(up2Var.a) && this.b.equals(up2Var.b) && this.c == up2Var.c;
    }

    public final int hashCode() {
        return hf1.n(this.a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "Response(messages=" + this.a + ", internalExt=" + this.b + ", needAck=" + this.c + ")";
    }
}
