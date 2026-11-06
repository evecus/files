package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pl1 implements n7 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tl1 J;

    public /* synthetic */ pl1(tl1 tl1Var, byte b) {
        this.I = b;
        this.J = tl1Var;
    }

    @Override // defpackage.n7
    public final void a(Object obj) {
        byte b = this.I;
        tl1 tl1Var = this.J;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                sl1 sl1Var = (sl1) tl1Var.x.pollFirst();
                if (sl1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = sl1Var.I;
                    tl1Var.c.m();
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    break;
                }
            case 1:
                sl1 sl1Var2 = (sl1) tl1Var.x.pollFirst();
                if (sl1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = sl1Var2.I;
                    tl1Var.c.m();
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    break;
                }
            default:
                sl1 sl1Var3 = (sl1) tl1Var.x.pollFirst();
                if (sl1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = sl1Var3.I;
                    tl1Var.c.m();
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    break;
                }
        }
    }
}
