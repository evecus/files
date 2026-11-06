package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ y1(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    private final Object a(Object obj, Object obj2) {
        mj4 mj4Var;
        aq4 aq4Var = (aq4) this.J;
        Set set = (Set) obj;
        synchronized (aq4Var.a) {
            try {
                o43 o43Var = aq4Var.d;
                if (o43Var == null) {
                    if (o70.O0(set, aq4Var.b)) {
                        mj4Var = aq4Var.f;
                    }
                    mj4Var = null;
                } else {
                    Object[] objArr = o43Var.b;
                    long[] jArr = o43Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                                        mj4Var = aq4Var.f;
                                        break loop0;
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    mj4Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mj4Var != null) {
            mj4Var.d(wd5.a);
        }
        return wd5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Type inference failed for: r0v35, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39, types: [v52] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object[], java.util.Set[]] */
    @Override // defpackage.hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ y1(Object obj, int i, byte b) {
        this.I = b;
        this.J = obj;
    }
}
