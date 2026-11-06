package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class px2 extends BaseAdapter {
    public final sx2 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public px2(sx2 sx2Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = sx2Var;
        this.f = i;
        a();
    }

    public final void a() {
        sx2 sx2Var = this.a;
        ky2 ky2Var = sx2Var.v;
        if (ky2Var != null) {
            sx2Var.j();
            ArrayList arrayList = sx2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ky2) arrayList.get(i)) == ky2Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ky2 getItem(int i) {
        ArrayList m;
        boolean z = this.d;
        sx2 sx2Var = this.a;
        if (z) {
            sx2Var.j();
            m = sx2Var.j;
        } else {
            m = sx2Var.m();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ky2) m.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m;
        boolean z = this.d;
        sx2 sx2Var = this.a;
        if (z) {
            sx2Var.j();
            m = sx2Var.j;
        } else {
            m = sx2Var.m();
        }
        return this.b < 0 ? m.size() : m.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.n() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        xy2 xy2Var = (xy2) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        xy2Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
