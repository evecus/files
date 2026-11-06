package kotlinx.serialization.encoding;

import defpackage.me0;
import defpackage.o63;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface Encoder {
    o63 b();

    me0 c(SerialDescriptor serialDescriptor);

    void d();

    void e(double d);

    void f(short s);

    void g(byte b);

    void h(boolean z);

    void i(float f);

    void j(char c);

    void l(SerialDescriptor serialDescriptor, int i);

    void m(int i);

    Encoder n(SerialDescriptor serialDescriptor);

    void o(KSerializer kSerializer, Object obj);

    void p(long j);

    void r(String str);
}
