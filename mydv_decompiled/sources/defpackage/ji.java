package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ji extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public ji(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ki kiVar = new ki(null);
        Drawable newDrawable = this.a.newDrawable();
        kiVar.I = newDrawable;
        newDrawable.setCallback(kiVar.L);
        return kiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ki kiVar = new ki(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        kiVar.I = newDrawable;
        newDrawable.setCallback(kiVar.L);
        return kiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ki kiVar = new ki(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        kiVar.I = newDrawable;
        newDrawable.setCallback(kiVar.L);
        return kiVar;
    }
}
