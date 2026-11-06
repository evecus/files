package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ha0 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(int i, String str, ag2 ag2Var, it4 it4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = i;
        this.L = str;
        this.M = ag2Var;
        this.N = it4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                return new ha0((zf1[]) obj4, this.K, (AtomicInteger) obj3, (iz) obj2, fj0Var);
            case 1:
                return new ha0(this.K, (String) obj4, (ag2) obj3, (it4) obj2, fj0Var);
            default:
                return new ha0((tm1) obj4, (gx3) obj3, (uw3) obj2, this.K, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ha0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.L;
        el0 el0Var = el0.I;
        Object obj3 = this.M;
        Object obj4 = this.N;
        int i = this.K;
        switch (b) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                iz izVar = (iz) obj4;
                boolean z = this.J;
                try {
                    if (!z) {
                        mu0.V(obj);
                        zf1 zf1Var = ((zf1[]) obj2)[i];
                        ga0 ga0Var = new ga0(izVar, i);
                        this.J = true;
                        if (zf1Var.collect(ga0Var, this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return wd5Var;
                    }
                    izVar.c(null);
                    return wd5Var;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        izVar.c(null);
                    }
                }
            case 1:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (i < 0 || (str = (String) obj2) == null || !(!((it4) obj4).containsKey(str))) {
                    return wd5Var;
                }
                this.J = true;
                return ag2.j((ag2) obj3, i, this) == el0Var ? el0Var : wd5Var;
            default:
                uw3 uw3Var = (uw3) obj4;
                ConcurrentHashMap concurrentHashMap = ((gx3) obj3).D;
                boolean z3 = this.J;
                try {
                    if (!z3) {
                        mu0.V(obj);
                        this.J = true;
                        if (((tm1) obj2).invoke(this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z3) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    return wd5Var;
                } finally {
                    concurrentHashMap.remove(uw3Var, new Integer(i));
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(tm1 tm1Var, gx3 gx3Var, uw3 uw3Var, int i, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = tm1Var;
        this.M = gx3Var;
        this.N = uw3Var;
        this.K = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(zf1[] zf1VarArr, int i, AtomicInteger atomicInteger, iz izVar, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = zf1VarArr;
        this.K = i;
        this.M = atomicInteger;
        this.N = izVar;
    }
}
