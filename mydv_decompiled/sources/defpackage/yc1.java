package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yc1 implements Comparator {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ yc1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.I;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                tf2 tf2Var = (tf2) obj3;
                return ((Comparable) tf2Var.invoke(obj)).compareTo((Comparable) tf2Var.invoke(obj2));
            case 1:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                wa2 wa2Var = ((si4) obj).c;
                wa2 wa2Var2 = ((si4) obj2).c;
                return wa2Var.y() == wa2Var2.y() ? j42.m(wa2Var.w(), wa2Var2.w()) : Float.compare(wa2Var.y(), wa2Var2.y());
            default:
                int compare2 = ((yc1) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((si4) obj).f).compareTo(Integer.valueOf(((si4) obj2).f));
        }
    }
}
