package okhttp3.internal;

import defpackage.t72;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EmptyTags extends Tags {
    public static final EmptyTags INSTANCE = new EmptyTags();

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(t72 t72Var) {
        t72Var.getClass();
        return null;
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(t72 t72Var, T t) {
        t72Var.getClass();
        return t != null ? new LinkedTags(t72Var, t, this) : this;
    }

    public String toString() {
        return "{}";
    }
}
