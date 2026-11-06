package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s55 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public a1 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final qj2[] n;
    public final Rect o = new Rect();
    public zw p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s55(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, defpackage.ja2 r35) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s55.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, ja2):void");
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final zw c() {
        zw zwVar = this.p;
        if (zwVar != null) {
            return zwVar;
        }
        zw zwVar2 = new zw(this.f);
        this.p = zwVar2;
        return zwVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = w55.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().f(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().f(i, false, z);
    }

    public final a1 l() {
        a1 a1Var = this.e;
        if (a1Var != null) {
            return a1Var;
        }
        Layout layout = this.f;
        a1 a1Var2 = new a1(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = a1Var2;
        return a1Var2;
    }
}
