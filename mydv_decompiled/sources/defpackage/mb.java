package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mb implements ViewTranslationCallback {
    public static final mb a = new mb();

    public final boolean onClearTranslation(View view) {
        rm1 rm1Var;
        view.getClass();
        wb contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.M = sb.I;
        p22 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        n43 n43Var = ((vi4) objArr[(i << 3) + i3]).a.d.I;
                        Object g = n43Var.g(zi4.E);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = n43Var.g(ii4.n);
                            v4 v4Var = (v4) (g2 != null ? g2 : null);
                            if (v4Var != null && (rm1Var = (rm1) v4Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        tm1 tm1Var;
        view.getClass();
        wb contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.M = sb.I;
        p22 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        n43 n43Var = ((vi4) objArr[(i << 3) + i3]).a.d.I;
                        Object g = n43Var.g(zi4.E);
                        if (g == null) {
                            g = null;
                        }
                        if (j42.c(g, Boolean.TRUE)) {
                            Object g2 = n43Var.g(ii4.m);
                            v4 v4Var = (v4) (g2 != null ? g2 : null);
                            if (v4Var != null && (tm1Var = (tm1) v4Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        tm1 tm1Var;
        view.getClass();
        wb contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.M = sb.J;
        p22 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        n43 n43Var = ((vi4) objArr[(i << 3) + i3]).a.d.I;
                        Object g = n43Var.g(zi4.E);
                        if (g == null) {
                            g = null;
                        }
                        if (j42.c(g, Boolean.FALSE)) {
                            Object g2 = n43Var.g(ii4.m);
                            v4 v4Var = (v4) (g2 != null ? g2 : null);
                            if (v4Var != null && (tm1Var = (tm1) v4Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
