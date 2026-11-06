package com.github.mytv.dv.widget;

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
public final class WatchLaterWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public WatchLaterWidget() {
        long j;
        long j2;
        j = DesktopWidgetsKt.SIZE_42;
        v11 v11Var = new v11(j);
        j2 = DesktopWidgetsKt.SIZE_43;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j2)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$3(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, List list, List list2, List list3, List list4, List list5, List list6, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetTheme(widgetPalette, p70.u0(1378555149, new ij0(fl4Var, z, videoListSnapshot, list, list2, list3, list4, list5, list6), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$3$0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, List list, List list2, List list3, List list4, List list5, List list6, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(0.0f, p70.u0(-510234560, new jj0(fl4Var, z, videoListSnapshot, list, list2, list3, list4, list5, list6), go1Var), go1Var, 48, 1);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$3$0$0(fl4 fl4Var, boolean z, VideoListSnapshot videoListSnapshot, List list, List list2, List list3, List list4, List list5, List list6, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(-709137612);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (!fl4Var.v()) {
            go1Var.d0(-709135393);
            WidgetUiKt.WidgetGuideStatus("稍后再看要用你的列表", go1Var, 6);
            go1Var.q(false);
        } else if (!z || videoListSnapshot.getState() == WidgetLoadState.LOADING) {
            go1Var.d0(-709131787);
            DesktopWidgetsKt.WidgetLoadingStatus(go1Var, 0);
            go1Var.q(false);
        } else if (videoListSnapshot.getState() == WidgetLoadState.ERROR) {
            go1Var.d0(-709128925);
            WidgetUiKt.WidgetErrorStatus(WidgetKind.LATER, go1Var, 6);
            go1Var.q(false);
        } else if (list.isEmpty()) {
            go1Var.d0(-709126073);
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_inbox, "稍后再看是空的", "加入稍后再看的视频会出现在这里", "去推荐看看", WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.home(), go1Var, 0), false, go1Var, 3504, 32);
            go1Var.q(false);
        } else if (r11.b(v11.a(((v11) go1Var.k(ff0.a)).a), 250.0f) < 0) {
            go1Var.d0(-709113898);
            DesktopWidgetsKt.LaterCompact(list2, list3, list.size(), go1Var, 0);
            go1Var.q(false);
        } else {
            go1Var.d0(-709111102);
            DesktopWidgetsKt.LaterExpanded(list4, list5, list6, list.size(), go1Var, 0);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b4, code lost:
    
        if (r9 == r11) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0339 -> B:19:0x033f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x02b1 -> B:29:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x022d -> B:37:0x0232). Please report as a decompilation issue!!! */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r40, defpackage.iq1 r41, defpackage.fj0 r42) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WatchLaterWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
