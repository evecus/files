package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r61 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public r61(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(k21.D(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a(pg3 pg3Var) {
        EdgeEffect q = k21.q(this.a);
        q.setColor(this.b);
        if (!z22.b(this.c, 0L)) {
            long j = this.c;
            if (pg3Var == pg3.I) {
                q.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return q;
            }
            q.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return q;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(pg3.I);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(pg3.J);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(pg3.J);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(pg3.I);
        this.d = a;
        return a;
    }
}
