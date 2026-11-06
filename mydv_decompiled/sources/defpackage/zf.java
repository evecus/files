package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            bg bgVar = new bg(choreographer, rt0.j(myLooper));
            return bgVar.plus(bgVar.R);
        }
        zy.i("no Looper on this thread");
        return null;
    }
}
