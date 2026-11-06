package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m02 extends ip3 {
    public final boolean l;

    public m02(String str, n02 n02Var) {
        super(str, n02Var, 1);
        this.l = true;
    }

    @Override // defpackage.ip3
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m02) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a())) {
                m02 m02Var = (m02) obj;
                if (m02Var.l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) m02Var.j.getValue())) {
                    int f = serialDescriptor.f();
                    int i2 = this.c;
                    if (i2 == f) {
                        for (0; i < i2; i + 1) {
                            i = (j42.c(i(i).a(), serialDescriptor.i(i).a()) && j42.c(i(i).e(), serialDescriptor.i(i).e())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ip3
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.ip3, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.l;
    }
}
