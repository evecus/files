package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o06 implements Serializable {
    public final int I;
    public final byte[] J;

    public o06(int i, byte[] bArr) {
        this.I = i;
        this.J = bArr;
    }

    public final o06 a() {
        return new o06(this.I + 1, this.J);
    }
}
