package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class o51 extends j16 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ byte[] B0;
    public final /* synthetic */ v51 C0;
    public final /* synthetic */ int z0;

    public o51(v51 v51Var, int i, int i2, byte[] bArr) {
        this.z0 = i;
        this.A0 = i2;
        this.B0 = bArr;
        this.C0 = v51Var;
    }

    @Override // defpackage.j16
    public final int A() {
        return this.z0;
    }

    @Override // defpackage.j16
    public final g61 K(int i) {
        int i2 = this.A0;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.z0; i4++) {
            int i5 = ((i4 ^ i) - 1) >> 31;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b = bArr[i6];
                byte[] bArr3 = this.B0;
                bArr[i6] = (byte) (b ^ (bArr3[i3 + i6] & i5));
                bArr2[i6] = (byte) (bArr2[i6] ^ (bArr3[(i3 + i2) + i6] & i5));
            }
            i3 += i2 * 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        v51 v51Var = this.C0;
        return v51Var.d(v51Var.h(bigInteger), v51Var.h(new BigInteger(1, bArr2)));
    }
}
