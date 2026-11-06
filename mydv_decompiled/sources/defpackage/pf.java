package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pf extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ f35 K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(f35 f35Var, Object obj, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.K = f35Var;
        this.L = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        byte b = this.I;
        Object obj = this.L;
        f35 f35Var = this.K;
        switch (b) {
            case 0:
                return new pf((qf) f35Var, (w25) obj, fj0Var, (byte) 0);
            default:
                return new pf((bv) f35Var, (av) obj, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((pf) create(fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        mf mfVar;
        byte b = this.I;
        el0 el0Var = el0.I;
        f35 f35Var = this.K;
        Object obj2 = this.L;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                qf qfVar = (qf) f35Var;
                kt4 kt4Var = qfVar.e;
                View view = qfVar.a;
                boolean z = this.J;
                try {
                    if (!z) {
                        mu0.V(obj);
                        nf nfVar = new nf();
                        w25 w25Var = (w25) obj2;
                        mf mfVar2 = new mf(nfVar, new jf(qfVar, w25Var, (byte) 0), new jf(qfVar, w25Var, (byte) 1), view);
                        tm1 tm1Var = qfVar.b;
                        if (tm1Var != null && (mfVar = (mf) tm1Var.invoke(mfVar2)) != null) {
                            mfVar2 = mfVar;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (myLooper == (handler2 != null ? handler2.getLooper() : null)) {
                            ActionMode startActionMode = view.startActionMode(new xf1(mfVar2), 1);
                            if (startActionMode != null) {
                                qfVar.h = startActionMode;
                            }
                            return wd5Var;
                        }
                        of ofVar = qfVar.i;
                        if (ofVar == null) {
                            ofVar = new of(qfVar, mfVar2, nfVar, (byte) 0);
                            qfVar.i = ofVar;
                        }
                        view.post(ofVar);
                        this.J = true;
                        Object h = nfVar.a.h(this);
                        if (h != el0Var) {
                            h = wd5Var;
                        }
                        if (h == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = qfVar.j;
                        if (runnable == null) {
                            runnable = new h(qfVar, (byte) 3);
                            qfVar.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = qfVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    of ofVar2 = qfVar.i;
                    if (ofVar2 != null) {
                        view.removeCallbacks(ofVar2);
                    }
                    qfVar.h = null;
                    return wd5Var;
                } finally {
                    kt4Var.a();
                    Looper myLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (myLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable2 = qfVar.j;
                        if (runnable2 == null) {
                            runnable2 = new h(qfVar, (byte) 3);
                            qfVar.j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = qfVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    of ofVar3 = qfVar.i;
                    if (ofVar3 != null) {
                        view.removeCallbacks(ofVar3);
                    }
                    qfVar.h = null;
                }
            default:
                av avVar = (av) obj2;
                jk3 jk3Var = ((bv) f35Var).c;
                boolean z2 = this.J;
                try {
                    if (!z2) {
                        mu0.V(obj);
                        jk3Var.setValue(avVar);
                        this.J = true;
                        Object h2 = avVar.b.h(this);
                        if (h2 != el0Var) {
                            h2 = wd5Var;
                        }
                        if (h2 == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z2) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    return wd5Var;
                } finally {
                    jk3Var.setValue(null);
                }
        }
    }
}
