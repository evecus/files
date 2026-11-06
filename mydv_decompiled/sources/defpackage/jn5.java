package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jn5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ kq5 K;
    public final /* synthetic */ Aweme L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn5(kq5 kq5Var, Aweme aweme, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = kq5Var;
        this.L = aweme;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = t43Var4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new jn5(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 0);
            default:
                return new jn5(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 1);
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
        return ((jn5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object t;
        Object t2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.P;
        t43 t43Var2 = this.O;
        t43 t43Var3 = this.N;
        kq5 kq5Var = this.K;
        el0 el0Var = el0.I;
        t43 t43Var4 = this.M;
        Aweme aweme = this.L;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    on5.b0(t43Var4, true);
                    String awemeId = aweme.getAwemeId();
                    this.J = true;
                    t = kq5Var.t(1, this, awemeId, "");
                    if (t == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    t = ((h54) obj).I;
                }
                if (!(t instanceof g54)) {
                    List list = (List) t;
                    ta1 ta1Var = on5.a;
                    t43Var3.setValue(list);
                    if (!list.isEmpty()) {
                        List j0 = p70.j0(aweme.getAwemeId());
                        ArrayList arrayList = new ArrayList(p70.J(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Aweme) it.next()).getAwemeId());
                        }
                        t43Var2.setValue(o70.Z0(o70.P0(o70.f1(j0, arrayList)), ",", null, null, 0, null, 62));
                    }
                    t43Var.setValue(Boolean.TRUE);
                }
                Throwable a = h54.a(t);
                if (a != null) {
                    Log.e("RelatedVideos", "Failed to load: " + a.getMessage());
                }
                on5.b0(t43Var4, false);
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    on5.b0(t43Var4, true);
                    String awemeId2 = aweme.getAwemeId();
                    this.J = true;
                    t2 = kq5Var.t(1, this, awemeId2, "");
                    if (t2 == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    t2 = ((h54) obj).I;
                }
                if (!(t2 instanceof g54)) {
                    List list2 = (List) t2;
                    ta1 ta1Var2 = on5.a;
                    t43Var3.setValue(list2);
                    if (!list2.isEmpty()) {
                        List j02 = p70.j0(aweme.getAwemeId());
                        ArrayList arrayList2 = new ArrayList(p70.J(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Aweme) it2.next()).getAwemeId());
                        }
                        t43Var2.setValue(o70.Z0(o70.P0(o70.f1(j02, arrayList2)), ",", null, null, 0, null, 62));
                    }
                    t43Var.setValue(Boolean.TRUE);
                }
                Throwable a2 = h54.a(t2);
                if (a2 != null) {
                    Log.e("RelatedVideos", "Failed to load: " + a2.getMessage());
                }
                on5.b0(t43Var4, false);
                break;
        }
        return wd5Var;
    }
}
