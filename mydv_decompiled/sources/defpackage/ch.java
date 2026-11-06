package defpackage;

import androidx.compose.runtime.Recomposer;
import com.github.mytv.dv.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ch extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(Object obj, Object obj2, Object obj3, Object obj4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.N = obj4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                return new ch(this.K, (bh) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 0);
            case 1:
                ch chVar = new ch((zf1) obj4, (fw4) obj3, this.N, fj0Var, (byte) 1);
                chVar.K = obj;
                return chVar;
            case 2:
                return new ch((is0) this.K, (hu2) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 2);
            case 3:
                return new ch((is0) this.K, (zd1) obj4, (t43) obj3, (s33) obj2, fj0Var, (byte) 3);
            case 4:
                return new ch((zd1) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 4);
            default:
                return new ch((r24) this.K, (Recomposer) obj4, (vi2) obj3, (sw5) obj2, fj0Var, (byte) 5);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
        }
        return ((ch) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        Object obj2 = this.M;
        Object obj3 = this.N;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                bh bhVar = (bh) obj4;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    if (j42.c(this.K, bhVar.e.getValue())) {
                        return wd5Var;
                    }
                    bh bhVar2 = (bh) obj4;
                    Object obj5 = this.K;
                    ku4 ku4Var = eh.a;
                    bj bjVar = (bj) ((t43) obj2).getValue();
                    this.J = true;
                    if (bh.a(bhVar2, obj5, bjVar, null, null, this, 12) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                ku4 ku4Var2 = eh.a;
                tm1 tm1Var = (tm1) ((t43) obj3).getValue();
                if (tm1Var == null) {
                    return wd5Var;
                }
                tm1Var.invoke(bhVar.d());
                return wd5Var;
            case 1:
                fw4 fw4Var = (fw4) obj2;
                qn4 qn4Var = (qn4) this.K;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    int ordinal = qn4Var.ordinal();
                    if (ordinal == 0) {
                        this.K = null;
                        this.J = true;
                        return ((zf1) obj4).collect(fw4Var, this) == el0Var ? el0Var : wd5Var;
                    }
                    if (ordinal == 1) {
                        return wd5Var;
                    }
                    if (ordinal == 2) {
                        if (obj3 == o7.s) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        fw4Var.h(obj3);
                        return wd5Var;
                    }
                    s83.v();
                } else {
                    if (z2) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                is0 is0Var = (is0) this.K;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    if (!((Boolean) ((t43) obj2).getValue()).booleanValue()) {
                        return wd5Var;
                    }
                    int h = is0Var.d.b.h() + 1;
                    if (h < is0Var.l()) {
                        this.J = true;
                        if (jj3.t(is0Var, h, this) == el0Var) {
                            return el0Var;
                        }
                    }
                    fw4 fw4Var2 = ((hu2) obj4).R;
                    Boolean bool = Boolean.FALSE;
                    fw4Var2.getClass();
                    fw4Var2.i(null, bool);
                    return wd5Var;
                }
                if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                ((t43) obj3).setValue(Boolean.FALSE);
                fw4 fw4Var22 = ((hu2) obj4).R;
                Boolean bool2 = Boolean.FALSE;
                fw4Var22.getClass();
                fw4Var22.i(null, bool2);
                return wd5Var;
            case 3:
                t43 t43Var = (t43) obj2;
                zd1 zd1Var = (zd1) obj4;
                boolean z4 = this.J;
                if (z4) {
                    if (z4) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (((List) t43Var.getValue()).isEmpty()) {
                    return wd5Var;
                }
                int o = ((is0) this.K).o();
                int X = p70.X((List) t43Var.getValue());
                if (o > X) {
                    o = X;
                }
                zd1Var.i(o);
                zd1Var.d(o);
                if (((gk3) ((s33) obj3)).h() != o) {
                    return wd5Var;
                }
                to3 to3Var = zd1Var instanceof to3 ? (to3) zd1Var : null;
                if (to3Var == null) {
                    return wd5Var;
                }
                this.J = true;
                return to3Var.h(o, 3, this) == el0Var ? el0Var : wd5Var;
            case 4:
                t43 t43Var2 = (t43) obj3;
                t43 t43Var3 = (t43) obj2;
                boolean z5 = this.J;
                if (!z5) {
                    mu0.V(obj);
                    str = (String) t43Var3.getValue();
                    if (str == null) {
                        return wd5Var;
                    }
                    Iterator it = ((List) t43Var2.getValue()).iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (!j42.c(((Aweme) it.next()).getAwemeId(), str)) {
                            i++;
                        }
                    }
                    if (i < 0 || i >= p70.X((List) t43Var2.getValue())) {
                        return wd5Var;
                    }
                    zd1 zd1Var2 = (zd1) obj4;
                    to3 to3Var2 = zd1Var2 instanceof to3 ? (to3) zd1Var2 : null;
                    if (to3Var2 != null) {
                        this.K = str;
                        this.J = true;
                        if (to3Var2.h(i, 1, this) == el0Var) {
                            return el0Var;
                        }
                    }
                } else {
                    if (!z5) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.K;
                    mu0.V(obj);
                }
                if (!j42.c((String) t43Var3.getValue(), str)) {
                    return wd5Var;
                }
                t43Var3.setValue(null);
                return wd5Var;
            default:
                sw5 sw5Var = (sw5) obj3;
                vi2 vi2Var = (vi2) obj2;
                Recomposer recomposer = (Recomposer) obj4;
                boolean z6 = this.J;
                try {
                    if (!z6) {
                        mu0.V(obj);
                        a23 a23Var = (a23) ((r24) this.K).I;
                        if (a23Var != null) {
                            a23Var.J = i42.H(recomposer.getEffectCoroutineContext());
                        }
                        this.J = true;
                        if (recomposer.runRecomposeAndApplyChanges(this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z6) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    return wd5Var;
                } finally {
                    vi2Var.k().b(sw5Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = obj3;
    }
}
