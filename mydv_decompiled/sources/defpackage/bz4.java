package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bz4 implements gr2 {
    public final String I;
    public volatile gr2 J;
    public Boolean K;
    public Method L;
    public kb1 M;
    public final LinkedBlockingQueue N;
    public final boolean O;

    public bz4(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.I = str;
        this.N = linkedBlockingQueue;
        this.O = z;
    }

    @Override // defpackage.gr2
    public final boolean a() {
        return n().a();
    }

    @Override // defpackage.gr2
    public final boolean b() {
        return n().b();
    }

    @Override // defpackage.gr2
    public final void c(Object obj, Object obj2) {
        n().c(obj, obj2);
    }

    @Override // defpackage.gr2
    public final void d(String str, Throwable th) {
        n().d(str, th);
    }

    @Override // defpackage.gr2
    public final void e(Object obj, String str) {
        n().e(obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bz4.class == obj.getClass() && this.I.equals(((bz4) obj).I);
    }

    @Override // defpackage.gr2
    public final void error(String str) {
        n().error(str);
    }

    @Override // defpackage.gr2
    public final boolean f() {
        return n().f();
    }

    @Override // defpackage.gr2
    public final boolean g() {
        return n().g();
    }

    @Override // defpackage.gr2
    public final String getName() {
        return this.I;
    }

    @Override // defpackage.gr2
    public final boolean h() {
        return n().h();
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // defpackage.gr2
    public final void i(String str, Integer num, Object obj) {
        n().i(str, num, obj);
    }

    @Override // defpackage.gr2
    public final void j(String str) {
        n().j(str);
    }

    @Override // defpackage.gr2
    public final boolean k(int i) {
        return n().k(i);
    }

    @Override // defpackage.gr2
    public final void l(Object obj) {
        n().l(obj);
    }

    @Override // defpackage.gr2
    public final void m(String str, Exception exc) {
        n().m(str, exc);
    }

    public final gr2 n() {
        if (this.J != null) {
            return this.J;
        }
        if (this.O) {
            return v53.I;
        }
        kb1 kb1Var = this.M;
        if (kb1Var != null) {
            return kb1Var;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.N;
        kb1 kb1Var2 = new kb1();
        kb1Var2.J = this;
        kb1Var2.I = this.I;
        kb1Var2.K = linkedBlockingQueue;
        this.M = kb1Var2;
        return kb1Var2;
    }

    public final boolean o() {
        Boolean bool;
        Boolean bool2 = this.K;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.L = this.J.getClass().getMethod("log", dz4.class);
            bool = Boolean.TRUE;
            this.K = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.K = bool;
        }
        return bool.booleanValue();
    }
}
