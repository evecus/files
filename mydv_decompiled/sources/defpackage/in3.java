package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class in3 {
    public final Context a;
    public AutofillManager b;

    public in3(Context context) {
        this.a = context;
    }

    public final void a() {
        b().commit();
    }

    public final AutofillManager b() {
        AutofillManager autofillManager = this.b;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager b = hn3.b(this.a.getSystemService(b13.q()));
        if (b != null) {
            this.b = b;
            return b;
        }
        zy.i("Could not locate AutofillManager from context");
        return null;
    }

    public final void c(AndroidComposeView androidComposeView, int i, AutofillValue autofillValue) {
        b().notifyValueChanged(androidComposeView, i, autofillValue);
    }

    public final void d(AndroidComposeView androidComposeView, int i, Rect rect) {
        b().notifyViewEntered(androidComposeView, i, rect);
    }

    public final void e(AndroidComposeView androidComposeView, int i) {
        b().notifyViewExited(androidComposeView, i);
    }

    public final void f(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            zr.a(view, b(), i, z);
        }
    }

    public final void g(AndroidComposeView androidComposeView, int i, Rect rect) {
        b().requestAutofill(androidComposeView, i, rect);
    }
}
