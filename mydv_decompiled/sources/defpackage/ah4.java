package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import coil3.BitmapImage;
import coil3.Image;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ah4 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ Context L;
    public final /* synthetic */ String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah4(t43 t43Var, Context context, String str, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = t43Var;
        this.L = context;
        this.M = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        ah4 ah4Var = new ah4(this.K, this.L, this.M, fj0Var);
        ah4Var.J = obj;
        return ah4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ah4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object g54Var;
        boolean z = this.I;
        t43 t43Var = this.K;
        try {
            if (!z) {
                mu0.V(obj);
                t43Var.setValue(null);
                Context context = this.L;
                String str = this.M;
                ImageLoader imageLoader = SingletonImageLoader.get(context);
                ImageRequest build = new ImageRequest.Builder(context).data(str).size(1200).build();
                this.J = null;
                this.I = true;
                obj = imageLoader.execute(build, this);
                el0 el0Var = el0.I;
                if (obj == el0Var) {
                    return el0Var;
                }
            } else {
                if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
            }
            Image image = ((ImageResult) obj).getImage();
            BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
            g54Var = bitmapImage != null ? bitmapImage.getBitmap() : null;
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        Bitmap bitmap = (Bitmap) (g54Var instanceof g54 ? null : g54Var);
        if (bitmap != null) {
            t43Var.setValue(bitmap);
        }
        return wd5.a;
    }
}
