package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aq4 extends ss4 {
    public Object b;
    public Object c;
    public o43 d;
    public o43 e;
    public mj4 f;
    public final i9 g;
    public final sr h;

    public aq4() {
        super((byte) 0);
        this.g = new i9(this, (byte) 26);
        y1 y1Var = new y1(this, (byte) 11);
        ws4.b(ws4.a);
        synchronized (ws4.c) {
            ws4.h = o70.g1(ws4.h, y1Var);
        }
        this.h = new sr(y1Var, (byte) 6);
    }

    @Override // defpackage.ss4
    public final void a(mj4 mj4Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.ss4
    public final void b() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    o43 o43Var = this.d;
                    if (o43Var == null) {
                        o43 o43Var2 = ka4.a;
                        o43Var = new o43();
                        this.d = o43Var;
                    }
                    this.d = this.e;
                    this.e = o43Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss4
    public final void c() {
        this.h.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.ss4
    public final tm1 e(mj4 mj4Var) {
        mj4 mj4Var2 = this.f;
        if (mj4Var2 != null && !mj4Var2.equals(mj4Var)) {
            jr3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = mj4Var;
        return this.g;
    }

    @Override // defpackage.ss4
    public final void f(k20 k20Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        b();
    }
}
