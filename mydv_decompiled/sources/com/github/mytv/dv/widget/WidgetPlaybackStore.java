package com.github.mytv.dv.widget;

import defpackage.dw4;
import defpackage.fw4;
import defpackage.o7;
import defpackage.sv2;
import defpackage.w43;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetPlaybackStore {
    public static final int $stable = 0;
    public static final WidgetPlaybackStore INSTANCE = new WidgetPlaybackStore();
    private static final w43 _state;
    private static final dw4 state;

    static {
        fw4 c = o7.c(null);
        _state = c;
        state = sv2.j(c);
    }

    private WidgetPlaybackStore() {
    }

    public final void clear() {
        ((fw4) _state).h(null);
    }

    public final dw4 getState() {
        return state;
    }

    public final void publish(WidgetPlayback widgetPlayback) {
        widgetPlayback.getClass();
        fw4 fw4Var = (fw4) _state;
        fw4Var.getClass();
        fw4Var.i(null, widgetPlayback);
    }
}
