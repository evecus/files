package com.github.mytv.dv.widget;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.R;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import defpackage.a91;
import defpackage.av0;
import defpackage.ax0;
import defpackage.bv0;
import defpackage.bx0;
import defpackage.ca0;
import defpackage.cv0;
import defpackage.cx0;
import defpackage.dt1;
import defpackage.eg5;
import defpackage.ev0;
import defpackage.f30;
import defpackage.fb4;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fv0;
import defpackage.g4;
import defpackage.gb5;
import defpackage.go1;
import defpackage.gv0;
import defpackage.hf1;
import defpackage.hi3;
import defpackage.hn1;
import defpackage.hv0;
import defpackage.i80;
import defpackage.il2;
import defpackage.in1;
import defpackage.j10;
import defpackage.jq1;
import defpackage.jv0;
import defpackage.jx4;
import defpackage.kb4;
import defpackage.ku3;
import defpackage.kv0;
import defpackage.l65;
import defpackage.lq1;
import defpackage.lq2;
import defpackage.lv0;
import defpackage.mu0;
import defpackage.mv0;
import defpackage.nv0;
import defpackage.o70;
import defpackage.oc0;
import defpackage.oh4;
import defpackage.ov0;
import defpackage.p65;
import defpackage.p70;
import defpackage.pk1;
import defpackage.pt1;
import defpackage.pv0;
import defpackage.qj;
import defpackage.qv0;
import defpackage.r7;
import defpackage.rd;
import defpackage.rv0;
import defpackage.sv0;
import defpackage.t8;
import defpackage.tv0;
import defpackage.uv0;
import defpackage.v74;
import defpackage.ve;
import defpackage.vt0;
import defpackage.vv0;
import defpackage.wd5;
import defpackage.x04;
import defpackage.x74;
import defpackage.yt5;
import defpackage.yu0;
import defpackage.zu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DesktopWidgetsKt {
    private static final long SIZE_22 = vt0.a(156.0f, 192.0f);
    private static final long SIZE_42 = vt0.a(320.0f, 192.0f);
    private static final long SIZE_43 = vt0.a(320.0f, 292.0f);
    private static final long SIZE_CAR = vt0.a(536.0f, 260.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContinueLarge(List<WidgetVideo> list, Bitmap bitmap, Bitmap bitmap2, List<Bitmap> list2, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1634381679);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(bitmap) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(bitmap2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            lq2.l(fb4.n(jq1.a), 0, 0, p70.u0(-2074399755, new tv0(bitmap, (WidgetVideo) o70.T0(list), list2, bitmap2, list), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new oc0(list, bitmap, bitmap2, list2, i, (byte) 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueLarge$lambda$0(Bitmap bitmap, WidgetVideo widgetVideo, List list, Bitmap bitmap2, List list2, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.WidgetCover(bitmap, fb4.m(new yt5(new ax0(99.0f))), "最近看过", null, WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playHistory(widgetVideo.getId()), go1Var, 0), widgetVideo.getTitle(), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
            g4.b(il2.W(fb4.m(new yt5(bx0.a)), 12.0f, 6.0f, 0.0f, 12), 0, 0, p70.u0(-1420436629, new ku3(widgetVideo, list, bitmap2, list2, (byte) 5), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueLarge$lambda$0$0(WidgetVideo widgetVideo, List list, Bitmap bitmap, List list2, ca0 ca0Var, fe0 fe0Var, int i) {
        int i2;
        ca0Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 1;
        byte b2 = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            kb4.e(widgetVideo.getTitle(), null, new l65(((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette())).getProviders().t, new p65(oh4.j(15)), new pk1(500), null, 120), 2, go1Var, 3072, 2);
            g4.a(new hi3(il2.h0(0.0f), il2.h0((13 & 2) != 0 ? 0.0f : 8.0f), il2.h0((13 & 4) != 0 ? 0.0f : 4.0f), il2.h0(0.0f)), null, p70.u0(-329925687, new av0(widgetVideo, bitmap, b), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            eg5.c(new dt1(bx0.a), go1Var, 0);
            if (list.isEmpty()) {
                go1Var.d0(2086434615);
                go1Var.q(false);
            } else {
                go1Var.d0(2085581247);
                kb4.e("更早看过", null, new l65(((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette())).getProviders().v, new p65(oh4.j(11)), null, null, 124), 0, go1Var, 6, 10);
                lq2.l(il2.W(new yt5(cx0.a), 0.0f, 6.0f, 8.0f, 5), 0, 0, p70.u0(1481392938, new ov0(list, list2, b2), go1Var), go1Var, 3072, 6);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueLarge$lambda$0$0$0(WidgetVideo widgetVideo, Bitmap bitmap, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetMeta(widgetVideo, bitmap, false, go1Var, WidgetVideo.$stable, 4);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueLarge$lambda$0$0$1(List list, List list2, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2) : i;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p70.A0();
                    throw null;
                }
                WidgetVideo widgetVideo = (WidgetVideo) list2.get(i4);
                WidgetUiKt.WidgetCover((Bitmap) obj, fb4.y(new yt5(bx0.a), 56.0f), null, null, WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playHistory(widgetVideo.getId()), go1Var, 0), widgetVideo.getTitle(), go1Var, 0, 12);
                if (i3 < list.size() - 1) {
                    go1Var.d0(-453495948);
                    eg5.c(new yt5(new ax0(8.0f)), go1Var, 0);
                } else {
                    go1Var.d0(-1173439824);
                }
                go1Var.q(false);
                i3 = i4;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueLarge$lambda$1(List list, Bitmap bitmap, Bitmap bitmap2, List list2, int i, fe0 fe0Var, int i2) {
        ContinueLarge(list, bitmap, bitmap2, list2, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContinueSmall(WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-914753752);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(widgetVideo) : go1Var.i(widgetVideo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(bitmap) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(bitmap2) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(600244126, new pv0(bitmap, widgetVideo, bitmap2), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(widgetVideo, bitmap, bitmap2, i, (byte) 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueSmall$lambda$0(Bitmap bitmap, WidgetVideo widgetVideo, Bitmap bitmap2, ca0 ca0Var, fe0 fe0Var, int i) {
        int i2;
        ca0Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetCover(bitmap, fb4.y(fb4.o(jq1Var), 100.0f), "最近看过", null, WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playHistory(widgetVideo.getId()), go1Var, 0), widgetVideo.getTitle(), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
            kb4.e(widgetVideo.getTitle(), il2.W(fb4.o(jq1Var), 4.0f, 8.0f, 0.0f, 8), new l65(((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette())).getProviders().t, new p65(oh4.j(13)), new pk1(500), null, 120), 2, go1Var, 3072, 0);
            eg5.c(new dt1(bx0.a), go1Var, 0);
            g4.a(il2.W(jq1Var, 4.0f, 0.0f, 2.0f, 2), null, p70.u0(-1273301764, new av0(widgetVideo, bitmap2, b), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueSmall$lambda$0$0(WidgetVideo widgetVideo, Bitmap bitmap, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetMeta(widgetVideo, bitmap, true, go1Var, WidgetVideo.$stable | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 ContinueSmall$lambda$1(WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, int i, fe0 fe0Var, int i2) {
        ContinueSmall(widgetVideo, bitmap, bitmap2, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    private static final void HotWordRow(int i, WidgetHotWord widgetHotWord, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-902765882);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(widgetHotWord) : go1Var.i(widgetHotWord) ? 32 : 16;
        }
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            WidgetPalette widgetPalette = (WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette());
            int label = widgetHotWord.getLabel();
            lq2.l(g4.r(fb4.y(new yt5(cx0.a), 36.0f), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.searchResult(widgetHotWord.getWord()), go1Var, 0)), 0, 1, p70.u0(907536098, new bv0(i, widgetPalette, widgetHotWord, label != 1 ? label != 2 ? label != 3 ? null : new gb5("荐", widgetPalette.getProviders().g, widgetPalette.getProviders().h) : new gb5("热", widgetPalette.getProviders().c, widgetPalette.getProviders().d) : new gb5("新", widgetPalette.getProviders().k, widgetPalette.getProviders().l)), go1Var), go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new f30(i, widgetHotWord, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 HotWordRow$lambda$0(int i, WidgetPalette widgetPalette, WidgetHotWord widgetHotWord, gb5 gb5Var, v74 v74Var, fe0 fe0Var, int i2) {
        int i3;
        v74Var.getClass();
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            byte b = 3;
            kb4.e(String.valueOf(i), new yt5(new ax0(18.0f)), new l65(i <= 3 ? widgetPalette.getProviders().a : widgetPalette.getProviders().v, new p65(oh4.j(14)), new pk1(700), WidgetUiKt.getWidgetNumberFont(), 56), 0, go1Var, 0, 8);
            kb4.e(widgetHotWord.getWord(), il2.W(new yt5(bx0.a), 6.0f, 0.0f, 0.0f, 14), new l65(widgetPalette.getProviders().t, new p65(oh4.j(13)), null, null, 124), 1, go1Var, 3072, 0);
            if (gb5Var != null) {
                go1Var.d0(-410587039);
                g4.a(il2.V(WidgetUiKt.tintedBackground(new dt1(new ax0(18.0f)), (i80) gb5Var.J, 8), 4.0f), t8.d, p70.u0(1305391881, new rd(gb5Var, b), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                go1Var.q(false);
            } else {
                go1Var.d0(-410249728);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 HotWordRow$lambda$0$0(gb5 gb5Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            kb4.e((String) gb5Var.I, null, new l65((i80) gb5Var.K, new p65(oh4.j(10)), new pk1(700), null, 120), 0, go1Var, 0, 10);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 HotWordRow$lambda$1(int i, WidgetHotWord widgetHotWord, int i2, fe0 fe0Var, int i3) {
        HotWordRow(i, widgetHotWord, fe0Var, mu0.X(i2 | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LaterCompact(final List<WidgetVideo> list, final List<Bitmap> list2, final int i, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-633425837);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.e(i) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(928981021, new in1() { // from class: wv0
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wd5 LaterCompact$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    LaterCompact$lambda$0 = DesktopWidgetsKt.LaterCompact$lambda$0(i, list, list2, (ca0) obj, (fe0) obj2, intValue);
                    return LaterCompact$lambda$0;
                }
            }, go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cv0(list, list2, i, i2, (byte) 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterCompact$lambda$0(int i, List list, List list2, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2;
        }
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.WidgetHeader("稍后再看", R.drawable.widget_ic_schedule, pt1.t(i, " 条"), false, go1Var, 6, 8);
            eg5.c(new dt1(new ax0(8.0f)), go1Var, 0);
            lq2.l(new yt5(cx0.a).a(new dt1(bx0.a)), 0, 0, p70.u0(1261724985, new ov0(list, list2, b), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterCompact$lambda$0$0(List list, List list2, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2) : i;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p70.A0();
                    throw null;
                }
                WidgetVideo widgetVideo = (WidgetVideo) obj;
                WidgetUiKt.WidgetCover((Bitmap) o70.V0(i3, list2), fb4.m(new yt5(bx0.a)), null, widgetVideo.getLikes(), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playLater(widgetVideo.getId()), go1Var, 0), widgetVideo.getTitle(), go1Var, 0, 4);
                if (i3 < list.size() - 1) {
                    go1Var.d0(-1519657109);
                    eg5.c(new yt5(new ax0(8.0f)), go1Var, 0);
                } else {
                    go1Var.d0(135302553);
                }
                go1Var.q(false);
                i3 = i4;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterCompact$lambda$1(List list, List list2, int i, int i2, fe0 fe0Var, int i3) {
        LaterCompact(list, list2, i, fe0Var, mu0.X(i2 | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LaterExpanded(final List<WidgetVideo> list, final List<Bitmap> list2, final List<Bitmap> list3, final int i, fe0 fe0Var, final int i2) {
        int i3;
        int i4;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-370363143);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? go1Var.g(list3) : go1Var.i(list3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= go1Var.e(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(-2140625597, new hv0(i4, list, list2, (WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), list3), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: iv0
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    wd5 LaterExpanded$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    LaterExpanded$lambda$1 = DesktopWidgetsKt.LaterExpanded$lambda$1(list, list2, list3, i, i2, (fe0) obj, intValue);
                    return LaterExpanded$lambda$1;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterExpanded$lambda$0(int i, List list, List list2, WidgetPalette widgetPalette, List list3, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            WidgetUiKt.WidgetHeader("稍后再看", R.drawable.widget_ic_schedule, pt1.t(i, " 条"), false, go1Var, 6, 8);
            eg5.c(new dt1(new ax0(8.0f)), go1Var, 0);
            lq2.l(new yt5(cx0.a), 0, 0, p70.u0(2007278943, new ku3(list, list2, widgetPalette, list3, (byte) 3), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterExpanded$lambda$0$0(List list, List list2, WidgetPalette widgetPalette, List list3, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2) : i;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p70.A0();
                    throw null;
                }
                g4.b(new yt5(bx0.a), 0, 0, p70.u0(329121477, new hv0(list2, i3, (WidgetVideo) obj, widgetPalette, list3), go1Var), go1Var, 3072, 6);
                if (i3 < list.size() - 1) {
                    go1Var.d0(1812136913);
                    eg5.c(new yt5(new ax0(8.0f)), go1Var, 0);
                } else {
                    go1Var.d0(341702131);
                }
                go1Var.q(false);
                i3 = i4;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterExpanded$lambda$0$0$0$0(List list, int i, WidgetVideo widgetVideo, WidgetPalette widgetPalette, List list2, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            Bitmap bitmap = (Bitmap) o70.V0(i, list);
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetCover(bitmap, fb4.y(fb4.o(jq1Var), 140.0f), null, widgetVideo.getLikes(), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playLater(widgetVideo.getId()), go1Var, 0), widgetVideo.getTitle(), go1Var, 0, 4);
            kb4.e(widgetVideo.getTitle(), il2.W(jq1Var, 0.0f, 6.0f, 0.0f, 13), new l65(widgetPalette.getProviders().t, new p65(oh4.j(12)), new pk1(500), null, 120), 2, go1Var, 3072, 0);
            lq2.l(il2.W(jq1Var, 0.0f, 4.0f, 0.0f, 13), 0, 1, p70.u0(-1883164119, new bv0(list2, i, widgetVideo, widgetPalette, (byte) 1), go1Var), go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterExpanded$lambda$0$0$0$0$0(List list, int i, WidgetVideo widgetVideo, WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i2) {
        v74Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            WidgetUiKt.m131WidgetAvataruFdPcIQ((Bitmap) o70.V0(i, list), 16.0f, null, go1Var, 48, 4);
            eg5.c(new yt5(new ax0(6.0f)), go1Var, 0);
            kb4.e(widgetVideo.getAuthor(), null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(11)), null, null, 124), 1, go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LaterExpanded$lambda$1(List list, List list2, List list3, int i, int i2, fe0 fe0Var, int i3) {
        LaterExpanded(list, list2, list3, i, fe0Var, mu0.X(i2 | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LiveCompact(List<WidgetLiveItem> list, List<Bitmap> list2, int i, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-159915817);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.e(i) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            lq2.l(fb4.n(jq1.a), 0, 1, p70.u0(-457133509, new bv0((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), list, i, list2), go1Var), go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cv0(list, list2, i, i2, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveCompact$lambda$0(WidgetPalette widgetPalette, List list, int i, List list2, v74 v74Var, fe0 fe0Var, int i2) {
        v74Var.getClass();
        int i3 = (i2 & 6) == 0 ? i2 | ((i2 & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2) : i2;
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            g4.b(g4.r(WidgetUiKt.tintedBackground(fb4.V(jq1.a, 72.0f), widgetPalette.getProviders().c, 20), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.live(), go1Var, 0)), 1, 1, p70.u0(-1973525839, new vv0(widgetPalette, i, b), go1Var), go1Var, 3072, 0);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p70.A0();
                    throw null;
                }
                WidgetLiveItem widgetLiveItem = (WidgetLiveItem) obj;
                g4.b(g4.r(new yt5(bx0.a), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.liveRoom(widgetLiveItem.getRoomId()), go1Var, 0)), 0, 1, p70.u0(-259094427, new bv0(list2, i4, widgetLiveItem, widgetPalette, (byte) 4), go1Var), go1Var, 3072, 2);
                i4 = i5;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveCompact$lambda$0$0(WidgetPalette widgetPalette, int i, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            WidgetUiKt.WidgetIcon(R.drawable.widget_ic_live, widgetPalette.getProviders().d, fb4.V(jq1.a, 20.0f), null, go1Var, 0, 8);
            kb4.e(pt1.t(i, " 人在播"), null, new l65(widgetPalette.getProviders().d, new p65(oh4.j(11)), new pk1(700), WidgetUiKt.getWidgetNumberFont(), 56), 0, go1Var, 0, 10);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveCompact$lambda$0$1$0(List list, int i, WidgetLiveItem widgetLiveItem, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            WidgetUiKt.m131WidgetAvataruFdPcIQ((Bitmap) o70.V0(i, list), 48.0f, null, go1Var, 48, 4);
            kb4.e(widgetLiveItem.getAuthor(), null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(11)), null, null, 124), 1, go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveCompact$lambda$1(List list, List list2, int i, int i2, fe0 fe0Var, int i3) {
        LiveCompact(list, list2, i, fe0Var, mu0.X(i2 | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LiveExpanded(final List<WidgetLiveItem> list, final List<Bitmap> list2, long j, fe0 fe0Var, int i) {
        int i2;
        long j2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(269548024);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            j2 = j;
            i2 |= go1Var.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            final WidgetPalette widgetPalette = (WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette());
            final long j3 = j2;
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(1459520366, new in1() { // from class: xu0
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wd5 LiveExpanded$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    LiveExpanded$lambda$0 = DesktopWidgetsKt.LiveExpanded$lambda$0(j3, list, list2, widgetPalette, (ca0) obj, (fe0) obj2, intValue);
                    return LiveExpanded$lambda$0;
                }
            }, go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ev0(list, list2, j, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveExpanded$lambda$0(long j, List list, List list2, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            String widgetTime = WidgetUiKt.widgetTime(j);
            if (jx4.L(widgetTime)) {
                widgetTime = null;
            }
            WidgetUiKt.WidgetHeader("关注的直播", R.drawable.widget_ic_live, widgetTime != null ? widgetTime.concat(" 更新") : null, true, go1Var, 3078, 0);
            eg5.c(new dt1(new ax0(4.0f)), go1Var, 0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WidgetLiveItem widgetLiveItem = (WidgetLiveItem) it.next();
                lq2.l(g4.r(fb4.y(new yt5(cx0.a), 42.0f), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.liveRoom(widgetLiveItem.getRoomId()), go1Var, 0)), 0, 1, p70.u0(1257435340, new ku3(list2, list, widgetLiveItem, widgetPalette, (byte) 4), go1Var), go1Var, 3072, 2);
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveExpanded$lambda$0$2$0(List list, List list2, final WidgetLiveItem widgetLiveItem, final WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        final byte b = 0;
        final byte b2 = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.m131WidgetAvataruFdPcIQ((Bitmap) o70.V0(list2.indexOf(widgetLiveItem), list), 36.0f, null, go1Var, 48, 4);
            g4.b(il2.V(new yt5(bx0.a), 10.0f), 0, 0, p70.u0(1611610134, new in1() { // from class: dv0
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wd5 LiveExpanded$lambda$0$2$0$0;
                    wd5 LiveExpanded$lambda$0$2$0$1;
                    byte b3 = b;
                    ca0 ca0Var = (ca0) obj;
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            LiveExpanded$lambda$0$2$0$0 = DesktopWidgetsKt.LiveExpanded$lambda$0$2$0$0(widgetLiveItem, widgetPalette, ca0Var, fe0Var2, intValue);
                            return LiveExpanded$lambda$0$2$0$0;
                        default:
                            LiveExpanded$lambda$0$2$0$1 = DesktopWidgetsKt.LiveExpanded$lambda$0$2$0$1(widgetLiveItem, widgetPalette, ca0Var, fe0Var2, intValue);
                            return LiveExpanded$lambda$0$2$0$1;
                    }
                }
            }, go1Var), go1Var, 3072, 6);
            g4.b(null, 0, 2, p70.u0(-560539457, new in1() { // from class: dv0
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wd5 LiveExpanded$lambda$0$2$0$0;
                    wd5 LiveExpanded$lambda$0$2$0$1;
                    byte b3 = b2;
                    ca0 ca0Var = (ca0) obj;
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            LiveExpanded$lambda$0$2$0$0 = DesktopWidgetsKt.LiveExpanded$lambda$0$2$0$0(widgetLiveItem, widgetPalette, ca0Var, fe0Var2, intValue);
                            return LiveExpanded$lambda$0$2$0$0;
                        default:
                            LiveExpanded$lambda$0$2$0$1 = DesktopWidgetsKt.LiveExpanded$lambda$0$2$0$1(widgetLiveItem, widgetPalette, ca0Var, fe0Var2, intValue);
                            return LiveExpanded$lambda$0$2$0$1;
                    }
                }
            }, go1Var), go1Var, 3072, 3);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveExpanded$lambda$0$2$0$0(WidgetLiveItem widgetLiveItem, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e(widgetLiveItem.getAuthor(), null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(13)), new pk1(500), null, 120), 1, go1Var, 3072, 2);
            kb4.e(widgetLiveItem.getTitle(), null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(11)), null, null, 124), 1, go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveExpanded$lambda$0$2$0$1(WidgetLiveItem widgetLiveItem, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e(widgetLiveItem.getViewers(), null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(12)), new pk1(500), WidgetUiKt.getWidgetNumberFont(), 56), 1, go1Var, 3072, 2);
            kb4.e("在看", null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(10)), null, null, 124), 0, go1Var, 6, 10);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LiveExpanded$lambda$1(List list, List list2, long j, int i, fe0 fe0Var, int i2) {
        LiveExpanded(list, list2, j, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MixCompact(WidgetMixItem widgetMixItem, Bitmap bitmap, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(540587082);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(widgetMixItem) : go1Var.i(widgetMixItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(bitmap) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(-1179086144, new nv0((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), bitmap, widgetMixItem), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 3, i, widgetMixItem, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0(WidgetPalette widgetPalette, Bitmap bitmap, WidgetMixItem widgetMixItem, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        byte b = 4;
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            lq2.l(null, 0, 1, p70.u0(-1322377436, new yu0(widgetPalette, b), go1Var), go1Var, 3072, 3);
            cx0 cx0Var = cx0.a;
            lq2.l(il2.W(new yt5(cx0Var), 0.0f, 8.0f, 0.0f, 13), 0, 1, p70.u0(434345435, new nv0(bitmap, widgetMixItem, widgetPalette), go1Var), go1Var, 3072, 2);
            eg5.c(new dt1(bx0.a), go1Var, 0);
            lq2.l(new yt5(cx0Var), 0, 0, p70.u0(1399908252, new j10((Object) widgetMixItem, (byte) 3), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0$0(WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            i80 i80Var = widgetPalette.getProviders().a;
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetIcon(R.drawable.widget_ic_video_library, i80Var, fb4.V(jq1Var, 16.0f), null, go1Var, 0, 8);
            eg5.c(fb4.f0(jq1Var, 5.0f), go1Var, 0);
            kb4.e("合集追更", null, new l65(widgetPalette.getProviders().a, new p65(oh4.j(11)), new pk1(500), null, 120), 0, go1Var, 6, 10);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0$1(Bitmap bitmap, WidgetMixItem widgetMixItem, WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.WidgetCover(bitmap, fb4.V(jq1.a, 64.0f), null, null, WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.mixDetail(widgetMixItem.getId()), go1Var, 0), null, go1Var, 0, 44);
            g4.b(il2.W(((x74) v74Var).a(), 12.0f, 0.0f, 0.0f, 14), 0, 0, p70.u0(2123448657, new uv0(widgetMixItem, widgetPalette, b), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0$1$0(WidgetMixItem widgetMixItem, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e(widgetMixItem.getName(), null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(15)), new pk1(700), null, 120), 1, go1Var, 3072, 2);
            String author = widgetMixItem.getAuthor();
            if (jx4.L(author)) {
                author = null;
            }
            List k0 = p70.k0(author, widgetMixItem.getTotal() > 0 ? r7.z("共 ", widgetMixItem.getTotal(), " 集") : null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : k0) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            kb4.e(o70.Z0(arrayList, " · ", null, null, 0, null, 62), null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(11)), null, null, 124), 1, go1Var, 3072, 2);
            g4.a(new hi3(il2.h0(0.0f), il2.h0(6.0f), il2.h0(0.0f), il2.h0(0.0f)), null, p70.u0(1624747439, new sv0(widgetMixItem, b), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0$1$0$1(WidgetMixItem widgetMixItem, fe0 fe0Var, int i) {
        String z;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            float episode = widgetMixItem.getTotal() > 0 ? widgetMixItem.getEpisode() / widgetMixItem.getTotal() : 0.0f;
            if (widgetMixItem.getTotal() > 0) {
                z = widgetMixItem.getEpisode() + " / " + widgetMixItem.getTotal();
            } else {
                z = r7.z("第 ", widgetMixItem.getEpisode(), " 集");
            }
            WidgetUiKt.WidgetProgress(episode, z, go1Var, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$0$2(WidgetMixItem widgetMixItem, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            WidgetUiKt.m134WidgetTextButtonFJfuzF0(r7.z("继续第 ", widgetMixItem.getEpisode(), " 集"), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playMix(widgetMixItem.getId(), widgetMixItem.getResumeAwemeId()), go1Var, 0), new yt5(bx0.a), true, 48.0f, go1Var, 27648, 0);
            for (WidgetEpisode widgetEpisode : o70.l1(widgetMixItem.getNextEpisodes(), 3)) {
                eg5.c(new yt5(new ax0(4.0f)), go1Var, 0);
                WidgetUiKt.m134WidgetTextButtonFJfuzF0(pt1.t(widgetEpisode.getNumber(), " 集"), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.playMix(widgetMixItem.getId(), widgetEpisode.getAwemeId()), go1Var, 0), new yt5(new ax0(46.0f)), false, 48.0f, go1Var, 24576, 8);
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixCompact$lambda$1(WidgetMixItem widgetMixItem, Bitmap bitmap, int i, fe0 fe0Var, int i2) {
        MixCompact(widgetMixItem, bitmap, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MixExpanded(List<WidgetMixItem> list, List<Bitmap> list2, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-744690542);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(list2) : go1Var.i(list2) ? 32 : 16;
        }
        byte b = 1;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(401884808, new pv0(list, (WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), list2, b), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj(list, i, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixExpanded$lambda$0(List list, WidgetPalette widgetPalette, List list2, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            WidgetUiKt.WidgetHeader("合集追更", R.drawable.widget_ic_video_library, null, false, go1Var, 6, 12);
            eg5.c(new dt1(new ax0(8.0f)), go1Var, 0);
            int i2 = 0;
            for (Object obj : o70.l1(list, 3)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p70.A0();
                    throw null;
                }
                WidgetMixItem widgetMixItem = (WidgetMixItem) obj;
                lq2.l(il2.V(g4.r(WidgetUiKt.tintedBackground(fb4.y(new yt5(cx0.a), 72.0f), widgetPalette.getSurfaceContainerHigh(), 12), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.mixDetail(widgetMixItem.getId()), go1Var, 0)), 10.0f), 0, 1, p70.u0(1174796960, new bv0(list2, i2, widgetMixItem, widgetPalette, (byte) 3), go1Var), go1Var, 3072, 2);
                if (i2 < o70.l1(list, 3).size() - 1) {
                    go1Var.d0(-1392139065);
                    eg5.c(new dt1(new ax0(6.0f)), go1Var, 0);
                } else {
                    go1Var.d0(-206604418);
                }
                go1Var.q(false);
                i2 = i3;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixExpanded$lambda$0$0$0(List list, int i, WidgetMixItem widgetMixItem, WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i2) {
        int i3;
        v74Var.getClass();
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            Bitmap bitmap = (Bitmap) o70.V0(i, list);
            lq1 V = fb4.V(jq1.a, 52.0f);
            WidgetRoutes widgetRoutes = WidgetRoutes.INSTANCE;
            WidgetUiKt.WidgetCover(bitmap, V, null, null, WidgetActionsKt.widgetAction(widgetRoutes.mixDetail(widgetMixItem.getId()), go1Var, 0), null, go1Var, 0, 44);
            g4.b(il2.V(((x74) v74Var).a(), 12.0f), 0, 0, p70.u0(1505332458, new uv0(widgetMixItem, widgetPalette, b), go1Var), go1Var, 3072, 6);
            WidgetUiKt.m132WidgetIconButtonnbWgWpA(R.drawable.widget_ic_play, WidgetActionsKt.widgetAction(widgetRoutes.playMix(widgetMixItem.getId(), widgetMixItem.getResumeAwemeId()), go1Var, 0), hf1.w("播放", widgetMixItem.getName()), null, true, 40.0f, 22.0f, go1Var, 1794048, 8);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixExpanded$lambda$0$0$0$0(WidgetMixItem widgetMixItem, WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e(widgetMixItem.getName(), null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(14)), new pk1(500), null, 120), 1, go1Var, 3072, 2);
            g4.a(new hi3(il2.h0(0.0f), il2.h0(6.0f), il2.h0(0.0f), il2.h0(0.0f)), null, p70.u0(-2034819252, new sv0(widgetMixItem, b), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixExpanded$lambda$0$0$0$0$0(WidgetMixItem widgetMixItem, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetProgress(widgetMixItem.getTotal() > 0 ? widgetMixItem.getEpisode() / widgetMixItem.getTotal() : 0.0f, "第 " + widgetMixItem.getEpisode() + (widgetMixItem.getTotal() > 0 ? hf1.u(widgetMixItem.getTotal(), " / ") : "") + " 集", go1Var, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 MixExpanded$lambda$1(List list, List list2, int i, fe0 fe0Var, int i2) {
        MixExpanded(list, list2, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NowPlayingContent(WidgetPlayback widgetPlayback, Bitmap bitmap, boolean z, fe0 fe0Var, int i) {
        int i2;
        Bitmap bitmap2;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1124115626);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(widgetPlayback) : go1Var.i(widgetPlayback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bitmap2 = bitmap;
            i2 |= go1Var.i(bitmap) ? 32 : 16;
        } else {
            bitmap2 = bitmap;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z2 = z;
            i2 |= go1Var.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(2068895520, new qv0(z2, bitmap2, widgetPlayback, (WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), (Context) go1Var.k(ff0.b)), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rv0((Object) widgetPlayback, (Object) bitmap, z, i, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$0(boolean z, Bitmap bitmap, WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, Context context, ca0 ca0Var, fe0 fe0Var, int i) {
        int i2;
        ca0Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            lq2.l(new dt1(bx0.a), 0, 1, p70.u0(1351162756, new kv0(bitmap, z, widgetPlayback, widgetPalette, (byte) 0), go1Var), go1Var, 3072, 2);
            eg5.c(new dt1(new ax0(z ? 20.0f : 14.0f)), go1Var, 0);
            lq2.l(new yt5(cx0.a), 0, 0, p70.u0(-1526709189, new lv0(b, context, widgetPlayback, z), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$0$0(Bitmap bitmap, boolean z, WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetCover(bitmap, z ? fb4.y(fb4.f0(jq1Var, 224.0f), 126.0f) : fb4.V(jq1Var, 90.0f), null, null, WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.home(), go1Var, 0), widgetPlayback.getTitle(), go1Var, 0, 12);
            g4.b(il2.W(((x74) v74Var).a(), z ? 16.0f : 12.0f, 0.0f, 0.0f, 14), 0, 0, p70.u0(2106753146, new mv0(widgetPlayback, widgetPalette, z, b), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$0$0$0(WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, boolean z, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            lq2.l(null, 0, 1, p70.u0(-1135113250, new mv0(widgetPlayback, widgetPalette, z, b), go1Var), go1Var, 3072, 3);
            String title = widgetPlayback.getTitle();
            jq1 jq1Var = jq1.a;
            kb4.e(title, il2.W(jq1Var, 0.0f, 4.0f, 0.0f, 13), new l65(widgetPalette.getProviders().t, new p65(oh4.j(z ? 19 : 14)), new pk1(500), null, 120), 2, go1Var, 3072, 0);
            kb4.e(widgetPlayback.getAuthor(), il2.W(jq1Var, 0.0f, 6.0f, 0.0f, 13), new l65(widgetPalette.getProviders().v, new p65(oh4.j(z ? 15 : 11)), null, null, 124), 1, go1Var, 3072, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$0$0$0$0(WidgetPlayback widgetPlayback, WidgetPalette widgetPalette, boolean z, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            int i2 = widgetPlayback.isPlaying() ? R.drawable.widget_ic_play : R.drawable.widget_ic_pause;
            i80 i80Var = widgetPalette.getProviders().a;
            float f = z ? 18.0f : 15.0f;
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetIcon(i2, i80Var, fb4.V(jq1Var, f), null, go1Var, 0, 8);
            eg5.c(fb4.f0(jq1Var, 4.0f), go1Var, 0);
            kb4.e(r7.C(widgetPlayback.isPlaying() ? "正在播放" : "已暂停", " · ", widgetPlayback.getSource()), null, new l65(widgetPalette.getProviders().a, new p65(oh4.j(z ? 13 : 11)), new pk1(500), null, 120), 1, go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$0$1(Context context, boolean z, WidgetPlayback widgetPlayback, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.m132WidgetIconButtonnbWgWpA(R.drawable.widget_ic_skip_previous, WidgetActionsKt.mediaAction(context, 88), "上一条", null, false, z ? 76.0f : 52.0f, 0.0f, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 88);
            eg5.c(new yt5(new ax0(z ? 12.0f : 8.0f)), go1Var, 0);
            WidgetUiKt.m134WidgetTextButtonFJfuzF0(widgetPlayback.isPlaying() ? "暂停" : "继续", WidgetActionsKt.mediaAction(context, 85), new yt5(bx0.a), true, z ? 76.0f : 52.0f, go1Var, 3072, 0);
            eg5.c(new yt5(new ax0(z ? 12.0f : 8.0f)), go1Var, 0);
            WidgetUiKt.m132WidgetIconButtonnbWgWpA(R.drawable.widget_ic_skip_next, WidgetActionsKt.mediaAction(context, 87), "下一条", null, false, z ? 76.0f : 52.0f, 0.0f, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 88);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingContent$lambda$1(WidgetPlayback widgetPlayback, Bitmap bitmap, boolean z, int i, fe0 fe0Var, int i2) {
        NowPlayingContent(widgetPlayback, bitmap, z, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NowPlayingIdle(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1496235307);
        byte b = 0;
        if (go1Var.T(i & 1, i != 0)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(1851313483, new yu0((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), (byte) 2), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jv0(b, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingIdle$lambda$0(WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? ((go1) fe0Var).g(ca0Var) : ((go1) fe0Var).i(ca0Var) ? 4 : 2;
        }
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            lq2.l(new dt1(bx0.a), 0, 1, p70.u0(-73686609, new yu0(widgetPalette, b), go1Var), go1Var, 3072, 2);
            lq2.l(new yt5(cx0.a), 0, 0, ComposableSingletons$DesktopWidgetsKt.INSTANCE.getLambda$720070246$app(), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingIdle$lambda$0$0(WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            jq1 jq1Var = jq1.a;
            WidgetUiKt.m130CookieTilejA1GFJw(R.drawable.widget_ic_play, fb4.V(jq1Var, 56.0f), WidgetShape.COOKIE9, widgetPalette.getCurrent().c, widgetPalette.getCurrent().d, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            g4.b(il2.W(jq1Var, 12.0f, 0.0f, 0.0f, 14), 0, 0, p70.u0(-179937627, new yu0(widgetPalette, (byte) 3), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingIdle$lambda$0$0$0(WidgetPalette widgetPalette, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e("没有在播放", null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(14)), new pk1(700), null, 120), 0, go1Var, 6, 10);
            kb4.e("点继续看，从观看历史第一条开始", null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(12)), null, null, 124), 2, go1Var, 3078, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 NowPlayingIdle$lambda$1(int i, fe0 fe0Var, int i2) {
        NowPlayingIdle(fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchCompact(String str, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1883836883);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            lq2.l(il2.W(fb4.n(jq1.a), 10.0f, 0.0f, 0.0f, 14), 0, 1, p70.u0(-1382813201, new fv0((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), str, b), go1Var), go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new gv0(str, i, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchCompact$lambda$0(WidgetPalette widgetPalette, String str, v74 v74Var, fe0 fe0Var, int i) {
        int i2;
        v74Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            WidgetUiKt.WidgetIcon(R.drawable.widget_ic_search, widgetPalette.getProviders().a, fb4.V(jq1.a, 24.0f), null, go1Var, 0, 8);
            lq1 V = il2.V(((x74) v74Var).a(), 12.0f);
            WidgetRoutes widgetRoutes = WidgetRoutes.INSTANCE;
            g4.b(g4.r(V, WidgetActionsKt.widgetAction(widgetRoutes.search(), go1Var, 0)), 0, 0, p70.u0(-742699079, new fv0(widgetPalette, str, b), go1Var), go1Var, 3072, 6);
            WidgetUiKt.m132WidgetIconButtonnbWgWpA(R.drawable.widget_ic_whatshot, WidgetActionsKt.widgetAction(widgetRoutes.search(), go1Var, 0), "打开热搜", null, false, 48.0f, 22.0f, go1Var, 1769856, 24);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchCompact$lambda$0$0(WidgetPalette widgetPalette, String str, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            kb4.e("大家都在搜", null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(10)), null, null, 124), 0, go1Var, 6, 10);
            if (str == null) {
                str = "搜索视频、用户、直播";
            }
            kb4.e(str, null, new l65(widgetPalette.getProviders().t, new p65(oh4.j(15)), new pk1(500), null, 120), 1, go1Var, 3072, 2);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchCompact$lambda$1(String str, int i, fe0 fe0Var, int i2) {
        SearchCompact(str, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchExpanded(List<WidgetHotWord> list, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1914307166);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            g4.b(fb4.n(jq1.a), 0, 0, p70.u0(-1119133228, new a91((WidgetPalette) go1Var.k(WidgetUiKt.getLocalWidgetPalette()), list, (byte) 5), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(list, i, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchExpanded$lambda$0(WidgetPalette widgetPalette, List list, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        byte b = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            cx0 cx0Var = cx0.a;
            lq2.l(il2.V(g4.r(WidgetUiKt.tintedBackground(fb4.y(new yt5(cx0Var), 52.0f), widgetPalette.getSurfaceContainerHigh(), 20), WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.search(), go1Var, 0)), 16.0f), 0, 1, p70.u0(-1970969544, new yu0(widgetPalette, b), go1Var), go1Var, 3072, 2);
            eg5.c(new dt1(new ax0(8.0f)), go1Var, 0);
            lq2.l(new yt5(cx0Var), 0, 0, p70.u0(1315304815, new j10((Object) list, (byte) 2), go1Var), go1Var, 3072, 6);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchExpanded$lambda$0$0(WidgetPalette widgetPalette, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 17) != 16)) {
            i80 i80Var = widgetPalette.getProviders().a;
            jq1 jq1Var = jq1.a;
            WidgetUiKt.WidgetIcon(R.drawable.widget_ic_search, i80Var, fb4.V(jq1Var, 22.0f), null, go1Var, 0, 8);
            eg5.c(fb4.f0(jq1Var, 10.0f), go1Var, 0);
            kb4.e("搜索视频、用户、直播", null, new l65(widgetPalette.getProviders().v, new p65(oh4.j(14)), null, null, 124), 0, go1Var, 6, 10);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchExpanded$lambda$0$1(List list, v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2;
        }
        byte b = 1;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            int i2 = 0;
            for (Object obj : p70.k0(o70.l1(list, 3), o70.l1(o70.Q0(list, 3), 3))) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p70.A0();
                    throw null;
                }
                g4.b(new yt5(bx0.a), 0, 0, p70.u0(-271679522, new vv0((List) obj, i2, b), go1Var), go1Var, 3072, 6);
                if (i2 == 0) {
                    go1Var.d0(979771339);
                    eg5.c(new yt5(new ax0(14.0f)), go1Var, 0);
                } else {
                    go1Var.d0(308174074);
                }
                go1Var.q(false);
                i2 = i3;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchExpanded$lambda$0$1$0$0(List list, int i, ca0 ca0Var, fe0 fe0Var, int i2) {
        ca0Var.getClass();
        int i3 = 0;
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 17) != 16)) {
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p70.A0();
                    throw null;
                }
                HotWordRow((i * 3) + i3 + 1, (WidgetHotWord) obj, go1Var, WidgetHotWord.$stable << 3);
                i3 = i4;
            }
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 SearchExpanded$lambda$1(List list, int i, fe0 fe0Var, int i2) {
        SearchExpanded(list, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WidgetLoadingStatus(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1497628365);
        byte b = 1;
        if (go1Var.T(i & 1, i != 0)) {
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_history, "正在加载", "数据加载后会自动更新", null, null, false, go1Var, 432, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jv0(b, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 WidgetLoadingStatus$lambda$0(int i, fe0 fe0Var, int i2) {
        WidgetLoadingStatus(fe0Var, mu0.X(i | 1));
        return wd5.a;
    }
}
