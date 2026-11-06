package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j35 extends u25 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public j35(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
