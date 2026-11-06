package coil3.compose;

import android.content.Context;
import androidx.media3.common.C;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import defpackage.c80;
import defpackage.fe0;
import defpackage.go1;
import defpackage.i13;
import defpackage.in1;
import defpackage.jn1;
import defpackage.l13;
import defpackage.li0;
import defpackage.ni0;
import defpackage.q8;
import defpackage.rb;
import defpackage.tm1;
import defpackage.u8;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonSubcomposeAsyncImageKt {
    /* renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    public static final void m59SubcomposeAsyncImagegl8XCv8(Object obj, String str, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, in1 in1Var, fe0 fe0Var, int i2, int i3, int i4) {
        l13 l13Var2 = (i4 & 4) != 0 ? i13.a : l13Var;
        tm1 defaultTransform = (i4 & 8) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var;
        tm1 tm1Var3 = (i4 & 16) != 0 ? null : tm1Var2;
        u8 u8Var2 = (i4 & 32) != 0 ? q8.N : u8Var;
        ni0 ni0Var2 = (i4 & 64) != 0 ? li0.b : ni0Var;
        float f2 = (i4 & 128) != 0 ? 1.0f : f;
        c80 c80Var2 = (i4 & 256) != 0 ? null : c80Var;
        int i5 = (i4 & 512) != 0 ? 1 : i;
        boolean z2 = (i4 & 1024) != 0 ? true : z;
        go1 go1Var = (go1) fe0Var;
        ImageLoader imageLoader = SingletonImageLoader.get((Context) go1Var.k(rb.b));
        int i6 = i2 << 3;
        int i7 = (i2 & WebSocketProtocol.PAYLOAD_SHORT) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & C.ENCODING_PCM_DOUBLE);
        int i8 = i3 << 3;
        SubcomposeAsyncImageKt.m62SubcomposeAsyncImageQgsmV_s(obj, str, imageLoader, l13Var2, defaultTransform, tm1Var3, u8Var2, ni0Var2, f2, c80Var2, i5, z2, in1Var, go1Var, i7, ((i2 >> 27) & 14) | (i8 & 112) | (i8 & 896), 0);
    }

    /* renamed from: SubcomposeAsyncImage-nc27qi8, reason: not valid java name */
    public static final void m60SubcomposeAsyncImagenc27qi8(Object obj, String str, l13 l13Var, tm1 tm1Var, jn1 jn1Var, jn1 jn1Var2, jn1 jn1Var3, tm1 tm1Var2, tm1 tm1Var3, tm1 tm1Var4, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        go1 go1Var = (go1) fe0Var;
        int i5 = i2 << 3;
        int i6 = i3 << 3;
        SubcomposeAsyncImageKt.m61SubcomposeAsyncImageMokUVwQ(obj, str, SingletonImageLoader.get((Context) go1Var.k(rb.b)), (i4 & 4) != 0 ? i13.a : l13Var, (i4 & 8) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var, (i4 & 16) != 0 ? null : jn1Var, (i4 & 32) != 0 ? null : jn1Var2, (i4 & 64) != 0 ? null : jn1Var3, (i4 & 128) != 0 ? null : tm1Var2, (i4 & 256) != 0 ? null : tm1Var3, (i4 & 512) != 0 ? null : tm1Var4, (i4 & 1024) != 0 ? q8.N : u8Var, (i4 & 2048) != 0 ? li0.b : ni0Var, (i4 & 4096) != 0 ? 1.0f : f, (i4 & 8192) != 0 ? null : c80Var, (i4 & 16384) != 0 ? 1 : i, (i4 & 32768) != 0 ? true : z, go1Var, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & C.ENCODING_PCM_DOUBLE), (i6 & 896) | ((i2 >> 27) & 14) | (i6 & 112) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016), 0);
    }
}
