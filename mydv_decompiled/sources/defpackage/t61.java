package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t61 extends View {
    public final /* synthetic */ s61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(s61 s61Var, Context context) {
        super(context);
        this.I = s61Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.I.run();
    }
}
