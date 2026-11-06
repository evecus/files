package com.github.mytv.dv.widget;

import defpackage.sp0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetShape {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ WidgetShape[] $VALUES;
    public static final WidgetShape ROUNDED = new WidgetShape("ROUNDED", 0);
    public static final WidgetShape COOKIE4 = new WidgetShape("COOKIE4", 1);
    public static final WidgetShape COOKIE9 = new WidgetShape("COOKIE9", 2);
    public static final WidgetShape CLOVER4 = new WidgetShape("CLOVER4", 3);

    private static final /* synthetic */ WidgetShape[] $values() {
        return new WidgetShape[]{ROUNDED, COOKIE4, COOKIE9, CLOVER4};
    }

    static {
        WidgetShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
    }

    private WidgetShape(String str, int i) {
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static WidgetShape valueOf(String str) {
        return (WidgetShape) Enum.valueOf(WidgetShape.class, str);
    }

    public static WidgetShape[] values() {
        return (WidgetShape[]) $VALUES.clone();
    }
}
