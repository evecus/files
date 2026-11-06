package com.github.mytv.dv.widget;

import androidx.media3.extractor.ts.PsExtractor;
import defpackage.fj0;
import defpackage.gj0;
import defpackage.rp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "com.github.mytv.dv.widget.WidgetRefresher", f = "WidgetData.kt", l = {229, 237, 238, 239, PsExtractor.VIDEO_STREAM_MASK, 241, 250, 250, 250}, m = "refresh", v = 2)
/* loaded from: classes2.dex */
public final class WidgetRefresher$refresh$1 extends gj0 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WidgetRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefresher$refresh$1(WidgetRefresher widgetRefresher, fj0 fj0Var) {
        super(fj0Var);
        this.this$0 = widgetRefresher;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh(null, null, this);
    }
}
