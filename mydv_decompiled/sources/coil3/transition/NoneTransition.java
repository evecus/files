package coil3.transition;

import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.Transition;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NoneTransition implements Transition {
    private final ImageResult result;
    private final TransitionTarget target;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements Transition.Factory {
        @Override // coil3.transition.Transition.Factory
        public Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            return new NoneTransition(transitionTarget, imageResult);
        }
    }

    public NoneTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this.target = transitionTarget;
        this.result = imageResult;
    }

    @Override // coil3.transition.Transition
    public void transition() {
        ImageResult imageResult = this.result;
        if (imageResult instanceof SuccessResult) {
            this.target.onSuccess(((SuccessResult) imageResult).getImage());
        } else if (imageResult instanceof ErrorResult) {
            this.target.onError(((ErrorResult) imageResult).getImage());
        } else {
            s83.v();
        }
    }
}
