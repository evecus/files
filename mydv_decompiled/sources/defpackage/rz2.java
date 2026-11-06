package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rz2 extends q13 {
    public static final rz2 a = new rz2();

    @Override // defpackage.q13
    public final k13 create() {
        return new tz2();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "minimumInteractiveComponentSize";
        z12Var.c.b("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
    }
}
