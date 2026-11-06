package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qj2 implements LineHeightSpan {
    public final float I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final float M;
    public final int N;
    public int O = Integer.MIN_VALUE;
    public int P = Integer.MIN_VALUE;
    public int Q = Integer.MIN_VALUE;
    public int R = Integer.MIN_VALUE;
    public int S;
    public int T;

    public qj2(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.I = f;
        this.J = i;
        this.K = z;
        this.L = z2;
        this.M = f2;
        this.N = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            r02.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.J;
        int i7 = this.N;
        boolean z3 = this.L;
        boolean z4 = this.K;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.O == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.I);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.M;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.Q = i11;
                int i12 = i11 - ceil;
                this.P = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.O = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.R = i11;
                    this.S = fontMetricsInt.ascent - i12;
                    this.T = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.O = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.Q;
                    this.R = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.S = 0;
                    this.T = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.P = i16;
                int i17 = fontMetricsInt.descent;
                this.Q = i17;
                this.O = i16;
                this.R = i17;
                this.S = 0;
                this.T = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.O : this.P;
        fontMetricsInt.descent = z2 ? this.R : this.Q;
    }
}
