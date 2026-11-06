package com.github.mytv.dv.widget;

import defpackage.sp0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetKind {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ WidgetKind[] $VALUES;
    private final long intervalMinutes;
    public static final WidgetKind HISTORY = new WidgetKind("HISTORY", 0, 360);
    public static final WidgetKind LATER = new WidgetKind("LATER", 1, 360);
    public static final WidgetKind MIX = new WidgetKind("MIX", 2, 360);
    public static final WidgetKind LIVE = new WidgetKind("LIVE", 3, 30);
    public static final WidgetKind SEARCH = new WidgetKind("SEARCH", 4, 60);

    private static final /* synthetic */ WidgetKind[] $values() {
        return new WidgetKind[]{HISTORY, LATER, MIX, LIVE, SEARCH};
    }

    static {
        WidgetKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
    }

    private WidgetKind(String str, int i, long j) {
        this.intervalMinutes = j;
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static WidgetKind valueOf(String str) {
        return (WidgetKind) Enum.valueOf(WidgetKind.class, str);
    }

    public static WidgetKind[] values() {
        return (WidgetKind[]) $VALUES.clone();
    }

    public final long getIntervalMinutes() {
        return this.intervalMinutes;
    }
}
