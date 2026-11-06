package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k72 extends u2 {
    public final a f;
    public final int g;
    public int h;

    public k72(i62 i62Var, a aVar) {
        super(i62Var, null);
        this.f = aVar;
        this.g = aVar.I.size();
        this.h = -1;
    }

    @Override // defpackage.u2
    public final b F(String str) {
        str.getClass();
        return (b) this.f.I.get(Integer.parseInt(str));
    }

    @Override // defpackage.u2
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.u2
    public final b T() {
        return this.f;
    }

    @Override // defpackage.le0
    public final int v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
