package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class r92 implements rn1, Serializable {
    public final byte I;

    /* JADX WARN: Multi-variable type inference failed */
    public r92(int i) {
        this.I = i;
    }

    @Override // defpackage.rn1
    public final int getArity() {
        return this.I;
    }

    public final String toString() {
        s24.a.getClass();
        return t24.a(this);
    }
}
