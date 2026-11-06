package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class z14 extends ViewGroup.MarginLayoutParams {
    public g a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public z14(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        return this.a.getLayoutPosition();
    }

    public final boolean b() {
        return this.a.isUpdated();
    }

    public final boolean c() {
        return this.a.isRemoved();
    }

    public final boolean d() {
        return this.a.isInvalid();
    }

    public z14(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public z14(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public z14(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public z14(z14 z14Var) {
        super((ViewGroup.LayoutParams) z14Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
