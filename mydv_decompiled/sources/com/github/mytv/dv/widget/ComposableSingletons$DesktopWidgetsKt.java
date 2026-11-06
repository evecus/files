package com.github.mytv.dv.widget;

import defpackage.ax0;
import defpackage.bx0;
import defpackage.d6;
import defpackage.eg5;
import defpackage.fe0;
import defpackage.go1;
import defpackage.in1;
import defpackage.tc0;
import defpackage.uc0;
import defpackage.v74;
import defpackage.wd5;
import defpackage.yt5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ComposableSingletons$DesktopWidgetsKt {
    public static final ComposableSingletons$DesktopWidgetsKt INSTANCE = new ComposableSingletons$DesktopWidgetsKt();
    private static in1 lambda$720070246 = new tc0(720070246, new uc0(9), false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 lambda_720070246$lambda$0(v74 v74Var, fe0 fe0Var, int i) {
        v74Var.getClass();
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? ((go1) fe0Var).g(v74Var) : ((go1) fe0Var).i(v74Var) ? 4 : 2;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i & 1, (i & 19) != 18)) {
            WidgetRoutes widgetRoutes = WidgetRoutes.INSTANCE;
            d6 widgetAction = WidgetActionsKt.widgetAction(widgetRoutes.history(), go1Var, 0);
            bx0 bx0Var = bx0.a;
            WidgetUiKt.m134WidgetTextButtonFJfuzF0("继续看", widgetAction, new yt5(bx0Var), true, 52.0f, go1Var, 27654, 0);
            eg5.c(new yt5(new ax0(8.0f)), go1Var, 0);
            WidgetUiKt.m134WidgetTextButtonFJfuzF0("打开推荐", WidgetActionsKt.widgetAction(widgetRoutes.home(), go1Var, 0), new yt5(bx0Var), false, 52.0f, go1Var, 24582, 8);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    public final in1 getLambda$720070246$app() {
        return lambda$720070246;
    }
}
