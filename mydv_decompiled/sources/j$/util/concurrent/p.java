package j$.util.concurrent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class p extends j {
    public p e;
    public p f;
    public p g;
    public p h;
    public boolean i;

    public p(int i, Object obj, Object obj2, j jVar, p pVar) {
        super(i, obj, obj2, jVar);
        this.e = pVar;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i, Object obj) {
        return b(i, obj, null);
    }

    public final p b(int i, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        do {
            p pVar = this.f;
            p pVar2 = this.g;
            int i2 = this.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = this.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return this;
                    }
                    if (pVar != null) {
                        if (pVar2 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i3 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        pVar = pVar2;
                                    }
                                }
                            }
                            p b = pVar2.b(i, obj, cls);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
                this = pVar2;
            }
            this = pVar;
        } while (this != null);
        return null;
    }
}
