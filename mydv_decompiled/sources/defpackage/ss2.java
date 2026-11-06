package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ss2 {
    public final byte a;
    public final l02 b;
    public final jp c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public ss2(int i) {
        this.a = i;
        if (i <= 0) {
            dq2.H0("maxSize <= 0");
            throw null;
        }
        this.b = new l02((byte) 1);
        this.c = new jp((byte) 25);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            put = this.b.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        d(this.a);
        return put;
    }

    public final Object c(Object obj) {
        Object remove;
        synchronized (this.c) {
            remove = this.b.a.remove(obj);
            if (remove != null) {
                this.d--;
            }
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        defpackage.dq2.I0("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r5) {
        /*
            r4 = this;
        L0:
            jp r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 < 0) goto L7c
            l02 r1 = r4.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r4.d     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L7c
            goto L19
        L17:
            r4 = move-exception
            goto L82
        L19:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L17
            if (r1 <= r5) goto L7a
            l02 r1 = r4.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L28
            goto L7a
        L28:
            l02 r1 = r4.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L48
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L42
            goto L57
        L42:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L17
            goto L57
        L48:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L53
            goto L57
        L53:
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L17
        L57:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L5d
            monitor-exit(r0)
            return
        L5d:
            java.lang.Object r1 = r2.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L17
            l02 r3 = r4.b     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L17
            r3.remove(r1)     // Catch: java.lang.Throwable -> L17
            int r1 = r4.d     // Catch: java.lang.Throwable -> L17
            r2.getClass()     // Catch: java.lang.Throwable -> L17
            int r1 = r1 + (-1)
            r4.d = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            goto L0
        L7a:
            monitor-exit(r0)
            return
        L7c:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.dq2.I0(r4)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L82:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss2.d(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
