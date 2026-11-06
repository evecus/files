package coil3.request;

import coil3.request.ImageRequest;
import defpackage.hn1;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImageRequest$Builder$listener$5 implements ImageRequest.Listener {
    final /* synthetic */ tm1 $onCancel;
    final /* synthetic */ hn1 $onError;
    final /* synthetic */ tm1 $onStart;
    final /* synthetic */ hn1 $onSuccess;

    public ImageRequest$Builder$listener$5(tm1 tm1Var, tm1 tm1Var2, hn1 hn1Var, hn1 hn1Var2) {
        this.$onStart = tm1Var;
        this.$onCancel = tm1Var2;
        this.$onError = hn1Var;
        this.$onSuccess = hn1Var2;
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onCancel(ImageRequest imageRequest) {
        this.$onCancel.invoke(imageRequest);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        this.$onError.invoke(imageRequest, errorResult);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onStart(ImageRequest imageRequest) {
        this.$onStart.invoke(imageRequest);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
        this.$onSuccess.invoke(imageRequest, successResult);
    }
}
