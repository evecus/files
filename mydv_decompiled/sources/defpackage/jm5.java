package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jm5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ jm5(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                return ((m45) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof vy5) {
                    ((ol2) obj3).stop(((vy5) th).I);
                }
                ((fl2) obj2).cancel(false);
                return wd5.a;
        }
    }
}
