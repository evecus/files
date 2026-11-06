package coil3;

import android.content.Context;
import defpackage.nt3;
import defpackage.tm1;
import defpackage.zy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SingletonImageLoader {
    public static final SingletonImageLoader INSTANCE = new SingletonImageLoader();
    private static final /* synthetic */ AtomicReference reference = new AtomicReference(null);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        ImageLoader newImageLoader(Context context);
    }

    private SingletonImageLoader() {
    }

    public static final ImageLoader get(Context context) {
        SingletonImageLoader singletonImageLoader = INSTANCE;
        Object obj = singletonImageLoader.getReference().get();
        ImageLoader imageLoader = obj instanceof ImageLoader ? (ImageLoader) obj : null;
        return imageLoader == null ? singletonImageLoader.newImageLoader(context) : imageLoader;
    }

    private final /* synthetic */ AtomicReference getReference() {
        return reference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ImageLoader newImageLoader(Context context) {
        ImageLoader imageLoader;
        Factory factory;
        ImageLoader newImageLoader;
        AtomicReference reference2 = getReference();
        ImageLoader imageLoader2 = null;
        while (true) {
            Object obj = reference2.get();
            if (obj instanceof ImageLoader) {
                imageLoader = imageLoader2;
                imageLoader2 = (ImageLoader) obj;
            } else {
                if (imageLoader2 == null) {
                    Context applicationContext = SingletonImageLoader_androidKt.applicationContext(context);
                    Factory factory2 = obj instanceof Factory ? (Factory) obj : null;
                    if (factory2 == null || (newImageLoader = factory2.newImageLoader(applicationContext)) == null) {
                        Factory factory3 = applicationContext instanceof Factory ? (Factory) applicationContext : null;
                        if (factory3 != null) {
                            imageLoader2 = factory3.newImageLoader(applicationContext);
                        } else {
                            factory = SingletonImageLoaderKt.DefaultSingletonImageLoaderFactory;
                            imageLoader2 = factory.newImageLoader(applicationContext);
                        }
                    } else {
                        imageLoader2 = newImageLoader;
                    }
                }
                imageLoader = imageLoader2;
            }
            while (!reference2.compareAndSet(obj, imageLoader2)) {
                if (reference2.get() != obj) {
                    break;
                }
            }
            imageLoader2.getClass();
            return imageLoader2;
            imageLoader2 = imageLoader;
        }
    }

    public static final void reset() {
        INSTANCE.getReference().set(null);
    }

    public static final void setSafe(Factory factory) {
        boolean isDefault;
        SingletonImageLoader singletonImageLoader = INSTANCE;
        Object obj = singletonImageLoader.getReference().get();
        if (!(obj instanceof ImageLoader)) {
            nt3.p(singletonImageLoader.getReference(), obj, factory);
            return;
        }
        isDefault = SingletonImageLoaderKt.isDefault((ImageLoader) obj);
        if (isDefault) {
            zy.i("The singleton image loader has already been created. This indicates that 'setSafe' is being called after the first 'get' call. Ensure that 'setSafe' is called before any Coil API usages (e.g. `load`, `AsyncImage`, `rememberAsyncImagePainter`, etc.).");
        }
    }

    public static final void setUnsafe(ImageLoader imageLoader) {
        INSTANCE.getReference().set(imageLoader);
    }

    private final /* synthetic */ Object updateAndGet$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, tm1 tm1Var) {
        Object obj;
        Object invoke;
        do {
            obj = atomicReference.get();
            invoke = tm1Var.invoke(obj);
        } while (!nt3.t(atomicReference, obj, invoke));
        return invoke;
    }

    public static final void setUnsafe(Factory factory) {
        INSTANCE.getReference().set(factory);
    }
}
