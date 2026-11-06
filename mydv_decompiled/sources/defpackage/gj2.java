package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gj2 extends hl1 {
    public final long I;
    public final boolean J;
    public long K;

    public gj2(ut4 ut4Var, long j, boolean z) {
        super(ut4Var);
        this.I = j;
        this.J = z;
        if (j >= 0) {
            return;
        }
        s83.h(r7.A("byteCount < 0: ", j));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r2 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r2 = defpackage.hf1.A(r4, "expected ", " bytes but got ");
        r2.append(r16.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw new java.io.EOFException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r11 = r16.K + r2;
        r16.K = r11;
        r11 = r11 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r11 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r2 = r17.J - r11;
        r6 = new defpackage.cz();
        r6.q(r17);
        r17.write(r6, r2);
        r6.e();
        r2 = defpackage.hf1.A(r4, "expected ", " bytes but got ");
        r2.append(r16.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r18 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r18 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r2 = super.read(r17, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r2 != (-1)) goto L20;
     */
    @Override // defpackage.hl1, defpackage.ut4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.cz r17, long r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r1.getClass()
            long r2 = r0.K
            long r4 = r0.I
            long r2 = r4 - r2
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            java.lang.String r9 = " bytes but got "
            java.lang.String r10 = "expected "
            if (r8 < 0) goto L7c
            boolean r11 = r0.J
            r12 = -1
            if (r11 == 0) goto L28
            r14 = 1
            long r2 = r2 + r14
            int r11 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r11 <= 0) goto L25
            goto L2f
        L25:
            r2 = r18
            goto L2f
        L28:
            if (r8 != 0) goto L2b
            goto L39
        L2b:
            int r11 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r11 <= 0) goto L25
        L2f:
            long r2 = super.read(r1, r2)
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 != 0) goto L4d
            if (r8 != 0) goto L3a
        L39:
            return r12
        L3a:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = defpackage.hf1.A(r4, r10, r9)
            long r3 = r0.K
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L4d:
            long r11 = r0.K
            long r11 = r11 + r2
            r0.K = r11
            long r11 = r11 - r4
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 > 0) goto L58
            return r2
        L58:
            long r2 = r1.J
            long r2 = r2 - r11
            cz r6 = new cz
            r6.<init>()
            r6.q(r1)
            r1.write(r6, r2)
            r6.e()
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = defpackage.hf1.A(r4, r10, r9)
            long r3 = r0.K
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = defpackage.hf1.A(r4, r10, r9)
            long r3 = r0.K
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj2.read(cz, long):long");
    }
}
