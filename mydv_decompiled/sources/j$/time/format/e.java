package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class e implements f {
    public final f[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.util.List r2, boolean r3) {
        /*
            r1 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            j$.time.format.f[] r0 = new j$.time.format.f[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            j$.time.format.f[] r2 = (j$.time.format.f[]) r2
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.e.<init>(java.util.List, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(j$.time.format.u r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            int r0 = r8.length()
            r1 = 1
            boolean r2 = r6.b
            if (r2 == 0) goto Le
            int r3 = r7.c
            int r3 = r3 + r1
            r7.c = r3
        Le:
            j$.time.format.f[] r6 = r6.a     // Catch: java.lang.Throwable -> L27
            int r3 = r6.length     // Catch: java.lang.Throwable -> L27
            r4 = 0
        L12:
            if (r4 >= r3) goto L2c
            r5 = r6[r4]     // Catch: java.lang.Throwable -> L27
            boolean r5 = r5.d(r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L29
            r8.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r6 = r7.c
            int r6 = r6 - r1
            r7.c = r6
            return r1
        L27:
            r6 = move-exception
            goto L30
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r8 = r7.c
            int r8 = r8 - r1
            r7.c = r8
        L37:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.e.d(j$.time.format.u, java.lang.StringBuilder):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }
}
