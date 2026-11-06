package coil3.intercept;

import coil3.EventListener;
import coil3.intercept.Interceptor;
import coil3.request.ImageRequest;
import coil3.request.NullRequestData;
import coil3.size.Size;
import defpackage.zy;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final EventListener eventListener;
    private final int index;
    private final ImageRequest initialRequest;
    private final List<Interceptor> interceptors;
    private final boolean isPlaceholderCached;
    private final ImageRequest request;
    private final Size size;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(ImageRequest imageRequest, List<? extends Interceptor> list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = eventListener;
        this.isPlaceholderCached = z;
    }

    private final void checkRequest(ImageRequest imageRequest, Interceptor interceptor) {
        if (imageRequest.getContext() != this.initialRequest.getContext()) {
            zy.g(interceptor, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (imageRequest.getData() == NullRequestData.INSTANCE) {
            zy.g(interceptor, "' cannot set the request's data to null.", "Interceptor '");
        } else if (imageRequest.getTarget() != this.initialRequest.getTarget()) {
            zy.g(interceptor, "' cannot modify the request's target.", "Interceptor '");
        } else {
            if (imageRequest.getSizeResolver() == this.initialRequest.getSizeResolver()) {
                return;
            }
            zy.g(interceptor, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    private final RealInterceptorChain copy(int i, ImageRequest imageRequest, Size size) {
        return new RealInterceptorChain(this.initialRequest, this.interceptors, i, imageRequest, size, this.eventListener, this.isPlaceholderCached);
    }

    public static /* synthetic */ RealInterceptorChain copy$default(RealInterceptorChain realInterceptorChain, int i, ImageRequest imageRequest, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.copy(i, imageRequest, size);
    }

    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final int getIndex() {
        return this.index;
    }

    public final ImageRequest getInitialRequest() {
        return this.initialRequest;
    }

    public final List<Interceptor> getInterceptors() {
        return this.interceptors;
    }

    @Override // coil3.intercept.Interceptor.Chain
    public ImageRequest getRequest() {
        return this.request;
    }

    @Override // coil3.intercept.Interceptor.Chain
    public Size getSize() {
        return this.size;
    }

    public final boolean isPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // coil3.intercept.Interceptor.Chain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object proceed(defpackage.fj0 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r11
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            coil3.intercept.RealInterceptorChain r1 = (coil3.intercept.RealInterceptorChain) r1
            java.lang.Object r0 = r0.L$0
            coil3.intercept.Interceptor r0 = (coil3.intercept.Interceptor) r0
            defpackage.mu0.V(r11)
            r4 = r10
            goto L60
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r2
        L35:
            defpackage.mu0.V(r11)
            java.util.List<coil3.intercept.Interceptor> r11 = r10.interceptors
            int r1 = r10.index
            java.lang.Object r11 = r11.get(r1)
            coil3.intercept.Interceptor r11 = (coil3.intercept.Interceptor) r11
            int r1 = r10.index
            int r5 = r1 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r10
            coil3.intercept.RealInterceptorChain r10 = copy$default(r4, r5, r6, r7, r8, r9)
            r0.L$0 = r11
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = r11.intercept(r10, r0)
            el0 r0 = defpackage.el0.I
            if (r10 != r0) goto L5e
            return r0
        L5e:
            r0 = r11
            r11 = r10
        L60:
            coil3.request.ImageResult r11 = (coil3.request.ImageResult) r11
            coil3.request.ImageRequest r10 = r11.getRequest()
            r4.checkRequest(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.proceed(fj0):java.lang.Object");
    }

    @Override // coil3.intercept.Interceptor.Chain
    public Interceptor.Chain withRequest(ImageRequest imageRequest) {
        int i = this.index;
        if (i > 0) {
            checkRequest(imageRequest, this.interceptors.get(i - 1));
        }
        return copy$default(this, 0, imageRequest, null, 5, null);
    }

    @Override // coil3.intercept.Interceptor.Chain
    public Interceptor.Chain withSize(Size size) {
        return copy$default(this, 0, null, size, 3, null);
    }
}
