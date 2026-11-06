package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pb4 extends k13 implements na2, pi4 {
    public sb4 I;
    public boolean J;

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        d82[] d82VarArr = aj4.a;
        bj4 bj4Var = zi4.n;
        d82[] d82VarArr2 = aj4.a;
        d82 d82Var = d82VarArr2[6];
        Boolean bool = Boolean.TRUE;
        bj4Var.getClass();
        cj4Var.c(bj4Var, bool);
        final byte b = 0;
        final byte b2 = 1;
        bb4 bb4Var = new bb4(new rm1(this) { // from class: ob4
            public final /* synthetic */ pb4 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                int h;
                byte b3 = b;
                pb4 pb4Var = this.J;
                switch (b3) {
                    case 0:
                        h = pb4Var.I.a.h();
                        break;
                    default:
                        h = pb4Var.I.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new rm1(this) { // from class: ob4
            public final /* synthetic */ pb4 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                int h;
                byte b3 = b2;
                pb4 pb4Var = this.J;
                switch (b3) {
                    case 0:
                        h = pb4Var.I.a.h();
                        break;
                    default:
                        h = pb4Var.I.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.J) {
            bj4 bj4Var2 = zi4.w;
            d82 d82Var2 = d82VarArr2[13];
            bj4Var2.getClass();
            cj4Var.c(bj4Var2, bb4Var);
            return;
        }
        bj4 bj4Var3 = zi4.v;
        d82 d82Var3 = d82VarArr2[12];
        bj4Var3.getClass();
        cj4Var.c(bj4Var3, bb4Var);
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        if (!this.J) {
            i = Log.LOG_LEVEL_OFF;
        }
        return a42Var.b(i);
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        if (this.J) {
            i = Log.LOG_LEVEL_OFF;
        }
        return a42Var.t(i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        mw2.u(j, this.J ? pg3.I : pg3.J);
        boolean z = this.J;
        int i = Log.LOG_LEVEL_OFF;
        int g = z ? Integer.MAX_VALUE : dh0.g(j);
        if (this.J) {
            i = dh0.h(j);
        }
        bn3 u = pw2Var.u(dh0.a(j, 0, i, 0, g, 5));
        int i2 = u.I;
        int h = dh0.h(j);
        if (i2 > h) {
            i2 = h;
        }
        int i3 = u.J;
        int g2 = dh0.g(j);
        if (i3 > g2) {
            i3 = g2;
        }
        int i4 = u.J - i3;
        int i5 = u.I - i2;
        if (!this.J) {
            i4 = i5;
        }
        sb4 sb4Var = this.I;
        gk3 gk3Var = sb4Var.f;
        gk3 gk3Var2 = sb4Var.a;
        gk3Var.i(i4);
        ns4 i6 = o63.i();
        tm1 e = i6 != null ? i6.e() : null;
        ns4 j2 = o63.j(i6);
        try {
            if (gk3Var2.h() > i4) {
                gk3Var2.i(i4);
            }
            o63.o(i6, j2, e);
            this.I.b.i(this.J ? i3 : i2);
            this.I.c.i(this.J ? u.J : u.I);
            this.I.d.setValue(Boolean.FALSE);
            return ww2Var.A(i2, i3, p91.I, new aq1((byte) 2, i4, this, u));
        } catch (Throwable th) {
            o63.o(i6, j2, e);
            throw th;
        }
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        if (!this.J) {
            i = Log.LOG_LEVEL_OFF;
        }
        return a42Var.Q(i);
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        if (this.J) {
            i = Log.LOG_LEVEL_OFF;
        }
        return a42Var.p(i);
    }
}
