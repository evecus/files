package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AndroidComposeView J;

    public /* synthetic */ la(AndroidComposeView androidComposeView, byte b) {
        this.I = b;
        this.J = androidComposeView;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 onAttachedToWindow$lambda$0;
        boolean isAttached;
        tq2 localeList_delegate$lambda$0;
        wd5 resendMotionEventOnLayout$lambda$0;
        wd5 layoutChildViewsIfNeeded$lambda$0;
        byte b = this.I;
        AndroidComposeView androidComposeView = this.J;
        switch (b) {
            case 0:
                onAttachedToWindow$lambda$0 = AndroidComposeView.onAttachedToWindow$lambda$0(androidComposeView);
                return onAttachedToWindow$lambda$0;
            case 1:
                isAttached = androidComposeView.isAttached();
                return Boolean.valueOf(isAttached);
            case 2:
                localeList_delegate$lambda$0 = AndroidComposeView.localeList_delegate$lambda$0(androidComposeView);
                return localeList_delegate$lambda$0;
            case 3:
                resendMotionEventOnLayout$lambda$0 = AndroidComposeView.resendMotionEventOnLayout$lambda$0(androidComposeView);
                return resendMotionEventOnLayout$lambda$0;
            default:
                layoutChildViewsIfNeeded$lambda$0 = AndroidComposeView.layoutChildViewsIfNeeded$lambda$0(androidComposeView);
                return layoutChildViewsIfNeeded$lambda$0;
        }
    }
}
