package defpackage;

import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v9 implements yr {
    public final AndroidComposeView a;
    public final es b;
    public final AutofillId c;

    public v9(AndroidComposeView androidComposeView, es esVar) {
        this.a = androidComposeView;
        this.b = esVar;
        androidComposeView.setImportantForAutofill(1);
        cs f = qi4.f(androidComposeView);
        AutofillId autofillId = f != null ? (AutofillId) f.a : null;
        if (autofillId == null) {
            throw r7.t("Required value was null.");
        }
        this.c = autofillId;
    }
}
