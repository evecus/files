package kotlinx.serialization.encoding;

import defpackage.le0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Decoder {
    byte B();

    short C();

    float D();

    double E();

    le0 c(SerialDescriptor serialDescriptor);

    boolean e();

    char f();

    int g(SerialDescriptor serialDescriptor);

    int m();

    String p();

    long q();

    Object s(KSerializer kSerializer);

    boolean u();

    Decoder y(SerialDescriptor serialDescriptor);
}
