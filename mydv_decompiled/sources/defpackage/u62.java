package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u62 implements KSerializer {
    public static final u62 a = new u62();
    public static final uj4 b;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        c22 c22Var = new c22((byte) 3);
        uj4 uj4Var = null;
        if (jx4.L("kotlinx.serialization.json.JsonElement")) {
            s83.t("Blank serial names are prohibited");
        } else {
            sx4 sx4Var = sx4.d;
            dq3 dq3Var = dq3.d;
            if (dq3Var.equals(sx4Var)) {
                s83.t("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            } else {
                l60 l60Var = new l60("kotlinx.serialization.json.JsonElement");
                c22Var.invoke(l60Var);
                uj4Var = new uj4("kotlinx.serialization.json.JsonElement", dq3Var, l60Var.b.size(), dq.o1(serialDescriptorArr), l60Var);
            }
        }
        b = uj4Var;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e41.p(decoder).k();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b bVar = (b) obj;
        bVar.getClass();
        e41.q(encoder);
        if (bVar instanceof d) {
            encoder.o(i72.a, bVar);
            return;
        }
        if (bVar instanceof c) {
            encoder.o(f72.a, bVar);
        } else if (bVar instanceof a) {
            encoder.o(k62.a, bVar);
        } else {
            s83.v();
        }
    }
}
