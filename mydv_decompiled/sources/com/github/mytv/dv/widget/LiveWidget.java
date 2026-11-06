package com.github.mytv.dv.widget;

import com.github.mytv.dv.R;
import defpackage.ca0;
import defpackage.dq;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fl4;
import defpackage.go1;
import defpackage.p70;
import defpackage.pq4;
import defpackage.qo2;
import defpackage.qv0;
import defpackage.r11;
import defpackage.rp1;
import defpackage.v11;
import defpackage.vt0;
import defpackage.wd5;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public LiveWidget() {
        long j;
        v11 v11Var = new v11(vt0.a(320.0f, 92.0f));
        j = DesktopWidgetsKt.SIZE_42;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetTheme(widgetPalette, p70.u0(139224382, new qo2(fl4Var, z, liveSnapshot, list, list2), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1$0(fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(r11.b(v11.a(((v11) go1Var.k(ff0.a)).a), 130.0f) < 0 ? 10.0f : 12.0f, p70.u0(1969021617, new qv0(fl4Var, z, liveSnapshot, list, list2), go1Var), go1Var, 48, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1$0$0(fl4 fl4Var, boolean z, LiveSnapshot liveSnapshot, List list, List list2, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(-1850800795);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (!fl4Var.v()) {
            go1Var.d0(-1850798576);
            WidgetUiKt.WidgetGuideStatus("登录后显示关注的主播", go1Var, 6);
            go1Var.q(false);
        } else if (!z || liveSnapshot.getState() == WidgetLoadState.LOADING) {
            go1Var.d0(-1850794970);
            DesktopWidgetsKt.WidgetLoadingStatus(go1Var, 0);
            go1Var.q(false);
        } else if (liveSnapshot.getState() == WidgetLoadState.ERROR) {
            go1Var.d0(-1850792109);
            WidgetUiKt.WidgetErrorStatus(WidgetKind.LIVE, go1Var, 6);
            go1Var.q(false);
        } else if (list.isEmpty()) {
            go1Var.d0(-1850789326);
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_live, "关注的主播没在直播", "开播后会在这里显示", "打开直播", WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.live(), go1Var, 0), false, go1Var, 3504, 32);
            go1Var.q(false);
        } else if (r11.b(v11.a(((v11) go1Var.k(ff0.a)).a), 130.0f) < 0) {
            go1Var.d0(-1850777343);
            DesktopWidgetsKt.LiveCompact(list, list2, liveSnapshot.getItems().size(), go1Var, 0);
            go1Var.q(false);
        } else {
            go1Var.d0(-1850774751);
            DesktopWidgetsKt.LiveExpanded(list, list2, liveSnapshot.getUpdatedAt(), go1Var, 0);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01a7 -> B:17:0x01b1). Please report as a decompilation issue!!! */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r23, defpackage.iq1 r24, defpackage.fj0 r25) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.LiveWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
