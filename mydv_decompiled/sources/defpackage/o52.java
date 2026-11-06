package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o52 implements Iterator {
    public static final o52 I;
    public static final /* synthetic */ o52[] J;

    static {
        o52 o52Var = new o52("INSTANCE", 0);
        I = o52Var;
        J = new o52[]{o52Var};
    }

    public static o52 valueOf(String str) {
        return (o52) Enum.valueOf(o52.class, str);
    }

    public static o52[] values() {
        return (o52[]) J.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        sp0.A(false, "no calls to next() since the last call to remove()");
    }
}
