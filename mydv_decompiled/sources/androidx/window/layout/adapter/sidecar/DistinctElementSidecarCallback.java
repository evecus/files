package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.co4;
import defpackage.do4;
import defpackage.j42;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final SidecarInterface.SidecarCallback d;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(do4 do4Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001a, code lost:
    
        if (defpackage.co4.b(r1) == defpackage.co4.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            androidx.window.sidecar.SidecarDeviceState r1 = r3.b     // Catch: java.lang.Throwable -> L1e
            boolean r2 = defpackage.j42.c(r1, r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto Lf
            goto L1c
        Lf:
            if (r1 != 0) goto L12
            goto L20
        L12:
            int r1 = defpackage.co4.b(r1)     // Catch: java.lang.Throwable -> L1e
            int r2 = defpackage.co4.b(r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 != r2) goto L20
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            goto L29
        L20:
            r3.b = r4     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.d
            r3.onDeviceStateChanged(r4)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                if (j42.c(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = do4.b(co4.c(sidecarWindowLayoutInfo2), co4.c(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
