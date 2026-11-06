package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jt4 {
    public final tm1 a;
    public Object b;
    public a43 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final n43 e = ut0.y();
    public final n43 f = new n43();
    public final o43 g = new o43();
    public final b53 h = new b53(new wu0[16]);
    public final fo1 i = new fo1(this, (byte) 1);
    public final n43 l = ut0.y();
    public final HashMap m = new HashMap();

    public jt4(tm1 tm1Var) {
        this.a = tm1Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt4.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, a43 a43Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int c = a43Var.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = a43Var.c[c];
        }
        a43Var.b[c] = obj;
        a43Var.c[c] = i;
        if ((obj instanceof wu0) && i2 != i) {
            vu0 i3 = ((wu0) obj).i();
            this.m.put(obj, i3.f);
            a43 a43Var2 = i3.e;
            n43 n43Var = this.l;
            ut0.R(n43Var, obj);
            Object[] objArr = a43Var2.b;
            long[] jArr = a43Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                kw4 kw4Var = (kw4) objArr[(i4 << 3) + i6];
                                if (kw4Var instanceof lw4) {
                                    ((lw4) kw4Var).g(2);
                                }
                                ut0.g(n43Var, kw4Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof lw4) {
                ((lw4) obj).g(2);
            }
            ut0.g(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        n43 n43Var = this.e;
        ut0.Q(n43Var, obj2, obj);
        if (!(obj2 instanceof wu0) || n43Var.c(obj2)) {
            return;
        }
        ut0.R(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.u73 r34) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt4.d(u73):void");
    }
}
