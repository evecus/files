package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rg3 extends sg3 {
    @Override // defpackage.sg3
    public final int b(View view) {
        return view.getBottom() + ((z14) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((z14) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.sg3
    public final int c(View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect = ((z14) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) z14Var).topMargin + ((ViewGroup.MarginLayoutParams) z14Var).bottomMargin;
    }

    @Override // defpackage.sg3
    public final int d(View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect = ((z14) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) z14Var).leftMargin + ((ViewGroup.MarginLayoutParams) z14Var).rightMargin;
    }

    @Override // defpackage.sg3
    public final int e(View view) {
        return (view.getTop() - ((z14) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((z14) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.sg3
    public final int f() {
        return this.a.n;
    }

    @Override // defpackage.sg3
    public final int g() {
        e eVar = this.a;
        return eVar.n - eVar.x();
    }

    @Override // defpackage.sg3
    public final int h() {
        return this.a.x();
    }

    @Override // defpackage.sg3
    public final int i() {
        return this.a.l;
    }

    @Override // defpackage.sg3
    public final int j() {
        return this.a.k;
    }

    @Override // defpackage.sg3
    public final int k() {
        return this.a.A();
    }

    @Override // defpackage.sg3
    public final int l() {
        e eVar = this.a;
        return (eVar.n - eVar.A()) - eVar.x();
    }

    @Override // defpackage.sg3
    public final int m(View view) {
        e eVar = this.a;
        Rect rect = this.c;
        eVar.E(rect, view);
        return rect.bottom;
    }

    @Override // defpackage.sg3
    public final int n(View view) {
        e eVar = this.a;
        Rect rect = this.c;
        eVar.E(rect, view);
        return rect.top;
    }

    @Override // defpackage.sg3
    public final void o(int i) {
        this.a.J(i);
    }
}
