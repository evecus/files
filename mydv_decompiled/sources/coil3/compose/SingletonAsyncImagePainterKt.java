package coil3.compose;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import defpackage.fe0;
import defpackage.go1;
import defpackage.li0;
import defpackage.ni0;
import defpackage.rb;
import defpackage.rj3;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SingletonAsyncImagePainterKt {
    /* renamed from: rememberAsyncImagePainter-19ie5dc, reason: not valid java name */
    public static final AsyncImagePainter m57rememberAsyncImagePainter19ie5dc(Object obj, tm1 tm1Var, tm1 tm1Var2, ni0 ni0Var, int i, fe0 fe0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            tm1Var = AsyncImagePainter.Companion.getDefaultTransform();
        }
        tm1 tm1Var3 = tm1Var;
        if ((i3 & 4) != 0) {
            tm1Var2 = null;
        }
        tm1 tm1Var4 = tm1Var2;
        if ((i3 & 8) != 0) {
            ni0Var = li0.b;
        }
        ni0 ni0Var2 = ni0Var;
        if ((i3 & 16) != 0) {
            i = 1;
        }
        go1 go1Var = (go1) fe0Var;
        int i4 = i2 << 3;
        return AsyncImagePainterKt.m46rememberAsyncImagePainter5jETZwI(obj, SingletonImageLoader.get((Context) go1Var.k(rb.b)), tm1Var3, tm1Var4, ni0Var2, i, go1Var, (i2 & 14) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
    }

    /* renamed from: rememberAsyncImagePainter-MqR-F_0, reason: not valid java name */
    public static final AsyncImagePainter m58rememberAsyncImagePainterMqRF_0(Object obj, rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, ni0 ni0Var, int i, fe0 fe0Var, int i2, int i3) {
        rj3 rj3Var4 = (i3 & 2) != 0 ? null : rj3Var;
        rj3 rj3Var5 = (i3 & 4) != 0 ? null : rj3Var2;
        rj3 rj3Var6 = (i3 & 8) != 0 ? rj3Var5 : rj3Var3;
        tm1 tm1Var4 = (i3 & 16) != 0 ? null : tm1Var;
        tm1 tm1Var5 = (i3 & 32) != 0 ? null : tm1Var2;
        tm1 tm1Var6 = (i3 & 64) != 0 ? null : tm1Var3;
        ni0 ni0Var2 = (i3 & 128) != 0 ? li0.b : ni0Var;
        int i4 = (i3 & 256) != 0 ? 1 : i;
        go1 go1Var = (go1) fe0Var;
        ImageLoader imageLoader = SingletonImageLoader.get((Context) go1Var.k(rb.b));
        int i5 = rj3.$stable;
        int i6 = i2 << 3;
        return AsyncImagePainterKt.m45rememberAsyncImagePainter3HmZ8SU(obj, imageLoader, rj3Var4, rj3Var5, rj3Var6, tm1Var4, tm1Var5, tm1Var6, ni0Var2, i4, go1Var, (i2 & 14) | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (i5 << 12) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (1879048192 & i6), 0);
    }
}
