package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface le0 {
    Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void a(SerialDescriptor serialDescriptor);

    o63 b();

    Decoder d(gt3 gt3Var, int i);

    long h(SerialDescriptor serialDescriptor, int i);

    char i(gt3 gt3Var, int i);

    float j(gt3 gt3Var, int i);

    byte l(gt3 gt3Var, int i);

    short n(gt3 gt3Var, int i);

    int o(SerialDescriptor serialDescriptor, int i);

    boolean r(SerialDescriptor serialDescriptor, int i);

    String t(SerialDescriptor serialDescriptor, int i);

    int v(SerialDescriptor serialDescriptor);

    Object x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    double z(SerialDescriptor serialDescriptor, int i);
}
