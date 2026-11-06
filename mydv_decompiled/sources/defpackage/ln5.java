package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ln5 extends k05 implements hn1 {
    public int I;
    public boolean J;
    public final /* synthetic */ kq5 K;
    public final /* synthetic */ Aweme L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ s33 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln5(kq5 kq5Var, Aweme aweme, t43 t43Var, s33 s33Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = kq5Var;
        this.L = aweme;
        this.M = t43Var;
        this.N = s33Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = t43Var4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ln5(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ln5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        int h;
        Object t;
        boolean z = this.J;
        t43 t43Var = this.O;
        s33 s33Var = this.N;
        t43 t43Var2 = this.M;
        if (!z) {
            mu0.V(obj);
            on5.b0(t43Var2, true);
            h = ((gk3) s33Var).h() + 1;
            String awemeId = this.L.getAwemeId();
            String str = (String) t43Var.getValue();
            this.I = h;
            this.J = true;
            t = this.K.t(h, this, awemeId, str);
            el0 el0Var = el0.I;
            if (t == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h = this.I;
            mu0.V(obj);
            t = ((h54) obj).I;
        }
        if (!(t instanceof g54)) {
            List list = (List) t;
            ta1 ta1Var = on5.a;
            t43 t43Var3 = this.P;
            List list2 = (List) t43Var3.getValue();
            HashSet hashSet = new HashSet();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hashSet.add(((Aweme) it.next()).getAwemeId());
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (hashSet.add(((Aweme) obj2).getAwemeId())) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q.setValue(Boolean.FALSE);
            } else {
                t43Var3.setValue(o70.f1((List) t43Var3.getValue(), arrayList));
                List X = jx4.X((String) t43Var.getValue(), new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    arrayList2.add(((Aweme) obj3).getAwemeId());
                }
                t43Var.setValue(o70.Z0(o70.P0(o70.f1(X, arrayList2)), ",", null, null, 0, null, 62));
                ((gk3) s33Var).i(h);
            }
        }
        Throwable a = h54.a(t);
        if (a != null) {
            Log.e("RelatedVideos", "Failed to load more: " + a.getMessage());
        }
        on5.b0(t43Var2, false);
        return wd5.a;
    }
}
