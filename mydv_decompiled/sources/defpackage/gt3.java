package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gt3 extends tk2 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt3(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.b = serialDescriptor.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.b;
    }
}
