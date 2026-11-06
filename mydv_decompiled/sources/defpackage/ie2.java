package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ie2 {
    public final ArrayList a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public ie2() {
        long[] jArr = ia4.a;
        this.b = new n43();
        o43 o43Var = ka4.a;
        this.d = new o43();
        this.a = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public static int e(int[] iArr, qe2 qe2Var, boolean z) {
        int h = qe2Var.h();
        int b = qe2Var.b() + h;
        int i = 0;
        while (h < b) {
            int r = wx5.r(qe2Var, z) + iArr[h];
            iArr[h] = r;
            i = Math.max(i, r);
            h++;
        }
        return i;
    }

    public void a(int i, Object obj) {
        r7.K(((n43) this.b).g(obj));
    }

    public long b() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        r7.K(arrayList.get(0));
        throw null;
    }

    public void c(int i, int i2, ArrayList arrayList, tl tlVar, d1 d1Var, boolean z, boolean z2, int i3, boolean z3, int i4, int i5) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z4;
        Throwable th;
        ArrayList arrayList4;
        ArrayList arrayList5;
        byte b;
        int i6;
        ArrayList arrayList6 = (ArrayList) this.e;
        o43 o43Var = (o43) this.d;
        Object obj = this.b;
        n43 n43Var = (n43) obj;
        ArrayList arrayList7 = (ArrayList) this.g;
        ArrayList arrayList8 = (ArrayList) this.f;
        tl tlVar2 = (tl) this.c;
        this.c = tlVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            qe2 qe2Var = (qe2) arrayList.get(i7);
            int size2 = qe2Var.d().size();
            int i8 = 0;
            while (i8 < size2) {
                ((bn3) qe2Var.d().get(i8)).z();
                i8++;
                obj = obj;
            }
        }
        Object obj2 = obj;
        if (n43Var.i()) {
            d();
            return;
        }
        boolean z5 = z2 || !z3;
        Object[] objArr = n43Var.b;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        int i9 = 8;
        if (length >= 0) {
            z4 = z5;
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                arrayList2 = arrayList7;
                arrayList3 = arrayList8;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j & 255) < 128) {
                            i6 = i9;
                            o43Var.d(objArr[(i10 << 3) + i12]);
                        } else {
                            i6 = i9;
                        }
                        j >>= i6;
                        i12++;
                        i9 = i6;
                    }
                    if (i11 != i9) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                arrayList7 = arrayList2;
                arrayList8 = arrayList3;
                i9 = 8;
            }
        } else {
            arrayList2 = arrayList7;
            arrayList3 = arrayList8;
            z4 = z5;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            qe2 qe2Var2 = (qe2) arrayList.get(i13);
            o43Var.l(qe2Var2.getKey());
            int size4 = qe2Var2.d().size();
            for (int i14 = 0; i14 < size4; i14++) {
                ((bn3) qe2Var2.d().get(i14)).z();
            }
            r7.K(((n43) obj2).k(qe2Var2.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        ArrayList arrayList9 = this.a;
        if (z4 && tlVar2 != null) {
            if (arrayList9.isEmpty()) {
                b = 0;
            } else {
                if (arrayList9.size() > 1) {
                    t70.H0(new he2(tlVar2, (byte) 2), arrayList9);
                }
                if (arrayList9.size() > 0) {
                    qe2 qe2Var3 = (qe2) arrayList9.get(0);
                    e(iArr, qe2Var3, z);
                    Object g = n43Var.g(qe2Var3.getKey());
                    g.getClass();
                    r7.K(g);
                    qe2Var3.g(0);
                    throw null;
                }
                b = 0;
                dq.Y0(0, 0, 6, iArr);
            }
            if (!arrayList6.isEmpty()) {
                if (arrayList6.size() > 1) {
                    t70.H0(new he2(tlVar2, b), arrayList6);
                }
                if (arrayList6.size() > 0) {
                    qe2 qe2Var4 = (qe2) arrayList6.get(b);
                    e(iArr, qe2Var4, z);
                    wx5.r(qe2Var4, z);
                    Object g2 = n43Var.g(qe2Var4.getKey());
                    g2.getClass();
                    r7.K(g2);
                    qe2Var4.g(b);
                    throw null;
                }
                dq.Y0(b, b, 6, iArr);
            }
        }
        Object[] objArr2 = o43Var.b;
        long[] jArr2 = o43Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j2 = jArr2[i15];
                th = th2;
                Object[] objArr3 = objArr2;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j2 & 255) < 128) {
                            r7.K(n43Var.g(objArr3[(i15 << 3) + i17]));
                        }
                        j2 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                th2 = th;
                objArr2 = objArr3;
            }
        } else {
            th = null;
        }
        if (arrayList3.isEmpty()) {
            arrayList4 = arrayList3;
        } else {
            if (arrayList3.size() > 1) {
                arrayList4 = arrayList3;
                t70.H0(new he2(tlVar, (byte) 3), arrayList4);
            } else {
                arrayList4 = arrayList3;
            }
            if (arrayList4.size() > 0) {
                qe2 qe2Var5 = (qe2) arrayList4.get(0);
                Object g3 = n43Var.g(qe2Var5.getKey());
                g3.getClass();
                r7.K(g3);
                e(iArr, qe2Var5, z);
                if (!z2) {
                    throw th;
                }
                ((qe2) o70.T0(arrayList)).g(0);
                throw th;
            }
            dq.Y0(0, 0, 6, iArr);
        }
        if (arrayList2.isEmpty()) {
            arrayList5 = arrayList2;
        } else {
            byte b2 = 1;
            if (arrayList2.size() > 1) {
                arrayList5 = arrayList2;
                t70.H0(new he2(tlVar, b2), arrayList5);
            } else {
                arrayList5 = arrayList2;
            }
            if (arrayList5.size() > 0) {
                qe2 qe2Var6 = (qe2) arrayList5.get(0);
                Object g4 = n43Var.g(qe2Var6.getKey());
                g4.getClass();
                r7.K(g4);
                e(iArr, qe2Var6, z);
                wx5.r(qe2Var6, z);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList9.clear();
        arrayList6.clear();
        arrayList4.clear();
        arrayList5.clear();
        o43Var.e();
    }

    public void d() {
        n43 n43Var = (n43) this.b;
        if (n43Var.j()) {
            Object[] objArr = n43Var.c;
            long[] jArr = n43Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r7.K(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            n43Var.a();
        }
    }

    public ie2(Context context, uf0 uf0Var, mc3 mc3Var, yt3 yt3Var, WorkDatabase workDatabase, ky5 ky5Var, ArrayList arrayList) {
        context.getClass();
        yt3Var.getClass();
        this.b = uf0Var;
        this.c = mc3Var;
        this.d = yt3Var;
        this.e = workDatabase;
        this.f = ky5Var;
        this.a = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.g = applicationContext;
        this.h = new x81();
    }
}
