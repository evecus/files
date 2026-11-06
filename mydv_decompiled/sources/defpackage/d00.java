package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d00 extends e00 {
    public final int M;
    public final int N;

    public d00(byte[] bArr, int i, int i2) {
        super(bArr);
        g00.d(i, i + i2, bArr.length);
        this.M = i;
        this.N = i2;
    }

    @Override // defpackage.e00, defpackage.g00
    public final byte c(int i) {
        int i2 = this.N;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.L[this.M + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hf1.u(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(r7.x(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.e00, defpackage.g00
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.L, this.M, bArr, 0, i);
    }

    @Override // defpackage.e00
    public final int h() {
        return this.M;
    }

    @Override // defpackage.e00
    public final byte j(int i) {
        return this.L[this.M + i];
    }

    @Override // defpackage.e00, defpackage.g00
    public final int size() {
        return this.N;
    }
}
