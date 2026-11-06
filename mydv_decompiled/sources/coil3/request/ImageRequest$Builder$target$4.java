package coil3.request;

import coil3.Image;
import coil3.target.Target;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImageRequest$Builder$target$4 implements Target {
    final /* synthetic */ tm1 $onError;
    final /* synthetic */ tm1 $onStart;
    final /* synthetic */ tm1 $onSuccess;

    public ImageRequest$Builder$target$4(tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3) {
        this.$onStart = tm1Var;
        this.$onError = tm1Var2;
        this.$onSuccess = tm1Var3;
    }

    @Override // coil3.target.Target
    public void onError(Image image) {
        this.$onError.invoke(image);
    }

    @Override // coil3.target.Target
    public void onStart(Image image) {
        this.$onStart.invoke(image);
    }

    @Override // coil3.target.Target
    public void onSuccess(Image image) {
        this.$onSuccess.invoke(image);
    }
}
