package coil3.disk;

import defpackage.al1;
import defpackage.eq4;
import defpackage.ke1;
import defpackage.ok3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DiskLruCache$fileSystem$1 extends al1 {
    public DiskLruCache$fileSystem$1(ke1 ke1Var) {
        super(ke1Var);
    }

    @Override // defpackage.al1, defpackage.ke1
    public eq4 sink(ok3 ok3Var, boolean z) {
        ok3 c = ok3Var.c();
        if (c != null) {
            createDirectories(c);
        }
        return super.sink(ok3Var, z);
    }
}
