package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gx5 {
    public static final String i = fr2.h("WorkContinuationImpl");
    public final ux5 a;
    public final String b;
    public final ac1 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public uu2 h;

    public gx5(ux5 ux5Var, String str, ac1 ac1Var, List list, int i2) {
        this.a = ux5Var;
        this.b = str;
        this.c = ac1Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (ac1Var == ac1.I && ((gy5) list.get(i3)).b.u != Long.MAX_VALUE) {
                s83.t("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((gy5) list.get(i3)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(gx5 gx5Var) {
        HashSet hashSet = new HashSet();
        gx5Var.getClass();
        return hashSet;
    }

    public final uu2 a() {
        if (this.g) {
            fr2.e().i(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            ux5 ux5Var = this.a;
            this.h = il2.P(ux5Var.b.g, "EnqueueRunnable_" + this.c.name(), (vj4) ((mc3) ux5Var.d).a, new iy3(this, (byte) 21));
        }
        return this.h;
    }
}
