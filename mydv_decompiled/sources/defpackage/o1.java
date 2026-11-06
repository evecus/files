package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import com.github.mytv.dv.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(xp3 xp3Var, t33 t33Var, qr4 qr4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 18;
        this.L = xp3Var;
        this.K = t33Var;
        this.M = qr4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        Object obj3 = this.L;
        switch (b) {
            case 0:
                return new o1((t33) this.K, (us3) obj3, (cy0) obj2, fj0Var, (byte) 0);
            case 1:
                return new o1((rp1) this.K, (Context) obj3, (iq1) obj2, fj0Var, (byte) 1);
            case 2:
                return new o1((zg2) this.K, (b50) obj3, (hu2) obj2, fj0Var, (byte) 2);
            case 3:
                return new o1(obj3, obj2, fj0Var, (byte) 3);
            case 4:
                return new o1((dj0) this.K, (BroadcastReceiver.PendingResult) obj3, (hn1) obj2, fj0Var, (byte) 4);
            case 5:
                o1 o1Var = new o1(obj3, obj2, fj0Var, (byte) 5);
                o1Var.K = obj;
                return o1Var;
            case 6:
                return new o1((qs0) this.K, (d53) obj3, (hn1) obj2, fj0Var, (byte) 6);
            case 7:
                o1 o1Var2 = new o1(obj3, obj2, fj0Var, (byte) 7);
                o1Var2.K = obj;
                return o1Var2;
            case 8:
                return new o1((hu2) this.K, (List) obj3, (tm1) obj2, fj0Var, (byte) 8);
            case 9:
                return new o1((jh4) this.K, (t43) obj3, (fk3) obj2, fj0Var, (byte) 9);
            case 10:
                o1 o1Var3 = new o1(obj3, obj2, fj0Var, (byte) 10);
                o1Var3.K = obj;
                return o1Var3;
            case 11:
                return new o1((ez3) this.K, (hu2) obj3, (fl4) obj2, fj0Var, (byte) 11);
            case 12:
                o1 o1Var4 = new o1(obj3, obj2, fj0Var, (byte) 12);
                o1Var4.K = obj;
                return o1Var4;
            case 13:
                o1 o1Var5 = new o1(obj3, obj2, fj0Var, (byte) 13);
                o1Var5.K = obj;
                return o1Var5;
            case 14:
                o1 o1Var6 = new o1(obj3, obj2, fj0Var, (byte) 14);
                o1Var6.K = obj;
                return o1Var6;
            case 15:
                return new o1((ye4) this.K, (String) obj3, (bo) obj2, fj0Var, (byte) 15);
            case 16:
                o1 o1Var7 = new o1(obj3, obj2, fj0Var, (byte) 16);
                o1Var7.K = obj;
                return o1Var7;
            case 17:
                o1 o1Var8 = new o1(obj3, obj2, fj0Var, (byte) 17);
                o1Var8.K = obj;
                return o1Var8;
            case 18:
                return new o1((xp3) obj3, (t33) this.K, (qr4) obj2, fj0Var);
            case 19:
                o1 o1Var9 = new o1(obj3, obj2, fj0Var, (byte) 19);
                o1Var9.K = obj;
                return o1Var9;
            case 20:
                return new o1((h45) this.K, (ts3) obj3, (rp3) obj2, fj0Var, (byte) 20);
            case 21:
                o1 o1Var10 = new o1(obj3, obj2, fj0Var, (byte) 21);
                o1Var10.K = obj;
                return o1Var10;
            case 22:
                return new o1((is0) this.K, (List) obj3, (t43) obj2, fj0Var, (byte) 22);
            case 23:
                o1 o1Var11 = new o1(obj3, obj2, fj0Var, (byte) 23);
                o1Var11.K = obj;
                return o1Var11;
            default:
                return new o1((d63) this.K, (ky5) obj3, (ne3) obj2, fj0Var, (byte) 24);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                return ((o1) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 6:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 7:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 8:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 9:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 10:
                return ((o1) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 11:
                ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return el0.I;
            case 12:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 13:
                return ((o1) create((mc4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 14:
                return ((o1) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 15:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 16:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 17:
                return ((o1) create((a85) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 18:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 19:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 20:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 21:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 22:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 23:
                return ((o1) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((o1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [e62, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        r24 r24Var;
        Object a;
        Object invoke;
        Object u;
        Object next;
        rm1 yjVar;
        Object g54Var;
        Object E;
        AtomicReference atomicReference;
        Object o0;
        String str;
        byte b = this.I;
        ?? r1 = 3;
        char c = 3;
        byte b2 = 4;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        el0 el0Var = el0.I;
        Object obj3 = this.L;
        byte b3 = 1;
        CancellationException cancellationException = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        Object obj4 = null;
        Aweme aweme = null;
        switch (b) {
            case 0:
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    this.J = true;
                    if (((t33) this.K).a((us3) obj3, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z6) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                cy0 cy0Var = (cy0) obj2;
                if (cy0Var == null) {
                    return wd5Var;
                }
                cy0Var.dispose();
                return wd5Var;
            case 1:
                boolean z7 = this.J;
                if (!z7) {
                    mu0.V(obj);
                    this.J = true;
                    return ((rp1) this.K).provideGlance((Context) obj3, (iq1) obj2, this) == el0Var ? el0Var : wd5Var;
                }
                if (z7) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z8 = this.J;
                if (z8) {
                    if (z8) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                zf1 p = o7.p(wi4.w(new ce((zg2) this.K, (byte) 8)));
                y30 y30Var = new y30(obj3, obj2, (byte) (z ? 1 : 0));
                this.J = true;
                return p.collect(y30Var, this) == el0Var ? el0Var : wd5Var;
            case 3:
                boolean z9 = this.J;
                if (!z9) {
                    mu0.V(obj);
                    r24Var = (r24) obj3;
                    this.K = r24Var;
                    this.J = true;
                    a = ((iq3) obj2).a(this);
                    if (a == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z9) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r24Var = (r24) this.K;
                    mu0.V(obj);
                    a = obj;
                }
                r24Var.I = a;
                return wd5Var;
            case 4:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj3;
                dj0 dj0Var = (dj0) this.K;
                boolean z10 = this.J;
                try {
                    try {
                        if (!z10) {
                            mu0.V(obj);
                            qk0 qk0Var = new qk0((hn1) obj2, (fj0) (z3 ? 1 : 0), (byte) (z2 ? 1 : 0));
                            this.J = true;
                            if (i42.o0(qk0Var, this) == el0Var) {
                                return el0Var;
                            }
                        } else {
                            if (!z10) {
                                zy.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mu0.V(obj);
                        }
                    } catch (Throwable th) {
                        try {
                            if (!(th instanceof CancellationException) || th.getCause() != null) {
                                new Integer(Log.e("GlanceAppWidget", "BroadcastReceiver execution failed", th));
                            }
                        } finally {
                            i42.e0(dj0Var, null);
                        }
                    }
                    try {
                        pendingResult.finish();
                        return wd5Var;
                    } catch (IllegalStateException e) {
                        Log.e("GlanceAppWidget", "Error thrown when trying to finish broadcast", e);
                        return wd5Var;
                    }
                } finally {
                }
            case 5:
                jk3 jk3Var = ((qs0) obj3).d;
                boolean z11 = this.J;
                try {
                    if (!z11) {
                        mu0.V(obj);
                        rb4 rb4Var = (rb4) this.K;
                        jk3Var.setValue(Boolean.TRUE);
                        this.J = true;
                        if (((hn1) obj2).invoke(rb4Var, this) == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z11) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    return wd5Var;
                } finally {
                    jk3Var.setValue(Boolean.FALSE);
                }
            case 6:
                boolean z12 = this.J;
                if (z12) {
                    if (z12) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                qs0 qs0Var = (qs0) this.K;
                k53 k53Var = qs0Var.c;
                ps0 ps0Var = qs0Var.b;
                o1 o1Var = new o1((Object) qs0Var, obj2, (fj0) (z4 ? 1 : 0), (byte) 5);
                this.J = true;
                k53Var.getClass();
                return i42.o0(new j53((d53) obj3, k53Var, o1Var, ps0Var, null), this) == el0Var ? el0Var : wd5Var;
            case 7:
                v00 v00Var = (v00) obj2;
                boolean z13 = this.J;
                try {
                    if (!z13) {
                        mu0.V(obj);
                        dl0 dl0Var = (dl0) this.K;
                        this.J = true;
                        invoke = ((hn1) obj3).invoke(dl0Var, this);
                        if (invoke == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z13) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        invoke = obj;
                    }
                    v00Var.a(invoke);
                    return wd5Var;
                } catch (CancellationException unused) {
                    v00Var.d = true;
                    y00 y00Var = v00Var.b;
                    if (y00Var == null || !y00Var.J.cancel(true)) {
                        return wd5Var;
                    }
                    v00Var.a = null;
                    v00Var.b = null;
                    v00Var.c = null;
                    return wd5Var;
                } catch (Throwable th2) {
                    v00Var.b(th2);
                    return wd5Var;
                }
            case 8:
                boolean z14 = this.J;
                if (!z14) {
                    mu0.V(obj);
                    gx3 gx3Var = ((hu2) this.K).p;
                    this.J = true;
                    u = gx3Var.u(1, this);
                    if (u == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z14) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    u = obj;
                }
                Aweme aweme2 = (Aweme) u;
                if (aweme2 == null) {
                    Iterator it = ((List) obj3).iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i2 = ((x03) next).b;
                            do {
                                Object next2 = it.next();
                                int i3 = ((x03) next2).b;
                                if (i2 > i3) {
                                    next = next2;
                                    i2 = i3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    x03 x03Var = (x03) next;
                    if (x03Var != null) {
                        aweme = x03Var.a;
                    }
                } else {
                    aweme = aweme2;
                }
                if (aweme == null) {
                    return wd5Var;
                }
                ((tm1) obj2).invoke(aweme);
                return wd5Var;
            case 9:
                t43 t43Var = (t43) obj3;
                boolean z15 = this.J;
                if (z15) {
                    if (z15) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (((List) t43Var.getValue()).size() <= 1) {
                    return wd5Var;
                }
                p63 p63Var = (p63) ((List) t43Var.getValue()).get(((List) t43Var.getValue()).size() - 2);
                jh4 jh4Var = (jh4) this.K;
                float h = ((fk3) obj2).h();
                this.J = true;
                return jh4Var.o(h, p63Var, this) == el0Var ? el0Var : wd5Var;
            case 10:
                s93 s93Var = (s93) obj2;
                ConnectivityManager connectivityManager = s93Var.a;
                boolean z16 = this.J;
                if (z16) {
                    if (z16) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                bu3 bu3Var = (bu3) this.K;
                NetworkRequest a2 = ((ch0) obj3).a();
                if (a2 == null) {
                    bu3Var.getClass();
                    bu3Var.c(null);
                    return wd5Var;
                }
                be beVar = new be(p70.g0(bu3Var, null, null, new gu2((Object) s93Var, (Object) bu3Var, (fj0) (z5 ? 1 : 0), b3), 3), bu3Var, (byte) 27);
                if (Build.VERSION.SDK_INT >= 30) {
                    pn4.a.getClass();
                    yjVar = pn4.a(connectivityManager, a2, beVar);
                } else {
                    int i4 = c02.c;
                    c02 c02Var = new c02(beVar);
                    n24 n24Var = new n24();
                    byte b4 = 7;
                    try {
                        fr2.e().a(fx5.a, "NetworkRequestConstraintController register callback");
                        connectivityManager.registerNetworkCallback(a2, c02Var);
                        n24Var.I = true;
                    } catch (RuntimeException e2) {
                        if (!qx4.s(e2.getClass().getName(), "TooManyRequestsException", false)) {
                            throw e2;
                        }
                        fr2.e().b(fx5.a, "NetworkRequestConstraintController couldn't register callback", e2);
                        beVar.invoke(new gh0(7));
                    }
                    yjVar = new yj(n24Var, connectivityManager, c02Var, b4);
                }
                mo0 mo0Var = new mo0(yjVar, (byte) 4);
                this.J = true;
                return mu0.g(bu3Var, mo0Var, this) == el0Var ? el0Var : wd5Var;
            case 11:
                boolean z17 = this.J;
                if (z17) {
                    if (z17) {
                        throw r7.s(obj);
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                p04 p04Var = ((ez3) this.K).b;
                y30 y30Var2 = new y30((hu2) obj3, obj2, (byte) 11);
                this.J = true;
                ((fw4) p04Var.I).collect(y30Var2, this);
                return el0Var;
            case 12:
                boolean z18 = this.J;
                try {
                    if (!z18) {
                        mu0.V(obj);
                        dl0 dl0Var2 = (dl0) this.K;
                        qb0 qb0Var = (qb0) obj3;
                        hn1 hn1Var = (hn1) obj2;
                        this.K = qb0Var;
                        this.J = true;
                        g54Var = hn1Var.invoke(dl0Var2, this);
                        r1 = qb0Var;
                        if (g54Var == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z18) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qb0 qb0Var2 = (qb0) this.K;
                        mu0.V(obj);
                        g54Var = obj;
                        r1 = qb0Var2;
                    }
                } catch (Throwable th3) {
                    g54Var = new g54(th3);
                }
                Throwable a3 = h54.a(g54Var);
                if (a3 == null) {
                    r1.S(g54Var);
                    return wd5Var;
                }
                r1.getClass();
                r1.S(new ub0(a3, false));
                return wd5Var;
            case 13:
                boolean z19 = this.J;
                if (!z19) {
                    mu0.V(obj);
                    ap3 ap3Var = new ap3((mc4) this.K, (oc4) obj2, b2);
                    this.J = true;
                    return ((n6) obj3).invoke(ap3Var, this) == el0Var ? el0Var : wd5Var;
                }
                if (z19) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z20 = this.J;
                if (z20) {
                    if (z20) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                oc4 oc4Var = (oc4) obj3;
                oc4Var.k = (rb4) this.K;
                mc4 mc4Var = oc4Var.l;
                this.J = true;
                return ((hn1) obj2).invoke(mc4Var, this) == el0Var ? el0Var : wd5Var;
            case 15:
                ye4 ye4Var = (ye4) this.K;
                boolean z21 = this.J;
                try {
                    try {
                        if (!z21) {
                            mu0.V(obj);
                            fw4 fw4Var = ye4Var.D;
                            Boolean bool = Boolean.TRUE;
                            fw4Var.getClass();
                            fw4Var.i(null, bool);
                            ye4Var.M.h(null);
                            this.J = true;
                            E = ye4Var.b.E((String) obj3, this);
                            if (E == el0Var) {
                                return el0Var;
                            }
                        } else {
                            if (!z21) {
                                zy.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mu0.V(obj);
                            E = ((h54) obj).I;
                        }
                        bo boVar = (bo) obj2;
                        if (!(E instanceof g54)) {
                            Aweme aweme3 = (Aweme) E;
                            if (aweme3 == null) {
                                fw4 fw4Var2 = ye4Var.M;
                                fw4Var2.getClass();
                                fw4Var2.i(null, "未找到该作品 ID 对应的视频");
                            } else {
                                boVar.invoke(aweme3);
                            }
                        }
                        Throwable a4 = h54.a(E);
                        if (a4 != null) {
                            fw4 fw4Var3 = ye4Var.M;
                            String str2 = "视频加载失败: " + a4.getMessage();
                            fw4Var3.getClass();
                            fw4Var3.i(null, str2);
                        }
                    } catch (CancellationException unused2) {
                    } catch (Exception e3) {
                        fw4 fw4Var4 = ye4Var.M;
                        String str3 = "视频加载异常: " + e3.getMessage();
                        fw4Var4.getClass();
                        fw4Var4.i(null, str3);
                    }
                    return wd5Var;
                } finally {
                    fw4 fw4Var5 = ye4Var.D;
                    Boolean bool2 = Boolean.FALSE;
                    fw4Var5.getClass();
                    fw4Var5.i(null, bool2);
                }
            case 16:
                boolean z22 = this.J;
                if (z22) {
                    if (z22) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                dl0 dl0Var3 = (dl0) this.K;
                w84 w = wi4.w(new tt2((cw4) obj3, b2));
                y30 y30Var3 = new y30(obj2, (Object) dl0Var3, (byte) 12);
                this.J = true;
                return w.collect(y30Var3, this) == el0Var ? el0Var : wd5Var;
            case 17:
                SessionWorker sessionWorker = (SessionWorker) obj3;
                boolean z23 = this.J;
                if (z23) {
                    if (z23) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                a85 a85Var = (a85) this.K;
                Context applicationContext = sessionWorker.getApplicationContext();
                fj0 fj0Var = null;
                nk4 nk4Var = new nk4(a85Var, sessionWorker, null);
                dh4 dh4Var = new dh4(a85Var, sessionWorker, (vo) obj2, fj0Var, (byte) 2);
                this.J = true;
                Object o02 = i42.o0(new n6((byte) 10, fj0Var, (Object) applicationContext, (Object) dh4Var, (Object) nk4Var, false), this);
                return o02 == el0Var ? el0Var : o02;
            case 18:
                qr4 qr4Var = (qr4) obj2;
                boolean z24 = this.J;
                if (z24) {
                    if (z24) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                nr4 nr4Var = new nr4((t33) this.K, qr4Var, null);
                gr4 gr4Var = new gr4(qr4Var, c);
                this.J = true;
                return z15.d((xp3) obj3, null, null, nr4Var, gr4Var, this, 3) == el0Var ? el0Var : wd5Var;
            case 19:
                boolean z25 = this.J;
                if (!z25) {
                    mu0.V(obj);
                    au3 au3Var = new au3((t43) obj2, ((dl0) this.K).getCoroutineContext());
                    this.J = true;
                    return ((hn1) obj3).invoke(au3Var, this) == el0Var ? el0Var : wd5Var;
                }
                if (z25) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z26 = this.J;
                if (z26) {
                    if (z26) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                h45 h45Var = (h45) this.K;
                long j = ((rp3) obj2).c;
                this.J = true;
                h45 h45Var2 = new h45(h45Var.L, h45Var.M, h45Var.N, this);
                h45Var2.J = (ts3) obj3;
                h45Var2.K = j;
                return h45Var2.invokeSuspend(wd5Var) == el0Var ? el0Var : wd5Var;
            case 21:
                boolean z27 = this.J;
                if (!z27) {
                    mu0.V(obj);
                    dl0 dl0Var4 = (dl0) this.K;
                    atomicReference = new AtomicReference(null);
                    ld ldVar = new ld((hn1) obj3, (hn3) obj2, dl0Var4, atomicReference, null, (byte) 9);
                    this.K = atomicReference;
                    this.J = true;
                    o0 = i42.o0(ldVar, this);
                    if (o0 == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z27) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = (AtomicReference) this.K;
                    mu0.V(obj);
                    o0 = obj;
                }
                v52 v52Var = (v52) atomicReference.get();
                if (v52Var != null) {
                    v52Var.e(null);
                }
                return o0;
            case 22:
                is0 is0Var = (is0) this.K;
                boolean z28 = this.J;
                if (z28) {
                    if (z28) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (is0Var.k.a() || (str = (String) ((t43) obj2).getValue()) == null) {
                    return wd5Var;
                }
                Iterator it2 = ((List) obj3).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (!j42.c(((Aweme) it2.next()).getAwemeId(), str)) {
                        i++;
                    }
                }
                if (i < 0 || is0Var.d.b.h() == i) {
                    return wd5Var;
                }
                this.J = true;
                return jj3.t(is0Var, i, this) == el0Var ? el0Var : wd5Var;
            case 23:
                g73 g73Var = (g73) obj3;
                boolean z29 = this.J;
                if (z29) {
                    if (z29) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                bu3 bu3Var2 = (bu3) this.K;
                ol olVar = new ol(bu3Var2, (byte) 1);
                ((nu5) g73Var.J).b((Activity) obj2, new fp((byte) 1), olVar);
                x45 x45Var = new x45((Object) g73Var, (Object) olVar, (byte) 6);
                this.J = true;
                return mu0.g(bu3Var2, x45Var, this) == el0Var ? el0Var : wd5Var;
            default:
                ky5 ky5Var = (ky5) obj3;
                boolean z30 = this.J;
                if (z30) {
                    if (z30) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                zf1 d = ((d63) this.K).d(ky5Var);
                y30 y30Var4 = new y30(obj2, (Object) ky5Var, (byte) 15);
                this.J = true;
                return d.collect(y30Var4, this) == el0Var ? el0Var : wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
        this.M = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
    }
}
