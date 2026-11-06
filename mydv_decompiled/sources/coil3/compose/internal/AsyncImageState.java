package coil3.compose.internal;

import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AsyncImageState {
    public static final int $stable = 0;
    private final ImageLoader imageLoader;
    private final Object model;
    private final AsyncImageModelEqualityDelegate modelEqualityDelegate;

    public AsyncImageState(Object obj, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, ImageLoader imageLoader) {
        this.model = obj;
        this.modelEqualityDelegate = asyncImageModelEqualityDelegate;
        this.imageLoader = imageLoader;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImageState)) {
            return false;
        }
        AsyncImageState asyncImageState = (AsyncImageState) obj;
        return j42.c(this.modelEqualityDelegate, asyncImageState.modelEqualityDelegate) && this.modelEqualityDelegate.equals(this.model, asyncImageState.model) && j42.c(this.imageLoader, asyncImageState.imageLoader);
    }

    public final ImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final Object getModel() {
        return this.model;
    }

    public final AsyncImageModelEqualityDelegate getModelEqualityDelegate() {
        return this.modelEqualityDelegate;
    }

    public int hashCode() {
        return this.imageLoader.hashCode() + ((this.modelEqualityDelegate.hashCode(this.model) + (this.modelEqualityDelegate.hashCode() * 31)) * 31);
    }
}
