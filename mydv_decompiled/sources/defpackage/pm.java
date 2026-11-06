package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pm {
    public final TextView a;
    public final kh0 b;
    public Typeface c;
    public Typeface d;
    public String e;

    public pm(TextView textView, kh0 kh0Var) {
        this.a = textView;
        this.b = kh0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        r1 = r1.getContext().getResources().getConfiguration().fontWeightAdjustment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r7) {
        /*
            r6 = this;
            android.graphics.Typeface r0 = r6.c
            android.widget.TextView r1 = r6.a
            android.text.TextPaint r2 = r1.getPaint()
            android.graphics.Typeface r3 = r6.d
            android.graphics.Typeface r4 = r2.getTypeface()
            if (r3 == r4) goto L1b
            java.lang.String r0 = "FontVarSettings"
            java.lang.String r3 = "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint()."
            android.util.Log.w(r0, r3)
            android.graphics.Typeface r0 = r2.getTypeface()
        L1b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r2 < r3) goto L37
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = defpackage.y9.a(r1)
            if (r1 != r4) goto L38
        L37:
            r1 = r5
        L38:
            if (r1 != r4) goto L3b
            r1 = r5
        L3b:
            android.graphics.Typeface r0 = defpackage.om.a(r0, r7, r1)
            if (r0 == 0) goto L4c
            r6.d = r0
            kh0 r1 = r6.b
            r1.accept(r0)
            r6.e = r7
            r6 = 1
            return r6
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm.a(java.lang.String):boolean");
    }
}
