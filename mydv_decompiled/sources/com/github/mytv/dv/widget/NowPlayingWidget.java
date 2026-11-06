package com.github.mytv.dv.widget;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import defpackage.ca0;
import defpackage.dq;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fl4;
import defpackage.go1;
import defpackage.ku3;
import defpackage.p70;
import defpackage.pq4;
import defpackage.r11;
import defpackage.rp1;
import defpackage.so2;
import defpackage.v11;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NowPlayingWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public NowPlayingWidget() {
        long j;
        long j2;
        j = DesktopWidgetsKt.SIZE_42;
        v11 v11Var = new v11(j);
        j2 = DesktopWidgetsKt.SIZE_CAR;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j2)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$2(WidgetPalette widgetPalette, fl4 fl4Var, WidgetPlayback widgetPlayback, Bitmap bitmap, Bitmap bitmap2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetTheme(widgetPalette, p70.u0(1841291954, new so2((Object) fl4Var, (Object) widgetPlayback, (Object) bitmap, (Object) bitmap2, (byte) 6), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$2$0(fl4 fl4Var, WidgetPlayback widgetPlayback, Bitmap bitmap, Bitmap bitmap2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(r11.b(v11.b(((v11) go1Var.k(ff0.a)).a), 480.0f) >= 0 ? 16.0f : 12.0f, p70.u0(-47497755, new ku3(fl4Var, widgetPlayback, bitmap, bitmap2, (byte) 8), go1Var), go1Var, 48, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$2$0$0(fl4 fl4Var, WidgetPlayback widgetPlayback, Bitmap bitmap, Bitmap bitmap2, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(1599300505);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (widgetPlayback == null) {
            go1Var.d0(1599302581);
            DesktopWidgetsKt.NowPlayingIdle(go1Var, 0);
            go1Var.q(false);
        } else if (r11.b(v11.b(((v11) go1Var.k(ff0.a)).a), 480.0f) >= 0) {
            go1Var.d0(1599305107);
            DesktopWidgetsKt.NowPlayingContent(widgetPlayback, bitmap, true, go1Var, WidgetPlayback.$stable | RendererCapabilities.DECODER_SUPPORT_MASK);
            go1Var.q(false);
        } else {
            go1Var.d0(1599307642);
            DesktopWidgetsKt.NowPlayingContent(widgetPlayback, bitmap2, false, go1Var, WidgetPlayback.$stable | RendererCapabilities.DECODER_SUPPORT_MASK);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r29, defpackage.iq1 r30, defpackage.fj0 r31) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.NowPlayingWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
