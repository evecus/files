package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class w3 extends AbstractCollection implements Collection, x72 {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }
}
