package com.github.mytv.dv.widget;

import android.graphics.Bitmap;
import com.github.mytv.dv.R;
import com.github.mytv.dv.widget.MixWidget;
import defpackage.ca0;
import defpackage.dq;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fl4;
import defpackage.go1;
import defpackage.in1;
import defpackage.o70;
import defpackage.p70;
import defpackage.pq4;
import defpackage.r11;
import defpackage.rp1;
import defpackage.v11;
import defpackage.wd5;
import defpackage.yl2;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MixWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public MixWidget() {
        long j;
        long j2;
        j = DesktopWidgetsKt.SIZE_42;
        v11 v11Var = new v11(j);
        j2 = DesktopWidgetsKt.SIZE_43;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j2)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1(WidgetPalette widgetPalette, WidgetPalette widgetPalette2, fl4 fl4Var, boolean z, MixSnapshot mixSnapshot, List list, List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            boolean z2 = r11.b(v11.a(((v11) go1Var.k(ff0.a)).a), 250.0f) < 0;
            WidgetUiKt.WidgetTheme(z2 ? widgetPalette : widgetPalette2, p70.u0(-1675595558, new yl2(fl4Var, z, mixSnapshot, list, z2, list2), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1$0(final fl4 fl4Var, final boolean z, final MixSnapshot mixSnapshot, final List list, final boolean z2, final List list2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(0.0f, p70.u0(-1893664505, new in1() { // from class: z03
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wd5 provideGlance$lambda$1$0$0;
                    int intValue = ((Integer) obj3).intValue();
                    provideGlance$lambda$1$0$0 = MixWidget.provideGlance$lambda$1$0$0(fl4.this, z, mixSnapshot, list, z2, list2, (ca0) obj, (fe0) obj2, intValue);
                    return provideGlance$lambda$1$0$0;
                }
            }, go1Var), go1Var, 48, 1);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$1$0$0(fl4 fl4Var, boolean z, MixSnapshot mixSnapshot, List list, boolean z2, List list2, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(1254547003);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (!fl4Var.v()) {
            go1Var.d0(1254549224);
            WidgetUiKt.WidgetGuideStatus("合集追更要用你的观看历史", go1Var, 6);
            go1Var.q(false);
        } else if (!z || mixSnapshot.getState() == WidgetLoadState.LOADING) {
            go1Var.d0(1254552892);
            DesktopWidgetsKt.WidgetLoadingStatus(go1Var, 0);
            go1Var.q(false);
        } else if (mixSnapshot.getState() == WidgetLoadState.ERROR) {
            go1Var.d0(1254555752);
            WidgetUiKt.WidgetErrorStatus(WidgetKind.MIX, go1Var, 6);
            go1Var.q(false);
        } else if (list.isEmpty()) {
            go1Var.d0(1254558509);
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_inbox, "没有合集追更", "看过合集里的视频后会出现在这里", "去推荐看看", WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.home(), go1Var, 0), false, go1Var, 3504, 32);
            go1Var.q(false);
        } else if (z2) {
            go1Var.d0(1254569814);
            DesktopWidgetsKt.MixCompact((WidgetMixItem) o70.T0(list), (Bitmap) o70.U0(list2), go1Var, WidgetMixItem.$stable);
            go1Var.q(false);
        } else {
            go1Var.d0(1254572353);
            DesktopWidgetsKt.MixExpanded(list, list2, go1Var, 0);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x01ee -> B:18:0x01f8). Please report as a decompilation issue!!! */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r26, defpackage.iq1 r27, defpackage.fj0 r28) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.MixWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
