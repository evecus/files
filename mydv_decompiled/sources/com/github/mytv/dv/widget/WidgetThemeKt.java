package com.github.mytv.dv.widget;

import android.content.Context;
import android.util.LruCache;
import defpackage.c74;
import defpackage.fj0;
import defpackage.k80;
import defpackage.s90;
import defpackage.t80;
import defpackage.va4;
import defpackage.vj3;
import defpackage.x70;
import defpackage.z70;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetThemeKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object widgetPalette(android.content.Context r18, java.lang.String r19, defpackage.fj0 r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetThemeKt.widgetPalette(android.content.Context, java.lang.String, fj0):java.lang.Object");
    }

    public static /* synthetic */ Object widgetPalette$default(Context context, String str, fj0 fj0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return widgetPalette(context, str, fj0Var);
    }

    private static final k80 widgetPalette$scheme(x70 x70Var, Context context, t80 t80Var, s90 s90Var, z70 z70Var, x70 x70Var2, boolean z) {
        if (x70Var != null) {
            long j = x70Var.a;
            LruCache lruCache = va4.a;
            k80 b = va4.b(j, z, vj3.L, z70Var.K);
            if (b != null) {
                return b;
            }
        }
        return c74.a(context, t80Var, s90Var, z70Var, x70Var2, z);
    }
}
