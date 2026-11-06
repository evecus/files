package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pk3 extends yg5 {
    public wy b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public wy g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public rx4 q;
    public final yd r;
    public yd s;
    public yd t;
    public final uc2 u;

    public pk3() {
        int i = th5.a;
        this.d = o91.I;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        yd a = ae.a();
        this.r = a;
        this.s = a;
        this.u = ut0.K(dh2.J, new gw2((byte) 13));
    }

    @Override // defpackage.yg5
    public final void a(y31 y31Var) {
        rx4 rx4Var;
        if (this.n) {
            sp0.p0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        wy wyVar = this.b;
        if (wyVar != null) {
            r7.j(y31Var, this.s, wyVar, this.c, null, null, 56);
        }
        wy wyVar2 = this.g;
        if (wyVar2 != null) {
            rx4 rx4Var2 = this.q;
            if (this.o || rx4Var2 == null) {
                rx4 rx4Var3 = new rx4(this.f, this.j, this.h, this.i, 16);
                this.q = rx4Var3;
                this.o = false;
                rx4Var = rx4Var3;
            } else {
                rx4Var = rx4Var2;
            }
            r7.j(y31Var, this.s, wyVar2, this.e, rx4Var, null, 48);
        }
    }

    public final void e() {
        float f = this.k;
        yd ydVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = ydVar;
            return;
        }
        yd ydVar2 = this.s;
        if (ydVar2 != ydVar) {
            Path.FillType fillType = ydVar2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.e();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = ae.a();
        }
        uc2 uc2Var = this.u;
        ((zd) uc2Var.getValue()).c(ydVar);
        float a = ((zd) uc2Var.getValue()).a();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * a;
        float f5 = ((this.l + f3) % 1.0f) * a;
        if (f4 <= f5) {
            ((zd) uc2Var.getValue()).b(f4, f5, this.s);
            return;
        }
        yd ydVar3 = this.t;
        if (ydVar3 == null) {
            ydVar3 = ae.a();
            this.t = ydVar3;
        }
        ydVar3.d();
        ((zd) uc2Var.getValue()).b(f4, a, ydVar3);
        hf1.h(this.s, ydVar3);
        ydVar3.d();
        ((zd) uc2Var.getValue()).b(0.0f, f5, ydVar3);
        hf1.h(this.s, ydVar3);
    }

    public final String toString() {
        return this.r.toString();
    }
}
