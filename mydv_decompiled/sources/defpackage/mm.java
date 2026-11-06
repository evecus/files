package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mm implements Runnable {
    public final /* synthetic */ TextView I;
    public final /* synthetic */ Typeface J;
    public final /* synthetic */ int K;

    public mm(TextView textView, Typeface typeface, int i) {
        this.I = textView;
        this.J = typeface;
        this.K = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qm.d(this.I, this.J, this.K);
    }
}
