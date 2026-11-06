package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bi implements uw2 {
    public final vi a;
    public boolean b;

    public bi(vi viVar) {
        this.a = viVar;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int b = ((a42) list.get(0)).b(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int b2 = ((a42) list.get(i2)).b(i);
                if (b2 > b) {
                    b = b2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return b;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int t = ((a42) list.get(0)).t(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int t2 = ((a42) list.get(i2)).t(i);
                if (t2 > t) {
                    t = t2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        jk3 jk3Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bn3 u = ((pw2) list.get(i3)).u(j);
            i = Math.max(i, u.I);
            i2 = Math.max(i2, u.J);
            arrayList.add(u);
        }
        if (ww2Var.N()) {
            this.b = true;
            jk3Var.setValue(new z22((4294967295L & i2) | (i << 32)));
        } else if (!this.b) {
            jk3Var.setValue(new z22((4294967295L & i2) | (i << 32)));
        }
        return ww2Var.A(i, i2, p91.I, new kh(arrayList, (byte) 1));
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Q = ((a42) list.get(0)).Q(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int Q2 = ((a42) list.get(i2)).Q(i);
                if (Q2 > Q) {
                    Q = Q2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return Q;
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int p = ((a42) list.get(0)).p(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int p2 = ((a42) list.get(i2)).p(i);
                if (p2 > p) {
                    p = p2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return p;
    }
}
