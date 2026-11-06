package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xa1 extends ip3 {
    public final xj4 l;
    public final u05 m;

    public xa1(String str, int i) {
        super(str, null, i);
        this.l = xj4.d;
        this.m = new u05(new wa1(i, str, this));
    }

    @Override // defpackage.ip3, kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return this.l;
    }

    @Override // defpackage.ip3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.e() == xj4.d && this.a.equals(serialDescriptor.a()) && j42.c(qb.v(this), qb.v(serialDescriptor));
    }

    @Override // defpackage.ip3
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        n41 n41Var = new n41(this);
        int i = 1;
        while (n41Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) n41Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.ip3, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    @Override // defpackage.ip3
    public final String toString() {
        return o70.Z0(new sj4(this, (byte) 1), ", ", this.a.concat("("), ")", 0, null, 56);
    }
}
