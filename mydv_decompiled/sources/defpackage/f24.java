package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f24 extends u14 {
    public final /* synthetic */ RecyclerView a;

    public f24(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        boolean z = RecyclerView.j1;
        RecyclerView recyclerView = this.a;
        if (!z || !recyclerView.e0 || !recyclerView.d0) {
            recyclerView.l0 = true;
            recyclerView.requestLayout();
        } else {
            p14 p14Var = recyclerView.Q;
            WeakHashMap weakHashMap = dr5.a;
            recyclerView.postOnAnimation(p14Var);
        }
    }
}
