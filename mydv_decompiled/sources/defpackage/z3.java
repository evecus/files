package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Collection J;

    public /* synthetic */ z3(Collection collection, byte b) {
        this.I = b;
        this.J = collection;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean contains;
        byte b = this.I;
        Collection<?> collection = this.J;
        switch (b) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
