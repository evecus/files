package com.github.mytv.dv.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.a5;
import defpackage.a7;
import defpackage.a84;
import defpackage.b7;
import defpackage.d6;
import defpackage.fe0;
import defpackage.ff0;
import defpackage.go1;
import defpackage.lj4;
import defpackage.tv4;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetActionsKt {
    private static final a7 widgetKindParameter = new a7("widget_kind");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDeviceProtected(Context context) {
        return Build.VERSION.SDK_INT >= 24 && context.isDeviceProtectedStorage();
    }

    public static final d6 mediaAction(Context context, int i) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) WidgetMediaActionReceiver.class);
        intent.setAction(WidgetMediaActionReceiver.ACTION_MEDIA);
        intent.putExtra(WidgetMediaActionReceiver.EXTRA_KEY_CODE, i);
        return new lj4(intent);
    }

    public static final d6 refreshAction(WidgetKind widgetKind) {
        widgetKind.getClass();
        a7 a7Var = widgetKindParameter;
        String name = widgetKind.name();
        a7Var.getClass();
        return new a84(a5.R((b7[]) Arrays.copyOf(new b7[]{new b7(a7Var, name)}, 1)));
    }

    public static final d6 widgetAction(String str, fe0 fe0Var, int i) {
        str.getClass();
        return new tv4(WidgetRoutes.INSTANCE.intent((Context) ((go1) fe0Var).k(ff0.b), str), a5.R((b7[]) Arrays.copyOf(new b7[0], 0)));
    }
}
