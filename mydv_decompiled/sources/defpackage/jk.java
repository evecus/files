package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jk extends SegmentFinder {
    public final /* synthetic */ v05 a;

    public jk(v05 v05Var) {
        this.a = v05Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.c(i);
    }
}
