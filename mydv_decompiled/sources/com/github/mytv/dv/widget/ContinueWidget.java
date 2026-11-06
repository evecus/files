package com.github.mytv.dv.widget;

import android.graphics.Bitmap;
import com.github.mytv.dv.R;
import defpackage.ca0;
import defpackage.dq;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fl4;
import defpackage.go1;
import defpackage.ij0;
import defpackage.jj0;
import defpackage.p70;
import defpackage.pq4;
import defpackage.r11;
import defpackage.rp1;
import defpackage.v11;
import defpackage.wd5;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ContinueWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public ContinueWidget() {
        long j;
        long j2;
        j = DesktopWidgetsKt.SIZE_22;
        v11 v11Var = new v11(j);
        j2 = DesktopWidgetsKt.SIZE_42;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j2)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$4(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, List list, Bitmap bitmap3, List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetTheme(widgetPalette, p70.u0(674601891, new ij0(fl4Var, z, videoListSnapshot, widgetVideo, bitmap, bitmap2, list, bitmap3, list2), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$4$0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, List list, Bitmap bitmap3, List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(8.0f, p70.u0(1964255126, new jj0(fl4Var, z, videoListSnapshot, widgetVideo, bitmap, bitmap2, list, bitmap3, list2), go1Var), go1Var, 54, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$4$0$0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, WidgetVideo widgetVideo, Bitmap bitmap, Bitmap bitmap2, List list, Bitmap bitmap3, List list2, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(-2136431350);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (!fl4Var.v()) {
            go1Var.d0(-2136429130);
            WidgetUiKt.WidgetGuideStatus("继续看要用你的观看历史", go1Var, 6);
            go1Var.q(false);
        } else if (!z || videoListSnapshot.getState() == WidgetLoadState.LOADING) {
            go1Var.d0(-2136425493);
            DesktopWidgetsKt.WidgetLoadingStatus(go1Var, 0);
            go1Var.q(false);
        } else if (videoListSnapshot.getState() == WidgetLoadState.ERROR) {
            go1Var.d0(-2136422629);
            WidgetUiKt.WidgetErrorStatus(WidgetKind.HISTORY, go1Var, 6);
            go1Var.q(false);
        } else if (widgetVideo == null) {
            go1Var.d0(-2136419815);
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_inbox, "还没有观看历史", "看过的视频会出现在这里", "去推荐看看", WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.home(), go1Var, 0), false, go1Var, 3504, 32);
            go1Var.q(false);
        } else if (r11.b(v11.b(((v11) go1Var.k(ff0.a)).a), 300.0f) < 0) {
            go1Var.d0(-2136407810);
            DesktopWidgetsKt.ContinueSmall(widgetVideo, bitmap, bitmap2, go1Var, WidgetVideo.$stable);
            go1Var.q(false);
        } else {
            go1Var.d0(-2136405465);
            DesktopWidgetsKt.ContinueLarge(list, bitmap3, bitmap2, list2, go1Var, 0);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0379 -> B:15:0x037d). Please report as a decompilation issue!!! */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r30, defpackage.iq1 r31, defpackage.fj0 r32) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.ContinueWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
