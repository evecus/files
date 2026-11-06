package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sh implements uw2 {
    public final ai a;
    public bn3[] b;
    public bn3[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final rh h = new rh(this, (byte) 1);
    public final rh i = new rh(this, (byte) 0);

    public sh(ai aiVar) {
        this.a = aiVar;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a42) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a42) list.get(i2)).b(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uw2
    public final int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a42) list.get(0)).t(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a42) list.get(i2)).t(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        uj3 uj3Var;
        int size = list.size();
        bn3[] bn3VarArr = new bn3[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            pw2 pw2Var = (pw2) list.get(i);
            Object z = pw2Var.z();
            vh vhVar = z instanceof vh ? (vh) z : null;
            if (vhVar != null && ((Boolean) vhVar.a.getValue()).booleanValue()) {
                bn3VarArr[i] = pw2Var.u(j);
                j2 = (r8.J & 4294967295L) | (r8.I << 32);
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            pw2 pw2Var2 = (pw2) list.get(i2);
            if (bn3VarArr[i2] == null) {
                bn3VarArr[i2] = pw2Var2.u(j);
            }
        }
        if (ww2Var.N()) {
            uj3Var = new uj3(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                bn3 bn3Var = bn3VarArr[i5];
                if (bn3Var != null) {
                    Object z2 = ((pw2) list.get(i5)).z();
                    vh vhVar2 = z2 instanceof vh ? (vh) z2 : null;
                    if (vhVar2 == null || !((Boolean) vhVar2.b.getValue()).booleanValue()) {
                        int i6 = bn3Var.I;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = bn3Var.J;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            uj3Var = new uj3(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int intValue = ((Number) uj3Var.I).intValue();
        int intValue2 = ((Number) uj3Var.J).intValue();
        boolean N = ww2Var.N();
        p91 p91Var = p91.I;
        if (N) {
            this.b = bn3VarArr;
            this.d = intValue;
            this.f = intValue2;
            return ww2Var.A(intValue, intValue2, p91Var, this.h);
        }
        this.a.c.setValue(new z22((intValue << 32) | (intValue2 & 4294967295L)));
        this.c = bn3VarArr;
        this.e = intValue;
        this.g = intValue2;
        return ww2Var.A(intValue, intValue2, p91Var, this.i);
    }

    @Override // defpackage.uw2
    public final int minIntrinsicHeight(b42 b42Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a42) list.get(0)).Q(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a42) list.get(i2)).Q(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.uw2
    public final int minIntrinsicWidth(b42 b42Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a42) list.get(0)).p(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a42) list.get(i2)).p(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
