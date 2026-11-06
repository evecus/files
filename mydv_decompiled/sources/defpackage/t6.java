package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t6 extends ul implements v6 {
    public final /* synthetic */ u6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(u6 u6Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.L = u6Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        eg5.P(this, getContentDescription());
        setOnTouchListener(new p6(this, this));
    }

    @Override // defpackage.v6
    public final boolean b() {
        return false;
    }

    @Override // defpackage.v6
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.L.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
