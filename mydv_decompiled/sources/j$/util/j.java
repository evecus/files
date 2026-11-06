package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class j extends h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new h(this.c);
    }

    @Override // j$.util.h, java.util.List
    public final java.util.List subList(int i, int i2) {
        j jVar;
        synchronized (this.b) {
            jVar = new j(this.c.subList(i, i2), this.b);
        }
        return jVar;
    }
}
