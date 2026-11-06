package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class td0 implements ScrollCaptureCallback {
    public final si4 a;
    public final v22 b;
    public final db4 c;
    public final AndroidComposeView d;
    public final dj0 e;
    public final ev1 f;

    public td0(si4 si4Var, v22 v22Var, dj0 dj0Var, db4 db4Var, AndroidComposeView androidComposeView) {
        this.a = si4Var;
        this.b = v22Var;
        this.c = db4Var;
        this.d = androidComposeView;
        this.e = new dj0(dj0Var.I.plus(lx0.J));
        this.f = new ev1(v22Var.a(), new nu(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r4 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r9, defpackage.v22 r10, defpackage.gj0 r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td0.a(android.view.ScrollCaptureSession, v22, gj0):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        p70.g0(this.e, ta3.I, null, new r((Object) this, (Object) runnable, (fj0) null, (byte) 10), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        rv4 g0 = p70.g0(this.e, null, null, new n6((Object) this, (Object) scrollCaptureSession, (Object) rect, (Object) consumer, (fj0) null, (byte) 4), 3);
        g0.Q(new v1((Object) cancellationSignal, (byte) 13));
        cancellationSignal.setOnCancelListener(new ud0(g0, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.n(sp0.g0(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
