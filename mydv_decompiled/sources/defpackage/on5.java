package defpackage;

import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.ui.PlayerView;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.BitRate;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixPlaylistPagination;
import com.github.mytv.dv.model.MixStatis;
import com.github.mytv.dv.model.VideoBigThumb;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class on5 {
    public static final ta1 a = ma1.e(qb.k0(180, 6, null), 2).a(ma1.i(qb.k0(180, 6, null), new hf5((byte) 23)));
    public static final bc1 b = ma1.f(qb.k0(180, 6, null), 2).a(ma1.j(qb.k0(180, 6, null), new hf5((byte) 24)));
    public static final List c = p70.k0(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(3.0f));
    public static final List d = p70.k0(new cb1(3.0f, 4.0f, 0.0f, 2), new cb1(7.0f, 12.0f, 0.35f, 1), new cb1(11.0f, 20.0f, 0.7f, 2), new cb1(15.0f, 12.0f, 0.15f, 1), new cb1(19.0f, 4.0f, 0.55f, 2));

    public static final void A(final List list, final boolean z, final MixInfo mixInfo, final MixPlaylistPagination mixPlaylistPagination, final String str, final int i, final boolean z2, final boolean z3, final rm1 rm1Var, final rm1 rm1Var2, final Boolean bool, final rm1 rm1Var3, final in1 in1Var, final tm1 tm1Var, final rm1 rm1Var4, final rm1 rm1Var5, final boolean z4, final tm1 tm1Var2, fe0 fe0Var, final int i2) {
        int i3;
        go1 go1Var;
        int i4;
        int i5;
        go1 go1Var2;
        final long j;
        final ki1 ki1Var;
        MixStatis statis;
        List list2 = list;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(570764880);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var3.g(list2) : go1Var3.i(list2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var3.h(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? go1Var3.g(mixInfo) : go1Var3.i(mixInfo) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? go1Var3.g(mixPlaylistPagination) : go1Var3.i(mixPlaylistPagination) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var3.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go1Var3.e(i) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= go1Var3.h(z2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= go1Var3.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= go1Var3.i(rm1Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= go1Var3.i(rm1Var2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i6 = 12582912 | (go1Var3.g(bool) ? 4 : 2) | (go1Var3.i(rm1Var3) ? 32 : 16) | (go1Var3.i(in1Var) ? 256 : 128) | (go1Var3.i(tm1Var) ? 2048 : 1024) | (go1Var3.i(rm1Var4) ? 16384 : 8192) | (go1Var3.h(z4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        boolean z5 = true;
        if (go1Var3.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 4727955) == 4727954) ? false : true)) {
            long j2 = ((fw2) go1Var3.k(lw2.b)).a.a;
            Object Q = go1Var3.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = pt1.r(go1Var3);
            }
            ki1 ki1Var2 = (ki1) Q;
            final ag2 a2 = bg2.a(go1Var3);
            Object Q2 = go1Var3.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var3.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            if (mixInfo == null || (statis = mixInfo.getStatis()) == null) {
                i4 = i3;
                i5 = 0;
            } else {
                i4 = i3;
                i5 = Math.max(statis.getTotalEpisode(), statis.getUpdatedToEpisode());
            }
            int i7 = i4 & 14;
            boolean z6 = (i7 == 4 || ((i4 & 8) != 0 && go1Var3.g(list2))) | ((i4 & 57344) == 16384);
            Object Q3 = go1Var3.Q();
            if (z6 || Q3 == jpVar) {
                Iterator it = list2.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    Iterator it2 = it;
                    if (j42.c(((Aweme) it.next()).getAwemeId(), str)) {
                        break;
                    }
                    i8++;
                    it = it2;
                }
                Integer valueOf = Integer.valueOf(i8);
                if (i8 < 0) {
                    valueOf = null;
                }
                Q3 = Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
                go1Var3.o0(Q3);
            }
            final int intValue = ((Number) Q3).intValue();
            Object[] objArr = {a2, list2, Boolean.valueOf(z2), Boolean.valueOf(z3), bool};
            boolean g = go1Var3.g(a2) | ((i4 & 3670016) == 1048576) | ((i4 & 29360128) == 8388608) | ((i6 & 14) == 4) | ((i4 & 234881024) == 67108864) | ((i4 & C.ENCODING_PCM_DOUBLE) == 536870912) | ((i6 & 112) == 32);
            Object Q4 = go1Var3.Q();
            if (g || Q4 == jpVar) {
                lm5 lm5Var = new lm5(a2, z2, z3, bool, t43Var, rm1Var, rm1Var2, rm1Var3, null);
                go1Var3.o0(lm5Var);
                Q4 = lm5Var;
            }
            mw2.k(objArr, (hn1) Q4, go1Var3);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean z7 = (i4 & 112) == 32;
            if (i7 != 4 && ((i4 & 8) == 0 || !go1Var3.i(list2))) {
                z5 = false;
            }
            boolean g2 = z7 | z5 | go1Var3.g(a2) | go1Var3.e(intValue);
            Object Q5 = go1Var3.Q();
            if (g2 || Q5 == jpVar) {
                go1Var2 = go1Var3;
                j = j2;
                mm5 mm5Var = new mm5(z, list2, a2, intValue, t43Var, ki1Var2, null);
                list2 = list2;
                ki1Var = ki1Var2;
                go1Var2.o0(mm5Var);
                Q5 = mm5Var;
            } else {
                go1Var2 = go1Var3;
                ki1Var = ki1Var2;
                j = j2;
            }
            mw2.i(valueOf2, list2, (hn1) Q5, go1Var2);
            final int i9 = i5;
            final List list3 = list2;
            go1Var = go1Var2;
            int i10 = i6 >> 12;
            bp3.c(rm1Var4, null, z4, tm1Var2, p70.u0(1390855009, new jn1() { // from class: nk5
                @Override // defpackage.jn1
                public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i11;
                    ea0 ea0Var = (ea0) obj;
                    ji3 ji3Var = (ji3) obj2;
                    fe0 fe0Var2 = (fe0) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    ea0Var.getClass();
                    ji3Var.getClass();
                    if ((intValue2 & 6) == 0) {
                        i11 = (((go1) fe0Var2).g(ea0Var) ? 4 : 2) | intValue2;
                    } else {
                        i11 = intValue2;
                    }
                    if ((intValue2 & 48) == 0) {
                        i11 |= ((go1) fe0Var2).g(ji3Var) ? 32 : 16;
                    }
                    go1 go1Var4 = (go1) fe0Var2;
                    if (go1Var4.T(i11 & 1, (i11 & 147) != 146)) {
                        kp kpVar = new kp(8.0f, true, new y9());
                        l13 B0 = i42.B0(nq4.e(pt1.G(ea0Var, i13.a, 1.0f), 1.0f), ji3Var);
                        final MixInfo mixInfo2 = mixInfo;
                        boolean i12 = go1Var4.i(mixInfo2);
                        final int i13 = i9;
                        boolean e = i12 | go1Var4.e(i13);
                        final List list4 = list3;
                        boolean i14 = e | go1Var4.i(list4);
                        final boolean z8 = z;
                        boolean h = i14 | go1Var4.h(z8);
                        final String str2 = str;
                        boolean g3 = h | go1Var4.g(str2);
                        final int i15 = i;
                        boolean e2 = g3 | go1Var4.e(i15);
                        final tm1 tm1Var3 = tm1Var;
                        boolean g4 = e2 | go1Var4.g(tm1Var3);
                        final in1 in1Var2 = in1Var;
                        boolean g5 = g4 | go1Var4.g(in1Var2);
                        final MixPlaylistPagination mixPlaylistPagination2 = mixPlaylistPagination;
                        boolean i16 = g5 | go1Var4.i(mixPlaylistPagination2);
                        final int i17 = intValue;
                        boolean e3 = i16 | go1Var4.e(i17);
                        final Boolean bool2 = bool;
                        boolean g6 = e3 | go1Var4.g(bool2);
                        final long j3 = j;
                        boolean f = g6 | go1Var4.f(j3);
                        Object Q6 = go1Var4.Q();
                        if (f || Q6 == de0.a) {
                            final ki1 ki1Var3 = ki1Var;
                            tm1 tm1Var4 = new tm1() { // from class: tk5
                                @Override // defpackage.tm1
                                public final Object invoke(Object obj5) {
                                    of2 of2Var = (of2) obj5;
                                    of2Var.getClass();
                                    final MixInfo mixInfo3 = mixInfo2;
                                    of2Var.Z("header", "header", new tc0(1025697388, new vv0(mixInfo3, i13, (byte) 3), true));
                                    final List list5 = list4;
                                    boolean isEmpty = list5.isEmpty();
                                    final boolean z9 = z8;
                                    if (isEmpty && z9) {
                                        of2Var.Z("loading", "loading", j42.g);
                                    } else if (list5.isEmpty()) {
                                        of2Var.Z("empty", "empty", new tc0(162311787, new j10(mixInfo3, (byte) 12), true));
                                    } else {
                                        int size = list5.size();
                                        l30 l30Var = new l30(list5, (byte) 4);
                                        m45 m45Var = new m45((byte) 13);
                                        final String str3 = str2;
                                        final int i18 = i15;
                                        final tm1 tm1Var5 = tm1Var3;
                                        final in1 in1Var3 = in1Var2;
                                        final MixPlaylistPagination mixPlaylistPagination3 = mixPlaylistPagination2;
                                        final int i19 = i17;
                                        final ki1 ki1Var4 = ki1Var3;
                                        of2Var.a0(size, l30Var, m45Var, new tc0(1811298338, new jn1() { // from class: wk5
                                            @Override // defpackage.jn1
                                            public final Object c(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                int intValue3 = ((Integer) obj7).intValue();
                                                fe0 fe0Var3 = (fe0) obj8;
                                                int intValue4 = ((Integer) obj9).intValue();
                                                ((zd2) obj6).getClass();
                                                if ((intValue4 & 48) == 0) {
                                                    intValue4 |= ((go1) fe0Var3).e(intValue3) ? 32 : 16;
                                                }
                                                go1 go1Var5 = (go1) fe0Var3;
                                                if (go1Var5.T(intValue4 & 1, (intValue4 & 145) != 144)) {
                                                    List list6 = list5;
                                                    Aweme aweme = (Aweme) list6.get(intValue3);
                                                    boolean c2 = j42.c(aweme.getAwemeId(), str3);
                                                    MixInfo mixInfo4 = mixInfo3;
                                                    Integer valueOf3 = mixInfo4 == null ? null : Integer.valueOf(i18 + intValue3);
                                                    boolean i20 = go1Var5.i(mixInfo4);
                                                    tm1 tm1Var6 = tm1Var5;
                                                    boolean g7 = i20 | go1Var5.g(tm1Var6) | go1Var5.i(aweme);
                                                    in1 in1Var4 = in1Var3;
                                                    boolean g8 = g7 | go1Var5.g(in1Var4) | go1Var5.i(list6);
                                                    MixPlaylistPagination mixPlaylistPagination4 = mixPlaylistPagination3;
                                                    boolean i21 = g8 | go1Var5.i(mixPlaylistPagination4);
                                                    Object Q7 = go1Var5.Q();
                                                    if (i21 || Q7 == de0.a) {
                                                        ml4 ml4Var = new ml4((Object) mixInfo4, (Object) tm1Var6, (Object) aweme, (Object) in1Var4, (Object) list6, (Object) mixPlaylistPagination4, (byte) 3);
                                                        go1Var5.o0(ml4Var);
                                                        Q7 = ml4Var;
                                                    }
                                                    rm1 rm1Var6 = (rm1) Q7;
                                                    int i22 = i19;
                                                    l13 l13Var = i13.a;
                                                    if (intValue3 == i22) {
                                                        l13Var = j42.x(l13Var, ki1Var4);
                                                    }
                                                    on5.z(aweme, c2, valueOf3, rm1Var6, l13Var, go1Var5, Aweme.$stable);
                                                } else {
                                                    go1Var5.W();
                                                }
                                                return wd5.a;
                                            }
                                        }, true));
                                        if (j42.c(bool2, Boolean.TRUE)) {
                                            final long j4 = j3;
                                            of2Var.Z("related_more", "paging", new tc0(-284069296, new in1() { // from class: xk5
                                                @Override // defpackage.in1
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    fe0 fe0Var3 = (fe0) obj7;
                                                    int intValue3 = ((Integer) obj8).intValue();
                                                    ((zd2) obj6).getClass();
                                                    go1 go1Var5 = (go1) fe0Var3;
                                                    if (go1Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        l13 g7 = nq4.g(nq4.e(i13.a, 1.0f), 48.0f);
                                                        uw2 c2 = px.c(q8.N, false);
                                                        long j5 = go1Var5.T;
                                                        int i20 = (int) (j5 ^ (j5 >>> 32));
                                                        am3 m = go1Var5.m();
                                                        l13 x0 = i42.x0(go1Var5, g7);
                                                        xd0.c.getClass();
                                                        go1Var5.h0();
                                                        if (go1Var5.S) {
                                                            go1Var5.l(wa2.A0);
                                                        } else {
                                                            go1Var5.r0();
                                                        }
                                                        qi4.k(go1Var5, q8.c0, c2);
                                                        qi4.k(go1Var5, q8.b0, m);
                                                        qi4.k(go1Var5, q8.d0, Integer.valueOf(i20));
                                                        qi4.j(go1Var5);
                                                        qi4.k(go1Var5, q8.a0, x0);
                                                        if (z9) {
                                                            go1Var5.d0(-621664911);
                                                            p70.i(null, 32.0f, j4, go1Var5, 48, 1);
                                                            go1Var5.q(false);
                                                        } else {
                                                            go1Var5.d0(-621478539);
                                                            i51 i51Var = lw2.b;
                                                            r55.b("上滑加载更多", null, ((fw2) go1Var5.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var5.k(i51Var)).b.l, go1Var5, 6, 0, 131066);
                                                            go1Var5 = go1Var5;
                                                            go1Var5.q(false);
                                                        }
                                                        go1Var5.q(true);
                                                    } else {
                                                        go1Var5.W();
                                                    }
                                                    return wd5.a;
                                                }
                                            }, true));
                                        }
                                    }
                                    return wd5.a;
                                }
                            };
                            go1Var4.o0(tm1Var4);
                            Q6 = tm1Var4;
                        }
                        e21.c(B0, ag2.this, null, kpVar, null, null, false, null, (tm1) Q6, go1Var4, 24576, 492);
                    } else {
                        go1Var4.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, (i10 & 896) | (i10 & 14) | 24576 | 3072, 2);
        } else {
            go1Var = go1Var3;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ok5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i2 | 1);
                    on5.A(list, z, mixInfo, mixPlaylistPagination, str, i, z2, z3, rm1Var, rm1Var2, bool, rm1Var3, in1Var, tm1Var, rm1Var4, rm1Var5, z4, tm1Var2, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void A0(boolean z, t43 t43Var, t43 t43Var2) {
        if (z) {
            t43Var.setValue(true);
            t43Var2.setValue(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final defpackage.rm1 r32, final com.github.mytv.dv.model.VideoBigThumb r33, final defpackage.rm1 r34, final defpackage.rm1 r35, final long r36, defpackage.fe0 r38, final int r39) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.B(rm1, com.github.mytv.dv.model.VideoBigThumb, rm1, rm1, long, fe0, int):void");
    }

    public static final void B0(dl0 dl0Var, tm1 tm1Var, s33 s33Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, hk3 hk3Var, kq5 kq5Var, Aweme aweme) {
        if (((Boolean) t43Var.getValue()).booleanValue() || ((Boolean) t43Var2.getValue()).booleanValue() || ((Boolean) t43Var3.getValue()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        t43Var4.setValue(bool);
        t43Var5.setValue(Boolean.FALSE);
        if (tm1Var != null) {
            tm1Var.invoke(bool);
        }
        if (!((List) t43Var6.getValue()).isEmpty() || kq5Var == null) {
            return;
        }
        p70.g0(dl0Var, null, null, new lb5(kq5Var, aweme, t43Var7, t43Var6, s33Var, t43Var8, hk3Var, null), 3);
    }

    public static final void C(final boolean z, final float f, final lq5 lq5Var, final float f2, final int i, final float f3, final float f4, final so0 so0Var, final vo0 vo0Var, final so3 so3Var, final boolean z2, final boolean z3, final boolean z4, final rm1 rm1Var, final tm1 tm1Var, final tm1 tm1Var2, final tm1 tm1Var3, final tm1 tm1Var4, final tm1 tm1Var5, final tm1 tm1Var6, final tm1 tm1Var7, final tm1 tm1Var8, final boolean z5, final List list, final tm1 tm1Var9, final tm1 tm1Var10, final tm1 tm1Var11, final tm1 tm1Var12, final rm1 rm1Var2, final rm1 rm1Var3, final rm1 rm1Var4, final boolean z6, final rm1 rm1Var5, final rm1 rm1Var6, final rm1 rm1Var7, final rm1 rm1Var8, final String str, final String str2, final boolean z7, final tm1 tm1Var13, final boolean z8, final boolean z9, final rm1 rm1Var9, fe0 fe0Var, final int i2) {
        final li3 li3Var;
        t43 t43Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1159273833);
        int i3 = i2 | (go1Var.h(z) ? 4 : 2) | (go1Var.d(f) ? 32 : 16) | (go1Var.e(lq5Var.ordinal()) ? 256 : 128) | (go1Var.d(f2) ? 2048 : 1024) | (go1Var.e(i) ? 16384 : 8192) | (go1Var.d(f3) ? 131072 : 65536) | (go1Var.d(f4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.e(so0Var.ordinal()) ? 8388608 : 4194304) | (go1Var.e(vo0Var.ordinal()) ? 67108864 : 33554432) | (go1Var.e(so3Var.ordinal()) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        int i4 = (go1Var.h(z2) ? (char) 4 : (char) 2) | (go1Var.h(z3) ? ' ' : (char) 16) | (go1Var.h(z4) ? 256 : 128) | (go1Var.i(rm1Var) ? 2048 : 1024) | (go1Var.i(tm1Var) ? 16384 : 8192) | (go1Var.i(tm1Var2) ? 131072 : 65536) | (go1Var.i(tm1Var3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.i(tm1Var4) ? 8388608 : 4194304) | (go1Var.i(tm1Var5) ? 67108864 : 33554432) | (go1Var.i(tm1Var6) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        int i5 = (go1Var.i(tm1Var7) ? 4 : 2) | (go1Var.i(tm1Var8) ? 32 : 16) | (go1Var.h(z5) ? 256 : 128) | (go1Var.g(list) ? 2048 : 1024) | (go1Var.i(tm1Var9) ? 16384 : 8192) | (go1Var.i(tm1Var10) ? 131072 : 65536) | (go1Var.i(tm1Var11) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.i(tm1Var12) ? 8388608 : 4194304) | (go1Var.i(rm1Var2) ? 67108864 : 33554432) | (go1Var.i(rm1Var3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        if (go1Var.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (((((((((6 | (go1Var.h(z6) ? ' ' : (char) 16)) | (go1Var.i(rm1Var5) ? 256 : 128)) | (go1Var.i(rm1Var6) ? (char) 2048 : (char) 1024)) | (go1Var.i(rm1Var7) ? (char) 16384 : (char) 8192)) | (go1Var.i(rm1Var8) ? (char) 0 : (char) 0)) | (go1Var.g(str) ? (char) 0 : (char) 0)) | (go1Var.g(str2) ? (char) 0 : (char) 0)) | (go1Var.h(z7) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && ((((go1Var.h(z8) ? (char) 4 : (char) 2) | (go1Var.h(z9) ? ' ' : (char) 16)) | (go1Var.i(rm1Var9) ? 256 : 128)) & 147) == 146) ? false : true)) {
            i51 i51Var = lw2.b;
            final long j = ((fw2) go1Var.k(i51Var)).a.a;
            final k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            final iu0 iu0Var = (iu0) go1Var.k(hf0.h);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = pt1.r(go1Var);
            }
            final ki1 ki1Var = (ki1) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = pt1.r(go1Var);
            }
            final ki1 ki1Var2 = (ki1) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = pt1.r(go1Var);
            }
            final ki1 ki1Var3 = (ki1) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q4);
            }
            final t43 t43Var2 = (t43) Q4;
            Object Q5 = go1Var.Q();
            if (Q5 == jpVar) {
                Q5 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q5);
            }
            t43 t43Var3 = (t43) Q5;
            Object Q6 = go1Var.Q();
            if (Q6 == jpVar) {
                Q6 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q6);
            }
            final t43 t43Var4 = (t43) Q6;
            final ag2 a2 = bg2.a(go1Var);
            final bw0 bw0Var = (bw0) go1Var.k(cw0.a);
            final boolean M0 = M0(bw0Var);
            boolean z10 = bw0Var.c == aw0.I;
            final float f5 = z10 ? 38.0f : 44.0f;
            final float f6 = z10 ? 36.0f : 40.0f;
            float f7 = z10 ? 3.0f : 6.0f;
            li3 li3Var2 = new li3(16.0f, f7, 16.0f, f7);
            boolean z11 = ((i3 & C.ENCODING_PCM_DOUBLE) == 536870912) | ((i5 & 29360128) == 8388608);
            Object Q7 = go1Var.Q();
            if (z11 || Q7 == jpVar) {
                li3Var = li3Var2;
                Q7 = new x45((Object) so3Var, (Object) tm1Var12, (byte) 2);
                go1Var.o0(Q7);
            } else {
                li3Var = li3Var2;
            }
            final rm1 rm1Var10 = (rm1) Q7;
            Object Q8 = go1Var.Q();
            if (Q8 == jpVar) {
                Q8 = pt1.r(go1Var);
            }
            final ki1 ki1Var4 = (ki1) Q8;
            Object Q9 = go1Var.Q();
            if (Q9 == jpVar) {
                Q9 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q9);
            }
            final t43 t43Var5 = (t43) Q9;
            Object Q10 = go1Var.Q();
            if (Q10 == jpVar) {
                Q10 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q10);
            }
            final t43 t43Var6 = (t43) Q10;
            final rm1 g = bp3.g(go1Var);
            Object Q11 = go1Var.Q();
            if (Q11 == jpVar) {
                Q11 = new yn2(rm1Var4, t43Var3, t43Var4, (byte) 2);
                go1Var.o0(Q11);
            }
            Object h = bp3.h((rm1) Q11, go1Var, 0);
            boolean h2 = go1Var.h(E(t43Var3)) | go1Var.g(h);
            Object Q12 = go1Var.Q();
            if (h2 || Q12 == jpVar) {
                if (((Boolean) t43Var3.getValue()).booleanValue()) {
                    h = new yw4((byte) 17);
                }
                go1Var.o0(h);
                Q12 = h;
            }
            rm1 rm1Var11 = (rm1) Q12;
            Boolean bool = (Boolean) t43Var3.getValue();
            bool.getClass();
            boolean h3 = go1Var.h(z10);
            Object Q13 = go1Var.Q();
            if (h3 || Q13 == jpVar) {
                t43Var = t43Var3;
                Q13 = new ep2(z10, ki1Var4, ki1Var3, ki1Var2, ki1Var, t43Var6, t43Var, t43Var4, null);
                go1Var.o0(Q13);
            } else {
                t43Var = t43Var3;
            }
            mw2.h(go1Var, (hn1) Q13, bool);
            final t43 t43Var7 = t43Var;
            mw2.b(bp3.b.a(rm1Var11), p70.u0(656405033, new hn1() { // from class: hk5
                /* JADX WARN: Removed duplicated region for block: B:159:0x0464  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0421  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x03ea  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x03b4  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x037e  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0304  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x02b2  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x02a4  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x02e9  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0301  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0337  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x035f  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0396  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03cc  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0402  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x045c  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0488  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0573  */
                @Override // defpackage.hn1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r67, java.lang.Object r68) {
                    /*
                        Method dump skipped, instructions count: 2310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hk5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, go1Var), go1Var, 56);
            if (((Boolean) t43Var2.getValue()).booleanValue()) {
                go1Var.d0(126012071);
                boolean z12 = (i5 & 57344) == 16384;
                Object Q14 = go1Var.Q();
                if (z12 || Q14 == jpVar) {
                    Q14 = new l00(tm1Var9, (byte) 15);
                    go1Var.o0(Q14);
                }
                tm1 tm1Var14 = (tm1) Q14;
                boolean z13 = (i5 & 458752) == 131072;
                Object Q15 = go1Var.Q();
                if (z13 || Q15 == jpVar) {
                    Q15 = new l00(tm1Var10, (byte) 13);
                    go1Var.o0(Q15);
                }
                tm1 tm1Var15 = (tm1) Q15;
                boolean z14 = (i5 & 3670016) == 1048576;
                Object Q16 = go1Var.Q();
                if (z14 || Q16 == jpVar) {
                    Q16 = new l00(tm1Var11, (byte) 14);
                    go1Var.o0(Q16);
                }
                tm1 tm1Var16 = (tm1) Q16;
                Object Q17 = go1Var.Q();
                if (Q17 == jpVar) {
                    Q17 = new il4(t43Var2, (byte) 12);
                    go1Var.o0(Q17);
                }
                rm1 rm1Var12 = (rm1) Q17;
                int i6 = i5 >> 6;
                a5.g(z5, list, tm1Var14, tm1Var15, tm1Var16, rm1Var12, go1Var, (i6 & 14) | 196608 | (i6 & 112));
                go1Var.q(false);
            } else {
                go1Var.d0(126521401);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(z, f, lq5Var, f2, i, f3, f4, so0Var, vo0Var, so3Var, z2, z3, z4, rm1Var, tm1Var, tm1Var2, tm1Var3, tm1Var4, tm1Var5, tm1Var6, tm1Var7, tm1Var8, z5, list, tm1Var9, tm1Var10, tm1Var11, tm1Var12, rm1Var2, rm1Var3, rm1Var4, z6, rm1Var5, rm1Var6, rm1Var7, rm1Var8, str, str2, z7, tm1Var13, z8, z9, rm1Var9, i2) { // from class: gk5
                public final /* synthetic */ boolean I;
                public final /* synthetic */ float J;
                public final /* synthetic */ lq5 K;
                public final /* synthetic */ float L;
                public final /* synthetic */ int M;
                public final /* synthetic */ float N;
                public final /* synthetic */ float O;
                public final /* synthetic */ so0 P;
                public final /* synthetic */ vo0 Q;
                public final /* synthetic */ so3 R;
                public final /* synthetic */ boolean S;
                public final /* synthetic */ boolean T;
                public final /* synthetic */ boolean U;
                public final /* synthetic */ rm1 V;
                public final /* synthetic */ tm1 W;
                public final /* synthetic */ tm1 X;
                public final /* synthetic */ tm1 Y;
                public final /* synthetic */ tm1 Z;
                public final /* synthetic */ tm1 a0;
                public final /* synthetic */ tm1 b0;
                public final /* synthetic */ tm1 c0;
                public final /* synthetic */ tm1 d0;
                public final /* synthetic */ boolean e0;
                public final /* synthetic */ List f0;
                public final /* synthetic */ tm1 g0;
                public final /* synthetic */ tm1 h0;
                public final /* synthetic */ tm1 i0;
                public final /* synthetic */ tm1 j0;
                public final /* synthetic */ rm1 k0;
                public final /* synthetic */ rm1 l0;
                public final /* synthetic */ rm1 m0;
                public final /* synthetic */ boolean n0;
                public final /* synthetic */ rm1 o0;
                public final /* synthetic */ rm1 p0;
                public final /* synthetic */ rm1 q0;
                public final /* synthetic */ rm1 r0;
                public final /* synthetic */ String s0;
                public final /* synthetic */ String t0;
                public final /* synthetic */ boolean u0;
                public final /* synthetic */ tm1 v0;
                public final /* synthetic */ boolean w0;
                public final /* synthetic */ boolean x0;
                public final /* synthetic */ rm1 y0;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    on5.C(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void C0(tm1 tm1Var, kq5 kq5Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, dl0 dl0Var, t43 t43Var6, boolean z, t43 t43Var7, t43 t43Var8, Aweme aweme, t43 t43Var9, s33 s33Var, t43 t43Var10, t43 t43Var11, t43 t43Var12) {
        if (((Boolean) t43Var.getValue()).booleanValue() || ((Boolean) t43Var2.getValue()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        t43Var3.setValue(bool);
        t43Var4.setValue(Boolean.FALSE);
        if (tm1Var != null) {
            tm1Var.invoke(bool);
        }
        if (!((List) t43Var5.getValue()).isEmpty() || kq5Var == null) {
            return;
        }
        MixInfo mixInfo = z ? (MixInfo) t43Var6.getValue() : null;
        if (mixInfo == null || mixInfo.getMixId().length() <= 0) {
            p70.g0(dl0Var, null, null, new jn5(kq5Var, aweme, t43Var7, t43Var5, t43Var11, t43Var12, null, (byte) 0), 3);
        } else {
            if (((Boolean) t43Var7.getValue()).booleanValue() || ((gp3) t43Var8.getValue()) != null) {
                return;
            }
            int currentEpisode = mixInfo.getStatis().getCurrentEpisode();
            p70.g0(dl0Var, null, null, new in5(kq5Var, mixInfo, currentEpisode > 0 ? ((currentEpisode - 1) / 20) * 20 : 0, t43Var7, aweme, t43Var9, s33Var, t43Var10, t43Var5, null), 3);
        }
    }

    public static final void D(ki1 ki1Var, ki1 ki1Var2, t43 t43Var) {
        try {
            if (((Boolean) t43Var.getValue()).booleanValue()) {
                ki1.a(ki1Var);
            } else {
                ki1.a(ki1Var2);
            }
        } catch (Throwable unused) {
        }
    }

    public static final void D0(dl0 dl0Var, t43 t43Var, t43 t43Var2, hk3 hk3Var, hk3 hk3Var2, fk3 fk3Var, t43 t43Var3, hk3 hk3Var3, t43 t43Var4, ki1 ki1Var) {
        if (((Boolean) t43Var.getValue()).booleanValue() || ((Boolean) t43Var2.getValue()).booleanValue()) {
            return;
        }
        fk3Var.i(hk3Var.h() > 0 ? hk3Var2.h() / hk3Var.h() : 0.0f);
        t43Var3.setValue(Boolean.TRUE);
        hk3Var3.i(System.currentTimeMillis());
        t43Var4.setValue(Boolean.FALSE);
        p70.g0(dl0Var, null, null, new oo0(ki1Var, null, (byte) 20), 3);
    }

    public static final boolean E(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void E0(boolean z, rm1 rm1Var, t43 t43Var, hk3 hk3Var, t43 t43Var2, hk3 hk3Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5) {
        if (!((Boolean) t43Var.getValue()).booleanValue()) {
            if (!z) {
                t43Var4.setValue(Boolean.TRUE);
            }
            if (rm1Var != null) {
                rm1Var.invoke();
                return;
            }
            return;
        }
        Boolean bool = Boolean.FALSE;
        t43Var.setValue(bool);
        R(hk3Var, 0L);
        t43Var2.setValue(null);
        T(hk3Var2, 0L);
        t43Var3.setValue(null);
        t43Var4.setValue(bool);
        ExoPlayer exoPlayer = (ExoPlayer) t43Var5.getValue();
        if (exoPlayer != null) {
            exoPlayer.seekTo(0L);
        }
        ExoPlayer exoPlayer2 = (ExoPlayer) t43Var5.getValue();
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(true);
        }
        ExoPlayer exoPlayer3 = (ExoPlayer) t43Var5.getValue();
        if (exoPlayer3 != null) {
            exoPlayer3.play();
        }
        if (!z || rm1Var == null) {
            return;
        }
        rm1Var.invoke();
    }

    public static final void F(String str, boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        rm1 rm1Var2;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(573466892);
        if ((i & 6) == 0) {
            i2 = (go1Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.i(rm1Var) ? 256 : 128;
        }
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            rm1Var2 = rm1Var;
            l13 d2 = r13.d(mw2.B(mw2.p(nq4.c, hx2.f, mw2.j), z, null, 2), null, null, null, null, rm1Var2, null, null, null, null, null, null, null, 245503);
            boolean z2 = (i2 & 896) == 256;
            Object Q = go1Var2.Q();
            if (z2 || Q == de0.a) {
                Q = new c40(rm1Var2, (byte) 8);
                go1Var = go1Var2;
                go1Var.o0(Q);
            } else {
                go1Var = go1Var2;
            }
            l13 b2 = m05.b(d2, str, (PointerInputEventHandler) Q);
            uw2 c2 = px.c(q8.N, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, b2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            xh0.a(null, ma4.K, p70.u0(-1949878223, new hn2(str, (byte) 7), go1Var), go1Var, 438);
            go1Var.q(true);
        } else {
            rm1Var2 = rm1Var;
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rv0(str, z, (Object) rm1Var2, i, (byte) 6);
        }
    }

    public static final l13 F0(l13 l13Var, bw0 bw0Var, int i) {
        l13Var.getClass();
        return bw0Var.a == ww5.I ? nq4.i(l13Var, 0.0f, i * 0.85f, 1) : nq4.b(l13Var, bp3.f(bw0Var));
    }

    public static final void G(final Aweme aweme, MixInfo mixInfo, final rm1 rm1Var, final long j, final int i, final int i2, final tm1 tm1Var, final tm1 tm1Var2, final String str, final boolean z, final boolean z2, final ki1 ki1Var, final boolean z3, final rm1 rm1Var2, fe0 fe0Var, final int i3) {
        int i4;
        rm1 rm1Var3;
        MixInfo mixInfo2;
        go1 go1Var;
        long j2;
        String K0;
        float f;
        boolean z4;
        boolean z5;
        boolean z6;
        String str2;
        int i5;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-975170239);
        k1 k1Var = go1Var2.a;
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? go1Var2.g(aweme) : go1Var2.i(aweme) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? go1Var2.g(mixInfo) : go1Var2.i(mixInfo) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            rm1Var3 = rm1Var;
            i4 |= go1Var2.i(rm1Var3) ? 256 : 128;
        } else {
            rm1Var3 = rm1Var;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var2.f(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var2.e(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= go1Var2.e(i2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= go1Var2.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= go1Var2.g(str) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= go1Var2.h(z) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i6 = (go1Var2.h(z2) ? 4 : 2) | (go1Var2.g(ki1Var) ? 32 : 16) | (go1Var2.h(z3) ? 256 : 128) | (go1Var2.i(rm1Var2) ? 2048 : 1024);
        if (go1Var2.T(i4 & 1, ((i4 & 302589075) == 302589074 && (i6 & 1171) == 1170) ? false : true)) {
            long j3 = ut0.C(go1Var2).a;
            int i7 = i4;
            boolean g = go1Var2.g(TimeZone.getDefault().getID()) | go1Var2.f(aweme.getCreateTime()) | go1Var2.g(Locale.getDefault());
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = H0(aweme.getCreateTime());
                go1Var2.o0(Q);
            }
            String str3 = (String) Q;
            long longValue = ((Number) rm1Var3.invoke()).longValue();
            long j4 = j < 0 ? 0L : j;
            long s = ut0.s(longValue, 0L, j4);
            long j5 = j4;
            if (i <= 0 || i2 <= 0) {
                j2 = 0;
                K0 = K0(str);
            } else {
                j2 = 0;
                K0 = i + "×" + i2;
            }
            String str4 = (String) o70.U0(aweme.getAuthor().getAvatarThumb().getUrlList());
            if (str4 == null && (str4 = (String) o70.U0(aweme.getAuthor().getAvatarMedium().getUrlList())) == null) {
                str4 = "";
            }
            WeakHashMap weakHashMap = dw5.w;
            String str5 = K0;
            v12 d2 = j42.d(wi4.h(go1Var2).l, go1Var2);
            da2 da2Var = (da2) go1Var2.k(hf0.n);
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            float d0 = i42.d0(d2, da2Var);
            float c0 = i42.c0(d2, da2Var);
            if (z2) {
                go1Var2.d0(-135841664);
                f = ((r11) j42.O(new r11(d2.a()), (Comparable) go1Var2.k(r13.a))).I + 76.0f;
                z4 = false;
                go1Var2.q(false);
            } else {
                go1Var2.d0(-135707744);
                f = ((r11) j42.O(new r11(d2.a()), (Comparable) go1Var2.k(r13.a))).I + 24.0f;
                z4 = false;
                go1Var2.q(false);
            }
            l13 G0 = i42.G0(e, d0, 0.0f, c0, f, 2);
            uw2 c2 = px.c(q8.Q, z4);
            int Q2 = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, G0);
            xd0.c.getClass();
            if (!jp0.y(k1Var)) {
                qb.S();
                throw null;
            }
            go1Var2.h0();
            boolean z7 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z7) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q2);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            go1Var2.d0(-2109430829);
            if (z3) {
                go1Var2.d0(-2109570423);
                f(aweme, mixInfo, ki1Var, rm1Var2, nq4.h(nq4.p(nq4.e(i13Var, r13.e(go1Var2) ? 0.94f : 0.78f), 0.0f, 1320.0f, 1), 220.0f, 360.0f), go1Var2, Aweme.$stable | (i7 & 14) | (MixInfo.$stable << 3) | (i7 & 112) | ((i6 << 3) & 896) | (i6 & 7168));
                go1Var2.q(false);
                go1Var2.q(false);
                mixInfo2 = mixInfo;
                go1Var = go1Var2;
                z6 = true;
            } else {
                go1Var = go1Var2;
                go1Var.d0(-2109122597);
                go1Var.q(false);
                l13 B = mw2.B(j42.x(i42.G0(nq4.e(i13Var, 1.0f), 24.0f, 0.0f, r13.e(go1Var) ? 72.0f : 24.0f, 0.0f, 10), ki1Var), z, null, 2);
                jp jpVar2 = i42.d;
                tv tvVar = q8.V;
                ba0 a2 = z90.a(jpVar2, tvVar, go1Var, 0);
                int Q3 = i82.Q(go1Var.T);
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, B);
                if (!jp0.y(k1Var)) {
                    qb.S();
                    throw null;
                }
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a2);
                qi4.k(go1Var, sgVar2, m2);
                r7.G(Q3, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x02);
                uv uvVar = q8.T;
                boolean z8 = ((i7 & 3670016) == 1048576) | ((i7 & 14) == 4 || ((i7 & 8) != 0 && go1Var.i(aweme)));
                Object Q4 = go1Var.Q();
                if (z8 || Q4 == jpVar) {
                    Q4 = new rv3(tm1Var, aweme, (byte) 2);
                    go1Var.o0(Q4);
                }
                l13 g0 = i42.g0(i13Var, false, null, null, null, (rm1) Q4, 15);
                u74 a3 = t74.a(i42.b, uvVar, go1Var, 48);
                int Q5 = i82.Q(go1Var.T);
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, g0);
                if (!jp0.y(k1Var)) {
                    qb.S();
                    throw null;
                }
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a3);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(Q5, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x03);
                Object d02 = c5.d0(str4, go1Var);
                l13 k = nq4.k(i13Var, 44.0f);
                k74 k74Var = l74.a;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d02, "头像", j42.g(mw2.p(o7.m(k, k74Var), ut0.C(go1Var).H, mw2.j), 2.0f, j3, k74Var), null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
                oh4.a(go1Var, nq4.n(i13Var, 12.0f));
                ba0 a4 = z90.a(jpVar2, tvVar, go1Var, 0);
                int Q6 = i82.Q(go1Var.T);
                am3 m4 = go1Var.m();
                l13 x04 = i42.x0(go1Var, i13Var);
                if (!jp0.y(k1Var)) {
                    qb.S();
                    throw null;
                }
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a4);
                qi4.k(go1Var, sgVar2, m4);
                r7.G(Q6, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x04);
                r55.b(hf1.w("@", aweme.getAuthor().getNickname()), null, ut0.C(go1Var).q, oh4.j(18), null, 0L, null, 0L, 0, false, 0, 0, m65.a(ut0.H(go1Var).h, 0L, 0L, qk1.P, null, 0L, null, 0L, null, 16777211), go1Var, 24576, 0, 131050);
                go1Var.q(true);
                go1Var.q(true);
                if (z2) {
                    mixInfo2 = mixInfo;
                    go1Var.d0(-1763635547);
                    go1Var.q(false);
                } else {
                    go1Var.d0(-1763688402);
                    mixInfo2 = mixInfo;
                    m(mixInfo2, go1Var, MixInfo.$stable | ((i7 >> 3) & 14));
                    go1Var.q(false);
                }
                oh4.a(go1Var, nq4.g(i13Var, z2 ? 4.0f : 10.0f));
                l13 g2 = nq4.g(nq4.e(i13Var, 1.0f), z2 ? 24.0f : 40.0f);
                ba0 a5 = z90.a(jpVar2, tvVar, go1Var, 0);
                int Q7 = i82.Q(go1Var.T);
                am3 m5 = go1Var.m();
                l13 x05 = i42.x0(go1Var, g2);
                if (!jp0.y(k1Var)) {
                    qb.S();
                    throw null;
                }
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a5);
                qi4.k(go1Var, sgVar2, m5);
                r7.G(Q7, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x05);
                r55.b(aweme.getDesc(), null, ut0.C(go1Var).q, oh4.j(15), null, 0L, null, oh4.j(20), 2, false, z2 ? 1 : 2, 0, ut0.H(go1Var).k, go1Var, 24576, 432, 108522);
                go1Var.q(true);
                if (z2) {
                    z5 = false;
                    go1Var.d0(-1760474043);
                    go1Var.q(false);
                } else {
                    go1Var.d0(-1762945735);
                    u74 a6 = t74.a(new kp(8.0f, true, new y9()), uvVar, go1Var, 54);
                    int Q8 = i82.Q(go1Var.T);
                    am3 m6 = go1Var.m();
                    l13 x06 = i42.x0(go1Var, i13Var);
                    if (!jp0.y(k1Var)) {
                        qb.S();
                        throw null;
                    }
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar, a6);
                    qi4.k(go1Var, sgVar2, m6);
                    r7.G(Q8, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar4, x06);
                    if (aweme.getCreateTime() > j2) {
                        go1Var.d0(-804814333);
                        r55.b(str3, null, ut0.C(go1Var).s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ut0.H(go1Var).l, go1Var, 24576, 0, 131050);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-804573649);
                        go1Var.q(false);
                    }
                    if (str5 == null || jx4.L(str5)) {
                        str2 = str5;
                        go1Var.d0(-804002257);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-804500055);
                        if (aweme.getCreateTime() > j2) {
                            go1Var.d0(-804469117);
                            r55.b("·", null, ut0.C(go1Var).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 6, 0, 262138);
                            go1Var.q(false);
                        } else {
                            go1Var.d0(-804365329);
                            go1Var.q(false);
                        }
                        str2 = str5;
                        r55.b(str2, null, ut0.C(go1Var).s, oh4.j(12), null, 0L, null, 0L, 2, false, 1, 0, ut0.H(go1Var).l, go1Var, 24576, 24960, 110570);
                        go1Var.q(false);
                    }
                    if (j5 > 0) {
                        go1Var.d0(-803949588);
                        if (aweme.getCreateTime() > j2 || !(str2 == null || jx4.L(str2))) {
                            go1Var.d0(-803877885);
                            r55.b("·", null, ut0.C(go1Var).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 6, 0, 262138);
                            go1Var.q(false);
                        } else {
                            go1Var.d0(-803774097);
                            go1Var.q(false);
                        }
                        r55.b(r7.C(G0(s), " / ", G0(j5)), null, ut0.C(go1Var).s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ut0.H(go1Var).l, go1Var, 24576, 0, 131050);
                        i5 = 0;
                        go1Var.q(false);
                    } else {
                        i5 = 0;
                        go1Var.d0(-803393169);
                        go1Var.q(false);
                    }
                    n(null, j2, go1Var, i5);
                    go1Var.q(true);
                    oh4.a(go1Var, nq4.g(i13Var, 10.0f));
                    kp kpVar = new kp(16.0f, true, new y9());
                    l13 e2 = nq4.e(i13Var, 1.0f);
                    u74 a7 = t74.a(kpVar, uvVar, go1Var, 54);
                    int Q9 = i82.Q(go1Var.T);
                    am3 m7 = go1Var.m();
                    l13 x07 = i42.x0(go1Var, e2);
                    if (!jp0.y(k1Var)) {
                        qb.S();
                        throw null;
                    }
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar, a7);
                    qi4.k(go1Var, sgVar2, m7);
                    r7.G(Q9, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar4, x07);
                    kp kpVar2 = new kp(16.0f, true, new y9());
                    sc2 sc2Var = new sc2(1.0f, false);
                    u74 a8 = t74.a(kpVar2, uvVar, go1Var, 54);
                    int Q10 = i82.Q(go1Var.T);
                    am3 m8 = go1Var.m();
                    l13 x08 = i42.x0(go1Var, sc2Var);
                    if (!jp0.y(k1Var)) {
                        qb.S();
                        throw null;
                    }
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar, a8);
                    qi4.k(go1Var, sgVar2, m8);
                    r7.G(Q10, go1Var, sgVar3, go1Var);
                    qi4.k(go1Var, sgVar4, x08);
                    j(0, go1Var, sp0.O(), DataModelKt.formatCount(aweme.getStatistics().getDiggCount()));
                    j(0, go1Var, i42.r0(), DataModelKt.formatCount(aweme.getStatistics().getCommentCount()));
                    hx1 hx1Var = ui4.a;
                    if (hx1Var == null) {
                        gx1 gx1Var = new gx1("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = th5.a;
                        rt4 rt4Var = new rt4(x70.b);
                        ep r = r7.r(18.0f, 16.08f);
                        r.r(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        r.x(8.91f, 12.7f);
                        r.r(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        r.D(-0.04f, -0.47f, -0.09f, -0.7f);
                        r.y(7.05f, -4.11f);
                        r.r(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        r.r(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        r.D(-1.34f, -3.0f, -3.0f, -3.0f);
                        r.D(-3.0f, 1.34f, -3.0f, 3.0f);
                        r.r(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        r.x(8.04f, 9.81f);
                        r.q(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        r.r(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        r.D(1.34f, 3.0f, 3.0f, 3.0f);
                        r.r(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        r.y(7.12f, 4.16f);
                        r.r(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        r.r(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        r.r(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                        r.D(-1.31f, -2.92f, -2.92f, -2.92f);
                        r.p();
                        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
                        hx1Var = gx1Var.b();
                        ui4.a = hx1Var;
                    }
                    z5 = false;
                    j(0, go1Var, hx1Var, DataModelKt.formatCount(aweme.getStatistics().getShareCount()));
                    j(0, go1Var, wi4.o(), DataModelKt.formatCount(aweme.getStatistics().getCollectCount()));
                    go1Var.q(true);
                    go1Var.q(true);
                    go1Var.q(false);
                }
                z6 = true;
                go1Var.q(true);
                go1Var.q(z5);
            }
            go1Var.q(z6);
        } else {
            mixInfo2 = mixInfo;
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final MixInfo mixInfo3 = mixInfo2;
            u.d = new hn1() { // from class: mk5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i3 | 1);
                    on5.G(Aweme.this, mixInfo3, rm1Var, j, i, i2, tm1Var, tm1Var2, str, z, z2, ki1Var, z3, rm1Var2, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final String G0(long j) {
        long j2 = j / 1000;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static final void H(com.github.mytv.dv.model.Aweme r414, boolean r415, boolean r416, boolean r417, boolean r418, boolean r419, java.lang.String r420, boolean r421, okhttp3.OkHttpClient r422, defpackage.rj3 r423, defpackage.kq5 r424, defpackage.tm1 r425, defpackage.tm1 r426, defpackage.rm1 r427, defpackage.rm1 r428, defpackage.hn1 r429, int r430, int r431, defpackage.rm1 r432, defpackage.rm1 r433, defpackage.rm1 r434, boolean r435, float r436, defpackage.dp3 r437, defpackage.so3 r438, defpackage.po3 r439, boolean r440, boolean r441, defpackage.lq5 r442, float r443, defpackage.ro0 r444, float r445, int r446, float r447, float r448, defpackage.so0 r449, defpackage.vo0 r450, boolean r451, boolean r452, java.util.List r453, defpackage.so3 r454, defpackage.tm1 r455, defpackage.tm1 r456, defpackage.tm1 r457, defpackage.tm1 r458, defpackage.tm1 r459, defpackage.tm1 r460, defpackage.tm1 r461, defpackage.tm1 r462, defpackage.tm1 r463, defpackage.tm1 r464, defpackage.tm1 r465, defpackage.tm1 r466, defpackage.tm1 r467, defpackage.tm1 r468, defpackage.tm1 r469, defpackage.tm1 r470, long r471, defpackage.hn1 r473, defpackage.tm1 r474, defpackage.in1 r475, defpackage.rm1 r476, boolean r477, defpackage.tm1 r478, defpackage.tm1 r479, boolean r480, boolean r481, defpackage.hn1 r482, defpackage.tm1 r483, defpackage.hn1 r484, defpackage.tm1 r485, com.github.mytv.dv.model.Aweme r486, boolean r487, boolean r488, int r489, defpackage.tm1 r490, androidx.media3.exoplayer.ExoPlayer r491, boolean r492, boolean r493, com.github.mytv.dv.model.Aweme r494, defpackage.l13 r495, defpackage.fe0 r496, int r497, int r498, int r499, int r500) {
        /*
            Method dump skipped, instructions count: 18000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.H(com.github.mytv.dv.model.Aweme, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, okhttp3.OkHttpClient, rj3, kq5, tm1, tm1, rm1, rm1, hn1, int, int, rm1, rm1, rm1, boolean, float, dp3, so3, po3, boolean, boolean, lq5, float, ro0, float, int, float, float, so0, vo0, boolean, boolean, java.util.List, so3, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, tm1, long, hn1, tm1, in1, rm1, boolean, tm1, tm1, boolean, boolean, hn1, tm1, hn1, tm1, com.github.mytv.dv.model.Aweme, boolean, boolean, int, tm1, androidx.media3.exoplayer.ExoPlayer, boolean, boolean, com.github.mytv.dv.model.Aweme, l13, fe0, int, int, int, int):void");
    }

    public static final String H0(long j) {
        if (j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            j *= 1000;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(j));
        format.getClass();
        return format;
    }

    public static final void I(Aweme aweme, t43 t43Var, String str) {
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            t43Var.setValue(Boolean.FALSE);
            Log.d("VideoItem", "占位结束: awemeId=" + aweme.getAwemeId() + " reason=" + str);
        }
    }

    public static final String I0(float f) {
        return f % 1.0f == 0.0f ? String.valueOf((int) f) : String.valueOf(f);
    }

    public static void J(tm1 tm1Var, dl0 dl0Var, t43 t43Var, ki1 ki1Var) {
        Boolean bool = Boolean.FALSE;
        t43Var.setValue(bool);
        if (tm1Var != null) {
            tm1Var.invoke(bool);
        }
        p70.g0(dl0Var, null, null, new oo0(ki1Var, null, (byte) 16), 3);
    }

    public static final String J0(float f) {
        return r7.B(I0(f), "×");
    }

    public static final void K(dl0 dl0Var, t43 t43Var, ki1 ki1Var) {
        t43Var.setValue(Boolean.FALSE);
        p70.g0(dl0Var, null, null, new oo0(ki1Var, null, (byte) 17), 3);
    }

    public static final String K0(String str) {
        List list;
        List list2;
        if (str == null || jx4.L(str)) {
            return null;
        }
        String replace = str.replace('x', (char) 215);
        replace.getClass();
        ly0 ly0Var = new ly0(new v95(new ep1(v24.b(new v24("\\d{3,4}×\\d{3,4}"), replace), new m45((byte) 12))), new yv3((byte) 18));
        if (ly0Var.hasNext()) {
            Object next = ly0Var.next();
            if (ly0Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ly0Var.hasNext()) {
                    arrayList.add(ly0Var.next());
                }
                list = arrayList;
            } else {
                list = p70.j0(next);
            }
        } else {
            list = o91.I;
        }
        if (!list.isEmpty()) {
            return (String) o70.T0(list);
        }
        Pattern compile = Pattern.compile("\\s*[·/|,]\\s*");
        compile.getClass();
        int i = 0;
        jx4.V(0);
        Matcher matcher = compile.matcher(replace);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList2.add(replace.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
            } while (matcher.find());
            arrayList2.add(replace.subSequence(i2, replace.length()).toString());
            list2 = arrayList2;
        } else {
            list2 = p70.j0(replace.toString());
        }
        ArrayList arrayList3 = new ArrayList(p70.J(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(jx4.g0((String) it.next()).toString());
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList4.add(obj);
            }
        }
        return (String) o70.U0(o70.P0(arrayList4));
    }

    public static final void L(tm1 tm1Var, dl0 dl0Var, t43 t43Var, ki1 ki1Var, boolean z) {
        Boolean bool = Boolean.FALSE;
        t43Var.setValue(bool);
        if (tm1Var != null) {
            tm1Var.invoke(bool);
        }
        if (z) {
            p70.g0(dl0Var, null, null, new oo0(ki1Var, null, (byte) 18), 3);
        }
    }

    public static final long L0(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = new hk3(0L);
            go1Var.o0(Q);
        }
        hk3 hk3Var = (hk3) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = new nn5(hk3Var, null);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, wd5.a);
        return hk3Var.h();
    }

    public static final void M(t43 t43Var, hk3 hk3Var, t43 t43Var2, ki1 ki1Var) {
        Boolean bool = Boolean.FALSE;
        t43Var.setValue(bool);
        hk3Var.i(0L);
        t43Var2.setValue(bool);
        try {
            ki1.a(ki1Var);
        } catch (Throwable unused) {
        }
    }

    public static final boolean M0(bw0 bw0Var) {
        bw0Var.getClass();
        return bp3.f(bw0Var) > 0.0f;
    }

    public static final boolean N(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!aweme.getVideo().getPlayAddr().getUrlList().isEmpty()) {
            return true;
        }
        List<BitRate> bitRate = aweme.getVideo().getBitRate();
        if (bitRate != null && bitRate.isEmpty()) {
            return false;
        }
        Iterator<T> it = bitRate.iterator();
        while (it.hasNext()) {
            if (!((BitRate) it.next()).getPlayAddr().getUrlList().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final float N0(int i) {
        return ((r11) j42.P(new r11(340.0f), new r11(i * 0.88f))).I;
    }

    public static final lq5 O(t43 t43Var) {
        return (lq5) t43Var.getValue();
    }

    public static final uu4 O0(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, float f, float f2) {
        if (z) {
            return z4 ? new uu4(0.0f, 0.0f, f, 3) : new uu4(0.0f, N0(i) + f2, 0.0f, 5);
        }
        if (!z2 && !z3) {
            uu4.Companion.getClass();
            return uu4.d;
        }
        if (z5) {
            return new uu4(0.0f, 0.0f, f, 3);
        }
        i51 i51Var = bp3.a;
        return new uu4(((r11) j42.P(new r11(400.0f), new r11(i * 0.6f))).I, 0.0f, 0.0f, 6);
    }

    public static final pn5 P(t43 t43Var) {
        return (pn5) t43Var.getValue();
    }

    public static final long Q(hk3 hk3Var) {
        return hk3Var.h();
    }

    public static final void R(hk3 hk3Var, long j) {
        hk3Var.i(j);
    }

    public static final long S(hk3 hk3Var) {
        return hk3Var.h();
    }

    public static final void T(hk3 hk3Var, long j) {
        hk3Var.i(j);
    }

    public static final long U(hk3 hk3Var) {
        return hk3Var.h();
    }

    public static final String V(t43 t43Var) {
        return (String) t43Var.getValue();
    }

    public static final void W(s33 s33Var, int i) {
        ((gk3) s33Var).i(i);
    }

    public static final boolean X(cw4 cw4Var) {
        return ((Boolean) cw4Var.getValue()).booleanValue();
    }

    public static final boolean Y(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final boolean Z(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.hx1 r36, final java.lang.String r37, final java.lang.String r38, boolean r39, boolean r40, final boolean r41, final defpackage.rm1 r42, defpackage.fe0 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.a(hx1, java.lang.String, java.lang.String, boolean, boolean, boolean, rm1, fe0, int, int):void");
    }

    public static final boolean a0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void b(Comment comment, fe0 fe0Var, int i) {
        int i2;
        boolean z;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1016999773);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? go1Var.g(comment) : go1Var.i(comment) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            String str = (String) o70.U0(comment.getUser().getAvatarThumb().getUrlList());
            if (str == null) {
                str = "";
            }
            uv uvVar = q8.S;
            jp jpVar = i42.b;
            u74 a2 = t74.a(jpVar, uvVar, go1Var, 48);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, mw2.p(o7.m(nq4.k(i13Var, 28.0f), l74.a), k80Var.H, mw2.j), null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
            oh4.a(go1Var, nq4.n(i13Var, 10.0f));
            l13 x = nt3.x(i13Var, 1.0f);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, x);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            r55.b(comment.getUser().getNickname(), null, k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, xc3.b(), go1Var, 0, 24960, 110586);
            r55.b(comment.getText(), null, k80Var.q, 0L, null, 0L, null, 0L, 2, false, 4, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, 0, 24960, 110586);
            go1Var = go1Var;
            go1Var.q(true);
            if (comment.getDiggCount() > 0) {
                go1Var.d0(-1416424677);
                oh4.a(go1Var, nq4.n(i13Var, 8.0f));
                u74 a4 = t74.a(jpVar, q8.T, go1Var, 48);
                int Q3 = i82.Q(go1Var.T);
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a4);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(Q3, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x03);
                ow1.a(k21.G(), null, nq4.k(i13Var, 14.0f), k80Var.s, go1Var, 432);
                oh4.a(go1Var, nq4.n(i13Var, 2.0f));
                z = true;
                r55.b(DataModelKt.formatCount(comment.getDiggCount()), null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, xc3.c(), go1Var, 0, 0, 131066);
                go1Var = go1Var;
                go1Var.q(true);
                go1Var.q(false);
            } else {
                z = true;
                go1Var.d0(-1415796183);
                go1Var.q(false);
            }
            go1Var.q(z);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(comment, i, (byte) 9);
        }
    }

    public static final void b0(t43 t43Var, boolean z) {
        t43Var.setValue(Boolean.valueOf(z));
    }

    public static final void c(rm1 rm1Var, long j, l13 l13Var, fe0 fe0Var, int i) {
        rm1 rm1Var2;
        int i2;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(2015759447);
        if ((i & 6) == 0) {
            rm1Var2 = rm1Var;
            i2 = (go1Var2.i(rm1Var2) ? 4 : 2) | i;
        } else {
            rm1Var2 = rm1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.f(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.g(l13Var) ? 256 : 128;
        }
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            long s = ut0.s(((Number) rm1Var2.invoke()).longValue(), 0L, j < 0 ? 0L : j);
            float f = j > 0 ? s / j : 0.0f;
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var2, 54);
            int Q = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, l13Var);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(Q));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            float f2 = f;
            r55.b(G0(s), null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, xc3.b(), go1Var2, 0, 0, 131066);
            boolean d2 = go1Var2.d(f2);
            Object Q2 = go1Var2.Q();
            jp jpVar = de0.a;
            if (d2 || Q2 == jpVar) {
                Q2 = new by4(f2);
                go1Var2.o0(Q2);
            }
            rm1 rm1Var3 = (rm1) Q2;
            l13 x = nt3.x(i13.a, 1.0f);
            long j2 = k80Var.a;
            long j3 = k80Var.H;
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = new m45((byte) 11);
                go1Var2.o0(Q3);
            }
            xs5.a(rm1Var3, x, j2, j3, null, null, 0.0f, 0.0f, (tm1) Q3, 24.0f, 0.0f, go1Var2, 905969664, 6, PsExtractor.VIDEO_STREAM_MASK);
            r55.b(G0(j), null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, xc3.b(), go1Var2, 0, 0, 131066);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ev0(rm1Var, j, l13Var, i);
        }
    }

    public static final void c0(s33 s33Var, int i) {
        ((gk3) s33Var).i(i);
    }

    public static final void d(hx1 hx1Var, String str, boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(472461728);
        byte b2 = 2;
        int i2 = i | (go1Var.g(hx1Var) ? 4 : 2) | (go1Var.h(z) ? 256 : 128) | (go1Var.i(rm1Var) ? 2048 : 1024);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            i13 i13Var = i13.a;
            l13 d2 = r13.d(mw2.p(o7.m(nq4.k(i13Var, 48.0f), l74.a(12.0f)), k80Var.G, mw2.j), null, null, null, null, z ? rm1Var : null, null, null, null, null, null, null, null, 261887);
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object Q = go1Var.Q();
            if (z2 || Q == de0.a) {
                Q = new tu1(z, rm1Var, b2);
                go1Var.o0(Q);
            }
            l13 b3 = m05.b(d2, valueOf, (PointerInputEventHandler) Q);
            uw2 c2 = px.c(q8.N, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, b3);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            long j = k80Var.q;
            if (!z) {
                j = x70.c(j, 0.38f);
            }
            ow1.a(hx1Var, str, nq4.k(i13Var, 26.0f), j, go1Var, (i2 & 14) | 432);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new g30(hx1Var, str, z, rm1Var, i);
        }
    }

    public static final boolean d0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void e(String str, boolean z, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var;
        go1 go1Var2;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(-2066690882);
        if ((i & 6) == 0) {
            i2 = (go1Var3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var3.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var3.i(rm1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var3.g(l13Var) ? 2048 : 1024;
        }
        if (go1Var3.T(i2 & 1, (i2 & 1171) != 1170)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var3.k(i51Var)).a;
            int i3 = i2;
            l13 d2 = r13.d(mw2.p(o7.m(nq4.g(l13Var, 36.0f), l74.a(12.0f)), z ? k80Var.c : k80Var.G, mw2.j), null, null, null, null, rm1Var, null, null, null, null, null, null, null, 261887);
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = (i3 & 896) == 256;
            Object Q = go1Var3.Q();
            if (z2 || Q == de0.a) {
                Q = new c40(rm1Var, (byte) 4);
                go1Var2 = go1Var3;
                go1Var2.o0(Q);
            } else {
                go1Var2 = go1Var3;
            }
            l13 b2 = m05.b(d2, valueOf, (PointerInputEventHandler) Q);
            uw2 c2 = px.c(q8.N, false);
            int Q2 = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, b2);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(Q2));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            go1 go1Var4 = go1Var2;
            r55.b(str, null, z ? k80Var.d : k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.m, go1Var4, i3 & 14, 24960, 110586);
            go1Var = go1Var4;
            go1Var.q(true);
        } else {
            go1Var = go1Var3;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uo2(str, z, rm1Var, l13Var, i);
        }
    }

    public static final boolean e0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void f(Aweme aweme, MixInfo mixInfo, ki1 ki1Var, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        MixInfo mixInfo2;
        ki1Var.getClass();
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1276164645);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(mixInfo) : go1Var.i(mixInfo) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(ki1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.g(l13Var) ? 16384 : 8192;
        }
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            long j = ut0.C(go1Var).a;
            sb4 E = wx5.E(go1Var);
            Object Q = go1Var.Q();
            Object obj = de0.a;
            if (Q == obj) {
                Q = mw2.w(go1Var);
                go1Var.o0(Q);
            }
            dl0 dl0Var = (dl0) Q;
            String awemeId = aweme.getAwemeId();
            boolean g = go1Var.g(E);
            Object Q2 = go1Var.Q();
            fj0 fj0Var = null;
            if (g || Q2 == obj) {
                Q2 = new ak(E, fj0Var, (byte) 4);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, awemeId);
            l13 m = o7.m(fb4.U(l13Var, 18.0f, l74.a(20.0f)), l74.a(20.0f));
            long c2 = x70.c(ut0.C(go1Var).G, 0.96f);
            aj5 aj5Var = mw2.j;
            l13 B = mw2.B(j42.x(j42.g(mw2.p(m, c2, aj5Var), 1.0f, x70.c(ut0.C(go1Var).B, 0.7f), l74.a(20.0f)), ki1Var), false, null, 3);
            boolean g2 = go1Var.g(E) | go1Var.i(dl0Var) | ((i2 & 7168) == 2048);
            Object Q3 = go1Var.Q();
            if (g2 || Q3 == obj) {
                Q3 = new yj((Object) E, (Object) dl0Var, (Object) rm1Var, (byte) 15);
                go1Var.o0(Q3);
            }
            rm1 rm1Var2 = (rm1) Q3;
            boolean g3 = go1Var.g(E) | go1Var.i(dl0Var);
            Object Q4 = go1Var.Q();
            if (g3 || Q4 == obj) {
                Q4 = new xj(E, dl0Var);
                go1Var.o0(Q4);
            }
            l13 D0 = i42.D0(r13.d(B, null, null, rm1Var2, (rm1) Q4, null, null, null, null, null, null, null, null, 245679), 28.0f, 22.0f);
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            int Q5 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(Q5);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            uv uvVar = q8.T;
            i13 i13Var = i13.a;
            int i3 = i2;
            l13 e = nq4.e(i13Var, 1.0f);
            u74 a3 = t74.a(i42.b, uvVar, go1Var, 48);
            int Q6 = i82.Q(go1Var.T);
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, e);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(Q6, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            px.a(mw2.p(o7.m(nq4.g(nq4.n(i13Var, 4.0f), 24.0f), l74.a(2.0f)), j, aj5Var), go1Var, 0);
            oh4.a(go1Var, nq4.n(i13Var, 12.0f));
            r55.b("视频简介", null, ut0.C(go1Var).q, oh4.j(22), qk1.O, 0L, null, 0L, 0, false, 0, 0, ut0.H(go1Var).g, go1Var, 1597446, 0, 130986);
            oh4.a(go1Var, nt3.x(i13Var, 1.0f));
            r55.b(hf1.w("@", aweme.getAuthor().getNickname()), null, ut0.C(go1Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ut0.H(go1Var).k, go1Var, 0, 24960, 110586);
            go1Var.q(true);
            oh4.a(go1Var, nq4.g(i13Var, 16.0f));
            a5.i(null, 0.0f, x70.c(ut0.C(go1Var).B, 0.55f), go1Var, 0, 3);
            oh4.a(go1Var, nq4.g(i13Var, 16.0f));
            mixInfo2 = mixInfo;
            m(mixInfo2, go1Var, MixInfo.$stable | ((i3 >> 3) & 14));
            oh4.a(go1Var, nq4.g(i13Var, 12.0f));
            r55.b(aweme.getDesc(), wx5.X(nq4.e(i13Var, 1.0f).then(new sc2(1.0f, false)), E), ut0.C(go1Var).q, oh4.j(18), null, 0L, null, oh4.j(28), 0, false, 0, 0, ut0.H(go1Var).j, go1Var, 24576, 48, 129000);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            mixInfo2 = mixInfo;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ra0(aweme, mixInfo2, ki1Var, rm1Var, l13Var, i, (byte) 4);
        }
    }

    public static final long f0(hk3 hk3Var) {
        return hk3Var.h();
    }

    public static final void g(final boolean z, final boolean z2, final Aweme aweme, final MixInfo mixInfo, final rm1 rm1Var, final long j, final int i, final int i2, final tm1 tm1Var, final tm1 tm1Var2, final String str, final boolean z3, final boolean z4, final ki1 ki1Var, final rm1 rm1Var2, final l13 l13Var, fe0 fe0Var, final int i3) {
        boolean z5;
        int i4;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2052007311);
        if ((i3 & 6) == 0) {
            z5 = z;
            i4 = (go1Var.h(z5) ? 4 : 2) | i3;
        } else {
            z5 = z;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var.h(z2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= (i3 & 512) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= (i3 & 4096) == 0 ? go1Var.g(mixInfo) : go1Var.i(mixInfo) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var.i(rm1Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= go1Var.f(j) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= go1Var.e(i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= go1Var.e(i2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= go1Var.i(tm1Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= go1Var.i(tm1Var2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i5 = 3072 | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z3) ? 32 : 16) | (go1Var.h(z4) ? 256 : 128) | (go1Var.i(rm1Var2) ? 16384 : 8192) | (go1Var.g(l13Var) ? 131072 : 65536);
        if (go1Var.T(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            ta1 e = ma1.e(qb.k0(300, 6, null), 2);
            qb5 k0 = qb.k0(300, 6, null);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new hf5((byte) 19);
                go1Var.o0(Q);
            }
            ta1 a2 = e.a(ma1.i(k0, (tm1) Q));
            bc1 f = ma1.f(qb.k0(200, 6, null), 2);
            qb5 k02 = qb.k0(200, 6, null);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new hf5((byte) 20);
                go1Var.o0(Q2);
            }
            int i6 = (i4 & 14) | 196608 | ((i5 >> 12) & 112);
            p70.e(z5, l13Var, a2, f.a(ma1.j(k02, (tm1) Q2)), null, p70.u0(-962162871, new in1() { // from class: ak5
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ui) obj).getClass();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        l13 g = nq4.g(nq4.e(i13.a, 1.0f), z2 ? 420.0f : 280.0f);
                        Float valueOf = Float.valueOf(0.0f);
                        i51 i51Var = lw2.b;
                        px.a(mw2.o(g, jp.B(new uj3[]{new uj3(valueOf, new x70(x70.c(((fw2) go1Var2.k(i51Var)).a.p, 0.0f))), new uj3(Float.valueOf(0.55f), new x70(x70.c(((fw2) go1Var2.k(i51Var)).a.p, 0.7f))), new uj3(Float.valueOf(1.0f), new x70(x70.c(((fw2) go1Var2.k(i51Var)).a.p, 0.92f)))}, 0.0f, 0.0f, 14)), go1Var2, 0);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, i6, 16);
            ta1 e2 = ma1.e(qb.k0(300, 6, null), 2);
            qb5 k03 = qb.k0(300, 6, null);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new hf5((byte) 21);
                go1Var.o0(Q3);
            }
            ta1 a3 = e2.a(ma1.i(k03, (tm1) Q3));
            bc1 f2 = ma1.f(qb.k0(200, 6, null), 2);
            qb5 k04 = qb.k0(200, 6, null);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new hf5((byte) 22);
                go1Var.o0(Q4);
            }
            go1Var = go1Var;
            p70.e(z, l13Var, a3, f2.a(ma1.j(k04, (tm1) Q4)), null, p70.u0(-329613056, new in1() { // from class: bk5
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ui) obj).getClass();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        on5.G(Aweme.this, mixInfo, rm1Var, j, i, i2, tm1Var, tm1Var2, str, z3, z4, ki1Var, z2, rm1Var2, go1Var2, Aweme.$stable | (MixInfo.$stable << 3));
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, i6, 16);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ck5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i3 | 1);
                    on5.g(z, z2, aweme, mixInfo, rm1Var, j, i, i2, tm1Var, tm1Var2, str, z3, z4, ki1Var, rm1Var2, l13Var, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void g0(t43 t43Var, boolean z) {
        t43Var.setValue(Boolean.valueOf(z));
    }

    public static final void h(boolean z, fe0 fe0Var, final int i) {
        final boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-437879451);
        int i2 = (go1Var.h(z) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            z2 = z;
            p70.e(z2, null, a, b, null, j42.c, go1Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(z2, i) { // from class: qj5
                public final /* synthetic */ boolean I;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    on5.h(this.I, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final boolean h0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void i(rm1 rm1Var, boolean z, String str, String str2, tm1 tm1Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(997114932);
        if ((i & 6) == 0) {
            i2 = (go1Var2.i(rm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var2.i(tm1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var2.i(tc0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (go1Var2.T(i3 & 1, (i3 & 74899) != 74898)) {
            t43 x = ad4.x(tm1Var, go1Var2);
            i13 i13Var = i13.a;
            l13 p = mw2.p(nq4.g(nq4.e(i13Var, 1.0f), 56.0f), hx2.e, hx2.i);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (z2 || Q == jpVar) {
                Q = new jk2(rm1Var, (byte) 1);
                go1Var2.o0(Q);
            }
            uw2 uw2Var = (uw2) Q;
            int Q2 = i82.Q(go1Var2.T);
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, p);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z3 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, uw2Var);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q2);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            r55.b(str, null, hx2.a, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.a(), go1Var2, (i3 >> 6) & 14, 24576, 114682);
            vv vvVar = q8.N;
            boolean g = go1Var2.g(x);
            Object Q3 = go1Var2.Q();
            if (g || Q3 == jpVar) {
                Q3 = new bi4(x, (byte) 5);
                go1Var2.o0(Q3);
            }
            l13 b2 = m05.b(i13Var, wd5.a, (PointerInputEventHandler) Q3);
            boolean z4 = i4 == 4;
            Object Q4 = go1Var2.Q();
            byte b3 = 15;
            if (z4 || Q4 == jpVar) {
                Q4 = new b40(rm1Var, b3);
                go1Var2.o0(Q4);
            }
            l13 v = j42.v(b2, (tm1) Q4);
            uw2 c2 = px.c(vvVar, false);
            int Q5 = i82.Q(go1Var2.T);
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, v);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, c2);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(Q5, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            c21.b(rm1Var, z ? 1.0f : 0.45f, nq4.g(nq4.e(i13Var, 1.0f), 14.0f), 0.0f, 0.0f, go1Var2, i4 | RendererCapabilities.DECODER_SUPPORT_MASK, 24);
            go1Var2.q(true);
            r55.b(str2, null, hx2.b, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.a(), go1Var2, (i3 >> 9) & 14, 24576, 114682);
            go1Var = go1Var2;
            uw2 c3 = px.c(q8.J, false);
            int Q6 = i82.Q(go1Var.T);
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c3);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(Q6, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x03);
            tc0Var.invoke(go1Var, Integer.valueOf((i3 >> 15) & 14));
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj0(rm1Var, z, str, str2, tm1Var, tc0Var, i);
        }
    }

    public static final int i0(s33 s33Var) {
        return ((gk3) s33Var).h();
    }

    public static final void j(int i, fe0 fe0Var, hx1 hx1Var, String str) {
        String str2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-284677347);
        int i2 = i | (go1Var.g(hx1Var) ? 4 : 2) | (go1Var.g(str) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            go1Var.d0(1302982253);
            long j = ((fw2) go1Var.k(lw2.b)).a.s;
            go1Var.q(false);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(hx1Var, null, nq4.k(i13Var, 14.0f), j, go1Var, (i2 & 14) | 432);
            str2 = str;
            r55.b(str2, null, j, oh4.j(12), qk1.N, 0L, null, 0L, 0, false, 0, 0, null, go1Var, ((i2 >> 3) & 14) | 1597440, 0, 262058);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            str2 = str;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uh0((byte) 12, i, hx1Var, str2);
        }
    }

    public static final void j0(t43 t43Var, Tracks tracks) {
        int i;
        int i2;
        ay1 listIterator = tracks.getGroups().listIterator(0);
        listIterator.getClass();
        String str = null;
        Format format = null;
        while (listIterator.hasNext()) {
            Tracks.Group group = (Tracks.Group) listIterator.next();
            if (group.getType() == 2) {
                int i3 = group.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    if (group.isTrackSelected(i4)) {
                        format = group.getTrackFormat(i4);
                        break;
                    }
                    i4++;
                }
            }
            if (format != null) {
                break;
            }
        }
        if (format != null && (i = format.width) > 0 && (i2 = format.height) > 0) {
            str = i + "x" + i2;
        }
        t43Var.setValue(str);
    }

    public static final void k(boolean z, final String str, final boolean z2, final boolean z3, l13 l13Var, fe0 fe0Var, final int i) {
        int i2;
        boolean z4;
        final l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1100915052);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.h(z3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            i13 i13Var = i13.a;
            z4 = z;
            p70.e(z4, i13Var, a, b, null, p70.u0(1667232324, new in1() { // from class: em5
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ui) obj).getClass();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        boolean z5 = z2;
                        p70.k(str3, null, z5 ? e21.t() : jx4.D(str3, "取消点赞", false) ? k21.G() : jx4.D(str3, "点赞", false) ? sp0.O() : jx4.D(str3, "取消收藏", false) ? kb4.A() : jx4.D(str3, "收藏", false) ? wi4.o() : g4.B(), z3 && !z5, z5, null, go1Var2, 0, 34);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, (i3 & 14) | 200064 | ((i3 >> 9) & 112), 16);
            l13Var2 = i13Var;
        } else {
            z4 = z;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            final boolean z5 = z4;
            u.d = new hn1() { // from class: fm5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    on5.k(z5, str, z2, z3, l13Var2, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final float k0(t43 t43Var) {
        return ((r11) t43Var.getValue()).I;
    }

    public static final void l(wy2 wy2Var, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2122198524);
        int i2 = (go1Var.g(wy2Var) ? 4 : 2) | i | (go1Var.g(l13Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long j = wy2Var.e() ? k80Var.d : k80Var.q;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), wy2Var.e() ? k80Var.c : k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "menu_tile_bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "menu_tile_fg", go1Var, 3072);
            tv tvVar = q8.W;
            kp kpVar = new kp(6.0f, true, new y9());
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new gm4(t43Var, (byte) 21);
                go1Var.o0(Q3);
            }
            l13 d2 = r13.d(mw2.B(i42.A0(l13Var, (tm1) Q3), wy2Var.a(), null, 2), null, null, null, null, wy2Var.a() ? wy2Var.d() : null, null, null, null, null, null, null, t33Var, 130815);
            ba0 a2 = z90.a(kpVar, tvVar, go1Var, 54);
            int Q4 = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, d2);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 l13Var2 = i13.a;
            l13 u = r7.u(20.0f, nq4.k(l13Var2, 64.0f), t0);
            uw2 c2 = px.c(q8.N, false);
            int Q5 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, u);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c2);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            hx1 b2 = wy2Var.b();
            String c3 = wy2Var.c();
            long c4 = wy2Var.a() ? j : x70.c(j, 0.5f);
            l13 k = nq4.k(l13Var2, 24.0f);
            if (wy2Var.a()) {
                l13Var2 = p70.G(l13Var2, s0, j, false, null, 12);
            }
            ow1.a(b2, c3, k.then(l13Var2), c4, go1Var, 0);
            go1Var.q(true);
            r55.b(wy2Var.c(), null, wy2Var.a() ? k80Var.q : k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, 0, 24960, 110586);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new bj1((byte) 26, i, wy2Var, l13Var);
        }
    }

    public static final void l0(t43 t43Var, boolean z) {
        t43Var.setValue(Boolean.valueOf(z));
    }

    public static final void m(MixInfo mixInfo, fe0 fe0Var, int i) {
        int i2;
        byte b2;
        x04 u;
        lk5 lk5Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2061884465);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(mixInfo) : go1Var.i(mixInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b3 = 0;
        if (!go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            b2 = 1;
            go1Var.W();
        } else {
            if (mixInfo == null) {
                u = go1Var.u();
                if (u != null) {
                    lk5Var = new lk5(mixInfo, i, b3);
                    u.d = lk5Var;
                }
                return;
            }
            int max = Math.max(mixInfo.getStatis().getTotalEpisode(), mixInfo.getStatis().getUpdatedToEpisode());
            int currentEpisode = mixInfo.getStatis().getCurrentEpisode();
            StringBuilder sb = new StringBuilder();
            if (currentEpisode > 0) {
                sb.append("第" + currentEpisode + "集");
            }
            if (currentEpisode > 0 && max > 0) {
                sb.append(" / ");
            }
            if (max > 0) {
                sb.append("共" + max + "集");
            }
            String sb2 = sb.toString();
            uv uvVar = q8.T;
            kp kpVar = new kp(8.0f, true, new y9());
            i13 i13Var = i13.a;
            l13 G0 = i42.G0(i13Var, 0.0f, 10.0f, 0.0f, 0.0f, 13);
            u74 a2 = t74.a(kpVar, uvVar, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, G0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            kp kpVar2 = new kp(4.0f, true, new y9());
            l13 D0 = i42.D0(mw2.p(o7.m(new sc2(1.0f, false), l74.a(999.0f)), ut0.C(go1Var).h, mw2.j), 8.0f, 3.0f);
            u74 a3 = t74.a(kpVar2, uvVar, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, D0);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(li4.g(), null, nq4.k(i13Var, 12.0f), ut0.C(go1Var).i, go1Var, 432);
            String mixName = mixInfo.getMixName();
            if (jx4.L(mixName)) {
                mixName = "未命名合集";
            }
            b2 = 1;
            r55.b("合集 · " + ((Object) mixName), nq4.p(i13Var, 0.0f, 360.0f, 1), ut0.C(go1Var).i, 0L, null, 0L, null, 0L, 2, false, 1, 0, ut0.H(go1Var).n, go1Var, 48, 24960, 110584);
            go1Var = go1Var;
            go1Var.q(true);
            if (jx4.L(sb2)) {
                go1Var.d0(1393949807);
                go1Var.q(false);
            } else {
                go1Var.d0(1393676573);
                r55.b(sb2, null, ut0.C(go1Var).q, oh4.j(12), null, 0L, null, 0L, 0, false, 1, 0, ut0.H(go1Var).l, go1Var, 24576, 27648, 106474);
                go1Var = go1Var;
                go1Var.q(false);
            }
            go1Var.q(true);
        }
        u = go1Var.u();
        if (u != null) {
            lk5Var = new lk5(mixInfo, i, b2);
            u.d = lk5Var;
        }
    }

    public static final boolean m0(cw4 cw4Var) {
        return ((Boolean) cw4Var.getValue()).booleanValue();
    }

    public static final void n(l13 l13Var, long j, fe0 fe0Var, final int i) {
        go1 go1Var;
        final l13 l13Var2;
        final long j2;
        l13 l13Var3;
        long L0;
        String B;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1706766790);
        int i2 = i | 22;
        if (go1Var2.T(i2 & 1, (i2 & 19) != 18)) {
            go1Var2.Y();
            int i3 = i & 1;
            i13 i13Var = i13.a;
            if (i3 == 0 || go1Var2.C()) {
                l13Var3 = i13Var;
                L0 = L0(go1Var2);
            } else {
                go1Var2.W();
                l13Var3 = l13Var;
                L0 = j;
            }
            go1Var2.r();
            Locale locale = Locale.getDefault();
            boolean g = go1Var2.g(locale);
            Object Q = go1Var2.Q();
            if (g || Q == de0.a) {
                Q = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(locale));
                go1Var2.o0(Q);
            }
            DecimalFormat decimalFormat = (DecimalFormat) Q;
            i51 i51Var = lw2.b;
            l13 l13Var4 = l13Var3;
            r55.b("·", null, ((fw2) go1Var2.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, 6, 0, 262138);
            ow1.a(ui4.i(), "网速", nq4.k(i13Var, 12.0f), ((fw2) go1Var2.k(i51Var)).a.s, go1Var2, 432);
            if (L0 < 1022976) {
                B = (L0 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) + "KB/s";
            } else {
                B = r7.B(decimalFormat.format(Float.valueOf((L0 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / 1024.0f)), "MB/s");
            }
            go1Var = go1Var2;
            r55.b(B, nq4.m(l13Var4, 60.0f, Float.NaN, Float.NaN, Float.NaN), ((fw2) go1Var2.k(i51Var)).a.s, oh4.j(12), null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var, 24576, 24576, 114664);
            j2 = L0;
            l13Var2 = l13Var4;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
            j2 = j;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(j2, i) { // from class: jk5
                public final /* synthetic */ long J;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    on5.n(l13.this, this.J, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final Aweme n0(t43 t43Var) {
        return (Aweme) t43Var.getValue();
    }

    public static final void o(final long j, final boolean z, l13 l13Var, fe0 fe0Var, final int i) {
        final l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1700226990);
        int i2 = i | (go1Var.f(j) ? 4 : 2) | (go1Var.h(z) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            e02 e02Var = null;
            if (z) {
                go1Var.d0(-912814321);
                e02Var = c21.i(c21.F("nowPlaying", go1Var), 0.0f, 1.0f, qb.R(qb.k0(1600, 2, m61.b), null, 0L, 6), "nowPlayingPhase", go1Var);
                go1Var.q(false);
            } else {
                go1Var.d0(-912530020);
                go1Var.q(false);
            }
            boolean g = go1Var.g(e02Var) | ((i2 & 14) == 4);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                Q = new bm2(e02Var, j, (byte) 2);
                go1Var.o0(Q);
            }
            l13Var2 = l13Var;
            oh4.a(go1Var, j42.t(l13Var2, (tm1) Q));
        } else {
            l13Var2 = l13Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(j, z, l13Var2, i) { // from class: gl5
                public final /* synthetic */ long I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ l13 K;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(385);
                    on5.o(this.I, this.J, this.K, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final int o0(s33 s33Var) {
        return ((gk3) s33Var).h();
    }

    public static final void p(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(682927063);
        if (go1Var.T(i & 1, i != 0)) {
            ne1 ne1Var = nq4.c;
            vv vvVar = q8.N;
            uw2 c2 = px.c(vvVar, false);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, ne1Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            i13 i13Var = i13.a;
            l13 p = mw2.p(o7.m(nq4.k(i13Var, 80.0f), l74.a), hx2.e, mw2.j);
            uw2 c3 = px.c(vvVar, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(jl2.I(), "暂停", nq4.k(i13Var, 44.0f), hx2.a, go1Var, 432);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 29, i);
        }
    }

    public static final String p0(t43 t43Var) {
        return (String) t43Var.getValue();
    }

    public static final void q(final boolean z, final String str, final rj3 rj3Var, final boolean z2, fe0 fe0Var, final int i) {
        int i2;
        x04 u;
        hn1 hn1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-599489077);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= (i & 512) == 0 ? go1Var.g(rj3Var) : go1Var.i(rj3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.h(z2) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            cw4 b2 = eh.b(z ? 1.0f : 0.0f, qb.k0(160, 6, null), "placeholderAlpha", go1Var, 3120);
            boolean g = go1Var.g(b2);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = dt4.b(new tt2(b2, (byte) 10));
                go1Var.o0(Q);
            }
            cw4 cw4Var = (cw4) Q;
            if (!z && ((Boolean) cw4Var.getValue()).booleanValue()) {
                u = go1Var.u();
                if (u != null) {
                    final byte b3 = 0;
                    hn1Var = new hn1() { // from class: zj5
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b3;
                            wd5 wd5Var = wd5.a;
                            int i3 = i;
                            switch (b4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X = mu0.X(i3 | 1);
                                    on5.q(z, str, rj3Var, z2, (fe0) obj, X);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X2 = mu0.X(i3 | 1);
                                    on5.q(z, str, rj3Var, z2, (fe0) obj, X2);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u.d = hn1Var;
                }
                return;
            }
            ne1 ne1Var = nq4.c;
            boolean g2 = go1Var.g(b2);
            Object Q2 = go1Var.Q();
            byte b4 = 3;
            if (g2 || Q2 == jpVar) {
                Q2 = new z20(b2, b4);
                go1Var.o0(Q2);
            }
            l13 p = mw2.p(qb.O(ne1Var, (tm1) Q2), hx2.f, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            int Q3 = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, p);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            int i3 = i2 >> 3;
            s(str, rj3Var, ne1Var, go1Var, (i3 & 112) | (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (rj3.$stable << 3));
            if (z2) {
                go1Var.d0(-1859528046);
                p70.g(null, 0.0f, hx2.e, hx2.a, go1Var, 0, 3);
                go1Var.q(false);
            } else {
                go1Var.d0(-1859363715);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        u = go1Var.u();
        if (u != null) {
            final byte b5 = 1;
            hn1Var = new hn1() { // from class: zj5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b42 = b5;
                    wd5 wd5Var = wd5.a;
                    int i32 = i;
                    switch (b42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int X = mu0.X(i32 | 1);
                            on5.q(z, str, rj3Var, z2, (fe0) obj, X);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int X2 = mu0.X(i32 | 1);
                            on5.q(z, str, rj3Var, z2, (fe0) obj, X2);
                            break;
                    }
                    return wd5Var;
                }
            };
            u.d = hn1Var;
        }
    }

    public static final uj3 q0(t43 t43Var) {
        return (uj3) t43Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final boolean r23, final java.lang.String r24, final boolean r25, final defpackage.so3 r26, defpackage.l13 r27, defpackage.fe0 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.r(boolean, java.lang.String, boolean, so3, l13, fe0, int, int):void");
    }

    public static final PlayerView r0(t43 t43Var) {
        return (PlayerView) t43Var.getValue();
    }

    public static final void s(String str, rj3 rj3Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1955801983);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(rj3Var) : go1Var.i(rj3Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            jp jpVar = li0.b;
            if (rj3Var != null) {
                go1Var.d0(-229309926);
                ut0.a(rj3Var, null, l13Var, null, jpVar, 0.0f, null, go1Var, rj3.$stable | 24624 | ((i2 >> 3) & 14) | (i2 & 896), 104);
                go1Var.q(false);
            } else if (str.length() > 0) {
                go1Var.d0(-229093701);
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(str, null, l13Var, null, null, null, jpVar, 0.0f, null, 0, false, go1Var, (i2 & 14) | 1572912 | (i2 & 896), 0, 1976);
                go1Var.q(false);
            } else {
                go1Var.d0(-228926301);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(str, rj3Var, l13Var, i, (byte) 9);
        }
    }

    public static final int s0(s33 s33Var) {
        return ((gk3) s33Var).h();
    }

    public static final void t(final rm1 rm1Var, final long j, l13 l13Var, boolean z, boolean z2, fe0 fe0Var, final int i, final int i2) {
        l13 l13Var2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        final boolean z5;
        final boolean z6;
        final l13 l13Var3;
        x04 u;
        hn1 hn1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-34038875);
        int i6 = i | (go1Var.f(j) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | RendererCapabilities.DECODER_SUPPORT_MASK;
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            i3 = i6 | (go1Var.g(l13Var2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (go1Var.h(z3) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i4 | (go1Var.h(z4) ? 16384 : 8192);
        }
        if (go1Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            l13 l13Var4 = i7 != 0 ? i13.a : l13Var2;
            boolean z7 = i8 != 0 ? false : z3;
            boolean z8 = i9 != 0 ? true : z4;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new fk3(0.0f);
                go1Var.o0(Q);
            }
            fk3 fk3Var = (fk3) Q;
            Long valueOf = Long.valueOf(j);
            boolean z9 = (i5 & 112) == 32;
            Object Q2 = go1Var.Q();
            if (z9 || Q2 == jpVar) {
                im5 im5Var = new im5(j, rm1Var, fk3Var, null, (byte) 0);
                go1Var.o0(im5Var);
                Q2 = im5Var;
            }
            mw2.i(rm1Var, valueOf, (hn1) Q2, go1Var);
            if (z7) {
                go1Var.d0(-439232691);
                float f = z8 ? 1.0f : 0.0f;
                l13 g = nq4.g(i42.D0(nq4.e(l13Var4, 1.0f), 16.0f, 6.0f), 8.0f);
                Object Q3 = go1Var.Q();
                if (Q3 == jpVar) {
                    Q3 = new ml5(fk3Var, (byte) 1);
                    go1Var.o0(Q3);
                }
                c21.b((rm1) Q3, f, g, 3.0f, 16.0f, go1Var, 27654, 0);
                go1Var.q(false);
                u = go1Var.u();
                if (u != null) {
                    final l13 l13Var5 = l13Var4;
                    final byte b2 = 0;
                    final boolean z10 = z7;
                    final boolean z11 = z8;
                    hn1Var = new hn1(rm1Var, j, l13Var5, z10, z11, i, i2, b2) { // from class: zl5
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ rm1 J;
                        public final /* synthetic */ long K;
                        public final /* synthetic */ l13 L;
                        public final /* synthetic */ boolean M;
                        public final /* synthetic */ boolean N;
                        public final /* synthetic */ byte O;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.I = b2;
                            this.O = i2;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.I;
                            wd5 wd5Var = wd5.a;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int X = mu0.X(7);
                                    on5.t(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X, this.O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int X2 = mu0.X(7);
                                    on5.t(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X2, this.O);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u.d = hn1Var;
                }
                return;
            }
            l13 l13Var6 = l13Var4;
            z5 = z7;
            z6 = z8;
            go1Var.d0(-438879043);
            go1Var.q(false);
            l13 g2 = nq4.g(nq4.e(l13Var6, 1.0f), 2.0f);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new e35((Object) fk3Var, (byte) 5);
                go1Var.o0(Q4);
            }
            oh4.a(go1Var, j42.t(g2, (tm1) Q4));
            l13Var3 = l13Var6;
        } else {
            go1Var.W();
            z5 = z3;
            z6 = z4;
            l13Var3 = l13Var2;
        }
        u = go1Var.u();
        if (u != null) {
            final byte b3 = 1;
            hn1Var = new hn1(rm1Var, j, l13Var3, z5, z6, i, i2, b3) { // from class: zl5
                public final /* synthetic */ byte I;
                public final /* synthetic */ rm1 J;
                public final /* synthetic */ long K;
                public final /* synthetic */ l13 L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ byte O;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.I = b3;
                    this.O = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b32 = this.I;
                    wd5 wd5Var = wd5.a;
                    switch (b32) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int X = mu0.X(7);
                            on5.t(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X, this.O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int X2 = mu0.X(7);
                            on5.t(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X2, this.O);
                            break;
                    }
                    return wd5Var;
                }
            };
            u.d = hn1Var;
        }
    }

    public static final boolean t0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void u(final long j, boolean z, final boolean z2, final rm1 rm1Var, final rm1 rm1Var2, final ru4 ru4Var, final VideoBigThumb videoBigThumb, final boolean z3, final ki1 ki1Var, rm1 rm1Var3, final boolean z4, final rm1 rm1Var4, final tm1 tm1Var, final rm1 rm1Var5, final rm1 rm1Var6, final tm1 tm1Var2, final l13 l13Var, fe0 fe0Var, final int i) {
        int i2;
        rm1 rm1Var7;
        rm1 rm1Var8;
        go1 go1Var;
        boolean z5;
        rm1 rm1Var9;
        l13 e;
        boolean z6;
        float f;
        sg sgVar;
        sg sgVar2;
        float f2;
        rm1 rm1Var10;
        tm1 tm1Var3;
        rm1 rm1Var11;
        boolean z7;
        boolean z8;
        final float f3;
        jp jpVar;
        go1 go1Var2;
        final boolean z9;
        sg sgVar3 = q8.a0;
        sg sgVar4 = q8.d0;
        sg sgVar5 = q8.b0;
        sg sgVar6 = q8.c0;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(-1093300017);
        if ((i & 6) == 0) {
            i2 = (go1Var3.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var3.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            rm1Var7 = rm1Var;
            i2 |= go1Var3.i(rm1Var7) ? 2048 : 1024;
        } else {
            rm1Var7 = rm1Var;
        }
        int i3 = i2;
        if ((i & 24576) == 0) {
            rm1Var8 = rm1Var2;
            i3 |= go1Var3.i(rm1Var8) ? 16384 : 8192;
        } else {
            rm1Var8 = rm1Var2;
        }
        if ((i & 196608) == 0) {
            i3 |= go1Var3.g(ru4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= (i & 2097152) == 0 ? go1Var3.g(videoBigThumb) : go1Var3.i(videoBigThumb) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= go1Var3.h(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= go1Var3.g(ki1Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= go1Var3.i(rm1Var3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i4 = 197040 | (go1Var3.h(z4) ? 4 : 2) | (go1Var3.i(rm1Var5) ? 2048 : 1024) | (go1Var3.i(rm1Var6) ? 16384 : 8192) | (go1Var3.g(l13Var) ? 1048576 : 524288);
        if (go1Var3.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            float floatValue = ((Number) rm1Var7.invoke()).floatValue();
            long j2 = (long) (j * floatValue);
            tc0 u0 = p70.u0(-469390172, new bj1(wx5.F(videoBigThumb, j2, j, go1Var3, ((i3 << 6) & 896) | VideoBigThumb.$stable | ((i3 >> 18) & 14)), (String) rm1Var8.invoke(), (byte) 27), go1Var3);
            rm1 h = bp3.h(rm1Var4, go1Var3, 48);
            ne1 ne1Var = nq4.c;
            Object Q = go1Var3.Q();
            jp jpVar2 = de0.a;
            if (Q == jpVar2) {
                Q = new c40(rm1Var4, (byte) 5);
                go1Var3.o0(Q);
            }
            px.a(m05.b(ne1Var, wd5.a, (PointerInputEventHandler) Q), go1Var3, 0);
            boolean b2 = ru4Var.b();
            i13 i13Var = i13.a;
            if (b2) {
                go1Var3.d0(-1761375375);
                go1Var3.q(false);
                e = nq4.n(i13Var, ((r11) j42.P(new r11(ru4Var.a() + ru4Var.e), new r11(ru4Var.c - (ru4Var.b.I * 2.0f)))).I);
                z6 = false;
            } else {
                go1Var3.d0(-1761180788);
                e = nq4.e(i13Var, r13.e(go1Var3) ? 0.92f : 0.72f);
                z6 = false;
                go1Var3.q(false);
            }
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var3.d0(-1761044047);
                l13 p = mw2.p(ne1Var, hx2.h, mw2.j);
                uw2 c2 = px.c(q8.N, false);
                f = floatValue;
                int Q2 = i82.Q(go1Var3.T);
                am3 m = go1Var3.m();
                l13 x0 = i42.x0(go1Var3, p);
                xd0.c.getClass();
                go1Var3.h0();
                if (go1Var3.S) {
                    go1Var3.l(df0Var);
                } else {
                    go1Var3.r0();
                }
                sgVar2 = sgVar6;
                qi4.k(go1Var3, sgVar2, c2);
                sgVar = sgVar5;
                qi4.k(go1Var3, sgVar, m);
                qi4.k(go1Var3, sgVar4, Integer.valueOf(Q2));
                qi4.j(go1Var3);
                qi4.k(go1Var3, sgVar3, x0);
                u0.invoke(go1Var3, 6);
                go1Var3.q(true);
                go1Var3.q(false);
            } else {
                boolean z10 = z6;
                f = floatValue;
                sgVar = sgVar5;
                sgVar2 = sgVar6;
                go1Var3.d0(-1760826861);
                go1Var3.q(z10);
            }
            l13 then = l13Var.then(e);
            boolean g = go1Var3.g(h);
            Object Q3 = go1Var3.Q();
            if (g || Q3 == jpVar2) {
                Q3 = new b40(h, (byte) 19);
                go1Var3.o0(Q3);
            }
            l13 x = j42.x(qb.O(then, (tm1) Q3), ki1Var);
            rm1 rm1Var12 = null;
            z5 = z;
            l13 B = mw2.B(x, z5, null, 2);
            Object Q4 = go1Var3.Q();
            if (Q4 == jpVar2) {
                f2 = f;
                rm1Var10 = rm1Var4;
                Q4 = new mo0(rm1Var10, (byte) 15);
                go1Var3.o0(Q4);
            } else {
                f2 = f;
                rm1Var10 = rm1Var4;
            }
            l13 a2 = r13.a(B, (rm1) Q4);
            if (z2) {
                tm1Var3 = tm1Var;
                go1Var3.d0(-1760312882);
                go1Var3.q(false);
                rm1Var11 = null;
            } else {
                go1Var3.d0(-1760352623);
                Object Q5 = go1Var3.Q();
                if (Q5 == jpVar2) {
                    tm1Var3 = tm1Var;
                    Q5 = new wn(tm1Var3, (byte) 7);
                    go1Var3.o0(Q5);
                } else {
                    tm1Var3 = tm1Var;
                }
                go1Var3.q(false);
                rm1Var11 = (rm1) Q5;
            }
            if (z2) {
                z7 = false;
                go1Var3.d0(-1760216658);
            } else {
                go1Var3.d0(-1760255438);
                Object Q6 = go1Var3.Q();
                if (Q6 == jpVar2) {
                    Q6 = new wn(tm1Var3, (byte) 8);
                    go1Var3.o0(Q6);
                }
                rm1Var12 = (rm1) Q6;
                z7 = false;
            }
            go1Var3.q(z7);
            rm1 rm1Var13 = rm1Var12;
            Object Q7 = go1Var3.Q();
            if (Q7 == jpVar2) {
                Q7 = new mo0(rm1Var10, (byte) 16);
                go1Var3.o0(Q7);
            }
            rm1 rm1Var14 = (rm1) Q7;
            go1Var3.d0(1605794247);
            zu2 zu2Var = new zu2();
            if (z2) {
                z8 = false;
                go1Var3.d0(476626783);
                go1Var3.q(false);
            } else {
                go1Var3.d0(476427856);
                Object Q8 = go1Var3.Q();
                if (Q8 == jpVar2) {
                    Q8 = new wn(tm1Var3, (byte) 9);
                    go1Var3.o0(Q8);
                }
                zu2Var.put(21, (rm1) Q8);
                Object Q9 = go1Var3.Q();
                if (Q9 == jpVar2) {
                    Q9 = new wn(tm1Var3, (byte) 10);
                    go1Var3.o0(Q9);
                }
                zu2Var.put(22, (rm1) Q9);
                z8 = false;
                go1Var3.q(false);
            }
            zu2 b3 = zu2Var.b();
            go1Var3.q(z8);
            l13 G0 = i42.G0(r13.d(a2, rm1Var11, rm1Var13, rm1Var5, rm1Var6, null, null, rm1Var14, null, b3, null, null, null, 256938), 0.0f, 0.0f, 0.0f, 48.0f + ((r11) go1Var3.k(r13.a)).I, 7);
            ba0 a3 = z90.a(i42.d, q8.W, go1Var3, 48);
            int Q10 = i82.Q(go1Var3.T);
            am3 m2 = go1Var3.m();
            l13 x02 = i42.x0(go1Var3, G0);
            xd0.c.getClass();
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(df0Var);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, sgVar2, a3);
            qi4.k(go1Var3, sgVar, m2);
            qi4.k(go1Var3, sgVar4, Integer.valueOf(Q10));
            qi4.j(go1Var3);
            qi4.k(go1Var3, sgVar3, x02);
            Object Q11 = go1Var3.Q();
            if (Q11 == jpVar2) {
                f3 = f2;
                Q11 = new fk3(f3);
                go1Var3.o0(Q11);
            } else {
                f3 = f2;
            }
            final fk3 fk3Var = (fk3) Q11;
            Long valueOf = Long.valueOf(j);
            boolean z11 = ((i3 & C.ENCODING_PCM_DOUBLE) == 536870912) | ((i3 & 14) == 4);
            Object Q12 = go1Var3.Q();
            if (z11 || Q12 == jpVar2) {
                rm1Var9 = rm1Var3;
                jpVar = jpVar2;
                go1Var2 = go1Var3;
                im5 im5Var = new im5(j, rm1Var9, fk3Var, null, (byte) 1);
                go1Var2.o0(im5Var);
                Q12 = im5Var;
            } else {
                rm1Var9 = rm1Var3;
                go1Var2 = go1Var3;
                jpVar = jpVar2;
            }
            mw2.i(rm1Var9, valueOf, (hn1) Q12, go1Var2);
            boolean d2 = ((i4 & 14) == 4) | go1Var2.d(f3);
            Object Q13 = go1Var2.Q();
            if (d2 || Q13 == jpVar) {
                z9 = z4;
                Q13 = new rm1() { // from class: am5
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        return Float.valueOf(ut0.q(z9 ? f3 : fk3Var.h(), 0.0f, 1.0f));
                    }
                };
                go1Var2.o0(Q13);
            } else {
                z9 = z4;
            }
            rm1 rm1Var15 = (rm1) Q13;
            String G02 = G0(j2);
            String G03 = G0(j);
            if (z3) {
                u0 = j42.e;
            }
            go1 go1Var4 = go1Var2;
            i(rm1Var15, z9, G02, G03, tm1Var2, u0, go1Var4, ((i4 << 3) & 112) | 24576);
            go1Var = go1Var4;
            go1Var.q(true);
        } else {
            go1Var = go1Var3;
            z5 = z;
            rm1Var9 = rm1Var3;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final rm1 rm1Var16 = rm1Var9;
            final boolean z12 = z5;
            u.d = new hn1() { // from class: bm5
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    on5.u(j, z12, z2, rm1Var, rm1Var2, ru4Var, videoBigThumb, z3, ki1Var, rm1Var16, z4, rm1Var4, tm1Var, rm1Var5, rm1Var6, tm1Var2, l13Var, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final boolean u0(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void v(final String str, boolean z, final boolean z2, final boolean z3, final ExoPlayer exoPlayer, final dp3 dp3Var, final pq5 pq5Var, final float f, final long j, final int i, final int i2, final OkHttpClient okHttpClient, final Object obj, final boolean z4, String str2, rj3 rj3Var, final boolean z5, final boolean z6, String str3, final boolean z7, final List list, final rm1 rm1Var, final float f2, final float f3, final so0 so0Var, final vo0 vo0Var, final float f4, final float f5, final boolean z8, final rm1 rm1Var2, final tm1 tm1Var, final tm1 tm1Var2, final tm1 tm1Var3, final tm1 tm1Var4, final rm1 rm1Var3, final tm1 tm1Var5, final hn1 hn1Var, final tm1 tm1Var6, final rm1 rm1Var4, rm1 rm1Var5, final tm1 tm1Var7, fe0 fe0Var, final int i3, final int i4, final int i5) {
        String str4;
        int i6;
        ExoPlayer exoPlayer2;
        int i7;
        int i8;
        boolean z9;
        String str5;
        rj3 rj3Var2;
        go1 go1Var;
        boolean z10;
        String str6 = str3;
        rm1 rm1Var6 = rm1Var5;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(635218884);
        if ((i3 & 6) == 0) {
            str4 = str;
            i6 = i3 | (go1Var2.g(str4) ? 4 : 2);
        } else {
            str4 = str;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= go1Var2.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= go1Var2.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            exoPlayer2 = exoPlayer;
            i6 |= go1Var2.i(exoPlayer2) ? 16384 : 8192;
        } else {
            exoPlayer2 = exoPlayer;
        }
        if ((i3 & 196608) == 0) {
            i6 |= go1Var2.e(dp3Var.ordinal()) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= go1Var2.g(pq5Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= go1Var2.d(f) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= go1Var2.f(j) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= go1Var2.e(i) ? 536870912 : 268435456;
        }
        int i9 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (go1Var2.e(i2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= go1Var2.i(okHttpClient) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= go1Var2.i(obj) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= go1Var2.h(z4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= go1Var2.g(str2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i7 |= (262144 & i4) == 0 ? go1Var2.g(rj3Var) : go1Var2.i(rj3Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= go1Var2.h(z5) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= go1Var2.h(z6) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i7 |= go1Var2.g(str6) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= go1Var2.h(z7) ? 536870912 : 268435456;
        }
        int i10 = i7;
        if ((i5 & 6) == 0) {
            i8 = i5 | ((i5 & 8) == 0 ? go1Var2.g(list) : go1Var2.i(list) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= go1Var2.i(rm1Var) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= go1Var2.d(f2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= go1Var2.d(f3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= go1Var2.e(so0Var.ordinal()) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i8 |= go1Var2.e(vo0Var.ordinal()) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i8 |= go1Var2.d(f4) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= go1Var2.d(f5) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i8 |= go1Var2.h(z8) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i8 |= go1Var2.i(rm1Var2) ? 536870912 : 268435456;
        }
        int i11 = i8;
        int i12 = 3072 | (go1Var2.i(tm1Var) ? 4 : 2) | (go1Var2.i(tm1Var2) ? 32 : 16) | (go1Var2.i(tm1Var3) ? 256 : 128) | (go1Var2.i(rm1Var3) ? 16384 : 8192) | (go1Var2.i(tm1Var5) ? 131072 : 65536) | (go1Var2.i(hn1Var) ? 1048576 : 524288) | (go1Var2.i(tm1Var6) ? 8388608 : 4194304) | (go1Var2.i(rm1Var4) ? 67108864 : 33554432) | (go1Var2.i(rm1Var6) ? 536870912 : 268435456);
        if (!go1Var2.T(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378) ? false : true)) {
            z9 = z;
            str5 = str2;
            rj3Var2 = rj3Var;
            go1Var = go1Var2;
            go1Var.W();
        } else if (str4.length() <= 0 || !(z || z3)) {
            z9 = z;
            str5 = str2;
            rj3Var2 = rj3Var;
            go1Var = go1Var2;
            go1Var.d0(183835721);
            ne1 ne1Var = nq4.c;
            l13 p = mw2.p(ne1Var, hx2.f, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, p);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            int i13 = i10 >> 12;
            s(str5, rj3Var2, ne1Var, go1Var, (i13 & 112) | (i13 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (rj3.$stable << 3));
            go1Var.q(true);
            go1Var.q(false);
        } else {
            go1Var2.d0(181402252);
            int i14 = i11 >> 21;
            int i15 = i12 << 15;
            int i16 = i12 << 12;
            int i17 = i12 >> 15;
            ro5.a(str4, z && !z2, exoPlayer2, z, false, dp3Var, pq5Var, f, j, i, i2, okHttpClient, rm1Var2, tm1Var4, obj, tm1Var, tm1Var2, tm1Var3, rm1Var3, tm1Var5, hn1Var, false, tm1Var6, rm1Var4, tm1Var7, null, go1Var2, (i9 & 14) | ((i9 >> 6) & 896) | ((i9 << 6) & 7168) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & C.ENCODING_PCM_DOUBLE), (i10 & WebSocketProtocol.PAYLOAD_SHORT) | (i14 & 896) | 3072 | ((i10 << 6) & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i16 & 234881024) | (i16 & C.ENCODING_PCM_DOUBLE), ((i12 >> 18) & 14) | (i17 & 896) | (i17 & 7168) | 24576, 35651600);
            go1 go1Var3 = go1Var2;
            if (z4 || !z7 || list.isEmpty()) {
                z10 = false;
                go1Var3.d0(183314270);
                go1Var3.q(false);
            } else {
                go1Var3.d0(182569185);
                int i18 = i11 << 9;
                i42.I(list, rm1Var, z && !z2, nq4.c, z7, f2, f3, so0Var.J, vo0Var.J, f4, f5, hx2.a, hx2.g, z8, go1Var3, (i11 & 14) | 3072 | (i11 & 112) | ((i10 >> 15) & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & C.ENCODING_PCM_DOUBLE), (i14 & 14) | ((i11 >> 15) & 7168));
                go1Var3 = go1Var3;
                z10 = false;
                go1Var3.q(false);
            }
            if (z4 || z5) {
                z9 = z;
                str6 = str3;
            } else {
                str6 = str3;
                if (str6 != null) {
                    go1Var3.d0(183389941);
                    z9 = z;
                    rm1Var6 = rm1Var5;
                    F(str6, z9, rm1Var6, go1Var3, ((i10 >> 24) & 14) | (i9 & 112) | ((i12 >> 21) & 896));
                    go1Var3.q(z10);
                    rj3Var2 = rj3Var;
                    go1Var = go1Var3;
                    str5 = str2;
                    go1Var.q(z10);
                } else {
                    z9 = z;
                }
            }
            rm1Var6 = rm1Var5;
            if (z4) {
                rj3Var2 = rj3Var;
                go1Var = go1Var3;
                str5 = str2;
                go1Var.d0(183812254);
                go1Var.q(z10);
            } else {
                go1Var3.d0(183581614);
                int i19 = i10 >> 9;
                rj3Var2 = rj3Var;
                q(!z5, str2, rj3Var2, z6, go1Var3, (i19 & 896) | (i19 & 112) | (rj3.$stable << 6) | ((i10 >> 12) & 7168));
                go1Var = go1Var3;
                str5 = str2;
                go1Var.q(z10);
            }
            go1Var.q(z10);
        }
        x04 u = go1Var.u();
        if (u != null) {
            final rj3 rj3Var3 = rj3Var2;
            final String str7 = str5;
            final String str8 = str6;
            final boolean z11 = z9;
            final rm1 rm1Var7 = rm1Var6;
            u.d = new hn1() { // from class: dm5
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int X = mu0.X(i3 | 1);
                    int X2 = mu0.X(i4);
                    int X3 = mu0.X(i5);
                    on5.v(str, z11, z2, z3, exoPlayer, dp3Var, pq5Var, f, j, i, i2, okHttpClient, obj, z4, str7, rj3Var3, z5, z6, str8, z7, list, rm1Var, f2, f3, so0Var, vo0Var, f4, f5, z8, rm1Var2, tm1Var, tm1Var2, tm1Var3, tm1Var4, rm1Var3, tm1Var5, hn1Var, tm1Var6, rm1Var4, rm1Var7, tm1Var7, (fe0) obj2, X, X2, X3);
                    return wd5.a;
                }
            };
        }
    }

    public static final void v0(kq5 kq5Var, dl0 dl0Var, t43 t43Var, t43 t43Var2, t43 t43Var3, boolean z, t43 t43Var4, s33 s33Var, t43 t43Var5, t43 t43Var6, Aweme aweme, t43 t43Var7, t43 t43Var8, int i, gp3 gp3Var) {
        if (kq5Var == null || ((Boolean) t43Var.getValue()).booleanValue() || ((gp3) t43Var2.getValue()) != null) {
            return;
        }
        MixInfo mixInfo = z ? (MixInfo) t43Var3.getValue() : null;
        if (mixInfo == null || mixInfo.getMixId().length() <= 0) {
            p70.g0(dl0Var, null, null, new jn5(kq5Var, aweme, t43Var, t43Var6, t43Var7, t43Var8, null, (byte) 1), 3);
        } else {
            p70.g0(dl0Var, null, null, new kn5(gp3Var, kq5Var, mixInfo, i, t43Var, t43Var2, t43Var4, s33Var, t43Var5, t43Var6, null), 3);
        }
    }

    public static final void w(final boolean z, final boolean z2, final String str, final String str2, final String str3, final boolean z3, final boolean z4, final rm1 rm1Var, final rm1 rm1Var2, final rm1 rm1Var3, final rm1 rm1Var4, final l13 l13Var, fe0 fe0Var, final int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-812065587);
        int i2 = i | (go1Var.h(z) ? 4 : 2) | (go1Var.h(z2) ? 32 : 16) | (go1Var.g(str) ? 256 : 128) | (go1Var.g(str2) ? 2048 : 1024) | (go1Var.g(str3) ? 16384 : 8192) | (go1Var.h(z3) ? 131072 : 65536) | (go1Var.h(z4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.i(rm1Var) ? 8388608 : 4194304) | (go1Var.i(rm1Var2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432) | (go1Var.i(rm1Var3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        int i3 = (go1Var.i(rm1Var4) ? 4 : 2) | (go1Var.g(l13Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            ba0 a2 = z90.a(new kp(18.0f, true, new y9()), q8.W, go1Var, 54);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(Q));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            if (z3) {
                go1Var.d0(1090716531);
                x(z ? sp0.O() : k21.G(), str, z ? "取消点赞" : "点赞", rm1Var, go1Var, ((i2 >> 3) & 112) | ((i2 >> 12) & 7168));
                go1Var.q(false);
            } else {
                go1Var.d0(1091004831);
                go1Var.q(false);
            }
            x(j42.B(), str2, "评论", rm1Var3, go1Var, ((i2 >> 6) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i2 >> 18) & 7168));
            if (z3 && z4) {
                go1Var.d0(1091274004);
                x(z2 ? wi4.o() : hc4.N(), str3, z2 ? "取消收藏" : "收藏", rm1Var2, go1Var, ((i2 >> 9) & 112) | ((i2 >> 15) & 7168));
                go1Var.q(false);
            } else {
                go1Var.d0(1091561343);
                go1Var.q(false);
            }
            x(vt0.y(), null, "更多", rm1Var4, go1Var, ((i3 << 9) & 7168) | 432);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(z, z2, str, str2, str3, z3, z4, rm1Var, rm1Var2, rm1Var3, rm1Var4, l13Var, i) { // from class: fk5
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ String K;
                public final /* synthetic */ String L;
                public final /* synthetic */ String M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ boolean O;
                public final /* synthetic */ rm1 P;
                public final /* synthetic */ rm1 Q;
                public final /* synthetic */ rm1 R;
                public final /* synthetic */ rm1 S;
                public final /* synthetic */ l13 T;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    on5.w(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void w0(kq5 kq5Var, dl0 dl0Var, t43 t43Var, t43 t43Var2, Aweme aweme, s33 s33Var, t43 t43Var3) {
        if (((Boolean) t43Var.getValue()).booleanValue() || !((Boolean) t43Var2.getValue()).booleanValue() || kq5Var == null) {
            return;
        }
        p70.g0(dl0Var, null, null, new tg0(kq5Var, aweme, t43Var, s33Var, t43Var3, t43Var2, null, (byte) 6), 3);
    }

    public static final void x(hx1 hx1Var, String str, String str2, rm1 rm1Var, fe0 fe0Var, int i) {
        hx1 hx1Var2;
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1981949874);
        if ((i & 6) == 0) {
            hx1Var2 = hx1Var;
            i2 = (go1Var.g(hx1Var2) ? 4 : 2) | i;
        } else {
            hx1Var2 = hx1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            tv tvVar = q8.W;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new hn(t43Var, (byte) 2);
                go1Var.o0(Q3);
            }
            i13 i13Var = i13.a;
            l13 C0 = i42.C0(mw2.B(r13.d(mw2.p(o7.m(i42.A0(i13Var, (tm1) Q3), l74.a(12.0f)), (((Boolean) t43Var.getValue()).booleanValue() || ((Boolean) w.getValue()).booleanValue()) ? hx2.e : x70.f, mw2.j), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 8.0f);
            ba0 a2 = z90.a(i42.d, tvVar, go1Var, 48);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, C0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            long j2 = hx2.a;
            int i4 = i2 >> 3;
            ow1.a(hx1Var2, str2, nq4.k(i13Var, 28.0f), j2, go1Var, (i4 & 112) | (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
            if (str != null) {
                go1Var.d0(-2013731665);
                r55.b(str, null, j2, oh4.j(11), qk1.N, 0L, null, 0L, 0, false, 0, 0, null, go1Var, (i4 & 14) | 1597440, 0, 262058);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(-2013536582);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qi2(hx1Var, str, str2, rm1Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x0(t43 t43Var, kq5 kq5Var, dl0 dl0Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, boolean z, s33 s33Var, t43 t43Var5, t43 t43Var6, Aweme aweme, t43 t43Var7, t43 t43Var8, boolean z2) {
        Set keySet = ((Map) t43Var.getValue()).keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (!z2) {
            if (((Boolean) t43Var5.getValue()).booleanValue()) {
                v0(kq5Var, dl0Var, t43Var2, t43Var3, t43Var4, z, t43Var, s33Var, t43Var5, t43Var6, aweme, t43Var7, t43Var8, ((gk3) s33Var).h(), gp3.J);
                return;
            }
            return;
        }
        Iterator it = keySet.iterator();
        if (!it.hasNext()) {
            zy.k();
            return;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        int intValue = ((Number) comparable).intValue();
        if (intValue <= 0) {
            return;
        }
        int i = intValue - 20;
        if (i < 0) {
            i = 0;
        }
        v0(kq5Var, dl0Var, t43Var2, t43Var3, t43Var4, z, t43Var, s33Var, t43Var5, t43Var6, aweme, t43Var7, t43Var8, i, gp3.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final com.github.mytv.dv.model.Aweme r55, final com.github.mytv.dv.model.MixInfo r56, final boolean r57, final boolean r58, final boolean r59, final boolean r60, final boolean r61, final boolean r62, final defpackage.rm1 r63, final long r64, final boolean r66, java.util.List r67, boolean r68, final long r69, final defpackage.tm1 r71, final defpackage.rm1 r72, final defpackage.rm1 r73, final defpackage.rm1 r74, final defpackage.rm1 r75, final defpackage.rm1 r76, final defpackage.rm1 r77, final defpackage.rm1 r78, final defpackage.rm1 r79, defpackage.rm1 r80, boolean r81, defpackage.rm1 r82, boolean r83, final defpackage.l13 r84, defpackage.fe0 r85, final int r86, final int r87, final int r88, final int r89) {
        /*
            Method dump skipped, instructions count: 2959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.y(com.github.mytv.dv.model.Aweme, com.github.mytv.dv.model.MixInfo, boolean, boolean, boolean, boolean, boolean, boolean, rm1, long, boolean, java.util.List, boolean, long, tm1, rm1, rm1, rm1, rm1, rm1, rm1, rm1, rm1, rm1, boolean, rm1, boolean, l13, fe0, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:12:0x00a4->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y0(android.view.View r18, defpackage.t43 r19, defpackage.t43 r20, defpackage.t43 r21, defpackage.t43 r22, defpackage.t43 r23, defpackage.t43 r24, defpackage.ki1 r25, defpackage.gj0 r26) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.y0(android.view.View, t43, t43, t43, t43, t43, t43, ki1, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        if (r9 == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(com.github.mytv.dv.model.Aweme r44, boolean r45, java.lang.Integer r46, defpackage.rm1 r47, defpackage.l13 r48, defpackage.fe0 r49, int r50) {
        /*
            Method dump skipped, instructions count: 2023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.z(com.github.mytv.dv.model.Aweme, boolean, java.lang.Integer, rm1, l13, fe0, int):void");
    }

    public static final void z0(boolean z, kq5 kq5Var, Aweme aweme, s33 s33Var, t43 t43Var, s33 s33Var2, s33 s33Var3, t43 t43Var2, t43 t43Var3, s33 s33Var4, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, t43 t43Var9, t43 t43Var10, s33 s33Var5) {
        gk3 gk3Var = (gk3) s33Var;
        gk3Var.i(gk3Var.h() + 1);
        pn5 pn5Var = pn5.I;
        t43Var.setValue((!z || kq5Var == null) ? pn5.J : pn5Var);
        W(s33Var2, 1);
        c0(s33Var3, ((gk3) s33Var3).h() + 1);
        Boolean bool = Boolean.FALSE;
        t43Var2.setValue(bool);
        g0(t43Var3, false);
        gk3 gk3Var2 = (gk3) s33Var4;
        gk3Var2.i(gk3Var2.h() + 1);
        l0(t43Var4, false);
        t43Var5.setValue(null);
        t43Var6.setValue(bool);
        t43Var7.setValue(bool);
        t43Var8.setValue(bool);
        t43Var9.setValue(null);
        if (aweme == null || !N(aweme)) {
            aweme = null;
        }
        t43Var10.setValue(aweme);
        if (((pn5) t43Var.getValue()) == pn5Var && ((Aweme) t43Var10.getValue()) == null) {
            gk3 gk3Var3 = (gk3) s33Var5;
            gk3Var3.i(gk3Var3.h() + 1);
        }
    }
}
