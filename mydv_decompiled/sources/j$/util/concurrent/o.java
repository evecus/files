package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class o extends j {
    public static final j$.sun.misc.a h;
    public static final long i;
    public p e;
    public volatile p f;
    public volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(o.class, "lockState");
    }

    public o(p pVar) {
        super(-2, null, null);
        int i2;
        this.f = pVar;
        p pVar2 = null;
        while (pVar != null) {
            p pVar3 = (p) pVar.d;
            pVar.g = null;
            pVar.f = null;
            if (pVar2 == null) {
                pVar.e = null;
                pVar.i = false;
            } else {
                Object obj = pVar.b;
                int i3 = pVar.a;
                p pVar4 = pVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = pVar4.b;
                    int i4 = pVar4.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i5 = ConcurrentHashMap.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i2 = compareTo;
                            }
                        }
                        i2 = i(obj, obj2);
                    }
                    p pVar5 = i2 <= 0 ? pVar4.f : pVar4.g;
                    if (pVar5 == null) {
                        break;
                    } else {
                        pVar4 = pVar5;
                    }
                }
                pVar.e = pVar4;
                if (i2 <= 0) {
                    pVar4.f = pVar;
                } else {
                    pVar4.g = pVar;
                }
                pVar = c(pVar2, pVar);
            }
            pVar2 = pVar;
            pVar = pVar3;
        }
        this.e = pVar2;
    }

    public static p b(p pVar, p pVar2) {
        while (pVar2 != null && pVar2 != pVar) {
            p pVar3 = pVar2.e;
            if (pVar3 == null) {
                pVar2.i = false;
                return pVar2;
            }
            if (pVar2.i) {
                pVar2.i = false;
                return pVar;
            }
            p pVar4 = pVar3.f;
            if (pVar4 == pVar2) {
                p pVar5 = pVar3.g;
                if (pVar5 != null && pVar5.i) {
                    pVar5.i = false;
                    pVar3.i = true;
                    pVar = g(pVar, pVar3);
                    pVar3 = pVar2.e;
                    pVar5 = pVar3 == null ? null : pVar3.g;
                }
                if (pVar5 != null) {
                    p pVar6 = pVar5.f;
                    p pVar7 = pVar5.g;
                    if ((pVar7 == null || !pVar7.i) && (pVar6 == null || !pVar6.i)) {
                        pVar5.i = true;
                    } else {
                        if (pVar7 == null || !pVar7.i) {
                            if (pVar6 != null) {
                                pVar6.i = false;
                            }
                            pVar5.i = true;
                            pVar = h(pVar, pVar5);
                            pVar3 = pVar2.e;
                            pVar5 = pVar3 != null ? pVar3.g : null;
                        }
                        if (pVar5 != null) {
                            pVar5.i = pVar3 == null ? false : pVar3.i;
                            p pVar8 = pVar5.g;
                            if (pVar8 != null) {
                                pVar8.i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.i = false;
                            pVar = g(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            } else {
                if (pVar4 != null && pVar4.i) {
                    pVar4.i = false;
                    pVar3.i = true;
                    pVar = h(pVar, pVar3);
                    pVar3 = pVar2.e;
                    pVar4 = pVar3 == null ? null : pVar3.f;
                }
                if (pVar4 != null) {
                    p pVar9 = pVar4.f;
                    p pVar10 = pVar4.g;
                    if ((pVar9 == null || !pVar9.i) && (pVar10 == null || !pVar10.i)) {
                        pVar4.i = true;
                    } else {
                        if (pVar9 == null || !pVar9.i) {
                            if (pVar10 != null) {
                                pVar10.i = false;
                            }
                            pVar4.i = true;
                            pVar = g(pVar, pVar4);
                            pVar3 = pVar2.e;
                            pVar4 = pVar3 != null ? pVar3.f : null;
                        }
                        if (pVar4 != null) {
                            pVar4.i = pVar3 == null ? false : pVar3.i;
                            p pVar11 = pVar4.f;
                            if (pVar11 != null) {
                                pVar11.i = false;
                            }
                        }
                        if (pVar3 != null) {
                            pVar3.i = false;
                            pVar = h(pVar, pVar3);
                        }
                        pVar2 = pVar;
                    }
                }
                pVar2 = pVar3;
            }
        }
        return pVar;
    }

    public static p c(p pVar, p pVar2) {
        p pVar3;
        pVar2.i = true;
        while (true) {
            p pVar4 = pVar2.e;
            if (pVar4 == null) {
                pVar2.i = false;
                return pVar2;
            }
            if (!pVar4.i || (pVar3 = pVar4.e) == null) {
                break;
            }
            p pVar5 = pVar3.f;
            if (pVar4 == pVar5) {
                p pVar6 = pVar3.g;
                if (pVar6 == null || !pVar6.i) {
                    if (pVar2 == pVar4.g) {
                        pVar = g(pVar, pVar4);
                        p pVar7 = pVar4.e;
                        pVar3 = pVar7 == null ? null : pVar7.e;
                        pVar4 = pVar7;
                        pVar2 = pVar4;
                    }
                    if (pVar4 != null) {
                        pVar4.i = false;
                        if (pVar3 != null) {
                            pVar3.i = true;
                            pVar = h(pVar, pVar3);
                        }
                    }
                } else {
                    pVar6.i = false;
                    pVar4.i = false;
                    pVar3.i = true;
                    pVar2 = pVar3;
                }
            } else if (pVar5 == null || !pVar5.i) {
                if (pVar2 == pVar4.f) {
                    pVar = h(pVar, pVar4);
                    p pVar8 = pVar4.e;
                    pVar3 = pVar8 == null ? null : pVar8.e;
                    pVar4 = pVar8;
                    pVar2 = pVar4;
                }
                if (pVar4 != null) {
                    pVar4.i = false;
                    if (pVar3 != null) {
                        pVar3.i = true;
                        pVar = g(pVar, pVar3);
                    }
                }
            } else {
                pVar5.i = false;
                pVar4.i = false;
                pVar3.i = true;
                pVar2 = pVar3;
            }
        }
        return pVar;
    }

    public static p g(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.g) != null) {
            p pVar4 = pVar3.f;
            pVar2.g = pVar4;
            if (pVar4 != null) {
                pVar4.e = pVar2;
            }
            p pVar5 = pVar2.e;
            pVar3.e = pVar5;
            if (pVar5 == null) {
                pVar3.i = false;
                pVar = pVar3;
            } else if (pVar5.f == pVar2) {
                pVar5.f = pVar3;
            } else {
                pVar5.g = pVar3;
            }
            pVar3.f = pVar2;
            pVar2.e = pVar3;
        }
        return pVar;
    }

    public static p h(p pVar, p pVar2) {
        p pVar3;
        if (pVar2 != null && (pVar3 = pVar2.f) != null) {
            p pVar4 = pVar3.g;
            pVar2.f = pVar4;
            if (pVar4 != null) {
                pVar4.e = pVar2;
            }
            p pVar5 = pVar2.e;
            pVar3.e = pVar5;
            if (pVar5 == null) {
                pVar3.i = false;
                pVar = pVar3;
            } else if (pVar5.g == pVar2) {
                pVar5.g = pVar3;
            } else {
                pVar5.f = pVar3;
            }
            pVar3.g = pVar2;
            pVar2.e = pVar3;
        }
        return pVar;
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i2, Object obj) {
        j jVar;
        p pVar;
        int i3;
        Object obj2;
        j$.sun.misc.a aVar;
        long j;
        int intVolatile;
        Thread thread;
        j jVar2 = this.f;
        while (true) {
            jVar = jVar2;
            do {
                pVar = null;
                if (jVar == null) {
                    return null;
                }
                i3 = this.lockState;
                if ((i3 & 3) == 0) {
                    aVar = h;
                    j = i;
                } else if (jVar.a != i2 || ((obj2 = jVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    jVar2 = jVar.d;
                }
            } while (!aVar.a.compareAndSwapInt(this, j, i3, i3 + 4));
            try {
                p pVar2 = this.e;
                if (pVar2 != null) {
                    pVar = pVar2.b(i2, obj, null);
                }
                do {
                    intVolatile = aVar.a.getIntVolatile(this, j);
                } while (!aVar.a.compareAndSwapInt(this, j, intVolatile, intVolatile - 4));
                if (intVolatile == 6 && (thread = this.g) != null) {
                    LockSupport.unpark(thread);
                }
                return pVar;
            } finally {
            }
        }
        return jVar;
    }

    public final void d() {
        j$.sun.misc.a aVar = h;
        if (aVar.a.compareAndSwapInt(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                j$.sun.misc.a aVar2 = h;
                if (aVar2.a.compareAndSwapInt(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.a.compareAndSwapInt(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[LOOP:0: B:2:0x0007->B:10:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.p e(int r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r11 = this;
            j$.util.concurrent.p r0 = r11.e
            r7 = 0
            r8 = 0
            r6 = r0
            r0 = r7
            r1 = r8
        L7:
            if (r6 != 0) goto L18
            j$.util.concurrent.p r1 = new j$.util.concurrent.p
            r5 = 0
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r11.e = r1
            r11.f = r1
            return r7
        L18:
            int r4 = r6.a
            r9 = 1
            if (r4 <= r12) goto L20
            r4 = -1
        L1e:
            r10 = r4
            goto L70
        L20:
            if (r4 >= r12) goto L24
            r10 = r9
            goto L70
        L24:
            java.lang.Object r4 = r6.b
            if (r4 == r13) goto Lac
            if (r4 == 0) goto L32
            boolean r5 = r13.equals(r4)
            if (r5 == 0) goto L32
            goto Lac
        L32:
            if (r0 != 0) goto L3a
            java.lang.Class r0 = j$.util.concurrent.ConcurrentHashMap.c(r13)
            if (r0 == 0) goto L50
        L3a:
            int r5 = j$.util.concurrent.ConcurrentHashMap.g
            if (r4 == 0) goto L4d
            java.lang.Class r5 = r4.getClass()
            if (r5 == r0) goto L45
            goto L4d
        L45:
            r5 = r13
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r5 = r5.compareTo(r4)
            goto L4e
        L4d:
            r5 = r8
        L4e:
            if (r5 != 0) goto L6f
        L50:
            if (r1 != 0) goto L6a
            j$.util.concurrent.p r1 = r6.f
            if (r1 == 0) goto L5e
            j$.util.concurrent.p r1 = r1.b(r12, r13, r0)
            if (r1 != 0) goto L5d
            goto L5e
        L5d:
            return r1
        L5e:
            j$.util.concurrent.p r1 = r6.g
            if (r1 == 0) goto L69
            j$.util.concurrent.p r1 = r1.b(r12, r13, r0)
            if (r1 == 0) goto L69
            return r1
        L69:
            r1 = r9
        L6a:
            int r4 = i(r13, r4)
            goto L1e
        L6f:
            r10 = r5
        L70:
            if (r10 > 0) goto L75
            j$.util.concurrent.p r4 = r6.f
            goto L77
        L75:
            j$.util.concurrent.p r4 = r6.g
        L77:
            if (r4 != 0) goto La9
            j$.util.concurrent.p r5 = r11.f
            j$.util.concurrent.p r1 = new j$.util.concurrent.p
            r2 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r11.f = r1
            if (r5 == 0) goto L89
            r5.h = r1
        L89:
            if (r10 > 0) goto L8e
            r6.f = r1
            goto L90
        L8e:
            r6.g = r1
        L90:
            boolean r0 = r6.i
            if (r0 != 0) goto L97
            r1.i = r9
            return r7
        L97:
            r11.d()
            j$.util.concurrent.p r0 = r11.e     // Catch: java.lang.Throwable -> La5
            j$.util.concurrent.p r0 = c(r0, r1)     // Catch: java.lang.Throwable -> La5
            r11.e = r0     // Catch: java.lang.Throwable -> La5
            r11.lockState = r8
            return r7
        La5:
            r0 = move-exception
            r11.lockState = r8
            throw r0
        La9:
            r6 = r4
            goto L7
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.o.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.util.concurrent.p r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.o.f(j$.util.concurrent.p):boolean");
    }
}
