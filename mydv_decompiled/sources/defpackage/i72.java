package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i72 implements KSerializer {
    public static final i72 a = new i72();
    public static final uj4 b = li4.b("kotlinx.serialization.json.JsonPrimitive", it3.l, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        o62 p = e41.p(decoder);
        b k = p.k();
        if (k instanceof d) {
            return (d) k;
        }
        throw new q62(mu0.s(-1, "Unexpected JSON element, expected JsonPrimitive, had " + s24.a(k.getClass()), null, null, p.w().a.j ? mu0.N(k.toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        e41.q(encoder);
        if (dVar instanceof JsonNull) {
            encoder.o(d72.a, JsonNull.INSTANCE);
        } else {
            encoder.o(b72.a, (a72) dVar);
        }
    }
}
