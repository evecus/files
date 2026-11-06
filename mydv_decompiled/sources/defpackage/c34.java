package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c34 extends iy1 {
    public static final c34 O = new c34(0, null, new Object[0]);
    public final transient Object L;
    public final transient Object[] M;
    public final transient int N;

    public c34(int i, Object obj, Object[] objArr) {
        this.L = obj;
        this.M = objArr;
        this.N = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c34 e(int r19, java.lang.Object[] r20, defpackage.hy1 r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c34.e(int, java.lang.Object[], hy1):c34");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // defpackage.iy1, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L6
        L3:
            r7 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r7.M
            int r2 = r7.N
            r3 = 1
            if (r2 != r3) goto L20
            r7 = 0
            r7 = r1[r7]
            j$.util.Objects.requireNonNull(r7)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3
            r7 = r1[r3]
            j$.util.Objects.requireNonNull(r7)
            goto L9c
        L20:
            java.lang.Object r7 = r7.L
            if (r7 != 0) goto L25
            goto L3
        L25:
            boolean r2 = r7 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r7
            byte[] r2 = (byte[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = defpackage.ut0.X(r7)
        L37:
            r7 = r7 & r4
            r5 = r2[r7]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            if (r5 != r6) goto L40
            goto L3
        L40:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L4d
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L4d:
            int r7 = r7 + 1
            goto L37
        L50:
            boolean r2 = r7 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r7
            short[] r2 = (short[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = defpackage.ut0.X(r7)
        L62:
            r7 = r7 & r4
            short r5 = r2[r7]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L6c
            goto L3
        L6c:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L79
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L79:
            int r7 = r7 + 1
            goto L62
        L7c:
            int[] r7 = (int[]) r7
            int r2 = r7.length
            int r2 = r2 - r3
            int r4 = r8.hashCode()
            int r4 = defpackage.ut0.X(r4)
        L88:
            r4 = r4 & r2
            r5 = r7[r4]
            r6 = -1
            if (r5 != r6) goto L90
            goto L3
        L90:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La0
            r7 = r5 ^ 1
            r7 = r1[r7]
        L9c:
            if (r7 != 0) goto L9f
            return r0
        L9f:
            return r7
        La0:
            int r4 = r4 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c34.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.N;
    }
}
