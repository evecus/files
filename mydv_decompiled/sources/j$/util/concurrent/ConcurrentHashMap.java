package j$.util.concurrent;

import androidx.media3.common.util.Log;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import j$.util.stream.v3;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import okhttp3.internal.http2.Settings;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, s {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    public volatile transient j[] a;
    public volatile transient j[] b;
    private volatile transient long baseCount;
    public volatile transient b[] c;
    private volatile transient int cellsBusy;
    public transient KeySetView d;
    public transient q e;
    public transient d f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", l[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.a(ConcurrentHashMap.class, "transferIndex");
        k = aVar.a(ConcurrentHashMap.class, "baseCount");
        l = aVar.a(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.a(b.class, "value");
        n = aVar.a.arrayBaseOffset(j[].class);
        int arrayIndexScale = aVar.a.arrayIndexScale(j[].class);
        if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
    }

    public ConcurrentHashMap(int i2, int i3) {
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / 0.75f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public static final boolean b(j[] jVarArr, int i2, j jVar) {
        j$.sun.misc.a aVar = h;
        long j2 = (i2 << o) + n;
        Unsafe unsafe = aVar.a;
        while (true) {
            j[] jVarArr2 = jVarArr;
            j jVar2 = jVar;
            if (unsafe.compareAndSwapObject(jVarArr2, j2, (Object) null, jVar2)) {
                return true;
            }
            if (unsafe.getObject(jVarArr2, j2) != null) {
                return false;
            }
            jVarArr = jVarArr2;
            jVar = jVar2;
        }
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final void h(j[] jVarArr, int i2, j jVar) {
        h.a.putObjectVolatile(jVarArr, (i2 << o) + n, jVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Log.LOG_LEVEL_OFF;
    }

    public static final j k(j[] jVarArr, int i2) {
        return (j) h.a.getObjectVolatile(jVarArr, (i2 << o) + n);
    }

    public static final int l(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return numberOfLeadingZeros + 1;
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.j] */
    public static j p(p pVar) {
        j jVar = null;
        j jVar2 = null;
        for (p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.d) {
            j jVar3 = new j(pVar2.a, pVar2.b, pVar2.c);
            if (jVar2 == null) {
                jVar = jVar3;
            } else {
                jVar2.d = jVar3;
            }
            jVar2 = jVar3;
        }
        return jVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        long j3;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        j jVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j5++;
            jVar = new j(i(readObject.hashCode()), readObject, readObject2, jVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) ((j5 / 0.75f) + 1.0d);
        int l2 = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        j[] jVarArr = new j[l2];
        int i2 = l2 - 1;
        while (jVar != null) {
            j jVar2 = jVar.d;
            int i3 = jVar.a;
            int i4 = i3 & i2;
            j k2 = k(jVarArr, i4);
            boolean z = true;
            if (k2 == null) {
                j3 = j2;
            } else {
                Object obj2 = jVar.b;
                if (k2.a < 0) {
                    if (((o) k2).e(i3, obj2, jVar.c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (j jVar3 = k2; jVar3 != null; jVar3 = jVar3.d) {
                        if (jVar3.a == i3 && ((obj = jVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        jVar.d = k2;
                        j jVar4 = jVar;
                        p pVar = null;
                        p pVar2 = null;
                        while (jVar4 != null) {
                            p pVar3 = new p(jVar4.a, jVar4.b, jVar4.c, null, null);
                            pVar3.h = pVar2;
                            if (pVar2 == null) {
                                pVar = pVar3;
                            } else {
                                pVar2.d = pVar3;
                            }
                            jVar4 = jVar4.d;
                            pVar2 = pVar3;
                        }
                        h(jVarArr, i4, new o(pVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                jVar.d = k2;
                h(jVarArr, i4, jVar);
            }
            jVar = jVar2;
            j2 = j3;
        }
        this.a = jVarArr;
        this.sizeCtl = l2 - (l2 >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        l[] lVarArr = new l[16];
        for (int i6 = 0; i6 < 16; i6++) {
            lVarArr[i6] = new l();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", lVarArr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        j[] jVarArr = this.a;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    break;
                }
                objectOutputStream.writeObject(a.b);
                objectOutputStream.writeObject(a.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x014f, code lost:
    
        if (r1.c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0151, code lost:
    
        r1.c = (j$.util.concurrent.b[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.a.compareAndSwapLong(r1, r2, r4, r6) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j k2;
        j[] jVarArr = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (jVarArr != null && i2 < jVarArr.length) {
                k2 = k(jVarArr, i2);
                if (k2 == null) {
                    i2++;
                } else {
                    int i3 = k2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        try {
                            if (k(jVarArr, i2) == k2) {
                                for (j jVar = i3 >= 0 ? k2 : k2 instanceof o ? ((o) k2).f : null; jVar != null; jVar = jVar.d) {
                                    j2--;
                                }
                                h(jVarArr, i2, null);
                                i2++;
                            }
                        } finally {
                        }
                    }
                }
            }
            jVarArr = d(jVarArr, k2);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0110, code lost:
    
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0114, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (r5 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.j[] r2 = r13.a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.j r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.j[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.j r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r13 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.j r3 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.j r10 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.o     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.o r4 = (j$.util.concurrent.o) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.p r8 = r4.e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.p r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.p r3 = r4.f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.j r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.k     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L4b
            throw r13     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r13
        Lb7:
            j$.util.concurrent.j[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        j[] jVarArr = this.a;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    break;
                }
                Object obj2 = a.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final j[] d(j[] jVarArr, j jVar) {
        int i2;
        if (!(jVar instanceof f)) {
            return this.a;
        }
        j[] jVarArr2 = ((f) jVar).e;
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(jVarArr.length) | 32768;
        while (jVarArr2 == this.b && this.a == jVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == numberOfLeadingZeros && i2 != numberOfLeadingZeros + 1 && i2 != Settings.DEFAULT_INITIAL_WINDOW_SIZE + numberOfLeadingZeros && this.transferIndex > 0) {
            ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, i2 + 1)) {
                concurrentHashMap.m(jVarArr, jVarArr2);
                return jVarArr2;
            }
            this = concurrentHashMap;
        }
        return jVarArr2;
    }

    public final j[] e() {
        while (true) {
            j[] jVarArr = this.a;
            if (jVarArr != null && jVarArr.length != 0) {
                return jVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, -1)) {
                    try {
                        j[] jVarArr2 = concurrentHashMap.a;
                        if (jVarArr2 != null) {
                            if (jVarArr2.length == 0) {
                            }
                            concurrentHashMap.sizeCtl = i2;
                            return jVarArr2;
                        }
                        int i3 = i2 > 0 ? i2 : 16;
                        j[] jVarArr3 = new j[i3];
                        concurrentHashMap.a = jVarArr3;
                        i2 = i3 - (i3 >>> 2);
                        jVarArr2 = jVarArr3;
                        concurrentHashMap.sizeCtl = i2;
                        return jVarArr2;
                    } catch (Throwable th) {
                        concurrentHashMap.sizeCtl = i2;
                        throw th;
                    }
                }
                this = concurrentHashMap;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        j[] jVarArr = this.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        n nVar = new n(jVarArr, length, 0, length);
        while (true) {
            j a = nVar.a();
            if (a == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = a.c;
            Object obj3 = map.get(a.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        j[] jVarArr = this.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j a = nVar.a();
            if (a == null) {
                return;
            } else {
                biConsumer.accept(a.b, a.c);
            }
        }
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        j k2;
        boolean z;
        Object obj4;
        p b;
        Object obj5;
        int i3 = i(obj.hashCode());
        j[] jVarArr = this.a;
        while (true) {
            if (jVarArr == null || (length = jVarArr.length) == 0 || (k2 = k(jVarArr, (i2 = (length - 1) & i3))) == null) {
                break;
            }
            int i4 = k2.a;
            if (i4 == -1) {
                jVarArr = d(jVarArr, k2);
            } else {
                synchronized (k2) {
                    try {
                        if (k(jVarArr, i2) == k2) {
                            z = true;
                            if (i4 >= 0) {
                                j jVar = null;
                                j jVar2 = k2;
                                while (true) {
                                    if (jVar2.a == i3 && ((obj5 = jVar2.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    j jVar3 = jVar2.d;
                                    if (jVar3 == null) {
                                        break;
                                    }
                                    jVar = jVar2;
                                    jVar2 = jVar3;
                                }
                                obj4 = jVar2.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        jVar2.c = obj2;
                                    } else {
                                        j jVar4 = jVar2.d;
                                        if (jVar != null) {
                                            jVar.d = jVar4;
                                        } else {
                                            h(jVarArr, i2, jVar4);
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k2 instanceof o) {
                                o oVar = (o) k2;
                                p pVar = oVar.e;
                                if (pVar != null && (b = pVar.b(i3, obj, null)) != null) {
                                    obj4 = b.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b.c = obj2;
                                        } else if (oVar.f(b)) {
                                            h(jVarArr, i2, p(oVar.f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k2 instanceof k) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return (V) r2.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.j[] r2 = r2.a
            if (r2 == 0) goto L4d
            int r1 = r2.length
            if (r1 <= 0) goto L4d
            int r1 = r1 + (-1)
            r1 = r1 & r0
            j$.util.concurrent.j r2 = k(r2, r1)
            if (r2 == 0) goto L4d
            int r1 = r2.a
            if (r1 != r0) goto L2b
            java.lang.Object r1 = r2.b
            if (r1 == r3) goto L28
            if (r1 == 0) goto L36
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L36
        L28:
            java.lang.Object r2 = r2.c
            return r2
        L2b:
            if (r1 >= 0) goto L36
            j$.util.concurrent.j r2 = r2.a(r0, r3)
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r2.c
            return r2
        L36:
            j$.util.concurrent.j r2 = r2.d
            if (r2 == 0) goto L4d
            int r1 = r2.a
            if (r1 != r0) goto L36
            java.lang.Object r1 = r2.b
            if (r1 == r3) goto L4a
            if (r1 == 0) goto L36
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L36
        L4a:
            java.lang.Object r2 = r2.c
            return r2
        L4d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        j[] jVarArr = this.a;
        int i2 = 0;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    break;
                }
                i2 += a.c.hashCode() ^ a.b.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
        b[] bVarArr = this.c;
        long j2 = this.baseCount;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    j2 += bVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySetView keySetView = this.d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.d = keySetView2;
        return keySetView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r8v10, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r8v15, types: [j$.util.concurrent.j] */
    public final void m(j[] jVarArr, j[] jVarArr2) {
        j[] jVarArr3;
        int i2;
        boolean z;
        char c;
        int i3;
        int i4;
        p pVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = jVarArr.length;
        int i6 = g;
        boolean z2 = true;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        char c2 = 16;
        int i8 = i7 < 16 ? 16 : i7;
        if (jVarArr2 == null) {
            try {
                j[] jVarArr4 = new j[length << 1];
                concurrentHashMap.b = jVarArr4;
                concurrentHashMap.transferIndex = length;
                jVarArr3 = jVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Log.LOG_LEVEL_OFF;
                return;
            }
        } else {
            jVarArr3 = jVarArr2;
        }
        int length2 = jVarArr3.length;
        f fVar = new f(jVarArr3);
        boolean z3 = true;
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            if (z3) {
                int i11 = i9 - 1;
                if (i11 >= i10 || z4) {
                    i10 = i10;
                    i9 = i11;
                } else {
                    int i12 = concurrentHashMap.transferIndex;
                    if (i12 <= 0) {
                        i9 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i10;
                        if (aVar.a.compareAndSwapInt(concurrentHashMap, j2, i12, i13)) {
                            i9 = i12 - 1;
                            i10 = i13;
                        } else {
                            i10 = i14;
                            i9 = i11;
                        }
                    }
                }
                z3 = false;
            } else {
                int i15 = i10;
                p pVar2 = null;
                if (i9 < 0 || i9 >= length || (i4 = i9 + length) >= length2) {
                    i2 = length;
                    z = z2;
                    c = c2;
                    i3 = i8;
                    if (z4) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = jVarArr3;
                        concurrentHashMap.sizeCtl = (i2 << 1) - (i2 >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i9;
                    if (!aVar2.a.compareAndSwapInt(concurrentHashMap, j3, i16, i16 - 1)) {
                        i9 = i17;
                    } else {
                        if (i16 - 2 != ((Integer.numberOfLeadingZeros(i2) | 32768) << 16)) {
                            return;
                        }
                        z3 = z;
                        z4 = z3;
                        i9 = i2;
                    }
                } else {
                    ?? k2 = k(jVarArr, i9);
                    if (k2 == 0) {
                        z3 = b(jVarArr, i9, fVar);
                        i2 = length;
                        z = z2;
                        c = c2;
                        i3 = i8;
                    } else {
                        z = z2;
                        int i18 = k2.a;
                        if (i18 == -1) {
                            i2 = length;
                            c = c2;
                            i3 = i8;
                            z3 = z;
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(jVarArr, i9) == k2) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            p pVar3 = k2;
                                            for (p pVar4 = k2.d; pVar4 != null; pVar4 = pVar4.d) {
                                                char c3 = c2;
                                                int i20 = pVar4.a & length;
                                                if (i20 != i19) {
                                                    pVar3 = pVar4;
                                                    i19 = i20;
                                                }
                                                c2 = c3;
                                            }
                                            c = c2;
                                            if (i19 == 0) {
                                                pVar = null;
                                                pVar2 = pVar3;
                                            } else {
                                                pVar = pVar3;
                                            }
                                            j jVar = k2;
                                            while (jVar != pVar3) {
                                                int i21 = jVar.a;
                                                Object obj = jVar.b;
                                                int i22 = length;
                                                Object obj2 = jVar.c;
                                                if ((i21 & i22) == 0) {
                                                    i5 = i8;
                                                    pVar2 = new j(i21, obj, obj2, pVar2);
                                                } else {
                                                    i5 = i8;
                                                    pVar = new j(i21, obj, obj2, pVar);
                                                }
                                                jVar = jVar.d;
                                                length = i22;
                                                i8 = i5;
                                            }
                                            i2 = length;
                                            i3 = i8;
                                            h(jVarArr3, i9, pVar2);
                                            h(jVarArr3, i4, pVar);
                                            h(jVarArr, i9, fVar);
                                        } else {
                                            i2 = length;
                                            c = c2;
                                            i3 = i8;
                                            if (k2 instanceof o) {
                                                o oVar = (o) k2;
                                                p pVar5 = null;
                                                p pVar6 = null;
                                                j jVar2 = oVar.f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                p pVar7 = null;
                                                while (jVar2 != null) {
                                                    o oVar2 = oVar;
                                                    int i25 = jVar2.a;
                                                    p pVar8 = new p(i25, jVar2.b, jVar2.c, null, null);
                                                    if ((i25 & i2) == 0) {
                                                        pVar8.h = pVar6;
                                                        if (pVar6 == null) {
                                                            pVar2 = pVar8;
                                                        } else {
                                                            pVar6.d = pVar8;
                                                        }
                                                        i23++;
                                                        pVar6 = pVar8;
                                                    } else {
                                                        pVar8.h = pVar5;
                                                        if (pVar5 == null) {
                                                            pVar7 = pVar8;
                                                        } else {
                                                            pVar5.d = pVar8;
                                                        }
                                                        i24++;
                                                        pVar5 = pVar8;
                                                    }
                                                    jVar2 = jVar2.d;
                                                    oVar = oVar2;
                                                }
                                                o oVar3 = oVar;
                                                j p = i23 <= 6 ? p(pVar2) : i24 != 0 ? new o(pVar2) : oVar3;
                                                j p2 = i24 <= 6 ? p(pVar7) : i23 != 0 ? new o(pVar7) : oVar3;
                                                h(jVarArr3, i9, p);
                                                h(jVarArr3, i4, p2);
                                                h(jVarArr, i9, fVar);
                                            }
                                        }
                                        z3 = z;
                                    } else {
                                        i2 = length;
                                        c = c2;
                                        i3 = i8;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i10 = i15;
                z2 = z;
                c2 = c;
                length = i2;
                i8 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public final void n(j[] jVarArr, int i2) {
        int length = jVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        j k2 = k(jVarArr, i2);
        if (k2 == null || k2.a < 0) {
            return;
        }
        synchronized (k2) {
            try {
                if (k(jVarArr, i2) == k2) {
                    p pVar = null;
                    j jVar = k2;
                    p pVar2 = null;
                    while (jVar != null) {
                        p pVar3 = new p(jVar.a, jVar.b, jVar.c, null, null);
                        pVar3.h = pVar2;
                        if (pVar2 == null) {
                            pVar = pVar3;
                        } else {
                            pVar2.d = pVar3;
                        }
                        jVar = jVar.d;
                        pVar2 = pVar3;
                    }
                    h(jVarArr, i2, new o(pVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i2) {
        ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int l2 = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            j[] jVarArr = this.a;
            if (jVarArr == null || (length = jVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > l2 ? i3 : l2;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, -1)) {
                    try {
                        if (concurrentHashMap.a == jVarArr) {
                            concurrentHashMap.a = new j[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        concurrentHashMap.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (l2 <= i3 || length >= 1073741824) {
                    return;
                }
                if (jVarArr == this.a) {
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    j$.sun.misc.a aVar = h;
                    long j2 = i;
                    int i5 = (numberOfLeadingZeros << 16) + 2;
                    Unsafe unsafe = aVar.a;
                    concurrentHashMap = this;
                    if (unsafe.compareAndSwapInt(concurrentHashMap, j2, i3, i5)) {
                        concurrentHashMap.m(jVarArr, null);
                    }
                } else {
                    concurrentHashMap = this;
                }
            }
            this = concurrentHashMap;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        j[] jVarArr = this.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j a = nVar.a();
            if (a == null) {
                return;
            }
            Object obj = a.c;
            Object obj2 = a.b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? Log.LOG_LEVEL_OFF : (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        j[] jVarArr = this.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        n nVar = new n(jVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        j a = nVar.a();
        if (a != null) {
            while (true) {
                Object obj = a.b;
                Object obj2 = a.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a = nVar.a();
                if (a == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        q qVar = this.e;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.e = qVar2;
        return qVar2;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class KeySetView<K, V> extends CollectionView<K, V, K> implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        public final Object b;

        public KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.b = obj;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            Object obj = this.b;
            if (obj != null) {
                return this.a.f(k, obj, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            Object obj = this.b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            j[] jVarArr = this.a.a;
            if (jVarArr == null) {
                return;
            }
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a = nVar.a();
                if (a == null) {
                    return;
                } else {
                    consumer.accept(a.b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int i = 0;
            while (((a) it).hasNext()) {
                i += ((g) it).next().hashCode();
            }
            return i;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            j[] jVarArr = concurrentHashMap.a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new g(jVarArr, length, length, concurrentHashMap, (byte) 0);
        }

        @Override // java.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            j$.util.stream.Stream Z;
            Z = v3.Z(j$.time.a.a0(this), true);
            return Stream.Wrapper.convert(Z);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long j = concurrentHashMap.j();
            j[] jVarArr = concurrentHashMap.a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new h(jVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 0);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            j$.util.stream.Stream Z;
            Z = v3.Z(j$.time.a.a0(this), false);
            return Stream.Wrapper.convert(Z);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream parallelStream() {
            j$.util.stream.Stream Z;
            Z = v3.Z(j$.time.a.a0(this), true);
            return Z;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream stream() {
            j$.util.stream.Stream Z;
            Z = v3.Z(j$.time.a.a0(this), false);
            return Z;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 1);
    }

    public ConcurrentHashMap() {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class CollectionView<K, V, E> implements java.util.Collection<E>, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        public final ConcurrentHashMap a;

        public CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.a = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.clear();
        }

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection
        public final boolean containsAll(java.util.Collection collection) {
            if (collection == this) {
                return true;
            }
            for (E e : collection) {
                if (e == null || !contains(e)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public abstract Iterator iterator();

        @Override // java.util.Collection
        public abstract boolean remove(Object obj);

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            collection.getClass();
            j[] jVarArr = this.a.a;
            boolean z = false;
            if (jVarArr == null) {
                return false;
            }
            if (!(collection instanceof Set) || collection.size() <= jVarArr.length) {
                Iterator<E> it = collection.iterator();
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
                return z;
            }
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection collection) {
            collection.getClass();
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.a.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long j = this.a.j();
            if (j < 0) {
                j = 0;
            }
            if (j > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i = (int) j;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArr2 = Arrays.copyOf(objArr2, i3);
                    length = i3;
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long j = this.a.j();
            if (j < 0) {
                j = 0;
            }
            if (j <= 2147483639) {
                int i = (int) j;
                Object[] objArr = new Object[i];
                Iterator it = iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i2 == i) {
                        if (i < 2147483639) {
                            int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                            objArr = Arrays.copyOf(objArr, i3);
                            i = i3;
                        } else {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                    }
                    objArr[i2] = next;
                    i2++;
                }
                return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
            }
            throw new OutOfMemoryError("Required array size too large");
        }
    }
}
