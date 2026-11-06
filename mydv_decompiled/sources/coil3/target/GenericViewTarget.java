package coil3.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.transition.TransitionTarget;
import defpackage.es0;
import defpackage.vi2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class GenericViewTarget<T extends View> implements ViewTarget<T>, TransitionTarget, es0 {
    private boolean isStarted;

    @Override // coil3.transition.TransitionTarget
    public abstract Drawable getDrawable();

    @Override // defpackage.es0
    public void onCreate(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onDestroy(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // coil3.target.Target
    public void onError(Image image) {
        updateImage(image);
    }

    @Override // defpackage.es0
    public void onPause(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onResume(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onStart(vi2 vi2Var) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // defpackage.es0
    public void onStop(vi2 vi2Var) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // coil3.target.Target
    public void onSuccess(Image image) {
        updateImage(image);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(Image image) {
        Drawable asDrawable = image != null ? Image_androidKt.asDrawable(image, getView().getResources()) : null;
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(asDrawable);
        updateAnimation();
    }

    @Override // coil3.target.Target
    public void onStart(Image image) {
        updateImage(image);
    }
}
