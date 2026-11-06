package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.UserWorksResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kn5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ gp3 J;
    public final /* synthetic */ kq5 K;
    public final /* synthetic */ MixInfo L;
    public final /* synthetic */ int M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ s33 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn5(gp3 gp3Var, kq5 kq5Var, MixInfo mixInfo, int i, t43 t43Var, t43 t43Var2, t43 t43Var3, s33 s33Var, t43 t43Var4, t43 t43Var5, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = gp3Var;
        this.K = kq5Var;
        this.L = mixInfo;
        this.M = i;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = s33Var;
        this.R = t43Var4;
        this.S = t43Var5;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new kn5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((kn5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        kn5 kn5Var;
        Object q;
        Map map;
        boolean z = this.I;
        int i = this.M;
        t43 t43Var = this.O;
        gp3 gp3Var = this.J;
        if (!z) {
            mu0.V(obj);
            ta1 ta1Var = on5.a;
            t43Var.setValue(gp3Var);
            this.I = true;
            kn5Var = this;
            q = this.K.q(this.L.getMixId(), i, false, kn5Var);
            el0 el0Var = el0.I;
            if (q == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
            q = ((h54) obj).I;
            kn5Var = this;
        }
        if (!(q instanceof g54)) {
            UserWorksResponse userWorksResponse = (UserWorksResponse) q;
            List<Aweme> awemeList = userWorksResponse.getAwemeList();
            if (awemeList == null) {
                awemeList = o91.I;
            }
            List<Aweme> filterPrimaryPlayableAwemes = DataModelKt.filterPrimaryPlayableAwemes(awemeList);
            ta1 ta1Var2 = on5.a;
            t43 t43Var2 = kn5Var.P;
            Map map2 = (Map) t43Var2.getValue();
            Integer num = new Integer(i);
            map2.getClass();
            if (map2.isEmpty()) {
                map = Collections.singletonMap(num, filterPrimaryPlayableAwemes);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.put(num, filterPrimaryPlayableAwemes);
                map = linkedHashMap;
            }
            t43Var2.setValue(map);
            if (gp3Var != gp3.I) {
                Long cursor = userWorksResponse.getCursor();
                ((gk3) kn5Var.Q).i(cursor != null ? (int) cursor.longValue() : awemeList.size() + i);
                kn5Var.R.setValue(Boolean.valueOf(userWorksResponse.getHasMore()));
            }
            List j1 = o70.j1(((Map) t43Var2.getValue()).keySet());
            ArrayList arrayList = new ArrayList();
            Iterator it = j1.iterator();
            while (it.hasNext()) {
                u70.I0(arrayList, (Iterable) sv2.E(new Integer(((Number) it.next()).intValue()), (Map) t43Var2.getValue()));
            }
            kn5Var.S.setValue(arrayList);
        }
        Throwable a = h54.a(q);
        if (a != null) {
            Log.e("MixVideos", "Failed to load: " + a.getMessage());
        }
        ta1 ta1Var3 = on5.a;
        t43Var.setValue(null);
        return wd5.a;
    }
}
