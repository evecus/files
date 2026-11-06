package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gn3 extends ReplacementSpan {
    public final float I;
    public final int J;
    public final float K;
    public final int L;
    public final float M;
    public final float N;
    public final int O;
    public Paint.FontMetricsInt P;
    public int Q;
    public int R;
    public boolean S;

    public gn3(float f, int i, float f2, int i2, iu0 iu0Var, int i3) {
        float f0 = i == 0 ? iu0Var.f0(oh4.p(4294967296L, f)) : 0.0f;
        float f02 = i2 == 0 ? iu0Var.f0(oh4.p(4294967296L, f2)) : 0.0f;
        this.I = f;
        this.J = i;
        this.K = f2;
        this.L = i2;
        this.M = f0;
        this.N = f02;
        this.O = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.P;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        j42.g0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.S) {
            r02.c("PlaceholderSpan is not laid out yet.");
        }
        return this.R;
    }

    public final int c() {
        if (!this.S) {
            r02.c("PlaceholderSpan is not laid out yet.");
        }
        return this.Q;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.S = true;
        float textSize = paint.getTextSize();
        this.P = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            r02.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.J;
        if (i3 == 0) {
            f = this.M;
        } else {
            if (i3 != 1) {
                r02.b("Unsupported unit.");
                zy.n();
                return 0;
            }
            f = this.I * textSize;
        }
        this.Q = jl2.m(f);
        int i4 = this.L;
        if (i4 == 0) {
            f2 = this.N;
        } else {
            if (i4 != 1) {
                r02.b("Unsupported unit.");
                zy.n();
                return 0;
            }
            f2 = this.K * textSize;
        }
        this.R = jl2.m(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.O) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b;
                        fontMetricsInt.descent = b() + b;
                        break;
                    }
                    break;
                default:
                    r02.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
