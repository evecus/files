package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mp1 extends GLSurfaceView {
    public tm1 I;
    public rm1 J;
    public final xn5 K;

    public mp1(Context context) {
        super(context, null);
        xn5 xn5Var = new xn5();
        this.K = xn5Var;
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        getHolder().setFormat(-1);
        setRenderMode(1);
        xn5Var.I = this;
        xn5Var.J = new v1((Object) this, (byte) 24);
        setRenderer(xn5Var);
    }

    public final tm1 getOnSurfaceReady() {
        return this.I;
    }

    public final rm1 getOnSurfaceReleasing() {
        return this.J;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        rm1 rm1Var = this.J;
        if (rm1Var != null) {
            rm1Var.invoke();
        }
        super.onDetachedFromWindow();
        xn5 xn5Var = this.K;
        ArrayList arrayList = xn5Var.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            uj3 uj3Var = (uj3) obj;
            xn5.b((SurfaceTexture) uj3Var.I, (Surface) uj3Var.J);
        }
        xn5Var.Z.clear();
        SurfaceTexture surfaceTexture = xn5Var.U;
        if (surfaceTexture != null) {
            Surface surface = xn5Var.V;
            xn5Var.U = null;
            xn5Var.V = null;
            xn5Var.T = false;
            xn5Var.Y = false;
            if (surface != null) {
                xn5.b(surfaceTexture, surface);
            }
        }
        this.I = null;
        this.J = null;
    }

    public final void setOnSurfaceReady(tm1 tm1Var) {
        this.I = tm1Var;
    }

    public final void setOnSurfaceReleasing(rm1 rm1Var) {
        this.J = rm1Var;
    }
}
