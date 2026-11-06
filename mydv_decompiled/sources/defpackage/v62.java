package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v62 implements SerialDescriptor {
    public final u05 a;

    public v62(rm1 rm1Var) {
        this.a = new u05(rm1Var);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return b().d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return b().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return b().f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return b().g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return b().h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return b().i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return b().j(i);
    }
}
