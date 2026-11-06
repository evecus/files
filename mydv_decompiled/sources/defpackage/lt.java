package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lt extends qr5 {
    public final String b;
    public at5 c;

    public lt(n94 n94Var) {
        String str = (String) n94Var.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            n94Var.c(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = str;
    }

    @Override // defpackage.qr5
    public final void o() {
        at5 at5Var = this.c;
        if (at5Var == null) {
            j42.g0("saveableStateHolderRef");
            throw null;
        }
        g94 g94Var = (g94) at5Var.a.get();
        if (g94Var != null) {
            g94Var.f(this.b);
        }
        at5 at5Var2 = this.c;
        if (at5Var2 != null) {
            at5Var2.a.clear();
        } else {
            j42.g0("saveableStateHolderRef");
            throw null;
        }
    }
}
