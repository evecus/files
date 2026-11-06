package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v70 implements oj4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            default:
                return (Iterator) this.b;
        }
    }
}
