package androidx.media3.common;

import android.view.SurfaceView;
import defpackage.j0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new j0((byte) 27);

    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
