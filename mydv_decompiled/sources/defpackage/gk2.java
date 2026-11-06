package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gk2 implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;
    public final SerialDescriptor c;

    public gk2(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = str;
        this.b = serialDescriptor;
        this.c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer A = qx4.A(str);
        if (A != null) {
            return A.intValue();
        }
        s83.t(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return sx4.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk2)) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return this.a.equals(gk2Var.a) && this.b.equals(gk2Var.b) && this.c.equals(gk2Var.c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        if (i >= 0) {
            return o91.I;
        }
        s83.h(hf1.z(hf1.C("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        if (i < 0) {
            s83.h(hf1.z(hf1.C("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        zy.i("Unreached");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        s83.h(hf1.z(hf1.C("Illegal index ", i, ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
