package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.MixInfo;
import java.text.SimpleDateFormat;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ ra0(l13 l13Var, ip ipVar, mp mpVar, k04 k04Var, tc0 tc0Var, int i) {
        this.I = (byte) 1;
        this.J = l13Var;
        this.L = ipVar;
        this.M = mpVar;
        this.N = k04Var;
        this.O = tc0Var;
        this.K = i;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        Object obj3 = this.O;
        Object obj4 = this.N;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj5 = this.J;
        Object obj6 = this.M;
        Object obj7 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                cb0.e((Comment) obj7, (Map) obj6, (cw4) obj4, (SimpleDateFormat) obj3, (l13) obj5, (fe0) obj, mu0.X(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                e41.e((l13) obj5, (ip) obj7, (mp) obj6, (k04) obj4, (tc0) obj3, (fe0) obj, mu0.X(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qm4.h((Author) obj7, (String) obj6, (String) obj4, (rm1) obj3, (l13) obj5, (fe0) obj, mu0.X(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int X = mu0.X(i | 1);
                mw2.n((ea5) obj7, (ba5) obj6, this.N, this.O, (ve1) obj5, (fe0) obj, X);
                break;
            default:
                ((Integer) obj2).getClass();
                on5.f((Aweme) obj7, (MixInfo) obj6, (ki1) obj4, (rm1) obj3, (l13) obj5, (fe0) obj, mu0.X(i | 1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ra0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.N = obj3;
        this.O = obj4;
        this.J = obj5;
        this.K = i;
    }
}
