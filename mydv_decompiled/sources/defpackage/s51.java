package defpackage;

/* loaded from: classes2.dex */
public final class s51 extends j16 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ long[] B0;
    public final /* synthetic */ int[] C0;
    public final /* synthetic */ t51 D0;
    public final /* synthetic */ int z0;

    public s51(t51 t51Var, int i, int i2, long[] jArr, int[] iArr) {
        this.z0 = i;
        this.A0 = i2;
        this.B0 = jArr;
        this.C0 = iArr;
        this.D0 = t51Var;
    }

    @Override // defpackage.j16
    public final int A() {
        return this.z0;
    }

    @Override // defpackage.j16
    public final g61 K(int i) {
        int i2 = this.A0;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        byte b = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.z0; i4++) {
            long j = ((i4 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < i2; i5++) {
                long j2 = jArr[i5];
                long[] jArr3 = this.B0;
                jArr[i5] = j2 ^ (jArr3[i3 + i5] & j);
                jArr2[i5] = jArr2[i5] ^ (jArr3[(i3 + i2) + i5] & j);
            }
            i3 += i2 * 2;
        }
        t51 t51Var = this.D0;
        int i6 = t51Var.h;
        jr2 jr2Var = new jr2(jArr);
        int[] iArr = this.C0;
        return new h61(t51Var, new z51(i6, iArr, jr2Var), new z51(i6, iArr, new jr2(jArr2)), b);
    }
}
