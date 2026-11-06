package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ag implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ bg I;

    public ag(bg bgVar) {
        this.I = bgVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.I.J.removeCallbacks(this);
        this.I.b0();
        bg bgVar = this.I;
        synchronized (bgVar.K) {
            if (bgVar.P) {
                bgVar.P = false;
                ArrayList arrayList = bgVar.M;
                bgVar.M = bgVar.N;
                bgVar.N = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.I.b0();
        bg bgVar = this.I;
        synchronized (bgVar.K) {
            if (bgVar.M.isEmpty()) {
                bgVar.I.removeFrameCallback(this);
                bgVar.P = false;
            }
        }
    }
}
