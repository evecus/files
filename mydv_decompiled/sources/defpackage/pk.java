package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements kh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ pk(TextView textView, byte b) {
        this.a = b;
        this.b = textView;
    }

    @Override // defpackage.kh0
    public final void accept(Object obj) {
        byte b = this.a;
        TextView textView = this.b;
        switch (b) {
            case 0:
                super/*android.widget.Button*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
