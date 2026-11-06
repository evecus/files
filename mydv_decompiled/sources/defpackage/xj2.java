package defpackage;

import android.view.View;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xj2 {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public boolean l;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public List k = null;

    public final void a() {
        b(null);
    }

    public final void b(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = Log.LOG_LEVEL_OFF;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((g) this.k.get(i2)).itemView;
            z14 z14Var = (z14) view3.getLayoutParams();
            if (view3 != view && !z14Var.a.isRemoved() && (layoutPosition = (z14Var.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((z14) view2.getLayoutParams()).a.getLayoutPosition();
        }
    }

    public final boolean c(h24 h24Var) {
        int i = this.d;
        return i >= 0 && i < h24Var.b();
    }

    public final View d(f fVar) {
        List list = this.k;
        if (list == null) {
            View view = fVar.k(this.d, Long.MAX_VALUE).itemView;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((g) this.k.get(i)).itemView;
            z14 z14Var = (z14) view2.getLayoutParams();
            if (!z14Var.a.isRemoved() && this.d == z14Var.a.getLayoutPosition()) {
                b(view2);
                return view2;
            }
        }
        return null;
    }
}
