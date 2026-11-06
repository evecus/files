package coil3.compose;

import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.ImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.ContentPainterElement;
import coil3.compose.internal.UtilsKt;
import coil3.request.ImageRequest;
import defpackage.am3;
import defpackage.c80;
import defpackage.fe0;
import defpackage.go1;
import defpackage.hn1;
import defpackage.i13;
import defpackage.i42;
import defpackage.l13;
import defpackage.li0;
import defpackage.mu0;
import defpackage.ni0;
import defpackage.q8;
import defpackage.qi4;
import defpackage.rj3;
import defpackage.tm1;
import defpackage.u8;
import defpackage.uw2;
import defpackage.wa2;
import defpackage.wd5;
import defpackage.x04;
import defpackage.xd0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AsyncImageKt {
    /* renamed from: AsyncImage-76YX9Dk, reason: not valid java name */
    private static final void m38AsyncImage76YX9Dk(final AsyncImageState asyncImageState, final String str, final l13 l13Var, final tm1 tm1Var, final tm1 tm1Var2, final u8 u8Var, final ni0 ni0Var, final float f, final c80 c80Var, final int i, final boolean z, fe0 fe0Var, final int i2, final int i3) {
        int i4;
        String str2;
        tm1 tm1Var3;
        tm1 tm1Var4;
        u8 u8Var2;
        int i5;
        boolean z2;
        int i6;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (go1Var.g(asyncImageState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= go1Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            tm1Var3 = tm1Var;
            i4 |= go1Var.i(tm1Var3) ? 2048 : 1024;
        } else {
            tm1Var3 = tm1Var;
        }
        if ((i2 & 24576) == 0) {
            tm1Var4 = tm1Var2;
            i4 |= go1Var.i(tm1Var4) ? 16384 : 8192;
        } else {
            tm1Var4 = tm1Var2;
        }
        if ((196608 & i2) == 0) {
            u8Var2 = u8Var;
            i4 |= go1Var.g(u8Var2) ? 131072 : 65536;
        } else {
            u8Var2 = u8Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= go1Var.g(ni0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= go1Var.d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= go1Var.g(c80Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= go1Var.e(i5) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (go1Var.h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (go1Var.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            ImageRequest requestOfWithSizeResolver = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), ni0Var, go1Var, (i4 >> 15) & 112);
            UtilsKt.validateRequest(requestOfWithSizeResolver);
            l13 then = l13Var.then(new ContentPainterElement(requestOfWithSizeResolver, asyncImageState.getImageLoader(), asyncImageState.getModelEqualityDelegate(), tm1Var3, tm1Var4, i5, u8Var2, ni0Var, f, c80Var, z2, UtilsKt.previewHandler(go1Var, 0), str2, null));
            uw2 useMinConstraintsMeasurePolicy = UtilsKt.getUseMinConstraintsMeasurePolicy();
            long j = go1Var.T;
            int i7 = (int) (j ^ (j >>> 32));
            l13 x0 = i42.x0(go1Var, then);
            am3 m = go1Var.m();
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, useMinConstraintsMeasurePolicy);
            qi4.k(go1Var, q8.b0, m);
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i7));
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: nq
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    wd5 AsyncImage_76YX9Dk$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    AsyncImage_76YX9Dk$lambda$0 = AsyncImageKt.AsyncImage_76YX9Dk$lambda$0(AsyncImageState.this, str, l13Var, tm1Var, tm1Var2, u8Var, ni0Var, f, c80Var, i, z, i2, i3, (fe0) obj, intValue);
                    return AsyncImage_76YX9Dk$lambda$0;
                }
            };
        }
    }

    /* renamed from: AsyncImage-nc27qi8, reason: not valid java name */
    public static final void m39AsyncImagenc27qi8(Object obj, String str, ImageLoader imageLoader, l13 l13Var, rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        l13 l13Var2 = (i4 & 8) != 0 ? i13.a : l13Var;
        rj3 rj3Var4 = (i4 & 16) != 0 ? null : rj3Var;
        rj3 rj3Var5 = (i4 & 32) != 0 ? null : rj3Var2;
        rj3 rj3Var6 = (i4 & 64) != 0 ? rj3Var5 : rj3Var3;
        tm1 tm1Var4 = (i4 & 128) != 0 ? null : tm1Var;
        tm1 tm1Var5 = (i4 & 256) != 0 ? null : tm1Var2;
        tm1 tm1Var6 = (i4 & 512) != 0 ? null : tm1Var3;
        l13 l13Var3 = l13Var2;
        go1 go1Var = (go1) fe0Var;
        int i5 = i3 << 15;
        m38AsyncImage76YX9Dk(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), str, l13Var3, UtilsKt.transformOf(rj3Var4, rj3Var5, rj3Var6), UtilsKt.onStateOf(tm1Var4, tm1Var5, tm1Var6), (i4 & 1024) != 0 ? q8.N : u8Var, (i4 & 2048) != 0 ? li0.b : ni0Var, (i4 & 4096) != 0 ? 1.0f : f, (i4 & 8192) == 0 ? c80Var : null, (i4 & 16384) != 0 ? 1 : i, (i4 & 32768) == 0 ? z : true, go1Var, ((i2 >> 3) & 896) | (i2 & 112) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & C.ENCODING_PCM_DOUBLE), (i3 >> 15) & 14);
    }

    /* renamed from: AsyncImage-sKDTAoQ, reason: not valid java name */
    public static final void m40AsyncImagesKDTAoQ(Object obj, String str, ImageLoader imageLoader, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        int i5 = i2 >> 3;
        go1 go1Var = (go1) fe0Var;
        m38AsyncImage76YX9Dk(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), str, (i4 & 8) != 0 ? i13.a : l13Var, (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var, (i4 & 32) != 0 ? null : tm1Var2, (i4 & 64) != 0 ? q8.N : u8Var, (i4 & 128) != 0 ? li0.b : ni0Var, (i4 & 256) != 0 ? 1.0f : f, (i4 & 512) == 0 ? c80Var : null, (i4 & 1024) != 0 ? 1 : i, (i4 & 2048) == 0 ? z : true, go1Var, (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & C.ENCODING_PCM_DOUBLE), (i3 >> 3) & 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 AsyncImage_76YX9Dk$lambda$0(AsyncImageState asyncImageState, String str, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, int i2, int i3, fe0 fe0Var, int i4) {
        m38AsyncImage76YX9Dk(asyncImageState, str, l13Var, tm1Var, tm1Var2, u8Var, ni0Var, f, c80Var, i, z, fe0Var, mu0.X(i2 | 1), mu0.X(i3));
        return wd5.a;
    }
}
