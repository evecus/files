package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class om0 {
    public final AndroidComposeView a;
    public final pn b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public d55 j;
    public u55 k;
    public td3 l;
    public m14 n;
    public m14 o;
    public final Object c = new Object();
    public tm1 m = nm0.J;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = nw2.a();
    public final Matrix r = new Matrix();

    public om0(AndroidComposeView androidComposeView, pn pnVar) {
        this.a = androidComposeView;
        this.b = pnVar;
    }

    public final void a() {
        pn pnVar = this.b;
        uc2 uc2Var = (uc2) pnVar.c;
        InputMethodManager inputMethodManager = (InputMethodManager) uc2Var.getValue();
        View view = (View) pnVar.b;
        if (inputMethodManager.isActive(view)) {
            tm1 tm1Var = this.m;
            float[] fArr = this.q;
            tm1Var.invoke(new nw2(fArr));
            this.a.mo20localToScreen58bKbWc(fArr);
            Matrix matrix = this.r;
            o7.O(matrix, fArr);
            d55 d55Var = this.j;
            d55Var.getClass();
            td3 td3Var = this.l;
            td3Var.getClass();
            u55 u55Var = this.k;
            u55Var.getClass();
            m14 m14Var = this.n;
            m14Var.getClass();
            m14 m14Var2 = this.o;
            m14Var2.getClass();
            ((InputMethodManager) uc2Var.getValue()).updateCursorAnchorInfo(view, d4.h(this.p, d55Var, td3Var, u55Var, matrix, m14Var, m14Var2, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }
}
