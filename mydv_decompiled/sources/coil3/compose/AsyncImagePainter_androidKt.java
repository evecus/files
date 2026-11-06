package coil3.compose;

import android.graphics.drawable.Drawable;
import android.view.View;
import coil3.Image;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.CrossfadeTransition;
import coil3.transition.Transition;
import coil3.transition.TransitionTarget;
import defpackage.jp;
import defpackage.ni0;
import defpackage.rj3;
import defpackage.sp0;
import defpackage.t41;
import defpackage.x41;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AsyncImagePainter_androidKt {
    private static final AsyncImagePainter_androidKt$FakeTransitionTarget$1 FakeTransitionTarget = new TransitionTarget() { // from class: coil3.compose.AsyncImagePainter_androidKt$FakeTransitionTarget$1
        @Override // coil3.transition.TransitionTarget
        public Drawable getDrawable() {
            return null;
        }

        @Override // coil3.transition.TransitionTarget
        public View getView() {
            throw new UnsupportedOperationException();
        }

        @Override // coil3.target.Target
        public final /* synthetic */ void onError(Image image) {
        }

        @Override // coil3.target.Target
        public final /* synthetic */ void onStart(Image image) {
        }

        @Override // coil3.target.Target
        public final /* synthetic */ void onSuccess(Image image) {
        }
    };

    public static final CrossfadePainter maybeNewCrossfadePainter(AsyncImagePainter.State state, AsyncImagePainter.State state2, ni0 ni0Var) {
        ImageResult result;
        if (!(state2 instanceof AsyncImagePainter.State.Success)) {
            if (state2 instanceof AsyncImagePainter.State.Error) {
                result = ((AsyncImagePainter.State.Error) state2).getResult();
            }
            return null;
        }
        result = ((AsyncImagePainter.State.Success) state2).getResult();
        Transition create = ImageRequests_androidKt.getTransitionFactory(result.getRequest()).create(FakeTransitionTarget, result);
        if (create instanceof CrossfadeTransition) {
            rj3 painter = state instanceof AsyncImagePainter.State.Loading ? state.getPainter() : null;
            rj3 painter2 = state2.getPainter();
            jp jpVar = t41.J;
            CrossfadeTransition crossfadeTransition = (CrossfadeTransition) create;
            return new CrossfadePainter(painter, painter2, ni0Var, sp0.n0(crossfadeTransition.getDurationMillis(), x41.MILLISECONDS), null, ((result instanceof SuccessResult) && ((SuccessResult) result).isPlaceholderCached()) ? false : true, crossfadeTransition.getPreferExactIntrinsicSize(), ImageRequestsKt.getPreferEndFirstIntrinsicSize(result.getRequest()), 16, null);
        }
        return null;
    }
}
