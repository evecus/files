package coil3.transition;

import android.graphics.drawable.Drawable;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.size.Scale;
import coil3.transition.Transition;
import defpackage.er0;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CrossfadeTransition implements Transition {
    private final int durationMillis;
    private final boolean preferExactIntrinsicSize;
    private final ImageResult result;
    private final TransitionTarget target;

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z) {
        this.target = transitionTarget;
        this.result = imageResult;
        this.durationMillis = i;
        this.preferExactIntrinsicSize = z;
        if (i > 0) {
            return;
        }
        s83.t("durationMillis must be > 0.");
        throw null;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @Override // coil3.transition.Transition
    public void transition() {
        Drawable drawable = this.target.getDrawable();
        Image image = this.result.getImage();
        Drawable asDrawable = image != null ? Image_androidKt.asDrawable(image, this.target.getView().getResources()) : null;
        Scale scale = this.result.getRequest().getScale();
        int i = this.durationMillis;
        ImageResult imageResult = this.result;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawable, asDrawable, scale, i, ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).isPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        ImageResult imageResult2 = this.result;
        if (imageResult2 instanceof SuccessResult) {
            this.target.onSuccess(Image_androidKt.asImage(crossfadeDrawable));
        } else if (imageResult2 instanceof ErrorResult) {
            this.target.onError(Image_androidKt.asImage(crossfadeDrawable));
        } else {
            s83.v();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Factory implements Transition.Factory {
        private final int durationMillis;
        private final boolean preferExactIntrinsicSize;

        public Factory(int i, boolean z) {
            this.durationMillis = i;
            this.preferExactIntrinsicSize = z;
            if (i > 0) {
                return;
            }
            s83.t("durationMillis must be > 0.");
            throw null;
        }

        @Override // coil3.transition.Transition.Factory
        public Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            return !(imageResult instanceof SuccessResult) ? Transition.Factory.NONE.create(transitionTarget, imageResult) : ((SuccessResult) imageResult).getDataSource() == DataSource.MEMORY_CACHE ? Transition.Factory.NONE.create(transitionTarget, imageResult) : new CrossfadeTransition(transitionTarget, imageResult, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.preferExactIntrinsicSize;
        }

        public Factory(int i) {
            this(i, false, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, er0 er0Var) {
            this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }

    public /* synthetic */ CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z, int i2, er0 er0Var) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 200 : i, (i2 & 8) != 0 ? false : z);
    }
}
