package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m44 implements Runnable {
    public ak1 I;
    public bk1 J;
    public Handler K;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.I.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.K.post(new wn1(this.J, obj, (byte) 8));
    }
}
