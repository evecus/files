package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ym4 extends CharacterStyle implements UpdateAppearance {
    public final xm4 I;
    public final float J;
    public final jk3 K = ad4.w(new fq4(9205357640488583168L));
    public final wu0 L = dt4.b(new iy3(this, 7));

    public ym4(xm4 xm4Var, float f) {
        this.I = xm4Var;
        this.J = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a5.U(textPaint, this.J);
        textPaint.setShader((Shader) this.L.getValue());
    }
}
