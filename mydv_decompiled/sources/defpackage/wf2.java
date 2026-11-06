package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wf2 implements rb4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rb4 b;
    public final /* synthetic */ gc4 c;

    public /* synthetic */ wf2(rb4 rb4Var, gc4 gc4Var, byte b) {
        this.a = b;
        this.c = gc4Var;
        this.b = rb4Var;
    }

    @Override // defpackage.rb4
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        byte b = this.a;
        gc4 gc4Var = this.c;
        switch (b) {
            case 0:
                uf2 h = ((ag2) gc4Var).h();
                if (h.l.isEmpty()) {
                    return 0;
                }
                int c = c();
                if (i > e() || c > i) {
                    return ((i - c()) * k21.v0(h)) - d();
                }
                List list = h.l;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((vf2) obj).a != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                vf2 vf2Var = (vf2) obj;
                if (vf2Var != null) {
                    return vf2Var.l;
                }
                return 0;
            default:
                jj3 jj3Var = (jj3) gc4Var;
                return (int) (ut0.s(rt0.m(jj3Var) + mw2.P(((jj3Var.n() * (i - jj3Var.d.b.h())) - (jj3Var.d.c.h() * jj3Var.n())) + 0.0f), jj3Var.h, jj3Var.g) - rt0.m(jj3Var));
        }
    }

    public final int c() {
        byte b = this.a;
        gc4 gc4Var = this.c;
        switch (b) {
            case 0:
                return ((gk3) ((ag2) gc4Var).e.b).h();
            default:
                return ((jj3) gc4Var).e;
        }
    }

    public final int d() {
        byte b = this.a;
        gc4 gc4Var = this.c;
        switch (b) {
            case 0:
                return ((gk3) ((ag2) gc4Var).e.c).h();
            default:
                return ((jj3) gc4Var).f;
        }
    }

    public final int e() {
        byte b = this.a;
        gc4 gc4Var = this.c;
        switch (b) {
            case 0:
                vf2 vf2Var = (vf2) o70.b1(((ag2) gc4Var).h().l);
                if (vf2Var != null) {
                    return vf2Var.a;
                }
                return 0;
            default:
                return ((yw2) o70.a1(((jj3) gc4Var).k().a)).a;
        }
    }

    public final void f(int i) {
        byte b = this.a;
        gc4 gc4Var = this.c;
        switch (b) {
            case 0:
                ((ag2) gc4Var).k(i, 0);
                break;
            default:
                jj3 jj3Var = (jj3) gc4Var;
                float n = jj3Var.n();
                jj3Var.u(i, n != 0.0f ? 0.0f / n : 0.0f, true);
                break;
        }
    }
}
