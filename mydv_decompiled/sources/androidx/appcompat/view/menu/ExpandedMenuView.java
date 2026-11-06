package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ky2;
import defpackage.pn;
import defpackage.rx2;
import defpackage.sx2;
import defpackage.yy2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements rx2, yy2, AdapterView.OnItemClickListener {
    public static final int[] J = {R.attr.background, R.attr.divider};
    public sx2 I;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        pn N = pn.N(context, attributeSet, J, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) N.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(N.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(N.v(1));
        }
        N.T();
    }

    @Override // defpackage.rx2
    public final boolean a(ky2 ky2Var) {
        return this.I.r(ky2Var, null, 0);
    }

    @Override // defpackage.yy2
    public final void b(sx2 sx2Var) {
        this.I = sx2Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((ky2) getAdapter().getItem(i));
    }
}
