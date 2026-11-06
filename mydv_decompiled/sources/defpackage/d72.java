package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d72 implements KSerializer {
    public static final d72 a = new d72();
    public static final uj4 b = li4.b("kotlinx.serialization.json.JsonNull", xj4.d, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        e41.p(decoder);
        if (decoder.u()) {
            throw new q62(mu0.s(-1, "Expected 'null' literal", null, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        e41.q(encoder);
        encoder.d();
    }
}
