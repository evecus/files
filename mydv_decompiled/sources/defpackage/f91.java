package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f91 extends z71 implements Runnable {
    public final WeakReference I;

    public f91(EditText editText) {
        this.I = new WeakReference(editText);
    }

    @Override // defpackage.z71
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.I.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        g91.a((EditText) this.I.get(), 1);
    }
}
