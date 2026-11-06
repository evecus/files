package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vc implements pe1 {
    public final AutofillValue a;

    public vc(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final AutofillValue a() {
        return this.a;
    }

    public final CharSequence b() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
