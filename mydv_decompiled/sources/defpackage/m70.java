package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class m70 extends x1 {
    public final KSerializer a;

    public m70(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.x1
    public void f(le0 le0Var, int i, Object obj) {
        i(i, obj, le0Var.A(getDescriptor(), i, this.a, null));
    }

    public void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        me0 s = ((ax4) encoder).s(descriptor);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            ((ax4) s).C(getDescriptor(), i, this.a, c.next());
        }
        s.a(descriptor);
    }
}
