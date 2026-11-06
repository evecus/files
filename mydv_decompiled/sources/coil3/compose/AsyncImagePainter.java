package coil3.compose;

import android.os.Trace;
import coil3.Image;
import coil3.ImageLoader;
import coil3.compose.internal.DeferredDispatchKt;
import coil3.compose.internal.UtilsKt;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.size.Precision;
import coil3.size.SizeResolver;
import coil3.target.Target;
import defpackage.ad4;
import defpackage.c80;
import defpackage.dl0;
import defpackage.dw4;
import defpackage.er0;
import defpackage.ez;
import defpackage.fq4;
import defpackage.fw4;
import defpackage.j42;
import defpackage.k34;
import defpackage.l91;
import defpackage.li0;
import defpackage.ni0;
import defpackage.o7;
import defpackage.q4;
import defpackage.r43;
import defpackage.rj3;
import defpackage.s83;
import defpackage.sv2;
import defpackage.t43;
import defpackage.tm1;
import defpackage.v52;
import defpackage.w43;
import defpackage.y31;
import defpackage.zf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AsyncImagePainter extends rj3 implements k34 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final tm1 DefaultTransform = new q4(10);
    private Input _input;
    private c80 colorFilter;
    private r43 drawSizeFlow;
    private final dw4 input;
    private final w43 inputFlow;
    private boolean isRemembered;
    private tm1 onState;
    private AsyncImagePreviewHandler previewHandler;
    private v52 rememberJob;
    public dl0 scope;
    private final dw4 state;
    private final w43 stateFlow;
    private final t43 painter$delegate = ad4.w(null);
    private float alpha = 1.0f;
    private long drawSize = 9205357640488583168L;
    private tm1 transform = DefaultTransform;
    private ni0 contentScale = li0.b;
    private int filterQuality = 1;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Input {
        public static final int $stable = 0;
        private final ImageLoader imageLoader;
        private final AsyncImageModelEqualityDelegate modelEqualityDelegate;
        private final ImageRequest request;

        public Input(ImageLoader imageLoader, ImageRequest imageRequest, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate) {
            this.imageLoader = imageLoader;
            this.request = imageRequest;
            this.modelEqualityDelegate = asyncImageModelEqualityDelegate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return j42.c(this.imageLoader, input.imageLoader) && j42.c(this.modelEqualityDelegate, input.modelEqualityDelegate) && this.modelEqualityDelegate.equals(this.request, input.request);
        }

        public final ImageLoader getImageLoader() {
            return this.imageLoader;
        }

        public final AsyncImageModelEqualityDelegate getModelEqualityDelegate() {
            return this.modelEqualityDelegate;
        }

        public final ImageRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            return this.modelEqualityDelegate.hashCode(this.request) + ((this.modelEqualityDelegate.hashCode() + (this.imageLoader.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Input(imageLoader=" + this.imageLoader + ", request=" + this.request + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ")";
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface State {

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Empty implements State {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public rj3 getPainter() {
                return null;
            }

            public int hashCode() {
                return -1625786264;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Error implements State {
            public static final int $stable = rj3.$stable;
            private final rj3 painter;
            private final ErrorResult result;

            public Error(rj3 rj3Var, ErrorResult errorResult) {
                this.painter = rj3Var;
                this.result = errorResult;
            }

            public static /* synthetic */ Error copy$default(Error error, rj3 rj3Var, ErrorResult errorResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    rj3Var = error.painter;
                }
                if ((i & 2) != 0) {
                    errorResult = error.result;
                }
                return error.copy(rj3Var, errorResult);
            }

            public final rj3 component1() {
                return this.painter;
            }

            public final ErrorResult component2() {
                return this.result;
            }

            public final Error copy(rj3 rj3Var, ErrorResult errorResult) {
                return new Error(rj3Var, errorResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return j42.c(this.painter, error.painter) && j42.c(this.result, error.result);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public rj3 getPainter() {
                return this.painter;
            }

            public final ErrorResult getResult() {
                return this.result;
            }

            public int hashCode() {
                rj3 rj3Var = this.painter;
                return this.result.hashCode() + ((rj3Var == null ? 0 : rj3Var.hashCode()) * 31);
            }

            public String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Loading implements State {
            public static final int $stable = rj3.$stable;
            private final rj3 painter;

            public Loading(rj3 rj3Var) {
                this.painter = rj3Var;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, rj3 rj3Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    rj3Var = loading.painter;
                }
                return loading.copy(rj3Var);
            }

            public final rj3 component1() {
                return this.painter;
            }

            public final Loading copy(rj3 rj3Var) {
                return new Loading(rj3Var);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && j42.c(this.painter, ((Loading) obj).painter);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public rj3 getPainter() {
                return this.painter;
            }

            public int hashCode() {
                rj3 rj3Var = this.painter;
                if (rj3Var == null) {
                    return 0;
                }
                return rj3Var.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Success implements State {
            public static final int $stable = rj3.$stable;
            private final rj3 painter;
            private final SuccessResult result;

            public Success(rj3 rj3Var, SuccessResult successResult) {
                this.painter = rj3Var;
                this.result = successResult;
            }

            public static /* synthetic */ Success copy$default(Success success, rj3 rj3Var, SuccessResult successResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    rj3Var = success.painter;
                }
                if ((i & 2) != 0) {
                    successResult = success.result;
                }
                return success.copy(rj3Var, successResult);
            }

            public final rj3 component1() {
                return this.painter;
            }

            public final SuccessResult component2() {
                return this.result;
            }

            public final Success copy(rj3 rj3Var, SuccessResult successResult) {
                return new Success(rj3Var, successResult);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return j42.c(this.painter, success.painter) && j42.c(this.result, success.result);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public rj3 getPainter() {
                return this.painter;
            }

            public final SuccessResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode() + (this.painter.hashCode() * 31);
            }

            public String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        rj3 getPainter();
    }

    public AsyncImagePainter(Input input) {
        this._input = input;
        fw4 c = o7.c(input);
        this.inputFlow = c;
        this.input = sv2.j(c);
        fw4 c2 = o7.c(State.Empty.INSTANCE);
        this.stateFlow = c2;
        this.state = sv2.j(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rj3 getPainter() {
        return (rj3) this.painter$delegate.getValue();
    }

    private final void launchJob() {
        Input input = this._input;
        if (input == null) {
            return;
        }
        setRememberJob(DeferredDispatchKt.launchWithDeferredDispatch(getScope$io_coil_kt_coil3_coil_compose_core(), new AsyncImagePainter$launchJob$1(this, input, null)));
    }

    private final zf1 lazyDrawSizeFlow() {
        r43 r43Var = this.drawSizeFlow;
        if (r43Var == null) {
            r43Var = o7.b(0, 2, ez.J);
            long j = this.drawSize;
            if (j != 9205357640488583168L) {
                r43Var.b(new fq4(j));
            }
            this.drawSizeFlow = r43Var;
        }
        return r43Var;
    }

    /* renamed from: setDrawSize-uvyYCjk, reason: not valid java name */
    private final void m41setDrawSizeuvyYCjk(long j) {
        if (fq4.a(this.drawSize, j)) {
            return;
        }
        this.drawSize = j;
        r43 r43Var = this.drawSizeFlow;
        if (r43Var != null) {
            r43Var.b(new fq4(j));
        }
    }

    private final void setPainter(rj3 rj3Var) {
        this.painter$delegate.setValue(rj3Var);
    }

    private final void setRememberJob(v52 v52Var) {
        v52 v52Var2 = this.rememberJob;
        if (v52Var2 != null) {
            v52Var2.e(null);
        }
        this.rememberJob = v52Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State toState(ImageResult imageResult) {
        if (imageResult instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) imageResult;
            return new State.Success(ImagePainter_androidKt.m53asPainter55t9rM(successResult.getImage(), successResult.getRequest().getContext(), this.filterQuality), successResult);
        }
        if (!(imageResult instanceof ErrorResult)) {
            s83.v();
            return null;
        }
        ErrorResult errorResult = (ErrorResult) imageResult;
        Image image = errorResult.getImage();
        return new State.Error(image != null ? ImagePainter_androidKt.m53asPainter55t9rM(image, errorResult.getRequest().getContext(), this.filterQuality) : null, errorResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageRequest updateRequest(final ImageRequest imageRequest, boolean z) {
        SizeResolver sizeResolver = imageRequest.getSizeResolver();
        if (sizeResolver instanceof DrawScopeSizeResolver) {
            ((DrawScopeSizeResolver) sizeResolver).connect(lazyDrawSizeFlow());
        }
        ImageRequest.Builder target = ImageRequest.newBuilder$default(imageRequest, null, 1, null).target(new Target() { // from class: coil3.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
            
                r0 = r2.getPainter();
             */
            @Override // coil3.target.Target
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onStart(coil3.Image r3) {
                /*
                    r2 = this;
                    if (r3 == 0) goto L13
                    coil3.request.ImageRequest r0 = coil3.request.ImageRequest.this
                    android.content.Context r0 = r0.getContext()
                    coil3.compose.AsyncImagePainter r1 = r2
                    int r1 = r1.m42getFilterQualityfv9h1I$io_coil_kt_coil3_coil_compose_core()
                    rj3 r3 = coil3.compose.ImagePainter_androidKt.m53asPainter55t9rM(r3, r0, r1)
                    goto L14
                L13:
                    r3 = 0
                L14:
                    if (r3 != 0) goto L27
                    coil3.request.ImageRequest r0 = coil3.request.ImageRequest.this
                    boolean r0 = coil3.compose.ImageRequestsKt.getUseExistingImageAsPlaceholder(r0)
                    if (r0 == 0) goto L27
                    coil3.compose.AsyncImagePainter r0 = r2
                    rj3 r0 = coil3.compose.AsyncImagePainter.access$getPainter(r0)
                    if (r0 == 0) goto L27
                    r3 = r0
                L27:
                    coil3.compose.AsyncImagePainter r2 = r2
                    coil3.compose.AsyncImagePainter$State$Loading r0 = new coil3.compose.AsyncImagePainter$State$Loading
                    r0.<init>(r3)
                    coil3.compose.AsyncImagePainter.access$updateState(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1.onStart(coil3.Image):void");
            }

            @Override // coil3.target.Target
            public void onError(Image image) {
            }

            @Override // coil3.target.Target
            public void onSuccess(Image image) {
            }
        });
        if (imageRequest.getDefined().getSizeResolver() == null) {
            target.size(SizeResolver.ORIGINAL);
        }
        if (imageRequest.getDefined().getScale() == null) {
            target.scale(UtilsKt.toScale(this.contentScale));
        }
        if (imageRequest.getDefined().getPrecision() == null) {
            target.precision(Precision.INEXACT);
        }
        if (z) {
            target.coroutineContext(l91.I);
        }
        return target.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(State state) {
        State state2 = (State) ((fw4) this.stateFlow).getValue();
        State state3 = (State) this.transform.invoke(state);
        ((fw4) this.stateFlow).h(state3);
        rj3 maybeNewCrossfadePainter = AsyncImagePainter_androidKt.maybeNewCrossfadePainter(state2, state3, this.contentScale);
        if (maybeNewCrossfadePainter == null) {
            maybeNewCrossfadePainter = state3.getPainter();
        }
        setPainter(maybeNewCrossfadePainter);
        if (state2.getPainter() != state3.getPainter()) {
            Object painter = state2.getPainter();
            k34 k34Var = painter instanceof k34 ? (k34) painter : null;
            if (k34Var != null) {
                k34Var.onForgotten();
            }
            Object painter2 = state3.getPainter();
            k34 k34Var2 = painter2 instanceof k34 ? (k34) painter2 : null;
            if (k34Var2 != null) {
                k34Var2.onRemembered();
            }
        }
        tm1 tm1Var = this.onState;
        if (tm1Var != null) {
            tm1Var.invoke(state3);
        }
    }

    @Override // defpackage.rj3
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // defpackage.rj3
    public boolean applyColorFilter(c80 c80Var) {
        this.colorFilter = c80Var;
        return true;
    }

    public final ni0 getContentScale$io_coil_kt_coil3_coil_compose_core() {
        return this.contentScale;
    }

    /* renamed from: getFilterQuality-f-v9h1I$io_coil_kt_coil3_coil_compose_core, reason: not valid java name */
    public final int m42getFilterQualityfv9h1I$io_coil_kt_coil3_coil_compose_core() {
        return this.filterQuality;
    }

    public final dw4 getInput() {
        return this.input;
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo43getIntrinsicSizeNHjbRc() {
        rj3 painter = getPainter();
        if (painter != null) {
            return painter.mo43getIntrinsicSizeNHjbRc();
        }
        return 9205357640488583168L;
    }

    public final tm1 getOnState$io_coil_kt_coil3_coil_compose_core() {
        return this.onState;
    }

    public final AsyncImagePreviewHandler getPreviewHandler$io_coil_kt_coil3_coil_compose_core() {
        return this.previewHandler;
    }

    public final dl0 getScope$io_coil_kt_coil3_coil_compose_core() {
        dl0 dl0Var = this.scope;
        if (dl0Var != null) {
            return dl0Var;
        }
        j42.g0("scope");
        throw null;
    }

    public final dw4 getState() {
        return this.state;
    }

    public final tm1 getTransform$io_coil_kt_coil3_coil_compose_core() {
        return this.transform;
    }

    public final Input get_input$io_coil_kt_coil3_coil_compose_core() {
        return this._input;
    }

    @Override // defpackage.k34
    public void onAbandoned() {
        setRememberJob(null);
        Object painter = getPainter();
        k34 k34Var = painter instanceof k34 ? (k34) painter : null;
        if (k34Var != null) {
            k34Var.onAbandoned();
        }
        this.isRemembered = false;
    }

    @Override // defpackage.rj3
    public void onDraw(y31 y31Var) {
        m41setDrawSizeuvyYCjk(y31Var.c());
        rj3 painter = getPainter();
        if (painter != null) {
            painter.m367drawx_KDEd0(y31Var, y31Var.c(), this.alpha, this.colorFilter);
        }
    }

    @Override // defpackage.k34
    public void onForgotten() {
        setRememberJob(null);
        Object painter = getPainter();
        k34 k34Var = painter instanceof k34 ? (k34) painter : null;
        if (k34Var != null) {
            k34Var.onForgotten();
        }
        this.isRemembered = false;
    }

    @Override // defpackage.k34
    public void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object painter = getPainter();
            k34 k34Var = painter instanceof k34 ? (k34) painter : null;
            if (k34Var != null) {
                k34Var.onRemembered();
            }
            launchJob();
            this.isRemembered = true;
        } finally {
            Trace.endSection();
        }
    }

    public final void restart() {
        if (this._input == null) {
            setRememberJob(null);
        } else if (this.isRemembered) {
            launchJob();
        }
    }

    public final void setContentScale$io_coil_kt_coil3_coil_compose_core(ni0 ni0Var) {
        this.contentScale = ni0Var;
    }

    /* renamed from: setFilterQuality-vDHp3xo$io_coil_kt_coil3_coil_compose_core, reason: not valid java name */
    public final void m44setFilterQualityvDHp3xo$io_coil_kt_coil3_coil_compose_core(int i) {
        this.filterQuality = i;
    }

    public final void setOnState$io_coil_kt_coil3_coil_compose_core(tm1 tm1Var) {
        this.onState = tm1Var;
    }

    public final void setPreviewHandler$io_coil_kt_coil3_coil_compose_core(AsyncImagePreviewHandler asyncImagePreviewHandler) {
        this.previewHandler = asyncImagePreviewHandler;
    }

    public final void setScope$io_coil_kt_coil3_coil_compose_core(dl0 dl0Var) {
        this.scope = dl0Var;
    }

    public final void setTransform$io_coil_kt_coil3_coil_compose_core(tm1 tm1Var) {
        this.transform = tm1Var;
    }

    public final void set_input$io_coil_kt_coil3_coil_compose_core(Input input) {
        if (j42.c(this._input, input)) {
            return;
        }
        this._input = input;
        restart();
        if (input != null) {
            fw4 fw4Var = (fw4) this.inputFlow;
            fw4Var.getClass();
            fw4Var.i(null, input);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final tm1 getDefaultTransform() {
            return AsyncImagePainter.DefaultTransform;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State DefaultTransform$lambda$0(State state) {
        return state;
    }
}
