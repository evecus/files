package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gr1 extends k21 {
    public final CharSequence j;
    public final TextPaint k;

    public gr1(CharSequence charSequence, TextPaint textPaint) {
        this.j = charSequence;
        this.k = textPaint;
    }

    @Override // defpackage.k21
    public final int e0(int i) {
        CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.k21
    public final int k0(int i) {
        CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
