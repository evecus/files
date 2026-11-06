package coil3.compose;

import androidx.media3.common.C;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.UtilsKt;
import coil3.size.SizeResolver;
import defpackage.c80;
import defpackage.fe0;
import defpackage.go1;
import defpackage.i13;
import defpackage.in1;
import defpackage.jn1;
import defpackage.l13;
import defpackage.li0;
import defpackage.mu0;
import defpackage.ni0;
import defpackage.pv0;
import defpackage.q8;
import defpackage.rj3;
import defpackage.s83;
import defpackage.tc0;
import defpackage.tm1;
import defpackage.u8;
import defpackage.wd5;
import defpackage.wi4;
import defpackage.wx;
import defpackage.xx;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SubcomposeAsyncImageKt {
    /* renamed from: SubcomposeAsyncImage-MokUVwQ, reason: not valid java name */
    public static final void m61SubcomposeAsyncImageMokUVwQ(Object obj, String str, ImageLoader imageLoader, l13 l13Var, tm1 tm1Var, jn1 jn1Var, jn1 jn1Var2, jn1 jn1Var3, tm1 tm1Var2, tm1 tm1Var3, tm1 tm1Var4, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, fe0 fe0Var, int i2, int i3, int i4) {
        l13 l13Var2 = (i4 & 8) != 0 ? i13.a : l13Var;
        tm1 defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var;
        jn1 jn1Var4 = (i4 & 32) != 0 ? null : jn1Var;
        jn1 jn1Var5 = (i4 & 64) != 0 ? null : jn1Var2;
        jn1 jn1Var6 = (i4 & 128) != 0 ? null : jn1Var3;
        tm1 tm1Var5 = (i4 & 256) != 0 ? null : tm1Var2;
        tm1 tm1Var6 = (i4 & 512) != 0 ? null : tm1Var3;
        tm1 tm1Var7 = (i4 & 1024) != 0 ? null : tm1Var4;
        u8 u8Var2 = (i4 & 2048) != 0 ? q8.N : u8Var;
        ni0 ni0Var2 = (i4 & 4096) != 0 ? li0.b : ni0Var;
        float f2 = (i4 & 8192) != 0 ? 1.0f : f;
        int i5 = i2 >> 3;
        tm1 tm1Var8 = defaultTransform;
        go1 go1Var = (go1) fe0Var;
        int i6 = i3 << 12;
        m63SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), str, l13Var2, tm1Var8, UtilsKt.onStateOf(tm1Var5, tm1Var6, tm1Var7), u8Var2, ni0Var2, f2, (i4 & 16384) == 0 ? c80Var : null, (32768 & i4) != 0 ? 1 : i, (i4 & 65536) == 0 ? z : true, contentOf(jn1Var4, jn1Var5, jn1Var6), go1Var, (i5 & 7168) | (i2 & 112) | (i5 & 896) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & C.ENCODING_PCM_DOUBLE), (i3 >> 18) & 14, 0);
    }

    /* renamed from: SubcomposeAsyncImage-QgsmV_s, reason: not valid java name */
    public static final void m62SubcomposeAsyncImageQgsmV_s(Object obj, String str, ImageLoader imageLoader, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, in1 in1Var, fe0 fe0Var, int i2, int i3, int i4) {
        int i5 = i2 >> 3;
        go1 go1Var = (go1) fe0Var;
        m63SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) go1Var.k(LocalAsyncImageModelEqualityDelegateKt.getLocalAsyncImageModelEqualityDelegate()), imageLoader), str, (i4 & 8) != 0 ? i13.a : l13Var, (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : tm1Var, (i4 & 32) != 0 ? null : tm1Var2, (i4 & 64) != 0 ? q8.N : u8Var, (i4 & 128) != 0 ? li0.b : ni0Var, (i4 & 256) != 0 ? 1.0f : f, (i4 & 512) != 0 ? null : c80Var, (i4 & 1024) != 0 ? 1 : i, (i4 & 2048) != 0 ? true : z, in1Var, go1Var, (i5 & 234881024) | (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | ((i3 << 27) & C.ENCODING_PCM_DOUBLE), (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m63SubcomposeAsyncImagegl8XCv8(final coil3.compose.internal.AsyncImageState r21, final java.lang.String r22, defpackage.l13 r23, final defpackage.tm1 r24, final defpackage.tm1 r25, final defpackage.u8 r26, final defpackage.ni0 r27, final float r28, final defpackage.c80 r29, final int r30, final boolean r31, final defpackage.in1 r32, defpackage.fe0 r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.SubcomposeAsyncImageKt.m63SubcomposeAsyncImagegl8XCv8(coil3.compose.internal.AsyncImageState, java.lang.String, l13, tm1, tm1, u8, ni0, float, c80, int, boolean, in1, fe0, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SubcomposeAsyncImageContent(final coil3.compose.SubcomposeAsyncImageScope r17, defpackage.l13 r18, defpackage.rj3 r19, java.lang.String r20, defpackage.u8 r21, defpackage.ni0 r22, float r23, defpackage.c80 r24, boolean r25, defpackage.fe0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(coil3.compose.SubcomposeAsyncImageScope, l13, rj3, java.lang.String, u8, ni0, float, c80, boolean, fe0, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SubcomposeAsyncImageContent$lambda$0(SubcomposeAsyncImageScope subcomposeAsyncImageScope, l13 l13Var, rj3 rj3Var, String str, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, int i, int i2, fe0 fe0Var, int i3) {
        SubcomposeAsyncImageContent(subcomposeAsyncImageScope, l13Var, rj3Var, str, u8Var, ni0Var, f, c80Var, z, fe0Var, mu0.X(i | 1), i2);
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SubcomposeAsyncImage_gl8XCv8$lambda$1(SizeResolver sizeResolver, in1 in1Var, AsyncImagePainter asyncImagePainter, String str, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, wx wxVar, fe0 fe0Var, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (((go1) fe0Var).g(wxVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            ((ConstraintsSizeResolver) sizeResolver).m49setConstraintsBRTryo0(((xx) wxVar).b);
            in1Var.invoke(new RealSubcomposeAsyncImageScope(wxVar, asyncImagePainter, str, u8Var, ni0Var, f, c80Var, z), go1Var, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SubcomposeAsyncImage_gl8XCv8$lambda$2(AsyncImageState asyncImageState, String str, l13 l13Var, tm1 tm1Var, tm1 tm1Var2, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, int i, boolean z, in1 in1Var, int i2, int i3, int i4, fe0 fe0Var, int i5) {
        m63SubcomposeAsyncImagegl8XCv8(asyncImageState, str, l13Var, tm1Var, tm1Var2, u8Var, ni0Var, f, c80Var, i, z, in1Var, fe0Var, mu0.X(i2 | 1), mu0.X(i3), i4);
        return wd5.a;
    }

    private static final in1 contentOf(jn1 jn1Var, jn1 jn1Var2, jn1 jn1Var3) {
        return (jn1Var == null && jn1Var2 == null && jn1Var3 == null) ? ComposableSingletons$SubcomposeAsyncImageKt.INSTANCE.getLambda$1938077476$io_coil_kt_coil3_coil_compose_core() : new tc0(-1106738291, new pv0(jn1Var, jn1Var2, jn1Var3, (byte) 12), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 contentOf$lambda$0(jn1 jn1Var, jn1 jn1Var2, jn1 jn1Var3, SubcomposeAsyncImageScope subcomposeAsyncImageScope, fe0 fe0Var, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (((go1) fe0Var).g(subcomposeAsyncImageScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (AsyncImagePainter.State) wi4.g(subcomposeAsyncImageScope.getPainter().getState(), go1Var).getValue();
            if (obj instanceof AsyncImagePainter.State.Loading) {
                if (jn1Var != null) {
                    go1Var.d0(1576397282);
                    jn1Var.c(subcomposeAsyncImageScope, obj, go1Var, Integer.valueOf((i2 & 14) | (AsyncImagePainter.State.Loading.$stable << 3)));
                    go1Var.q(false);
                    go1Var.d0(1624022037);
                } else {
                    go1Var.d0(1623695669);
                    go1Var.q(false);
                    go1Var.d0(1576407562);
                    SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, go1Var, i2 & 14, 255);
                }
            } else if (!(obj instanceof AsyncImagePainter.State.Success)) {
                if (obj instanceof AsyncImagePainter.State.Error) {
                    if (jn1Var3 != null) {
                        go1Var.d0(1576403106);
                        jn1Var3.c(subcomposeAsyncImageScope, obj, go1Var, Integer.valueOf((i2 & 14) | (AsyncImagePainter.State.Error.$stable << 3)));
                        go1Var.q(false);
                        go1Var.d0(1624022037);
                    } else {
                        go1Var.d0(1623876213);
                        go1Var.q(false);
                    }
                } else if (!(obj instanceof AsyncImagePainter.State.Empty)) {
                    s83.v();
                    return null;
                }
                go1Var.d0(1576407562);
                SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, go1Var, i2 & 14, 255);
            } else if (jn1Var2 != null) {
                go1Var.d0(1576400290);
                jn1Var2.c(subcomposeAsyncImageScope, obj, go1Var, Integer.valueOf((i2 & 14) | (AsyncImagePainter.State.Success.$stable << 3)));
                go1Var.q(false);
                go1Var.d0(1624022037);
            } else {
                go1Var.d0(1623788917);
                go1Var.q(false);
                go1Var.d0(1576407562);
                SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, go1Var, i2 & 14, 255);
            }
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
