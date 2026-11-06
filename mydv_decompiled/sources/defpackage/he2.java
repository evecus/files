package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class he2 implements Comparator {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tl J;

    public /* synthetic */ he2(tl tlVar, byte b) {
        this.I = b;
        this.J = tlVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.I;
        tl tlVar = this.J;
        switch (b) {
        }
        return Integer.valueOf(tlVar.d(((qe2) obj2).getKey())).compareTo(Integer.valueOf(tlVar.d(((qe2) obj).getKey())));
    }
}
