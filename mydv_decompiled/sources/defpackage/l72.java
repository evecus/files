package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l72 extends j72 {
    public final c j;
    public final List k;
    public final int l;
    public int m;

    public l72(i62 i62Var, c cVar) {
        super(i62Var, cVar, (String) null, 12);
        this.j = cVar;
        List r1 = o70.r1(cVar.I.keySet());
        this.k = r1;
        this.l = r1.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.j72, defpackage.u2
    public final b F(String str) {
        str.getClass();
        if (this.m % 2 != 0) {
            return (b) sv2.E(str, this.j);
        }
        m02 m02Var = r62.a;
        return new a72(str, true);
    }

    @Override // defpackage.j72, defpackage.u2
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.j72, defpackage.u2
    public final b T() {
        return this.j;
    }

    @Override // defpackage.j72
    /* renamed from: Y */
    public final c T() {
        return this.j;
    }

    @Override // defpackage.j72, defpackage.u2, defpackage.le0
    public final void a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.j72, defpackage.le0
    public final int v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
