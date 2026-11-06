package com.github.mytv.dv.widget;

import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "com.github.mytv.dv.widget.WidgetRefreshWorker", f = "WidgetActions.kt", l = {259}, m = "doWork", v = 2)
/* loaded from: classes2.dex */
public final class WidgetRefreshWorker$doWork$1 extends gj0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WidgetRefreshWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker$doWork$1(WidgetRefreshWorker widgetRefreshWorker, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = widgetRefreshWorker;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
