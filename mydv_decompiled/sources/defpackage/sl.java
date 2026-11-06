package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sl extends ImageButton {
    public final c8 I;
    public final tl J;
    public boolean K;

    public sl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = false;
        u65.a(this, getContext());
        c8 c8Var = new c8(this);
        this.I = c8Var;
        c8Var.y(attributeSet, i);
        tl tlVar = new tl(this);
        this.J = tlVar;
        tlVar.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.b();
        }
        tl tlVar = this.J;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c8 c8Var = this.I;
        if (c8Var != null) {
            return c8Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c8 c8Var = this.I;
        if (c8Var != null) {
            return c8Var.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e85 e85Var;
        tl tlVar = this.J;
        if (tlVar == null || (e85Var = (e85) tlVar.c) == null) {
            return null;
        }
        return e85Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e85 e85Var;
        tl tlVar = this.J;
        if (tlVar == null || (e85Var = (e85) tlVar.c) == null) {
            return null;
        }
        return e85Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.J.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.C(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        tl tlVar = this.J;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        tl tlVar = this.J;
        if (tlVar != null && drawable != null && !this.K) {
            tlVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (tlVar != null) {
            tlVar.b();
            if (this.K) {
                return;
            }
            ImageView imageView = (ImageView) tlVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(tlVar.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.K = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        tl tlVar = this.J;
        ImageView imageView = (ImageView) tlVar.b;
        if (i != 0) {
            Drawable C = j42.C(imageView.getContext(), i);
            if (C != null) {
                h41.a(C);
            }
            imageView.setImageDrawable(C);
        } else {
            imageView.setImageDrawable(null);
        }
        tlVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        tl tlVar = this.J;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c8 c8Var = this.I;
        if (c8Var != null) {
            c8Var.N(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        tl tlVar = this.J;
        if (tlVar != null) {
            e85 e85Var = (e85) tlVar.c;
            if (e85Var == null) {
                e85Var = new e85();
                tlVar.c = e85Var;
            }
            e85Var.a = colorStateList;
            e85Var.d = true;
            tlVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        tl tlVar = this.J;
        if (tlVar != null) {
            e85 e85Var = (e85) tlVar.c;
            if (e85Var == null) {
                e85Var = new e85();
                tlVar.c = e85Var;
            }
            e85Var.b = mode;
            e85Var.c = true;
            tlVar.b();
        }
    }
}
