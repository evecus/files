package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a41 extends CharacterStyle implements UpdateAppearance {
    public final z31 I;

    public a41(z31 z31Var) {
        this.I = z31Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            me1 me1Var = me1.a;
            z31 z31Var = this.I;
            if (j42.c(z31Var, me1Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(z31Var instanceof rx4)) {
                s83.v();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            rx4 rx4Var = (rx4) z31Var;
            textPaint.setStrokeWidth(rx4Var.a);
            textPaint.setStrokeMiter(rx4Var.b);
            int i = rx4Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = rx4Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
