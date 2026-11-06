package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sy2 extends m41 {
    public final byte U;
    public final byte V;
    public jy2 W;
    public ky2 a0;

    public sy2(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.U = (byte) 21;
            this.V = (byte) 22;
        } else {
            this.U = (byte) 22;
            this.V = (byte) 21;
        }
    }

    @Override // defpackage.m41, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        px2 px2Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.W != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                px2Var = (px2) headerViewListAdapter.getWrappedAdapter();
            } else {
                px2Var = (px2) adapter;
                i = 0;
            }
            ky2 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= px2Var.getCount()) ? null : px2Var.getItem(i2);
            ky2 ky2Var = this.a0;
            if (ky2Var != item) {
                sx2 sx2Var = px2Var.a;
                if (ky2Var != null) {
                    this.W.d(sx2Var, ky2Var);
                }
                this.a0 = item;
                if (item != null) {
                    this.W.l(sx2Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.U) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.V) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (px2) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (px2) adapter).a.d(false);
        return true;
    }

    public void setHoverListener(jy2 jy2Var) {
        this.W = jy2Var;
    }

    @Override // defpackage.m41, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
