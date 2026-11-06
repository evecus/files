package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qh5 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public qh5(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        rh5 rh5Var = new rh5();
        rh5Var.I = (VectorDrawable) this.a.newDrawable();
        return rh5Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        rh5 rh5Var = new rh5();
        rh5Var.I = (VectorDrawable) this.a.newDrawable(resources);
        return rh5Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        rh5 rh5Var = new rh5();
        rh5Var.I = (VectorDrawable) this.a.newDrawable(resources, theme);
        return rh5Var;
    }
}
