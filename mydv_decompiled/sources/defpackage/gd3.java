package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gd3 implements KSerializer {
    public final uc2 a = ut0.K(dh2.I, new gw2(this, 10));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        le0 c = decoder.c(descriptor);
        int v = c.v(getDescriptor());
        if (v != -1) {
            throw new zj4(hf1.u(v, "Unexpected index "));
        }
        c.a(descriptor);
        return wd5.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        encoder.c(getDescriptor()).a(getDescriptor());
    }
}
