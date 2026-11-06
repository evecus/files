package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sg3 {
    public final e a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public sg3(e eVar) {
        this.a = eVar;
    }

    public static sg3 a(e eVar, int i) {
        if (i == 0) {
            return new qg3(eVar);
        }
        if (i == 1) {
            return new rg3(eVar);
        }
        s83.t("invalid orientation");
        return null;
    }

    public int b(View view) {
        return view.getRight() + ((z14) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((z14) view.getLayoutParams())).rightMargin;
    }

    public int c(View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect = ((z14) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) z14Var).leftMargin + ((ViewGroup.MarginLayoutParams) z14Var).rightMargin;
    }

    public int d(View view) {
        z14 z14Var = (z14) view.getLayoutParams();
        Rect rect = ((z14) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) z14Var).topMargin + ((ViewGroup.MarginLayoutParams) z14Var).bottomMargin;
    }

    public int e(View view) {
        return (view.getLeft() - ((z14) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((z14) view.getLayoutParams())).leftMargin;
    }

    public int f() {
        return this.a.m;
    }

    public int g() {
        e eVar = this.a;
        return eVar.m - eVar.z();
    }

    public int h() {
        return this.a.z();
    }

    public int i() {
        return this.a.k;
    }

    public int j() {
        return this.a.l;
    }

    public int k() {
        return this.a.y();
    }

    public int l() {
        e eVar = this.a;
        return (eVar.m - eVar.y()) - eVar.z();
    }

    public int m(View view) {
        e eVar = this.a;
        Rect rect = this.c;
        eVar.E(rect, view);
        return rect.right;
    }

    public int n(View view) {
        e eVar = this.a;
        Rect rect = this.c;
        eVar.E(rect, view);
        return rect.left;
    }

    public void o(int i) {
        this.a.I(i);
    }
}
