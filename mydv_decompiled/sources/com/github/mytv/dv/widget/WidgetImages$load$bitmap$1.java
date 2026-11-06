package com.github.mytv.dv.widget;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.dl0;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "com.github.mytv.dv.widget.WidgetImages$load$bitmap$1", f = "WidgetTheme.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class WidgetImages$load$bitmap$1 extends k05 implements hn1 {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ float $radius;
    final /* synthetic */ Integer $ringBackground;
    final /* synthetic */ Integer $ringColor;
    final /* synthetic */ WidgetShape $shape;
    final /* synthetic */ Bitmap $source;
    final /* synthetic */ int $width;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetImages$load$bitmap$1(Context context, Bitmap bitmap, int i, int i2, float f, WidgetShape widgetShape, Integer num, Integer num2, fj0 fj0Var) {
        super(2, fj0Var);
        this.$context = context;
        this.$source = bitmap;
        this.$width = i;
        this.$height = i2;
        this.$radius = f;
        this.$shape = widgetShape;
        this.$ringColor = num;
        this.$ringBackground = num2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new WidgetImages$load$bitmap$1(this.$context, this.$source, this.$width, this.$height, this.$radius, this.$shape, this.$ringColor, this.$ringBackground, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((WidgetImages$load$bitmap$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Bitmap render;
        if (this.label != 0) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        render = WidgetImages.INSTANCE.render(this.$context, this.$source, this.$width, this.$height, this.$radius, this.$shape, this.$ringColor, this.$ringBackground);
        return render;
    }
}
