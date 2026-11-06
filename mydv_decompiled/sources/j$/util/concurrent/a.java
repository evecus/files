package j$.util.concurrent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class a extends n {
    public final ConcurrentHashMap i;
    public j j;

    public a(j[] jVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(jVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        j jVar = this.j;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(jVar.b, null, null);
    }
}
