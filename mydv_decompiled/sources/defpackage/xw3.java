package defpackage;

import com.github.mytv.dv.model.Author;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xw3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ gx3 K;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw3(gx3 gx3Var, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = gx3Var;
        this.L = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        int i = this.L;
        gx3 gx3Var = this.K;
        switch (b) {
            case 0:
                return new xw3(gx3Var, i, fj0Var, (byte) 0);
            default:
                return new xw3(gx3Var, i, fj0Var, (byte) 1);
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
        return ((xw3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object v;
        int i;
        String secUid;
        byte b = this.I;
        el0 el0Var = el0.I;
        gx3 gx3Var = this.K;
        int i2 = this.L;
        boolean z = true;
        char c = 1;
        rv4 rv4Var = null;
        switch (b) {
            case 0:
                boolean z2 = this.J;
                if (z2) {
                    if (z2) {
                        mu0.V(obj);
                        return obj;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                fw4 fw4Var = gx3Var.J0;
                lw3 lw3Var = new lw3(i2, rv4Var, c == true ? 1 : 0);
                this.J = true;
                Object L = sp0.L(fw4Var, lw3Var, this);
                return L == el0Var ? el0Var : L;
            default:
                fw4 fw4Var2 = gx3Var.S0;
                fw4 fw4Var3 = gx3Var.t;
                fw4 fw4Var4 = gx3Var.r;
                boolean z3 = this.J;
                try {
                    if (!z3) {
                        mu0.V(obj);
                        fw4Var4.i(null, Boolean.TRUE);
                        fw4Var3.i(null, Boolean.FALSE);
                        fw4Var2.h(null);
                        kq5 kq5Var = gx3Var.b;
                        this.J = true;
                        v = kq5Var.v(this);
                        if (v == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z3) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        v = ((h54) obj).I;
                    }
                    int i3 = gx3Var.y;
                    wd5 wd5Var = wd5.a;
                    if (i2 == i3) {
                        if (!(v instanceof g54)) {
                            Author author = (Author) v;
                            gx3Var.e.h(author);
                            fw4Var3.i(null, Boolean.valueOf(author == null));
                            fw4 fw4Var5 = gx3Var.v;
                            if (author != null) {
                                z = false;
                            }
                            fw4Var5.i(null, Boolean.valueOf(z));
                            if (author != null && (secUid = author.getSecUid()) != null && secUid.length() > 0) {
                                gx3Var.K(false);
                                gx3Var.F(false);
                            }
                        }
                        Throwable a = h54.a(v);
                        if (a != null) {
                            fw4Var3.i(null, Boolean.TRUE);
                            fw4Var2.i(null, "加载用户信息失败: " + a.getMessage());
                        }
                        if (i2 != i) {
                            return wd5Var;
                        }
                    } else if (i2 != i3) {
                        return wd5Var;
                    }
                    return wd5Var;
                } finally {
                    if (i2 == gx3Var.y) {
                        fw4Var4.i(null, Boolean.FALSE);
                        gx3Var.x = null;
                    }
                }
        }
    }
}
