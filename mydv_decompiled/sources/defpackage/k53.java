package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k53 {
    public final AtomicReference a = new AtomicReference(null);
    public final o53 b = new o53();

    public final void a(g53 g53Var) {
        AtomicReference atomicReference;
        g53 g53Var2;
        do {
            atomicReference = this.a;
            g53Var2 = (g53) atomicReference.get();
            if (g53Var2 != null && !g53Var.a(g53Var2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i82.Z(atomicReference, g53Var2, g53Var));
        if (g53Var2 != null) {
            g53Var2.b();
        }
    }
}
