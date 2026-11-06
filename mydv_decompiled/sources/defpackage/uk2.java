package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uk2 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ vk2 b;

    public uk2(vk2 vk2Var) {
        this.b = vk2Var;
        a();
    }

    public final void a() {
        sx2 sx2Var = this.b.K;
        ky2 ky2Var = sx2Var.v;
        if (ky2Var != null) {
            sx2Var.j();
            ArrayList arrayList = sx2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ky2) arrayList.get(i)) == ky2Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ky2 getItem(int i) {
        sx2 sx2Var = this.b.K;
        sx2Var.j();
        ArrayList arrayList = sx2Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ky2) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        sx2 sx2Var = this.b.K;
        sx2Var.j();
        int size = sx2Var.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.J.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((xy2) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
