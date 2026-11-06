package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ho0 {
    public final byte[] a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public ho0(byte[] bArr, int i) {
        this.a = g4.s(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        if (ho0Var.b != this.b) {
            return false;
        }
        return Arrays.equals(this.a, ho0Var.a);
    }

    public final int hashCode() {
        return this.b ^ g4.N(this.a);
    }
}
