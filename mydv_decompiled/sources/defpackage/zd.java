package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zd {
    public final PathMeasure a;

    public zd(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final float a() {
        return this.a.getLength();
    }

    public final boolean b(float f, float f2, yd ydVar) {
        if (ydVar instanceof yd) {
            return this.a.getSegment(f, f2, ydVar.a, true);
        }
        zy.p("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void c(yd ydVar) {
        this.a.setPath(ydVar.a, false);
    }
}
