package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sp extends m70 {
    public final qp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.b = new qp(descriptor);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
}
