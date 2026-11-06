package coil3.compose;

import android.os.Trace;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.UtilsKt;
import coil3.request.ImageRequest;
import defpackage.de0;
import defpackage.dl0;
import defpackage.fe0;
import defpackage.go1;
import defpackage.jp;
import defpackage.li0;
import defpackage.mw2;
import defpackage.ni0;
import defpackage.rj3;
import defpackage.tm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AsyncImagePainterKt {
    /* renamed from: rememberAsyncImagePainter-3HmZ8SU, reason: not valid java name */
    public static final AsyncImagePainter m45rememberAsyncImagePainter3HmZ8SU(Object obj, ImageLoader imageLoader, rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, ni0 ni0Var, int i, fe0 fe0Var, int i2, int i3) {
        if ((i3 & 4) != 0) {
            rj3Var = null;
        }
        if ((i3 & 8) != 0) {
            rj3Var2 = null;
        }
        if ((i3 & 16) != 0) {
            rj3Var3 = rj3Var2;
        }
        go1 go1Var = (go1) fe0Var;
        return m47rememberAsyncImagePainterGSdzBsE(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), UtilsKt.transformOf(rj3Var, rj3Var2, rj3Var3), UtilsKt.onStateOf((i3 & 32) != 0 ? null : tm1Var, (i3 & 64) != 0 ? null : tm1Var2, (i3 & 128) == 0 ? tm1Var3 : null), (i3 & 256) != 0 ? li0.b : ni0Var, (i3 & 512) != 0 ? 1 : i, go1Var, (i2 >> 15) & 64512);
    }

    /* renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final AsyncImagePainter m46rememberAsyncImagePainter5jETZwI(Object obj, ImageLoader imageLoader, tm1 tm1Var, tm1 tm1Var2, ni0 ni0Var, int i, fe0 fe0Var, int i2, int i3) {
        if ((i3 & 4) != 0) {
            tm1Var = AsyncImagePainter.Companion.getDefaultTransform();
        }
        tm1 tm1Var3 = tm1Var;
        if ((i3 & 8) != 0) {
            tm1Var2 = null;
        }
        tm1 tm1Var4 = tm1Var2;
        if ((i3 & 16) != 0) {
            ni0Var = li0.b;
        }
        ni0 ni0Var2 = ni0Var;
        if ((i3 & 32) != 0) {
            i = 1;
        }
        go1 go1Var = (go1) fe0Var;
        return m47rememberAsyncImagePainterGSdzBsE(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), tm1Var3, tm1Var4, ni0Var2, i, go1Var, (i2 >> 3) & 65520);
    }

    /* renamed from: rememberAsyncImagePainter-GSdzBsE, reason: not valid java name */
    private static final AsyncImagePainter m47rememberAsyncImagePainterGSdzBsE(AsyncImageState asyncImageState, tm1 tm1Var, tm1 tm1Var2, ni0 ni0Var, int i, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            ImageRequest requestOf = UtilsKt.requestOf(asyncImageState.getModel(), go1Var, 0);
            UtilsKt.validateRequest(requestOf);
            AsyncImagePainter.Input input = new AsyncImagePainter.Input(asyncImageState.getImageLoader(), requestOf, asyncImageState.getModelEqualityDelegate());
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new AsyncImagePainter(input);
                go1Var.o0(Q);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = mw2.w(go1Var);
                go1Var.o0(Q2);
            }
            asyncImagePainter.setScope$io_coil_kt_coil3_coil_compose_core((dl0) Q2);
            asyncImagePainter.setTransform$io_coil_kt_coil3_coil_compose_core(tm1Var);
            asyncImagePainter.setOnState$io_coil_kt_coil3_coil_compose_core(tm1Var2);
            asyncImagePainter.setContentScale$io_coil_kt_coil3_coil_compose_core(ni0Var);
            asyncImagePainter.m44setFilterQualityvDHp3xo$io_coil_kt_coil3_coil_compose_core(i);
            asyncImagePainter.setPreviewHandler$io_coil_kt_coil3_coil_compose_core(UtilsKt.previewHandler(go1Var, 0));
            asyncImagePainter.set_input$io_coil_kt_coil3_coil_compose_core(input);
            go1Var.q(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }
}
