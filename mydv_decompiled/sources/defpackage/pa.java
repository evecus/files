package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.github.mytv.dv.model.VideoPlayUrlResolver;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ byte I;

    public /* synthetic */ pa(byte b) {
        this.I = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.I) {
            case 0:
                synchronized (AndroidComposeView.composeViews) {
                    try {
                        Object[] objArr = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            e43 e43Var = AndroidComposeView.composeViews;
                            Object[] objArr2 = e43Var.a;
                            int i = e43Var.b;
                            for (int i2 = 0; i2 < i; i2++) {
                                final AndroidComposeView androidComposeView = (AndroidComposeView) objArr2[i2];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                AndroidComposeView.Companion.getClass();
                                androidComposeView.setShowLayoutBounds(ra.b());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    final Object[] objArr3 = objArr == true ? 1 : 0;
                                    androidComposeView.post(new Runnable() { // from class: qa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b = objArr3;
                                            AndroidComposeView androidComposeView2 = androidComposeView;
                                            switch (b) {
                                                case 0:
                                                    androidComposeView2.invalidateDescendants();
                                                    break;
                                                default:
                                                    androidComposeView2.invalidateDescendants();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            e43 e43Var2 = AndroidComposeView.composeViews;
                            Object[] objArr4 = e43Var2.a;
                            int i3 = e43Var2.b;
                            for (int i4 = 0; i4 < i3; i4++) {
                                final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr4[i4];
                                final byte b = 1;
                                androidComposeView2.post(new Runnable() { // from class: qa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b2 = b;
                                        AndroidComposeView androidComposeView22 = androidComposeView2;
                                        switch (b2) {
                                            case 0:
                                                androidComposeView22.invalidateDescendants();
                                                break;
                                            default:
                                                androidComposeView22.invalidateDescendants();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                VideoPlayUrlResolver.init$lambda$1();
                return;
        }
    }
}
