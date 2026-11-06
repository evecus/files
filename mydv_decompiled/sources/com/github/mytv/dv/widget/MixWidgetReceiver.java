package com.github.mytv.dv.widget;

import defpackage.rp1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MixWidgetReceiver extends BaseWidgetReceiver {
    public static final int $stable = (BaseWidgetReceiver.$stable | rp1.$stable) | 8;
    private final MixWidget glanceAppWidget = new MixWidget();
    private final WidgetKind kind = WidgetKind.MIX;

    @Override // com.github.mytv.dv.widget.BaseWidgetReceiver
    public WidgetKind getKind$app() {
        return this.kind;
    }

    @Override // defpackage.gq1
    public MixWidget getGlanceAppWidget() {
        return this.glanceAppWidget;
    }
}
