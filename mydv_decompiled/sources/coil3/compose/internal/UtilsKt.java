package coil3.compose.internal;

import android.content.Context;
import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.LocalAsyncImageModelEqualityDelegateKt;
import coil3.compose.LocalAsyncImagePreviewHandlerKt;
import coil3.request.ImageRequest;
import coil3.request.NullRequestDataException;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeResolver;
import defpackage.de0;
import defpackage.dh0;
import defpackage.eh0;
import defpackage.fe0;
import defpackage.go1;
import defpackage.hx1;
import defpackage.j42;
import defpackage.jp;
import defpackage.li0;
import defpackage.m6;
import defpackage.mw2;
import defpackage.ni0;
import defpackage.q8;
import defpackage.r7;
import defpackage.rb;
import defpackage.rj3;
import defpackage.rk0;
import defpackage.rm1;
import defpackage.s83;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.tw1;
import defpackage.ug5;
import defpackage.uw2;
import defpackage.vk0;
import defpackage.wd5;
import defpackage.x12;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final uw2 UseMinConstraintsMeasurePolicy = UtilsKt$UseMinConstraintsMeasurePolicy$1.INSTANCE;
    private static final long ZeroConstraints = eh0.b(0, 0, 0, 0, 5);

    public static final AsyncImageState AsyncImageState(Object obj, ImageLoader imageLoader, fe0 fe0Var, int i) {
        return new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) ((go1) fe0Var).k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader);
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m69constrainHeightK40F9xA(long j, float f) {
        float i = dh0.i(j);
        float g = dh0.g(j);
        if (f < i) {
            f = i;
        }
        return f > g ? g : f;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m70constrainWidthK40F9xA(long j, float f) {
        float j2 = dh0.j(j);
        float h = dh0.h(j);
        if (f < j2) {
            f = j2;
        }
        return f > h ? h : f;
    }

    public static final vk0 getDispatcher(tk0 tk0Var) {
        rk0 rk0Var = tk0Var.get(q8.i0);
        if (rk0Var instanceof vk0) {
            return (vk0) rk0Var;
        }
        return null;
    }

    public static final uw2 getUseMinConstraintsMeasurePolicy() {
        return UseMinConstraintsMeasurePolicy;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    /* renamed from: isPositive-uvyYCjk, reason: not valid java name */
    public static final boolean m71isPositiveuvyYCjk(long j) {
        return ((double) Float.intBitsToFloat((int) (j >> 32))) >= 0.5d && ((double) Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5d;
    }

    public static final tm1 onStateOf(tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3) {
        if (tm1Var == null && tm1Var2 == null && tm1Var3 == null) {
            return null;
        }
        return new ug5(tm1Var, tm1Var2, tm1Var3, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 onStateOf$lambda$0(tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            if (tm1Var != null) {
                tm1Var.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Success) {
            if (tm1Var2 != null) {
                tm1Var2.invoke(state);
            }
        } else if (state instanceof AsyncImagePainter.State.Error) {
            if (tm1Var3 != null) {
                tm1Var3.invoke(state);
            }
        } else if (!(state instanceof AsyncImagePainter.State.Empty)) {
            s83.v();
            return null;
        }
        return wd5.a;
    }

    public static final AsyncImagePreviewHandler previewHandler(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (!((Boolean) go1Var.k(x12.a)).booleanValue()) {
            go1Var.d0(2019088453);
            go1Var.q(false);
            return null;
        }
        go1Var.d0(2019030948);
        AsyncImagePreviewHandler asyncImagePreviewHandler = (AsyncImagePreviewHandler) go1Var.k(LocalAsyncImagePreviewHandlerKt.getLocalAsyncImagePreviewHandler());
        go1Var.q(false);
        return asyncImagePreviewHandler;
    }

    private static final SizeResolver rememberSizeResolver(ni0 ni0Var, fe0 fe0Var, int i) {
        boolean c = j42.c(ni0Var, li0.d);
        go1 go1Var = (go1) fe0Var;
        boolean h = go1Var.h(c);
        Object Q = go1Var.Q();
        if (h || Q == de0.a) {
            Q = c ? SizeResolver.ORIGINAL : new ConstraintsSizeResolver();
            go1Var.o0(Q);
        }
        return (SizeResolver) Q;
    }

    public static final ImageRequest requestOf(Object obj, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(1319639034);
        if (obj instanceof ImageRequest) {
            go1Var.d0(1530875884);
            ImageRequest imageRequest = (ImageRequest) obj;
            go1Var.q(false);
            go1Var.q(false);
            return imageRequest;
        }
        go1Var.d0(1530915130);
        Context context = (Context) go1Var.k(rb.b);
        boolean g = go1Var.g(context) | go1Var.g(obj);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new ImageRequest.Builder(context).data(obj).build();
            go1Var.o0(Q);
        }
        ImageRequest imageRequest2 = (ImageRequest) Q;
        go1Var.q(false);
        go1Var.q(false);
        return imageRequest2;
    }

    public static final ImageRequest requestOfWithSizeResolver(Object obj, ni0 ni0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-329318062);
        boolean z = obj instanceof ImageRequest;
        jp jpVar = de0.a;
        if (!z) {
            go1Var.d0(-1008595950);
            Context context = (Context) go1Var.k(rb.b);
            SizeResolver rememberSizeResolver = rememberSizeResolver(ni0Var, go1Var, (i >> 3) & 14);
            boolean g = go1Var.g(context) | go1Var.g(obj) | go1Var.g(rememberSizeResolver);
            Object Q = go1Var.Q();
            if (g || Q == jpVar) {
                Q = new ImageRequest.Builder(context).data(obj).size(rememberSizeResolver).build();
                go1Var.o0(Q);
            }
            ImageRequest imageRequest = (ImageRequest) Q;
            go1Var.q(false);
            go1Var.q(false);
            return imageRequest;
        }
        go1Var.d0(-1008942344);
        ImageRequest imageRequest2 = (ImageRequest) obj;
        if (imageRequest2.getDefined().getSizeResolver() != null) {
            go1Var.d0(-1008902292);
            go1Var.q(false);
            go1Var.q(false);
            go1Var.q(false);
            return imageRequest2;
        }
        go1Var.d0(-1008854118);
        SizeResolver rememberSizeResolver2 = rememberSizeResolver(ni0Var, go1Var, (i >> 3) & 14);
        boolean g2 = ((((i & 14) ^ 6) > 4 && go1Var.g(obj)) || (i & 6) == 4) | go1Var.g(rememberSizeResolver2);
        Object Q2 = go1Var.Q();
        if (g2 || Q2 == jpVar) {
            Q2 = ImageRequest.newBuilder$default(imageRequest2, null, 1, null).size(rememberSizeResolver2).build();
            go1Var.o0(Q2);
        }
        ImageRequest imageRequest3 = (ImageRequest) Q2;
        r7.J(go1Var, false, false, false);
        return imageRequest3;
    }

    public static final float takeOrElse(float f, rm1 rm1Var) {
        return Math.abs(f) <= Float.MAX_VALUE ? f : ((Number) rm1Var.invoke()).floatValue();
    }

    private static final Dimension toDimension(float f) {
        return Math.abs(f) <= Float.MAX_VALUE ? Dimension.Pixels.m110boximpl(DimensionKt.Dimension(mw2.P(f))) : Dimension.Undefined.INSTANCE;
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m72toIntSizeuvyYCjk(long j) {
        return (mw2.P(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (mw2.P(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final Scale toScale(ni0 ni0Var) {
        return (j42.c(ni0Var, li0.b) || j42.c(ni0Var, li0.c)) ? Scale.FIT : Scale.FILL;
    }

    /* renamed from: toSize-BRTryo0, reason: not valid java name */
    public static final Size m73toSizeBRTryo0(long j) {
        return new Size(toDimension(dh0.h(j)), toDimension(dh0.g(j)));
    }

    /* renamed from: toSizeOrNull-uvyYCjk, reason: not valid java name */
    public static final Size m74toSizeOrNulluvyYCjk(long j) {
        if (j == 9205357640488583168L) {
            return Size.ORIGINAL;
        }
        if (m71isPositiveuvyYCjk(j)) {
            return new Size(toDimension(Float.intBitsToFloat((int) (j >> 32))), toDimension(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return null;
    }

    public static final tm1 transformOf(rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3) {
        return (rj3Var == null && rj3Var2 == null && rj3Var3 == null) ? AsyncImagePainter.Companion.getDefaultTransform() : new m6((Object) rj3Var, (Object) rj3Var3, (Object) rj3Var2, (byte) 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncImagePainter.State transformOf$lambda$0(rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3, AsyncImagePainter.State state) {
        if (state instanceof AsyncImagePainter.State.Loading) {
            AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
            return rj3Var != null ? loading.copy(rj3Var) : loading;
        }
        boolean z = state instanceof AsyncImagePainter.State.Error;
        AsyncImagePainter.State state2 = state;
        if (z) {
            AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
            boolean z2 = error.getResult().getThrowable() instanceof NullRequestDataException;
            state2 = error;
            state2 = error;
            if (z2) {
                if (rj3Var2 != null) {
                    return AsyncImagePainter.State.Error.copy$default(error, rj3Var2, null, 2, null);
                }
            } else if (rj3Var3 != null) {
                return AsyncImagePainter.State.Error.copy$default(error, rj3Var3, null, 2, null);
            }
        }
        return state2;
    }

    private static final Void unsupportedData(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void unsupportedData$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = r7.C("If you wish to display this ", str, ", use androidx.compose.foundation.Image.");
        }
        return unsupportedData(str, str2);
    }

    public static final void validateRequest(ImageRequest imageRequest) {
        Object data = imageRequest.getData();
        if (data instanceof ImageRequest.Builder) {
            unsupportedData("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            zy.n();
            return;
        }
        if (data instanceof tw1) {
            unsupportedData$default("ImageBitmap", null, 2, null);
            zy.n();
        } else if (data instanceof hx1) {
            unsupportedData$default("ImageVector", null, 2, null);
            zy.n();
        } else if (!(data instanceof rj3)) {
            Utils_androidKt.validateRequestProperties(imageRequest);
        } else {
            unsupportedData$default("Painter", null, 2, null);
            zy.n();
        }
    }

    private static final Dimension toDimension(int i) {
        return i != Integer.MAX_VALUE ? Dimension.Pixels.m110boximpl(DimensionKt.Dimension(i)) : Dimension.Undefined.INSTANCE;
    }
}
