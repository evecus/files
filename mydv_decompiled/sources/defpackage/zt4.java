package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class zt4 {
    public static final long a = oh4.j(14);
    public static final long b = oh4.j(0);
    public static final long c = x70.f;
    public static final g55 d;

    static {
        long j = x70.b;
        d = j != 16 ? new t90(j) : f55.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00b8, code lost:
    
        if (r15.equals(r24.i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00c7, code lost:
    
        if (r39.equals(r24.j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d6, code lost:
    
        if (r40.equals(r24.k) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00ea, code lost:
    
        if (defpackage.zc5.a(r41, r6) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0042, code lost:
    
        if (defpackage.zc5.a(r25, r14) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yt4 a(defpackage.yt4 r24, long r25, defpackage.wy r27, float r28, long r29, defpackage.qk1 r31, defpackage.lk1 r32, defpackage.mk1 r33, defpackage.mj1 r34, java.lang.String r35, long r36, defpackage.wu r38, defpackage.h55 r39, defpackage.tq2 r40, long r41, defpackage.m35 r43, defpackage.an4 r44, defpackage.fo3 r45, defpackage.z31 r46) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt4.a(yt4, long, wy, float, long, qk1, lk1, mk1, mj1, java.lang.String, long, wu, h55, tq2, long, m35, an4, fo3, z31):yt4");
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        q65[] q65VarArr = p65.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    s02.a("Cannot perform operation for Unspecified type.");
                }
                if (!q65.a(p65.b(j), p65.b(j2))) {
                    s02.a("Cannot perform operation for " + q65.b(p65.b(j)) + " and " + q65.b(p65.b(j2)));
                }
                return oh4.p(j3, vt0.G(p65.c(j), p65.c(j2), f));
            }
        }
        return ((p65) b(f, new p65(j), new p65(j2))).a;
    }
}
