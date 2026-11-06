package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class tk2 implements SerialDescriptor {
    public final SerialDescriptor a;

    public tk2(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
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
        s83.t(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return sx4.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk2)) {
            return false;
        }
        tk2 tk2Var = (tk2) obj;
        return j42.c(this.a, tk2Var.a) && j42.c(a(), tk2Var.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 1;
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
        zl1.j(hf1.C("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        if (i >= 0) {
            return this.a;
        }
        zl1.j(hf1.C("Illegal index ", i, ", "), a(), " expects only non-negative indices");
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
        zl1.j(hf1.C("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
