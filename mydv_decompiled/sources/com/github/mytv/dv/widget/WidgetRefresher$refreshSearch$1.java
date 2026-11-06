package com.github.mytv.dv.widget;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "com.github.mytv.dv.widget.WidgetRefresher", f = "WidgetData.kt", l = {290}, m = "refreshSearch", v = 2)
/* loaded from: classes2.dex */
public final class WidgetRefresher$refreshSearch$1 extends gj0 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WidgetRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefresher$refreshSearch$1(WidgetRefresher widgetRefresher, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = widgetRefresher;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object refreshSearch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        refreshSearch = this.this$0.refreshSearch(null, null, null, this);
        return refreshSearch;
    }
}
