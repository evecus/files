package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k62 implements KSerializer {
    public static final k62 a = new k62();
    public static final j62 b = j62.b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        e41.p(decoder);
        return new a((List) new sp(u62.a).e(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        e41.q(encoder);
        u62 u62Var = u62.a;
        SerialDescriptor descriptor = u62Var.getDescriptor();
        descriptor.getClass();
        qp qpVar = new qp(descriptor);
        int size = aVar.size();
        me0 s = ((ax4) encoder).s(qpVar);
        Iterator<b> it = aVar.iterator();
        for (int i = 0; i < size; i++) {
            ((ax4) s).C(qpVar, i, u62Var, it.next());
        }
        s.a(qpVar);
    }
}
