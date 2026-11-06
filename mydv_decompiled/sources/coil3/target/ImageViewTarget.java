package coil3.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.j42;
import defpackage.vi2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {
    private final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        this.view = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && j42.c(this.view, ((ImageViewTarget) obj).view);
    }

    @Override // coil3.target.GenericViewTarget, coil3.transition.TransitionTarget
    public Drawable getDrawable() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return this.view.hashCode();
    }

    @Override // coil3.target.GenericViewTarget, defpackage.es0
    public void onCreate(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // coil3.target.GenericViewTarget, defpackage.es0
    public void onDestroy(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // coil3.target.GenericViewTarget, defpackage.es0
    public void onPause(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // coil3.target.GenericViewTarget, defpackage.es0
    public void onResume(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // coil3.target.GenericViewTarget
    public void setDrawable(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public String toString() {
        return "ImageViewTarget(view=" + this.view + ")";
    }

    @Override // coil3.target.ViewTarget, coil3.transition.TransitionTarget
    public ImageView getView() {
        return this.view;
    }
}
