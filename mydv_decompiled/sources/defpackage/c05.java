package defpackage;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c05 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SurfaceHolder J;

    public /* synthetic */ c05(SurfaceHolder surfaceHolder, byte b) {
        this.I = b;
        this.J = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        SurfaceHolder surfaceHolder = this.J;
        switch (b) {
            case 0:
                surfaceHolder.setFixedSize(1, 1);
                break;
            default:
                surfaceHolder.setFixedSize(1, 1);
                break;
        }
    }
}
