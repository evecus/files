package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oj implements CharSequence {
    public final List I;
    public final String J;
    public final ArrayList K;
    public final ArrayList L;

    static {
        da daVar = ea4.a;
    }

    public oj(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.I = list;
        this.J = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                nj njVar = (nj) list.get(i);
                if (njVar.f() instanceof yt4) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(njVar);
                } else if (njVar.f() instanceof ck3) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(njVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.K = arrayList;
        this.L = arrayList2;
        List k1 = arrayList2 != null ? o70.k1(arrayList2, new xi1((byte) 6)) : null;
        if (k1 == null || k1.isEmpty()) {
            return;
        }
        int e = ((nj) o70.T0(k1)).e();
        p33 p33Var = n22.a;
        p33 p33Var2 = new p33(1);
        p33Var2.c(e);
        int size2 = k1.size();
        for (int i2 = 1; i2 < size2; i2++) {
            nj njVar2 = (nj) k1.get(i2);
            while (true) {
                if (p33Var2.b == 0) {
                    break;
                }
                int b = p33Var2.b();
                if (njVar2.g() >= b) {
                    p33Var2.e(p33Var2.b - 1);
                } else if (njVar2.e() > b) {
                    r02.a("Paragraph overlap not allowed, end " + njVar2.e() + " should be less than or equal to " + b);
                }
            }
            p33Var2.c(njVar2.e());
        }
    }

    public final List a(int i) {
        List list = this.I;
        if (list == null) {
            return o91.I;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            nj njVar = (nj) obj;
            if ((njVar.f() instanceof ek2) && pj.c(0, i, njVar.g(), njVar.e())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final oj subSequence(int i, int i2) {
        if (i > i2) {
            r02.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.J;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        return new oj(pj.a(this.I, i, i2), str.substring(i, i2));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.J.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj)) {
            return false;
        }
        oj ojVar = (oj) obj;
        return j42.c(this.J, ojVar.J) && j42.c(this.I, ojVar.I);
    }

    public final int hashCode() {
        int hashCode = this.J.hashCode() * 31;
        List list = this.I;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.J.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.J;
    }

    public /* synthetic */ oj(String str) {
        this(str, o91.I);
    }

    public oj(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
