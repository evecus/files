package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sp2 {
    public final String a;
    public final byte[] b;

    public sp2(String str, byte[] bArr) {
        bArr.getClass();
        this.a = str;
        this.b = bArr;
    }

    public final String a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp2)) {
            return false;
        }
        sp2 sp2Var = (sp2) obj;
        return this.a.equals(sp2Var.a) && j42.c(this.b, sp2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hf1.x("Message(method=", this.a, ", payload=", Arrays.toString(this.b), ")");
    }
}
