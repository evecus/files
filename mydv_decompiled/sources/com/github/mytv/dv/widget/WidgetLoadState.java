package com.github.mytv.dv.widget;

import defpackage.sp0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetLoadState {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ WidgetLoadState[] $VALUES;
    public static final WidgetLoadState LOADING = new WidgetLoadState("LOADING", 0);
    public static final WidgetLoadState READY = new WidgetLoadState("READY", 1);
    public static final WidgetLoadState ERROR = new WidgetLoadState("ERROR", 2);

    private static final /* synthetic */ WidgetLoadState[] $values() {
        return new WidgetLoadState[]{LOADING, READY, ERROR};
    }

    static {
        WidgetLoadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
    }

    private WidgetLoadState(String str, int i) {
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static WidgetLoadState valueOf(String str) {
        return (WidgetLoadState) Enum.valueOf(WidgetLoadState.class, str);
    }

    public static WidgetLoadState[] values() {
        return (WidgetLoadState[]) $VALUES.clone();
    }
}
