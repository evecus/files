package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ef5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef5(String str, String str2, r24 r24Var, r24 r24Var2, String str3, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 0;
        this.J = str;
        this.K = str2;
        this.M = r24Var;
        this.N = r24Var2;
        this.L = str3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        switch (b) {
            case 0:
                return new ef5((String) obj6, (String) obj5, (r24) obj3, (r24) obj2, (String) obj4, fj0Var);
            case 1:
                return new ef5((List) obj6, (is0) obj5, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 1);
            default:
                return new ef5((is0) obj6, (t43) obj5, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((ef5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((ef5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((ef5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        so3 so3Var = so3.K;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.J;
        Object obj5 = this.K;
        Object obj6 = this.N;
        switch (b) {
            case 0:
                mu0.V(obj);
                fw4 fw4Var = lf5.d;
                String str = (String) obj5;
                str.getClass();
                cf5 cf5Var = new cf5((String) obj4, str, (String) ((r24) obj2).I, (String) ((r24) obj6).I, (String) obj3);
                fw4Var.getClass();
                fw4Var.i(null, cf5Var);
                break;
            case 1:
                t43 t43Var = (t43) obj6;
                mu0.V(obj);
                Aweme aweme = (Aweme) o70.V0(((is0) obj5).o(), (List) obj4);
                String awemeId = aweme != null ? aweme.getAwemeId() : null;
                if (((so3) ((t43) obj3).getValue()) != so3Var || !((Boolean) ((t43) obj2).getValue()).booleanValue() || !j42.c((String) t43Var.getValue(), awemeId)) {
                    t43Var.setValue(null);
                    break;
                }
                break;
            default:
                t43 t43Var2 = (t43) obj6;
                mu0.V(obj);
                Aweme aweme2 = (Aweme) o70.V0(((is0) obj4).o(), (List) ((t43) obj5).getValue());
                String awemeId2 = aweme2 != null ? aweme2.getAwemeId() : null;
                if (((so3) ((t43) obj3).getValue()) != so3Var || !((Boolean) ((t43) obj2).getValue()).booleanValue() || !j42.c((String) t43Var2.getValue(), awemeId2)) {
                    t43Var2.setValue(null);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef5(Object obj, Object obj2, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }
}
