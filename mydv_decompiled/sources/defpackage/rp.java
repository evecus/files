package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rp extends a3 {
    public final transient byte O;

    public rp() {
        super(jb0.b(12));
        j42.l(3, "expectedValuesPerKey");
        this.O = (byte) 3;
    }

    @Override // defpackage.a3
    public final Collection j() {
        return new ArrayList(this.O);
    }
}
