package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lt3 implements SerialDescriptor {
    public final String a;
    public final it3 b;

    public lt3(String str, it3 it3Var) {
        it3Var.getClass();
        this.a = str;
        this.b = it3Var;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(hf1.z(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt3)) {
            return false;
        }
        lt3 lt3Var = (lt3) obj;
        return this.a.equals(lt3Var.a) && j42.c(this.b, lt3Var.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
