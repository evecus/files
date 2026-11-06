package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tm3 extends z2 {
    public final rm3 K;
    public int L;
    public ra5 M;
    public int N;

    public tm3(rm3 rm3Var, int i) {
        super(i, rm3Var.P);
        this.K = rm3Var;
        this.L = rm3Var.h();
        this.N = -1;
        b();
    }

    public final void a() {
        if (this.L == this.K.h()) {
            return;
        }
        y9.e();
    }

    @Override // defpackage.z2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.I;
        rm3 rm3Var = this.K;
        rm3Var.add(i, obj);
        this.I++;
        this.J = rm3Var.c();
        this.L = rm3Var.h();
        this.N = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        rm3 rm3Var = this.K;
        Object[] objArr = rm3Var.N;
        if (objArr == null) {
            this.M = null;
            return;
        }
        int i = (rm3Var.P - 1) & (-32);
        int i2 = this.I;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (rm3Var.L / 5) + 1;
        ra5 ra5Var = this.M;
        if (ra5Var == null) {
            this.M = new ra5(objArr, i2, i, i3);
            return;
        }
        ra5Var.I = i2;
        ra5Var.J = i;
        ra5Var.K = i3;
        Object[] objArr2 = ra5Var.L;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            ra5Var.L = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        ra5Var.M = r0;
        ra5Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            zy.k();
            return null;
        }
        int i = this.I;
        this.N = i;
        ra5 ra5Var = this.M;
        rm3 rm3Var = this.K;
        if (ra5Var == null) {
            Object[] objArr = rm3Var.O;
            this.I = i + 1;
            return objArr[i];
        }
        if (ra5Var.hasNext()) {
            this.I++;
            return ra5Var.next();
        }
        Object[] objArr2 = rm3Var.O;
        int i2 = this.I;
        this.I = i2 + 1;
        return objArr2[i2 - ra5Var.J];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            zy.k();
            return null;
        }
        int i = this.I;
        this.N = i - 1;
        ra5 ra5Var = this.M;
        rm3 rm3Var = this.K;
        if (ra5Var == null) {
            Object[] objArr = rm3Var.O;
            int i2 = i - 1;
            this.I = i2;
            return objArr[i2];
        }
        int i3 = ra5Var.J;
        if (i <= i3) {
            this.I = i - 1;
            return ra5Var.previous();
        }
        Object[] objArr2 = rm3Var.O;
        int i4 = i - 1;
        this.I = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.z2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.N;
        if (i == -1) {
            s83.r();
            return;
        }
        rm3 rm3Var = this.K;
        rm3Var.d(i);
        int i2 = this.N;
        if (i2 < this.I) {
            this.I = i2;
        }
        this.J = rm3Var.c();
        this.L = rm3Var.h();
        this.N = -1;
        b();
    }

    @Override // defpackage.z2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.N;
        if (i == -1) {
            s83.r();
            return;
        }
        rm3 rm3Var = this.K;
        rm3Var.set(i, obj);
        this.L = rm3Var.h();
        b();
    }
}
