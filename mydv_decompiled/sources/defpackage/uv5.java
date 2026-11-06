package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uv5 extends tv5 {
    public uv5(yv5 yv5Var, WindowInsets windowInsets) {
        super(yv5Var, windowInsets);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(xv5.a(i));
    }

    @Override // defpackage.nv5, defpackage.vv5
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(xv5.a(i));
    }

    public uv5(yv5 yv5Var, uv5 uv5Var) {
        super(yv5Var, uv5Var);
    }

    @Override // defpackage.nv5, defpackage.vv5
    public void q() {
    }
}
