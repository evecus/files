package coil3.compose;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import defpackage.dn1;
import defpackage.j42;
import defpackage.qn1;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0 implements SingletonImageLoader.Factory, qn1 {
    private final /* synthetic */ tm1 function;

    public SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0(tm1 tm1Var) {
        this.function = tm1Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SingletonImageLoader.Factory) && (obj instanceof qn1)) {
            return j42.c(getFunctionDelegate(), ((qn1) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.qn1
    public final dn1 getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // coil3.SingletonImageLoader.Factory
    public final /* synthetic */ ImageLoader newImageLoader(Context context) {
        return (ImageLoader) this.function.invoke(context);
    }
}
