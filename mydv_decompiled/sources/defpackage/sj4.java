package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sj4 implements Iterable, w72 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ sj4(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return new fu0((gu0) obj);
            default:
                return new n41((xa1) obj);
        }
    }
}
