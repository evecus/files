package com.github.mytv.dv.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import defpackage.ac1;
import defpackage.ch0;
import defpackage.cp0;
import defpackage.fr2;
import defpackage.gq1;
import defpackage.hf1;
import defpackage.il2;
import defpackage.ky5;
import defpackage.mc3;
import defpackage.n84;
import defpackage.o70;
import defpackage.r93;
import defpackage.s83;
import defpackage.t91;
import defpackage.uj3;
import defpackage.ut0;
import defpackage.ux5;
import defpackage.vj4;
import defpackage.wl3;
import defpackage.x93;
import defpackage.xe3;
import defpackage.xl3;
import defpackage.ye3;
import defpackage.yj;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetRefreshScheduler {
    public static final int $stable = 0;
    public static final WidgetRefreshScheduler INSTANCE = new WidgetRefreshScheduler();
    private static final String KIND = "kind";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetKind.values().length];
            try {
                iArr[WidgetKind.HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetKind.LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetKind.MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetKind.LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetKind.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private WidgetRefreshScheduler() {
    }

    private final String onceName(WidgetKind widgetKind) {
        return hf1.w("widgets_once_", widgetKind.name());
    }

    private final String periodicName(WidgetKind widgetKind) {
        return hf1.w("widgets_periodic_", widgetKind.name());
    }

    private final Class<? extends gq1> receiver(WidgetKind widgetKind) {
        int i = WhenMappings.$EnumSwitchMapping$0[widgetKind.ordinal()];
        if (i == 1) {
            return ContinueWidgetReceiver.class;
        }
        if (i == 2) {
            return WatchLaterWidgetReceiver.class;
        }
        if (i == 3) {
            return MixWidgetReceiver.class;
        }
        if (i == 4) {
            return LiveWidgetReceiver.class;
        }
        if (i == 5) {
            return SearchWidgetReceiver.class;
        }
        s83.v();
        return null;
    }

    public final boolean hasWidgets(Context context, WidgetKind widgetKind) {
        context.getClass();
        widgetKind.getClass();
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, receiver(widgetKind)));
        appWidgetIds.getClass();
        return !(appWidgetIds.length == 0);
    }

    public final void refreshNow(Context context, WidgetKind widgetKind) {
        boolean isDeviceProtected;
        context.getClass();
        widgetKind.getClass();
        isDeviceProtected = WidgetActionsKt.isDeviceProtected(context);
        if (!isDeviceProtected && hasWidgets(context, widgetKind)) {
            xe3 xe3Var = new xe3(WidgetRefreshWorker.class);
            uj3[] uj3VarArr = {new uj3(KIND, widgetKind.name())};
            cp0 cp0Var = new cp0((byte) 0);
            uj3 uj3Var = uj3VarArr[0];
            cp0Var.h(uj3Var.J, (String) uj3Var.I);
            xe3Var.c.e = cp0Var.c();
            xe3Var.c.j = new ch0(new r93(null), x93.J, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? o70.u1(new LinkedHashSet()) : t91.I);
            ye3 ye3Var = (ye3) ((xe3) xe3Var.d()).a();
            ux5 e = ux5.e(context);
            e.getClass();
            e.c(onceName(widgetKind), ac1.J, ye3Var);
        }
    }

    public final void schedule(Context context, WidgetKind widgetKind) {
        boolean isDeviceProtected;
        context.getClass();
        widgetKind.getClass();
        isDeviceProtected = WidgetActionsKt.isDeviceProtected(context);
        if (isDeviceProtected) {
            return;
        }
        ux5 e = ux5.e(context);
        e.getClass();
        if (!hasWidgets(context, widgetKind)) {
            e.a(periodicName(widgetKind));
            return;
        }
        ch0 ch0Var = new ch0(new r93(null), x93.J, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? o70.u1(new LinkedHashSet()) : t91.I);
        long intervalMinutes = widgetKind.getIntervalMinutes();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        wl3 wl3Var = new wl3(WidgetRefreshWorker.class);
        ky5 ky5Var = wl3Var.c;
        long millis = timeUnit.toMillis(intervalMinutes);
        String str = ky5.z;
        if (millis < 900000) {
            fr2.e().i(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j = millis < 900000 ? 900000L : millis;
        long j2 = millis < 900000 ? 900000L : millis;
        if (j < 900000) {
            fr2.e().i(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        ky5Var.h = j >= 900000 ? j : 900000L;
        if (j2 < 300000) {
            fr2.e().i(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > ky5Var.h) {
            fr2.e().i(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        ky5Var.i = ut0.s(j2, 300000L, ky5Var.h);
        wl3 wl3Var2 = (wl3) wl3Var.e(widgetKind.getIntervalMinutes(), timeUnit);
        uj3[] uj3VarArr = {new uj3(KIND, widgetKind.name())};
        cp0 cp0Var = new cp0((byte) 0);
        uj3 uj3Var = uj3VarArr[0];
        cp0Var.h(uj3Var.J, (String) uj3Var.I);
        wl3Var2.c.e = cp0Var.c();
        wl3Var2.c.j = ch0Var;
        xl3 xl3Var = (xl3) ((wl3) wl3Var2.d()).a();
        String periodicName = periodicName(widgetKind);
        periodicName.getClass();
        n84 n84Var = e.b.g;
        String concat = "enqueueUniquePeriodic_".concat(periodicName);
        vj4 vj4Var = (vj4) ((mc3) e.d).a;
        vj4Var.getClass();
        il2.P(n84Var, concat, vj4Var, new yj((Object) e, (Object) periodicName, (Object) xl3Var, (byte) 19));
    }

    public final void scheduleAll(Context context) {
        boolean isDeviceProtected;
        context.getClass();
        isDeviceProtected = WidgetActionsKt.isDeviceProtected(context);
        if (isDeviceProtected) {
            Log.i("myDV", "DE storage context: skip widget refresh scheduling");
            return;
        }
        Iterator<E> it = WidgetKind.getEntries().iterator();
        while (it.hasNext()) {
            INSTANCE.schedule(context, (WidgetKind) it.next());
        }
    }
}
