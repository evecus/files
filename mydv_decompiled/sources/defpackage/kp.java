package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kp implements ip, mp {
    public final float I;
    public final boolean J;
    public final lp K;
    public final float L;

    public kp(float f, boolean z, lp lpVar) {
        this.I = f;
        this.J = z;
        this.K = lpVar;
        this.L = f;
    }

    @Override // defpackage.ip, defpackage.mp
    public final float b() {
        return this.L;
    }

    @Override // defpackage.ip
    public final void d(iu0 iu0Var, int i, int[] iArr, da2 da2Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int X = iu0Var.X(this.I);
        boolean z = this.J && da2Var == da2.J;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(X, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(X, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        lp lpVar = this.K;
        if (lpVar == null || i2 <= 0) {
            return;
        }
        int b = lpVar.b(i2, da2Var);
        if (z) {
            b -= i2;
        }
        if (b != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + b;
            }
        }
    }

    @Override // defpackage.mp
    public final void e(iu0 iu0Var, int i, int[] iArr, int[] iArr2) {
        d(iu0Var, i, iArr, da2.I, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return r11.c(this.I, kpVar.I) && this.J == kpVar.J && j42.c(this.K, kpVar.K);
    }

    public final int hashCode() {
        int o = (pt1.o(this.J) + (Float.floatToIntBits(this.I) * 31)) * 31;
        lp lpVar = this.K;
        return o + (lpVar == null ? 0 : lpVar.hashCode());
    }

    public final String toString() {
        return (this.J ? "" : "Absolute") + "Arrangement#spacedAligned(" + r11.d(this.I) + ", " + this.K + ")";
    }
}
