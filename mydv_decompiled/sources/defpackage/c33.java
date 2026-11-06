package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c33 extends ss4 {
    public final n43 b;
    public final ArrayList c;
    public final n43 d;
    public final sr e;

    public c33() {
        super((byte) 0);
        this.b = ut0.y();
        this.c = new ArrayList();
        this.d = new n43();
        rd rdVar = new rd(this, (byte) 10);
        ws4.b(ws4.a);
        synchronized (ws4.c) {
            ws4.h = o70.g1(ws4.h, rdVar);
        }
        this.e = new sr(rdVar, (byte) 6);
    }

    @Override // defpackage.ss4
    public final void a(mj4 mj4Var) {
        this.c.add(new a33(mj4Var));
    }

    @Override // defpackage.ss4
    public final void b() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b33 b33Var = (b33) arrayList.get(i);
                    if (b33Var instanceof z23) {
                        ut0.g(this.b, ((z23) b33Var).a, ((z23) b33Var).b);
                    } else {
                        if (!(b33Var instanceof a33)) {
                            throw new d92();
                        }
                        ut0.R(this.b, ((a33) b33Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.ss4
    public final void c() {
        this.e.a();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.ss4
    public final tm1 e(mj4 mj4Var) {
        n43 n43Var = this.d;
        tm1 tm1Var = (tm1) n43Var.g(mj4Var);
        if (tm1Var == null) {
            tm1Var = new be(this, mj4Var, (byte) 25);
            int f = n43Var.f(mj4Var);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = n43Var.c;
            Object obj = objArr[f];
            n43Var.b[f] = mj4Var;
            objArr[f] = tm1Var;
        }
        return tm1Var;
    }

    @Override // defpackage.ss4
    public final void f(k20 k20Var) {
        this.d.k(k20Var);
        a(k20Var);
        b();
    }

    public final void j(mj4 mj4Var, Object obj) {
        this.c.add(new z23(mj4Var, obj));
    }
}
