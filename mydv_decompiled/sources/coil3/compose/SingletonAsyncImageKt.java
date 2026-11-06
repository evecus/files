package coil3.compose;

import android.content.Context;
import androidx.media3.common.C;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import defpackage.c80;
import defpackage.fe0;
import defpackage.go1;
import defpackage.i13;
import defpackage.l13;
import defpackage.li0;
import defpackage.ni0;
import defpackage.q8;
import defpackage.rb;
import defpackage.rj3;
import defpackage.tm1;
import defpackage.u8;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonAsyncImageKt {
    /* renamed from: AsyncImage-10Xjiaw, reason: not valid java name */
    public static final void m55AsyncImage10Xjiaw(Object obj, String str, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        go1 go1Var = (go1) fe0Var;
        int i5 = i2 << 3;
        AsyncImageKt.m40AsyncImagesKDTAoQ(obj, str, SingletonImageLoader.get((Context) go1Var.k(rb.b)), (i4 & 4) != 0 ? i13.a : l13Var, (i4 & 8) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var, (i4 & 16) != 0 ? null : tm1Var2, (i4 & 32) != 0 ? q8.N : u8Var, (i4 & 64) != 0 ? li0.b : ni0Var, (i4 & 128) != 0 ? 1.0f : f, (i4 & 256) != 0 ? null : c80Var, (i4 & 512) != 0 ? 1 : i, (i4 & 1024) != 0 ? true : z, go1Var, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & C.ENCODING_PCM_DOUBLE), ((i2 >> 27) & 14) | ((i3 << 3) & 112), 0);
    }

    /* renamed from: AsyncImage-x1rPTaM, reason: not valid java name */
    public static final void m56AsyncImagex1rPTaM(Object obj, String str, l13 l13Var, rj3 rj3Var, rj3 rj3Var2, rj3 rj3Var3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        l13 l13Var2 = (i4 & 4) != 0 ? i13.a : l13Var;
        rj3 rj3Var4 = (i4 & 8) != 0 ? null : rj3Var;
        rj3 rj3Var5 = (i4 & 16) != 0 ? null : rj3Var2;
        rj3 rj3Var6 = (i4 & 32) != 0 ? rj3Var5 : rj3Var3;
        tm1 tm1Var4 = (i4 & 64) != 0 ? null : tm1Var;
        tm1 tm1Var5 = (i4 & 128) != 0 ? null : tm1Var2;
        tm1 tm1Var6 = (i4 & 256) != 0 ? null : tm1Var3;
        u8 u8Var2 = (i4 & 512) != 0 ? q8.N : u8Var;
        ni0 ni0Var2 = (i4 & 1024) != 0 ? li0.b : ni0Var;
        float f2 = (i4 & 2048) != 0 ? 1.0f : f;
        c80 c80Var2 = (i4 & 4096) != 0 ? null : c80Var;
        int i5 = (i4 & 8192) != 0 ? 1 : i;
        boolean z2 = (i4 & 16384) != 0 ? true : z;
        go1 go1Var = (go1) fe0Var;
        ImageLoader imageLoader = SingletonImageLoader.get((Context) go1Var.k(rb.b));
        int i6 = i2 << 3;
        int i7 = (i2 & WebSocketProtocol.PAYLOAD_SHORT) | (i6 & 7168);
        int i8 = rj3.$stable;
        int i9 = i7 | (i8 << 12) | (i6 & 57344) | (i8 << 15) | (i6 & 458752) | (i8 << 18) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & C.ENCODING_PCM_DOUBLE);
        int i10 = i3 << 3;
        AsyncImageKt.m39AsyncImagenc27qi8(obj, str, imageLoader, l13Var2, rj3Var4, rj3Var5, rj3Var6, tm1Var4, tm1Var5, tm1Var6, u8Var2, ni0Var2, f2, c80Var2, i5, z2, go1Var, i9, (i10 & 896) | ((i2 >> 27) & 14) | (i10 & 112) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752), 0);
    }
}
