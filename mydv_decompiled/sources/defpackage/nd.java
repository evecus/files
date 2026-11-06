package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nd implements mn3 {
    public LocaleList I;
    public tq2 J;
    public final o63 K = new o63((byte) 20);

    @Override // defpackage.mn3
    public final tq2 g() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.K) {
            tq2 tq2Var = this.J;
            if (tq2Var != null && localeList == this.I) {
                return tq2Var;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new sq2(localeList.get(i)));
            }
            tq2 tq2Var2 = new tq2(arrayList);
            this.I = localeList;
            this.J = tq2Var2;
            return tq2Var2;
        }
    }
}
