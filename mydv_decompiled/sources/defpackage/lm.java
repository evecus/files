package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lm {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ qm d;

    public lm(qm qmVar, int i, int i2, WeakReference weakReference) {
        this.d = qmVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    public final void a(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: c54
            @Override // java.lang.Runnable
            public final void run() {
                lm.this.b(i);
            }
        });
    }

    public final void c(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = ck.e(typeface, i, (this.b & 2) != 0);
        }
        qm qmVar = this.d;
        if (qmVar.n) {
            qmVar.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = qmVar.j;
                if (isAttachedToWindow) {
                    textView.post(new mm(textView, typeface, i2));
                } else {
                    qm.d(textView, typeface, i2);
                }
            }
        }
    }

    public final void b(int i) {
    }
}
