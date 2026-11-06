package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pl {
    public final /* synthetic */ ql a;

    public pl(ql qlVar) {
        this.a = qlVar;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.EditText*/.getTextClassifier();
        return textClassifier;
    }

    public final void b(TextClassifier textClassifier) {
        super/*android.widget.EditText*/.setTextClassifier(textClassifier);
    }
}
