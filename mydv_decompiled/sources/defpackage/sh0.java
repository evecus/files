package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sh0 implements th0 {
    public final Object a;
    public final View b;

    public sh0(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static sh0 g(ContentCaptureSession contentCaptureSession, View view) {
        return new sh0(contentCaptureSession, view);
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession f = j0.f(this.a);
            cs f2 = qi4.f(this.b);
            Objects.requireNonNull(f2);
            f.notifyViewsDisappeared(y9.d(f2.a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession f = j0.f(this.a);
        cs f2 = qi4.f(this.b);
        Objects.requireNonNull(f2);
        return f.newAutofillId(y9.d(f2.a), j);
    }

    public final g73 c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new g73(j0.f(this.a).newVirtualViewStructure(autofillId, j), (byte) 17);
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            j0.f(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            j0.f(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}
