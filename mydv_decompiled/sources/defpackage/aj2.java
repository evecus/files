package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aj2 extends qr5 {
    public final q33 b;

    public aj2() {
        q33 q33Var = q22.a;
        this.b = new q33();
    }

    @Override // defpackage.qr5
    public final void o() {
        q33 q33Var = this.b;
        int[] iArr = q33Var.b;
        Object[] objArr = q33Var.c;
        long[] jArr = q33Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        e43 e43Var = (e43) objArr[i4];
                        Object[] objArr2 = e43Var.a;
                        int i6 = e43Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            zi2 zi2Var = (zi2) objArr2[i7];
                            l10 l10Var = zi2Var.d;
                            if (l10Var != null) {
                                l10Var.cancel();
                            }
                            zi2Var.d = null;
                            ru2 ru2Var = (ru2) zi2Var.a.J;
                            ru2Var.J = true;
                            ru2Var.I = false;
                            ru2Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
