package com.github.mytv.dv.widget;

import com.github.mytv.dv.R;
import defpackage.ca0;
import defpackage.dq;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.fl4;
import defpackage.g30;
import defpackage.go1;
import defpackage.kv0;
import defpackage.o70;
import defpackage.p70;
import defpackage.pq4;
import defpackage.r11;
import defpackage.rp1;
import defpackage.v11;
import defpackage.vt0;
import defpackage.wd5;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchWidget extends rp1 {
    public static final int $stable = rp1.$stable | 8;
    private final pq4 sizeMode;

    public SearchWidget() {
        long j;
        v11 v11Var = new v11(vt0.a(320.0f, 64.0f));
        j = DesktopWidgetsKt.SIZE_42;
        this.sizeMode = new pq4(dq.p1(new v11[]{v11Var, new v11(j)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$0(WidgetPalette widgetPalette, fl4 fl4Var, boolean z, SearchSnapshot searchSnapshot, List list, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.WidgetTheme(widgetPalette, p70.u0(-1841939326, new g30(fl4Var, z, searchSnapshot, list), go1Var), go1Var, WidgetPalette.$stable | 48);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$0$0(fl4 fl4Var, boolean z, SearchSnapshot searchSnapshot, List list, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            WidgetUiKt.m133WidgetSurfaceorJrPs(8.0f, p70.u0(-48420555, new kv0(fl4Var, z, searchSnapshot, list, (byte) 1), go1Var), go1Var, 54, 0);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 provideGlance$lambda$0$0$0(fl4 fl4Var, boolean z, SearchSnapshot searchSnapshot, List list, ca0 ca0Var, fe0 fe0Var, int i) {
        ca0Var.getClass();
        go1 go1Var = (go1) fe0Var;
        if (!go1Var.T(i & 1, (i & 17) != 16)) {
            go1Var.W();
        } else if (WidgetStore.INSTANCE.isLocked(fl4Var)) {
            go1Var.d0(712489705);
            WidgetUiKt.WidgetLockedStatus(go1Var, 0);
            go1Var.q(false);
        } else if (!fl4Var.v()) {
            go1Var.d0(712491923);
            WidgetUiKt.WidgetGuideStatus("搜索和热搜需要登录", go1Var, 6);
            go1Var.q(false);
        } else if (!z || searchSnapshot.getState() == WidgetLoadState.LOADING) {
            go1Var.d0(712495498);
            DesktopWidgetsKt.WidgetLoadingStatus(go1Var, 0);
            go1Var.q(false);
        } else if (searchSnapshot.getState() == WidgetLoadState.ERROR) {
            go1Var.d0(712498361);
            WidgetUiKt.WidgetErrorStatus(WidgetKind.SEARCH, go1Var, 6);
            go1Var.q(false);
        } else if (r11.b(v11.a(((v11) go1Var.k(ff0.a)).a), 130.0f) < 0) {
            go1Var.d0(712501501);
            WidgetHotWord widgetHotWord = (WidgetHotWord) o70.U0(list);
            DesktopWidgetsKt.SearchCompact(widgetHotWord != null ? widgetHotWord.getWord() : null, go1Var, 0);
            go1Var.q(false);
        } else if (list.isEmpty()) {
            go1Var.d0(712504473);
            WidgetUiKt.WidgetStatus(R.drawable.widget_ic_search, "热搜暂时为空", "仍然可以打开搜索页输入", "打开搜索", WidgetActionsKt.widgetAction(WidgetRoutes.INSTANCE.search(), go1Var, 0), false, go1Var, 3504, 32);
            go1Var.q(false);
        } else {
            go1Var.d0(712515594);
            DesktopWidgetsKt.SearchExpanded(list, go1Var, 0);
            go1Var.q(false);
        }
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.rp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideGlance(android.content.Context r12, defpackage.iq1 r13, defpackage.fj0 r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.SearchWidget.provideGlance(android.content.Context, iq1, fj0):java.lang.Object");
    }

    @Override // defpackage.rp1
    public pq4 getSizeMode() {
        return this.sizeMode;
    }
}
