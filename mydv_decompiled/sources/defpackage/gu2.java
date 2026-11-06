package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.glance.session.SessionWorker;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.widget.WidgetUpdater;
import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gu2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(hu2 hu2Var, ow3 ow3Var, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 5;
        this.K = hu2Var;
        this.L = ow3Var;
        this.J = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        switch (b) {
            case 0:
                return new gu2(this.K, obj2, fj0Var, (byte) 0);
            case 1:
                return new gu2(this.K, obj2, fj0Var, (byte) 1);
            case 2:
                return new gu2(this.K, obj2, fj0Var, (byte) 2);
            case 3:
                gu2 gu2Var = new gu2((iz) obj2, fj0Var, (byte) 3);
                gu2Var.K = obj;
                return gu2Var;
            case 4:
                return new gu2(this.K, obj2, fj0Var, (byte) 4);
            case 5:
                return new gu2((hu2) this.K, (ow3) obj2, this.J, fj0Var);
            case 6:
                return new gu2(this.J, (rm1) this.K, (t43) obj2, fj0Var);
            case 7:
                return new gu2(this.K, obj2, fj0Var, (byte) 7);
            case 8:
                return new gu2(this.K, obj2, fj0Var, (byte) 8);
            case 9:
                gu2 gu2Var2 = new gu2((od2) obj2, fj0Var, (byte) 9);
                gu2Var2.K = obj;
                return gu2Var2;
            case 10:
                gu2 gu2Var3 = new gu2((CookieManager) obj2, fj0Var, (byte) 10);
                gu2Var3.K = obj;
                return gu2Var3;
            case 11:
                return new gu2(this.K, obj2, fj0Var, (byte) 11);
            case 12:
                return new gu2(this.K, obj2, fj0Var, (byte) 12);
            case 13:
                gu2 gu2Var4 = new gu2((zc4) obj2, fj0Var, (byte) 13);
                gu2Var4.K = obj;
                return gu2Var4;
            case 14:
                gu2 gu2Var5 = new gu2((rm1) obj2, fj0Var, (byte) 14);
                gu2Var5.K = obj;
                return gu2Var5;
            case 15:
                return new gu2(this.K, obj2, fj0Var, (byte) 15);
            case 16:
                gu2 gu2Var6 = new gu2((yp4) obj2, fj0Var, (byte) 16);
                gu2Var6.K = obj;
                return gu2Var6;
            case 17:
                return new gu2(this.K, obj2, fj0Var, (byte) 17);
            case 18:
                return new gu2(this.K, obj2, fj0Var, (byte) 18);
            case 19:
                return new gu2(this.K, obj2, fj0Var, (byte) 19);
            case 20:
                return new gu2(this.K, obj2, fj0Var, (byte) 20);
            case 21:
                return new gu2(this.K, obj2, fj0Var, (byte) 21);
            case 22:
                gu2 gu2Var7 = new gu2((fb5) obj2, fj0Var, (byte) 22);
                gu2Var7.K = obj;
                return gu2Var7;
            case 23:
                return new gu2(this.K, obj2, fj0Var, (byte) 23);
            case 24:
                gu2 gu2Var8 = new gu2((ag1) obj2, fj0Var, (byte) 24);
                gu2Var8.K = obj;
                return gu2Var8;
            default:
                gu2 gu2Var9 = new gu2((ao5) obj2, fj0Var, (byte) 25);
                gu2Var9.K = obj;
                return gu2Var9;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 5:
                ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 6:
                ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 7:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 8:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 9:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 10:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 11:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 12:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 13:
                return ((gu2) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 14:
                return ((gu2) create((zf1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 15:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 16:
                return ((gu2) create((ag1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 17:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 18:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 19:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 20:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 21:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 22:
                return ((gu2) create((lq3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 23:
                return ((gu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 24:
                return ((gu2) create(obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((gu2) create((xp3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [jk3] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v14, types: [v52] */
    /* JADX WARN: Type inference failed for: r1v16, types: [v52] */
    /* JADX WARN: Type inference failed for: r1v65, types: [qr4] */
    /* JADX WARN: Type inference failed for: r1v66, types: [qr4] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object g54Var;
        Object g54Var2;
        Object a;
        Object b;
        ?? r1 = 3;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        ?? r8 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (this.I) {
            case 0:
                el0 el0Var = el0.I;
                boolean z6 = this.J;
                if (!z6) {
                    mu0.V(obj);
                    WidgetUpdater widgetUpdater = WidgetUpdater.INSTANCE;
                    Application application = ((hu2) this.K).b;
                    Aweme aweme = (Aweme) this.L;
                    this.J = true;
                    if (widgetUpdater.recordVideo(application, aweme, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z6) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 1:
                el0 el0Var2 = el0.I;
                boolean z7 = this.J;
                if (!z7) {
                    mu0.V(obj);
                    this.J = true;
                    if (rt0.n(1000L, this) == el0Var2) {
                        return el0Var2;
                    }
                } else {
                    if (!z7) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                fr2.e().a(fx5.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((bu3) this.L).d(new gh0(7));
                return wd5.a;
            case 2:
                el0 el0Var3 = el0.I;
                boolean z8 = this.J;
                if (!z8) {
                    mu0.V(obj);
                    oc4 oc4Var = ((wa3) this.K).a;
                    d53 d53Var = d53.J;
                    hn1 hn1Var = (hn1) this.L;
                    this.J = true;
                    if (oc4Var.g(d53Var, hn1Var, this) == el0Var3) {
                        return el0Var3;
                    }
                } else {
                    if (!z8) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 3:
                el0 el0Var4 = el0.I;
                boolean z9 = this.J;
                try {
                    if (!z9) {
                        mu0.V(obj);
                        rv4 g0 = p70.g0((dl0) this.K, null, null, new h40(b2, z ? 1 : 0), 3);
                        iz izVar = (iz) this.L;
                        this.K = g0;
                        this.J = true;
                        h = izVar.h(this);
                        r1 = g0;
                        if (h == el0Var4) {
                            return el0Var4;
                        }
                    } else {
                        if (!z9) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        v52 v52Var = (v52) this.K;
                        mu0.V(obj);
                        h = obj;
                        r1 = v52Var;
                    }
                    r1.e(null);
                    r8 = h;
                    return r8;
                } catch (Throwable th) {
                    r1.e(r8);
                    throw th;
                }
            case 4:
                el0 el0Var5 = el0.I;
                boolean z10 = this.J;
                if (z10) {
                    if (z10) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                TextClassifier textClassifier = (TextClassifier) this.K;
                if (textClassifier == null) {
                    return null;
                }
                hn1 hn1Var2 = (hn1) this.L;
                this.J = true;
                Object invoke = hn1Var2.invoke(textClassifier, this);
                return invoke == el0Var5 ? el0Var5 : invoke;
            case 5:
                boolean z11 = this.J;
                mu0.V(obj);
                gx3 gx3Var = ((hu2) this.K).p;
                gx3Var.m++;
                gx3Var.k.i(null, new gu3());
                switch (((ow3) this.L).ordinal()) {
                    case 0:
                        gx3Var.K(false);
                        break;
                    case 1:
                        gx3Var.F(false);
                        break;
                    case 2:
                        gx3Var.I(false);
                        break;
                    case 3:
                        if (!z11) {
                            gx3Var.E(false);
                            break;
                        }
                        break;
                    case 4:
                        if (!z11) {
                            gx3Var.M(false);
                            break;
                        }
                        break;
                    case 5:
                        gx3Var.G(false);
                        break;
                    case 6:
                        gx3Var.H(false);
                        break;
                    case 7:
                        if (!z11) {
                            gx3Var.L(false);
                            break;
                        }
                        break;
                    default:
                        s83.v();
                        return null;
                }
                return wd5.a;
            case 6:
                mu0.V(obj);
                t43 t43Var = (t43) this.L;
                ml0 ml0Var = mw3.a;
                if (((Boolean) t43Var.getValue()).booleanValue() && !this.J) {
                    ((rm1) this.K).invoke();
                }
                return wd5.a;
            case 7:
                el0 el0Var6 = el0.I;
                boolean z12 = this.J;
                if (!z12) {
                    mu0.V(obj);
                    gx3 gx3Var2 = (gx3) this.K;
                    String str = (String) this.L;
                    this.J = true;
                    if (gx3Var2.t(str, this) == el0Var6) {
                        return el0Var6;
                    }
                } else {
                    if (!z12) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 8:
                od2 od2Var = (od2) this.K;
                el0 el0Var7 = el0.I;
                boolean z13 = this.J;
                if (z13) {
                    if (z13) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (od2Var.d) {
                    zy.i("抖音登录会话已关闭");
                    return null;
                }
                final qb0 c = g4.c();
                ((WebView) od2Var.c).evaluateJavascript((String) this.L, new ValueCallback() { // from class: ly3
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            str2 = "null";
                        }
                        qb0.this.S(str2);
                    }
                });
                my3 my3Var = new my3(c, z2 ? 1 : 0, b3);
                this.J = true;
                Object l = qi4.l(new x75(15000L, this), my3Var);
                return l == el0Var7 ? el0Var7 : l;
            case 9:
                el0 el0Var8 = el0.I;
                boolean z14 = this.J;
                if (!z14) {
                    mu0.V(obj);
                    od2 od2Var2 = (od2) this.L;
                    if (od2Var2 != null) {
                        this.K = null;
                        this.J = true;
                        os0 os0Var = sx0.a;
                        if (p70.D0(ju2.a, new py3(od2Var2, z3 ? 1 : 0, b4), this) == el0Var8) {
                            return el0Var8;
                        }
                    }
                    return wd5.a;
                }
                if (!z14) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                return wd5.a;
            case 10:
                wd5 wd5Var = wd5.a;
                dl0 dl0Var = (dl0) this.K;
                el0 el0Var9 = el0.I;
                boolean z15 = this.J;
                if (!z15) {
                    mu0.V(obj);
                    CookieManager cookieManager = (CookieManager) this.L;
                    this.K = dl0Var;
                    this.J = true;
                    k10 k10Var = new k10(1, mu0.G(this));
                    k10Var.t();
                    p24 p24Var = new p24();
                    p24Var.I = 2;
                    yu1 yu1Var = new yu1(p24Var, k10Var, (byte) 3);
                    try {
                        cookieManager.removeAllCookies(new cz3(yu1Var, (byte) 0));
                        g54Var = wd5Var;
                    } catch (Throwable th2) {
                        g54Var = new g54(th2);
                    }
                    if (h54.a(g54Var) != null) {
                        yu1Var.invoke();
                    }
                    try {
                        cookieManager.removeSessionCookies(new cz3(yu1Var, (byte) 1));
                        g54Var2 = wd5Var;
                    } catch (Throwable th3) {
                        g54Var2 = new g54(th3);
                    }
                    if (h54.a(g54Var2) != null) {
                        yu1Var.invoke();
                    }
                    if (k10Var.r() == el0Var9) {
                        return el0Var9;
                    }
                } else {
                    if (!z15) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
            case 11:
                el0 el0Var10 = el0.I;
                boolean z16 = this.J;
                if (!z16) {
                    mu0.V(obj);
                    bh bhVar = ((ue) this.K).O;
                    Float f = new Float(0.0f);
                    bj bjVar = (bj) this.L;
                    this.J = true;
                    if (bh.a(bhVar, f, bjVar, null, null, this, 12) == el0Var10) {
                        return el0Var10;
                    }
                } else {
                    if (!z16) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 12:
                el0 el0Var11 = el0.I;
                boolean z17 = this.J;
                if (!z17) {
                    mu0.V(obj);
                    o21 o21Var = (o21) this.K;
                    float f2 = o21Var.b ? -1.0f : 1.0f;
                    oc4 oc4Var2 = ((fc4) this.L).l0;
                    long h2 = ji5.h(o21Var.a, f2);
                    this.J = true;
                    if (oc4Var2.c(h2, false, this) == el0Var11) {
                        return el0Var11;
                    }
                } else {
                    if (!z17) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 13:
                wd5 wd5Var2 = wd5.a;
                bu3 bu3Var = (bu3) this.K;
                el0 el0Var12 = el0.I;
                boolean z18 = this.J;
                if (!z18) {
                    mu0.V(obj);
                    Object systemService = ((zc4) this.L).b.getSystemService("connectivity");
                    ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                    c02 c02Var = new c02(bu3Var, b2);
                    n24 n24Var = new n24();
                    if (connectivityManager != null) {
                        try {
                            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), c02Var);
                            n24Var.I = true;
                        } catch (Exception e) {
                            Log.w("SearchInputServer", "无法监听搜索地址变化", e);
                        }
                    }
                    bu3Var.d(wd5Var2);
                    yj yjVar = new yj((Object) n24Var, (Object) connectivityManager, (Object) c02Var, (byte) 13);
                    this.K = null;
                    this.J = true;
                    if (mu0.g(bu3Var, yjVar, this) == el0Var12) {
                        return el0Var12;
                    }
                } else {
                    if (!z18) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var2;
            case 14:
                zf1 zf1Var = (zf1) this.K;
                el0 el0Var13 = el0.I;
                boolean z19 = this.J;
                if (!z19) {
                    mu0.V(obj);
                    w73 w73Var = w73.K;
                    this.K = null;
                    this.J = true;
                    if (zf1Var.collect(w73Var, this) == el0Var13) {
                        return el0Var13;
                    }
                } else {
                    if (!z19) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                ((rm1) this.L).invoke();
                return wd5.a;
            case 15:
                el0 el0Var14 = el0.I;
                boolean z20 = this.J;
                if (!z20) {
                    mu0.V(obj);
                    ck4 ck4Var = ((SessionWorker) this.K).b;
                    mk4 mk4Var = new mk4((vo) this.L, z4 ? 1 : 0, b4);
                    this.J = true;
                    ik4 ik4Var = (ik4) ck4Var;
                    ik4Var.getClass();
                    if (ik4.a(ik4Var, mk4Var, this) == el0Var14) {
                        return el0Var14;
                    }
                } else {
                    if (!z20) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            case 16:
                wd5 wd5Var3 = wd5.a;
                yp4 yp4Var = (yp4) this.L;
                fw4 fw4Var = yp4Var.g;
                el0 el0Var15 = el0.I;
                boolean z21 = this.J;
                if (z21) {
                    if (z21) {
                        mu0.V(obj);
                        return wd5Var3;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                ag1 ag1Var = (ag1) this.K;
                bw4 bw4Var = (bw4) fw4Var.getValue();
                if (!(bw4Var instanceof ep0)) {
                    yp4Var.i.j(new jp4(bw4Var));
                }
                k kVar = new k((Object) bw4Var, (fj0) (z5 ? 1 : 0), (byte) 19);
                this.J = true;
                if (ag1Var instanceof g75) {
                    throw ((g75) ag1Var).I;
                }
                fw4Var.collect(new mi(new n24(), new wg0(ag1Var, (byte) 9), kVar, (byte) 1), this);
                return el0Var15;
            case 17:
                el0 el0Var16 = el0.I;
                boolean z22 = this.J;
                if (z22) {
                    if (z22) {
                        mu0.V(obj);
                        return wd5.a;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                mn4 mn4Var = ((t33) this.K).a;
                id idVar = new id((gt4) this.L, (byte) 5);
                this.J = true;
                mn4.j(mn4Var, idVar, this);
                return el0Var16;
            case 18:
                ?? r12 = (qr4) this.K;
                el0 el0Var17 = el0.I;
                boolean z23 = this.J;
                try {
                    if (!z23) {
                        mu0.V(obj);
                        r12.o.setValue(Boolean.TRUE);
                        k53 k53Var = r12.t;
                        pr4 pr4Var = r12.s;
                        d53 d53Var2 = d53.J;
                        n6 n6Var = (n6) this.L;
                        this.J = true;
                        k53Var.getClass();
                        if (i42.o0(new j53(d53Var2, k53Var, n6Var, pr4Var, null), this) == el0Var17) {
                            return el0Var17;
                        }
                    } else {
                        if (!z23) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                    }
                    ?? r0 = r12.o;
                    r12 = Boolean.FALSE;
                    r0.setValue(r12);
                    return wd5.a;
                } catch (Throwable th4) {
                    r12.o.setValue(Boolean.FALSE);
                    throw th4;
                }
            case 19:
                rm1 rm1Var = (rm1) this.K;
                el0 el0Var18 = el0.I;
                boolean z24 = this.J;
                if (!z24) {
                    mu0.V(obj);
                    if (rm1Var == null) {
                        return wd5.a;
                    }
                } else {
                    if (!z24) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                do {
                    hk3 hk3Var = (hk3) this.L;
                    long longValue = ((Number) rm1Var.invoke()).longValue();
                    DateTimeFormatter dateTimeFormatter = fv4.a;
                    hk3Var.i(longValue);
                    this.J = true;
                } while (rt0.n(500L, this) != el0Var18);
                return el0Var18;
            case 20:
                el0 el0Var19 = el0.I;
                boolean z25 = this.J;
                try {
                    if (!z25) {
                        mu0.V(obj);
                        Object obj2 = ((g12) this.K).J;
                        vx4 vx4Var = (vx4) this.L;
                        synchronized (obj2) {
                            if (vx4Var.c == wx4.M) {
                                vx4Var.c = wx4.J;
                            }
                        }
                        float floatValue = ((Number) p70.F.b.invoke(((vx4) this.L).b.c.K)).floatValue();
                        ((vx4) this.L).b = p70.a(0.0f);
                        bh bhVar2 = ((vx4) this.L).b;
                        Float f3 = new Float(1.0f);
                        bj bjVar2 = ((vx4) this.L).a;
                        Float f4 = new Float(floatValue);
                        this.J = true;
                        a = bh.a(bhVar2, f3, bjVar2, f4, null, this, 8);
                        if (a == el0Var19) {
                            return el0Var19;
                        }
                    } else {
                        if (!z25) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        a = obj;
                    }
                    ((g12) this.K).l();
                    return wd5.a;
                } catch (Throwable th5) {
                    ((g12) this.K).l();
                    throw th5;
                }
            case 21:
                el0 el0Var20 = el0.I;
                boolean z26 = this.J;
                if (z26) {
                    if (z26) {
                        mu0.V(obj);
                        return wd5.a;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                y43 y43Var = ((dy4) this.K).S;
                t33 t33Var = (t33) this.L;
                this.J = true;
                o5 o5Var = new o5();
                o5 o5Var2 = new o5();
                o5 o5Var3 = new o5();
                v43 v43Var = y43Var.c;
                v43 v43Var2 = y43Var.c;
                v43Var.a(1, false);
                v43Var2.a(2, false);
                v43Var2.a(4, false);
                mn4.j(t33Var.a, new dk0(o5Var, y43Var, o5Var2, o5Var3, (byte) 2), this);
                return el0Var20;
            case 22:
                el0 el0Var21 = el0.I;
                boolean z27 = this.J;
                if (z27) {
                    if (z27) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                lq3 lq3Var = (lq3) this.K;
                fb5 fb5Var = (fb5) this.L;
                this.J = true;
                Object a2 = fb5Var.a(lq3Var, this);
                return a2 == el0Var21 ? el0Var21 : a2;
            case 23:
                rm1 rm1Var2 = (rm1) this.L;
                el0 el0Var22 = el0.I;
                boolean z28 = this.J;
                try {
                    if (!z28) {
                        mu0.V(obj);
                        fb5 fb5Var2 = (fb5) this.K;
                        this.J = true;
                        b = fb5Var2.b(this);
                        if (b == el0Var22) {
                            return el0Var22;
                        }
                    } else {
                        if (!z28) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        b = obj;
                    }
                    rm1Var2.invoke();
                    return wd5.a;
                } catch (Throwable th6) {
                    rm1Var2.invoke();
                    throw th6;
                }
            case 24:
                Object obj3 = this.K;
                el0 el0Var23 = el0.I;
                boolean z29 = this.J;
                if (!z29) {
                    mu0.V(obj);
                    ag1 ag1Var2 = (ag1) this.L;
                    this.K = null;
                    this.J = true;
                    if (ag1Var2.emit(obj3, this) == el0Var23) {
                        return el0Var23;
                    }
                } else {
                    if (!z29) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            default:
                xp3 xp3Var = (xp3) this.K;
                el0 el0Var24 = el0.I;
                boolean z30 = this.J;
                if (!z30) {
                    mu0.V(obj);
                    ao5 ao5Var = (ao5) this.L;
                    r05 r05Var = (r05) xp3Var;
                    r05Var.getClass();
                    zn5 zn5Var = new zn5(ao5Var, ut0.U(r05Var).i0.f(), null);
                    this.K = null;
                    this.J = true;
                    if (e21.k(xp3Var, zn5Var, this) == el0Var24) {
                        return el0Var24;
                    }
                } else {
                    if (!z30) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu2(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu2(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(boolean z, rm1 rm1Var, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 6;
        this.J = z;
        this.K = rm1Var;
        this.L = t43Var;
    }
}
