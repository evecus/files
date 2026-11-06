package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yr1 extends yg5 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = x70.g;
    public List f;
    public boolean g;
    public yd h;
    public tm1 i;
    public final i9 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public yr1() {
        int i = th5.a;
        this.f = o91.I;
        this.g = true;
        this.j = new i9(this, (byte) 10);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.yg5
    public final void a(y31 y31Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = nw2.a();
                this.b = fArr;
            } else {
                nw2.d(fArr);
            }
            nw2.i(fArr, this.q + this.m, this.r + this.n);
            nw2.e(fArr, this.l);
            nw2.f(fArr, this.o, this.p);
            nw2.i(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                yd ydVar = this.h;
                if (ydVar == null) {
                    ydVar = ae.a();
                    this.h = ydVar;
                }
                sp0.p0(this.f, ydVar);
            }
            this.g = false;
        }
        pn S = y31Var.S();
        long H = S.H();
        S.q().f();
        try {
            ep epVar = (ep) S.b;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ((pn) epVar.J).q().i(fArr2);
            }
            yd ydVar2 = this.h;
            if (!this.f.isEmpty() && ydVar2 != null) {
                jp0.m(epVar, ydVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((yg5) arrayList.get(i)).a(y31Var);
            }
            r7.H(S, H);
        } catch (Throwable th) {
            r7.H(S, H);
            throw th;
        }
    }

    @Override // defpackage.yg5
    public final tm1 b() {
        return this.i;
    }

    @Override // defpackage.yg5
    public final void d(i9 i9Var) {
        this.i = i9Var;
    }

    public final void e(int i, yg5 yg5Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, yg5Var);
        } else {
            arrayList.add(yg5Var);
        }
        g(yg5Var);
        yg5Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = th5.a;
            if (x70.h(j2) == x70.h(j) && x70.g(j2) == x70.g(j) && x70.e(j2) == x70.e(j)) {
                return;
            }
            this.d = false;
            this.e = x70.g;
        }
    }

    public final void g(yg5 yg5Var) {
        if (!(yg5Var instanceof pk3)) {
            if (yg5Var instanceof yr1) {
                yr1 yr1Var = (yr1) yg5Var;
                if (yr1Var.d && this.d) {
                    f(yr1Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = x70.g;
                    return;
                }
            }
            return;
        }
        pk3 pk3Var = (pk3) yg5Var;
        wy wyVar = pk3Var.b;
        if (this.d && wyVar != null) {
            if (wyVar instanceof rt4) {
                f(((rt4) wyVar).a);
            } else {
                this.d = false;
                this.e = x70.g;
            }
        }
        wy wyVar2 = pk3Var.g;
        if (this.d && wyVar2 != null) {
            if (wyVar2 instanceof rt4) {
                f(((rt4) wyVar2).a);
            } else {
                this.d = false;
                this.e = x70.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yg5 yg5Var = (yg5) arrayList.get(i);
            sb.append("\t");
            sb.append(yg5Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
