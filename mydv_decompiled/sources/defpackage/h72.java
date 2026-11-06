package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h72 extends u2 {
    public final b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h72(i62 i62Var, b bVar, String str) {
        super(i62Var, str);
        bVar.getClass();
        this.f = bVar;
        this.a.add("primitive");
    }

    @Override // defpackage.u2
    public final b F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        s83.t("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.u2
    public final b T() {
        return this.f;
    }

    @Override // defpackage.le0
    public final int v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }

    public /* synthetic */ h72(i62 i62Var, d dVar) {
        this(i62Var, dVar, null);
    }
}
