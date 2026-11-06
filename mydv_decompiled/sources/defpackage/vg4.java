package defpackage;

/* loaded from: classes2.dex */
public final class vg4 extends j16 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ long[] B0;
    public final /* synthetic */ p51 C0;
    public final /* synthetic */ byte z0;

    public /* synthetic */ vg4(p51 p51Var, int i, long[] jArr, byte b) {
        this.z0 = b;
        this.A0 = i;
        this.B0 = jArr;
        this.C0 = p51Var;
    }

    @Override // defpackage.j16
    public final int A() {
        switch (this.z0) {
        }
        return this.A0;
    }

    @Override // defpackage.j16
    public final g61 K(int i) {
        byte b = this.z0;
        p51 p51Var = this.C0;
        long[] jArr = this.B0;
        int i2 = this.A0;
        switch (b) {
            case 0:
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    long j = ((i4 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 9; i5++) {
                        jArr2[i5] = jArr2[i5] ^ (jArr[i3 + i5] & j);
                        jArr3[i5] = jArr3[i5] ^ (jArr[(i3 + 9) + i5] & j);
                    }
                    i3 += 18;
                }
                return new h61((wg4) p51Var, new ug4(jArr2), new ug4(jArr3), wg4.i, (byte) 17);
            default:
                long[] jArr4 = new long[9];
                long[] jArr5 = new long[9];
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    long j2 = ((i7 ^ i) - 1) >> 31;
                    for (int i8 = 0; i8 < 9; i8++) {
                        jArr4[i8] = jArr4[i8] ^ (jArr[i6 + i8] & j2);
                        jArr5[i8] = jArr5[i8] ^ (jArr[(i6 + 9) + i8] & j2);
                    }
                    i6 += 18;
                }
                return new h61((xg4) p51Var, new ug4(jArr4), new ug4(jArr5), xg4.i, (byte) 18);
        }
    }
}
