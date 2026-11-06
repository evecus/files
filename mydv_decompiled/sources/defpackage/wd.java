package defpackage;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ wd(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                xd xdVar = (xd) obj5;
                jc5 b2 = ((nj1) xdVar.e).b((mj1) obj, (qk1) obj2, ((lk1) obj3).a, ((mk1) obj4).a);
                if (b2 instanceof ic5) {
                    Object obj6 = ((ic5) b2).I;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                x81 x81Var = new x81(b2, xdVar.j);
                xdVar.j = x81Var;
                return x81Var.j();
            default:
                hu2 hu2Var = (hu2) obj5;
                p63 p63Var = (p63) obj2;
                fe0 fe0Var = (fe0) obj3;
                ((Integer) obj4).getClass();
                ((th) obj).getClass();
                p63Var.getClass();
                Bundle a = p63Var.P.a();
                fj0 fj0Var = null;
                String string = a != null ? a.getString("query") : null;
                if (string == null) {
                    string = "";
                }
                String decode = Uri.decode(string);
                go1 go1Var = (go1) fe0Var;
                boolean i = go1Var.i(hu2Var) | go1Var.g(decode);
                Object Q = go1Var.Q();
                if (i || Q == de0.a) {
                    Q = new k(hu2Var, decode, fj0Var, (byte) 1);
                    go1Var.o0(Q);
                }
                mw2.h(go1Var, (hn1) Q, decode);
                he4.j(hu2Var, i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 0.0f, 13), go1Var, 56);
                return wd5.a;
        }
    }
}
