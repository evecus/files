package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class za implements Runnable {
    public final /* synthetic */ AndroidComposeView I;

    public za(AndroidComposeView androidComposeView) {
        this.I = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        int actionMasked;
        long j;
        AndroidComposeView androidComposeView = this.I;
        androidComposeView.removeCallbacks(this);
        motionEvent = androidComposeView.previousMotionEvent;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7) {
            if (actionMasked == 8) {
                i = 9;
            } else if (actionMasked != 9) {
                i = 2;
            }
        }
        j = androidComposeView.relayoutTime;
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, false);
    }
}
