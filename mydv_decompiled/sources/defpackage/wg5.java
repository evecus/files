package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wg5 implements KSerializer {
    public static final wg5 a = new wg5();
    public static final lt3 b = new lt3("kotlin.uuid.Uuid", it3.l);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String p = decoder.p();
        p.getClass();
        int length = p.length();
        if (length == 32) {
            return kb4.k0(p);
        }
        if (length == 36) {
            return kb4.l0(p);
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + kb4.f(p) + "\" of length " + p.length());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vg5 vg5Var = (vg5) obj;
        vg5Var.getClass();
        encoder.r(vg5Var.toString());
    }
}
