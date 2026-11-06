package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        j jVar = this.b;
        if (jVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = jVar.b;
        Object obj2 = jVar.c;
        this.j = jVar;
        a();
        return new i(obj, obj2, this.i);
    }
}
