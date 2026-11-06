package j$.util.concurrent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class f extends j {
    public final j[] e;

    public f(j[] jVarArr) {
        super(-1, null, null);
        this.e = jVarArr;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i, Object obj) {
        j k;
        Object obj2;
        j[] jVarArr = this.e;
        loop0: while (true) {
            int length = jVarArr.length;
            if (length == 0 || (k = ConcurrentHashMap.k(jVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = k.a;
                if (i2 != i || ((obj2 = k.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i2 >= 0) {
                        k = k.d;
                    } else {
                        if (!(k instanceof f)) {
                            return k.a(i, obj);
                        }
                        jVarArr = ((f) k).e;
                    }
                }
            } while (k != null);
            return null;
        }
        return k;
    }
}
