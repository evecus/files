package com.github.mytv.dv.widget;

import defpackage.gq1;
import defpackage.rp1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NowPlayingWidgetReceiver extends gq1 {
    public static final int $stable = (gq1.$stable | rp1.$stable) | 8;
    private final NowPlayingWidget glanceAppWidget = new NowPlayingWidget();

    @Override // defpackage.gq1
    public NowPlayingWidget getGlanceAppWidget() {
        return this.glanceAppWidget;
    }
}
