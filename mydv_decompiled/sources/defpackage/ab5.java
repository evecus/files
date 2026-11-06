package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ab5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ fb5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab5(fb5 fb5Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = fb5Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        fb5 fb5Var = this.L;
        switch (b) {
            case 0:
                ab5 ab5Var = new ab5(fb5Var, fj0Var, (byte) 0);
                ab5Var.K = obj;
                return ab5Var;
            default:
                ab5 ab5Var2 = new ab5(fb5Var, fj0Var, (byte) 1);
                ab5Var2.K = obj;
                return ab5Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        p95 p95Var = (p95) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ab5) create(p95Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        p95 p95Var;
        Object d;
        Object a;
        p95 p95Var2;
        Object d2;
        hd3[] hd3VarArr;
        hd3 hd3Var;
        byte b = this.I;
        o95 o95Var = o95.J;
        el0 el0Var = el0.I;
        boolean z = true;
        fb5 fb5Var = this.L;
        fj0 fj0Var = null;
        switch (b) {
            case 0:
                byte b2 = this.J;
                try {
                    if (b2 == 0) {
                        mu0.V(obj);
                        p95Var = (p95) this.K;
                        this.K = p95Var;
                        this.J = (byte) 1;
                        d = p95Var.d(this);
                        if (d == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                zy.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mu0.V(obj);
                            a = obj;
                            return (Set) a;
                        }
                        p95Var = (p95) this.K;
                        mu0.V(obj);
                        d = obj;
                    }
                    if (!((Boolean) d).booleanValue()) {
                        gu2 gu2Var = new gu2(fb5Var, fj0Var, (byte) 22);
                        this.K = null;
                        this.J = (byte) 2;
                        a = p95Var.a(o95Var, gu2Var, this);
                        if (a == el0Var) {
                            return el0Var;
                        }
                        return (Set) a;
                    }
                } catch (SQLException unused) {
                }
                return t91.I;
            default:
                byte b3 = this.J;
                wd5 wd5Var = wd5.a;
                if (b3 == 0) {
                    mu0.V(obj);
                    p95Var2 = (p95) this.K;
                    this.K = p95Var2;
                    this.J = (byte) 1;
                    d2 = p95Var2.d(this);
                    if (d2 == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            mu0.V(obj);
                            return wd5Var;
                        }
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p95Var2 = (p95) this.K;
                    mu0.V(obj);
                    d2 = obj;
                }
                if (!((Boolean) d2).booleanValue()) {
                    id3 id3Var = fb5Var.h;
                    long[] jArr = id3Var.b;
                    ReentrantLock reentrantLock = id3Var.a;
                    reentrantLock.lock();
                    try {
                        if (id3Var.d) {
                            boolean z2 = false;
                            id3Var.d = false;
                            int length = jArr.length;
                            hd3VarArr = new hd3[length];
                            int i = 0;
                            boolean z3 = false;
                            while (i < length) {
                                if (jArr[i] > 0) {
                                    z2 = z;
                                }
                                boolean[] zArr = id3Var.c;
                                if (z2 != zArr[i]) {
                                    zArr[i] = z2;
                                    hd3Var = z2 ? hd3.J : hd3.K;
                                    z3 = true;
                                } else {
                                    hd3Var = hd3.I;
                                }
                                hd3VarArr[i] = hd3Var;
                                i++;
                                z = true;
                                z2 = false;
                            }
                            if (!z3) {
                                hd3VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            hd3VarArr = null;
                        }
                        if (hd3VarArr != null) {
                            eb5 eb5Var = new eb5(hd3VarArr, fb5Var, p95Var2, null);
                            this.K = null;
                            this.J = (byte) 2;
                            if (p95Var2.a(o95Var, eb5Var, this) == el0Var) {
                                return el0Var;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return wd5Var;
        }
    }
}
