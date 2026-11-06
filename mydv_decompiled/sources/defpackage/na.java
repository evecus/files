package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class na implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AndroidComposeView J;

    public /* synthetic */ na(AndroidComposeView androidComposeView, byte b) {
        this.I = b;
        this.J = androidComposeView;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        wd5 snapshotObserver$lambda$0;
        wd5 indirectPointerNavigationGestureDetector$lambda$0;
        byte b = this.I;
        AndroidComposeView androidComposeView = this.J;
        switch (b) {
            case 0:
                snapshotObserver$lambda$0 = AndroidComposeView.snapshotObserver$lambda$0(androidComposeView, (rm1) obj);
                return snapshotObserver$lambda$0;
            case 1:
                indirectPointerNavigationGestureDetector$lambda$0 = AndroidComposeView.indirectPointerNavigationGestureDetector$lambda$0(androidComposeView, (oh1) obj);
                return indirectPointerNavigationGestureDetector$lambda$0;
            case 2:
                return androidComposeView.getSavedStateRegistry();
            default:
                return Boolean.valueOf(androidComposeView.getScrollCaptureInProgress());
        }
    }
}
