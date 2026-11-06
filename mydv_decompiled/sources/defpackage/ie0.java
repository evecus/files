package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ie0 extends ee0 {
    public final boolean c;

    public ie0(yw0 yw0Var, boolean z) {
        super(yw0Var);
        this.c = z;
    }

    @Override // defpackage.ee0
    public final void d(byte b) {
        if (this.c) {
            j(String.valueOf(b & 255));
        } else {
            h(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.ee0
    public final void f(int i) {
        if (this.c) {
            j(Long.toString(4294967295L & i, 10));
        } else {
            h(Long.toString(4294967295L & i, 10));
        }
    }

    @Override // defpackage.ee0
    public final void g(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            j(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        h(str);
    }

    @Override // defpackage.ee0
    public final void i(short s) {
        if (this.c) {
            j(String.valueOf(s & 65535));
        } else {
            h(String.valueOf(s & 65535));
        }
    }
}
