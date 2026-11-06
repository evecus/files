package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import coil3.BitmapImage;
import coil3.Image;
import coil3.ImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r81 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ String K;
    public final /* synthetic */ Context L;
    public final /* synthetic */ ImageLoader M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(String str, Context context, ImageLoader imageLoader, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = str;
        this.L = context;
        this.M = imageLoader;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        r81 r81Var = new r81(this.K, this.L, this.M, fj0Var);
        r81Var.J = obj;
        return r81Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((r81) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object g54Var;
        boolean z = this.I;
        String str = this.K;
        try {
            if (!z) {
                mu0.V(obj);
                Context context = this.L;
                ImageLoader imageLoader = this.M;
                ImageRequest build = new ImageRequest.Builder(context).data(str).build();
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
        if (g54Var instanceof g54) {
            g54Var = null;
        }
        Bitmap bitmap = (Bitmap) g54Var;
        if (bitmap != null) {
            t81.d.put(str, bitmap);
            fw4 fw4Var = t81.f;
            Integer num = new Integer(((Number) fw4Var.getValue()).intValue() + 1);
            fw4Var.getClass();
            fw4Var.i(null, num);
        }
        t81.e.remove(str);
        return wd5.a;
    }
}
