package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w9 extends ds implements mi4, ai1 {
    public final in3 I;
    public final xi4 J;
    public final AndroidComposeView K;
    public final o14 L;
    public final String M;
    public final Rect N = new Rect();
    public final AutofillId O;
    public final r33 P;
    public boolean Q;

    public w9(in3 in3Var, xi4 xi4Var, AndroidComposeView androidComposeView, o14 o14Var, String str) {
        this.I = in3Var;
        this.J = xi4Var;
        this.K = androidComposeView;
        this.L = o14Var;
        this.M = str;
        androidComposeView.setImportantForAutofill(1);
        cs f = qi4.f(androidComposeView);
        AutofillId autofillId = f != null ? (AutofillId) f.a : null;
        if (autofillId == null) {
            throw r7.t("Required value was null.");
        }
        this.O = autofillId;
        this.P = new r33();
    }

    public final void a(SparseArray sparseArray) {
        ki4 x;
        tm1 tm1Var;
        tm1 tm1Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue e = j0.e(sparseArray.get(keyAt));
            wa2 wa2Var = (wa2) this.J.c.b(keyAt);
            if (wa2Var != null && (x = wa2Var.x()) != null) {
                n43 n43Var = x.I;
                Object g = n43Var.g(ii4.g);
                if (g == null) {
                    g = null;
                }
                v4 v4Var = (v4) g;
                if (v4Var != null && (tm1Var2 = (tm1) v4Var.b) != null) {
                }
                Object g2 = n43Var.g(ii4.h);
                v4 v4Var2 = (v4) (g2 != null ? g2 : null);
                if (v4Var2 != null && (tm1Var = (tm1) v4Var2.b) != null) {
                }
            }
        }
    }

    @Override // defpackage.ai1
    public final void onFocusChanged(si1 si1Var, si1 si1Var2) {
        wa2 U;
        ki4 x;
        wa2 U2;
        ki4 x2;
        AndroidComposeView androidComposeView = this.K;
        in3 in3Var = this.I;
        if (si1Var != null && (U2 = ut0.U(si1Var)) != null && (x2 = U2.x()) != null && j42.F(x2)) {
            in3Var.e(androidComposeView, U2.J);
        }
        if (si1Var2 == null || (U = ut0.U(si1Var2)) == null || (x = U.x()) == null || !j42.F(x)) {
            return;
        }
        int i = U.J;
        o14 o14Var = this.L;
        wa2 wa2Var = (wa2) o14Var.a.b(i);
        if (wa2Var == null || wa2Var.O == -4) {
            return;
        }
        tl tlVar = o14Var.c;
        int d = o14Var.d(wa2Var);
        long[] jArr = (long[]) tlVar.b;
        long j = jArr[d];
        long j2 = jArr[d + 1];
        in3Var.d(androidComposeView, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
