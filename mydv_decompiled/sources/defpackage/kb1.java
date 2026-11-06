package defpackage;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kb1 implements gr2, Serializable {
    public String I;
    public bz4 J;
    public LinkedBlockingQueue K;

    @Override // defpackage.gr2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gr2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gr2
    public final void c(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            n(1, new Object[]{obj});
        } else {
            n(1, new Object[]{obj, obj2});
        }
    }

    @Override // defpackage.gr2
    public final void d(String str, Throwable th) {
        n(1, null);
    }

    @Override // defpackage.gr2
    public final void e(Object obj, String str) {
        n(5, new Object[]{obj});
    }

    @Override // defpackage.gr2
    public final void error(String str) {
        n(1, null);
    }

    @Override // defpackage.gr2
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gr2
    public final boolean g() {
        return true;
    }

    @Override // defpackage.gr2
    public final String getName() {
        return this.I;
    }

    @Override // defpackage.gr2
    public final boolean h() {
        return true;
    }

    @Override // defpackage.gr2
    public final void i(String str, Integer num, Object obj) {
        if (obj instanceof Throwable) {
            n(5, new Object[]{num});
        } else {
            n(5, new Object[]{num, obj});
        }
    }

    @Override // defpackage.gr2
    public final void j(String str) {
        n(5, null);
    }

    @Override // defpackage.gr2
    public final /* synthetic */ boolean k(int i) {
        return i82.g(this, i);
    }

    @Override // defpackage.gr2
    public final void l(Object obj) {
        n(1, new Object[]{obj});
    }

    @Override // defpackage.gr2
    public final void m(String str, Exception exc) {
        n(5, null);
    }

    public final void n(int i, Object[] objArr) {
        dz4 dz4Var = new dz4();
        System.currentTimeMillis();
        dz4Var.a = i;
        dz4Var.b = this.J;
        Thread.currentThread().getName();
        dz4Var.c = objArr;
        this.K.add(dz4Var);
    }
}
