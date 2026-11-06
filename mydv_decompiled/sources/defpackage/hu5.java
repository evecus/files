package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.Consumer2;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hu5 implements Consumer2 {
    public final Executor a;
    public final r41 b;
    public final WindowAreaComponent c;
    public int d;
    public final /* synthetic */ lu5 e;

    public hu5(lu5 lu5Var, Executor executor, r41 r41Var, WindowAreaComponent windowAreaComponent) {
        this.e = lu5Var;
        this.a = executor;
        this.b = r41Var;
        this.c = windowAreaComponent;
    }

    public static final void a(int i, int i2, hu5 hu5Var, lu5 lu5Var) {
        if (i == 0) {
            lu5Var.f = false;
            hu5Var.b.c();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                Log.e(lu5.h, "Invalid session state value received: " + i);
                return;
            }
            return;
        }
        r41 r41Var = hu5Var.b;
        if (i2 == 2) {
            return;
        }
        WindowAreaComponent windowAreaComponent = hu5Var.c;
        ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
        rearDisplayPresentation.getClass();
        t04 t04Var = new t04(windowAreaComponent, rearDisplayPresentation, zc1.a());
        r41Var.f = t04Var;
        Context context = t04Var.c;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
        aspectRatioFrameLayout.setBackgroundColor(-16777216);
        aspectRatioFrameLayout.setAspectRatio(r41Var.h);
        aspectRatioFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        aspectRatioFrameLayout.addView(surfaceView);
        frameLayout.addView(aspectRatioFrameLayout);
        r41Var.g = aspectRatioFrameLayout;
        r41Var.d.setValue(surfaceView);
        t04Var.b(frameLayout);
        r41Var.c.setValue(Boolean.TRUE);
    }

    @Override // androidx.window.reflection.Consumer2
    public final void accept(Object obj) {
        final int intValue = ((Number) obj).intValue();
        final int i = this.d;
        this.d = intValue;
        Executor executor = this.a;
        final lu5 lu5Var = this.e;
        executor.execute(new Runnable() { // from class: gu5
            @Override // java.lang.Runnable
            public final void run() {
                hu5.a(intValue, i, this, lu5Var);
            }
        });
    }
}
