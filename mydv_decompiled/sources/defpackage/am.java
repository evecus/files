package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class am extends g12 {
    public final zl M;
    public Drawable N;
    public ColorStateList O;
    public PorterDuff.Mode P;
    public boolean Q;
    public boolean R;

    public am(zl zlVar) {
        super((AbsSeekBar) zlVar);
        this.O = null;
        this.P = null;
        this.Q = false;
        this.R = false;
        this.M = zlVar;
    }

    @Override // defpackage.g12
    public final void E(AttributeSet attributeSet, int i) {
        super.E(attributeSet, R.attr.seekBarStyle);
        zl zlVar = this.M;
        Context context = zlVar.getContext();
        int[] iArr = qz3.g;
        pn N = pn.N(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) N.b;
        dr5.g(zlVar, zlVar.getContext(), iArr, attributeSet, (TypedArray) N.b, R.attr.seekBarStyle);
        Drawable w = N.w(0);
        if (w != null) {
            zlVar.setThumb(w);
        }
        Drawable v = N.v(1);
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.N = v;
        if (v != null) {
            v.setCallback(zlVar);
            v.setLayoutDirection(zlVar.getLayoutDirection());
            if (v.isStateful()) {
                v.setState(zlVar.getDrawableState());
            }
            a0();
        }
        zlVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.P = h41.b(typedArray.getInt(3, -1), this.P);
            this.R = true;
        }
        if (typedArray.hasValue(2)) {
            this.O = N.t(2);
            this.Q = true;
        }
        N.T();
        a0();
    }

    public final void a0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            if (this.Q || this.R) {
                Drawable mutate = drawable.mutate();
                this.N = mutate;
                if (this.Q) {
                    mutate.setTintList(this.O);
                }
                if (this.R) {
                    this.N.setTintMode(this.P);
                }
                if (this.N.isStateful()) {
                    this.N.setState(this.M.getDrawableState());
                }
            }
        }
    }

    public final void b0(Canvas canvas) {
        if (this.N != null) {
            int max = this.M.getMax();
            if (max > 1) {
                int intrinsicWidth = this.N.getIntrinsicWidth();
                int intrinsicHeight = this.N.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.N.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.N.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
